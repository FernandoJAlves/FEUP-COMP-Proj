/* Generated By:JJTree: Do not edit this line. ASTDIV.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTDIV extends SimpleNode {
  private String op;
  
  public ASTDIV(int id) {
    super(id);
  }

  public ASTDIV(Project p, int id) {
    super(p, id);
  }

  public void setOp(String n) {
    op = n;
  }

  public String toString() {
    op = "/";
    return "Operation: /";
  }
}
/* JavaCC - OriginalChecksum=6bb67b56e5bc9ede3727cf30db11a05e (do not edit this line) */
