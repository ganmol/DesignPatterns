package abstractFactory;

public class LightCheckBox implements CheckBox{

String desc = "CheckBox of light Theme";

	
	@Override
	public String getDescription() {
		return desc;
	}

}
