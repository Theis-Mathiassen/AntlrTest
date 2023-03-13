//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from /home/kali/Documents/AntlrProject/Test/AntlrTest/AntlrCSharp/Rogue.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="RogueParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public interface IRogueVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="RogueParser.calc"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitCalc([NotNull] RogueParser.CalcContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="RogueParser.statements"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatements([NotNull] RogueParser.StatementsContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="RogueParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] RogueParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="RogueParser.stat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStat([NotNull] RogueParser.StatContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="RogueParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlock([NotNull] RogueParser.BlockContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="RogueParser.lexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLexpr([NotNull] RogueParser.LexprContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="RogueParser.identifierDecleration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIdentifierDecleration([NotNull] RogueParser.IdentifierDeclerationContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>NormalExpression</c>
	/// labeled alternative in <see cref="RogueParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNormalExpression([NotNull] RogueParser.NormalExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>IntExpression</c>
	/// labeled alternative in <see cref="RogueParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIntExpression([NotNull] RogueParser.IntExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>IntAux</c>
	/// labeled alternative in <see cref="RogueParser.auxillary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIntAux([NotNull] RogueParser.IntAuxContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>ExprAux</c>
	/// labeled alternative in <see cref="RogueParser.auxillary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExprAux([NotNull] RogueParser.ExprAuxContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="RogueParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitType([NotNull] RogueParser.TypeContext context);
}
