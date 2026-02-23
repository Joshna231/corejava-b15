package functional;

@FunctionalInterface
public interface Razopay {

	public String payment();

	public static void main(String[] args) {
		Razopay r = new Razopay() {

			@Override
			public String payment() {
				return "payment success...";
			}
		};

		String status = r.payment();
		System.out.println(status);

		System.out.println("===========================================");

		Razopay r2 = () -> "payment success...";
			

		String status2 = r2.payment();
		System.out.println(status2);
	}
}
