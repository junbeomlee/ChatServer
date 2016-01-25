import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ClientManager {
	
	private static ClientManager clientManager = new ClientManager();
	
	private Map<Socket,Client> clientList;
	
	private ClientManager(){
		clientList = new HashMap<Socket,Client>();
	}
	public static ClientManager getInstance(){
		return clientManager;
	}
	public void add(Client client,Socket socket) {
		// TODO Auto-generated method stub
		this.clientList.put(socket, client);
	}
	
	public void sendAll(String message){
		for( Socket key : clientList.keySet() ){
            clientList.get("key").sendMessage(message);
        }
	}
	
	
}
