/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AConstanteDeclaracao extends PDeclaracao
{
    private TConstante _constante_;
    private TId _id_;
    private PValor _valor_;

    public AConstanteDeclaracao()
    {
        // Constructor
    }

    public AConstanteDeclaracao(
        @SuppressWarnings("hiding") TConstante _constante_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PValor _valor_)
    {
        // Constructor
        setConstante(_constante_);

        setId(_id_);

        setValor(_valor_);

    }

    @Override
    public Object clone()
    {
        return new AConstanteDeclaracao(
            cloneNode(this._constante_),
            cloneNode(this._id_),
            cloneNode(this._valor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstanteDeclaracao(this);
    }

    public TConstante getConstante()
    {
        return this._constante_;
    }

    public void setConstante(TConstante node)
    {
        if(this._constante_ != null)
        {
            this._constante_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._constante_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._constante_)
            + toString(this._id_)
            + toString(this._valor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._constante_ == child)
        {
            this._constante_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._constante_ == oldChild)
        {
            setConstante((TConstante) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}