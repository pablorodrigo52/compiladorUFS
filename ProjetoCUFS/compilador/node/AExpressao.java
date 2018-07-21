/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpressao extends PExpressao
{
    private PExpressaoEsq _expressaoEsq_;

    public AExpressao()
    {
        // Constructor
    }

    public AExpressao(
        @SuppressWarnings("hiding") PExpressaoEsq _expressaoEsq_)
    {
        // Constructor
        setExpressaoEsq(_expressaoEsq_);

    }

    @Override
    public Object clone()
    {
        return new AExpressao(
            cloneNode(this._expressaoEsq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressao(this);
    }

    public PExpressaoEsq getExpressaoEsq()
    {
        return this._expressaoEsq_;
    }

    public void setExpressaoEsq(PExpressaoEsq node)
    {
        if(this._expressaoEsq_ != null)
        {
            this._expressaoEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoEsq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoEsq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoEsq_ == child)
        {
            this._expressaoEsq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoEsq_ == oldChild)
        {
            setExpressaoEsq((PExpressaoEsq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}