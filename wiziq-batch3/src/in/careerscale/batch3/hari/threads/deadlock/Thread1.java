package in.careerscale.batch3.hari.threads.deadlock;

public class Thread1 extends Thread {
	int id;
	SharedObject1 shared1;
	SharedObject2 shared2;
	
	public Thread1(int id, SharedObject1 shared1, SharedObject2 shared2){
		this.id = id;
		this.shared1 = shared1;
		this.shared2 = shared2;
	}
	@Override
	public void run() {
		synchronized (shared1) {
			shared1.displayNumbers(id);
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (shared2) {
				shared2.displayNumbers(id);
			}
		}
		
		
	}
	

}
