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
		shared1.displayNumbers(id);
		shared2.displayNumbers(id);
	}
	

}
