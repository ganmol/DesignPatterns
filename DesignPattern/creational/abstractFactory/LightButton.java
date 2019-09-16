package abstractFactory;

public class LightButton implements  Button{

String desc = "Button of light Theme";

	
	@Override
	public String getDescription() {
		return desc;
	}

}
