
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		ReservationState reservationState = new ReservationState(car);
		System.out.println("Reservation State");
		reservationState.addReservation();
		reservationState.cancelReservation();
		reservationState.updateReservation();
		reservationState.startRent();
		reservationState.endRent();
		
		System.out.println("Reservation Cancel State");
		CancelReservationState cancelReservationState = new CancelReservationState(car);
		cancelReservationState.addReservation();
		cancelReservationState.cancelReservation();
		cancelReservationState.updateReservation();
		cancelReservationState.startRent();
		cancelReservationState.endRent();
		
		System.out.println("Reservation Update State");
		UpdateReservationState updateReservationState = new UpdateReservationState(car);
		updateReservationState.addReservation();
		updateReservationState.cancelReservation();
		updateReservationState.updateReservation();
		updateReservationState.startRent();
		updateReservationState.endRent();
		
		System.out.println("Rent State");
		RentState rentState = new RentState(car);
		rentState.addReservation();
		rentState.cancelReservation();
		rentState.updateReservation();
		rentState.startRent();
		rentState.endRent();
		
		System.out.println("End Rent State");
		EndRentState endRentState = new EndRentState(car);
		endRentState.addReservation();
		endRentState.cancelReservation();
		endRentState.updateReservation();
		endRentState.startRent();
		endRentState.endRent();
	}

}
