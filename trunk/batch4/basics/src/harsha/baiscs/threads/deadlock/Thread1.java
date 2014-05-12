package harsha.baiscs.threads.deadlock;

public class Thread1 extends Thread {
	int id;
	SharedResouce1 shared1;
	SharedResource2 shared2;
	
	public Thread1(int id, SharedResouce1 shared1, SharedResource2 shared2){
		this.id = id;
		this.shared1 = shared1;
		this.shared2 = shared2;
	}
	@Override
	public void run() {
		synchronized (shared1) {
			
			shared1.displayNumbers(id);
			try {
				//shared1.wait();
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			//shared1.notifyAll();
			synchronized (shared2) {
				shared2.displayNumbers(id);
		
		}
		
		
	}
	
	
}
	
