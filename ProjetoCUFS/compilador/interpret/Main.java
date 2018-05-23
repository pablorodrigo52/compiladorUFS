package compilador.interpret;

import compilador.parser.* ; 
import compilador.lexer.* ; 
import compilador.node.* ; 
  
import java.io.* ;

import javax.swing.text.StyledEditorKit.ForegroundAction; 
  
public class Main { 
   public static void main(String[] args) { 
      if (args.length > 0) { 
         try { 
            /* Form our AST */ 
            Lexer lexer = new Lexer (new PushbackReader( 
               new FileReader(args[0]), 1024));
            
            /* ei, basicamente é isso abaixo que vc vai fazer no loop
            se ligue que ele ta imprimindo "TVazio" no lugar dos espaços, isso é normal
            eu ouvi o professor conversando com o pessoal, toda vez que aparecer um "TVazio"
            vc substitui na impressão por " ", pra dar o espaçamento.
            Lembre também que ao invés de imprimir um item abaixo do outro, como estamos fazendo agora,
            vc deve imprimir uma linha completa, depois outra linha completa, etc.. por exemplo:
            
            Linha 1 - TString TSum TInteiro TIgual TInteiro TPontoevirgula
            Linha 2 - TTipointeiro TId TPontoevirgula
            */
                       
            /* tem que ver uma forma de de pegar o tamanho dinamico e tirar esse 14 estatico
               a questao de imprimir na mesma linha "sdfhksdgfhsf jdhfdgfhdfg hgfhdgfdhf" era o print mesmo
               ainda nao consegui tirar esse TVazio
           
            */
            for (int i = 0; i < 14; i++) {
            	Token token = lexer.peek();
            	lexer.next();
            	System.out.print(token.getClass().getSimpleName());
			}		
            
            
           /*Token token1 = lexer.peek();
            lexer.next();
            System.out.println(token1.getClass().getSimpleName());
            Token token2 = lexer.peek();
            lexer.next();
            System.out.println(token2.getClass().getSimpleName());
            Token token3 = lexer.peek();
            lexer.next();
            System.out.println(token3.getClass().getSimpleName());
            Token token4 = lexer.peek();
            lexer.next();
            System.out.println(token4.getClass().getSimpleName());
            Token token5 = lexer.peek();
            lexer.next();
            System.out.println(token5.getClass().getSimpleName());
            Token token6 = lexer.peek();
            lexer.next();
            System.out.println(token6.getClass().getSimpleName());
            Token token7 = lexer.peek();
            lexer.next();
            System.out.println(token7.getClass().getSimpleName());
            Token token8 = lexer.peek();
            lexer.next();
            System.out.println(token8.getClass().getSimpleName());
            Token token9 = lexer.peek();
            lexer.next();
            System.out.println(token9.getClass().getSimpleName());
            Token token10 = lexer.peek();
            lexer.next();
            System.out.println(token10.getClass().getSimpleName());
            Token token11 = lexer.peek();
            lexer.next();
            System.out.println(token11.getClass().getSimpleName());
            Token token12 = lexer.peek();
            lexer.next();
            System.out.println(token12.getClass().getSimpleName());
            Token token13 = lexer.peek();
            System.out.println(token13.getClass().getSimpleName());
            lexer.next();
            Token token14 = lexer.peek();
            lexer.next();
            System.out.println(token14.getClass().getSimpleName());
            Token token15 = lexer.peek();
            lexer.next();
            System.out.println(token15.getClass().getSimpleName());
            
            */
            //Parser parser = new Parser(lexer); 
            //Start ast = parser.parse() ; 
            /* Get our Interpreter going. */ 
            //Interpreter interp = new Interpreter () ; 
            //ast.apply(interp) ; 
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