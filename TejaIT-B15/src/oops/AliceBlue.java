package oops;

public class AliceBlue extends NSE {

	@Override
	public void brokeragecharges() {
		System.out.println("alice blue brokerage charges 10/-");

	}

	public static void main(String[] args) {
		AliceBlue ab = new AliceBlue();
		ab.stocksinfo();
		ab.IPO();
		ab.holidays();
		ab.brokeragecharges();
	}
}