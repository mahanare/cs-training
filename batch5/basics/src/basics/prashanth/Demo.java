package basics.prashanth;

public class Demo {
	// demonstration to show interface implementation (contract level) to class
	// cat

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILivingThing cat = new Cat();
		cat.idrink();
		cat.irest();
		cat.ieat();
		cat.ispeak();

	}

}
