package in.careerscale.batch3.bruno.threads;

public class JoinThreads implements Runnable {

	@Override
	public void run() {
		System.out.println(System.nanoTime() + " Current Thread: "
				+ Thread.currentThread().getName() + " is at the beginning");

		if (Thread.currentThread().getName().equals("First Thread")) {
			try {
				System.out.println(System.nanoTime()
						+ " inside the join condition");
				JoinDemo.secondThread.start();
				JoinDemo.secondThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
