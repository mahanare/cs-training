package basics.hari.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {

		AbstractParent parent = new ConcreteChild();

		parent.sayHello();

		((ConcreteChild) parent).sayHi();

		// AbstractParent parent1 = new AdvCalculator();

	}

}
