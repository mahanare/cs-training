package basics.chaitanya;
import java.util.Scanner;
public class ChaitanyaWorld 
{
	public static void main(String[] args) 
	{
	int A,B,C;
	System.out.println("Enter A,B value:");
	Scanner in = new Scanner(System.in);
	A=in.nextInt();
	B=in.nextInt();
	C = A+B;
	System.out.println("Sum 'C':"+C);
	}
}
