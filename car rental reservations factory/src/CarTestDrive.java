import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CarTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRentalCarFactory carFactory = new SimpleRentalCarFactory();
		CarStore store = new CarStore(carFactory);
		
		Car car = store.orderCar("Sports Car");
		System.out.println("Booked car is: "+car.getCarName()+"\n");
		
		
		car = store.orderCar("Sedan");
		System.out.println("Booked car is: "+car.getCarName()+"\n");
		
		//JUnit test
				Result result = JUnitCore.runClasses(CarUnitTest.class);
				for (Failure failure : result.getFailures()) {
			         System.out.println(failure.toString());
			      }
					
			      System.out.println(result.wasSuccessful());

	}

}
