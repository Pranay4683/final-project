
public class CarStore {
	SimpleRentalCarFactory carFactory;
	
	public CarStore(SimpleRentalCarFactory carFactory) {
		this.carFactory = carFactory;
	}
	
	public Car orderCar(String type) {
		Car car;
		car = carFactory.createRental(type);
		car.booking();
		car.type();
		car.model();
		car.color();
		
		return car; 
	}
}
