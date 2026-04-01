package Json.JSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.*;
import java.util.*;

public class MergeJson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectMapper map= new ObjectMapper();
		ObjectNode obj1 = (ObjectNode) map.readTree(new File("src/main/java/samplefiles/merge1.json"));
		ObjectNode obj2 = (ObjectNode) map.readTree(new File("src/main/java/samplefiles/merge2.json"));
		
		Iterator<Map.Entry<String, JsonNode>> fields = obj2.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            obj1.set(field.getKey(), field.getValue());
        }

        System.out.println(obj1.toPrettyString());
	}

}
