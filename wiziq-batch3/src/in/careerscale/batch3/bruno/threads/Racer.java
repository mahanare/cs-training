package in.careerscale.batch3.bruno.threads;

public class Racer implements Runnable {

	public static String winner;

	public void race() {

		for (int distance = 1; distance <= 100; distance++) {
			System.out.println("Distance covered by "
					+ Thread.currentThread().getName() + " is: " + distance
					+ " meters");
			if ((distance == 30)
					&& (Thread.currentThread().getName().equals("Hare"))) {
				try {
					System.out.println(Thread.currentThread().getName()
							+ " is sleepinnnnng...Grrr");
					Thread.sleep(1000 * 10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			boolean isRaceWon = this.isRaceWon(distance);

			if (isRaceWon) {
				break;
			}
		}
	}

	private boolean isRaceWon(int totalDistanceCovered) {
		boolean isRaceWon = false;

		if ((Racer.winner == null) && (totalDistanceCovered == 100)) {
			String winnerName = Thread.currentThread().getName();
			Racer.winner = winnerName;
			System.out.println("Winner is: " + Racer.winner);
			isRaceWon = true;
		} else if (Racer.winner == null) {
			isRaceWon = false;
		} else if (Racer.winner != null) {
			isRaceWon = true;
		}
		return isRaceWon;
	}

	// Method to initiate thread (run())
	public void run() {
		this.race();
	}

}
