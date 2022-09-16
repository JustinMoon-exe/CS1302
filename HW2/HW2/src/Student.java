import java.util.*;

public class Student extends Person {
    private String major;
    private double gpa;
    Scanner input = new Scanner(System.in);

    @Override
    public void setData() {
        super.setData();
        String tempGPA = "";
        // write your code here
        System.out.print("Enter the Student's Major: ");
        this.major = input.next();
        System.out.print("Enter the Student's GPA: ");
        this.gpa = Double.parseDouble(input.next());
    }

    @Override
    public void display() {
        // write your code here
        super.display();
        System.out.println(major + ", " + gpa);
    }
}
