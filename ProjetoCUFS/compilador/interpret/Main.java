package compilador.interpret;

import compilador.parser.* ; 
import compilador.lexer.* ; 
import compilador.node.* ; 
  
import java.io.* ;
import java.util.ArrayDeque;
import java.util.Deque;

import javax.swing.text.StyledEditorKit.ForegroundAction; 
import compilador.interpret.ComentarioAninhado;

public class Main { 
   public static void main(String[] args) { 
	   
	   
	   if (args.length > 0) { 
         try { 
            /* Form our AST */ 
        	ComentarioAninhado filtro = new ComentarioAninhado(new PushbackReader(new FileReader(args[0]), 1024));
            Lexer lexer = new Lexer (new PushbackReader(new FileReader(args[0]), 1024));
            Token token = null;
            
            token = lexer.peek();
            while(!token.getClass().getSimpleName().equals("EOF")) {
            	try {
	            	token = lexer.peek();
	            	filtro.filter(token);
	            	lexer.next();
            	}catch(LexerException le) {
            		System.out.println(le.getMessage());
            	}
			}
            
            if (!filtro.pilhaVazia()) {
            	System.out.println("\n\n\nERRO: Comentário não aninhado na linha: "+ filtro.line + " coluna: " + filtro.position + ": erro em " + ComentarioAninhado.pilha.peek());
            }
            /* - Parte sintatica e semântica
            Parser parser = new Parser(lexer); 
            Start ast = parser.parse() ;  
            Interpreter interp = new Interpreter () ; 
            ast.apply(interp) ; 
            */
         } 
         catch (Exception e) { 
            System.out.println (e);
         }
      }else{ 
         System.err.println("usage: java compilador inputFile"); 
         System.exit(1);
      } 
   }
   
   
   
   
   
}