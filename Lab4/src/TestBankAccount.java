public class TestBankAccount {
    public static void main(String[] args) throws Exception {
        BankAccount B1 = new BankAccount("Justin", 200.00);
        B1.deposit(500.00);
        System.out.println(B1.toString());
        B1.withdraw(300.00);
        System.out.println(B1.toString());

        BankAccount B2 = new BankAccount();
        System.out.println(B2.toString());
        B2.namer("John");
        B2.balencer(350.00);
        System.out.println(B2.toString());
    }

}
