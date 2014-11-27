package basics.pradeep.inheritance.Living;

public class Hen extends Bird {

	@Override
	public void eat() {
		System.out.println("eaten by evryone");
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		System.out.println("sleeps for 10 hours");
		// TODO Auto-generated method stub

	}

	@Override
	public void speak() {
		System.out.println("speaks continuously");
		// TODO Auto-generated method stub

	}

	@Override
	public void listen() {
		System.out.println("listening to rehman music");
		// TODO Auto-generated method stub

	}

	@Override
	public void wakeup() {
		System.out.println("i wakeup at 10am");
		// TODO Auto-generated method stub

	}

	@Override
	protected void sing() {

		System.out.println("I can sing...");

	}

}
