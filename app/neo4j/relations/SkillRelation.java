package neo4j.relations;

import neo4j.models.AbstractModel;
import neo4j.models.orga.Person;
import neo4j.models.orga.Skill;
import neo4j.models.orga.SkillRating;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.*;

import java.util.Date;

@RelationshipEntity(type = Relations.PERSON_SKILLS)
@TypeAlias(value = "SkillRelation")
public class SkillRelation extends AbstractModel {

  @StartNode
  @Fetch
  public Person person;

  @EndNode
  @Fetch
  public Skill skill;

  public SkillRating rating;

  @GraphProperty(propertyType = Long.class)
  public Date since;

}
