package basics.prashanth.threads;

public class MyThread extends Thread {
	public int ids = 0;

	MyThread(int ids) {
		this.ids = ids;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread : " + ids + "  i value is " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
