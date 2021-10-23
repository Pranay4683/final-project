
public class Car {
	State addReservation;
	State cancelReservation;
	State updateReservation;
	State startRent;
	State endRent;
	
	State state = addReservation;
	
	public Car() {
		addReservation = new ReservationState(this);
		cancelReservation = new CancelReservationState(this);
		updateReservation = new UpdateReservationState(this);
		startRent = new RentState(this);
		endRent = new EndRentState(this);
	}
	
	public void addReservation() {
		state.addReservation();
	}
	
	public void cancelReservation() {
		state.cancelReservation();
	}
	
	public void updateReservation() {
		state.updateReservation();
	}
	
	public void startRent() {
		state.startRent();
	}
	
	public void endRent() {
		state.endRent();
	}
	
	public void setState() {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public State getAddReservation() {
		return addReservation;
	}

	public State getCancelReservation() {
		return cancelReservation;
	}

	public State getUpdateReservation() {
		return updateReservation;
	}

	public State getStartRent() {
		return startRent;
	}

	public State getEndRent() {
		return endRent;
	}
	
	
}
