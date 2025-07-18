package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Book;

public interface BookDao {
    Book getById(Long id);
    Book save(Book book);
    Book update(Book book);
    void deleteById(Long id);

    Book findBookByTitle(String title);
}
