package streams;

import java.util.List;
import java.util.Collection;
import java.util.Comparator;
class Doctor{
	String name;
	boolean availibility;
	String speciality;
	
	public Doctor(String name,boolean availibility, String speciality) {
		
		this.availibility=availibility;
		this.name=name;
		this.speciality=speciality;
	}
	
	
}
public class HospitalDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Doctor> doctors =  List.of( new Doctor("Amit",true,"Heart"),
				new Doctor("Shivam", false ,"Pediatrician"),
				new Doctor("Aditi", true ,"Pediatrician"),
				new Doctor("Dilip",false,"Heart"),
				new Doctor("Tanuj",true,"Gyno"),
				new Doctor("Priyanka",true,"Gyno")
				
				);
		
		doctors.stream().filter(p->p.availibility).sorted(Comparator.comparing(p->p.speciality))
		.forEach(p-> System.out.println(p.name +" is available on weekends and speciality is "+ p.speciality));;
		

	}

}
