package observer;

public interface Observer {

	public void subcribe(Channel ch );
	public void unsubcribe(Channel ch );
	public void getNotification(String videoTitle );

}
