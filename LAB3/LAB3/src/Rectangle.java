import java.util.*;

public class Rectangle {
    public Double x;
    public Double y;
    public Double height;
    public Double width;
    // public Double[][] rect = new Double[2][2];
    Scanner input = new Scanner(System.in);

    public void setRect() {
        System.out.print("Enter X coordinate: ");
        this.x = Double.parseDouble(input.next());
        System.out.print("Enter Y coordinate: ");
        this.y = Double.parseDouble(input.next());
        System.out.print("Enter height: ");
        this.height = Double.parseDouble(input.next());
        System.out.print("Enter width: ");
        this.width = Double.parseDouble(input.next());

        // for(int i = 0; i < rect.length; i++ ){
        // for(int j = 0; j < rect[0].length; j++){
        // this.rect[i][j] =
        // }
        // }

    }

    @Override
    public String toString() {
        return ("Rectangle" + " [x=" + (x) + " ," + "y=" + (y) + " ," + "height=" + (height) + " ," + "width=" + (width)
                + "]" + " Area is " + (height * width));
    }

    public Double coordy(int quad) {
        if (quad == 1 || quad == 2) {
            return (y + height);
        } else {
            return (y);
        }
    }

    public Double coordx(int quad) {
        if (quad == 1 || quad == 4) {
            return (x + width);
        } else {
            return (x);
        }
    }

}
