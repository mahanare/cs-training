package in.careerscale.training.swetha.decoratordesignpattern;

public class IceCreamTest {
	
	public static void main(String[] args){
		
		IceCream ollies= new Caramel(new BasicIceCream());
		System.out.println(ollies.getDescription());
		
		
	}

}
