package neo4j.models.orga;

import neo4j.models.AbstractModel;
import neo4j.relations.Relations;
import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Set;

@NodeEntity
@TypeAlias("Organization")
public class Organization extends AbstractModel {

  @RelatedTo(type = Relations.ORGANIZATION_SUB_ORGANIZATION, direction = Direction.INCOMING)
  public Set<Organization> subOrganizations;

  @RelatedTo(type = Relations.ORGANIZATION_PERSONS, direction = Direction.INCOMING)
  public Set<Person> persons;

  @RelatedTo(type = Relations.ORGANIZATION_HEAD_OF, direction = Direction.INCOMING)
  public Person headOf;
}
