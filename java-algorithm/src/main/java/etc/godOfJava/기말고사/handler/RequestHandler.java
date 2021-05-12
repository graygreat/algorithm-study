package etc.godOfJava.기말고사.handler;

import etc.godOfJava.기말고사.RequestDTO;
import etc.godOfJava.기말고사.server.manager.RequestManager;
import etc.godOfJava.기말고사.server.manager.ResponseManager;

import java.io.IOException;
import java.net.Socket;

public class RequestHandler extends Thread {
    private Socket socket;

    public RequestHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        RequestManager requestManager = new RequestManager(socket);
        try {
            RequestDTO request = requestManager.readRequest();
            ResponseManager responseManager = new ResponseManager(socket, request);
            responseManager.writeResponse();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
