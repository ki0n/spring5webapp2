package guru.springframework.spring5webapp2.repositories;

import guru.springframework.spring5webapp2.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
