//package neo4j.models.project;
//
//import neo4j.models.AbstractModel;
//import neo4j.models.orga.Person;
//import neo4j.models.orga.Skill;
//import neo4j.relations.Relations;
//import org.neo4j.graphdb.Direction;
//import org.springframework.data.annotation.TypeAlias;
//import org.springframework.data.neo4j.annotation.GraphProperty;
//import org.springframework.data.neo4j.annotation.NodeEntity;
//import org.springframework.data.neo4j.annotation.RelatedTo;
//
//import java.util.Date;
//import java.util.Set;
//
//@NodeEntity
//@TypeAlias("Task")
//public class Task extends AbstractModel {
//
//  @RelatedTo(type = Relations.TASK_SUB_TASKS, direction = Direction.INCOMING)
//  public Set<Task> subTasks;
//
//  @RelatedTo(type = Relations.TASK_ASSIGNEE, direction = Direction.INCOMING)
//  public Person assignee;
//
//  @GraphProperty(propertyType = Long.class)
//  public Date dueDate;
//
//  @RelatedTo(type = Relations.TASK_NEEDED_SKILLS, direction = Direction.INCOMING)
//  public Set<Skill> neededSkills;
//
//  public double effortInHours;
//}
