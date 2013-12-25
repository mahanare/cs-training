package in.careerscale.batch3.bruno;

public class Test2 {

	private String name;
	
	public Test2(String name, boolean state) {
		this.name=name;
	}
	
	public String toString(){
		return "My name is " + getName(); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
