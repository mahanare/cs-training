package in.careerscale.training.simple;


public class HelloWorldImpl implements HelloWorld {

	BeanWithConstructor myBean;
	
	
	
	public void setMyBean(BeanWithConstructor myBean) {
		this.myBean = myBean;
	}



	@Override
	public void sayHello() {
		
		System.out.println("Hello World");

	}

}
