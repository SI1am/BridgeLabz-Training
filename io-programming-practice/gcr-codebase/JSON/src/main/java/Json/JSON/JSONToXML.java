package Json.JSON;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.*;

public class JSONToXML {

	public static void main(String[] args) throws Exception {
		
		ObjectMapper jsonMapper = new ObjectMapper();
		XmlMapper xml = new XmlMapper();
		
		Object obj = jsonMapper.readValue(new File("src/main/java/samplefiles/students.json"), Object.class);
		
		xml.writeValue(System.out, obj);
	}
}
