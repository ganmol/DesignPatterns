package observer;

public class Subscriber implements Observer{

	private String name;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void subcribe(Channel ch) {
		ch.getSubs().add(this);
	}

	@Override
	public void unsubcribe(Channel ch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNotification(String videoTitle) {
		System.out.println("Hey , "+ name + " video " + videoTitle+"uploaded on channel");
	}
	
	
	
	
}
