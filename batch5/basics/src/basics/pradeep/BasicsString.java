package basics.pradeep;

public class BasicsString // class name
{

	public static void main(String[] args) // main method
	{
		BasicsString o = new BasicsString();// object creation
		o.message();
		o.show();// method calling
		// TODO Auto-generated method stub

	}

	public void message()// define method
	{
		String m = "Hello";
		System.out.println("hello message " + m);
		String w = "World";
		System.out.println("pradeep:" + w);
		String x = " Hello World";
		System.out.println(" display:" + x);

	}

	public void show() {
		System.out.println("hai");
	}
}
