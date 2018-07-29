/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorFatorLogico extends PFatorLogico
{
    private PExpressao _expressao_;
    private TMaior _maior_;
    private PTermo _termo_;

    public AMaiorFatorLogico()
    {
        // Constructor
    }

    public AMaiorFatorLogico(
        @SuppressWarnings("hiding") PExpressao _expressao_,
        @SuppressWarnings("hiding") TMaior _maior_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setExpressao(_expressao_);

        setMaior(_maior_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorFatorLogico(
            cloneNode(this._expressao_),
            cloneNode(this._maior_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorFatorLogico(this);
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

    public TMaior getMaior()
    {
        return this._maior_;
    }

    public void setMaior(TMaior node)
    {
        if(this._maior_ != null)
        {
            this._maior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maior_ = node;
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
            + toString(this._maior_)
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

        if(this._maior_ == child)
        {
            this._maior_ = null;
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

        if(this._maior_ == oldChild)
        {
            setMaior((TMaior) newChild);
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
