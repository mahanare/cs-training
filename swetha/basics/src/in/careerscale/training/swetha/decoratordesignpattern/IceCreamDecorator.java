package in.careerscale.training.swetha.decoratordesignpattern;

abstract class IceCreamDecorator implements IceCream{
	
	protected IceCream Sundae;
	
	public IceCreamDecorator(IceCream Sundae){
		this.Sundae=Sundae;
	}
public String getDescription(){
	return this.Sundae.getDescription();
}
}
