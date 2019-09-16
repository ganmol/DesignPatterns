package factory;

public class OsFactory {
	
	public static OS getInstance(String str) {
		
		if("Android".equals(str))
			return new Android();
		else if("Android".equals(str))
			return new Android();
		else if("Android".equals(str))
			return new Android();
		else 
			return null;
	}
	
 public static void main(String[] args) {
	 
	 OsFactory fc =  new OsFactory();
	 Android and =  (Android) OsFactory.getInstance("Android");
	 
 }
}
