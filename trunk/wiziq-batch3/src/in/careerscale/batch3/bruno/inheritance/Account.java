package in.careerscale.batch3.bruno.inheritance;

public class Account {

	private double bal; // The current balance
	private int accountNumber; // The account number
	private static int numAccounts = 0; // Number of accounts

	public Account() {

		numAccounts++;
		accountNumber = numAccounts;

	}

	public void deposit(double sum) {
		if (sum > 0)
			bal += sum;
		else
			System.err.println("Account.deposit(...): "
					+ "cannot deposit negative amount.");
	}

	public void withdraw(double sum) {
		if (sum > 0)
			bal -= sum;
		else
			System.err.println("Account.withdraw(...): "
					+ "cannot withdraw negative amount.");
	}

	public double getBalance() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "Number of Account : " + accountNumber + " " + "Balance : "
				+ bal;
	}

	public final void print() {
		// Don't override this,
		// override the toString method
		System.out.println(toString());
	}

}
