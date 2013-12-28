package in.careerscale.batch3.bruno.inheritance;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Account> accounts;

	public Bank() {
		accounts = new ArrayList<Account>();
	}

	public void addAccount(Account account) {
		this.accounts.add(account);

	}

	public int getNumberOfAccounts() {
		return this.accounts.size();
	}

	public void updateAccount() {
		for (Account aAccount : accounts) {
			if (aAccount instanceof SavingsAccount) {
				SavingsAccount theAccount = (SavingsAccount) aAccount;
				System.out.println("Taxes are: " + theAccount.getTaxaJuro());
				theAccount.setBal(theAccount.getTaxaJuro());
			}
			if (aAccount instanceof DepositAccount) {
				DepositAccount theAccount = (DepositAccount) aAccount;
				System.out.println("O saldo é: " + theAccount.getBalance());
				if (theAccount.getBalance() < 0) {
					System.out.println("A sua conta está negativa.");
				}
			}
		}
		// public String conferirInstancia(Conta estaConta){
		// if (estaConta instanceof Conta){
		// System.out.println(estaConta.withdraw(sum));
		// return this.contas.
		//
		// }
	}
}