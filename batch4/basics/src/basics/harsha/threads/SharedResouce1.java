package harsha.baiscs.threads.deadlock;

public class SharedResouce1 {
	
	public synchronized void displayNumbers(int threadId){
		
		for(int i=0; i<10; i++){
			System.out.println("SO1 - Thread id  : " + threadId  + " and i value : " + i);
			
		}
		
	}

}
