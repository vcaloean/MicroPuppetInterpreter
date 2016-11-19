package AST;

public class ValueFactory {
  public AstValue<?> getValue(String rawValue) {
    if (isInt(rawValue)) {
      return new AstValueInt(Integer.parseInt(rawValue));
    } else if (isBoolean(rawValue)) {
      return new AstValueBoolean(Boolean.parseBoolean(rawValue));
    } else {
      return new AstValueString(rawValue);
    }
  }

  private boolean isInt(String rawValue) {
    try {
      Integer.parseInt(rawValue);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  private boolean isBoolean(String rawValue) {
    if (rawValue.compareTo("true") == 0 || rawValue.compareTo("false") == 0) {
      return true;
    }

    return false;
  }
}