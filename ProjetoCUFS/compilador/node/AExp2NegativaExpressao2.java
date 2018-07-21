/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExp2NegativaExpressao2 extends PExpressao2
{
    private TSub _sub_;
    private PExpressao2 _expressao2_;

    public AExp2NegativaExpressao2()
    {
        // Constructor
    }

    public AExp2NegativaExpressao2(
        @SuppressWarnings("hiding") TSub _sub_,
        @SuppressWarnings("hiding") PExpressao2 _expressao2_)
    {
        // Constructor
        setSub(_sub_);

        setExpressao2(_expressao2_);

    }

    @Override
    public Object clone()
    {
        return new AExp2NegativaExpressao2(
            cloneNode(this._sub_),
            cloneNode(this._expressao2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExp2NegativaExpressao2(this);
    }

    public TSub getSub()
    {
        return this._sub_;
    }

    public void setSub(TSub node)
    {
        if(this._sub_ != null)
        {
            this._sub_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sub_ = node;
    }

    public PExpressao2 getExpressao2()
    {
        return this._expressao2_;
    }

    public void setExpressao2(PExpressao2 node)
    {
        if(this._expressao2_ != null)
        {
            this._expressao2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sub_)
            + toString(this._expressao2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sub_ == child)
        {
            this._sub_ = null;
            return;
        }

        if(this._expressao2_ == child)
        {
            this._expressao2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sub_ == oldChild)
        {
            setSub((TSub) newChild);
            return;
        }

        if(this._expressao2_ == oldChild)
        {
            setExpressao2((PExpressao2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}