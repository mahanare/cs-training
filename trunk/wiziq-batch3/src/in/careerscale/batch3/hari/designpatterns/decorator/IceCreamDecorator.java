package in.careerscale.batch3.hari.designpatterns.decorator;

abstract class IcecreamDecorator implements IceCream {

	protected IceCream specialIcecream;

	public IcecreamDecorator(IceCream specialIcecream) {
		this.specialIcecream = specialIcecream;
	}

	public String makeIcecream() {
		return specialIcecream.makeIcecream()+" and decorator ";
	}

}