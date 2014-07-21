package in.careerscale.training.swetha.decoratordesignpattern;

public class Caramel extends IceCreamDecorator{

	public Caramel(IceCream Sundae) {
		super(Sundae);
		// TODO Auto-generated constructor stub
	}
	public String getDescription(){
		return Sundae.getDescription()+ addCaramel();
		
	}
	private String addCaramel() {
		// TODO Auto-generated method stub
		return "+caramel";
	}
	
	

}
