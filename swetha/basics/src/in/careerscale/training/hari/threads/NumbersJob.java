package in.careerscale.training.hari.threads;


class Printer extends Thread{
	ThreadLocal<Integer> id;
	private volatile Integer next =1;
	private volatile Object lock;
	public Printer(Integer id, Object lock){
		this.id = new ThreadLocal<Integer>();
		this.id.set(id);
		this.lock = lock;
		
		
	}
	
	
	
	@Override
	public void run() {
		while(true){
		if(next == id.get().intValue()){
			synchronized (lock) {
				System.out.println(next);
				next++;
				
			}
			lock.notify();
			break;
		}
		}
	}
}
public class NumbersJob {
	
	

	public static void main(String[] args) {
		
		Object lock = new Object();
		Printer t1 =  new Printer(1, lock);
		Printer t2 =  new Printer(2, lock);
		Printer t3 =  new Printer(3, lock);
		Printer t4 =  new Printer(4, lock);
		Printer t5 =  new Printer(5, lock);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
