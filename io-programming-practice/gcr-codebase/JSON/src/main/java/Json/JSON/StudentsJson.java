//Create a JSON object for a Student with fields: name, age, and subjects (array).

package Json.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentsJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject student = new JSONObject();
		student.put("name", "Shivam");
		student.put("age", 22);
		JSONArray subjects= new JSONArray();
		
		subjects.put("Maths");
		subjects.put("English");
		subjects.put("Science");
		
		student.put("subjects", subjects);

	    

		System.out.println(student);

	}

}
