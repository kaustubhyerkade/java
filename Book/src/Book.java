
public class Book {

	private int bookId;
	private String bookName;
	private double bookPrice;
	
	
	public Book(int bookId, String bookName, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
     
	

	public int getBookId() {
		return bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public double getBookPrice() {
		return bookPrice;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
	
	
	
}
