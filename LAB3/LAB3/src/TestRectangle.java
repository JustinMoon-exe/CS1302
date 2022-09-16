public class TestRectangle {

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.setRect();
        Rectangle R2 = new Rectangle();
        R2.setRect();

        System.out.println(R1.toString());
        System.out.println(R2.toString());
        System.out.println(IsOverlap(R1, R2));
    }

    public static boolean IsOverlap(Rectangle R1, Rectangle R2) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (R2.coordx(j) <= R1.coordx(i) && R2.coordx(j) >= R1.coordx(i + 2)) {
                    if (R2.coordy(j) <= R1.coordy(i) && R2.coordy(j) >= R1.coordy(i + 2)) {
                        return true;
                    }
                }
            }
        }
        return (false);
    }

}
