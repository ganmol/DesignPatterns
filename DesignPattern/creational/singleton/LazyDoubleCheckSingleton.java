package singleton;

public class LazyDoubleCheckSingleton {

	// private instance, so that it can be 
	  // accessed by only by getInstance() method 
	  private static LazyDoubleCheckSingleton instance; 
	  
	  private LazyDoubleCheckSingleton()  
	  { 
	    // private constructor 
	  } 
	  
	  public static LazyDoubleCheckSingleton getInstance() 
	  { 
	    if (instance == null)  
	    { 
	      //synchronized block to remove overhead 
	      synchronized (LazyDoubleCheckSingleton.class) 
	      { 
	        if(instance==null) 
	        { 
	          // if instance is null, initialize 
	          instance = new LazyDoubleCheckSingleton(); 
	        } 
	        
	      } 
	    } 
	    return instance; 
	  }
	  
}


/* 
 * first time it can affect performance 
 * 
 * */
