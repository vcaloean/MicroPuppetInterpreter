package General;

import AST.AstValue;

public class AttributePair {
  private String attributeTitle;
  private AstValue<?> attributeValue;
  
  public AttributePair(String attributeTitle, AstValue<?> attributeValue) {
    this.attributeTitle = attributeTitle;
    this.attributeValue = attributeValue;
  }
  
  public String getAttributeTitle() {
    return attributeTitle;
  }
  
  public AstValue<?> getAttributeValue() {
    return attributeValue;
  }
}
