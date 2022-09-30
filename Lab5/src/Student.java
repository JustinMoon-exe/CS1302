public class Student {
    protected String major;
    protected double gpa;
    protected int creditHours;

    public Student(String major, double gpa, int creditHours) {
        this.major = major;
        this.gpa = gpa;
        this.creditHours = creditHours;
    }

    public double getGpa() {
        return this.gpa;
    }

    public String getYear() {
        if (this.creditHours < 32) {
            return ("Freshman");
        } else if (this.creditHours < 64) {
            return ("Sophmore");
        } else if (this.creditHours < 96) {
            return ("Junior");
        } else {
            return ("Senior");
        }
    }
}
