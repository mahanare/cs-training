package basics.nitya;

public class oops{
	
	int number =1;
	
	public oops(){
		this.number=1;
		}
	public oops(int number){
		this.number=number;
		
	}
	
	public String sayHello(String name){
		return "Hello"+name;
		
	}
	
	public String sayTime(String name,String language){
		String responseDay="";
		if(language.equalsIgnoreCase("english")){
			responseDay="good evening"+name;
		}
		return responseDay;
			
		}
	}
	
	


