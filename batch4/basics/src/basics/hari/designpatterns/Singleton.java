package basics.hari.designpatterns;

public class Singleton {
	
	private static Singleton singleton  ;
	
	private Singleton(){
		
		System.out.println("I am singleton Constructor");
	}

	public static Singleton getInstance(){
		
		if(singleton == null){
			singleton = new Singleton();
			System.out.println("Object is created");
		}else{
			System.out.println("Object is not created as it exists already");
		}
		return singleton;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton singleton = new Singleton();
		singleton = new Singleton();
		singleton = new Singleton();
		singleton = new Singleton();
		singleton = new Singleton();
	}

}
