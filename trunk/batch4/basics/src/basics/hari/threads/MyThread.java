package basics.hari.threads;

public class MyThread  extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++){
			System.out.println("i value is :" + i);
			try {
				sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
