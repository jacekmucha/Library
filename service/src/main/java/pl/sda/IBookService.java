package pl.sda;

import exceptions.ItemNotFoundException;

public interface IBookService {

    void isRemoved(long id);

    void isBorrowed(long id);

    void delete(long id) throws ItemNotFoundException;


}
