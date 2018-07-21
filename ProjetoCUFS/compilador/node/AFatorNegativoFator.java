/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AFatorNegativoFator extends PFator
{
    private TSub _sub_;
    private PFator _fator_;

    public AFatorNegativoFator()
    {
        // Constructor
    }

    public AFatorNegativoFator(
        @SuppressWarnings("hiding") TSub _sub_,
        @SuppressWarnings("hiding") PFator _fator_)
    {
        // Constructor
        setSub(_sub_);

        setFator(_fator_);

    }

    @Override
    public Object clone()
    {
        return new AFatorNegativoFator(
            cloneNode(this._sub_),
            cloneNode(this._fator_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFatorNegativoFator(this);
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

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sub_)
            + toString(this._fator_);
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

        if(this._fator_ == child)
        {
            this._fator_ = null;
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

        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}