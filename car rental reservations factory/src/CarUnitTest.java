import org.junit.*;


public class CarUnitTest {

	@Test
	public void testCarType() {
		SimpleRentalCarFactory carFactory = new SimpleRentalCarFactory();
		CarStore store = new CarStore(carFactory);
		
		Car car = store.orderCar("Sports Car");
		System.out.println("Booked car is: "+car.getCarName()+"\n");
		
		
		car = store.orderCar("Sedan");
		System.out.println("Booked car is: "+car.getCarName()+"\n");
	}

}
