package in.careerscale.batch3.bruno.inheritance;

public class DepositAccount extends Account {

	public final double limite; //um valor positivo que corresponde ao limite
    //de saldo negativo

    public DepositAccount() {
        super();
        limite = 0;
    }

    public DepositAccount(int oLimite) {
        super();
        this.limite = oLimite;
    }

    /**
     *
     * @param sum o valor a levantar!
     */
    @Override
    public void withdraw(double soma) {
        if (soma > 0) {
            if ((getBalance() - soma) < (limite * -1)) {
                System.err.println("Account.withdraw(...): "
                        + "Limite de saldo negativo excedido! Nao e "
                        + "possivel levantar tanta guita!");

            } else {
                super.withdraw(soma);
            }
        } else {
            System.err.println("Account.withdraw(...): "
                    + "cannot withdraw negative amount.");
        }

    }
}

