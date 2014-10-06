package neo4j.models;

import neo4j.relations.Relations;
import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Set;

@NodeEntity
@TypeAlias("Organization")
public class Organization extends AbstractModel {

  @RelatedTo(type = Relations.ORGANIZATION_PERSONS, direction = Direction.INCOMING)
  public Set<Person> persons;
}
