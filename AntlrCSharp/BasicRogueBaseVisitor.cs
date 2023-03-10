using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

public class BasicRogueBaseVisitor: RogueBaseVisitor<object> {
    public override object VisitIntExpression([NotNull] RogueParser.IntExpressionContext context)
    {
        return int.Parse(context.INT().GetText());
        return base.VisitIntExpression(context);
    }
    public override object VisitNormalExpression([NotNull] RogueParser.NormalExpressionContext context)
    {
        int i1 = int.Parse(context.INT().GetText());
        string op = context.OPERATOR().GetText();
        int aux = (int)Visit(context.expression());
        int result = 0;
        switch (op) {
            case "+":
                result = i1 + aux;
                System.Console.WriteLine(i1 + aux);
                break;
            case "-":
                result = i1 - aux;
                System.Console.WriteLine(i1 - aux);
                break;
            case "*":
                result = i1 * aux;
                System.Console.WriteLine(i1 * aux);
                break;
            case "/":
                result = i1 / aux;
                System.Console.WriteLine(i1 / aux);
                break;
        }
        return result;//base.VisitNormalExpression(context);
    }

    /*public override object VisitCalc([NotNull] RogueParser.CalcContext context)
    {
        VisitChildren(context);
        i1 = int.Parse(context.Expression().GetChild(0).GetText());
        string op = context.Expression().GetChild(1).GetText();
        int i2 = int.Parse(context.INT()[1].GetText());

        switch (op) {
            case "+":
                System.Console.WriteLine(i1 + i2);
                break;
            case "-":
                System.Console.WriteLine(i1 - i2);
                break;
            case "*":
                System.Console.WriteLine(i1 * i2);
                break;
            case "/":
                System.Console.WriteLine(i1 / i2);
                break;
        }
        return base.VisitCalc(context);
    }*/

}