import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * 
 * @author junbeom
 * � client�κ��� �Դ��� ũ�� �� �ʿ䰡 ���� �� ����.
 * �����Ҷ��� socket���� �����ϴϱ� socket�� private��
 */
public class ClientAcceptThread extends Thread {

	private Socket socket;
	private DataInputStream dataInputStream;
	
	public ClientAcceptThread(){
		
	}
	public ClientAcceptThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket=socket;
		try {
			this.dataInputStream= new DataInputStream(this.socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while (true) {
			
				try {
					String message = dataInputStream.readUTF();
					JSONObject reqJSONData=JSONParserUtil.parseJSON(message);
					Controller.getInstance().execute((String)reqJSONData.get("reqCode"),reqJSONData.get("reqData"));
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
