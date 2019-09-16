package abstractFactory;

public class LightTextArea implements TextArea{

String desc = "TextArea of light Theme";

	
	@Override
	public String getDescription() {
		return desc;
	}

}
