package in.careerscale.batch3.hari.threads.deadlock;

public class Demo {

	public static void main(String[] args) {
	
		SharedObject1 shared1 = new SharedObject1();
		SharedObject2 shared2 = new SharedObject2();
		
		Thread1 thread1 = new Thread1(1,shared1, shared2);
		Thread2 thread2 = new Thread2(2,shared1, shared2);
		
		thread1.start();
		thread2.start();

	}

}
