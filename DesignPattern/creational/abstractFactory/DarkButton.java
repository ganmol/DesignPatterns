package abstractFactory;

public class DarkButton implements Button{

	String desc = "Button of dark Theme";
	
	@Override
	public String getDescription() {
		return desc;
	}

}
