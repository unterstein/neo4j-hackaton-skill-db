package neo4j.models.project;

import neo4j.models.AbstractModel;
import neo4j.models.orga.Organization;
import neo4j.models.orga.Person;
import neo4j.models.orga.Skill;
import neo4j.relations.Relations;
import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.GraphProperty;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Date;
import java.util.Set;

@NodeEntity
@TypeAlias("Project")
public class Project extends AbstractModel {

  public String name;

  @RelatedTo(type = Relations.PROJECT_ORGANIZATION, direction = Direction.INCOMING)
  public Organization organization;

  @RelatedTo(type = Relations.PROJECT_MANAGER, direction = Direction.INCOMING)
  public Set<Person> manager;

  @RelatedTo(type = Relations.PROJECT_TEAM, direction = Direction.INCOMING)
  public Set<Person> team;

  @GraphProperty(propertyType = Long.class)
  public Date startDate;

  @GraphProperty(propertyType = Long.class)
  public Date endDate;

  @RelatedTo(type = Relations.PROJECT_NEEDED_SKILLS, direction = Direction.INCOMING)
  public Set<Skill> neededSkills;

  public double effortInDays;

}
