package basics.nitya.deadlocks;

public class ThreadDemo {
	
	public static void main(String[] args){
		SharedRes1 s1 =new SharedRes1();
		SharedRes2 s2 = new SharedRes2();
		
		Thread1 t1=new Thread1(1,s1,s2);
		Thread2 t2=new Thread2(2,s1,s2);
		
		t1.start();
		t2.start();
		
	}

}
