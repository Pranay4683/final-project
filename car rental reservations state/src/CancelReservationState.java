
public class CancelReservationState implements State{
	Car car;
	public CancelReservationState(Car car) {
		this.car = car;
	}
	@Override
	public void addReservation() {
		// TODO Auto-generated method stub
		System.out.println("Reservation arleady added. Try again later");
	}

	@Override
	public void cancelReservation() {
		// TODO Auto-generated method stub
		System.out.println("Cancelling the reservation");
	}

	@Override
	public void updateReservation() {
		// TODO Auto-generated method stub
		System.out.println("No reservation added. Can't update more");
	}

	@Override
	public void startRent() {
		// TODO Auto-generated method stub
		System.out.println("Rent started");
	}

	@Override
	public void endRent() {
		// TODO Auto-generated method stub
		System.out.println("Rent not ended yet");
	}
}