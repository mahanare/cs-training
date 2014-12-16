package basics.hari.threads;

public class MyThread extends Thread {

	int id = 0;

	MyThread(int id) {
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
