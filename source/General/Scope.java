package General;

public class Scope {
  private final String NAME;
  private final Scope PREVIOUSSCOPE;

  public Scope(String name, Scope previousScope) {
    this.NAME = name;
    this.PREVIOUSSCOPE = previousScope;
  }

  public String getName() {
    return NAME;
  }

  public Scope getPreviousScope() {
    return PREVIOUSSCOPE ;
  }
}