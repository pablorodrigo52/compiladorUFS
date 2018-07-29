/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADivTermo extends PTermo
{
    private PTermo _termo_;
    private TDiv _div_;
    private PExpressaoFinal _expressaoFinal_;

    public ADivTermo()
    {
        // Constructor
    }

    public ADivTermo(
        @SuppressWarnings("hiding") PTermo _termo_,
        @SuppressWarnings("hiding") TDiv _div_,
        @SuppressWarnings("hiding") PExpressaoFinal _expressaoFinal_)
    {
        // Constructor
        setTermo(_termo_);

        setDiv(_div_);

        setExpressaoFinal(_expressaoFinal_);

    }

    @Override
    public Object clone()
    {
        return new ADivTermo(
            cloneNode(this._termo_),
            cloneNode(this._div_),
            cloneNode(this._expressaoFinal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivTermo(this);
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

    public TDiv getDiv()
    {
        return this._div_;
    }

    public void setDiv(TDiv node)
    {
        if(this._div_ != null)
        {
            this._div_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._div_ = node;
    }

    public PExpressaoFinal getExpressaoFinal()
    {
        return this._expressaoFinal_;
    }

    public void setExpressaoFinal(PExpressaoFinal node)
    {
        if(this._expressaoFinal_ != null)
        {
            this._expressaoFinal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoFinal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termo_)
            + toString(this._div_)
            + toString(this._expressaoFinal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        if(this._div_ == child)
        {
            this._div_ = null;
            return;
        }

        if(this._expressaoFinal_ == child)
        {
            this._expressaoFinal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        if(this._div_ == oldChild)
        {
            setDiv((TDiv) newChild);
            return;
        }

        if(this._expressaoFinal_ == oldChild)
        {
            setExpressaoFinal((PExpressaoFinal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
