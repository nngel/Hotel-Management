package facadePattern;

public class HouseKeeping implements HotelService {
	int roomNumber;

	HouseKeeping(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void service() {
		cleanRoom(roomNumber);
	}

	public void cleanRoom(int roomNumber) {
		System.out.println("The room " + roomNumber + " has been cleaned");
	}

}
