package basics.nitya.deadlocks;

public class Thread1 extends Thread{
	int id;
	SharedRes1 shared1;
	SharedRes2 shared2;
	
	public Thread1(int id,SharedRes1 shared1,SharedRes2 shared2){
		this.id=id;
		this.shared1=shared1;
		this.shared2=shared2;
	}
	public void run(){
		synchronized(shared1){
			shared1.displayNum(id);
			try{
				//shared1.wait();
				sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			//shared1.notifyAll();
		}
		synchronized(shared2){
			shared2.displayNum(id);
		}
	}
	

}
