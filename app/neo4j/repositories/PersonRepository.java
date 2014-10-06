package neo4j.repositories;

import neo4j.models.orga.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface PersonRepository extends GraphRepository<Person> {
}
