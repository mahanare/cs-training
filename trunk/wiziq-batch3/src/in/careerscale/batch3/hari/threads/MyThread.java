package in.careerscale.batch3.hari.threads;

public class MyThread  extends Thread{

	int id;
	
	public MyThread(int id){
		this.id = id;
	}
	@Override
	public void run(){
		
		for(int i=0; i<10; i++){
			System.out.println("Thread id is : " + id  + " and i value : " + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}
