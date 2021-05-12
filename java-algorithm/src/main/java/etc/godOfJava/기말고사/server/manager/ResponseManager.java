package etc.godOfJava.기말고사.server.manager;

import etc.godOfJava.기말고사.RequestDTO;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

public class ResponseManager {
    private Socket socket;
    private RequestDTO requestDTO;

    public ResponseManager(Socket socket, RequestDTO requestDTO) {
        this.socket = socket;
        this.requestDTO = requestDTO;
    }

    public void writeResponse() throws IOException {
        PrintStream response = new PrintStream(socket.getOutputStream());
        response.println("HTTP/1.1 200 OK");
        response.println("Content-type: text/html");
        response.println();
        if (requestDTO.getUri().equals("/today")) {
            response.print(new Date(System.currentTimeMillis()));
        } else {
            response.println("It is working");
        }
        response.flush();
        response.close();
    }
}
