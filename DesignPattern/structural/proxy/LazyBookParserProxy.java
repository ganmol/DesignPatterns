package proxy;

public class LazyBookParserProxy implements Parser {
	
	// proxy has a real subject
	private BookParser bookParser = null;
	
	private String bookContent;

	@Override
	public int getwordsCount() {

		if(bookParser == null)
			this.bookParser = new BookParser(bookContent);
			
		return this.bookParser.getwordsCount();
			
	}

	public LazyBookParserProxy(String bookContent) {
		super();
		this.bookContent = bookContent;
	}
	

}
