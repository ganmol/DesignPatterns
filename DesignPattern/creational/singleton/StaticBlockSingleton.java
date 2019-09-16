package singleton;

public class StaticBlockSingleton {

	// public instance 
	  public static StaticBlockSingleton instance; 
	  
	  private StaticBlockSingleton()  
	  { 
	    // private constructor 
	  } 
	  
	  { 
	    // static block to initialize instance 
	    instance = new StaticBlockSingleton(); 
	  } 
}

/*
 * Exception can be handled .
 * 
 * resource is wasted as object is created when not used.
 */