package compilador.interpret;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.Token; 

public class ComentarioAninhado extends Lexer{

	Deque<String> pilha = new ArrayDeque<String>(); 
	int line = 0, position = 0 ;
	public ComentarioAninhado(java.io.PushbackReader in) {
		super(in);
	}
	
	int can_cont = 0;
	int csi_cont = 0;
	
	 @SuppressWarnings("unused")
	protected void filter(Token token) throws LexerException, IOException{
		
		 switch (token.getClass().getSimpleName()) {
			
		     case "TVazio":
				 System.out.print(" "); break;
			 case "TTab":
				 System.out.print("\t"); break;
			 case "TNovalinha":
				 System.out.print("\n"); break;
			 case "TRn":
				 System.out.print("\n"); break; 
				 
			 case "TAbreblococomentario":
			
				 can_cont++;
				 pilha.push(token.getClass().getSimpleName());
				 line = token.getLine(); position = token.getPos();
				 System.out.print("[" + token.getClass().getSimpleName() + "]"); break;
			 
			 case "TFechablococomentario":
				 
				 can_cont--;
				 System.out.print("[" + token.getClass().getSimpleName() + "]");
		     		if(!pilha.isEmpty())
		     			pilha.pop();
		     		else {
		     			System.out.println("\n\n\nERRO: Comentário não aninhado na linha "+ token.getLine() + " coluna " + token.getPos());
		     		}
		          break;
			 
			 default:
				
				 if (can_cont == 0) {
					 System.out.print("[" + token.getClass().getSimpleName() + "]"); 	
				 }
			     	 
				 break;
		 }
	 }
	
	 boolean pilhaVazia() {
		 if( pilha.isEmpty()) 
			 return true;
		 else
			 return false;
	 }
}

