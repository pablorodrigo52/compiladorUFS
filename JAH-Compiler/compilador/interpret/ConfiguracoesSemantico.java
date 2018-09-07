package compilador.interpret;

public class ConfiguracoesSemantico {

	
	
	public String[] splitter(String palavras) {
		
		String[] palavra = palavras.split(" ");
		
		for(int i = 0; i < palavra.length; i++) 
			palavra[i] = palavra[i].replaceAll(" ", "");
		
		return palavra;
	}
}
