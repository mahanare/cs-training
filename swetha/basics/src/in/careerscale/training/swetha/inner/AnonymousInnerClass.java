package in.careerscale.training.swetha.inner;

public class AnonymousInnerClass {

	private String name = "swetha";

	public void printName() {
		System.out.println(name);
		CommonFeaturesBird bird = new CommonFeaturesBird() {

			@Override
			public void flyhigh() {
				// TODO Auto-generated method stub
				System.out.println("I fly high");
			}

		};
		bird.flyhigh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass demo = new AnonymousInnerClass();
		demo.printName();
	}

}
