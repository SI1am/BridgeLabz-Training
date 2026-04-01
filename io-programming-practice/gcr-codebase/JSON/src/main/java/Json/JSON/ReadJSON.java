package Json.JSON;

import java.util.*;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSON {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        List<Map<String, Object>> data= mapper.readValue(new File("src/main/java/samplefiles/students.json"),List.class);

        for (Map<String, Object> obj : data) {
            for (Map.Entry<String, Object> entry : obj.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("*************************************");
        }
    }
}
