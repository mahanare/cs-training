package in.careerscale.training.hari.io;

public class Mocha implements Beverage {

	public transient String someText="Hello This will never be stored into file";
	
	private Beverage coffee; 
	public Mocha(Beverage coffee) {
		this.coffee =coffee;
	}

	@Override
	public String getDescription() {
		
		return coffee.getDescription() + " with Mocha";
		
	}

	@Override
	public int getCost() {
		return coffee.getCost() + 5;
		
	}

	public String getSomeText() {
		return someText;
		
		
	}

	

}
