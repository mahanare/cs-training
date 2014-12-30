package basics.pradeep.threads;

public class Demo {
	public void demoWithThread() {
		MyThread t0 = new MyThread(0);
		MyThread t1 = new MyThread(1);
		MyThread t2 = new MyThread(2);
		t0.start();
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.demoWithThread();

	}

}
