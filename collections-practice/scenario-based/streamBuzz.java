// package generics;

import java.util.*;

class CreatorStats {
    public String CreatorName;
    public double[] WeeklyLikes;

    public static List<CreatorStats> EngagementBoard = new ArrayList<>();
}

public class streamBuzz {


    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }


    public Dictionary<String, int[]> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {
       
    	Dictionary<String, int[]> result = new Hashtable<>();

        for (CreatorStats cs : records) {
            int count = 0;
            for (double likes : cs.WeeklyLikes) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(cs.CreatorName, new int[]{count});
            }
        }
        return result;
    }


    public double CalculateAverageLikes() {
        double sum =0;
        int count =0;

        for (CreatorStats cs : CreatorStats.EngagementBoard) {
            for (double likes : cs.WeeklyLikes) {
                sum += likes;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        streamBuzz program = new streamBuzz();

        while (true) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                CreatorStats cs = new CreatorStats();

                System.out.println("Enter Creator Name:");
                cs.CreatorName = sc.nextLine();

                cs.WeeklyLikes = new double[4];
                System.out.println("Enter weekly likes (Week 1 to 4):");
                for (int i = 0; i < 4; i++) {
                    cs.WeeklyLikes[i] = sc.nextDouble();
                }
                sc.nextLine();

                program.RegisterCreator(cs);
                System.out.println("Creator registered successfully\n");

            } else if (choice == 2) {
                System.out.println("Enter like threshold:");
                double threshold = sc.nextDouble();
                sc.nextLine();

                Dictionary<String, int[]> result =
                        program.GetTopPostCounts(CreatorStats.EngagementBoard, threshold);

                if (result.isEmpty()) {
                    System.out.println("No top-performing posts this week\n");
                } else {
                    Enumeration<String> keys = result.keys();
                    while (keys.hasMoreElements()) {
                        String key = keys.nextElement();
                        System.out.println(key + " - " + result.get(key)[0]);
                    }
                    System.out.println();
                }

            } else if (choice == 3) {
                double avg = program.CalculateAverageLikes();
                System.out.println("Overall average weekly likes: " + (int) avg + "\n");

            } else if (choice == 4) {
                System.out.println("Logging off - Keep Creating with StreamBuzz!");
                break;
            }
        }

    }
}
