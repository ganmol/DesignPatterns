package singleton;

public class EagerSingleton {

	 // public instance initialized when loading the class 
	  private static final EagerSingleton instance = new EagerSingleton(); 
	  
	  private EagerSingleton() 
	  { 
	    // private constructor 
	  } 
	  public static EagerSingleton getInstance(){ 
	        return instance; 
	    } 
}



/*
 * CPU resource wasted. 
 * 
 * Exceptional handling not possible
 * 
 */