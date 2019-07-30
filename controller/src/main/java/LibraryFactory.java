import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;

public final class LibraryFactory {
  public HashSet<Book> getBooks() throws FileNotFoundException {
    final Gson gSon = new Gson();
    final BufferedReader bufferedReader = new BufferedReader(
        new FileReader("D:/HomeWork/library2/controller/src/main/resources/testJson.json"));
    final Library library = gSon.fromJson(bufferedReader, Library.class);
    return library.getLibraryMap();

  }
}
