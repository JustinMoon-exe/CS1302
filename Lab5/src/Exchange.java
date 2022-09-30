public class Exchange extends Undergraduate {
    private String country;
    private String year;

    public Exchange(String degree, String major, double gpa, int creditHours, String year, String country,
            boolean honors) {
        super(major, gpa, creditHours, honors);
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
}
