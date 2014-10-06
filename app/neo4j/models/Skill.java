package neo4j.models;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
@TypeAlias("Skill")
public class Skill extends AbstractModel {
}
