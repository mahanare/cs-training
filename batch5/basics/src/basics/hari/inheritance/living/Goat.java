package basics.hari.inheritance.living;

public class Goat extends Animal implements ILivingThing, IVegetarian {

	@Override
	public void speak() {

		System.out.println("May May..");

	}

	@Override
	public void eat() {
		System.out.println("I can eat vegetarian");

	}

	public void drinkWater() {
		System.out.println("Goat drinks water");

	}

	public void sleep() {
		System.out.println("Goat sleeps like other animals");

	}
}
