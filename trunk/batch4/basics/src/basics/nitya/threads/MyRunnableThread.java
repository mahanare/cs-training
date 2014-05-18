package basics.nitya.threads;

public class MyRunnableThread implements Runnable{
	public void run()
	{
		for(int i=0;i<=10;i++){
			System.out.println("the value of i is :"+i);
			try{
				Thread.sleep(3);
				}catch(InterruptedException e){
					e.printStackTrace();					
				}
		}
		
	}
	
	public static void main(String[] args){
		
		MyRunnableThread r1 =new MyRunnableThread();
		
		Thread t1 =new Thread(r1);
		
		t1.start();
	}
}
