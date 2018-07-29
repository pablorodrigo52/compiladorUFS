/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMenorqExpLogicaEsq extends PExpLogicaEsq
{
    private PExp _exp_;
    private TMenorq _menorq_;
    private PExpLogicaDir _expLogicaDir_;

    public AMenorqExpLogicaEsq()
    {
        // Constructor
    }

    public AMenorqExpLogicaEsq(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TMenorq _menorq_,
        @SuppressWarnings("hiding") PExpLogicaDir _expLogicaDir_)
    {
        // Constructor
        setExp(_exp_);

        setMenorq(_menorq_);

        setExpLogicaDir(_expLogicaDir_);

    }

    @Override
    public Object clone()
    {
        return new AMenorqExpLogicaEsq(
            cloneNode(this._exp_),
            cloneNode(this._menorq_),
            cloneNode(this._expLogicaDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorqExpLogicaEsq(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TMenorq getMenorq()
    {
        return this._menorq_;
    }

    public void setMenorq(TMenorq node)
    {
        if(this._menorq_ != null)
        {
            this._menorq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menorq_ = node;
    }

    public PExpLogicaDir getExpLogicaDir()
    {
        return this._expLogicaDir_;
    }

    public void setExpLogicaDir(PExpLogicaDir node)
    {
        if(this._expLogicaDir_ != null)
        {
            this._expLogicaDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogicaDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._menorq_)
            + toString(this._expLogicaDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._menorq_ == child)
        {
            this._menorq_ = null;
            return;
        }

        if(this._expLogicaDir_ == child)
        {
            this._expLogicaDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._menorq_ == oldChild)
        {
            setMenorq((TMenorq) newChild);
            return;
        }

        if(this._expLogicaDir_ == oldChild)
        {
            setExpLogicaDir((PExpLogicaDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
