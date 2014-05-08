package basics.hari.threads;

public class MyRunnableThread implements Runnable {


	@Override
	public void run() {
		
		for(int i=0; i<10; i++){
			System.out.println("i value is :" + i);
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		MyRunnableThread runnable1 = new MyRunnableThread();
		MyRunnableThread runnable2 = new MyRunnableThread();
		MyRunnableThread runnable3 = new MyRunnableThread();
		
		Thread thread1= new Thread(runnable1);
		Thread thread2= new Thread(runnable2);
		Thread thread3= new Thread(runnable3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		//thread1.start();
		

	}

}
