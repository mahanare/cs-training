package in.careerscale.training.hari;

public class Calculator {
	
	public int add(int a, int b) throws CalcException{
		if(a > 100 || b > 100){
			throw new CalcException("Numbers should be less than 100");
		}
		return a+b;
	}

}
