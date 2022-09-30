public class BankAccount {
    private String name;
    private double balance;
    
    public BankAccount(String name_new, double bal_new) {
        this.name = name_new;
        this.balance = bal_new;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public String toString() {
        return (name + ", $" + balance);
    }

    public void namer(String name_new) {
        this.name = name_new;
    }

    public void balencer(Double bal_new) {
        this.balance = bal_new;
    }

    public BankAccount() {
    }
}