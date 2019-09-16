package command;

public class Client {

	public static void main(String[] args) {
		
		
		// Invoker -> ICommand -> LightOnCommand -> Receiver -> Light
		
		ICommand lightOnCommand = new LightOnCommand(new Light());

		LightInvoker lightInvoker  = new LightInvoker(lightOnCommand);
		
		lightInvoker.setCommand(lightOnCommand);
		
		
		
		
	}

}
