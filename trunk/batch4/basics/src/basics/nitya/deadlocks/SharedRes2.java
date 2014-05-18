package basics.nitya.deadlocks;

public class SharedRes2 {
	public synchronized void displayNum(int threadId){
		for(int i=10;i<20;i++){
			System.out.println("SO2 - Thread id  : " + threadId  + " and i value : " + i);
		}
	}

	
}
