package basics.prashanth.threads;

public class MyRunnable implements Runnable {
	private int ids;

	public MyRunnable(int ids) {
		this.ids = ids;
	}

	public void run() {
		// TODO Auto-generated method stub
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
