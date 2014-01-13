package in.careerscale.batch3.hari.designpatterns.decorator;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IceCream icecream = new HoneyDecorator(new NuttyDecorator(new FruitsDecorator(new SimpleIceCream())));
	    System.out.println(icecream.makeIcecream());
	    System.out.println("cost :" +icecream.cost());
	    System.out.println("Description :" +icecream.getDescription());
	
		IceCream icecream1 = new HoneyDecorator(new NuttyDecorator(new SimpleIceCream()));
	    System.out.println(icecream1.makeIcecream());
	    System.out.println("cost :" +icecream1.cost());
	    System.out.println("Description :" +icecream1.getDescription());
	    
		IceCream icecream2 = new HoneyDecorator(new FruitsDecorator(new SimpleIceCream()));
	    System.out.println(icecream2.makeIcecream());
	    System.out.println("cost :" +icecream2.cost());
	    System.out.println("Description :" +icecream2.getDescription());
	}

}
