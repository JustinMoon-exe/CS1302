public class DepositRunnable implements Runnable {
	private static final int DELAY = 1;
	private BankAccount account;
	private double amount;
	private int count;

	/**
	Constructs a deposit runnable.
	 */
	public DepositRunnable(BankAccount anAccount, double anAmount,int aCount) {
		account = anAccount; amount = anAmount; count = aCount;
	}
	
	public void run() {
		try
		{
			for (int i = 1; i <= count; i++) {
				account.deposit(this.amount);
				Thread.sleep(DELAY); }
		}
		catch (InterruptedException exception) {
			
		} 
	}
}