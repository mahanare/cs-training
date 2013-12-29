package in.careerscale.batch3.bruno.inheritance;

public class DepositAccount extends Account {

	public final double limit; // a positive value that corresponds to the negative balance limit

    public DepositAccount() {
        super();
        limit = 0;
    }

    public DepositAccount(int oLimite) {
        super();
        this.limit = oLimite;
    }

    /**
     *
     * @param sum the amount to raise!
     */
    @Override
    public void withdraw(double soma) {
        if (soma > 0) {
            if ((getBalance() - soma) < (limit * -1)) {
                System.err.println("Account.withdraw(...): "
                        + "Negative balance limit exceeded ! It´s not "
                        + "possible to raise that amount of money!");

            } else {
                super.withdraw(soma);
            }
        } else {
            System.err.println("Account.withdraw(...): "
                    + "cannot withdraw negative amount.");
        }

    }
}

