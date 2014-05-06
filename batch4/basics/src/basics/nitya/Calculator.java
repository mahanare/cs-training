package basics.nitya;


public class Calculator {
	
	public int add(int a,int b){
		return a+b;
	}

	public int sub(int a,int b){
		return a-b;
	}
	
	public int mul(int a,int b){
		return a*b;
		}
	
	public int div(int a,int b){
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(7, 3));
		System.out.println(cal.sub(7, 3));
		System.out.println(cal.mul(7, 3));
		System.out.println(cal.div(7, 3));
	}

}
