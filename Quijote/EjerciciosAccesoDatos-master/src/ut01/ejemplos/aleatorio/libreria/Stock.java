package ut01.ejemplos.aleatorio.libreria;

public class Stock {
	
	private int bookId ;
	private String title ;
	private int fkAuthor;
	private int year;
	private int fkPublisher;
	private int stock;
	
	Stock(int bookId , String title, int fkAuthor, int year, int fkPublisher, int stock){
		
	this.bookId = bookId;
	this.title =  title;
	this.fkAuthor =  fkAuthor;
    this.year = year;
    this.fkPublisher = fkPublisher;
    this.stock = stock;
		
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFkAuthor() {
		return fkAuthor;
	}
	public void setFkAuthor(int fkAuthor) {
		this.fkAuthor = fkAuthor;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getFkPublisher() {
		return fkPublisher;
	}
	public void setFkPublisher(int fkPublisher) {
		this.fkPublisher = fkPublisher;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	

}
