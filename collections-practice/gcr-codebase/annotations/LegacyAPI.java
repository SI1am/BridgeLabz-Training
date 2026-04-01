package annotations;

public class LegacyAPI {
	
	@Deprecated
	public void oldFeatures() {
		System.out.println("Old Featues API.");
	}
	
	public void newFeatures() {
		System.out.println("New Featues API.");
	}
	
	
	public static void main (String[] args) {
		LegacyAPI api= new LegacyAPI();
		
		api.oldFeatures();
		api.newFeatures();
		
	}
}


