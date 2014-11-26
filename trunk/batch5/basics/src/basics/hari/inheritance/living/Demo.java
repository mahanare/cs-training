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

		ILivingThing goat = new Goat();
		goat.eat();
		goat.drinkWater();
		// goat.anotherMethod();

		IVegetarian sameGoat = (IVegetarian) goat;
		sameGoat.eat();

		Goat anotherSameGoat = (Goat) goat;
		anotherSameGoat.drinkWater();
		anotherSameGoat.sleep();
		anotherSameGoat.speak();
		anotherSameGoat.eat();
		anotherSameGoat.anotherMethod();

	}

}
