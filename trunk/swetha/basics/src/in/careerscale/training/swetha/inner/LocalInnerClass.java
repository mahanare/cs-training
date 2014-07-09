package in.careerscale.training.swetha.inner;

public class LocalInnerClass {
	private String name = "swetha";

	public void printNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		class LocalClass {
			LocalClass() {
				System.out.println(name);
			}

			public void sayHello() {
				System.out.println("hi");
			}
		}
		LocalClass class1 = new LocalClass();
		class1.sayHello();
	}

	public static void main(String[] args) {
		LocalInnerClass class2 = new LocalInnerClass();
		class2.printNumbers();
	}

}
