/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.Hashtable;

import compilador.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInicioProg(AInicioProg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariasVariaveisVar(AVariasVariaveisVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUmaVariavelVar(AUmaVariavelVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelVarOuVetor(AVariavelVarOuVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVarOuVetor(AVetorVarOuVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUmIdentificadorPosicao(AUmIdentificadorPosicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUmInteiroPosicao(AUmInteiroPosicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoCondicionalComandos(AComandoCondicionalComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariosComandosCondComando(AVariosComandosCondComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoVariavelComando(AAtribuicaoVariavelComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoLeiaComando(AComandoLeiaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoEscrevaComando(AComandoEscrevaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSeComando(AComandoSeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoAvalieComando(AComandoAvalieComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoEnquantoComando(AComandoEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoRepitaComando(AComandoRepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoPara1Comando(AComandoPara1Comando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoPassoComando(AComandoPassoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariasExpressoesExpEscreva(AVariasExpressoesExpEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUmaExpressaoExpEscreva(AUmaExpressaoExpEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpOuExplogica(AExpOuExplogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondicaoSeCondicaoSe(ACondicaoSeCondicaoSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACausaSeCausaSe(ACausaSeCausaSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSenaoSeComandoSenao(AComandoSenaoSeComandoSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSenaoAvalieComandoSenao(AComandoSenaoAvalieComandoSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondicaoAvalie(ACondicaoAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasosAvalie(ACasosAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariosCasesCondComandoCasos(AVariosCasesCondComandoCasos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoCaseComandoCaso(AComandoCaseComandoCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariosComandosParaCondComandoPara(AVariosComandosParaCondComandoPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoParaComandoPara(AComandoParaComandoPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoExp(AExpressaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpLogicaExp(AExpLogicaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpressao(ASomaExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubExpressao(ASubExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultExpressao(AMultExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivExpressao(ADivExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpressao(ATermoExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFinalTermo(AFinalTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorAninahdoExpressaoFinal(AValorAninahdoExpressaoFinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUmaVariavelExpressaoFinal(AUmaVariavelExpressaoFinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelNegativaExpressaoFinal(AVariavelNegativaExpressaoFinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFinalExpressaoFinal(AValorFinalExpressaoFinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExpLogica(AEExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoExpLogica(ANaoExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpAninhadaExpLogica(AExpAninhadaExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoLogicoExpLogica(ATermoLogicoExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorLogicoTermoLogico(AFatorLogicoTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualFatorLogico(AIgualFatorLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorFatorLogico(AMaiorFatorLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorFatorLogico(AMenorFatorLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorqFatorLogico(AMaiorqFatorLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorqFatorLogico(AMenorqFatorLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteFatorLogico(ADiferenteFatorLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATintTipo(ATintTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATfloatTipo(ATfloatTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATstrTipo(ATstrTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATboolTipo(ATboolTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntValor(AIntValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFloatValor(AFloatValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStrValor(AStrValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolValor(ABoolValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharValor(ACharValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimse(TFimse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimenquanto(TFimenquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimpara(TFimpara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimavalie(TFimavalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPare(TPare node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNulo(TNulo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRetorne(TRetorne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVerdadeiro(TVerdadeiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalso(TFalso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaioreq(TMaioreq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorq(TMenorq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSum(TSum node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSub(TSub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipointeiro(TTipointeiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTiporeal(TTiporeal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipocaractere(TTipocaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipobooleano(TTipobooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoevirgula(TPontoevirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechablococomentario(TFechablococomentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreblococomentario(TAbreblococomentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoispontos(TDoispontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentariosimples(TComentariosimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAparentese(TAparentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFparentese(TFparentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAcolchete(TAcolchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFcolchete(TFcolchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtrib(TAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAspasimples(TAspasimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAspasduplas(TAspasduplas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNovalinha(TNovalinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRn(TRn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
