package Environment;

public class DeclaredClass extends Definition {
  public DeclaredClass(String parentName) {
    this.parentName = parentName;
  }

  public String getParentName() {
    return parentName;
  }
}