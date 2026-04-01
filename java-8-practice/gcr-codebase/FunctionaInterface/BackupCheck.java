package implementingInterface;

import java.io.Serializable;

class UserData implements Serializable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class BackupCheck {
	public static void main(String[] args) {
		
		UserData user= new UserData("Shivam", 22);
		
		if(user instanceof Serializable) {
			System.out.println("Object eligible for backup?? YESSSSSSSSSSS.");
		}
	}

}
