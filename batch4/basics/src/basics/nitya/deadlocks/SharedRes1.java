package basics.nitya.deadlocks;

public class SharedRes1 {
	
	public synchronized void displayNum(int threadId){
		for(int i=0;i<10;i++){
			System.out.println("SO1 - Thread id:"+threadId + "and i value :"+i);
		}
	}

}


