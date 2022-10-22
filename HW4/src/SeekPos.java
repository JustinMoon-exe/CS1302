import java.io.*;
import java.util.*;

public class SeekPos {
    public static void main(String args[]) throws IOException
    {
        FileInputStream in = null;
        // Use a Scanner to read the user input as an int.
        Scanner input = new Scanner(System.in);
        String infile;
        int seek=0,read=0;
        boolean good;
        //Prompt the user to input a filename.
        System.out.print("Input filename: ");
        infile = input.nextLine();
        do {
            good = true;
            try {
                //Prompt the user to input a seek position
                System.out.print("Input seek position: ");
                seek = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please enter valid integer value.");
                good = false;
            }
        } while (!good);    
        read = 20;
        try {
            in = new FileInputStream(infile);
            in.skip(seek);
            byte[] text=new byte[read];
            in.read(text,0,read);
            String s = new String(text);
            System.out.println(infile+" read "+read+" chars from "+seek+" position. :"+s);
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
    }
}