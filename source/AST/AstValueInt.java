package AST;

public class AstValueInt implements AstValue<Integer> {
  private Integer value;

  public AstValueInt(int value) {
    this.value = value;
  }

  @Override
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }

  public Ast clone() {
    return new AstValueInt(value);
  }
}