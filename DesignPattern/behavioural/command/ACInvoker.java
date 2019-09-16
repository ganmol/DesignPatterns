package command;

public class ACInvoker implements Invoker{

	ICommand acCommand;

	public ACInvoker(ICommand acCommand) {
		super();
		this.acCommand = acCommand;
	}

}
