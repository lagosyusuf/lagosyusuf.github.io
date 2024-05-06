import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("java.txt");
        int data = inputStream.read();
        System.out.println("File Data:");
        while (data != -1) {
            System.out.print((char) data);
            data = inputStream.read();
        }
        inputStream.close();

        String newContent = "I love java Language!";
        FileOutputStream outputStream = new FileOutputStream("java.txt", true);
        byte[] array = newContent.getBytes();
        outputStream.write(array);
        System.out.println(" Data written Successfully!");
        outputStream.close();


    }
}
