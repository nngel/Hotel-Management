package facadePattern;

public class FrontDesk {
	Valet valet;
	HouseKeeping houseKeeping;
	Cart cart;

	FrontDesk(String plateNumber, int roomNumber, int numberOfCarts) {
		valet = new Valet(plateNumber);
		houseKeeping = new HouseKeeping(roomNumber);
		cart = new Cart(numberOfCarts);
	}

	public void executeServices() {
		valet.service();
		houseKeeping.service();
		cart.service();
	}
}
