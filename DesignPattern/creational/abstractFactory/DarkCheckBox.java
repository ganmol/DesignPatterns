package abstractFactory;

public class DarkCheckBox implements CheckBox{

	String desc = "CheckBox of dark Theme";

	
	@Override
	public String getDescription() {
		return desc;
	}

}
