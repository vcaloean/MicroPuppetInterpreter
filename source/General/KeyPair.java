package General;

public class KeyPair {
  private String scopeName;
  private String variableName;

  public KeyPair(String leftComponent, String rightComponent) {
    this.scopeName = leftComponent;
    this.variableName = rightComponent;
  }
  
  public String getScopeName() {
    return scopeName;
  }

  public String getVariableName() {
    return variableName;
  }

  @Override
  public int hashCode() {
    return scopeName.hashCode() + variableName.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof KeyPair) {
      KeyPair otherKey = (KeyPair) o;
      return ((scopeName.compareTo(otherKey.getScopeName()) == 0)
        && (variableName.compareTo(otherKey.getVariableName()) == 0));
    }

    return false;
  }
}