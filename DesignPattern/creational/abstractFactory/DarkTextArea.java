package abstractFactory;

public class DarkTextArea implements TextArea{

	String desc = "Text area of dark Theme";

	
	@Override
	public String getDescription() {
		return desc;
	}

}
