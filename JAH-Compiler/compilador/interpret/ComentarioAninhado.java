package compilador.interpret;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.Token; 

public class ComentarioAninhado extends Lexer{

	static Deque<String> pilha = new ArrayDeque<String>(); 
	static int line = 0, position = 0 ;
	public ComentarioAninhado(java.io.PushbackReader in) {
		super(in);
	}
	
	int can_cont = 0; //flag para os coment�rios de bloco
	boolean csi_cont = false; //flag para o coment�rio de linha
	
	 @SuppressWarnings("unused")
	protected void filter(Token token) throws LexerException, IOException{
		
		 //System.out.println(token.getClass().getSimpleName());
		 switch (token.getClass().getSimpleName()) {
		     case "TVazio": // Se meu token for espa�o em branco, \t, \n ou \r\n, formato a sa�da pra imprimir bonitinho. 
		    	 if (csi_cont == false && can_cont == 0)
		    		 System.out.print(" "); break;
			 case "TTab":
				 if (csi_cont == false && can_cont == 0)	
					 System.out.print("\t"); break;
			 case "TNovalinha":
				 csi_cont = false;
				 if (csi_cont == false && can_cont == 0)
					 System.out.print("\n"); break; 
			 case "TRn":
				 csi_cont = false;
				 if (csi_cont == false && can_cont == 0)
					 System.out.print("\n"); break;
				 
			 case "TComentariosimples": // Se eu achar um coment�rio simples, ignoro todo o resto da linha
				 if (csi_cont == false && can_cont == 0) { // Atribuindo uma flag true a csi_cont. 
					 System.out.print("[" + token.getClass().getSimpleName() + "]");
				 }
				 csi_cont = true;  
				 break;
				  
				  
				  
			 case "TAbreblococomentario": //Se eu achar um TAbreBloco... inicio a flag can_cont que � respons�vel por armazenar quantos '/*' eu achei
				 pilha.push(token.getClass().getSimpleName());
				 line = token.getLine(); position = token.getPos(); //Salvo a linha e a coluna pra saber a posi��o exata do token na hora da impress�o
				 can_cont++; // e empilho o token 				 
				 //System.out.println("Can_cont: "+ can_cont + " Csi_cont: "+ csi_cont);
				 break;
				 
				 
				 
			 case "TFechablococomentario":
				 can_cont--;
				 //System.out.println("Can_cont: "+ can_cont + " Csi_cont: "+ csi_cont);
				 if(!pilha.isEmpty() && can_cont == 0) //Se eu tiver passado por algum TAbreBloco.. e a flag can_cont > 1, ent�o eu tenho um bloco dentro de outro bloco (que por consequ�ncia, � tratado como um coment�rio).
					 System.out.print("[TComentarioBloco]"); //Se o can_cont = 1, ent�o eu passei exatamente por um TAbreBloco, logo, a pilha n�o est� vazia e ao entrar no TFechaBloco, imprimo "Coment�rioBloco". 
				 else if(pilha.isEmpty()) // Se eu entrar em TFechaBloco.. e cair nesse if, significa que n�o passei por nenhum TAbreBloco.. logo, � um erro. 
					 System.out.println("\n\n\nERRO: Coment�rio n�o aninhado na linha "+ token.getLine() + " coluna " + token.getPos() + ": erro em " + token.getClass().getSimpleName());
				 
				 if(!pilha.isEmpty())
					 pilha.pop();
				 break;
			 default: //Se n�o for nenhum dos casos acima, � um token normal, logo se eu n�o estiver em um coment�rio de bloco ou de linha, imprimo o token. 
				 //System.out.println("Can_cont: "+ can_cont + " Csi_cont: "+ csi_cont);
				 if (can_cont == 0 && csi_cont == false)
					 System.out.print("[" + token.getClass().getSimpleName() + "]"); 	
				 break;
		 }
		 
		 if( can_cont < 0) {
			 can_cont = 0;
		 }
	 }
	
	 boolean pilhaVazia() {
		 if( pilha.isEmpty()) 
			 return true;
		 else
			 return false;
	 }
}