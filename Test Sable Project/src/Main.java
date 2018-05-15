/* Create an AST, then invoke our interpreter. */ 
import simpleAdder.interpret.Interpreter; 
import java.io.* ;

import org.sablecc.sablecc.lexer.Lexer;
import org.sablecc.sablecc.node.Start;
import org.sablecc.sablecc.parser.Parser; 
  
public class Main { 
   public static void main(String[] args) { 
      if (args.length > 0) { 
         try { 
            /* Form our AST */ 
            Lexer lexer = new Lexer (new PushbackReader( 
               new FileReader(args[0]), 1024)); 
            Parser parser = new Parser(lexer); 
            Start ast = parser.parse() ; 
  
            /* Get our Interpreter going. */ 
            Interpreter interp = new Interpreter () ; 
            ast.apply(interp) ; 
         } 
         catch (Exception e) { 
            System.out.println (e) ; 
         } 
      } else { 
         System.err.println("usage: java simpleAdder inputFile"); 
         System.exit(1); 
      } 
   } 
}