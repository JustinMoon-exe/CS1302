import java.util.*;

public class CollegeEmployee extends Person {
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);

    @Override
    public void setData() {
        super.setData();
        String tempSalary = "";
        // write your code here
        System.out.print("Enter the Employee's SSN: ");
        this.ssn = input.next();
        System.out.print("Enter the Employee's annualSalary: ");
        this.annualSalary = Double.parseDouble(input.next());
        System.out.print("Enter the Employee's Department: ");
        this.dept = input.next();
    }

    @Override
    public void display() {
        // write your code here
        super.display();
        System.out.println(ssn + ", " + annualSalary + ", " + dept);
    }
}
