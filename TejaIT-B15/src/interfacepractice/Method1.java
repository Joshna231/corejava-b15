package interfacepractice;

import interfacepractice.Method2;

public class Method1 implements Method2, Method3, Method4 {

	@Override
	public int mobiles() {
		return 12000;
	}

	@Override
	public int dress() {
		return 1000;
	}

	@Override
	public int laptop() {
		return 20000;
	}

	public void m(int amt) {
	}

	public void m1() {
	}

	public void m2(int amt) {

	}

	public int m3(int amt) {
		return amt;
	}

	public int m4() {
		return 0;
	}

	public void m5() {

	}

	public static void main(String[] args) {
		Method1 m1 = new Method1();
		m1.mobiles();
		m1.dress();
		m1.laptop();
		System.out.println("mobiles: "+m1.mobiles()+", dress: "+m1.dress()+", laptop:"+m1.laptop());

	}

}
