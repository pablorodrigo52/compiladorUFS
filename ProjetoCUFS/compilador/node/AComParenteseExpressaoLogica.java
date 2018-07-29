/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AComParenteseExpressaoLogica extends PExpressaoLogica
{
    private TAparentese _aparentese_;
    private PExpLogicaEsq _expLogicaEsq_;
    private TFparentese _fparentese_;

    public AComParenteseExpressaoLogica()
    {
        // Constructor
    }

    public AComParenteseExpressaoLogica(
        @SuppressWarnings("hiding") TAparentese _aparentese_,
        @SuppressWarnings("hiding") PExpLogicaEsq _expLogicaEsq_,
        @SuppressWarnings("hiding") TFparentese _fparentese_)
    {
        // Constructor
        setAparentese(_aparentese_);

        setExpLogicaEsq(_expLogicaEsq_);

        setFparentese(_fparentese_);

    }

    @Override
    public Object clone()
    {
        return new AComParenteseExpressaoLogica(
            cloneNode(this._aparentese_),
            cloneNode(this._expLogicaEsq_),
            cloneNode(this._fparentese_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComParenteseExpressaoLogica(this);
    }

    public TAparentese getAparentese()
    {
        return this._aparentese_;
    }

    public void setAparentese(TAparentese node)
    {
        if(this._aparentese_ != null)
        {
            this._aparentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aparentese_ = node;
    }

    public PExpLogicaEsq getExpLogicaEsq()
    {
        return this._expLogicaEsq_;
    }

    public void setExpLogicaEsq(PExpLogicaEsq node)
    {
        if(this._expLogicaEsq_ != null)
        {
            this._expLogicaEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogicaEsq_ = node;
    }

    public TFparentese getFparentese()
    {
        return this._fparentese_;
    }

    public void setFparentese(TFparentese node)
    {
        if(this._fparentese_ != null)
        {
            this._fparentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fparentese_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aparentese_)
            + toString(this._expLogicaEsq_)
            + toString(this._fparentese_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aparentese_ == child)
        {
            this._aparentese_ = null;
            return;
        }

        if(this._expLogicaEsq_ == child)
        {
            this._expLogicaEsq_ = null;
            return;
        }

        if(this._fparentese_ == child)
        {
            this._fparentese_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aparentese_ == oldChild)
        {
            setAparentese((TAparentese) newChild);
            return;
        }

        if(this._expLogicaEsq_ == oldChild)
        {
            setExpLogicaEsq((PExpLogicaEsq) newChild);
            return;
        }

        if(this._fparentese_ == oldChild)
        {
            setFparentese((TFparentese) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
