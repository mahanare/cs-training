package basics.chaitanya.ElectronicGadgets;

public class Demo {

	public static void main(String[] args) {
		/**
		 * ElectronicGadget includes Power, Cost, Specifications, Purpose. 
		 * Due to this reason, we cannot get brand name for Apple device.
		 */
		ElectronicGadget device1 = new AppleMobile();		
		device1.cost();
		device1.power();
		device1.specifications();
		device1.purpose();
		
		/**
		 * The calling is different here. We are Calling the device type (i.e; Mobile) instead of Electronic gadget.
		 * Mobile is provided with the brand name also.
		 * Due to this reason, We can able to get the brand name also in addition to cost,power,specifications, purpose.
		 */
		Mobile device2 = (Mobile)device1;
		System.out.println("--------------------------------------------------------");
		device2.brand();
		device2.cost();
		device2.power();
		device2.specifications();
		device2.purpose();
		
		
		ElectronicGadget device3 = new Lenovo();
		System.out.println("--------------------------------------------------------");
		device3.cost();
		device3.power();
		device3.purpose();
		device3.specifications();
		
		Laptop device4 = (Laptop)device3;
		System.out.println("--------------------------------------------------------");
		device4.brand();
		device4.cost();
		device4.memoryCapacity();
		device4.power();
		device4.purpose();
		device4.ramCapacity();
		device4.specifications();
		
		/**
		 * Here I have made a wrong Instantiation call to device3. I have Defined device3 variable as a Lenovo tablet. 
		 * But I tried to implement a call using the Mobile Specifications. This throws an exception in thread
		 */
		Mobile device = (Mobile)device3;
		device.cost();
		device.power();
		device.purpose();
		
		
			
	}
}
