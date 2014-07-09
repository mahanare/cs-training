package in.careerscale.training.swetha.inner;

public class StaticInnerClass {

	private String name = "swetha";

	static class InnerClass {
		static String name1 = "Swetha";

		public void printName() {
			System.out.println(name1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticInnerClass class1 = new StaticInnerClass();

		StaticInnerClass.InnerClass class2 = new StaticInnerClass.InnerClass();

		class2.printName();

	}

}
