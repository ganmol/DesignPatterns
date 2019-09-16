package command;

public class ACOnCommand implements ICommand{

	Receiver ac;
	
	public void command(Receiver ac) {
		this.ac = new Ac();
	} 
	
	@Override
	public void execute() {
		command( this.ac);
		
	}

	@Override
	public void unExecute() {
		// TODO Auto-generated method stub
		
	}

}
