/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.Analysis;

@SuppressWarnings("nls")
public final class AComandoCondicionalComandos extends PComandos
{
    private PCondComando _condComando_;

    public AComandoCondicionalComandos()
    {
        // Constructor
    }

    public AComandoCondicionalComandos(
        @SuppressWarnings("hiding") PCondComando _condComando_)
    {
        // Constructor
        setCondComando(_condComando_);

    }

    @Override
    public Object clone()
    {
        return new AComandoCondicionalComandos(
            cloneNode(this._condComando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoCondicionalComandos(this);
    }

    public PCondComando getCondComando()
    {
        return this._condComando_;
    }

    public void setCondComando(PCondComando node)
    {
        if(this._condComando_ != null)
        {
            this._condComando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condComando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._condComando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._condComando_ == child)
        {
            this._condComando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._condComando_ == oldChild)
        {
            setCondComando((PCondComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
