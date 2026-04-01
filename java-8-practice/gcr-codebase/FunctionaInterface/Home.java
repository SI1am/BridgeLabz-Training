package implementingInterface;
import java.util.*;

interface SmartDevice {
	void turnOn();
	void turnOff();
}

class Light implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("Turning on lights ");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off lights ");
		
	}
}

class AC implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("Turning on AC ");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off AC ");
		
	}
}

class TV implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("Turning on TV ");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off TV ");
		
	}
}



public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice light = new Light();
		SmartDevice ac = new AC();
		SmartDevice tv = new TV();
		
		
		light.turnOn();
		light.turnOff();
		
		ac.turnOn();
		ac.turnOff();
		
		tv.turnOn();
		tv.turnOff();

	}

}
