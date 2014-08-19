package in.careerscale.training.hari;

public class CalcException extends Exception {
	
	public CalcException(String error){
		super(error);
	}
	
	public CalcException(String errorMessage, Throwable exception){
		super(errorMessage, exception);
	}

}
