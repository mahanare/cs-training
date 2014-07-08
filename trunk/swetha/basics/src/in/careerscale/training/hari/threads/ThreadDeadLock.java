package in.careerscale.training.hari.threads;

public class ThreadDeadLock {

	
	class FirstThread extends Thread{
		SharedObjectA s1;
		SharedObjectB s2;
		
		public FirstThread(SharedObjectA s1, SharedObjectB s2) {
			this.s1=s1;
			this.s2 = s2;
		}

		@Override
		public void run() {
			try{
			synchronized (s1) {
				
				s1.displayNumbers(1);
				sleep(2000);
				synchronized (s2) {
					sleep(1000);
					s2.displayNumbers(1);				
					
				}
				
		}
			}catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		}
		}
	
	class SecondThread extends Thread{
		SharedObjectA s1;
		SharedObjectB s2;
		
		public SecondThread(SharedObjectA s1, SharedObjectB s2) {
			this.s1=s1;
			this.s2 = s2;
		}

		@Override
		public void run() {
			
			try{
			synchronized (s1) {
				
				s1.displayNumbers(2);
				sleep(2000);
				synchronized (s2) {
					sleep(1000);
					s2.displayNumbers(2);
					
					
				}
				
			}
		
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	}
	
	class SharedObjectA {
		private int id;
		public SharedObjectA(int id){
			System.out.println("new shared object with ID " + id);
			this.id =id;
		}
		
		public void displayNumbers(int num){
			int num1=num;
			for(int i=0; i < 10; i++){
				System.out.println("SharedObject with id " + num1 + "  -> " + i);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		private void sayHello(){
			System.out.println("Hello Friend");
		}
		
	}
	
	class SharedObjectB{
		private int id;
		SharedObjectB(int id){
			this.id = id;
			System.out.println("new shared object 1 with ID " + id);
		}
		public void displayNumbers(int num){
			int num1=num;
			for(int i=10; i < 20; i++){
				System.out.println("SharedObject1 with id " + num1 + "  -> " + i);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

	}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadDeadLock m = new ThreadDeadLock();
		
		SharedObjectA s1 = m.new SharedObjectA(1);
		
		SharedObjectB s2 = m.new SharedObjectB(2);
		
		FirstThread t1 = m.new FirstThread(s1,s2);
		
		SecondThread t2 = m.new SecondThread(s1,s2);
		t1.start();
		t2.start();
			
		}
	
	}


