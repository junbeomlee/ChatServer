import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONParserUtil {
	public static JSONObject parseJSON(String message){
		
		JSONObject jsonObject = null;
		try{
			
		JSONParser jsonParser = new JSONParser();
        jsonObject = (JSONObject) jsonParser.parse(message);
        
		}catch(Exception e){
			e.printStackTrace();
		}
        
        return jsonObject;
	}
}
