/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AEExpLogica extends PExpLogica
{
    private PExpLogica _expLogica_;
    private TE _e_;
    private PTermoLogico _termoLogico_;

    public AEExpLogica()
    {
        // Constructor
    }

    public AEExpLogica(
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TE _e_,
        @SuppressWarnings("hiding") PTermoLogico _termoLogico_)
    {
        // Constructor
        setExpLogica(_expLogica_);

        setE(_e_);

        setTermoLogico(_termoLogico_);

    }

    @Override
    public Object clone()
    {
        return new AEExpLogica(
            cloneNode(this._expLogica_),
            cloneNode(this._e_),
            cloneNode(this._termoLogico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEExpLogica(this);
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    public TE getE()
    {
        return this._e_;
    }

    public void setE(TE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
    }

    public PTermoLogico getTermoLogico()
    {
        return this._termoLogico_;
    }

    public void setTermoLogico(PTermoLogico node)
    {
        if(this._termoLogico_ != null)
        {
            this._termoLogico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoLogico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica_)
            + toString(this._e_)
            + toString(this._termoLogico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._termoLogico_ == child)
        {
            this._termoLogico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._e_ == oldChild)
        {
            setE((TE) newChild);
            return;
        }

        if(this._termoLogico_ == oldChild)
        {
            setTermoLogico((PTermoLogico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}