package oops;

public class BikeDeliveryPartner extends DeliveryPartner {

	public void wearhelmet() {
		System.out.println("bike delivery partner wear helmet");
	}

	public void Deliverorder() {
		System.out.println("deliver order by bike delivery partner");
	}

	public static void main(String[] args) {
		BikeDeliveryPartner bdp = new BikeDeliveryPartner();
		bdp.acceptorder();
		bdp.pickuporeder();
		bdp.wearhelmet();
		bdp.Deliverorder();
	}
}