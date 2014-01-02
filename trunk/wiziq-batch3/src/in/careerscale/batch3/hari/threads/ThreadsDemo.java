package in.careerscale.batch3.hari.threads;

public class ThreadsDemo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread(1);
		MyThread t2 = new MyThread(2);

		//t1.start();
		//t2.start();
		
		MyRunnableThread rt1 = new MyRunnableThread(1);
		MyRunnableThread rt2 = new MyRunnableThread(2);
		
		Thread runnableThread1 = new Thread(rt1);
		Thread runnableThread2 = new Thread(rt2);
		
		runnableThread1.start();
		runnableThread2.start();
		
		

	}

}
