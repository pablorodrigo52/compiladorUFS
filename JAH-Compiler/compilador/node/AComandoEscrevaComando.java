/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AComandoEscrevaComando extends PComando
{
    private PExpEscreva _expEscreva_;

    public AComandoEscrevaComando()
    {
        // Constructor
    }

    public AComandoEscrevaComando(
        @SuppressWarnings("hiding") PExpEscreva _expEscreva_)
    {
        // Constructor
        setExpEscreva(_expEscreva_);

    }

    @Override
    public Object clone()
    {
        return new AComandoEscrevaComando(
            cloneNode(this._expEscreva_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoEscrevaComando(this);
    }

    public PExpEscreva getExpEscreva()
    {
        return this._expEscreva_;
    }

    public void setExpEscreva(PExpEscreva node)
    {
        if(this._expEscreva_ != null)
        {
            this._expEscreva_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expEscreva_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expEscreva_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expEscreva_ == child)
        {
            this._expEscreva_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expEscreva_ == oldChild)
        {
            setExpEscreva((PExpEscreva) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}