package basics.nitya.deadlocks;

public class Thread2 extends Thread{
	
	int id;
	SharedRes1 shared1;
	SharedRes2 shared2;
	public Thread2(int id,SharedRes1 shared1,SharedRes2 shared2) {
		this.id=id;
		this.shared1=shared1;
		this.shared2=shared2;		
	}
	public void run(){
		synchronized(shared2){
			shared2.displayNum(id);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			//shared2.notifyAll();
			synchronized (shared1) {
				shared1.displayNum(id);
			}
		}
		
	}

}
