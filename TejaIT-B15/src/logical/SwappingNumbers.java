package logical;

public class SwappingNumbers {

	public static void main(String[] args) {
		int i = 10; // we need i value - 20
		int j = 20; // j value - 10
		i = i + j; // 10+20=30
		j = i - j; // 30-20 = 10;
		i = i - j; // 30-20 = 20;

		System.out.println("i:" + i);
		System.out.println("j:" + j);
	}

	public static void main1(String[] args) {
		int i = 10;
		int j = 20;

		j = i - j;
		System.out.println(j);
	}
}