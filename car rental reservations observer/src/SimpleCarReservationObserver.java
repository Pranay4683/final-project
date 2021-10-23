
public class SimpleCarReservationObserver implements Observer{
	private int value;
	private Car simpleCar;
	
	public SimpleCarReservationObserver(Car simpleCar) {
		this.simpleCar = simpleCar;
		simpleCar.registerObserver(this);
	}

	@Override
	public void update(int value) {
		// TODO Auto-generated method stub
		this.value = value;
	}
	
	public void display() {
		System.out.println("Value: " + value);
	}
}
