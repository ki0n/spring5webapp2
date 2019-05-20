package guru.springframework.spring5webapp2.repositories;

import guru.springframework.spring5webapp2.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
