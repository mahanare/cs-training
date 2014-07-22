package in.careerscale.training.hari.io;

public class Coffee implements Beverage {
	
	public Coffee(){
		
	}

	@Override
	public String getDescription() {
		return "Basic Coffee";
		
	}

	@Override
	public int getCost() {
		
		return 5;//make it configurable from db or so in case of real application
		
	}



}
