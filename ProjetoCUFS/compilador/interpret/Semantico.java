package compilador.interpret;

import java.util.ArrayList;
import java.util.HashMap;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.*;

public class Semantico extends DepthFirstAdapter {
	
		HashMap<String, Semantico> tabelaDeSimbolos; //variavel que deve conter os simbolos que vou lendo
		private ArrayList<String> erros = new ArrayList<>(); //essa daqui vai conter os erros que encontrar para exibir ao usuário
		
		
		public Semantico () {
			tabelaDeSimbolos = new HashMap<>();
		}
		
	
		public boolean adiciona_no_hash(String id) {
			if (tabelaDeSimbolos.containsKey(id))
				return false;
			else
				return true;
		}
		
		
		
		@Override
		public void outStart(Start node) {
		// TODO Auto-generated method stub
			String id = node.getPProg().toString();
			
			System.out.println(id);
			
			
		}
}



/* 


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@Override
		public void outAAtribuicaoVariavelComando(AAtribuicaoVariavelComando node) {
		// TODO Auto-generated method stub
		super.outAAtribuicaoVariavelComando(node);
		}
		
		@Override
		public void outABoolValor(ABoolValor node) {
		// TODO Auto-generated method stub
		super.outABoolValor(node);
		}
		
		@Override
		public void outACasosAvalie(ACasosAvalie node) {
		// TODO Auto-generated method stub
		super.outACasosAvalie(node);
		}
		
		@Override
		public void outACausaSeCausaSe(ACausaSeCausaSe node) {
		// TODO Auto-generated method stub
		super.outACausaSeCausaSe(node);
		}
		
		@Override
		public void outACharValor(ACharValor node) {
		// TODO Auto-generated method stub
		super.outACharValor(node);
		}
		
		@Override
		public void outAComandoAvalieComando(AComandoAvalieComando node) {
		// TODO Auto-generated method stub
		super.outAComandoAvalieComando(node);
		}
		
		@Override
		public void outAComandoCaseComandoCaso(AComandoCaseComandoCaso node) {
		// TODO Auto-generated method stub
		super.outAComandoCaseComandoCaso(node);
		}
		
		@Override
		public void outAComandoCondicionalComandos(AComandoCondicionalComandos node) {
		// TODO Auto-generated method stub
		super.outAComandoCondicionalComandos(node);
		}
		
		@Override
		public void outAComandoEnquantoComando(AComandoEnquantoComando node) {
		// TODO Auto-generated method stub
		super.outAComandoEnquantoComando(node);
		}
		
		@Override
		public void outAComandoEscrevaComando(AComandoEscrevaComando node) {
		// TODO Auto-generated method stub
		super.outAComandoEscrevaComando(node);
		}
		
		@Override
		public void outAComandoLeiaComando(AComandoLeiaComando node) {
		// TODO Auto-generated method stub
		super.outAComandoLeiaComando(node);
		}
		
		@Override
		public void outAComandoPara1Comando(AComandoPara1Comando node) {
		// TODO Auto-generated method stub
		super.outAComandoPara1Comando(node);
		}
		
		@Override
		public void outAComandoParaComandoPara(AComandoParaComandoPara node) {
		// TODO Auto-generated method stub
		super.outAComandoParaComandoPara(node);
		}
		
		@Override
		public void outAComandoPassoComando(AComandoPassoComando node) {
		// TODO Auto-generated method stub
		super.outAComandoPassoComando(node);
		}
		
		@Override
		public void outAComandoRepitaComando(AComandoRepitaComando node) {
		// TODO Auto-generated method stub
		super.outAComandoRepitaComando(node);
		}
		
		@Override
		public void outAComandoSeComando(AComandoSeComando node) {
		// TODO Auto-generated method stub
		super.outAComandoSeComando(node);
		}
		
		@Override
		public void outAComandoSenaoAvalieComandoSenao(AComandoSenaoAvalieComandoSenao node) {
		// TODO Auto-generated method stub
		super.outAComandoSenaoAvalieComandoSenao(node);
		}
		
		@Override
		public void outAComandoSenaoSeComandoSenao(AComandoSenaoSeComandoSenao node) {
		// TODO Auto-generated method stub
		super.outAComandoSenaoSeComandoSenao(node);
		}
		
		@Override
		public void outACondicaoAvalie(ACondicaoAvalie node) {
		// TODO Auto-generated method stub
		super.outACondicaoAvalie(node);
		}
		
		@Override
		public void outACondicaoSeCondicaoSe(ACondicaoSeCondicaoSe node) {
		// TODO Auto-generated method stub
		super.outACondicaoSeCondicaoSe(node);
		}
		
		@Override
		public void outAConstanteDeclaracao(AConstanteDeclaracao node) {
		// TODO Auto-generated method stub
		super.outAConstanteDeclaracao(node);
		}
		
		@Override
		public void outADiferenteFatorLogico(ADiferenteFatorLogico node) {
		// TODO Auto-generated method stub
		super.outADiferenteFatorLogico(node);
		}
		
		@Override
		public void outADivExpressao(ADivExpressao node) {
		// TODO Auto-generated method stub
		super.outADivExpressao(node);
		}
		
		@Override
		public void outAEExpLogica(AEExpLogica node) {
		// TODO Auto-generated method stub
		super.outAEExpLogica(node);
		}
		
		@Override
		public void outAExpAninhadaExpLogica(AExpAninhadaExpLogica node) {
		// TODO Auto-generated method stub
		super.outAExpAninhadaExpLogica(node);
		}
		
		@Override
		public void outAExpLogicaExp(AExpLogicaExp node) {
		// TODO Auto-generated method stub
		super.outAExpLogicaExp(node);
		}
		
		@Override
		public void outAExpOuExplogica(AExpOuExplogica node) {
		// TODO Auto-generated method stub
		super.outAExpOuExplogica(node);
		}
		
		@Override
		public void outAExpressaoExp(AExpressaoExp node) {
		// TODO Auto-generated method stub
		super.outAExpressaoExp(node);
		}
		
		@Override
		public void outAFatorLogicoTermoLogico(AFatorLogicoTermoLogico node) {
		// TODO Auto-generated method stub
		super.outAFatorLogicoTermoLogico(node);
		}
		
		@Override
		public void outAFinalTermo(AFinalTermo node) {
		// TODO Auto-generated method stub
		super.outAFinalTermo(node);
		}
		
		@Override
		public void outAFloatValor(AFloatValor node) {
		// TODO Auto-generated method stub
		super.outAFloatValor(node);
		}
		
		@Override
		public void outAIgualFatorLogico(AIgualFatorLogico node) {
		// TODO Auto-generated method stub
		super.outAIgualFatorLogico(node);
		}
		
		@Override
		public void outAInicioProg(AInicioProg node) {
		String programa = node.getDeclaracao().toString();
		}
		
		@Override
		public void outAIntValor(AIntValor node) {
		// TODO Auto-generated method stub
		super.outAIntValor(node);
		}
		
		@Override
		public void outAMaiorFatorLogico(AMaiorFatorLogico node) {
		// TODO Auto-generated method stub
		super.outAMaiorFatorLogico(node);
		}
		
		@Override
		public void outAMaiorqFatorLogico(AMaiorqFatorLogico node) {
		// TODO Auto-generated method stub
		super.outAMaiorqFatorLogico(node);
		}
		
		@Override
		public void outAMenorFatorLogico(AMenorFatorLogico node) {
		// TODO Auto-generated method stub
		super.outAMenorFatorLogico(node);
		}
		
		@Override
		public void outAMenorqFatorLogico(AMenorqFatorLogico node) {
		// TODO Auto-generated method stub
		super.outAMenorqFatorLogico(node);
		}
		
		@Override
		public void outAMultExpressao(AMultExpressao node) {
		// TODO Auto-generated method stub
		super.outAMultExpressao(node);
		}
		
		@Override
		public void outANaoExpLogica(ANaoExpLogica node) {
		// TODO Auto-generated method stub
		super.outANaoExpLogica(node);
		}
		
		@Override
		public void outAOuExpLogica(AOuExpLogica node) {
		// TODO Auto-generated method stub
		super.outAOuExpLogica(node);
		}
		
		@Override
		public void outASomaExpressao(ASomaExpressao node) {
		// TODO Auto-generated method stub
		super.outASomaExpressao(node);
		}
		
		@Override
		public void outAStrValor(AStrValor node) {
		// TODO Auto-generated method stub
		super.outAStrValor(node);
		}
		
		@Override
		public void outASubExpressao(ASubExpressao node) {
		// TODO Auto-generated method stub
		super.outASubExpressao(node);
		}
		
		@Override
		public void outATboolTipo(ATboolTipo node) {
		// TODO Auto-generated method stub
		super.outATboolTipo(node);
		}
		
		@Override
		public void outATermoExpressao(ATermoExpressao node) {
		// TODO Auto-generated method stub
		super.outATermoExpressao(node);
		}
		
		@Override
		public void outATermoLogicoExpLogica(ATermoLogicoExpLogica node) {
		// TODO Auto-generated method stub
		super.outATermoLogicoExpLogica(node);
		}
		
		@Override
		public void outATfloatTipo(ATfloatTipo node) {
		// TODO Auto-generated method stub
		super.outATfloatTipo(node);
		}
		
		@Override
		public void outATintTipo(ATintTipo node) {
		// TODO Auto-generated method stub
		super.outATintTipo(node);
		}
		
		@Override
		public void outATstrTipo(ATstrTipo node) {
		// TODO Auto-generated method stub
		super.outATstrTipo(node);
		}
		
		@Override
		public void outAUmaExpressaoExpEscreva(AUmaExpressaoExpEscreva node) {
		// TODO Auto-generated method stub
		super.outAUmaExpressaoExpEscreva(node);
		}
		
		@Override
		public void outAUmaVariavelExpressaoFinal(AUmaVariavelExpressaoFinal node) {
		// TODO Auto-generated method stub
		super.outAUmaVariavelExpressaoFinal(node);
		}
		
		@Override
		public void outAUmaVariavelVar(AUmaVariavelVar node) {
		// TODO Auto-generated method stub
		super.outAUmaVariavelVar(node);
		}
		
		@Override
		public void outAUmIdentificadorPosicao(AUmIdentificadorPosicao node) {
		// TODO Auto-generated method stub
		super.outAUmIdentificadorPosicao(node);
		}
		
		@Override
		public void outAUmInteiroPosicao(AUmInteiroPosicao node) {
		// TODO Auto-generated method stub
		super.outAUmInteiroPosicao(node);
		}
		
		@Override
		public void outAValorAninahdoExpressaoFinal(AValorAninahdoExpressaoFinal node) {
		// TODO Auto-generated method stub
		super.outAValorAninahdoExpressaoFinal(node);
		}
		
		@Override
		public void outAValorFinalExpressaoFinal(AValorFinalExpressaoFinal node) {
		// TODO Auto-generated method stub
		super.outAValorFinalExpressaoFinal(node);
		}
		
		@Override
		public void outAVariasExpressoesExpEscreva(AVariasExpressoesExpEscreva node) {
		// TODO Auto-generated method stub
		super.outAVariasExpressoesExpEscreva(node);
		}
		
		@Override
		public void outAVariasVariaveisVar(AVariasVariaveisVar node) {
		// TODO Auto-generated method stub
		super.outAVariasVariaveisVar(node);
		}
		
		@Override
		public void outAVariaveisDeclaracao(AVariaveisDeclaracao node) {
		// TODO Auto-generated method stub
		super.outAVariaveisDeclaracao(node);
		}
		
		@Override
		public void outAVariavelNegativaExpressaoFinal(AVariavelNegativaExpressaoFinal node) {
		// TODO Auto-generated method stub
		super.outAVariavelNegativaExpressaoFinal(node);
		}
		
		@Override
		public void outAVariavelVarOuVetor(AVariavelVarOuVetor node) {
		// TODO Auto-generated method stub
		super.outAVariavelVarOuVetor(node);
		}
		
		@Override
		public void outAVariosCasesCondComandoCasos(AVariosCasesCondComandoCasos node) {
		// TODO Auto-generated method stub
		super.outAVariosCasesCondComandoCasos(node);
		}
		
		@Override
		public void outAVariosComandosCondComando(AVariosComandosCondComando node) {
		// TODO Auto-generated method stub
		super.outAVariosComandosCondComando(node);
		}
		
		@Override
		public void outAVariosComandosParaCondComandoPara(AVariosComandosParaCondComandoPara node) {
		// TODO Auto-generated method stub
		super.outAVariosComandosParaCondComandoPara(node);
		}
		
		@Override
		public void outAVetorVarOuVetor(AVetorVarOuVetor node) {
		// TODO Auto-generated method stub
		super.outAVetorVarOuVetor(node);
		}
		
		@Override
		public void outAXorExpLogica(AXorExpLogica node) {
		// TODO Auto-generated method stub
		super.outAXorExpLogica(node);
		}
				
}



*/