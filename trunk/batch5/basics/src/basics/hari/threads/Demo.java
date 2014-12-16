package basics.hari.threads;

public class Demo {

	public void demoWithThread() {
		MyThread t1 = new MyThread(1);
		MyThread t2 = new MyThread(2);
		MyThread t3 = new MyThread(3);
		t1.start();
		t2.start();
		t3.start();
	}

	public void demoWithInterface() {
		MyRunnable r1 = new MyRunnable(1);
		MyRunnable r2 = new MyRunnable(2);
		MyRunnable r3 = new MyRunnable(3);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.demoWithInterface();

	}

}
