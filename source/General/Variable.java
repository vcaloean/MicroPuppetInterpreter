package General;

import AST.AstValue;

public class Variable {
  private final String NAME;
  private AstValue<?> value;

  public Variable(String name) {
    this.NAME = name;
    value = null;
  }

  public String getName() {
    return NAME;
  }

  public AstValue<?> getValue() {
    return value;
  }
  
  public void setValue(AstValue<?> value) {
    this.value = value;
  }

  @Override
  public int hashCode() {
    return NAME.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Variable) {
      return NAME.compareTo(((Variable) o).getName()) == 0;
    }

    return false;
  }
}