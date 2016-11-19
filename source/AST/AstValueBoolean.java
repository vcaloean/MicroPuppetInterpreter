package AST;

public class AstValueBoolean implements AstValue<Boolean> {
  private Boolean value;

  public AstValueBoolean(boolean value) {
    this.value = value;
  }

  @Override
  public Boolean getValue() {
    return value;
  }
  
  @Override
  public String toString() {
    return Boolean.toString(value);
  }

  @Override
  public Ast clone() {
    return new AstValueBoolean(value);
  }
}