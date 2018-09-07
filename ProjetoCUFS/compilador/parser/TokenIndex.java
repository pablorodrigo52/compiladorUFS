/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.parser;

import compilador.analysis.AnalysisAdapter;
import compilador.node.EOF;
import compilador.node.TAbreblococomentario;
import compilador.node.TAcolchete;
import compilador.node.TAparentese;
import compilador.node.TAspasduplas;
import compilador.node.TAspasimples;
import compilador.node.TAte;
import compilador.node.TAtrib;
import compilador.node.TAvalie;
import compilador.node.TBooleano;
import compilador.node.TCaractere;
import compilador.node.TCaso;
import compilador.node.TComentariosimples;
import compilador.node.TConstante;
import compilador.node.TDe;
import compilador.node.TDiferente;
import compilador.node.TDiv;
import compilador.node.TDoispontos;
import compilador.node.TE;
import compilador.node.TEnquanto;
import compilador.node.TEntao;
import compilador.node.TEscreva;
import compilador.node.TFaca;
import compilador.node.TFalso;
import compilador.node.TFcolchete;
import compilador.node.TFechablococomentario;
import compilador.node.TFim;
import compilador.node.TFimavalie;
import compilador.node.TFimenquanto;
import compilador.node.TFimpara;
import compilador.node.TFimse;
import compilador.node.TFparentese;
import compilador.node.TId;
import compilador.node.TIgual;
import compilador.node.TInicio;
import compilador.node.TInteiro;
import compilador.node.TLeia;
import compilador.node.TMaior;
import compilador.node.TMaioreq;
import compilador.node.TMenor;
import compilador.node.TMenorq;
import compilador.node.TMod;
import compilador.node.TMult;
import compilador.node.TNao;
import compilador.node.TNulo;
import compilador.node.TOu;
import compilador.node.TPara;
import compilador.node.TPare;
import compilador.node.TPasso;
import compilador.node.TPonto;
import compilador.node.TPontoevirgula;
import compilador.node.TPrograma;
import compilador.node.TReal;
import compilador.node.TRepita;
import compilador.node.TRetorne;
import compilador.node.TSe;
import compilador.node.TSenao;
import compilador.node.TString;
import compilador.node.TSub;
import compilador.node.TSum;
import compilador.node.TTipobooleano;
import compilador.node.TTipocaractere;
import compilador.node.TTipointeiro;
import compilador.node.TTiporeal;
import compilador.node.TVerdadeiro;
import compilador.node.TVirgula;
import compilador.node.TXor;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 0;
    }

    @Override
    public void caseTFim(@SuppressWarnings("unused") TFim node)
    {
        this.index = 1;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 2;
    }

    @Override
    public void caseTFimse(@SuppressWarnings("unused") TFimse node)
    {
        this.index = 3;
    }

    @Override
    public void caseTEntao(@SuppressWarnings("unused") TEntao node)
    {
        this.index = 4;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 5;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 6;
    }

    @Override
    public void caseTFimenquanto(@SuppressWarnings("unused") TFimenquanto node)
    {
        this.index = 7;
    }

    @Override
    public void caseTPara(@SuppressWarnings("unused") TPara node)
    {
        this.index = 8;
    }

    @Override
    public void caseTDe(@SuppressWarnings("unused") TDe node)
    {
        this.index = 9;
    }

    @Override
    public void caseTPasso(@SuppressWarnings("unused") TPasso node)
    {
        this.index = 10;
    }

    @Override
    public void caseTFimpara(@SuppressWarnings("unused") TFimpara node)
    {
        this.index = 11;
    }

    @Override
    public void caseTAvalie(@SuppressWarnings("unused") TAvalie node)
    {
        this.index = 12;
    }

    @Override
    public void caseTFimavalie(@SuppressWarnings("unused") TFimavalie node)
    {
        this.index = 13;
    }

    @Override
    public void caseTCaso(@SuppressWarnings("unused") TCaso node)
    {
        this.index = 14;
    }

    @Override
    public void caseTPare(@SuppressWarnings("unused") TPare node)
    {
        this.index = 15;
    }

    @Override
    public void caseTRepita(@SuppressWarnings("unused") TRepita node)
    {
        this.index = 16;
    }

    @Override
    public void caseTAte(@SuppressWarnings("unused") TAte node)
    {
        this.index = 17;
    }

    @Override
    public void caseTPrograma(@SuppressWarnings("unused") TPrograma node)
    {
        this.index = 18;
    }

    @Override
    public void caseTLeia(@SuppressWarnings("unused") TLeia node)
    {
        this.index = 19;
    }

    @Override
    public void caseTEscreva(@SuppressWarnings("unused") TEscreva node)
    {
        this.index = 20;
    }

    @Override
    public void caseTConstante(@SuppressWarnings("unused") TConstante node)
    {
        this.index = 21;
    }

    @Override
    public void caseTNulo(@SuppressWarnings("unused") TNulo node)
    {
        this.index = 22;
    }

    @Override
    public void caseTRetorne(@SuppressWarnings("unused") TRetorne node)
    {
        this.index = 23;
    }

    @Override
    public void caseTFaca(@SuppressWarnings("unused") TFaca node)
    {
        this.index = 24;
    }

    @Override
    public void caseTVerdadeiro(@SuppressWarnings("unused") TVerdadeiro node)
    {
        this.index = 25;
    }

    @Override
    public void caseTFalso(@SuppressWarnings("unused") TFalso node)
    {
        this.index = 26;
    }

    @Override
    public void caseTDiferente(@SuppressWarnings("unused") TDiferente node)
    {
        this.index = 27;
    }

    @Override
    public void caseTMaioreq(@SuppressWarnings("unused") TMaioreq node)
    {
        this.index = 28;
    }

    @Override
    public void caseTMenorq(@SuppressWarnings("unused") TMenorq node)
    {
        this.index = 29;
    }

    @Override
    public void caseTMaior(@SuppressWarnings("unused") TMaior node)
    {
        this.index = 30;
    }

    @Override
    public void caseTMenor(@SuppressWarnings("unused") TMenor node)
    {
        this.index = 31;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 32;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 33;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 34;
    }

    @Override
    public void caseTSum(@SuppressWarnings("unused") TSum node)
    {
        this.index = 35;
    }

    @Override
    public void caseTSub(@SuppressWarnings("unused") TSub node)
    {
        this.index = 36;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 37;
    }

    @Override
    public void caseTNao(@SuppressWarnings("unused") TNao node)
    {
        this.index = 38;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 39;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 40;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 41;
    }

    @Override
    public void caseTTipointeiro(@SuppressWarnings("unused") TTipointeiro node)
    {
        this.index = 42;
    }

    @Override
    public void caseTTiporeal(@SuppressWarnings("unused") TTiporeal node)
    {
        this.index = 43;
    }

    @Override
    public void caseTTipocaractere(@SuppressWarnings("unused") TTipocaractere node)
    {
        this.index = 44;
    }

    @Override
    public void caseTTipobooleano(@SuppressWarnings("unused") TTipobooleano node)
    {
        this.index = 45;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 46;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 47;
    }

    @Override
    public void caseTPontoevirgula(@SuppressWarnings("unused") TPontoevirgula node)
    {
        this.index = 48;
    }

    @Override
    public void caseTFechablococomentario(@SuppressWarnings("unused") TFechablococomentario node)
    {
        this.index = 49;
    }

    @Override
    public void caseTAbreblococomentario(@SuppressWarnings("unused") TAbreblococomentario node)
    {
        this.index = 50;
    }

    @Override
    public void caseTDoispontos(@SuppressWarnings("unused") TDoispontos node)
    {
        this.index = 51;
    }

    @Override
    public void caseTComentariosimples(@SuppressWarnings("unused") TComentariosimples node)
    {
        this.index = 52;
    }

    @Override
    public void caseTAparentese(@SuppressWarnings("unused") TAparentese node)
    {
        this.index = 53;
    }

    @Override
    public void caseTFparentese(@SuppressWarnings("unused") TFparentese node)
    {
        this.index = 54;
    }

    @Override
    public void caseTAcolchete(@SuppressWarnings("unused") TAcolchete node)
    {
        this.index = 55;
    }

    @Override
    public void caseTFcolchete(@SuppressWarnings("unused") TFcolchete node)
    {
        this.index = 56;
    }

    @Override
    public void caseTAtrib(@SuppressWarnings("unused") TAtrib node)
    {
        this.index = 57;
    }

    @Override
    public void caseTAspasimples(@SuppressWarnings("unused") TAspasimples node)
    {
        this.index = 58;
    }

    @Override
    public void caseTAspasduplas(@SuppressWarnings("unused") TAspasduplas node)
    {
        this.index = 59;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 60;
    }

    @Override
    public void caseTInteiro(@SuppressWarnings("unused") TInteiro node)
    {
        this.index = 61;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 62;
    }

    @Override
    public void caseTCaractere(@SuppressWarnings("unused") TCaractere node)
    {
        this.index = 63;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 64;
    }

    @Override
    public void caseTBooleano(@SuppressWarnings("unused") TBooleano node)
    {
        this.index = 65;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 66;
    }
}
