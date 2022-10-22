import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class SeekPosition {
    public static void main(String[] args) throws IOException {
        // Write your code here
        Scanner input = new Scanner(System.in);

        String file = "";
        int seekpos = 0;

        System.out.print("Please Enter filename: ");
        file = input.nextLine();
        System.out.print("Please Enter Seek position: ");
        seekpos = input.nextInt();

        // code rewrite
        RandomAccessFile reader;
        try {
            reader = new RandomAccessFile("src/" + file, "r");
            FileChannel channel = reader.getChannel();
            ByteBuffer buff = ByteBuffer.allocate(10);
            int noOfBytesRead = channel.read(buff, seekpos);
            String fileContent = new String(buff.array());
            System.out.println("Text from file " + file + " : " + fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}