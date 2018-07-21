/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpSubtracaoExpressaoEsq extends PExpressaoEsq
{
    private PExpressaoEsq _expressaoEsq_;
    private TSub _sub_;
    private PExpressaoDir _expressaoDir_;

    public AExpSubtracaoExpressaoEsq()
    {
        // Constructor
    }

    public AExpSubtracaoExpressaoEsq(
        @SuppressWarnings("hiding") PExpressaoEsq _expressaoEsq_,
        @SuppressWarnings("hiding") TSub _sub_,
        @SuppressWarnings("hiding") PExpressaoDir _expressaoDir_)
    {
        // Constructor
        setExpressaoEsq(_expressaoEsq_);

        setSub(_sub_);

        setExpressaoDir(_expressaoDir_);

    }

    @Override
    public Object clone()
    {
        return new AExpSubtracaoExpressaoEsq(
            cloneNode(this._expressaoEsq_),
            cloneNode(this._sub_),
            cloneNode(this._expressaoDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpSubtracaoExpressaoEsq(this);
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

    public PExpressaoDir getExpressaoDir()
    {
        return this._expressaoDir_;
    }

    public void setExpressaoDir(PExpressaoDir node)
    {
        if(this._expressaoDir_ != null)
        {
            this._expressaoDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoEsq_)
            + toString(this._sub_)
            + toString(this._expressaoDir_);
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

        if(this._sub_ == child)
        {
            this._sub_ = null;
            return;
        }

        if(this._expressaoDir_ == child)
        {
            this._expressaoDir_ = null;
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

        if(this._sub_ == oldChild)
        {
            setSub((TSub) newChild);
            return;
        }

        if(this._expressaoDir_ == oldChild)
        {
            setExpressaoDir((PExpressaoDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
