/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AFatorEscrevaTermoEscreva extends PTermoEscreva
{
    private PFatorEscreva _fatorEscreva_;

    public AFatorEscrevaTermoEscreva()
    {
        // Constructor
    }

    public AFatorEscrevaTermoEscreva(
        @SuppressWarnings("hiding") PFatorEscreva _fatorEscreva_)
    {
        // Constructor
        setFatorEscreva(_fatorEscreva_);

    }

    @Override
    public Object clone()
    {
        return new AFatorEscrevaTermoEscreva(
            cloneNode(this._fatorEscreva_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFatorEscrevaTermoEscreva(this);
    }

    public PFatorEscreva getFatorEscreva()
    {
        return this._fatorEscreva_;
    }

    public void setFatorEscreva(PFatorEscreva node)
    {
        if(this._fatorEscreva_ != null)
        {
            this._fatorEscreva_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorEscreva_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fatorEscreva_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fatorEscreva_ == child)
        {
            this._fatorEscreva_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fatorEscreva_ == oldChild)
        {
            setFatorEscreva((PFatorEscreva) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}