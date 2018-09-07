/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.Analysis;

@SuppressWarnings("nls")
public final class AVariavelNegativaExpressaoFinal extends PExpressaoFinal
{
    private PExpressaoFinal _expressaoFinal_;

    public AVariavelNegativaExpressaoFinal()
    {
        // Constructor
    }

    public AVariavelNegativaExpressaoFinal(
        @SuppressWarnings("hiding") PExpressaoFinal _expressaoFinal_)
    {
        // Constructor
        setExpressaoFinal(_expressaoFinal_);

    }

    @Override
    public Object clone()
    {
        return new AVariavelNegativaExpressaoFinal(
            cloneNode(this._expressaoFinal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariavelNegativaExpressaoFinal(this);
    }

    public PExpressaoFinal getExpressaoFinal()
    {
        return this._expressaoFinal_;
    }

    public void setExpressaoFinal(PExpressaoFinal node)
    {
        if(this._expressaoFinal_ != null)
        {
            this._expressaoFinal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoFinal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoFinal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoFinal_ == child)
        {
            this._expressaoFinal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoFinal_ == oldChild)
        {
            setExpressaoFinal((PExpressaoFinal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
