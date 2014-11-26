package basics.hari.inheritance.living;

public class Dog extends Animal implements ILivingThing {

	@Override
	public void speak() {

		System.out.println("I bark");

	}

	@Override
	public void eat() {
		System.out.println("I can eat NV");

	}

	public void drinkWater() {
		// TODO Auto-generated method stub

	}

	public void sleep() {
		// TODO Auto-generated method stub

	}
}
