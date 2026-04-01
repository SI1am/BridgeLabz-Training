package lamda;
import java.util.*;
import java.util.function.*;

class Alert{
	String alert;
	Alert(String alert){
		this.alert=alert;
			
	}
	
	String getAlert() {
		return alert;
	}
}
public class HospitalAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Alert> alerts = new ArrayList<>();
		alerts.add(new Alert("Low Oxygen"));
		alerts.add(new Alert("Low Heartrate"));
		alerts.add(new Alert("Emergency"));
		alerts.add(new Alert("Appointment"));
		
		Predicate<Alert> emergency =alert-> alert.getAlert().equals("Emergency");
		
		alerts.stream().filter(emergency).forEach(a-> System.out.println(a.getAlert()));
		
	}

}
