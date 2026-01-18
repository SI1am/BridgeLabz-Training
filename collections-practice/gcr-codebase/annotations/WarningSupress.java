package annotations;

import java.util.*;
public class WarningSupress {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add("Java");
	    list.add(10);

	    for (Object obj : list) {
	            System.out.println(obj);
	     }
	}

}
