package in.careerscale.training.swetha.singleton;

public class SingletonClassDemo {
	
	private static SingletonClassDemo number;
	
	private SingletonClassDemo(){
		System.out.println("i need to be printed once");
	}
	
	public static SingletonClassDemo getInstance() {

		if (number == null) {
			number = new SingletonClassDemo();
		}
		return number;
	}
	
}