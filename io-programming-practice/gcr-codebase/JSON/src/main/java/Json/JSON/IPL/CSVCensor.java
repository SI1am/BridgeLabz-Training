package Json.JSON.IPL;

import java.io.*;
import java.util.*;

public class CSVCensor {

    static String maskTeam(String team) {
        return team.split(" ")[0] + " ***";
    }
    public static void processCSV(String inputFile, String outputFile) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

        String line;

        bw.write(br.readLine()); // header
        bw.newLine();

        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty()) continue;

            String[] data = line.split(",", -1);

            if (data.length < 7) continue;

            data[1] = maskTeam(data[1]);
            data[2] = maskTeam(data[2]);
            data[5] = maskTeam(data[5]);
            data[6] = "REDACTED";

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
    }
