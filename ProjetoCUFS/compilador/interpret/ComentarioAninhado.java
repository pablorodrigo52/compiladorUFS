package compilador.interpret;

import compilador.lexer.*;

public class ComentarioAninhado extends Lexer
{ 
	// Definimos o construtor
	public ComentarioAninhado(java.io.PushbackReader in)
	{ 
		super(in);
	}

	// Definimos um filtro que reconhece comentarios aninhados
	@Override
	protected void filter() throws LexerException
	{ 
		//Coloque o c�digo aqui...
		
	}
}
