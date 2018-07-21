/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ATermoVetorTermo extends PTermo
{
    private PVarvetor _varvetor_;

    public ATermoVetorTermo()
    {
        // Constructor
    }

    public ATermoVetorTermo(
        @SuppressWarnings("hiding") PVarvetor _varvetor_)
    {
        // Constructor
        setVarvetor(_varvetor_);

    }

    @Override
    public Object clone()
    {
        return new ATermoVetorTermo(
            cloneNode(this._varvetor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoVetorTermo(this);
    }

    public PVarvetor getVarvetor()
    {
        return this._varvetor_;
    }

    public void setVarvetor(PVarvetor node)
    {
        if(this._varvetor_ != null)
        {
            this._varvetor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varvetor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._varvetor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varvetor_ == child)
        {
            this._varvetor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._varvetor_ == oldChild)
        {
            setVarvetor((PVarvetor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}