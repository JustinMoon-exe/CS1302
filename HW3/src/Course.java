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
    if (department.length() != 3 || courseNumber < 100 || courseNumber > 499 || credits < .5 || credits > 6) {
      throw new CourseException(department, courseNumber, credits);
    } else {
      System.out.println("Course is added successfully \nDepartment name: " + department + "\nCourse number: "
          + courseNumber + "\ncredits: " + credits + "\n");
    }

  }

  public String toString() {
    return (department + " " + courseNumber + ": " + credits + " credits  \n");
  }
}
