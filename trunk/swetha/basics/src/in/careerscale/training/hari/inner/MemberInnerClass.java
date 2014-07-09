package in.careerscale.training.hari.inner;

public class MemberInnerClass {
	
	private String name="Baiju";
	
	class MyInnerClass {
		
		public void sayHello(){
			System.out.println("Hello from inner class" + name);
		}
	}

	
	public static void main(String[] args) {
		MemberInnerClass outerObject = new MemberInnerClass();
		
		MemberInnerClass.MyInnerClass demo = outerObject.new MyInnerClass();
		demo.sayHello();
	}
}
