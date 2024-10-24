package facadePattern;

public class HotelApp {
	public static void main(String[] args) {
		FrontDesk frontDesk = new FrontDesk("1234", 899, 7);
		frontDesk.executeServices();
	}
}
