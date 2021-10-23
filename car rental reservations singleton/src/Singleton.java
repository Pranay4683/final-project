
public class Singleton {
	private static Singleton uniqueCarInstance;
	
	private Singleton() {}
	
	public static Singleton getCarInstance() {
		if(uniqueCarInstance == null) {
			uniqueCarInstance = new Singleton();
		}
		return uniqueCarInstance;
	}
	
	public String carDescription() {
		return "I am a Car Signleton!";
	}
}
