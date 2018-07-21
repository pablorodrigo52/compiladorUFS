/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpeDiferenteExpLogicaEsq extends PExpLogicaEsq
{
    private PExpLogicaEsq _expLogicaEsq_;
    private TDiferente _diferente_;
    private PExpLogicaDir _expLogicaDir_;

    public AExpeDiferenteExpLogicaEsq()
    {
        // Constructor
    }

    public AExpeDiferenteExpLogicaEsq(
        @SuppressWarnings("hiding") PExpLogicaEsq _expLogicaEsq_,
        @SuppressWarnings("hiding") TDiferente _diferente_,
        @SuppressWarnings("hiding") PExpLogicaDir _expLogicaDir_)
    {
        // Constructor
        setExpLogicaEsq(_expLogicaEsq_);

        setDiferente(_diferente_);

        setExpLogicaDir(_expLogicaDir_);

    }

    @Override
    public Object clone()
    {
        return new AExpeDiferenteExpLogicaEsq(
            cloneNode(this._expLogicaEsq_),
            cloneNode(this._diferente_),
            cloneNode(this._expLogicaDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpeDiferenteExpLogicaEsq(this);
    }

    public PExpLogicaEsq getExpLogicaEsq()
    {
        return this._expLogicaEsq_;
    }

    public void setExpLogicaEsq(PExpLogicaEsq node)
    {
        if(this._expLogicaEsq_ != null)
        {
            this._expLogicaEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogicaEsq_ = node;
    }

    public TDiferente getDiferente()
    {
        return this._diferente_;
    }

    public void setDiferente(TDiferente node)
    {
        if(this._diferente_ != null)
        {
            this._diferente_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._diferente_ = node;
    }

    public PExpLogicaDir getExpLogicaDir()
    {
        return this._expLogicaDir_;
    }

    public void setExpLogicaDir(PExpLogicaDir node)
    {
        if(this._expLogicaDir_ != null)
        {
            this._expLogicaDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogicaDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogicaEsq_)
            + toString(this._diferente_)
            + toString(this._expLogicaDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogicaEsq_ == child)
        {
            this._expLogicaEsq_ = null;
            return;
        }

        if(this._diferente_ == child)
        {
            this._diferente_ = null;
            return;
        }

        if(this._expLogicaDir_ == child)
        {
            this._expLogicaDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogicaEsq_ == oldChild)
        {
            setExpLogicaEsq((PExpLogicaEsq) newChild);
            return;
        }

        if(this._diferente_ == oldChild)
        {
            setDiferente((TDiferente) newChild);
            return;
        }

        if(this._expLogicaDir_ == oldChild)
        {
            setExpLogicaDir((PExpLogicaDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}