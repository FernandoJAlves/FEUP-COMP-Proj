/* Generated By:JJTree: Do not edit this line. ASTExpressionToken.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTExpressionToken extends SimpleNode {
  private String name;

  public ASTExpressionToken(int id) {
    super(id);
  }

  public ASTExpressionToken(Project p, int id) {
    super(p, id);
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    if(name == null)
      return "";
    if(name.equals("!"))
      return "Operation: !";
    return name;
  }

  /** Accept the visitor. **/
  public Object jjtAccept(ProjectVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f66a1594b1de50bb0862ef174f9443f4 (do not edit this line) */
