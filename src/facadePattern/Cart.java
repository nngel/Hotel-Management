package facadePattern;

public class Cart implements HotelService {
	private int numberOfCarts;

	Cart(int numberOfCarts) {
		this.numberOfCarts = numberOfCarts;
	}

	public void service() {
		requestCard(numberOfCarts);
	}

	public void requestCard(int numberOfCarts) {
		System.out.println("No of Carts requested: " + numberOfCarts);
	}

}
