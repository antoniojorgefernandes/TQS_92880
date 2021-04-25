package book;

 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import book.Book;
import book.Library;
 
import cucumber.api.Format;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSearchSteps {
	Library library = new Library();
	List<Book> result = new ArrayList<>();
 
	@Given("a book with the title {string}, written by {string}")
	public void addNewBook(String title, String author) {
		Book book = new Book(title, author);
		library.addBook(book);
	}
	
	
	@Given("another book with the title {string}, written by {string}")
	public void another_book_with_the_title_written_by_published_in_August(String title, String author) {
		Book book = new Book(title, author);
		library.addBook(book);
	}

 
	@When("the customer searches for books published by {string}")
	public void setSearchParameters(String author) {
		result = library.findBooks(author);
	}
 
	@Then("{int} books should have been found")
	public void verifyAmountOfBooksFound(final int booksFound) {
		assertThat(result.size(), equalTo(booksFound));
	}
 
	@Then("Book {int} should have the title {string}")
	public void verifyBookAtPosition(final int position, final String title) {
		assertThat(result.get(position - 1).getTitle(), equalTo(title));
	}
}