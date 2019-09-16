package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

	List<Book> books =  new ArrayList();
	String bookName;
	
	
	public List<Book> getBooks() {
		return books;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	// consider it as DB extraction
	public void LoadData() {
		for(int i =0 ; i<10 ; i++) {
			Book b=  new Book();
			b.setId(i);
			b.setName("Book "+i);
		}
	}


	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop shop = new BookShop();// adding book to bookshop and getting data from old object not from load data method
		
		for (Book b : this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
		
	}


//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
}
