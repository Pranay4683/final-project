
public class UpdateReservationState implements State{
	Car car;
	public UpdateReservationState(Car car) {
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
		System.out.println("Reservation cannot be cancelled");
	}

	@Override
	public void updateReservation() {
		// TODO Auto-generated method stub
		System.out.println("Updated the requirements");
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
