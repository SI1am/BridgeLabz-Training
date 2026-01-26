package lamda;

@FunctionalInterface
interface Light{
	void activate();
}
public class SmartHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light motionTrigger =() -> System.out.println("Lights on full brightness");
		Light nigthTime =() -> System.out.println("Lights are turned down to 20% during night time.");
		Light voiceTrigger =() -> {
			
			System.out.println("Lights on");
		};
		
		
		motionTrigger.activate();
		nigthTime.activate();
		voiceTrigger.activate();

	}

}
