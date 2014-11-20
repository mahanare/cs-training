package basics.chaitanya;

public class JavaBasics {

	public void CharMode() {
		char Chara1 = 'Z';
		char Chara2 = '9';
		int Charasum = Chara1 + Chara2;
		int Charadiff = Chara1 - Chara2;
		System.out
				.println("****************  CHARACTER DATA TYPE  ***************");
		System.out.println("Char1: " +  Chara1 + "="+ (int)Chara1);
		System.out.println("Chara2: " + Chara2+ "="+ (int)Chara2);

		System.out.println("Interger value of Given Characters sum:"
				+ (int) Charasum);
		System.out.println("Equivalent Character for Charsum Variable:"
				+ (char) Charasum);

		System.out.println("Interger value of Given Characters Difference:"
				+ (int) Charadiff);
		System.out.println("Equivalent Character for Charadiff Variable:"
				+ (char) +Charadiff);
	}

	public void ByteMode() {
		byte A = 127;
		byte B = 12;
		int result = (A * B);
		System.out.println("****************  BYTE DATA TYPE  ***************");
		System.out.println("A value : " + A);
		System.out.println("B value : " + B);
		System.out.println("Result value, (A*B) = " + result);
		int range = (int) Math.pow(2, 7);
		System.out.println("Range of Byte data type : " + -(range) + "  to  "
				+ (range - 1));
		if (((-range) <= result) && (result <= (range + 1))) {
			System.out.println("With in Byte range");
		} else {
			System.out.println("Not in Byte range");
		}
	}

	public void ShortMode() {
		short A = 1232;
		short B = 123;
		int result = (A * B);
		System.out.println("****************  SHORT DATA TYPE  ***************");
		System.out.println("A value : " + A);
		System.out.println("B value : " + B);
		System.out.println("Result value, (A*B) =  " + result);
		int range = (int) Math.pow(2, 15);
		System.out.println("Range of Byte data type : " + -(range) + "  to  "
				+ (range - 1));
		if (((-range) <= result) && (result <= (range - 1))) {
			System.out.println("With in Short range");
		} else {
			System.out.println("Not in Short range");
		}
	}

	public void IntMode() {
		int A = 2147483647;
		int B = 2147483647;

		int result = (int) (A * B);
		System.out
				.println("****************  INTEGER DATA TYPE  ***************");
		System.out.println("A value : " + A);
		System.out.println("B value : " + B);
		System.out.println("Result, (A*B) = " + result);
		int range = (int) Math.pow(2, 31);
		System.out.println("Range of Integer data type : " + -(range + 1)
				+ "  to  " + (range));
	}

	public static void main(String[] args) {
		JavaBasics basics = new JavaBasics();
		basics.CharMode();
		basics.ShortMode();
		basics.ByteMode();
		basics.IntMode();

	}

}
