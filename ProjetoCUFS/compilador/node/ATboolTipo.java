/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ATboolTipo extends PTipo
{
    private TTipobooleano _tipobooleano_;

    public ATboolTipo()
    {
        // Constructor
    }

    public ATboolTipo(
        @SuppressWarnings("hiding") TTipobooleano _tipobooleano_)
    {
        // Constructor
        setTipobooleano(_tipobooleano_);

    }

    @Override
    public Object clone()
    {
        return new ATboolTipo(
            cloneNode(this._tipobooleano_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATboolTipo(this);
    }

    public TTipobooleano getTipobooleano()
    {
        return this._tipobooleano_;
    }

    public void setTipobooleano(TTipobooleano node)
    {
        if(this._tipobooleano_ != null)
        {
            this._tipobooleano_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipobooleano_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipobooleano_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipobooleano_ == child)
        {
            this._tipobooleano_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipobooleano_ == oldChild)
        {
            setTipobooleano((TTipobooleano) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
