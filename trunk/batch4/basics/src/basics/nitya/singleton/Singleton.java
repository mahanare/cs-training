package basics.nitya.singleton;

public class Singleton {

	private static Singleton siton;
	
	private Singleton(){
		System.out.println("I am singleton Constructor");
	}
		
	public static Singleton getInstance(){		
		if(siton==null){
			siton = new Singleton();
			System.out.println("Object is created");
		}else{
			System.out.println("Object is not created as it exists already");
		}
		return siton;
		}			
		
	}

