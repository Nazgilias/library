import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Application {
  private static final LibraryFactory libraryFactory = new LibraryFactory();

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println(getAuthorBooks(getName()));

  }

  public static HashMap<String, String> getName() {
    HashMap author = new HashMap<>();
    System.out.println("Enter Author Name");
    final Scanner scanner = new Scanner(System.in);
    final String authorName = scanner.nextLine();
    System.out.println("Enter Author Surname");
    final String authorSurname = scanner.nextLine();
    author.put(authorName, authorSurname);


    return author;
  }

  public static HashMap<String, String> getAuthorBooks(HashMap<String, String> author) throws FileNotFoundException {
    final HashMap<String, String> authorBooks = new HashMap<>();
    libraryFactory.getBooks().forEach(book -> {
      if (author.containsKey(book.getAuthor().getName()) && author.containsValue(book.getAuthor().getSurname())) {
        authorBooks.put(book.getBookName(), book.getAuthor().getSurname());
      }
    });
    return authorBooks;
  }

}
