package in.careerscale.batch3.bruno.inheritance;

public class SavingsAccount extends Account {

	private float taxaJuroAno;

	public SavingsAccount() {
		super();
		taxaJuroAno = 0.0F;
	}

	public SavingsAccount(int a) {
		super();
		this.taxaJuroAno = 0;

	}

	public SavingsAccount(float taxa) {
		super();
		this.taxaJuroAno = taxa;

	}

	public void AccJuros(int meses) {
		double saldo = getBalance();
		double valorJuros = ((saldo * getTaxaJuro()) * meses) / 12;
		// valor do juros e anual deve-se aplicar uma taxa correspondente ao periodo de calculo do juros!
		deposit(valorJuros);

	}

	/**
	 * @return the taxaJuro
	 */
	public float getTaxaJuro() {
		return taxaJuroAno;
	}

	/**
	 * @param taxaJuro
	 *            the taxaJuro to set
	 */
	public void setTaxaJuro(float taxaJuro) {
		this.taxaJuroAno = taxaJuro;
	}

}
