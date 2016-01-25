import org.json.simple.JSONObject;

/**
 * 
 * @author junbeom
 * @params
 *  jsonObjectData:{ msg:""}
 */
public class broadCastMsgCommand implements Command{

	
	@Override
	public void run(Object jsonObjectData) {
		// TODO Auto-generated method stub
		JSONObject jsonObject=(JSONObject)jsonObjectData;
		String message = (String) jsonObject.get("msg");
		ClientManager.getInstance().sendAll(message);
	}

}
