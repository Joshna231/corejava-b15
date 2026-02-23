package except;

//using Throw new keyword we can create our custom exception
//Create exception class
//Create extends to parent exception class
//Create zero arguemented constructor for no detail message
//Create arguemented constructor for specified detailed message

public class InsufficientFundsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() { // zero arg constructor for no detail message
		super(); // super constructor - ex: RuntimeException constructor
	}

	public InsufficientFundsException(String s) { // arg constructor for specified detail message
		super(s);

	}
}
