package csvHandling;

import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class SortBySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		  List<String[]> list = Files.lines(Paths.get("E:/flutter/csvHandling/src/csvhandling/csvFiles/employee.csv")).skip(1).map(l -> l.split(","))
                  .sorted((a,b) -> Double.compare(Double.parseDouble(b[3]),Double.parseDouble(a[3]))).limit(5).toList();

		  list.forEach(e -> System.out.println(Arrays.toString(e)));
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
