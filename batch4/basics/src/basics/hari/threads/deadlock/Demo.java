package basics.hari.threads.deadlock;

public class Demo {

	public static void main(String[] args) {
	
		SharedResouce1 shared1 = new SharedResouce1();
		SharedResource2 shared2 = new SharedResource2();
		
		Thread1 thread1 = new Thread1(1,shared1, shared2);
		Thread2 thread2 = new Thread2(2,shared1, shared2);
		
		thread1.start();
		thread2.start();

	}

}
