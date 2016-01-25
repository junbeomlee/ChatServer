import java.util.HashMap;

public class CommandFactory {

	private HashMap<String,Command> commandList = new HashMap<String,Command>();
	
	public CommandFactory(){
		Command loginService= new broadCastMsgCommand();
		commandList.put("LG0001", loginService);
	}
	public Command getCommand(String reqCode) {
		// TODO Auto-generated method stub
		return commandList.get(reqCode);
	}

}
