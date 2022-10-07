import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class ThrowCourseException {
  public static void main(String[] args) {
    int numRecords = 6;
    Course[] courses = new Course[numRecords];
    String[] depts = { "CIS", "ACC", "ENGLISH", "BB", "CSC", "CSC" };
    int[] courseNums = { 110, 200, 100, 700, 4351, 3350 };
    double[] credits = { 3, 4, 7.5, 0, 100, 2.5 };
    for (int i = 0; i < numRecords; i++)
      courses[i] = new Course();
    // Your code goes here
    int errc = 0;
    // loop how many course 'records'
    for (int i = 0; i < numRecords; i++) {
      try {
        courses[i] = new Course(depts[i], courseNums[i], credits[i]);
      } catch (CourseException e) {
        System.out.println(e.getMessage());
        System.arraycopy(courses, i + 1, courses, i, courses.length - i - 1);
        ;
        errc++;

      }
    }
    // try catch when instaniation with "depts[x], coursNums[x], credits[x]"

    // print each "course record values"

    System.out.println("______________________\n");
    for (int i = 0; i < courses.length - errc; i++) {
      System.out.print(courses[i].toString());
    }

  }

}
