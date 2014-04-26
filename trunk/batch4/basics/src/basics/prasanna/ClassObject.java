package basics.prasanna;

public class ClassObject {
	private String goodMorning;

	public String goodMorning(String name){
	return "good morning"+name;
	
	}

	public static void main(String[] args) {
		ClassObject Object = new ClassObject();
		System.out.println(Object.goodMorning(" World"));
		

	}

}
