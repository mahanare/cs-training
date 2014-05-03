package basics.hari.designpatterns;

public class SingletonDemo {
	
	
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		Singleton singleton4 = Singleton.getInstance();
		Singleton singleton5 = Singleton.getInstance();
		Singleton singleton6 = Singleton.getInstance();
		Singleton singleton7 = Singleton.getInstance();
		Singleton singleton8 = Singleton.getInstance();
		
		if(singleton.equals(singleton1)){
			System.out.println("Objects are same");
		}
		
		if(singleton == singleton1){
			System.out.println("Objects are same with == comparision");
		}

	}

}
