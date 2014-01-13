package in.careerscale.batch3.hari.designpatterns.decorator;

public class SimpleIceCream implements IceCream {

	
	@Override
	public String makeIcecream() {
		 return "Making Base Icecream";
	}

	@Override
	public int cost() {
		return 5;
	}

	@Override
	public String getDescription() {
		return "Simple Ice Cream";
	}

}
