package stratergy;

public class Item {

	int price;
	String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Item(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	
	
}
