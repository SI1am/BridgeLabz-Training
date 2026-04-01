package streams;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class GymMember {
    private String name;
    private LocalDate expiryDate;

    public GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}

public class Member {
    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
                new GymMember("Amit", LocalDate.now().plusDays(10)),
                new GymMember("Neha", LocalDate.now().plusDays(45)),
                new GymMember("Rohit", LocalDate.now().plusDays(25))
        );

        List<GymMember> expiringSoon =members.stream().filter(m -> m.getExpiryDate()
        			   .isBefore(LocalDate.now().plusDays(30)))
                       .collect(Collectors.toList());

        expiringSoon.forEach(m ->System.out.println(m.getName() + " membership expires on " + m.getExpiryDate()));
    }
}
