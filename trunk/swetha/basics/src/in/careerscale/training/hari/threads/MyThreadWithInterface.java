package training.threads;

public class MyThreadWithInterface implements Runnable {

	private int id;

	public MyThreadWithInterface(int id) {
		this.id = id;

	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out
					.println("Thread (Runnable) : " + id + "  printing :" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
