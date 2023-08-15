package shop.online;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shop.online.model.Book;
import shop.online.service.BookService;

@SpringBootApplication
public class BookShopOnlineApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookShopOnlineApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Book book = new Book();
                book.setTitle("Harry Potter");
                book.setAuthor("J. K. Rowling");
                book.setDescription("The boy who lived");
                book.setPrice(BigDecimal.TEN);
                book.setIsbn("magic books");
                bookService.save(book);
                System.out.println(bookService.findAll());
            }
        };
    }
}
