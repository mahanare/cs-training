package basics.pradeep.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {

		AbstractParent parent = new ConcreteChild();

		((AbstractParent) parent).sayHello();

		((ConcreteChild) parent).sayHi();

	}

}
