import java.util.ArrayList;
public class Bookshelf {
	
	ArrayList<Book> shelf;
	
	public Bookshelf(){
		shelf = new ArrayList<Book>();
	}
	
	public void addBook(Book b){
		shelf.add(b);
	}
	
	
	public void addBook(String title, String author, int pages){
		Book book = new Book(title, author, pages);
		shelf.add(book);
	}
	
	
	public void readBook(String title){
		int i;
		for(i=0; i<shelf.size()-1; i++){
			if(shelf.get(i).getTitle().equals(title)){
				shelf.get(i).read();
			}
		}
	}
	
	
	public int pagesRead(){
		int i;
		int numPagesRead = 0;
		for(i=0; i<shelf.size()-1; i++){
			if(shelf.get(i).getHasRead() == true){
				numPagesRead += shelf.get(i).getPages();
			}
			else
				numPagesRead = 0 + numPagesRead;
		}
		return numPagesRead;
	}
	
	
	public void sort(){
		Book temp;
		int i, j;
		for(i=0; i<shelf.size()-1; i++){
			for(j=i+1; j<shelf.size(); j++){
				if(shelf.get(i).compareTo(shelf.get(j)) == 1){
					temp = shelf.get(i);
					shelf.add(i, shelf.get(j));
					shelf.add(j, temp);
				}
			}
		}
	}
	
	public String toString(){
		int i;
		String s="";
		for(i=0; i<shelf.size()-1; i++){
			s += shelf.get(i).toString() + "\n";
		}
		return s;
	}

	public static void main(String[] args) {
		

	}

}
