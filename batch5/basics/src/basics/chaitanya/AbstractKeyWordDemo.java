package basics.chaitanya;

public class AbstractKeyWordDemo {

	public static void main(String[] args) {
		AbstractFamily role = new ConcreteChild();
		role.familyAuthority();
		((ConcreteChild) role).childrenRole();
	}
}
