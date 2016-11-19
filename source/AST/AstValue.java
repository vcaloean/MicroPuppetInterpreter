package AST;

public interface AstValue<T> extends Ast {
  public T getValue();
  public String toString();
  public Ast clone();
}