package implementingInterface;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


interface DateFormat{
	static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}


public class DateUtils {
	public static void main(String[] args) {
		

        LocalDate invoiceDate = LocalDate.now();

        System.out.println(DateFormat.formatDate(invoiceDate, "dd-MM-yyyy"));
        System.out.println(DateFormat.formatDate(invoiceDate, "yyyy/MM/dd"));
    }
}
