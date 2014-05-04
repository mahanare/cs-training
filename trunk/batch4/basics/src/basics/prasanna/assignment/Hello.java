package basics.prasanna.assignment;

public class Hello extends AbstractHello {
	public void SayHello(String name){
		System.out.println(" Hello "+ name);
		
		
	}

	public static void main(String[] args) {
		Hello hi = new Hello();
		hi.SayHello("dad");
		AbstractHello hello= new AbstractHello();
		hello.Howabtu();

	}

}
