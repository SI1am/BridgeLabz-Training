package Json.JSON;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class User{
	public String name;
	public int age;
	User(String name, int age){
		this.name=name;
		this.age=age;
	}
}

public class ListToJSON {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		
		users.add(new User("Shivam", 22));
		users.add(new User("Priya", 20));
		users.add(new User("Tanuj", 21));
		users.add(new User("Pankaj", 12));
		
		ObjectMapper map = new ObjectMapper();
		map.writer().writeValue(System.out, users);
	}

}
