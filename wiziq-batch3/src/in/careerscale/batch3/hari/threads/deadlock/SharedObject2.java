package in.careerscale.batch3.hari.threads.deadlock;

public class SharedObject2 {
	
	public synchronized void displayNumbers(int threadId){
		
		for(int i=10; i<20; i++){
			System.out.println("SO2 - Thread id  : " + threadId  + " and i value : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}

}
