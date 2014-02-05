package in.careerscale.training.nospring;

public class HelloWorldImpl implements HelloWorld {
	
	private Dependent dependent;
	@Override
	public String sayHello() {

		return "Hello ";
	}
	
	@Override
	public String sayHello(String name) {

		dependent = new Dependent();
		return "Hello "+ name + ", " + dependent.sayGoodMorning();
		
	}

}
