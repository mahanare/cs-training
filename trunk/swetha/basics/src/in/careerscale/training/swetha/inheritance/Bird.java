package in.careerscale.training.swetha.inheritance;

public abstract class Bird {
	String name;

	public Bird() {
		System.out.println("I am a bird");
	}

	public abstract void feeding();

	public abstract void scientificName();

	public abstract void location();

	public void sayMyName(String name) {
		System.out.println("my name is " + name);
	}

}
