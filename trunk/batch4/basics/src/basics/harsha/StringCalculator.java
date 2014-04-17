package basics.harsha;

import java.util.Scanner;

public class StringCalculator {

	 public static String add(String str1, String str2)
	 {
		 String result = str1 +str2;
		 return result;
	 }

	 public static String remove(String str1, String str2)
	 {
		 
		 if(str1.contains(str2))
		 {
			str1= str1.replace(str2,"");
			 return str1;
		 }
		 else
			 return str1;
	 }

	 public static String findReplace(String str1, String str2, String str3)
	 {
		 if(str1.contains(str2))
		 {
			 
			str1 =  str1.replace(str2,str3);
			 return str1;
		 }
		 else
			 return str1;
	 }
	 
	 
	public static void main(String[] args) {
		String str1=null,str2,str3,result;
		System.out.println("Choose an operation: ");
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. Find and Replace");
		System.out.println("4. Exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Enter two Strings");
			str1=sc.next();
			str2 = sc.next();
			result = add(str1, str2);
			System.out.println("Result is " + result);
			break;
		case 2:
			System.out.println("Enter two Strings");
			str1=sc.next();
			str2 = sc.next();
			result = remove(str1, str2);
			System.out.println("Result is " + result);
			break;
		case 3:
			System.out.println("Enter a sentence");
			sc.nextLine();
		    str1 = sc.nextLine();
			System.out.println("Enter a string to find");
			str2 = sc.next();
			System.out.println("Enter a string to replace");
			str3 = sc.next();
			result = findReplace(str1, str2,str3);
			System.out.println("Result is " + result);
			break;
		default:
				System.out.println("Invalid Case");
				break;
		
		}
		sc.close();
	}

}
