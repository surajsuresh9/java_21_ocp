package java_21.case_studies.multi_threaded_web_server;

public class WebServerTest {
    public static void main(String[] args) {
        MultiThreadedWebServer server = new MultiThreadedWebServer(8080);
        Thread serverThread = new Thread(server::startServer);
        serverThread.start();
        try {
            serverThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
