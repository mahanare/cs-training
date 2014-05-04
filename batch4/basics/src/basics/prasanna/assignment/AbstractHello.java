package basics.prasanna.assignment;

public class AbstractHello implements InterfaceHello {

	@Override
	public void SayHello() {
		System.out.println("Hi friend ");

	}

	@Override
	public void Howabtu() {
		System.out.println("How are you? ");

	}

	public static void main(String[] args) {
		AbstractHello hello = new AbstractHello();
		hello.SayHello();
		hello.Howabtu();

	}
}
