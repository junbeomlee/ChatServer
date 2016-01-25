import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	
	private ServerSocket serverSocket;
	private ServerAccepter serverAccepter;
	
	public Server(){
		
            try {
				serverSocket = new ServerSocket(7777);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            serverAccepter= new ServerAccepter(serverSocket);
            serverAccepter.start();
	}
}
