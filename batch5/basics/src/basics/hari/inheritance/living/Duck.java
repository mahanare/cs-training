package basics.hari.inheritance.living;

public class Duck extends Bird {

	@Override
	public void fly() {
		System.out.println("Sorry cannt fly high");

	}

	@Override
	public void eat() {
		System.out.println("I eat the small things");

	}

	@Override
	public void sleep() {
		System.out.println("I sleep while standing");

	}

	@Override
	public void speak() {
		System.out.println("Quack quack");

	}

}
