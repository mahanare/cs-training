package basics.pradeep.threads;

public class MyThread extends Thread {
	int id = 0;

	MyThread(int id) {
		this.id = id;
	}

	public void run() {

		for (int i = 0; i < 8; i++) {
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
