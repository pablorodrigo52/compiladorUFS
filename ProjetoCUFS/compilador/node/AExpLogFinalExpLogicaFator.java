/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpLogFinalExpLogicaFator extends PExpLogicaFator
{
    private PExpLogicaFinal _expLogicaFinal_;

    public AExpLogFinalExpLogicaFator()
    {
        // Constructor
    }

    public AExpLogFinalExpLogicaFator(
        @SuppressWarnings("hiding") PExpLogicaFinal _expLogicaFinal_)
    {
        // Constructor
        setExpLogicaFinal(_expLogicaFinal_);

    }

    @Override
    public Object clone()
    {
        return new AExpLogFinalExpLogicaFator(
            cloneNode(this._expLogicaFinal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpLogFinalExpLogicaFator(this);
    }

    public PExpLogicaFinal getExpLogicaFinal()
    {
        return this._expLogicaFinal_;
    }

    public void setExpLogicaFinal(PExpLogicaFinal node)
    {
        if(this._expLogicaFinal_ != null)
        {
            this._expLogicaFinal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogicaFinal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogicaFinal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogicaFinal_ == child)
        {
            this._expLogicaFinal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogicaFinal_ == oldChild)
        {
            setExpLogicaFinal((PExpLogicaFinal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
