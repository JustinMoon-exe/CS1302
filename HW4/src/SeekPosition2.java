import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class SeekPosition2 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        Scanner input = new Scanner(System.in);

        String file = "";
        int seekpos = 0;
        int len = 0;

        System.out.print("Please Enter filename: ");
        file = input.nextLine();
        System.out.print("Please enter seek position: ");
        seekpos = input.nextInt();
        System.out.print("Please enter the number of characters to display: ");
        len = input.nextInt();

        // code rewrite
        RandomAccessFile reader;
        try {
            reader = new RandomAccessFile("src/" + file, "r");
            FileChannel channel = reader.getChannel();
            ByteBuffer buff = ByteBuffer.allocate(len);
            int noOfBytesRead = channel.read(buff, seekpos);
            String fileContent = new String(buff.array());
            System.out.println("Text from file " + file + " : " + fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}