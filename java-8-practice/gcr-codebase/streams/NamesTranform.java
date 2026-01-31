package streams;

import java.util.*;
public class NamesTranform {
	    public static void main(String[] args) {

	        List<String> customers = Arrays.asList("amit", "neha", "rohit", "pankaj");

	        customers.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	    }
	}
