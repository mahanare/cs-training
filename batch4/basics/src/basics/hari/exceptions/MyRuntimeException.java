package basics.hari.exceptions;

public class MyRuntimeException extends RuntimeException {
	
	String customMessage;
	int errorCode;
	
	public MyRuntimeException(String message, String customMessage, int errorCode) {
		
		super(message);
		
		this.customMessage= customMessage;
		this.errorCode=errorCode;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ ":" + customMessage;
	}

}
