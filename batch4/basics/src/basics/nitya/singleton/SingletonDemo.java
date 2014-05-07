package basics.nitya.singleton;

import basics.hari.designpatterns.Singleton;

public class SingletonDemo {
	
	public static void main(String args[]){
		
		Singleton siton = Singleton.getInstance();
		Singleton siton1 = Singleton.getInstance();
		Singleton siton2 = Singleton.getInstance();
		Singleton siton3 = Singleton.getInstance();
		Singleton siton4 = Singleton.getInstance();
		Singleton siton5 = Singleton.getInstance();
		Singleton siton6 = Singleton.getInstance();
		Singleton siton7 = Singleton.getInstance();
		
		if(siton.equals(siton1)){
			System.out.println("Objects are same");
		}
		
		if(siton == siton1){
			System.out.println("Objects are same with == comparision");
		}
		
		if(siton1.equals(siton2)){
			System.out.println("Objects are same");
		}
		
		if(siton1 == siton2){
			System.out.println("Objects are same with == comparision");
		}
		
	}

}
