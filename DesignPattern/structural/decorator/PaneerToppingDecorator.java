package decorator;

class PaneerToppingDecorator extends ToppingDecorator {
	// we need a reference to obj we are decorating
	Pizza pizza;

	public PaneerToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Fresh Panerr ";
	}

	public int getCost() {
		return 40 + pizza.getCost();
	}
}
