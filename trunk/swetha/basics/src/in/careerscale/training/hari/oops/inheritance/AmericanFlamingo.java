package in.careerscale.training.hari.oops.inheritance;

public class AmericanFlamingo extends Bird {
	String name;

	AmericanFlamingo() {
		super();
		this.name = "Flamingo";
	}

	public void mySelf() {

		super.sayMyName(this.name);

	}

	@Override
	public void feeding() {
		System.out.println("I feed on fish,algae and planktons");

	}

	@Override
	public void scientificName() {
		System.out.println("My scientific name is phoenicopterus ruber");
	}

	@Override
	public void location() {

		System.out.println("I am found throughout the carribean");

	}

}
