package composite;

import java.util.List;

interface Component {
	
	public void showPrice();
}


class Leaf implements Component {

	 int price;
	 String name ;
	
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println("Price of"+name+" = "+price);
	}
	}


class Composite  implements Component{

	 String name ;
	 List<Component>  componenets;
	 
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showPrice() {
		
		//call method of composit which calls method of leaf
		for(Component c : componenets) {
			c.showPrice();
		}
	}
	
	public void addComponent(Component cm ) {
		
		componenets.add(cm);
	}
	
	}