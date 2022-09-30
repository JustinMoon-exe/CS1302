public class TestStudent {
    public static void main(String[] args) throws Exception {

        Undergraduate Alex = new Undergraduate("Bioinformatics", 3.9, 54, true);
        Graduate Mary = new Graduate("Masters", 1, 3.91, "Computer Science", "Data Science", 0);

        System.out.println(Alex.toString());
        System.out.println(Mary.toString());

        Exchange YingShu = new Exchange("Graduate", "Cybersecurity", 3.2, 160, "Fall 2022", "Taiwan", false);

        System.out.println(YingShu.toString());
    }
}
