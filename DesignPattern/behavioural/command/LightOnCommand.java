package command;

public class LightOnCommand implements ICommand{

	
	Receiver light;
	
	public LightOnCommand(Receiver light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light = new Light();
		light.action();
	}

	@Override
	public void unExecute() {
		// TODO Auto-generated method stub
		
	}

}
