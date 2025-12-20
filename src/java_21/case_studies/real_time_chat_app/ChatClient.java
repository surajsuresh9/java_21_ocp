package java_21.case_studies.real_time_chat_app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to chat server");

            Thread reader = new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println("Received: " + message);
                    }
                } catch (Exception e) {
                    System.out.println("Connection closed");
                }
            });
            reader.start(); //

            String userInput;
            while ((userInput = console.readLine()) != null) {
                out.println(userInput); //
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
