import org.junit.*;

public class CarUnitTest {

	@Test
	public void testValue() {
		SimpleCar simpleCar = new SimpleCar();
		
		SimpleCarReservationObserver carReservationObserver = new SimpleCarReservationObserver(simpleCar);
		
		simpleCar.setValue(100);
		
		carReservationObserver.display();
	}

}
