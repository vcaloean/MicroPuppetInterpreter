package Environment;

import java.util.List;
import java.util.Map;

import AST.*;
import General.*;

public class Definition implements Cloneable {
  protected String parentName = null;
  protected Map<Variable, Ast> parameters = null;
  protected List<Ast> statements = null;

  public String getParentName() {
    return parentName;
  }

  public Map<Variable, Ast> getParameters() {
    return parameters;
  }

  public List<Ast> getStatements() {
    return statements;
  }
  
  public Object clone() throws CloneNotSupportedException {
    return (Definition) super.clone();
  }
}