package pl.sda;

public interface IBookDao {

    void create(Book book);

    Book find(long id);

    void update(Book book);

    void delete(long id);

}
