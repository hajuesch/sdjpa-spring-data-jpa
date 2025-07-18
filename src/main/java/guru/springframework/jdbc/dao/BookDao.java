package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by jt on 8/29/21.
 */
public interface BookDao {

    List<Book> findAllSortByTitle(Pageable pageable);

    List<Book> findAll(Pageable pageable);

    List<Book> findAll(int pageSize, int offset);

    List<Book> findAll();
    
    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);

}
