package in.careerscale.training.hari.designpatterns;

public class Static {
	
	public static int id;
	
	
	static{
		System.out.println("Java training");
	}
	
	
	public static void hello(){
		System.out.println("hello");
	}

	public static void main(String[] params) {

	
	System.out.println("object id is " + Static.id);
	System.out.println(params[0]);
	System.out.println(params[1]);
	System.out.println(params[2]);
	Static.hello();
		
	}
}


