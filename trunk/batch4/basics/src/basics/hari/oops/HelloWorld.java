package basics.hari.oops;

public class HelloWorld {

	int number =1;
	
	
	public  HelloWorld(){
		this.number = 1;
	}
	
	public  HelloWorld(int number){
		this.number = number;
	}
	

	
	public String sayHello(String name){
		
		return "Hello " + name;
		
	}
	
	public String sayHello(String name, int hour){
		String response ="";
		
		if(hour < 12){
			response = "Good morning, " + name;
			
		}else if(hour > 12 && hour < 17 ){
			response = "Good afternoon, " + name;
		}
		else{
			response ="Hello " + name;
		}
		return response;
		
		
	}
	
	public String sayGoodEvening(String name, String language){
		String response ="";
		if(language.equalsIgnoreCase("english")){
			response ="Good evening " + name;
		}
		return response;
	}
	
	
	

}
