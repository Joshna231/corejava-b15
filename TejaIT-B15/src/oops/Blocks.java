package oops;

public class Blocks {

	public Blocks() { // constructor
		System.out.println("constructor");
	}

	{ // instance block
		System.out.println("instance block");
	}

	public void m1() { // instance method
		System.out.println("instance method");
	}

	static { // static block
		System.out.println("static block");
	}

	public static void main(String[] args) {
		Blocks b = new Blocks();
		b.m1();
	}

}