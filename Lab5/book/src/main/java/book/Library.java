package book;
 
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
 
public class Library {
	private final List<Book> store = new ArrayList<>();
 
	public void addBook(final Book book) {
		store.add(book);
	}
	
	public List<Book> findBooks(String author) {
		List<Book> aux = new ArrayList<>();
		for (Book b : store){
			if(b.getAuthor().equals(author)){
				aux.add(b);
			}
		}
		return aux;
	}		
}
