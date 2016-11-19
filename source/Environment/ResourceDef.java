package Environment;

import java.util.List;
import java.util.Map;

import AST.*;
import General.*;

public class ResourceDef extends Definition {
  public ResourceDef(Map<Variable, Ast> parameters, List<Ast> statements) {
    this.parameters = parameters;
    this.statements = statements;
  }
}