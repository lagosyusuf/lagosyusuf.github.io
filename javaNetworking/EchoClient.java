import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) {
        try {
            System.out.println("Connecting to Server...");
            Socket socket = new Socket("10.7.28.99", 6000);
            System.out.println("Successfully Connected!");

            // Create input and output streams
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            Scanner scan = new Scanner(System.in);

            // Create the standard input stream that accept user input from the keyboard
            BufferedReader stdReader = new BufferedReader(new  InputStreamReader(System.in));

            // Implementing method to exchange data
            String userInput;
            System.out.println("Type Message: ");
            while ((userInput = stdReader.readLine()) != null) {
                writer.println(userInput);
                System.out.println("Server: " + reader.readLine());
            } 
            

            socket.close();
            scan.close();
            reader.close();
            writer.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}