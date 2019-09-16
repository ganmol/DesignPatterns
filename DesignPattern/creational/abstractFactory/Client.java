package abstractFactory;

public class Client {

	  private Button button;
	  private CheckBox cheboxck;
	  private TextArea textArea;

	  public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public CheckBox getCheboxck() {
		return cheboxck;
	}

	public void setCheboxck(CheckBox cheboxck) {
		this.cheboxck = cheboxck;
	}

	public TextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(TextArea textArea) {
		this.textArea = textArea;
	}

	/**
	   * Creates Theme
	   */
	  public void createaApp(final ThemeFactory themeFactory) {
	    setButton(themeFactory.createButton());
	    setCheboxck(themeFactory.createCheckBox());
	    setTextArea(themeFactory.createTextArea());
	  }
	 
	  }

	  /**
	   * The factory of kingdom factories.
	   */
	   class AppMaker {

	    /**
	     * Enumeration for the different types of Kingdoms.
	     */
	    public enum ThemeType {
	      DARK, LIGHT
	    }

	    /**
	     * The factory method to create KingdomFactory concrete objects.
	     */
	    public static ThemeFactory makeFactory(ThemeType type) {
	      switch (type) {
	        case DARK:
	          return new DarkTheme();
	        case LIGHT:
	          return new LightTheme();
	        default:
	          throw new IllegalArgumentException("Theme Type not supported.");
	      }
	    }
	  


	   public static void main(String[] args) {

		    Client client = new Client();

		    client.createaApp(AppMaker.makeFactory(ThemeType.DARK));
		    System.out.println(client.getButton().getDescription());
		    System.out.println(client.getCheboxck().getDescription());
		    System.out.println(client.getTextArea().getDescription());

		    client.createaApp(AppMaker.makeFactory(ThemeType.LIGHT));
		    System.out.println(client.getButton().getDescription());
		    System.out.println(client.getCheboxck().getDescription());
		    System.out.println(client.getTextArea().getDescription());
		  }

	   }
