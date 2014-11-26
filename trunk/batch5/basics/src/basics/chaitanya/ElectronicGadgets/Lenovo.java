package basics.chaitanya.ElectronicGadgets;

public class Lenovo extends Laptop implements ILenovo{

	@Override
	public void brand() {
		System.out.println("This is a Lenovo Laptop");
	}

	@Override
	public void memoryCapacity() {
		System.out.println("This has 1TB Harddisk along with 32GB SolidDisk");
	}

	@Override
	public void purpose() {
		System.out.println("This is used for all purposes");
	}

	@Override
	public void cost() {
		System.out.println("This cost varies from 400 dollars to 1500 dollars");
	}

	@Override
	public void specifications() {
		System.out.println("This has a touch screen");
	}

	@Override
	public void ramCapacity() {
		System.out.println("This can hold a maximum of 8GB RAM memory");
	}

}
