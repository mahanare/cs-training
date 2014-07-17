package in.careerscale.training.hari.io;

public class Milk implements Beverage {

	private Beverage coffee; 
	
	Milk(Beverage coffee){
		this.coffee = coffee;
	}
	@Override
	public String getDescription() {
		
		return this.coffee.getDescription() + " with Milk";
		
	}

	@Override
	public int getCost() {
		return this.coffee.getCost() + 5;
		
	}


}
