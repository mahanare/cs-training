package in.careerscale.batch3.hari.designpatterns.decorator;

public class FruitsDecorator extends IcecreamDecorator {
	 
	  public FruitsDecorator(IceCream specialIcecream) {
	    super(specialIcecream);
	  }
	 
	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addFruits();
	  }
	 
	  private String addFruits() {
	    return " + nice fruits";
	  }

	@Override
	public int cost() {
		return specialIcecream.cost()+ 4;
	}

	@Override
	public String getDescription() {
		return specialIcecream.getDescription()+ " with Fruits";
	}
	}