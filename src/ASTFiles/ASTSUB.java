/* Generated By:JJTree: Do not edit this line. ASTSUB.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTSUB extends SimpleNode {
  private String op;
  
  public ASTSUB(int id) {
    super(id);
  }

  public ASTSUB(Project p, int id) {
    super(p, id);
  }

  public void setOp(String n) {
    op = n;
  }

  public String toString() {
    return "Operation: -";
  }

  /** Accept the visitor. **/
  public Object jjtAccept(ProjectVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e0fbb52df833b9cfefd92dc8ae67977e (do not edit this line) */
