package basics.prashanth;



public class Calculator {
	
	private int a;
	private int b;
	public String ch;
	
	public Calculator() {
	
		System.out.println("my contructor");
	}

	
	public int addNumbers(int a, int b){
		this.a=a;
		this.b=b;
		return a+b;
	}
	public int addNumbers(int a){
		this.a=a;
		return a+3;
	}
	private int addNumbers(int a, String b){
		this.a=a;
		return a+6;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();


	}

}
