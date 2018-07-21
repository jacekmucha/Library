package pl.sda;

import java.io.IOException;

public class AuthorService implements IAuthorService {

    private IAuthorDao authorDao = new AuthorDao();

    @Override
    public void create(Author author) throws IOException {
        authorDao.create(author);
    }
}
