/* Generated By:JJTree: Do not edit this line. ASTExpressionTokenWoIdent.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTExpressionTokenWoIdent extends SimpleNode {
  private String name;

  public ASTExpressionTokenWoIdent(int id) {
    super(id);
  }

  public ASTExpressionTokenWoIdent(Project p, int id) {
    super(p, id);
  }

  public void setName(String n) {
    name = n;
  }

  public String toString() {
    if(name == null)
      return "";
    return name + "\n";
  }
}
/* JavaCC - OriginalChecksum=5f032298520bd93ab3c1dc738fac158b (do not edit this line) */
