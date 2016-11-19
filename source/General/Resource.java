package General;

import java.util.ArrayList;
import java.util.List;

import AST.*;

public class Resource {
  private List<AttributePair> attributeList;
  
  private final String NAME;
  private final String TYPE;

  public Resource(String name, String type) {
    attributeList = new ArrayList<AttributePair>();
    this.NAME = name;

    /* to capitalize the type */
    type = type.toLowerCase();
    this.TYPE = type.substring(0, 1).toUpperCase() + type.substring(1);
  }

  public void addAttribute(String attributeTitle, AstValue<?> attributeValue) {
    attributeList.add(new AttributePair(attributeTitle, attributeValue));
  }

  public List<AttributePair> getAttributeList() {
    return attributeList;
  }

  public void updateAttributes(AstNode node) {
    for (Ast childAst : node.getChildren()) {
      AstNode childNode = (AstNode) childAst;
      String attributeTitle = childNode.getName();
      AstValue<?> attributeValue = (AstValue<?>) childNode.getChild(0);
      
      addAttribute(attributeTitle, attributeValue);
    }
  }

  public String getName() {
    return NAME;
  }

  public String getType() {
    return TYPE;
  }

  public String toString() {
    String catalogPortion = "";
    catalogPortion += "{\n";
    catalogPortion += "\t\"type\": \"" + TYPE + "\",\n";
    catalogPortion += "\t\"title\": \"" + NAME + "\"";
    catalogPortion += ",\n\t\"parameters\": {";

    ArrayList<String> attributeValueStringList = new ArrayList<String>();

    for (AttributePair attributePair : attributeList) {
      if (attributePair.getAttributeTitle() != "") {
        String catalogEntry = "\t\t\"" + attributePair.getAttributeTitle() + "\": " + attributePair.getAttributeValue().toString();
        attributeValueStringList.add(catalogEntry);
      }
    }

    if (attributeValueStringList.size() > 0) {
      catalogPortion += "\n";
      catalogPortion += String.join(",\n", attributeValueStringList.toArray(new String[attributeValueStringList.size()]));
      catalogPortion += "\n\t";
    }

    catalogPortion += "}\n}";
  
    return catalogPortion;
  }
}