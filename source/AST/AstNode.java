package AST;

import java.util.List;
import java.util.ArrayList;

public class AstNode implements Ast, Cloneable {
  private String name; /* could be the name of a class or something similar */
  private String type; /* can be used for resource typing */
  private String label; /* e.g. plus, resource, class, etc. */
  private AstNode parent; /* needed for creation of AST in the loader */
  private List<Ast> children;

  public AstNode(String label, AstNode parent) {
    this.label = label;
    this.parent = parent;
    name = "";
    type = "";
    children = new ArrayList<Ast>();
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public void addChild(Ast child) {
    children.add(child);
  }

  public Ast getChild(int index) {
    return children.get(index);
  }

  public List<Ast> getChildren() {
    return children;
  }

  public int getNumberOfChildren() {
    return children.size();
  }

  public void replaceChild(Ast child, int index) {
    children.remove(index);
    children.add(index, child);
  }

  public void removeChild(int index) {
    children.remove(index);
  }

  public void emptyChildren() {
    if (!children.isEmpty()) {
      children = new ArrayList<Ast>();
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name.replaceAll("^\"|\"$|^\'|\'$", "");;
  }

  public AstNode getParent() {
    return parent;
  }

  public void setParent(AstNode parent) {
    this.parent = parent;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ast clone() {
    AstNode cloneNode = new AstNode(this.label, null);
    cloneNode.setName(this.name);
    cloneNode.setType(this.type);
    for (Ast child : children) {
      cloneNode.addChild(child.clone());
    }
    return cloneNode;
  }
}