package in.careerscale.training.hari.threads;

public class MyRunnable implements Runnable {
	
	private int id;
	
	public MyRunnable(int id){
		this.id =id;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i < 10; i++){
			System.out.println("Thread : " + id + " : value : " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		MyRunnable runnable1 = new MyRunnable(1);
		MyRunnable runnable2 = new MyRunnable(2);

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		
		thread1.start();
		thread2.start();
		
		
	}

}
