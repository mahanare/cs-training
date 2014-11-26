package basics.hari.inheritance.living;

public class Demo {

	public static void main(String[] args) {

		LivingThing duck = new Duck();
		duck.drinkWater();
		duck.speak();

		Bird sameDuck = (Bird) duck;

		sameDuck.sleep();
		sameDuck.drinkWater();
		sameDuck.speak();
		sameDuck.fly();

		ILivingThing dog = new Dog();
		dog.eat();
		dog.drinkWater();

		IVegetarian sameDog = (IVegetarian) dog;
		sameDog.eat();

	}

}
