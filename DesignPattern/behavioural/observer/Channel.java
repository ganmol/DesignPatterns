package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
	
	private String channelName;
	private List<Subscriber> subs =  new ArrayList<>();
	

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public List<Subscriber> getSubs() {
		return subs;
	}

	public void setSubs(List<Subscriber> subs) {
		this.subs = subs;
	}

	public Channel(String channelName) {
		super();
		this.channelName = channelName;
	}

	@Override
	public void uploadVideo(String videoTitle) 
	{
		notifySubscribers(videoTitle);
	}

	@Override
	public void notifySubscribers(String videoTitle) {
		// TODO Auto-generated method stub
		for (Subscriber  sub :subs) {
			sub.getNotification(videoTitle);
		}
		
	}

}
