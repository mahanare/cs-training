package basics.prashanth;

public abstract class Birds extends LivingBeings {

	@Override
	public void drink() {
		System.out.println("Birds drink");

	}

	@Override
	public void rest() {
		System.out.println("Birds rest");

	}

	public abstract void fly();

}
