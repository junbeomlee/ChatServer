
public class Controller {
	private static Controller controller = new Controller();
	private CommandFactory commandFactory = new CommandFactory();
	public Controller(){
		
	}
	public static Controller getInstance(){
		return controller;
	}
	public void sendConnectionList(){
		
	}
	public void execute(String reqCode, Object reqDataJsonObject) {
		Command command=commandFactory.getCommand(reqCode);
		command.run(reqDataJsonObject);
	}
}
