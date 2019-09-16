package builder;

public class Shop {

	public static void main(String[] args) {
		
		// no need to provide all values 
		Phone ph = new Phone("ios", 6 , "ios",2000);
		
		// use phone builder to get object by few providing few values
		Phone pb = new PhoneBuilder().setOs("ios").setRam(16).getPhone();
				
	}

}
