import lombok.Data;

import java.util.HashSet;

@Data
public final class Library {
  private final HashSet<Book> libraryMap;
}
