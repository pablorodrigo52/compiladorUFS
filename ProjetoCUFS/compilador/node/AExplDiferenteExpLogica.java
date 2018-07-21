/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExplDiferenteExpLogica extends PExpLogica
{
    private PExpLogica _expLogica_;
    private TDiferente _diferente_;
    private PFator _fator_;

    public AExplDiferenteExpLogica()
    {
        // Constructor
    }

    public AExplDiferenteExpLogica(
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TDiferente _diferente_,
        @SuppressWarnings("hiding") PFator _fator_)
    {
        // Constructor
        setExpLogica(_expLogica_);

        setDiferente(_diferente_);

        setFator(_fator_);

    }

    @Override
    public Object clone()
    {
        return new AExplDiferenteExpLogica(
            cloneNode(this._expLogica_),
            cloneNode(this._diferente_),
            cloneNode(this._fator_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExplDiferenteExpLogica(this);
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
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

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica_)
            + toString(this._diferente_)
            + toString(this._fator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._diferente_ == child)
        {
            this._diferente_ = null;
            return;
        }

        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._diferente_ == oldChild)
        {
            setDiferente((TDiferente) newChild);
            return;
        }

        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
