/* Generated By:JJTree: Do not edit this line. ASTStatementStartIdent.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTStatementStartIdent extends SimpleNode {
  private String first;
  
  public ASTStatementStartIdent(int id) {
    super(id);
  }

  public ASTStatementStartIdent(Project p, int id) {
    super(p, id);
  }

  public void isVarDecl(String n) {
    first = n;
  }

  public String toString() {
    if(first.equals(".") || first.equals("=") || first.equals(";")){
      return "Statement ";
    }
    return "VarDeclaration ";
  }

}
/* JavaCC - OriginalChecksum=3e07499985740e2ad258ee30835c4ee7 (do not edit this line) */
