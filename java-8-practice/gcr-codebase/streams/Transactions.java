package streams;

import java.time.LocalDateTime;
import java.util.*;

public class Transactions {
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003","ABXN1001","ABXN1002","ABXN1003","ABXN1004");

        transactionIds.forEach(id ->System.out.println(LocalDateTime.now()+ "  Transaction: " + id));
    }
}
