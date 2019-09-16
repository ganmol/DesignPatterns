package observer;

public class Test {

	public static void main(String[] args) {

		Channel ch = new Channel("WOW");
		
		
		Subscriber sb1 = new Subscriber("A1");
		Subscriber sb2 = new Subscriber("A2");
		Subscriber sb3 = new Subscriber("A3");
		Subscriber sb4 = new Subscriber("A4");
		Subscriber sb5 = new Subscriber("A5");
		
		sb1.subcribe(ch);
		sb2.subcribe(ch);
		sb3.subcribe(ch);
		sb4.subcribe(ch);
		sb5.subcribe(ch);


		ch.uploadVideo("firstVideo");
	}

}
