package command;

public class LightInvoker implements Invoker{
	
	ICommand lightOnCommand;

	public LightInvoker(ICommand lightOnCommand) {
		super();
		this.lightOnCommand = lightOnCommand;
	}
	
	public void setCommand(ICommand lightOnCommand) {
		lightOnCommand.execute();
	}

}
