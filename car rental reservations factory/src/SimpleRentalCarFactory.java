
public class SimpleRentalCarFactory {
	public Car createRental(String type) {
		Car car = null;
		if(type.equals("Sports Car")) {
			car = new SportsCar();
		}else if(type.equals("Sedan")) {
			car = new Sedan();
		}
		return car;
	}
}
