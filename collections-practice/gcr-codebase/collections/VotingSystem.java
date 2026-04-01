package collections;
import java.util.*;

public class VotingSystem {

    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Integer> votes = new HashMap<>();
    static LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Voting System ---");
            System.out.println("1. Cast Vote");
            System.out.println("2. View Results (Sorted)");
            System.out.println("3. View Voting Order");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> vote();
                case 2 -> results();
                case 3 -> order();
                case 0 -> System.exit(0);
            }
        }
    }

    public static void vote() {
        System.out.print("Candidate Name: ");
        String name = sc.nextLine();
        votes.put(name, votes.getOrDefault(name, 0) + 1);
        voteOrder.put(name, votes.get(name));
    }

    public static void results() {
        TreeMap<String, Integer> sorted = new TreeMap<>(votes);
                
        for (Object k : sorted.keySet()) {
            Object v = sorted.get(k);
            System.out.println(k + " : " + v);
        }
    }

    public static void order() {
        
        for (String key : voteOrder.keySet()) {
            System.out.println(key + " : " + voteOrder.get(key));
        }

    }
}
