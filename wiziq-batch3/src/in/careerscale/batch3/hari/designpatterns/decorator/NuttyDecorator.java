package in.careerscale.batch3.hari.designpatterns.decorator;

public class NuttyDecorator extends IcecreamDecorator {
	 
	  public NuttyDecorator(IceCream specialIcecream) {
	    super(specialIcecream);
	  }
	 
	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addNuts();
	  }
	 
	  private String addNuts() {
	    return " + cruncy nuts";
	  }
	
	

@Override
public int cost() {
	return specialIcecream.cost()+ 3;
}

@Override
public String getDescription() {
	return specialIcecream.getDescription() +" with Nuts";
}

	}