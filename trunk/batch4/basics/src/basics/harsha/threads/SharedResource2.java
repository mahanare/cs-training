package basics.harsha.threads;

public class SharedResource2 {
	
	public synchronized void displayNumbers(int threadId){
		
		for(int i=10; i<20; i++){
			System.out.println("SO2 - Thread id  : " + threadId  + " and i value : " + i);
		   
		}
		
		 
	}

}
