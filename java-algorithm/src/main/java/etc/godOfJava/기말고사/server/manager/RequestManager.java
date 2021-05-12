package etc.godOfJava.기말고사.server.manager;

import etc.godOfJava.기말고사.RequestDTO;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.*;

public class RequestManager {
    private final int BUFFER_SIZE = 2048;
    private Socket socket;

    public RequestManager(Socket socket) {
        this.socket = socket;
    }

    public RequestDTO readRequest() throws IOException {
        RequestDTO requestDTO = new RequestDTO();
        InputStream request = new BufferedInputStream(socket.getInputStream());
        byte[] receivedBytes = new byte[BUFFER_SIZE];
        request.read(receivedBytes);
        System.out.println(new String(receivedBytes));
        String[] requestData = new String(receivedBytes).trim().split("\\n");
        requestDTO.setUri(requestData[0].split(" ")[1]);
        System.out.println("------------");

        return requestDTO;
    }

}
