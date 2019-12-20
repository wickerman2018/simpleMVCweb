package is.ntc.simpleMVCweb;

public class Book {
	private final int id;
	private final String name;
	private final String author;
	private final String publisher;
	private final int year;
	
	public Book(int id, String name, String author, String publisher, int year) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getYear() {
		return year;
	}
	
}
