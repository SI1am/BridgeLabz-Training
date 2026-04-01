package Json.JSON.IPL;

import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;

public class JSONCensor {

    static String maskTeam(String team) {
        return team.split(" ")[0] + " ***";
    }

    public static void processJSON(String inputFile, String outputFile) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> matches= mapper.readValue(new File(inputFile), List.class);

        for (Map<String, Object> match : matches) {
            match.put("team1", maskTeam((String) match.get("team1")));
            match.put("team2", maskTeam((String) match.get("team2")));
            match.put("winner", maskTeam((String) match.get("winner")));
            match.put("player_of_match", "REDACTED");
        }

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), matches);
    }
}
