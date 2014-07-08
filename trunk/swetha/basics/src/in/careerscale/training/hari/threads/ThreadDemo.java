package in.careerscale.training.hari.threads;

import javax.sql.rowset.Joinable;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		MyThread thread3 = new MyThread(3);
		MyThread thread4 = new MyThread(4);
		
		//thread1.start();
		//thread2.start();
		//thread3.start();
		//thread4.start();
		
		
		MyThreadWithInterface thread5 = new MyThreadWithInterface(5);
		MyThreadWithInterface thread6 = new MyThreadWithInterface(6);
		
		
	
		Thread thread5a = new Thread(thread5);
		//Thread thread5b = new Thread(thread6);
		thread5a.start();
		thread5a.interrupt();
		thread5a.join();
		
		
		//thread5a.start();
		//thread5b.start();

	}

}
