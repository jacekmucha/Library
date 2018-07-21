package pl.sda;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AuthorDao implements IAuthorDao {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String FILE_PATH = "./persistence/src/main/resources/json/authors.json";


    @Override
    public List<Author> readListOfAuthors() throws IOException {

        List<Author> authors = OBJECT_MAPPER.readValue(new File(FILE_PATH), new TypeReference<List<Author>>(){});
        return authors;

    }

    public void create(Author author) throws IOException {

        IAuthorDao authorDao = new AuthorDao();
        authorDao.readListOfAuthors();

        author.setId(authorDao.generateId(readListOfAuthors()));
        readListOfAuthors().add(author);

        OBJECT_MAPPER.writeValue(new File(FILE_PATH), readListOfAuthors());

    }

    public Author find(long id) {
        return null;



    }

    public void update(Author author) {

    }

    public void delete(long id) {

    }

    @Override
    public long generateId(List<Author> authors) throws IOException {

        return authors.size()+1;

    }
}
