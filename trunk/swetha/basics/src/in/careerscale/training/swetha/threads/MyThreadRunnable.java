package in.careerscale.training.swetha.threads;

public class MyThreadRunnable implements Runnable {
	int id;
	MyThreadRunnable(int id){
		this.id=id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++){
		System.out.println("mythread"+id+"value"+i);
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args){
			MyThreadRunnable runnable1=new MyThreadRunnable(1);
			MyThreadRunnable runnable2=new MyThreadRunnable(2);

			Thread thread1=new Thread(runnable1);
			Thread thread2=new Thread(runnable2);
			
			thread1.start();
			thread2.start();
	}

}
