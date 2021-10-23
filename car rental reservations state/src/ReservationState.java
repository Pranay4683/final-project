
public class ReservationState implements State{
	Car car;
	public ReservationState(Car car) {
		this.car = car;
	}
	@Override
	public void addReservation() {
		// TODO Auto-generated method stub
		System.out.println("Reservation added. Can't add more");
	}

	@Override
	public void cancelReservation() {
		// TODO Auto-generated method stub
		System.out.println("No reservation added. Please add one!");
	}

	@Override
	public void updateReservation() {
		// TODO Auto-generated method stub
		System.out.println("No reservation added. Can't update");
	}

	@Override
	public void startRent() {
		// TODO Auto-generated method stub
		System.out.println("Reservation added. Rent added");
	}

	@Override
	public void endRent() {
		// TODO Auto-generated method stub
		System.out.println("Rent not ended yet");
	}

}
