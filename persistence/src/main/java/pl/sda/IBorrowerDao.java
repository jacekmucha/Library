package pl.sda;

public interface IBorrowerDao {

    void create(Borrower borrower);

    Borrower find(long id);

    void update(Borrower borrower);

    void delete(long id);

}
