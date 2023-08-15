package shop.online.service;

import java.util.List;
import shop.online.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
