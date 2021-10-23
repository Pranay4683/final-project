
public class Car {
	String car_name;
	String car_type;
	String car_model_number;
	String car_color;
	
	
	public String getCarName() {
		return car_name;
	}
	
	public void booking() {
		System.out.println("Booking "+car_name);
	}
	
	public void type() {
		System.out.println("Car Type "+car_type);
	}
	
	public void model() {
		System.out.println("Car Model "+car_model_number);
	}
	
	public void color() {
		System.out.println("Car Color "+car_color);
	}
}
