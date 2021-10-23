
public class CarSingletonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getCarInstance();
		System.out.println(singleton.carDescription());
	}

}
