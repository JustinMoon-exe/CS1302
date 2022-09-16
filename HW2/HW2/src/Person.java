import java.util.*;

public class Person {
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;
    Scanner input = new Scanner(System.in);

    public void setData() {
        String tempGrade = "";
        System.out.print("Enter the Person's First Name: ");
        this.firstName = input.next();
        System.out.print("Enter the Person's Last Name: ");
        this.lastName = input.next();
        System.out.print("Enter the Person's Address: ");
        this.address = input.next();
        System.out.print("Enter the Person's zip: ");
        this.zip = input.next();
        System.out.print("Enter the Person's Phone Number: ");
        this.phone = input.next();
        // write your code here

    }

    public void display() {
        // write your code here

        System.out.print(firstName + ", " + lastName + ", " + address + ", " + zip + ", " + phone + ", ");
    }
}
