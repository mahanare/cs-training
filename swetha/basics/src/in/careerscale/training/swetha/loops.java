package in.careerscale.training.swetha;

public class loops
{
public void forloop(){
	int i;
	
	for (i=0;i<10;i++)
	{
		System.out.println("I am "+i);
	
	}
}
public void switchcase(){
	for(int j=0;j<5;j++)
	{
		switch(j){
		case 0:
			System.out.println("Number is"+j);
			break;
		case 1:
			System.out.println("Number is"+j);
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Numbers are more than 1");
		    break;
		    default: 
		    	System.out.println("goodbye!!");
		
		}
	}
	
	
}
public void ifstatement(){
	int a=10;
	int b=9;
	if(a<b){
		System.out.println("a is smaller than b");
	}
		else if(a>b){
			System.out.println("a is greater than b");
		}
			else{
				System.out.println("a equal to b");
			}
	
}
}