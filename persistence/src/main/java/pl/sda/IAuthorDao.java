package pl.sda;

import java.io.IOException;
import java.util.List;

public interface IAuthorDao {


    List<Author> readListOfAuthors() throws IOException;

    void create(Author author) throws IOException;

    Author find(long id);

    void update(Author author);

    void delete(long id);

    long generateId(List<Author> authors) throws IOException;
}
