package in.careerscale.training.swetha;

public class Box {
double width;
double height;
double depth;
Box(double w,double h,double d){
	width=w;
	height=h;
	depth=d;
}
Box(){
	width=-1;
	height=-1;
	depth=-1;
}
Box(double l){
	width=height=depth=l;
}
public double volume(){
	return width*height*depth;
}
}
class ConstructorImplementation{
	public static void main(String args[]){
	Box box1= new Box(10,20,30);
	Box box2= new Box(10);
	Box box3= new Box();
	
	double vol;
	
	vol= box1.volume();
	System.out.println("box1 volume is"+vol);
	
	vol= box2.volume();
	System.out.println("box2 volume is"+vol);
	
	vol= box3.volume();
	System.out.println("box3 volume is"+vol);
}
}