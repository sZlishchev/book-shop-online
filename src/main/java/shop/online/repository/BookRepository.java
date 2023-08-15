package shop.online.repository;

import org.springframework.data.repository.CrudRepository;
import shop.online.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
