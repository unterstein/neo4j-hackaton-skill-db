package neo4j.models.orga;

import neo4j.models.AbstractModel;
import neo4j.relations.Relations;
import neo4j.relations.SkillRelation;
import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedToVia;

import java.util.Set;

@NodeEntity
@TypeAlias("Person")
public class Person extends AbstractModel {

  @RelatedToVia(type = Relations.PERSON_SKILLS, direction = Direction.INCOMING)
  public Set<SkillRelation> skills;
}
