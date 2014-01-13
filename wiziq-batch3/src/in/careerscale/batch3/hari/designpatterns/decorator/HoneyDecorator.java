package in.careerscale.batch3.hari.designpatterns.decorator;

public  class HoneyDecorator extends IcecreamDecorator {
	 
	  public HoneyDecorator(IceCream specialIcecream) {
	    super(specialIcecream);
	  }
	 
	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addHoney();
	  }
	 
	  private String addHoney() {
	    return " + sweet honey";
	  }

	@Override
	public int cost() {
		 return specialIcecream.cost() + 2;
	}

	@Override
	public String getDescription() {
		return specialIcecream.getDescription() +" with Honey";
	}
	}