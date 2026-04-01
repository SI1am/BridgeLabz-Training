package review;

class UnderAgeException extends Exception {

    public UnderAgeException(String message) {
        super(message);
        
    }
}


interface Votingg {

    boolean isEligibleToVote() throws UnderAgeException;

}


abstract class Voterss {

    private String name;

    public Voterss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int getAge();
}


class Citizenn extends Voterss implements Votingg {
    private int age;

    public Citizenn(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    int getAge() {
        return age;
    }

    
    @Override
    public boolean isEligibleToVote() throws UnderAgeException {

        
        if (age < 18) {
            throw new UnderAgeException("Citizen is under 18 and not eligible to vote");
        }
        return true;
    }
}


public class ThrowAndThrowsException{

    public static void main(String[] args) {

        Citizenn c1 = new Citizenn("Amit", 16);
        Citizenn c2 = new Citizenn("Shivam", 22);

        try {
            System.out.println("Name: " + c1.getName());
            System.out.println("Eligible: " + c1.isEligibleToVote());
        } catch (UnderAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println("Name: " + c2.getName());
            System.out.println("Eligible: " + c2.isEligibleToVote());
        } catch (UnderAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
