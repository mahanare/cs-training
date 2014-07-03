package in.careerscale.training.swetha.ExceptionHandling;

public class ExceptionHandling{
	public void exceptionHandling(int[] a){
		try{
		for(int i=0;i<a.length;i++)
			a[10]=20;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
		public void throwsDemo(int[] b) throws ArrayIndexOutOfBoundsException{
			for(int i=0;i<b.length;i++)
				b[10]=20;	
		}
	
	public static void main(String[] args) throws Exception{
		int[] a={10,20,30,40,50,60,70,80,50};
		int[] b={10,30,40,50,60,70,80,90,100};
	ExceptionHandling demo=new ExceptionHandling();
		demo.exceptionHandling(a);
	System.out.println("hi");
	try{
	demo.throwsDemo(b);
	}catch(Exception e){
		System.out.println(e.getMessage());
		throw e;
	}
	}

}
