// See https://aka.ms/new-console-template for more information
using System.Text;
using Antlr4.Runtime;

try {

    StringBuilder text = new StringBuilder();
    Console.WriteLine("Input the chat.");
    //string input = Console.ReadLine() ?? "";
    string input = "{if(1<3&&2==2){1+2+3;}}";
    // to type the EOF character and end the input: use CTRL+D, then press <enter>
    //while ((input = Console.ReadLine()) != "u0004")
    //{
    //    text.AppendLine(input);
    //}

    AntlrInputStream inputStream = new AntlrInputStream(input);
    RogueLexer rogueLexer = new RogueLexer(inputStream);
    CommonTokenStream commonTokenStream = new CommonTokenStream(rogueLexer);
    RogueParser rogueParser = new RogueParser(commonTokenStream);

    RogueParser.CalcContext calcContext = rogueParser.calc();
    BasicRogueBaseVisitor visitor = new BasicRogueBaseVisitor();
    visitor.Visit(calcContext);
} catch (Exception ex) {
    System.Console.WriteLine("Exception: " + ex);
}
