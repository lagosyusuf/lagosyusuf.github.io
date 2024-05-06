import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println("Connecting to Client...");
            Socket socket = serverSocket.accept();
            System.out.println("Successfully Connected!");

            // Creating input and output streams
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Implement methods to exchange data
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("Client: " + input);
                writer.println(input);                
            }
            
            writer.close();
            reader.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
