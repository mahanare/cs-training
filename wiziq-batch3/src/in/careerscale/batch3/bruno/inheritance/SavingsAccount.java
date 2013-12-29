package in.careerscale.batch3.bruno.inheritance;

public class SavingsAccount extends Account {

	private float anualTaxInterest;

	public SavingsAccount() {
		super();
		anualTaxInterest = 0.0F;
	}

	public SavingsAccount(int a) {
		super();
		this.anualTaxInterest = 0;

	}

	public SavingsAccount(float taxa) {
		super();
		this.anualTaxInterest = taxa;

	}

	public void AccJuros(int months) {
		double balance = getBalance();
		double interestsValue = ((balance * getTaxInterest()) * months) / 12;
		// valor do juros e anual deve-se aplicar uma taxa correspondente ao periodo de calculo do juros!
		deposit(interestsValue);

	}

	/**
	 * @return Get Tax Interest
	 */
	public float getTaxInterest() {
		return anualTaxInterest;
	}

	/**
	 * @param Set Tax Interest
	 */
	public void setTaxaJuro(float taxaJuro) {
		this.anualTaxInterest = taxaJuro;
	}

}
