package streams;
import java.util.*;
import java.util.stream.Collectors;

class Insurance{
    private String claimType;
    private double amount;

    public Insurance(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceClaim {
    public static void main(String[] args) {

        List<Insurance> claims = Arrays.asList(
                new Insurance("Health", 15000),
                new Insurance("Vehicle", 25000),
                new Insurance("Health", 18000),
                new Insurance("Home", 30000),
                new Insurance("Vehicle", 22000),
                new Insurance("Health", 10000),
                new Insurance("Vehicle", 20000),
                new Insurance("Health", 17000),
                new Insurance("Home", 35000),
                new Insurance("Vehicle", 28000)
        );

        Map<String, Double> avgClaimByType =
                claims.stream().collect(Collectors.groupingBy(
                              Insurance::getClaimType,
                              Collectors.averagingDouble(Insurance::getAmount)
                      ));

        avgClaimByType.forEach((type, avg) ->System.out.println(type + " Average Claim: " + avg));
    }
}
