package ch21;

public class Book {

	String author;
	String title;
	
	public Book() {}

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void showInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
	}
	
	
	
	
	
}
