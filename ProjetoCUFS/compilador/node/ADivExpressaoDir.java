/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADivExpressaoDir extends PExpressaoDir
{
    private PExp _exp_;
    private TDiv _div_;
    private PExpressaoFinal _expressaoFinal_;

    public ADivExpressaoDir()
    {
        // Constructor
    }

    public ADivExpressaoDir(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TDiv _div_,
        @SuppressWarnings("hiding") PExpressaoFinal _expressaoFinal_)
    {
        // Constructor
        setExp(_exp_);

        setDiv(_div_);

        setExpressaoFinal(_expressaoFinal_);

    }

    @Override
    public Object clone()
    {
        return new ADivExpressaoDir(
            cloneNode(this._exp_),
            cloneNode(this._div_),
            cloneNode(this._expressaoFinal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivExpressaoDir(this);
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
            + toString(this._exp_)
            + toString(this._div_)
            + toString(this._expressaoFinal_);
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
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
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
