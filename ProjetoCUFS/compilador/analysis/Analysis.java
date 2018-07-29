/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import compilador.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAInicioProg(AInicioProg node);
    void caseAVariaveisDeclaracao(AVariaveisDeclaracao node);
    void caseAConstanteDeclaracao(AConstanteDeclaracao node);
    void caseAVariasVariaveisVar(AVariasVariaveisVar node);
    void caseAUmaVariavelVar(AUmaVariavelVar node);
    void caseAVariavelVarOuVetor(AVariavelVarOuVetor node);
    void caseAVetorVarOuVetor(AVetorVarOuVetor node);
    void caseAUmIdentificadorPosicao(AUmIdentificadorPosicao node);
    void caseAUmInteiroPosicao(AUmInteiroPosicao node);
    void caseAComandoCondicionalComandos(AComandoCondicionalComandos node);
    void caseAVariosComandosCondComando(AVariosComandosCondComando node);
    void caseAAtribuicaoVariavelComando(AAtribuicaoVariavelComando node);
    void caseAComandoLeiaComando(AComandoLeiaComando node);
    void caseAComandoEscrevaComando(AComandoEscrevaComando node);
    void caseAComandoSeComando(AComandoSeComando node);
    void caseAComandoAvalieComando(AComandoAvalieComando node);
    void caseAComandoEnquantoComando(AComandoEnquantoComando node);
    void caseAComandoRepitaComando(AComandoRepitaComando node);
    void caseAComandoPara1Comando(AComandoPara1Comando node);
    void caseAComandoPara2Comando(AComandoPara2Comando node);
    void caseAVariasExpressoesExpEscreva(AVariasExpressoesExpEscreva node);
    void caseAUmaExpressaoExpEscreva(AUmaExpressaoExpEscreva node);
    void caseAExpOuExplogica(AExpOuExplogica node);
    void caseACondicaoSeCondicaoSe(ACondicaoSeCondicaoSe node);
    void caseACausaSeCausaSe(ACausaSeCausaSe node);
    void caseAComandoSenaoSeComandoSenao(AComandoSenaoSeComandoSenao node);
    void caseAComandoSenaoAvalieComandoSenao(AComandoSenaoAvalieComandoSenao node);
    void caseACondicaoAvalie(ACondicaoAvalie node);
    void caseACasosAvalie(ACasosAvalie node);
    void caseAVariosCasesCondComandoCasos(AVariosCasesCondComandoCasos node);
    void caseAComandoCaseComandoCaso(AComandoCaseComandoCaso node);
    void caseAVariosComandosParaCondComandoPara(AVariosComandosParaCondComandoPara node);
    void caseAComandoParaComandoPara(AComandoParaComandoPara node);
    void caseAExpressaoExp(AExpressaoExp node);
    void caseAExpLogicaExp(AExpLogicaExp node);
    void caseASomaExpressao(ASomaExpressao node);
    void caseASubExpressao(ASubExpressao node);
    void caseAMultExpressao(AMultExpressao node);
    void caseADivExpressao(ADivExpressao node);
    void caseATermoExpressao(ATermoExpressao node);
    void caseAFinalTermo(AFinalTermo node);
    void caseAValorAninahdoExpressaoFinal(AValorAninahdoExpressaoFinal node);
    void caseAUmaVariavelExpressaoFinal(AUmaVariavelExpressaoFinal node);
    void caseAVariavelNegativaExpressaoFinal(AVariavelNegativaExpressaoFinal node);
    void caseAValorFinalExpressaoFinal(AValorFinalExpressaoFinal node);
    void caseAEExpLogica(AEExpLogica node);
    void caseAOuExpLogica(AOuExpLogica node);
    void caseAXorExpLogica(AXorExpLogica node);
    void caseANaoExpLogica(ANaoExpLogica node);
    void caseAExpAninhadaExpLogica(AExpAninhadaExpLogica node);
    void caseATermoLogicoExpLogica(ATermoLogicoExpLogica node);
    void caseAFatorLogicoTermoLogico(AFatorLogicoTermoLogico node);
    void caseAIgualFatorLogico(AIgualFatorLogico node);
    void caseAMaiorFatorLogico(AMaiorFatorLogico node);
    void caseAMenorFatorLogico(AMenorFatorLogico node);
    void caseAMaiorqFatorLogico(AMaiorqFatorLogico node);
    void caseAMenorqFatorLogico(AMenorqFatorLogico node);
    void caseADiferenteFatorLogico(ADiferenteFatorLogico node);
    void caseATintTipo(ATintTipo node);
    void caseATfloatTipo(ATfloatTipo node);
    void caseATstrTipo(ATstrTipo node);
    void caseATboolTipo(ATboolTipo node);
    void caseAIntValor(AIntValor node);
    void caseAFloatValor(AFloatValor node);
    void caseAStrValor(AStrValor node);
    void caseABoolValor(ABoolValor node);
    void caseACharValor(ACharValor node);

    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTSe(TSe node);
    void caseTFimse(TFimse node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTFimenquanto(TFimenquanto node);
    void caseTPara(TPara node);
    void caseTDe(TDe node);
    void caseTPasso(TPasso node);
    void caseTFimpara(TFimpara node);
    void caseTAvalie(TAvalie node);
    void caseTFimavalie(TFimavalie node);
    void caseTCaso(TCaso node);
    void caseTPare(TPare node);
    void caseTRepita(TRepita node);
    void caseTAte(TAte node);
    void caseTPrograma(TPrograma node);
    void caseTLeia(TLeia node);
    void caseTEscreva(TEscreva node);
    void caseTConstante(TConstante node);
    void caseTNulo(TNulo node);
    void caseTRetorne(TRetorne node);
    void caseTFaca(TFaca node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTFalso(TFalso node);
    void caseTDiferente(TDiferente node);
    void caseTMaioreq(TMaioreq node);
    void caseTMenorq(TMenorq node);
    void caseTMaior(TMaior node);
    void caseTMenor(TMenor node);
    void caseTIgual(TIgual node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTSum(TSum node);
    void caseTSub(TSub node);
    void caseTMod(TMod node);
    void caseTNao(TNao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTTipointeiro(TTipointeiro node);
    void caseTTiporeal(TTiporeal node);
    void caseTTipocaractere(TTipocaractere node);
    void caseTTipobooleano(TTipobooleano node);
    void caseTVirgula(TVirgula node);
    void caseTPonto(TPonto node);
    void caseTPontoevirgula(TPontoevirgula node);
    void caseTFechablococomentario(TFechablococomentario node);
    void caseTAbreblococomentario(TAbreblococomentario node);
    void caseTDoispontos(TDoispontos node);
    void caseTComentariosimples(TComentariosimples node);
    void caseTAparentese(TAparentese node);
    void caseTFparentese(TFparentese node);
    void caseTAcolchete(TAcolchete node);
    void caseTFcolchete(TFcolchete node);
    void caseTAtrib(TAtrib node);
    void caseTAspasimples(TAspasimples node);
    void caseTAspasduplas(TAspasduplas node);
    void caseTNovalinha(TNovalinha node);
    void caseTVazio(TVazio node);
    void caseTTab(TTab node);
    void caseTRn(TRn node);
    void caseTId(TId node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTCaractere(TCaractere node);
    void caseTString(TString node);
    void caseTBooleano(TBooleano node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
