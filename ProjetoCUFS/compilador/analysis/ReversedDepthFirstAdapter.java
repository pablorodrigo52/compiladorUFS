/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProg().apply(this);
        outStart(node);
    }

    public void inAInicioProg(AInicioProg node)
    {
        defaultIn(node);
    }

    public void outAInicioProg(AInicioProg node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInicioProg(AInicioProg node)
    {
        inAInicioProg(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            Collections.reverse(copy);
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        outAInicioProg(node);
    }

    public void inAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        inAVariaveisDeclaracao(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariaveisDeclaracao(node);
    }

    public void inAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        inAConstanteDeclaracao(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAConstanteDeclaracao(node);
    }

    public void inAVariasVariaveisVar(AVariasVariaveisVar node)
    {
        defaultIn(node);
    }

    public void outAVariasVariaveisVar(AVariasVariaveisVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariasVariaveisVar(AVariasVariaveisVar node)
    {
        inAVariasVariaveisVar(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getVarOuVetor() != null)
        {
            node.getVarOuVetor().apply(this);
        }
        outAVariasVariaveisVar(node);
    }

    public void inAUmaVariavelVar(AUmaVariavelVar node)
    {
        defaultIn(node);
    }

    public void outAUmaVariavelVar(AUmaVariavelVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmaVariavelVar(AUmaVariavelVar node)
    {
        inAUmaVariavelVar(node);
        if(node.getVarOuVetor() != null)
        {
            node.getVarOuVetor().apply(this);
        }
        outAUmaVariavelVar(node);
    }

    public void inAVariavelVarOuVetor(AVariavelVarOuVetor node)
    {
        defaultIn(node);
    }

    public void outAVariavelVarOuVetor(AVariavelVarOuVetor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelVarOuVetor(AVariavelVarOuVetor node)
    {
        inAVariavelVarOuVetor(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVariavelVarOuVetor(node);
    }

    public void inAVetorVarOuVetor(AVetorVarOuVetor node)
    {
        defaultIn(node);
    }

    public void outAVetorVarOuVetor(AVetorVarOuVetor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVarOuVetor(AVetorVarOuVetor node)
    {
        inAVetorVarOuVetor(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVetorVarOuVetor(node);
    }

    public void inAUmIdentificadorPosicao(AUmIdentificadorPosicao node)
    {
        defaultIn(node);
    }

    public void outAUmIdentificadorPosicao(AUmIdentificadorPosicao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmIdentificadorPosicao(AUmIdentificadorPosicao node)
    {
        inAUmIdentificadorPosicao(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAUmIdentificadorPosicao(node);
    }

    public void inAUmInteiroPosicao(AUmInteiroPosicao node)
    {
        defaultIn(node);
    }

    public void outAUmInteiroPosicao(AUmInteiroPosicao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmInteiroPosicao(AUmInteiroPosicao node)
    {
        inAUmInteiroPosicao(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAUmInteiroPosicao(node);
    }

    public void inAComandoCondicionalComandos(AComandoCondicionalComandos node)
    {
        defaultIn(node);
    }

    public void outAComandoCondicionalComandos(AComandoCondicionalComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoCondicionalComandos(AComandoCondicionalComandos node)
    {
        inAComandoCondicionalComandos(node);
        if(node.getCondComando() != null)
        {
            node.getCondComando().apply(this);
        }
        outAComandoCondicionalComandos(node);
    }

    public void inAVariosComandosCondComando(AVariosComandosCondComando node)
    {
        defaultIn(node);
    }

    public void outAVariosComandosCondComando(AVariosComandosCondComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariosComandosCondComando(AVariosComandosCondComando node)
    {
        inAVariosComandosCondComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAVariosComandosCondComando(node);
    }

    public void inAAtribuicaoVariavelComando(AAtribuicaoVariavelComando node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoVariavelComando(AAtribuicaoVariavelComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoVariavelComando(AAtribuicaoVariavelComando node)
    {
        inAAtribuicaoVariavelComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAtribuicaoVariavelComando(node);
    }

    public void inAComandoLeiaComando(AComandoLeiaComando node)
    {
        defaultIn(node);
    }

    public void outAComandoLeiaComando(AComandoLeiaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoLeiaComando(AComandoLeiaComando node)
    {
        inAComandoLeiaComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAComandoLeiaComando(node);
    }

    public void inAComandoEscrevaComando(AComandoEscrevaComando node)
    {
        defaultIn(node);
    }

    public void outAComandoEscrevaComando(AComandoEscrevaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoEscrevaComando(AComandoEscrevaComando node)
    {
        inAComandoEscrevaComando(node);
        if(node.getExpEscreva() != null)
        {
            node.getExpEscreva().apply(this);
        }
        outAComandoEscrevaComando(node);
    }

    public void inAComandoSeComando(AComandoSeComando node)
    {
        defaultIn(node);
    }

    public void outAComandoSeComando(AComandoSeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoSeComando(AComandoSeComando node)
    {
        inAComandoSeComando(node);
        if(node.getCausaSe() != null)
        {
            node.getCausaSe().apply(this);
        }
        if(node.getCondicaoSe() != null)
        {
            node.getCondicaoSe().apply(this);
        }
        outAComandoSeComando(node);
    }

    public void inAComandoAvalieComando(AComandoAvalieComando node)
    {
        defaultIn(node);
    }

    public void outAComandoAvalieComando(AComandoAvalieComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoAvalieComando(AComandoAvalieComando node)
    {
        inAComandoAvalieComando(node);
        if(node.getCasosAvalie() != null)
        {
            node.getCasosAvalie().apply(this);
        }
        if(node.getCondicaoAvalie() != null)
        {
            node.getCondicaoAvalie().apply(this);
        }
        outAComandoAvalieComando(node);
    }

    public void inAComandoEnquantoComando(AComandoEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAComandoEnquantoComando(AComandoEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoEnquantoComando(AComandoEnquantoComando node)
    {
        inAComandoEnquantoComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getCondicaoSe() != null)
        {
            node.getCondicaoSe().apply(this);
        }
        outAComandoEnquantoComando(node);
    }

    public void inAComandoRepitaComando(AComandoRepitaComando node)
    {
        defaultIn(node);
    }

    public void outAComandoRepitaComando(AComandoRepitaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoRepitaComando(AComandoRepitaComando node)
    {
        inAComandoRepitaComando(node);
        if(node.getCondicaoSe() != null)
        {
            node.getCondicaoSe().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAComandoRepitaComando(node);
    }

    public void inAComandoPara1Comando(AComandoPara1Comando node)
    {
        defaultIn(node);
    }

    public void outAComandoPara1Comando(AComandoPara1Comando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoPara1Comando(AComandoPara1Comando node)
    {
        inAComandoPara1Comando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getFrist() != null)
        {
            node.getFrist().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAComandoPara1Comando(node);
    }

    public void inAComandoPassoComando(AComandoPassoComando node)
    {
        defaultIn(node);
    }

    public void outAComandoPassoComando(AComandoPassoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoPassoComando(AComandoPassoComando node)
    {
        inAComandoPassoComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getSeventh() != null)
        {
            node.getSeventh().apply(this);
        }
        if(node.getSixth() != null)
        {
            node.getSixth().apply(this);
        }
        if(node.getFifth() != null)
        {
            node.getFifth().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAComandoPassoComando(node);
    }

    public void inAVariasExpressoesExpEscreva(AVariasExpressoesExpEscreva node)
    {
        defaultIn(node);
    }

    public void outAVariasExpressoesExpEscreva(AVariasExpressoesExpEscreva node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariasExpressoesExpEscreva(AVariasExpressoesExpEscreva node)
    {
        inAVariasExpressoesExpEscreva(node);
        if(node.getExpEscreva() != null)
        {
            node.getExpEscreva().apply(this);
        }
        if(node.getExpOuExplogica() != null)
        {
            node.getExpOuExplogica().apply(this);
        }
        outAVariasExpressoesExpEscreva(node);
    }

    public void inAUmaExpressaoExpEscreva(AUmaExpressaoExpEscreva node)
    {
        defaultIn(node);
    }

    public void outAUmaExpressaoExpEscreva(AUmaExpressaoExpEscreva node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmaExpressaoExpEscreva(AUmaExpressaoExpEscreva node)
    {
        inAUmaExpressaoExpEscreva(node);
        if(node.getExpOuExplogica() != null)
        {
            node.getExpOuExplogica().apply(this);
        }
        outAUmaExpressaoExpEscreva(node);
    }

    public void inAExpOuExplogica(AExpOuExplogica node)
    {
        defaultIn(node);
    }

    public void outAExpOuExplogica(AExpOuExplogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpOuExplogica(AExpOuExplogica node)
    {
        inAExpOuExplogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpOuExplogica(node);
    }

    public void inACondicaoSeCondicaoSe(ACondicaoSeCondicaoSe node)
    {
        defaultIn(node);
    }

    public void outACondicaoSeCondicaoSe(ACondicaoSeCondicaoSe node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondicaoSeCondicaoSe(ACondicaoSeCondicaoSe node)
    {
        inACondicaoSeCondicaoSe(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outACondicaoSeCondicaoSe(node);
    }

    public void inACausaSeCausaSe(ACausaSeCausaSe node)
    {
        defaultIn(node);
    }

    public void outACausaSeCausaSe(ACausaSeCausaSe node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACausaSeCausaSe(ACausaSeCausaSe node)
    {
        inACausaSeCausaSe(node);
        if(node.getComandoSenao() != null)
        {
            node.getComandoSenao().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outACausaSeCausaSe(node);
    }

    public void inAComandoSenaoSeComandoSenao(AComandoSenaoSeComandoSenao node)
    {
        defaultIn(node);
    }

    public void outAComandoSenaoSeComandoSenao(AComandoSenaoSeComandoSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoSenaoSeComandoSenao(AComandoSenaoSeComandoSenao node)
    {
        inAComandoSenaoSeComandoSenao(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAComandoSenaoSeComandoSenao(node);
    }

    public void inAComandoSenaoAvalieComandoSenao(AComandoSenaoAvalieComandoSenao node)
    {
        defaultIn(node);
    }

    public void outAComandoSenaoAvalieComandoSenao(AComandoSenaoAvalieComandoSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoSenaoAvalieComandoSenao(AComandoSenaoAvalieComandoSenao node)
    {
        inAComandoSenaoAvalieComandoSenao(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAComandoSenaoAvalieComandoSenao(node);
    }

    public void inACondicaoAvalie(ACondicaoAvalie node)
    {
        defaultIn(node);
    }

    public void outACondicaoAvalie(ACondicaoAvalie node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondicaoAvalie(ACondicaoAvalie node)
    {
        inACondicaoAvalie(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outACondicaoAvalie(node);
    }

    public void inACasosAvalie(ACasosAvalie node)
    {
        defaultIn(node);
    }

    public void outACasosAvalie(ACasosAvalie node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACasosAvalie(ACasosAvalie node)
    {
        inACasosAvalie(node);
        if(node.getComandoSenao() != null)
        {
            node.getComandoSenao().apply(this);
        }
        if(node.getCondComandoCasos() != null)
        {
            node.getCondComandoCasos().apply(this);
        }
        outACasosAvalie(node);
    }

    public void inAVariosCasesCondComandoCasos(AVariosCasesCondComandoCasos node)
    {
        defaultIn(node);
    }

    public void outAVariosCasesCondComandoCasos(AVariosCasesCondComandoCasos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariosCasesCondComandoCasos(AVariosCasesCondComandoCasos node)
    {
        inAVariosCasesCondComandoCasos(node);
        {
            List<PComandoCaso> copy = new ArrayList<PComandoCaso>(node.getComandoCaso());
            Collections.reverse(copy);
            for(PComandoCaso e : copy)
            {
                e.apply(this);
            }
        }
        outAVariosCasesCondComandoCasos(node);
    }

    public void inAComandoCaseComandoCaso(AComandoCaseComandoCaso node)
    {
        defaultIn(node);
    }

    public void outAComandoCaseComandoCaso(AComandoCaseComandoCaso node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoCaseComandoCaso(AComandoCaseComandoCaso node)
    {
        inAComandoCaseComandoCaso(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAComandoCaseComandoCaso(node);
    }

    public void inAVariosComandosParaCondComandoPara(AVariosComandosParaCondComandoPara node)
    {
        defaultIn(node);
    }

    public void outAVariosComandosParaCondComandoPara(AVariosComandosParaCondComandoPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariosComandosParaCondComandoPara(AVariosComandosParaCondComandoPara node)
    {
        inAVariosComandosParaCondComandoPara(node);
        {
            List<PComandoPara> copy = new ArrayList<PComandoPara>(node.getComandoPara());
            Collections.reverse(copy);
            for(PComandoPara e : copy)
            {
                e.apply(this);
            }
        }
        outAVariosComandosParaCondComandoPara(node);
    }

    public void inAComandoParaComandoPara(AComandoParaComandoPara node)
    {
        defaultIn(node);
    }

    public void outAComandoParaComandoPara(AComandoParaComandoPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoParaComandoPara(AComandoParaComandoPara node)
    {
        inAComandoParaComandoPara(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAComandoParaComandoPara(node);
    }

    public void inAExpressaoExp(AExpressaoExp node)
    {
        defaultIn(node);
    }

    public void outAExpressaoExp(AExpressaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoExp(AExpressaoExp node)
    {
        inAExpressaoExp(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAExpressaoExp(node);
    }

    public void inAExpLogicaExp(AExpLogicaExp node)
    {
        defaultIn(node);
    }

    public void outAExpLogicaExp(AExpLogicaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogicaExp(AExpLogicaExp node)
    {
        inAExpLogicaExp(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExpLogicaExp(node);
    }

    public void inASomaExpressao(ASomaExpressao node)
    {
        defaultIn(node);
    }

    public void outASomaExpressao(ASomaExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExpressao(ASomaExpressao node)
    {
        inASomaExpressao(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outASomaExpressao(node);
    }

    public void inASubExpressao(ASubExpressao node)
    {
        defaultIn(node);
    }

    public void outASubExpressao(ASubExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubExpressao(ASubExpressao node)
    {
        inASubExpressao(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outASubExpressao(node);
    }

    public void inAMultExpressao(AMultExpressao node)
    {
        defaultIn(node);
    }

    public void outAMultExpressao(AMultExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExpressao(AMultExpressao node)
    {
        inAMultExpressao(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAMultExpressao(node);
    }

    public void inADivExpressao(ADivExpressao node)
    {
        defaultIn(node);
    }

    public void outADivExpressao(ADivExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExpressao(ADivExpressao node)
    {
        inADivExpressao(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outADivExpressao(node);
    }

    public void inATermoExpressao(ATermoExpressao node)
    {
        defaultIn(node);
    }

    public void outATermoExpressao(ATermoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoExpressao(ATermoExpressao node)
    {
        inATermoExpressao(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outATermoExpressao(node);
    }

    public void inAFinalTermo(AFinalTermo node)
    {
        defaultIn(node);
    }

    public void outAFinalTermo(AFinalTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFinalTermo(AFinalTermo node)
    {
        inAFinalTermo(node);
        if(node.getExpressaoFinal() != null)
        {
            node.getExpressaoFinal().apply(this);
        }
        outAFinalTermo(node);
    }

    public void inAValorAninahdoExpressaoFinal(AValorAninahdoExpressaoFinal node)
    {
        defaultIn(node);
    }

    public void outAValorAninahdoExpressaoFinal(AValorAninahdoExpressaoFinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorAninahdoExpressaoFinal(AValorAninahdoExpressaoFinal node)
    {
        inAValorAninahdoExpressaoFinal(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAValorAninahdoExpressaoFinal(node);
    }

    public void inAUmaVariavelExpressaoFinal(AUmaVariavelExpressaoFinal node)
    {
        defaultIn(node);
    }

    public void outAUmaVariavelExpressaoFinal(AUmaVariavelExpressaoFinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmaVariavelExpressaoFinal(AUmaVariavelExpressaoFinal node)
    {
        inAUmaVariavelExpressaoFinal(node);
        if(node.getVarOuVetor() != null)
        {
            node.getVarOuVetor().apply(this);
        }
        outAUmaVariavelExpressaoFinal(node);
    }

    public void inAVariavelNegativaExpressaoFinal(AVariavelNegativaExpressaoFinal node)
    {
        defaultIn(node);
    }

    public void outAVariavelNegativaExpressaoFinal(AVariavelNegativaExpressaoFinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelNegativaExpressaoFinal(AVariavelNegativaExpressaoFinal node)
    {
        inAVariavelNegativaExpressaoFinal(node);
        if(node.getExpressaoFinal() != null)
        {
            node.getExpressaoFinal().apply(this);
        }
        outAVariavelNegativaExpressaoFinal(node);
    }

    public void inAValorFinalExpressaoFinal(AValorFinalExpressaoFinal node)
    {
        defaultIn(node);
    }

    public void outAValorFinalExpressaoFinal(AValorFinalExpressaoFinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorFinalExpressaoFinal(AValorFinalExpressaoFinal node)
    {
        inAValorFinalExpressaoFinal(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorFinalExpressaoFinal(node);
    }

    public void inAEExpLogica(AEExpLogica node)
    {
        defaultIn(node);
    }

    public void outAEExpLogica(AEExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpLogica(AEExpLogica node)
    {
        inAEExpLogica(node);
        if(node.getTermoLogico() != null)
        {
            node.getTermoLogico().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAEExpLogica(node);
    }

    public void inAOuExpLogica(AOuExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOuExpLogica(AOuExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        inAOuExpLogica(node);
        if(node.getTermoLogico() != null)
        {
            node.getTermoLogico().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAOuExpLogica(node);
    }

    public void inAXorExpLogica(AXorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpLogica(AXorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        inAXorExpLogica(node);
        if(node.getTermoLogico() != null)
        {
            node.getTermoLogico().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAXorExpLogica(node);
    }

    public void inANaoExpLogica(ANaoExpLogica node)
    {
        defaultIn(node);
    }

    public void outANaoExpLogica(ANaoExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoExpLogica(ANaoExpLogica node)
    {
        inANaoExpLogica(node);
        if(node.getTermoLogico() != null)
        {
            node.getTermoLogico().apply(this);
        }
        outANaoExpLogica(node);
    }

    public void inAExpAninhadaExpLogica(AExpAninhadaExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpAninhadaExpLogica(AExpAninhadaExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpAninhadaExpLogica(AExpAninhadaExpLogica node)
    {
        inAExpAninhadaExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExpAninhadaExpLogica(node);
    }

    public void inATermoLogicoExpLogica(ATermoLogicoExpLogica node)
    {
        defaultIn(node);
    }

    public void outATermoLogicoExpLogica(ATermoLogicoExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoLogicoExpLogica(ATermoLogicoExpLogica node)
    {
        inATermoLogicoExpLogica(node);
        if(node.getTermoLogico() != null)
        {
            node.getTermoLogico().apply(this);
        }
        outATermoLogicoExpLogica(node);
    }

    public void inAFatorLogicoTermoLogico(AFatorLogicoTermoLogico node)
    {
        defaultIn(node);
    }

    public void outAFatorLogicoTermoLogico(AFatorLogicoTermoLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorLogicoTermoLogico(AFatorLogicoTermoLogico node)
    {
        inAFatorLogicoTermoLogico(node);
        if(node.getFatorLogico() != null)
        {
            node.getFatorLogico().apply(this);
        }
        outAFatorLogicoTermoLogico(node);
    }

    public void inAIgualFatorLogico(AIgualFatorLogico node)
    {
        defaultIn(node);
    }

    public void outAIgualFatorLogico(AIgualFatorLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualFatorLogico(AIgualFatorLogico node)
    {
        inAIgualFatorLogico(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAIgualFatorLogico(node);
    }

    public void inAMaiorFatorLogico(AMaiorFatorLogico node)
    {
        defaultIn(node);
    }

    public void outAMaiorFatorLogico(AMaiorFatorLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorFatorLogico(AMaiorFatorLogico node)
    {
        inAMaiorFatorLogico(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAMaiorFatorLogico(node);
    }

    public void inAMenorFatorLogico(AMenorFatorLogico node)
    {
        defaultIn(node);
    }

    public void outAMenorFatorLogico(AMenorFatorLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorFatorLogico(AMenorFatorLogico node)
    {
        inAMenorFatorLogico(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAMenorFatorLogico(node);
    }

    public void inAMaiorqFatorLogico(AMaiorqFatorLogico node)
    {
        defaultIn(node);
    }

    public void outAMaiorqFatorLogico(AMaiorqFatorLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorqFatorLogico(AMaiorqFatorLogico node)
    {
        inAMaiorqFatorLogico(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAMaiorqFatorLogico(node);
    }

    public void inAMenorqFatorLogico(AMenorqFatorLogico node)
    {
        defaultIn(node);
    }

    public void outAMenorqFatorLogico(AMenorqFatorLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorqFatorLogico(AMenorqFatorLogico node)
    {
        inAMenorqFatorLogico(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAMenorqFatorLogico(node);
    }

    public void inADiferenteFatorLogico(ADiferenteFatorLogico node)
    {
        defaultIn(node);
    }

    public void outADiferenteFatorLogico(ADiferenteFatorLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteFatorLogico(ADiferenteFatorLogico node)
    {
        inADiferenteFatorLogico(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outADiferenteFatorLogico(node);
    }

    public void inATintTipo(ATintTipo node)
    {
        defaultIn(node);
    }

    public void outATintTipo(ATintTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATintTipo(ATintTipo node)
    {
        inATintTipo(node);
        if(node.getTipointeiro() != null)
        {
            node.getTipointeiro().apply(this);
        }
        outATintTipo(node);
    }

    public void inATfloatTipo(ATfloatTipo node)
    {
        defaultIn(node);
    }

    public void outATfloatTipo(ATfloatTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATfloatTipo(ATfloatTipo node)
    {
        inATfloatTipo(node);
        if(node.getTiporeal() != null)
        {
            node.getTiporeal().apply(this);
        }
        outATfloatTipo(node);
    }

    public void inATstrTipo(ATstrTipo node)
    {
        defaultIn(node);
    }

    public void outATstrTipo(ATstrTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATstrTipo(ATstrTipo node)
    {
        inATstrTipo(node);
        if(node.getTipocaractere() != null)
        {
            node.getTipocaractere().apply(this);
        }
        outATstrTipo(node);
    }

    public void inATboolTipo(ATboolTipo node)
    {
        defaultIn(node);
    }

    public void outATboolTipo(ATboolTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATboolTipo(ATboolTipo node)
    {
        inATboolTipo(node);
        if(node.getTipobooleano() != null)
        {
            node.getTipobooleano().apply(this);
        }
        outATboolTipo(node);
    }

    public void inAIntValor(AIntValor node)
    {
        defaultIn(node);
    }

    public void outAIntValor(AIntValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntValor(AIntValor node)
    {
        inAIntValor(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAIntValor(node);
    }

    public void inAFloatValor(AFloatValor node)
    {
        defaultIn(node);
    }

    public void outAFloatValor(AFloatValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFloatValor(AFloatValor node)
    {
        inAFloatValor(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outAFloatValor(node);
    }

    public void inAStrValor(AStrValor node)
    {
        defaultIn(node);
    }

    public void outAStrValor(AStrValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStrValor(AStrValor node)
    {
        inAStrValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStrValor(node);
    }

    public void inABoolValor(ABoolValor node)
    {
        defaultIn(node);
    }

    public void outABoolValor(ABoolValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolValor(ABoolValor node)
    {
        inABoolValor(node);
        if(node.getBooleano() != null)
        {
            node.getBooleano().apply(this);
        }
        outABoolValor(node);
    }

    public void inACharValor(ACharValor node)
    {
        defaultIn(node);
    }

    public void outACharValor(ACharValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharValor(ACharValor node)
    {
        inACharValor(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACharValor(node);
    }
}
