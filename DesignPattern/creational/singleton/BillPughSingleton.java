package singleton;


// using inner static class 
public class BillPughSingleton {

	private BillPughSingleton()  
	  { 
	    // private constructor 
	  } 
	  
	  // Inner class to provide instance of class 
	  private static class Singleton 
	  { 
	    private static final BillPughSingleton INSTANCE = new BillPughSingleton(); 
	  } 
	  
	  public static BillPughSingleton getInstance()  
	  { 
	    return Singleton.INSTANCE; 
	  } 
	
}


/* Inner class is only created when getInstance method is called */