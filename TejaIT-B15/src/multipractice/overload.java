package multipractice;

public class overload {
	
	public void m1() {
		System.out.println("m1 method");
	}
	
	public void m1(int id) {
		System.out.println("m1 method: "+" id: "+id);
	}
	
	public void m1(int id,String name) {
		System.out.println("m1 method: "+" id: "+id+" name: "+name);
	}
	
	public void m1(String name,int id) {
		System.out.println("m1 method:"+" name: "+name+" id: "+id);
	}
	
public static void main(String[] args) {
	overload ol=new overload();
	ol.m1();
	ol.m1(2003);
	ol.m1(31, "Joshna");
	ol.m1("Adam", 23);
}
}
