package basics.prashanth.singleton;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("type the command line arguments");
		for (int i = 0; i < args.length; i++)
			System.out.println("parameter at:" + i + "is:" + args[i]);

		Singleton single = Singleton.getObject();
		Singleton single1 = Singleton.getObject();
		Singleton single2 = Singleton.getObject();
		Singleton single3 = Singleton.getObject();

	}

}
