package AST;

public class AstValueString implements AstValue<String> {
  private String value;

  public AstValueString(String value) {
    this.value = value.replaceAll("^\"|\"$|^\'|\'$", "");
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "\"" + value + "\"";
  }

  public Ast clone() {
    return new AstValueString(value);
  }
}