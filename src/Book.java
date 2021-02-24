
public class Book {
	
	private String author;
	private String title;
	private int pages;
	private boolean hasRead;
	
	public Book(){
		
	}
	
	
	
	public Book(String author, String title, int pages) {
		this.author = author;
		this.title = title;
		this.pages = pages;
		hasRead = false;
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
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public void read(){
		this.hasRead = true;
	}
	
	public boolean getHasRead(){
		return hasRead;
	}
	
	public int compareTo(Book b){
		if(this.author.compareToIgnoreCase(b.author) < 0){
			return -1;
		}
		else
			return 1;
	}
	
	public String toString(){
		return this.getTitle() + " by " + this.getAuthor() + " (" + this.getPages() + ")";
	}
	
	
	
	

}
