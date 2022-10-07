public class CourseException extends Exception {
    public CourseException(String s, int num, double credits) {
        super("Course not created due to invalid details" + "\nDepartment name: " + s
                + "\nCourse number: " + num + "\nCredits: " + credits + "\n");

    }
}
