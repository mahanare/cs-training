package in.careerscale.training.hari.threads;

public class MyThread extends Thread {
	
	private int id;
	
	public MyThread(int id){
		this.id =id;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i < 10; i++){
			System.out.println("Thread : " + id + " : value : " + i);
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		
		//thread1.run();
		//thread2.run();
		thread1.start();
		thread2.start();
		
		
	}

}
