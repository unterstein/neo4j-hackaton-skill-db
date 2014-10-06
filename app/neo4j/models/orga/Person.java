package neo4j.models.orga;

import neo4j.models.AbstractModel;
import neo4j.relations.Relations;
import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Set;

@NodeEntity
@TypeAlias("Person")
public class Person extends AbstractModel {

  @RelatedTo(type = Relations.PERSON_SKILLS, direction = Direction.INCOMING)
  public Set<Skill> skills;
}
