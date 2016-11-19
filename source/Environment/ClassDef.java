package Environment;

import java.util.List;
import java.util.Map;

import AST.*;
import General.*;

public class ClassDef extends Definition {
  public ClassDef(String parentName, Map<Variable, Ast> parameters, List<Ast> statements) {
    this.parentName = parentName;
    this.parameters = parameters;
    this.statements = statements;
  }
}