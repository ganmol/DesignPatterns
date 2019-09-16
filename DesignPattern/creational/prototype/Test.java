package prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		BookShop bs =  new BookShop();
		bs.LoadData();
	
		//BookShop bs1 =  (BookShop) bs.clone(); // gives shallow copy => one object two refrences 

		// for deep cloning we need to implement our clone method which returns new object 
		BookShop bs1 =  bs.clone();
		bs.getBooks().remove(2);
		System.out.println("cloned object will have all elements // because ogf deep cloning ");

	}

}
