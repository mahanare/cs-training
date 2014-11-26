package basics.chaitanya.ElectronicGadgets;

public class Demo {

	public static void main(String[] args) {
		/**
		 * ElectronicGadget includes Power, Cost, Specifications, Purpose. 
		 * Due to this reason, we cannot get brand name for Apple device.
		 */
		ElectronicGadget device = new AppleMobile();		
		device.cost();
		device.power();
		device.specifications();
		device.purpose();
		
		/**
		 * The calling is different here. We are Calling the device type (i.e; Mobile) instead of Electronic gadget.
		 * Mobile is provided with the brand name also.
		 * Due to this reason, We can able to get the brand name also in addition to cost,power,specifications, purpose.
		 */
		Mobile device1 = new Htc();
		device1.brand();
		device1.cost();
		device1.power();
		device1.specifications();
		device1.purpose();
		
		
	}
}
