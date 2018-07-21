package pl.sda;

public interface IBorrowDao {

    void create(Borrow borrow);

    Borrow find(long id);

    void update(Borrow borrow);

    void delete(long id);

}
