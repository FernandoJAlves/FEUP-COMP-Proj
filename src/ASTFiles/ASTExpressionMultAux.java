/* Generated By:JJTree: Do not edit this line. ASTExpressionMultAux.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTExpressionMultAux extends SimpleNode {
  private String op;
  
  public ASTExpressionMultAux(int id) {
    super(id);
  }

  public ASTExpressionMultAux(Project p, int id) {
    super(p, id);
  }

  public void setOp(String n) {
    op = n;
  }

  public String toString() {
    if(op == null)
      return "";
    return "Operation: " + op + "\n";
  }
}
/* JavaCC - OriginalChecksum=352e30bd2df3cdbb73e4b8acca6b6de3 (do not edit this line) */
