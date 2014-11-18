package basics.pradeep;

public class BasicInt {

	public static void main(String[] args) {
		BasicInt i = new BasicInt();// object creation
		i.teger();
		BasicInt o = new BasicInt();
		o.har();
		BasicInt h = new BasicInt();
		h.ifDemo();
		BasicInt z = new BasicInt();
		z.forDemo();
		BasicInt y = new BasicInt();
		y.forDem();

		// method calling
		// TODO Auto-generated method stub
	}

	public void teger() {
		int a = (byte) 8;
		int b = (byte) 4;
		int x = (byte) a / b;
		System.out.println("the value of x:" + x);
		int y = a * b % x;
		System.out.println("the value of y:" + y);

	}

	public void har() {
		char a = (byte) 108;
		char b = (byte) 107;
		byte z = (byte) (a + b);
		System.out.println("the value of z:" + z);
	}

	public void ifDemo() {
		int number = 10;
		if (number > 10) {
			System.out.println("number is greater than 10");
		} else if (number > 9) {
			System.out.println("number is greater than 9 and less than 10");
		}

	}

	public void forDemo() {
		for (int i = 10; i < 19; i++) {
			System.out.println("enter the value :" + i);
		}
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i : numbers) {
			System.out.println("enter the value :" + i);
		}

	}

	public void forDem() {
		for (int i = 20; i <= 29; i++) {
			System.out.println("enter the value :" + i);
		}
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i : numbers) {
			System.out.println("enter i value from numbers");
		}

	}

}
