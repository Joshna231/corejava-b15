package interfacepractice;

public class Method implements M1, M2 {

	
	public String mobiles() {
		return "Samsung";
	}

	
	public String Laptop() {
		return "hp";
	}

	public static void main(String[] args) {
		Method m = new Method();
		String val1 = m.mobiles();
		String val2 = m.Laptop();
		System.out.println("Mobile: " + val1 + ", Laptop: " + val2);
	}
}
