package java_21.case_studies.multi_threaded_web_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedWebServer {
    private final int port;
    private final ExecutorService service = Executors.newFixedThreadPool(10);

    public MultiThreadedWebServer(int port) {
        this.port = port;
    }

    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server running on port: " + port);

            while (!service.isShutdown()) {
                Socket socket = serverSocket.accept();
                service.execute(new ClientHandler(socket));
            }

        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        } finally {
            service.shutdown();
        }
    }
}
