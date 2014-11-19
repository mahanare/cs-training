package basics.prashanth;

import java.util.Scanner;



public class LanguageConstructs {
	
	public void IfDemo()
	{
		int a,b;
		a=80;
		b=1200;
		if(a>b)
			System.out.println("a is greater than b");
		else{
			System.out.println("b is greater than a");
		}
			
		
		
	}

	public void ForDemo()
	{
		//int i=1;
		for(int i=2;i<10;i++){
			System.out.println("I value is " +i);
		}

	}
	public void WhileDemo()
	{
		int x=5;
		while (x<10){
			System.out.println("\n x value is " +x);
			x++;
		}	
	}
		
		public void DowhileDemo()
		{
			int x=5;
			do{
				System.out.println("\n x value is " +x);
				x++;
			}while(x<5)	;
				
	}
		public void Multiarrays()
		{
			
			}	
		public void SwitchDemo()
		{
			char grade;
			grade ='C';
			switch(grade)
		      {
		         case 'A' :
		            System.out.println("Excellent!"); 
		            break;
		         case 'B' :
		        	 System.out.println("good");
		        	 break;
		         case 'C' :
		            System.out.println("Well done");
		            break;
		         case 'D' :
		            System.out.println("You passed");
		            break;
		         case 'F' :
		            System.out.println("Better try again");
		            break;
		         default :
		            System.out.println("Invalid grade");
		      }
		      System.out.println("Your grade is " + grade);
		   }
		
	public static void main(String[] args) {
		LanguageConstructs demo = new LanguageConstructs();
		demo.IfDemo();
		demo.ForDemo();
		demo.WhileDemo();
		demo.DowhileDemo();
		demo.Multiarrays();
		demo.SwitchDemo();
	}

}
