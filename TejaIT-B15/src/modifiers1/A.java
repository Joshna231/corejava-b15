package modifiers1;

import modifiers2.C;
import modifiers2.D;

class A extends C {

	int id = 20;

	void m1() {
		System.out.println("A class m1 method");
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.id);
		a.m1();

		System.out.println(a.id);

		B b = new B();
		System.out.println(b.id);
		b.bm1();

		D d = new D();
		System.out.println(d.id);
		d.dm1();

	}
}