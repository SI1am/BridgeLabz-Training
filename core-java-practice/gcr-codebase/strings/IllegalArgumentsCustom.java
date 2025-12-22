package strings;

public class IllegalArgumentsCustom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Test";
		System.out.println(str);
		
		callError(str);
	}
	private static void callError(String str) {
		try {
			System.out.println(str.substring(3,2));
//			System.out.println();
			
		}catch (Exception e) {
			
            System.out.println("IllegalArgumentException handled");
            System.out.println(e.getMessage());
            
        } 
	}

}
