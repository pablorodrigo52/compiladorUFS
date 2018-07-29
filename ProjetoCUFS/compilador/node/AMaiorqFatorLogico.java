/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorqFatorLogico extends PFatorLogico
{
    private PExpressao _expressao_;
    private TMaioreq _maioreq_;
    private PTermo _termo_;

    public AMaiorqFatorLogico()
    {
        // Constructor
    }

    public AMaiorqFatorLogico(
        @SuppressWarnings("hiding") PExpressao _expressao_,
        @SuppressWarnings("hiding") TMaioreq _maioreq_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setExpressao(_expressao_);

        setMaioreq(_maioreq_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorqFatorLogico(
            cloneNode(this._expressao_),
            cloneNode(this._maioreq_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorqFatorLogico(this);
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    public TMaioreq getMaioreq()
    {
        return this._maioreq_;
    }

    public void setMaioreq(TMaioreq node)
    {
        if(this._maioreq_ != null)
        {
            this._maioreq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maioreq_ = node;
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressao_)
            + toString(this._maioreq_)
            + toString(this._termo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        if(this._maioreq_ == child)
        {
            this._maioreq_ = null;
            return;
        }

        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        if(this._maioreq_ == oldChild)
        {
            setMaioreq((TMaioreq) newChild);
            return;
        }

        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}