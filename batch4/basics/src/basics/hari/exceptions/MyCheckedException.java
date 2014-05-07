package basics.hari.exceptions;

public class MyCheckedException extends Exception {
	
	String customMessage;
	int errorCode;
	
	public MyCheckedException(String message, String customMessage, int errorCode) {
		
		super(message);
		
		this.customMessage= customMessage;
		this.errorCode=errorCode;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ ":" + customMessage;
	}

}
