package collections;


import java.util.*;
import java.util.List;



public class ListInterrface {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        
        while (true) {
            System.out.println("\n************LIST INTERFACE ***********");
            System.out.println("1. Reverse List (ArrayList & LinkedList): ");
            System.out.println("2. Find Frequency of Elements: ");
            System.out.println("3. Rotate Elements in a List: ");
            System.out.println("4. Remove Duplicates (Preserve Order): ");
            System.out.println("5. Nth Element from End (LinkedList): ");
            System.out.println("0. Back");
            int ch = sc.nextInt();
    
            switch (ch) {
                case 1 -> reverseList(sc);
                case 2 -> frequencyList(sc);
                case 3 -> rotateList(sc);
                case 4 -> removeDuplicates(sc);
                case 5 -> nthFromEnd(sc);
                case 0 -> { return; }
            }
    }

    
    
}

    public static void reverseList(Scanner sc) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers (end with -1):");
        while (true) {
            
            int n = sc.nextInt();
            if (n == -1) break;
            list.add(n);
            
        }
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        System.out.println("Reversed: " + list);
    }

    public static void frequencyList( Scanner sc) {
        
        sc.nextLine();
        List<String> list = new ArrayList<>();
        
        System.out.println("Enter words (type end to stop):");
        
        while (true) {
            
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("end")) break;
            list.add(s);
            
        }
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String s : list)
            map.put(s, map.getOrDefault(s, 0) + 1);
            
        System.out.println(map);
    }

    public static void rotateList(Scanner sc) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers (end with -1):");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            list.add(n);
        }
        System.out.print("Rotate by: ");
        int k = sc.nextInt();
        k %= list.size();
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, list.size()));
        rotated.addAll(list.subList(0, k));
        System.out.println("Rotated List: " + rotated);
    }

    public static void removeDuplicates(Scanner sc) {
        
        List<Integer> list = new ArrayList<>();
        
        System.out.println("Enter numbers (end with -1):");
        
        while (true) {
            
            int n = sc.nextInt();
            if (n == -1) break;
            list.add(n);
            
        }
        Set<Integer> set = new LinkedHashSet<>(list);
        
        System.out.println("Without Duplicates: " + set);
    }

    public static void nthFromEnd(Scanner sc) {
        
        LinkedList<String> list = new LinkedList<>();
        sc.nextLine();
        System.out.println("Enter elements (end to stop):");
        
        while (true) {
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("end")) break;
            list.add(s);
        }
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        System.out.println("Nth from end: " + list.get(list.size() - n));
    }
}
