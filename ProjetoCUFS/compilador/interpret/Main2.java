package compilador.interpret;

import compilador.parser.*;
import compilador.node.Start;

import java.io.FileReader;
import java.io.PushbackReader;

import compilador.lexer.*;
import compilador.node.*;
import compilador.lexer.*;

class Main2 {
	public static void main(String[] args) {
		try {
			String arquivo = "arquivoTeste.sa";
			Lexer lexer = new Lexer(new PushbackReader(new FileReader(arquivo), 1024));

			// Token token;
			while (true) {
				try {
					// token = lexer.next();
					Parser parser = new Parser(lexer);
					parser.parse();
				} catch (LexerException e) {
					// token = lexer.next();
					System.out.print(e.getMessage());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
}