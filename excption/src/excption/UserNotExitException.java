package excption;

public class UserNotExitException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserNotExitException(){
	}
	public UserNotExitException(String s){
		super(s);
	}

}
