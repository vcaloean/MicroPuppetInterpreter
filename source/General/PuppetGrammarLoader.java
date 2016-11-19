package General;

import AST.*;
import ANTLR.*;

public class PuppetGrammarLoader extends PuppetGrammarBaseListener {
  AstNode topNode;
  AstNode currentNode = null;
  ValueFactory valueFactoryObject = new ValueFactory();
  
  //========================================================================================
  // Loader Functions
  //========================================================================================
  
  private void introduceNewNode(String label) {
    AstNode tempNode = new AstNode(label, currentNode);
    
    if (currentNode != null) {
      currentNode.addChild(tempNode);
    } else {
      topNode = tempNode;
    }
    
    currentNode = tempNode;
  }
  
  //========================================================================================
  // Assignment
  //========================================================================================

  @Override
  public void enterPuppetAssignment(PuppetGrammarParser.PuppetAssignmentContext ctx) {
    introduceNewNode("assignment");
  }

  @Override
  public void exitPuppetAssignment(PuppetGrammarParser.PuppetAssignmentContext ctx) {
    currentNode = currentNode.getParent();
  }

  //========================================================================================
  // Class
  //========================================================================================
  
  @Override
  public void enterPuppetCase(PuppetGrammarParser.PuppetCaseContext ctx) {
    introduceNewNode("case");
  }
  
  @Override
  public void exitPuppetCase(PuppetGrammarParser.PuppetCaseContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  @Override
  public void enterPuppetCaseElement(PuppetGrammarParser.PuppetCaseElementContext ctx) {
    introduceNewNode("case_element");
  }
  
  @Override
  public void exitPuppetCaseElement(PuppetGrammarParser.PuppetCaseElementContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  //========================================================================================
  // Class
  //========================================================================================

  @Override
  public void enterPuppetClass(PuppetGrammarParser.PuppetClassContext ctx) {
    introduceNewNode("class_def");
  }

  @Override
  public void exitPuppetClass(PuppetGrammarParser.PuppetClassContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetParameter(PuppetGrammarParser.PuppetParameterContext ctx) {
    introduceNewNode("parameter");
  }

  @Override
  public void exitPuppetParameter(PuppetGrammarParser.PuppetParameterContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetClassInherits(PuppetGrammarParser.PuppetClassInheritsContext ctx) {
    introduceNewNode("inherits");
  }

  @Override
  public void exitPuppetClassInherits(PuppetGrammarParser.PuppetClassInheritsContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetClassDecl(PuppetGrammarParser.PuppetClassDeclContext ctx) {
    introduceNewNode("class_decl");
  }

  @Override
  public void exitPuppetClassDecl(PuppetGrammarParser.PuppetClassDeclContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetClassNameScoped(PuppetGrammarParser.PuppetClassNameScopedContext ctx) {
    currentNode.setName(currentNode.getName() + ctx.IDENTIFIER().getText() + "::");
  }

  @Override
  public void enterPuppetClassNameEnd(PuppetGrammarParser.PuppetClassNameEndContext ctx) {
    currentNode.setName(currentNode.getName() + ctx.IDENTIFIER().getText());
  }

  //========================================================================================
  // Custom
  //========================================================================================
  
  @Override
  public void enterPuppetCustomSkip(PuppetGrammarParser.PuppetCustomSkipContext ctx) {
    introduceNewNode("skip");
  }
  
  @Override
  public void exitPuppetCustomSkip(PuppetGrammarParser.PuppetCustomSkipContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  @Override
  public void enterPuppetCustomScope(PuppetGrammarParser.PuppetCustomScopeContext ctx) {
    AstNode tempNode = new AstNode("scope", currentNode);
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }
  
  @Override
  public void exitPuppetCustomScope(PuppetGrammarParser.PuppetCustomScopeContext ctx) {
    currentNode.removeChild(0); /* remove the name node */
    currentNode = currentNode.getParent();
  }
  
  @Override
  public void enterPuppetCustomScopeDef(PuppetGrammarParser.PuppetCustomScopeDefContext ctx) {
    AstNode tempNode = new AstNode("scope_name", currentNode);
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }
  
  @Override
  public void exitPuppetCustomScopeDef(PuppetGrammarParser.PuppetCustomScopeDefContext ctx) {
    currentNode = currentNode.getParent();
    currentNode.setName("(" + ((AstNode) currentNode.getChild(0)).getName() + " " + ctx.IDENTIFIER().getText() + ")");
    currentNode.setType("alpha_def");
  }
  
  @Override
  public void enterPuppetCustomScopeRest(PuppetGrammarParser.PuppetCustomScopeRestContext ctx) {
    AstNode tempNode = new AstNode("scope_name", currentNode);
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }
  
  @Override
  public void exitPuppetCustomScopeRest(PuppetGrammarParser.PuppetCustomScopeRestContext ctx) {
    String nodeName = currentNode.getName();
    currentNode = currentNode.getParent();
    currentNode.setName("::" + nodeName);
  }
  
  //========================================================================================
  // Defined Resource Type
  //========================================================================================

  @Override
  public void enterPuppetDefinedResType(PuppetGrammarParser.PuppetDefinedResTypeContext ctx) {
    AstNode tempNode = new AstNode("defined_res_type", currentNode);
    tempNode.setName(ctx.IDENTIFIER().getText());
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }
  
  @Override
  public void exitPuppetDefinedResType(PuppetGrammarParser.PuppetDefinedResTypeContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  @Override
  public void enterPuppetDefinedResDecl(PuppetGrammarParser.PuppetDefinedResDeclContext ctx) {
    AstNode tempNode = new AstNode("defined_res_decl", currentNode);
    tempNode.setName(ctx.IDENTIFIER().getText());
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }
  
  @Override
  public void exitPuppetDefinedResDecl(PuppetGrammarParser.PuppetDefinedResDeclContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  //========================================================================================
  // Expressions
  //========================================================================================

  @Override
  public void enterPuppetNotExpr(PuppetGrammarParser.PuppetNotExprContext ctx) {
    AstNode tempNode = new AstNode("unaryop", currentNode);
    tempNode.setName("!");
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetNotExpr(PuppetGrammarParser.PuppetNotExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetInExpr(PuppetGrammarParser.PuppetInExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    tempNode.setName("in");
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetInExpr(PuppetGrammarParser.PuppetInExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetRegExpr(PuppetGrammarParser.PuppetRegExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    
    if (ctx.REGMATCH() != null) {
      tempNode.setName("=~");
    } else {
      tempNode.setName("!~");
    }

    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetRegExpr(PuppetGrammarParser.PuppetRegExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetMultExpr(PuppetGrammarParser.PuppetMultExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    
    if (ctx.MULT() != null) {
      tempNode.setName("*"); 
    } else if (ctx.DIV() != null) {
      tempNode.setName("/");
    } else {
      tempNode.setName("%");
    }

    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetMultExpr(PuppetGrammarParser.PuppetMultExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetAddExpr(PuppetGrammarParser.PuppetAddExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    
    if (ctx.PLUS() != null) {
      tempNode.setName("+"); 
    } else {
      tempNode.setName("-");
    }

    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetAddExpr(PuppetGrammarParser.PuppetAddExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetShiftExpr(PuppetGrammarParser.PuppetShiftExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    
    if (ctx.LEFTSHIFT() != null) {
      tempNode.setName("<<");
    } else {
      tempNode.setName(">>");
    }

    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetShiftExpr(PuppetGrammarParser.PuppetShiftExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetEqExpr(PuppetGrammarParser.PuppetEqExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    
    if (ctx.EQ() != null) {
      tempNode.setName("==");      
    } else {
      tempNode.setName("!=");
    }

    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetEqExpr(PuppetGrammarParser.PuppetEqExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetCompExpr(PuppetGrammarParser.PuppetCompExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    
    if (ctx.LT() != null) {
      tempNode.setName("<");
    } else if (ctx.GT() != null) {
      tempNode.setName(">");
    } else if (ctx.LE() != null) {
      tempNode.setName("<=");
    } else {
      tempNode.setName(">=");
    }

    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetCompExpr(PuppetGrammarParser.PuppetCompExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetAndExpr(PuppetGrammarParser.PuppetAndExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    tempNode.setName("and");
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetAndExpr(PuppetGrammarParser.PuppetAndExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetOrExpr(PuppetGrammarParser.PuppetOrExprContext ctx) {
    AstNode tempNode = new AstNode("binop", currentNode);
    tempNode.setName("or");
    currentNode.addChild(tempNode);
    currentNode = tempNode;
  }

  @Override
  public void exitPuppetOrExpr(PuppetGrammarParser.PuppetOrExprContext ctx) {
    currentNode = currentNode.getParent();
  }

  //========================================================================================
  // If
  //========================================================================================
  
  @Override
  public void enterPuppetIf(PuppetGrammarParser.PuppetIfContext ctx) {
    introduceNewNode("if");
  }
  
  @Override
  public void exitPuppetIf(PuppetGrammarParser.PuppetIfContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  @Override
  public void enterPuppetIfElse(PuppetGrammarParser.PuppetIfElseContext ctx) {
    introduceNewNode("else");
    introduceNewNode("if");
  }
  
  @Override
  public void exitPuppetIfElse(PuppetGrammarParser.PuppetIfElseContext ctx) {
    currentNode = currentNode.getParent(); /* to get to else */
    currentNode = currentNode.getParent(); /* to get to the if-parent */
  }
  
  @Override
  public void enterPuppetElse(PuppetGrammarParser.PuppetElseContext ctx) {
    introduceNewNode("else");
  }
  
  @Override
  public void exitPuppetElse(PuppetGrammarParser.PuppetElseContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  //========================================================================================
  // Include
  //========================================================================================

  @Override
  public void enterPuppetInclude(PuppetGrammarParser.PuppetIncludeContext ctx) {
    introduceNewNode("include");
  }

  @Override
  public void exitPuppetInclude(PuppetGrammarParser.PuppetIncludeContext ctx) {
    currentNode = currentNode.getParent();
  }

  //========================================================================================
  // Node
  //========================================================================================

  @Override
  public void enterPuppetNode(PuppetGrammarParser.PuppetNodeContext ctx) {
    introduceNewNode("puppet_node");
  }

  @Override
  public void exitPuppetNode(PuppetGrammarParser.PuppetNodeContext ctx) {
    String nodeName = currentNode.getName(); /* split multiple nodes */

    if (nodeName.contains(",")) {
      String[] listOfNodeNames = nodeName.split(",");
      
      for (int i = 1; i < listOfNodeNames.length; i++) {
        AstNode tempNode = (AstNode) ((AstNode) currentNode).clone();
        tempNode.setName(listOfNodeNames[i]);
        currentNode.getParent().addChild(tempNode); 
      }

      currentNode.setName(listOfNodeNames[0]);
    }

    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetNameNotDefault(PuppetGrammarParser.PuppetNameNotDefaultContext ctx) {
    String nodeName = currentNode.getName();

    for (int i = 1; i < ctx.STRING_LITERAL().size(); i++) {
      nodeName += "," + ctx.STRING_LITERAL(i).getText();
    }

    nodeName = ctx.STRING_LITERAL(0).getText() + nodeName;

    currentNode.setName(nodeName);
  }

  @Override
  public void enterPuppetNameDefault(PuppetGrammarParser.PuppetNameDefaultContext ctx) {
    currentNode.setName("default");
  }
  
  //========================================================================================
  // Program
  //========================================================================================

  @Override
  public void enterPuppetProgram(PuppetGrammarParser.PuppetProgramContext ctx) {
    introduceNewNode("program_elements");
  }

  //========================================================================================
  // Resource
  //========================================================================================

  @Override
  public void enterPuppetResource(PuppetGrammarParser.PuppetResourceContext ctx) {
    introduceNewNode("resource");
    currentNode.setType(ctx.RESOURCE_TYPE().getText());
  }

  @Override
  public void exitPuppetResource(PuppetGrammarParser.PuppetResourceContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetAttributeValue(PuppetGrammarParser.PuppetAttributeValueContext ctx) {
    introduceNewNode("attribute");
    currentNode.setName(ctx.IDENTIFIER().getText());
  }

  @Override
  public void exitPuppetAttributeValue(PuppetGrammarParser.PuppetAttributeValueContext ctx) {
    currentNode = currentNode.getParent();
  }

  //========================================================================================
  // Selector
  //========================================================================================
  
  @Override
  public void enterPuppetSelector(PuppetGrammarParser.PuppetSelectorContext ctx) {
    introduceNewNode("selector");
  }
  
  @Override
  public void exitPuppetSelector(PuppetGrammarParser.PuppetSelectorContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  @Override
  public void enterPuppetSelectorDefault(PuppetGrammarParser.PuppetSelectorDefaultContext ctx) {
    introduceNewNode("selector_element");
    currentNode.setName("default");
  }
  
  @Override
  public void exitPuppetSelectorDefault(PuppetGrammarParser.PuppetSelectorDefaultContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  @Override
  public void enterPuppetSelectorNotDefault(PuppetGrammarParser.PuppetSelectorNotDefaultContext ctx) {
    introduceNewNode("selector_element");
  }
  
  @Override
  public void exitPuppetSelectorNotDefault(PuppetGrammarParser.PuppetSelectorNotDefaultContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  //========================================================================================
  // Statement
  //========================================================================================

  @Override
  public void enterPuppetStatements(PuppetGrammarParser.PuppetStatementsContext ctx) {
    introduceNewNode("statements");
  }

  @Override
  public void exitPuppetStatements(PuppetGrammarParser.PuppetStatementsContext ctx) {
    currentNode = currentNode.getParent();
  }

  //========================================================================================
  // Unless
  //========================================================================================
  
  @Override
  public void enterPuppetUnless(PuppetGrammarParser.PuppetUnlessContext ctx) {
    introduceNewNode("unless");
  }
  
  @Override
  public void exitPuppetUnless(PuppetGrammarParser.PuppetUnlessContext ctx) {
    currentNode = currentNode.getParent();
  }
  
  //========================================================================================
  // Value
  //========================================================================================

  @Override
  public void enterPuppetValue(PuppetGrammarParser.PuppetValueContext ctx) {
    Ast valueLeaf = valueFactoryObject.getValue(ctx.getText());
    currentNode.addChild(valueLeaf);
  }

  //========================================================================================
  // Variable
  //========================================================================================

  @Override
  public void enterPuppetLocalVariable(PuppetGrammarParser.PuppetLocalVariableContext ctx) {
    introduceNewNode("local_variable");
    currentNode.setName(ctx.IDENTIFIER().getText());
  }
  
  @Override
  public void exitPuppetLocalVariable(PuppetGrammarParser.PuppetLocalVariableContext ctx) {
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetQualifiedVariable(PuppetGrammarParser.PuppetQualifiedVariableContext ctx) {
    introduceNewNode("qualified_variable");
    currentNode.setName("");
  }

  @Override
  public void exitPuppetQualifiedVariable(PuppetGrammarParser.PuppetQualifiedVariableContext ctx) {
    currentNode.setName(currentNode.getName() + "::" + ctx.IDENTIFIER().getText());
    currentNode = currentNode.getParent();
  }

  @Override
  public void enterPuppetScopeFull(PuppetGrammarParser.PuppetScopeFullContext ctx) {
    currentNode.setName(currentNode.getName() + "::");
  }
  
  //========================================================================================
  // 
  //========================================================================================
}