package in.careerscale.training.hari.oops.inheritance;

public class BorealOwl extends Bird implements CommonFeatures {
	String name;
	public BorealOwl() {
		super();
		this.name="Owl";
	}

	public void mySelf() {

		super.sayMyName(this.name);

	}
	@Override
	public void feeding() {
		System.out.println("I feed on mammals");

	}

	@Override
	public void scientificName() {
		System.out.println("my scientific name is Aegolius funereus");
	}

	@Override
	public void location() {
		System.out.println("I am found in coniferous forests");
	}

	@Override
	public void flyHigh() {
		System.out.println("I fly high");
	}

}
