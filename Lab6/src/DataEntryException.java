public class DataEntryException extends Exception {
	// create constructor to accept two paramters
	// use 'super' to indicate custom exception with
	// what is wrong type of input (ID or Age)
	// and the actual value itself
	public DataEntryException(String msg, int val) {
		super(msg + val);
		
		
	}

}