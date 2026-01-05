package collections;

import java.util.List;
import java.util.*;

public class SetInterface {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         while (true) {
            System.out.println("\n--- SET INTERFACE MENU ---");
            System.out.println("1. Check Set Equality");
            System.out.println("2. Union & Intersection");
            System.out.println("3. Symmetric Difference");
            System.out.println("4. Set to Sorted List");
            System.out.println("5. Subset Check");
            System.out.println("0. Back");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> setEquality(sc);
                case 2 -> unionIntersection(sc);
                case 3 -> symmetricDifference(sc);
                case 4 -> sortedSet(sc);
                case 5 -> subsetCheck(sc);
                case 0 -> { return; }
            }
        }
    }
    public static Set<Integer> readSet(Scanner sc) {
        Set<Integer> set = new HashSet<>();
        System.out.println("Enter elements (end with -1):");
        
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            set.add(n);
        }
        return set;
    }

    public static void setEquality(Scanner sc) {
        Set<Integer> s1 = readSet(sc);
        Set<Integer> s2 = readSet(sc);

        System.out.println("Equal: " + s1.equals(s2));
    }

    public static void unionIntersection(Scanner sc) {
        Set<Integer> s1 = readSet(sc);
        Set<Integer> s2 = readSet(sc);

        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);

        Set<Integer> inter = new HashSet<>(s1);
        inter.retainAll(s2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
    }

    public static void symmetricDifference(Scanner sc) {
        Set<Integer> s1 = readSet(sc);
        Set<Integer> s2 = readSet(sc);

        Set<Integer> result = new HashSet<>(s1);
        result.addAll(s2);

        Set<Integer> temp = new HashSet<>(s1);
        temp.retainAll(s2);

        result.removeAll(temp);
        System.out.println("Symmetric Difference: " + result);
    }

    public static void sortedSet(Scanner sc) {

        Set<Integer> set = readSet(sc);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

    }

    public static void subsetCheck(Scanner sc) {
        
        Set<Integer> s1 = readSet(sc);
        Set<Integer> s2 = readSet(sc);
        System.out.println("Subset: " + s2.containsAll(s1));
        
    }

    
}
