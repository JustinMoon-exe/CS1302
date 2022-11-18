public class BankAccount {
	private double balance;

	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		balance = 0;
	}

	/**
	 * Deposits money into the bank account.
	 */
	public synchronized void deposit(double amount) {
		System.out.print("Depositing " + amount);
		double newBalance = balance + amount;
		System.out.println(", new balance is " + newBalance);
		balance = newBalance;
		notifyAll();
	}

	/**
	 * Withdraws money from the bank account.
	 */
	public synchronized void withdraw(double amount) throws InterruptedException {
		while (balance < amount) {
			System.out.println("** Balance " + balance + " is < amount " + amount + " now waiting...");
			wait();
		}
		System.out.print("Withdrawing " + amount);
		double newBalance = balance - amount;
		System.out.println(", new balance is " + newBalance);
		balance = newBalance;
	}

	/**
	 * Gets the current balance of the bank account.
	 */
	public double getBalance() {
		return balance;
	}
}
