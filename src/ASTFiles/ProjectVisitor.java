/* Generated By:JavaCC: Do not edit this line. ProjectVisitor.java Version 6.0_1 */
public interface ProjectVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTIntegerLiteral node, Object data);
  public Object visit(ASTIdentifier node, Object data);
  public Object visit(ASTProgram node, Object data);
  public Object visit(ASTClassDeclaration node, Object data);
  public Object visit(ASTVarDeclaration node, Object data);
  public Object visit(ASTVarDeclarationWoIdent node, Object data);
  public Object visit(ASTMainDeclaration node, Object data);
  public Object visit(ASTMethodDeclaration node, Object data);
  public Object visit(ASTReturn node, Object data);
  public Object visit(ASTMethodArgs node, Object data);
  public Object visit(ASTArgument node, Object data);
  public Object visit(ASTMainMethodBody node, Object data);
  public Object visit(ASTType node, Object data);
  public Object visit(ASTIsArray node, Object data);
  public Object visit(ASTTypeWoIdent node, Object data);
  public Object visit(ASTCondition node, Object data);
  public Object visit(ASTIfBody node, Object data);
  public Object visit(ASTElseBody node, Object data);
  public Object visit(ASTIfElseStatement node, Object data);
  public Object visit(ASTWhileStatement node, Object data);
  public Object visit(ASTWhileBody node, Object data);
  public Object visit(ASTStatementStartIdent node, Object data);
  public Object visit(ASTAND node, Object data);
  public Object visit(ASTMINOR node, Object data);
  public Object visit(ASTADD node, Object data);
  public Object visit(ASTSUB node, Object data);
  public Object visit(ASTMULT node, Object data);
  public Object visit(ASTDIV node, Object data);
  public Object visit(ASTEQUAL node, Object data);
  public Object visit(ASTStatementAux2 node, Object data);
  public Object visit(ASTCalling node, Object data);
  public Object visit(ASTExpressionRestOfClauses node, Object data);
  public Object visit(ASTExpressionRestOfClausesWoIdent node, Object data);
  public Object visit(ASTAcessing node, Object data);
  public Object visit(ASTAccessingArrayAt node, Object data);
  public Object visit(ASTExpressionAuxDot node, Object data);
  public Object visit(ASTExpressionToken node, Object data);
  public Object visit(ASTExpressionTokenWoIdent node, Object data);
  public Object visit(ASTExpressionNew node, Object data);
}
/* JavaCC - OriginalChecksum=ce7eac687f6d8ef04c70da025e3fa942 (do not edit this line) */
