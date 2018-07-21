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
        if(node.getFim() != null)
        {
            node.getFim().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getDeclaracoes() != null)
        {
            node.getDeclaracoes().apply(this);
        }
        if(node.getInicio() != null)
        {
            node.getInicio().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getPrograma() != null)
        {
            node.getPrograma().apply(this);
        }
        outAInicioProg(node);
    }

    public void inADeclaracaoCondicionalDeclaracoes(ADeclaracaoCondicionalDeclaracoes node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoCondicionalDeclaracoes(ADeclaracaoCondicionalDeclaracoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoCondicionalDeclaracoes(ADeclaracaoCondicionalDeclaracoes node)
    {
        inADeclaracaoCondicionalDeclaracoes(node);
        if(node.getCondDeclaracao() != null)
        {
            node.getCondDeclaracao().apply(this);
        }
        outADeclaracaoCondicionalDeclaracoes(node);
    }

    public void inAVariasDeclaracoesCondDeclaracao(AVariasDeclaracoesCondDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariasDeclaracoesCondDeclaracao(AVariasDeclaracoesCondDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariasDeclaracoesCondDeclaracao(AVariasDeclaracoesCondDeclaracao node)
    {
        inAVariasDeclaracoesCondDeclaracao(node);
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            Collections.reverse(copy);
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        outAVariasDeclaracoesCondDeclaracao(node);
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
        if(node.getPontoevirgula() != null)
        {
            node.getPontoevirgula().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getDoispontos() != null)
        {
            node.getDoispontos().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAVariaveisDeclaracao(node);
    }

    public void inAVetoresDeclaracao(AVetoresDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVetoresDeclaracao(AVetoresDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetoresDeclaracao(AVetoresDeclaracao node)
    {
        inAVetoresDeclaracao(node);
        if(node.getVetor() != null)
        {
            node.getVetor().apply(this);
        }
        outAVetoresDeclaracao(node);
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
        if(node.getConstante() != null)
        {
            node.getConstante().apply(this);
        }
        outAConstanteDeclaracao(node);
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
        if(node.getAtrib() != null)
        {
            node.getAtrib().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAtribuicaoVariavelComando(node);
    }

    public void inAAtribuicaoVetorComando(AAtribuicaoVetorComando node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoVetorComando(AAtribuicaoVetorComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoVetorComando(AAtribuicaoVetorComando node)
    {
        inAAtribuicaoVetorComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAtrib() != null)
        {
            node.getAtrib().apply(this);
        }
        if(node.getVarvetor() != null)
        {
            node.getVarvetor().apply(this);
        }
        outAAtribuicaoVetorComando(node);
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

    public void inAExpressao(AExpressao node)
    {
        defaultIn(node);
    }

    public void outAExpressao(AExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressao(AExpressao node)
    {
        inAExpressao(node);
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpressao(node);
    }

    public void inAExpSomaExpressaoEsq(AExpSomaExpressaoEsq node)
    {
        defaultIn(node);
    }

    public void outAExpSomaExpressaoEsq(AExpSomaExpressaoEsq node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpSomaExpressaoEsq(AExpSomaExpressaoEsq node)
    {
        inAExpSomaExpressaoEsq(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        if(node.getSum() != null)
        {
            node.getSum().apply(this);
        }
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpSomaExpressaoEsq(node);
    }

    public void inAExpSubtracaoExpressaoEsq(AExpSubtracaoExpressaoEsq node)
    {
        defaultIn(node);
    }

    public void outAExpSubtracaoExpressaoEsq(AExpSubtracaoExpressaoEsq node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpSubtracaoExpressaoEsq(AExpSubtracaoExpressaoEsq node)
    {
        inAExpSubtracaoExpressaoEsq(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        if(node.getSub() != null)
        {
            node.getSub().apply(this);
        }
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpSubtracaoExpressaoEsq(node);
    }

    public void inAExpDirExpressaoEsq(AExpDirExpressaoEsq node)
    {
        defaultIn(node);
    }

    public void outAExpDirExpressaoEsq(AExpDirExpressaoEsq node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpDirExpressaoEsq(AExpDirExpressaoEsq node)
    {
        inAExpDirExpressaoEsq(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        outAExpDirExpressaoEsq(node);
    }

    public void inAExpressaoDirMultiplicacaoExpressaoDir(AExpressaoDirMultiplicacaoExpressaoDir node)
    {
        defaultIn(node);
    }

    public void outAExpressaoDirMultiplicacaoExpressaoDir(AExpressaoDirMultiplicacaoExpressaoDir node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoDirMultiplicacaoExpressaoDir(AExpressaoDirMultiplicacaoExpressaoDir node)
    {
        inAExpressaoDirMultiplicacaoExpressaoDir(node);
        if(node.getFatorExp() != null)
        {
            node.getFatorExp().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        outAExpressaoDirMultiplicacaoExpressaoDir(node);
    }

    public void inAExpressaoDirDivisaoExpressaoDir(AExpressaoDirDivisaoExpressaoDir node)
    {
        defaultIn(node);
    }

    public void outAExpressaoDirDivisaoExpressaoDir(AExpressaoDirDivisaoExpressaoDir node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoDirDivisaoExpressaoDir(AExpressaoDirDivisaoExpressaoDir node)
    {
        inAExpressaoDirDivisaoExpressaoDir(node);
        if(node.getFatorExp() != null)
        {
            node.getFatorExp().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        outAExpressaoDirDivisaoExpressaoDir(node);
    }

    public void inAExpressaoDirFatorExpressaoDir(AExpressaoDirFatorExpressaoDir node)
    {
        defaultIn(node);
    }

    public void outAExpressaoDirFatorExpressaoDir(AExpressaoDirFatorExpressaoDir node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoDirFatorExpressaoDir(AExpressaoDirFatorExpressaoDir node)
    {
        inAExpressaoDirFatorExpressaoDir(node);
        if(node.getFatorExp() != null)
        {
            node.getFatorExp().apply(this);
        }
        outAExpressaoDirFatorExpressaoDir(node);
    }

    public void inAFatorAninhadoFatorExp(AFatorAninhadoFatorExp node)
    {
        defaultIn(node);
    }

    public void outAFatorAninhadoFatorExp(AFatorAninhadoFatorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorAninhadoFatorExp(AFatorAninhadoFatorExp node)
    {
        inAFatorAninhadoFatorExp(node);
        if(node.getFparentese() != null)
        {
            node.getFparentese().apply(this);
        }
        if(node.getFatorExp() != null)
        {
            node.getFatorExp().apply(this);
        }
        if(node.getAparentese() != null)
        {
            node.getAparentese().apply(this);
        }
        outAFatorAninhadoFatorExp(node);
    }

    public void inAFatorVariavelFatorExp(AFatorVariavelFatorExp node)
    {
        defaultIn(node);
    }

    public void outAFatorVariavelFatorExp(AFatorVariavelFatorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorVariavelFatorExp(AFatorVariavelFatorExp node)
    {
        inAFatorVariavelFatorExp(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAFatorVariavelFatorExp(node);
    }

    public void inAFatorVetorFatorExp(AFatorVetorFatorExp node)
    {
        defaultIn(node);
    }

    public void outAFatorVetorFatorExp(AFatorVetorFatorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorVetorFatorExp(AFatorVetorFatorExp node)
    {
        inAFatorVetorFatorExp(node);
        if(node.getVarvetor() != null)
        {
            node.getVarvetor().apply(this);
        }
        outAFatorVetorFatorExp(node);
    }

    public void inAFatorNegativoFatorExp(AFatorNegativoFatorExp node)
    {
        defaultIn(node);
    }

    public void outAFatorNegativoFatorExp(AFatorNegativoFatorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorNegativoFatorExp(AFatorNegativoFatorExp node)
    {
        inAFatorNegativoFatorExp(node);
        if(node.getFatorExp() != null)
        {
            node.getFatorExp().apply(this);
        }
        if(node.getSub() != null)
        {
            node.getSub().apply(this);
        }
        outAFatorNegativoFatorExp(node);
    }

    public void inAFatorCoeficienteFatorExp(AFatorCoeficienteFatorExp node)
    {
        defaultIn(node);
    }

    public void outAFatorCoeficienteFatorExp(AFatorCoeficienteFatorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorCoeficienteFatorExp(AFatorCoeficienteFatorExp node)
    {
        inAFatorCoeficienteFatorExp(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAFatorCoeficienteFatorExp(node);
    }

    public void inAExpLogica(AExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpLogica(AExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogica(AExpLogica node)
    {
        inAExpLogica(node);
        if(node.getExpLogicaEsq() != null)
        {
            node.getExpLogicaEsq().apply(this);
        }
        outAExpLogica(node);
    }

    public void inAExpeEExpLogicaEsq(AExpeEExpLogicaEsq node)
    {
        defaultIn(node);
    }

    public void outAExpeEExpLogicaEsq(AExpeEExpLogicaEsq node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeEExpLogicaEsq(AExpeEExpLogicaEsq node)
    {
        inAExpeEExpLogicaEsq(node);
        if(node.getExpLogicaDir() != null)
        {
            node.getExpLogicaDir().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getExpLogicaEsq() != null)
        {
            node.getExpLogicaEsq().apply(this);
        }
        outAExpeEExpLogicaEsq(node);
    }

    public void inAExpeOuExpLogicaEsq(AExpeOuExpLogicaEsq node)
    {
        defaultIn(node);
    }

    public void outAExpeOuExpLogicaEsq(AExpeOuExpLogicaEsq node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeOuExpLogicaEsq(AExpeOuExpLogicaEsq node)
    {
        inAExpeOuExpLogicaEsq(node);
        if(node.getExpLogicaDir() != null)
        {
            node.getExpLogicaDir().apply(this);
        }
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        if(node.getExpLogicaEsq() != null)
        {
            node.getExpLogicaEsq().apply(this);
        }
        outAExpeOuExpLogicaEsq(node);
    }

    public void inAExpeDirExpLogicaEsq(AExpeDirExpLogicaEsq node)
    {
        defaultIn(node);
    }

    public void outAExpeDirExpLogicaEsq(AExpeDirExpLogicaEsq node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeDirExpLogicaEsq(AExpeDirExpLogicaEsq node)
    {
        inAExpeDirExpLogicaEsq(node);
        if(node.getExpLogicaDir() != null)
        {
            node.getExpLogicaDir().apply(this);
        }
        outAExpeDirExpLogicaEsq(node);
    }

    public void inAExpLogicaAninhadaExpLogicaDir(AExpLogicaAninhadaExpLogicaDir node)
    {
        defaultIn(node);
    }

    public void outAExpLogicaAninhadaExpLogicaDir(AExpLogicaAninhadaExpLogicaDir node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogicaAninhadaExpLogicaDir(AExpLogicaAninhadaExpLogicaDir node)
    {
        inAExpLogicaAninhadaExpLogicaDir(node);
        if(node.getFparentese() != null)
        {
            node.getFparentese().apply(this);
        }
        if(node.getExpLogicaEsq() != null)
        {
            node.getExpLogicaEsq().apply(this);
        }
        if(node.getAparentese() != null)
        {
            node.getAparentese().apply(this);
        }
        outAExpLogicaAninhadaExpLogicaDir(node);
    }

    public void inAExpeNaoExpLogicaDir(AExpeNaoExpLogicaDir node)
    {
        defaultIn(node);
    }

    public void outAExpeNaoExpLogicaDir(AExpeNaoExpLogicaDir node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeNaoExpLogicaDir(AExpeNaoExpLogicaDir node)
    {
        inAExpeNaoExpLogicaDir(node);
        if(node.getExpLogicaDir() != null)
        {
            node.getExpLogicaDir().apply(this);
        }
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        outAExpeNaoExpLogicaDir(node);
    }

    public void inAExpLogicaFatorExpLogicaDir(AExpLogicaFatorExpLogicaDir node)
    {
        defaultIn(node);
    }

    public void outAExpLogicaFatorExpLogicaDir(AExpLogicaFatorExpLogicaDir node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogicaFatorExpLogicaDir(AExpLogicaFatorExpLogicaDir node)
    {
        inAExpLogicaFatorExpLogicaDir(node);
        if(node.getExpLogicaFator() != null)
        {
            node.getExpLogicaFator().apply(this);
        }
        outAExpLogicaFatorExpLogicaDir(node);
    }

    public void inAExpeIgualExpLogicaFator(AExpeIgualExpLogicaFator node)
    {
        defaultIn(node);
    }

    public void outAExpeIgualExpLogicaFator(AExpeIgualExpLogicaFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeIgualExpLogicaFator(AExpeIgualExpLogicaFator node)
    {
        inAExpeIgualExpLogicaFator(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpeIgualExpLogicaFator(node);
    }

    public void inAExpeDiferenteExpLogicaFator(AExpeDiferenteExpLogicaFator node)
    {
        defaultIn(node);
    }

    public void outAExpeDiferenteExpLogicaFator(AExpeDiferenteExpLogicaFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeDiferenteExpLogicaFator(AExpeDiferenteExpLogicaFator node)
    {
        inAExpeDiferenteExpLogicaFator(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        if(node.getDiferente() != null)
        {
            node.getDiferente().apply(this);
        }
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpeDiferenteExpLogicaFator(node);
    }

    public void inAExpeMaiorExpLogicaFator(AExpeMaiorExpLogicaFator node)
    {
        defaultIn(node);
    }

    public void outAExpeMaiorExpLogicaFator(AExpeMaiorExpLogicaFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeMaiorExpLogicaFator(AExpeMaiorExpLogicaFator node)
    {
        inAExpeMaiorExpLogicaFator(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        if(node.getMaior() != null)
        {
            node.getMaior().apply(this);
        }
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpeMaiorExpLogicaFator(node);
    }

    public void inAExpeMenorExpLogicaFator(AExpeMenorExpLogicaFator node)
    {
        defaultIn(node);
    }

    public void outAExpeMenorExpLogicaFator(AExpeMenorExpLogicaFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeMenorExpLogicaFator(AExpeMenorExpLogicaFator node)
    {
        inAExpeMenorExpLogicaFator(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        if(node.getMenor() != null)
        {
            node.getMenor().apply(this);
        }
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpeMenorExpLogicaFator(node);
    }

    public void inAExpeMaioreqExpLogicaFator(AExpeMaioreqExpLogicaFator node)
    {
        defaultIn(node);
    }

    public void outAExpeMaioreqExpLogicaFator(AExpeMaioreqExpLogicaFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeMaioreqExpLogicaFator(AExpeMaioreqExpLogicaFator node)
    {
        inAExpeMaioreqExpLogicaFator(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        if(node.getMaioreq() != null)
        {
            node.getMaioreq().apply(this);
        }
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpeMaioreqExpLogicaFator(node);
    }

    public void inAExpeMenoreqExpLogicaFator(AExpeMenoreqExpLogicaFator node)
    {
        defaultIn(node);
    }

    public void outAExpeMenoreqExpLogicaFator(AExpeMenoreqExpLogicaFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpeMenoreqExpLogicaFator(AExpeMenoreqExpLogicaFator node)
    {
        inAExpeMenoreqExpLogicaFator(node);
        if(node.getExpressaoDir() != null)
        {
            node.getExpressaoDir().apply(this);
        }
        if(node.getMenorq() != null)
        {
            node.getMenorq().apply(this);
        }
        if(node.getExpressaoEsq() != null)
        {
            node.getExpressaoEsq().apply(this);
        }
        outAExpeMenoreqExpLogicaFator(node);
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
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariasVariaveisVar(node);
    }

    public void inAIdentificadorVar(AIdentificadorVar node)
    {
        defaultIn(node);
    }

    public void outAIdentificadorVar(AIdentificadorVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentificadorVar(AIdentificadorVar node)
    {
        inAIdentificadorVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdentificadorVar(node);
    }

    public void inAVetorVetor(AVetorVetor node)
    {
        defaultIn(node);
    }

    public void outAVetorVetor(AVetorVetor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVetor(AVetorVetor node)
    {
        inAVetorVetor(node);
        if(node.getPontoevirgula() != null)
        {
            node.getPontoevirgula().apply(this);
        }
        if(node.getVarvetor() != null)
        {
            node.getVarvetor().apply(this);
        }
        if(node.getDoispontos() != null)
        {
            node.getDoispontos().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAVetorVetor(node);
    }

    public void inAVariosVetoresVarvetor(AVariosVetoresVarvetor node)
    {
        defaultIn(node);
    }

    public void outAVariosVetoresVarvetor(AVariosVetoresVarvetor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariosVetoresVarvetor(AVariosVetoresVarvetor node)
    {
        inAVariosVetoresVarvetor(node);
        if(node.getFcolchete() != null)
        {
            node.getFcolchete().apply(this);
        }
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        if(node.getAcolchete() != null)
        {
            node.getAcolchete().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getVarvetor() != null)
        {
            node.getVarvetor().apply(this);
        }
        outAVariosVetoresVarvetor(node);
    }

    public void inAUmVetorVarvetor(AUmVetorVarvetor node)
    {
        defaultIn(node);
    }

    public void outAUmVetorVarvetor(AUmVetorVarvetor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmVetorVarvetor(AUmVetorVarvetor node)
    {
        inAUmVetorVarvetor(node);
        if(node.getFcolchete() != null)
        {
            node.getFcolchete().apply(this);
        }
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        if(node.getAcolchete() != null)
        {
            node.getAcolchete().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAUmVetorVarvetor(node);
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

    public void inATrueBooleano(ATrueBooleano node)
    {
        defaultIn(node);
    }

    public void outATrueBooleano(ATrueBooleano node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrueBooleano(ATrueBooleano node)
    {
        inATrueBooleano(node);
        if(node.getVerdadeiro() != null)
        {
            node.getVerdadeiro().apply(this);
        }
        outATrueBooleano(node);
    }

    public void inAFalseBooleano(AFalseBooleano node)
    {
        defaultIn(node);
    }

    public void outAFalseBooleano(AFalseBooleano node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFalseBooleano(AFalseBooleano node)
    {
        inAFalseBooleano(node);
        if(node.getFalso() != null)
        {
            node.getFalso().apply(this);
        }
        outAFalseBooleano(node);
    }
}
