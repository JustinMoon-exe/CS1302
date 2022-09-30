public class Graduate extends Student {
    protected String degree;
    protected String concentration;
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

    @Override
    public String toString(){
        return("Major:" + major + " Concentration:" + concentration + " Years:" + years);
    }
}
