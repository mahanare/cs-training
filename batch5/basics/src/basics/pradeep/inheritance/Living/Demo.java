package basics.pradeep.inheritance.Living;

public abstract class Demo {

	public static void main(String[] args) {
		LivingThing hen = new Hen();
		hen.sleep();
		hen.speak();

		Bird sameHen = (Bird) hen;

		sameHen.sleep();
		sameHen.listen();
		sameHen.speak();
		sameHen.fly();

		ILivingThing goat = new Goat();
		goat.eat();
		goat.listen();
		IVegetarian sameGoat = (IVegetarian) goat;
		sameGoat.eat();

		Goat anotherSameGoat = (Goat) goat;
		anotherSameGoat.listen();
		anotherSameGoat.sleep();
		anotherSameGoat.speak();
		anotherSameGoat.eat();
		anotherSameGoat.anotherMethod();

	}
	// TODO Auto-generated method stub

}
