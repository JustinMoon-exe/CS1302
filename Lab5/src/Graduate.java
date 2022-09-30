public class Graduate extends Student {
    private String degree;
    private String concentration;
    private int years;

    public Graduate(String degree, int years, double gpa, String major, String concentration, int creditHours) {
        super(major, gpa, creditHours);
        this.major = major;
        this.degree = degree;
        this.years = years;
        this.gpa = gpa;
        this.concentration = concentration;
    }

    public int getYears() {
        return (this.years);
    }

    public String getConcentration() {
        return (this.concentration);
    }
}
