package basics.prashanth;

public abstract class LivingBeings {

	public void breathe() {
		System.out.println("living things breathe");
		// its ok for an abstract class to not have abstract method

	}

	public void eat() {
		System.out.println("living things eat");

	}

	public abstract void drink();

	// abstract classes can have abstract method
	public abstract void rest();
	// abstract classes can have abstract method

}
