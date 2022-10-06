public class Course {
    String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;
    public Course() {
      department = "";
      courseNumber = 0;
      credits = 0;
    }
    public Course(String dept, int num, double creditValue) throws CourseException {
      boolean isBad = false;
      String msg = "";
      department = dept;
      courseNumber = num;
      credits = creditValue;
      
        // Write your code here
    }
    public String toString() {
        return(department + " " + courseNumber + ": " + credits + " credits");
    }
}
