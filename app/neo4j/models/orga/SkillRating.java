package neo4j.models.orga;

public enum SkillRating {
  AWESOME(1), //
  VERY_GOOD(2), //
  GOOD(3), //
  INTERMEDIATE(4),
  NOT_SO_GOOD(5),//
  CRAP(6)//
  ;

  private int rating;

  private SkillRating(int rating) {
    this.rating = rating;
  }

  public int getRating() {
    return rating;
  }
}
