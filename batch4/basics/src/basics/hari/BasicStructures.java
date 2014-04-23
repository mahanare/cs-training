package basics.hari;

import java.util.Scanner;

public class BasicStructures {

	public BasicStructures(){
		
	}
	public void ifElseDemo(int id){
		
		if(id == 0){
			System.out.println("Id value is 0");
		}else 	if(id == 1){
			System.out.println("Id value is 1");
		}
		else 	if(id == 2){
			System.out.println("Id value is 2");
		//////
		/////
		}
		else 	if(id == 3){
			System.out.println("Id value is 3");
		}else 	if(id == 4){
			System.out.println("Id value is 4");
		} else{
			System.out.println("You have entered something else (not 0 to 4");
		}
		
		
		if( id == 5)
			System.out.println("YOu entered 5");
		System.out.println("This line gets printed always as if without bracket will only honour one line after if condition.");
		
		
	}
	
	public void switchDemo(int value){
		
		switch(value){
		case 0:
			System.out.println("Id value is 0");
			break;
		case 1:
			System.out.println("Id value is 1");
			break;
		case 2:
			System.out.println("Id value is 2");
			break;
		case 3:
			System.out.println("Id value is 3");
			break;
		case 4:
			System.out.println("Id value is 4");
			break;
		default:
			System.out.println("You have entered something else (not 0 to 4");
			
		}
		
	
		
	}
	
	public void forDemo(){
		
		//i++ equal to i = i + 1
		//for( initialization; termination; increment condition)

		for (int i = 0; i < 10; i++) {
			if(i == 5)
				continue;
			System.out.println("i value is :" + i);
			
		}
		
		int numbers[] ={1,4,5,6,10};
		
		/*
		for(int i=0; i < numbers.length; i++{
			
		}
		*/
		
		for (int number : numbers) {
			System.out.println(number);
		}
		/**
		for(; ;){
			System.out.println("What will help?");
		}
		**/
		
		for( int i =0;  i>=0; i++){
			System.out.println("What will happen here?");
		}
		
	}
	
	
	public void whileDemo(){
		
		while(true){
			System.out.println("What will happen?");
		}
	}
	
	public void doWhileDemo(){
		int i =11;
		do{
			System.out.println("i value : " + i);
			
		}while(i <10);
		
	}
	
	public static void main(String[] args) {
		
		BasicStructures basic = new BasicStructures();
		//basic.forDemo();
		basic.doWhileDemo();
		
		Scanner input = new Scanner (System.in);
		
		
		int value =-1;
		while(value != -1){
			System.out.println("Please enter an int value between 0 and 5. enter -1 to exit");
			value= input.nextInt();
			//basic.ifElseDemo(value);
			basic.switchDemo(value);
			
		}
		
		input.close();

	}

}
