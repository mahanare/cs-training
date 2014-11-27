package basics.prashanth;

public final class Parrot extends Birds {

	@Override
	public void fly() {
		System.out.println("I can fly high");

	}

	@Override
	public void drink() {
		super.drink();
		System.out.println("Yes I am a Parrot, I drink water, milk etc");
	}

}
