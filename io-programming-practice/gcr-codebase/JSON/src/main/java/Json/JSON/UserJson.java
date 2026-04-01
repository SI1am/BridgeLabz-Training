package Json.JSON;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserJson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  ObjectMapper mapper = new ObjectMapper();

	        JsonNode root = mapper.readTree(new File("src/main/java/samplefiles/students.json"));

	        for(JsonNode node: root){
	            String name = node.get("name").asText();
	            String email = node.get("email").asText();
	            System.out.println(name + " | " + email);
	        }

	}

}
