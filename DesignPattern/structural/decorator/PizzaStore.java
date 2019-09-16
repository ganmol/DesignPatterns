package decorator;

public class PizzaStore {

    public static void main(String args[]) 
    {
	// Magrietta pizza
	Pizza magrietta = new Magrietta();

	Pizza farnHouse = new FarmHouse();
	
	// decorate it with freshtomato topping
	farnHouse=new TomatoToppingDecorator(farnHouse);

	// decorate it with paneer topping
	farnHouse=new PaneerToppingDecorator(farnHouse);

	System.out.println(farnHouse.getDescription()+" Cost :"+farnHouse.getCost());

    }
}
