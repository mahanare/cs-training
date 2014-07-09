package in.careerscale.training.swetha.inner;

public class InnerClassDemo {
	private String name;

	public class InnerClass {
		public void printNumbers() {
			for (int i = 0; i < 10; i++) {
				System.out.println("the number is" + i);
			}
			System.out.println("I am a inner class");
		}

		public String sayYourName() {
			name = "SWETHA";
			return name;
		}
	}

	public static void main(String[] args) {
		String stringName;
		InnerClassDemo temp = new InnerClassDemo();
		InnerClassDemo.InnerClass temp1 = temp.new InnerClass();
		temp1.printNumbers();
		stringName = temp1.sayYourName();
		System.out.println("My name is" + stringName);
	}

}
