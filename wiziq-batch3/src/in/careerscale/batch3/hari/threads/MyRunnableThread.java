package in.careerscale.batch3.hari.threads;

public class MyRunnableThread implements Runnable {

	int id;

	public MyRunnableThread(int id) {
		this.id = id;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread id is : " + id + " and i value : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
