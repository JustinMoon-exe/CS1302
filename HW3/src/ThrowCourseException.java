public class ThrowCourseException {
    public static void main(String[] args) {
        int numRecords=6;
        Course[] courses = new Course[numRecords];
        String[] depts = {"CIS", "ACC", "ENGLISH", "BB", "CSC", "CSC"};
        int[] courseNums = {110, 200, 100, 700, 4351, 3350};
        double[] credits ={3, 4, 7.5, 0, 100, 2.5};
        for(int i = 0;  i <numRecords; i++)
           courses[i] = new Course();
        // Your code goes here
        // loop how many course 'records'
          // try catch when instaniation with "depts[x], coursNums[x], credits[x]"
    
        
        // print eeach "course record values"
    }
}