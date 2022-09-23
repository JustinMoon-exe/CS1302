Write a Java class called BankAccount (Parts of the code is given below), which has two private fields: name (String) and balance (double), and three methods: deposit(double amount), withdraw(double amount) and toString(). Write the necessary constructors, accessor methods and mutator methods. The deposit() method adds the amount to the account causing the current balance to increase, withdraw() method subtracts the amount causing the current balance to decrease and toString() method should return the name and the current balance separated by acomma. For example, if you print out the object with name Jake and balance 40.0 then it should print: Jake, $40.00

public class BankAccount {
private String name;
...
public void deposit(double amount) {
balance = balance + amount;
}
public void withdraw(double amount) {
balance = balance – amount;
}
public BankAccount(){}
public BankAccount(String name_new, double bal_new) {
...
}
...
public String toString()
...
return(...);
}
}

2. Write a test java program called TestBankAccount that creates a BankAccount object called B1 and initializes the name and balance at the time of instantiating the object using the default constructor (any name and $200 balance).

3. Call the deposit() method to add $500 to B1 and call the toString() method to print the current balance using System.out.println() from the main().

4. Next, call the withdraw() method to subtract $300 from this account and print B1 using System.out.println() from the main().

5. Create another object called B2 without initializing it and display the name and current balance for this object using System.out.println(). Finally, use the accessor/mutator methods to assign any name and $350 balance to B2. Print the object B2, using System.out.println().
