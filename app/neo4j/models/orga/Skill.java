package neo4j.models.orga;

import neo4j.models.AbstractModel;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
@TypeAlias("Skill")
public class Skill extends AbstractModel {
}
