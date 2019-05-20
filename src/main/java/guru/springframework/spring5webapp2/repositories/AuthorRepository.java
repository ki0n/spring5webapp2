package guru.springframework.spring5webapp2.repositories;

import guru.springframework.spring5webapp2.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
