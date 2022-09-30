public class Exchange extends Graduate {
    private String country;
    private String year;

    public Exchange(String degree, String major, double gpa, int creditHours, String year, String country,
            boolean honors) {
        super(degree,2, gpa, major, "null", creditHours);
        this.major = major;
        this.gpa = gpa;
        this.creditHours = creditHours;
        this.country = country;
        this.year = year;

    }

    public String getYear() {
        return (this.year);
    }

    public String getCountry() {
        return (this.country);
    }

    @Override
    public String toString(){
        return("Degree:"+ degree + " Major:" + major + " GPA:" + gpa + " Credit Hours:" + creditHours + " Country:" + country);
    }
}

