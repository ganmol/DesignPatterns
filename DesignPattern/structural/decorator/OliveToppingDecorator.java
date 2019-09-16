package decorator;

public class OliveToppingDecorator {
	  // we need a reference to obj we are decorating 
    Pizza pizza; 
  
    public OliveToppingDecorator(Pizza pizza) { this.pizza = pizza; } 
    public String getDescription() { 
        return pizza.getDescription() + ", Fresh Olive "; 
    } 
    public int getCost() { return 40 + pizza.getCost(); } 
} 