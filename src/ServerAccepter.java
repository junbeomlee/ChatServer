import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAccepter extends Thread{
	
	private ServerSocket serverSocket;
	
	public ServerAccepter(){
		
	}
	public ServerAccepter(ServerSocket serverSocket) {
		this.serverSocket=serverSocket;
	}
	@Override
    public void run() {
        while (true) {
            try {
                
                Socket socket = serverSocket.accept();
                
                ClientAcceptThread clientAcceptThread= new ClientAcceptThread(socket);
                clientAcceptThread.start();
                Client client = new Client(socket);
                ClientManager.getInstance().add(client,socket);
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
