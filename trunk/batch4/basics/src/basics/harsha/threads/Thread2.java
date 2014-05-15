package harsha.baiscs.threads.deadlock;

public class Thread2 extends Thread {

	int id;
	SharedResouce1 shared1;
	SharedResource2 shared2;
	
	public Thread2(int id, SharedResouce1 shared1, SharedResource2 shared2){
		this.id = id;
		this.shared1 = shared1;
		this.shared2 = shared2;
	}
	
	@Override
	public void run() {
		
		synchronized (shared2) {
			
			synchronized (shared1) {
				shared1.displayNumbers(id);
				
			shared2.displayNumbers(id);
			try {
				//shared1.wait();
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//shared2.notifyAll();
			
		}
		}
	}
		
	
}
