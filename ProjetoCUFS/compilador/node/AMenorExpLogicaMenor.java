/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMenorExpLogicaMenor extends PExpLogicaMenor
{
    private PExp _exp_;
    private TMenor _menor_;
    private PExpLogicaMaiorq _expLogicaMaiorq_;

    public AMenorExpLogicaMenor()
    {
        // Constructor
    }

    public AMenorExpLogicaMenor(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TMenor _menor_,
        @SuppressWarnings("hiding") PExpLogicaMaiorq _expLogicaMaiorq_)
    {
        // Constructor
        setExp(_exp_);

        setMenor(_menor_);

        setExpLogicaMaiorq(_expLogicaMaiorq_);

    }

    @Override
    public Object clone()
    {
        return new AMenorExpLogicaMenor(
            cloneNode(this._exp_),
            cloneNode(this._menor_),
            cloneNode(this._expLogicaMaiorq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorExpLogicaMenor(this);
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

    public TMenor getMenor()
    {
        return this._menor_;
    }

    public void setMenor(TMenor node)
    {
        if(this._menor_ != null)
        {
            this._menor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menor_ = node;
    }

    public PExpLogicaMaiorq getExpLogicaMaiorq()
    {
        return this._expLogicaMaiorq_;
    }

    public void setExpLogicaMaiorq(PExpLogicaMaiorq node)
    {
        if(this._expLogicaMaiorq_ != null)
        {
            this._expLogicaMaiorq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogicaMaiorq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._menor_)
            + toString(this._expLogicaMaiorq_);
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

        if(this._menor_ == child)
        {
            this._menor_ = null;
            return;
        }

        if(this._expLogicaMaiorq_ == child)
        {
            this._expLogicaMaiorq_ = null;
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

        if(this._menor_ == oldChild)
        {
            setMenor((TMenor) newChild);
            return;
        }

        if(this._expLogicaMaiorq_ == oldChild)
        {
            setExpLogicaMaiorq((PExpLogicaMaiorq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
