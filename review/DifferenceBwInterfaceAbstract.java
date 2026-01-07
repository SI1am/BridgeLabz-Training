package review;


interface Voting {
    int minAge = 18; 

    boolean isEligibleToVote();

}


abstract class Voters {
    private String name;

    public Voters(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    abstract int getAge();
}


class Citizen extends Voters implements Voting {

    private int age;

    public Citizen(String name, int age) {

        super(name);
        this.age = age;
    }

    @Override
    int getAge() {

        return age;
    }

    @Override
    public boolean isEligibleToVote() {

        return age >= minAge;
    }
}

public class DifferenceBwInterfaceAbstract {

    public static void main(String[] args) {
        
        Citizen citizen = new Citizen("Rahul", 20);
        Citizen citizen2 = new Citizen("Amit", 21);

        System.out.println("Name: " + citizen.getName());
        System.out.println("Age: " + citizen.getAge());
        System.out.println("Eligible to Vote: " + citizen.isEligibleToVote());

        System.out.println("Name: " + citizen2.getName());
        System.out.println("Age: " + citizen2.getAge());
        System.out.println("Eligible to Vote: " + citizen2.isEligibleToVote());
    }
}
