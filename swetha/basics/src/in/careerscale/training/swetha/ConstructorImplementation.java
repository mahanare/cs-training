package in.careerscale.training.swetha;

public class ConstructorImplementation {
	
	
	public static void main(String args[]) {
		Box box1 = new Box(10, 20, 30);
		Box box2 = new Box(10);
		Box box3 = new Box();

		double vol;

		vol = box1.volume();
		System.out.println("box1 volume is" + vol);

		vol = box2.volume();
		System.out.println("box2 volume is" + vol);

		vol = box3.volume();
		System.out.println("box3 volume is" + vol);
	}
}