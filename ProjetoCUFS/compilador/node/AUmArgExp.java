/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AUmArgExp extends PArgExp
{
    private PIndiceExp _indiceExp_;

    public AUmArgExp()
    {
        // Constructor
    }

    public AUmArgExp(
        @SuppressWarnings("hiding") PIndiceExp _indiceExp_)
    {
        // Constructor
        setIndiceExp(_indiceExp_);

    }

    @Override
    public Object clone()
    {
        return new AUmArgExp(
            cloneNode(this._indiceExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUmArgExp(this);
    }

    public PIndiceExp getIndiceExp()
    {
        return this._indiceExp_;
    }

    public void setIndiceExp(PIndiceExp node)
    {
        if(this._indiceExp_ != null)
        {
            this._indiceExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._indiceExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._indiceExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._indiceExp_ == child)
        {
            this._indiceExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._indiceExp_ == oldChild)
        {
            setIndiceExp((PIndiceExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
