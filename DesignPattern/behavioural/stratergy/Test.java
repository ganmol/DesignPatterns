package stratergy;

public class Test {

	public static void main(String[] args) {
ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item(10,"Item 1");
		Item item2 = new Item(40,"Item 2");
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by payTm
		cart.pay(new PaytmPayment("myemail@example.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardPayment("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}



}
