package pl.sda;

import exceptions.ItemNotFoundException;
import java.util.Optional;

public class BookService implements IBookService {

    IBookDao bookDao = new BookDao();


    public void isRemoved(long id) {

    }

    public void isBorrowed(long id) {

    }

    @Override
    public void delete(long id) throws ItemNotFoundException {

        Book book = Optional.ofNullable(bookDao.find(id))
                .orElseThrow(() -> {
                    System.out.println("Can not find a book: " + id);
                    return new ItemNotFoundException("Can not find a book: " + id);
                });
    }
}
