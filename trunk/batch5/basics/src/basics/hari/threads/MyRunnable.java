package basics.hari.threads;

public class MyRunnable implements Runnable {

	private int id;

	public MyRunnable(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread : " + id + "  i value is " + i);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
