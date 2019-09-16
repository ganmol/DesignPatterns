package decorator;

public abstract class Pizza {
	String description = "Abstract Pizza"; 
	  
    public String getDescription() 
    { 
        return description; 
    } 
  
    public abstract int getCost(); 
}
