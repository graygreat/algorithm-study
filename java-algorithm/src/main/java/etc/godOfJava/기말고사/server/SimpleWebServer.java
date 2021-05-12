package etc.godOfJava.기말고사.server;

import etc.godOfJava.기말고사.handler.RequestHandler;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {

    private final int BUFFER_SIZE = 2048;

    public static void main(String[] args) {
        SimpleWebServer server = new SimpleWebServer();
        int port = 9000;
        server.start(port);
    }

    public void start(int port) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            while (true) {
                Socket socket = server.accept();
                RequestHandler requestHandler = new RequestHandler(socket);
                requestHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
