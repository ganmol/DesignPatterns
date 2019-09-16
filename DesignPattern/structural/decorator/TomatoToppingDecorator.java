package decorator;

class TomatoToppingDecorator extends ToppingDecorator {
	// we need a reference to obj we are decorating
	Pizza pizza;

	public TomatoToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Fresh Tomato ";
	}

	public int getCost() {
		return 40 + pizza.getCost();
	}
}
