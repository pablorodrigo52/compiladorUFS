/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.Analysis;

@SuppressWarnings("nls")
public final class AFatorLogicoTermoLogico extends PTermoLogico
{
    private PFatorLogico _fatorLogico_;

    public AFatorLogicoTermoLogico()
    {
        // Constructor
    }

    public AFatorLogicoTermoLogico(
        @SuppressWarnings("hiding") PFatorLogico _fatorLogico_)
    {
        // Constructor
        setFatorLogico(_fatorLogico_);

    }

    @Override
    public Object clone()
    {
        return new AFatorLogicoTermoLogico(
            cloneNode(this._fatorLogico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFatorLogicoTermoLogico(this);
    }

    public PFatorLogico getFatorLogico()
    {
        return this._fatorLogico_;
    }

    public void setFatorLogico(PFatorLogico node)
    {
        if(this._fatorLogico_ != null)
        {
            this._fatorLogico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorLogico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fatorLogico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fatorLogico_ == child)
        {
            this._fatorLogico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fatorLogico_ == oldChild)
        {
            setFatorLogico((PFatorLogico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
