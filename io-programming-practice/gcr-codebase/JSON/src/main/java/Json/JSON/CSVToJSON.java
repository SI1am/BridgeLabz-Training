package Json.JSON;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CSVToJSON {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("src/main/java/samplefiles/IPL.csv"));
		
		String[] headers = br.readLine().split("\t");
		
		List<Map<String,String>> list = new ArrayList<>();
		String line;
		
		while((line=br.readLine())!=null) {
			String[] val =line.split("\t");
			Map<String, String> map =new HashMap<>();
			
			for( int i=0; i<headers.length; i++) {
				map.put(headers[i], val[i]);
			}
			list.add(map);
		}
		
		ObjectMapper obj = new ObjectMapper();
		obj.writerWithDefaultPrettyPrinter().writeValue(System.out, list);

	}

}
