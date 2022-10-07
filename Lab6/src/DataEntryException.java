public class DataEntryException extends Exception {
	// create constructor to accept two paramters
	// use 'super' to indicate custom exception with
	// what is wrong type of input (ID or Age)
	// and the actual value itself
	public DataEntryException(int id, int age) {
		super("Is an Invalid Entry:\n");
		if (id > 999 || id < 0) {
			System.out.print("ID input: " + id);

		}
		if (age < 0 || age > 119) {
			System.out.print("Age input: " + age);
		}
	}

}