package facadePattern;

public class Valet implements HotelService {
	String plateNumber;

	Valet(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public void service() {
		pickUpVehicle(plateNumber);
	}

	void pickUpVehicle(String plateNumber) {
		System.out.println("Pickup the Vehicle " + plateNumber);
	}
}
