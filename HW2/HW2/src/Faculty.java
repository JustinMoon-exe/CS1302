import java.util.*;

public class Faculty extends CollegeEmployee {
    private boolean isTenured = false;
    Scanner input = new Scanner(System.in);

    @Override
    public void setData() {
        super.setData();
        String tempTenure = "";

        // write your code here
        System.out.print("Is the Faculty Member tenured? (True/False): ");
        this.isTenured = Boolean.parseBoolean(input.next());
    }

    @Override
    public void display() {
        // write your code here
        super.display();
        System.out.print("Tenured: " + isTenured);
        System.out.println("");
    }
}
