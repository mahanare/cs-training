package basics.nitya.threads;

public class Threads extends Thread{
	
	/*public void run1(){
		
		for(int i=0;i<10;i++){
			System.out.println("the value of i is"+i);
			try{
				sleep(2);
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
				
	}*/
	
	public void run(){	
		int j=0;
		while(j<=20){
			j++;
			System.out.println("j is incremented"+j);
			try{
			sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			}
		}
public static void main(String[] args){
	
	Threads t1=new Threads();
	//Threads t2=new Threads();
	
	t1.start();
	//t2.start();
	
}


}


	


