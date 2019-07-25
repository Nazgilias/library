import lombok.Data;

import java.util.HashSet;

@Data
public class Library {
  HashSet<Book> libraryMap;
}
