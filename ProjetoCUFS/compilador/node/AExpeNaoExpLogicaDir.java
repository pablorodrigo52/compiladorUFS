/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpeNaoExpLogicaDir extends PExpLogicaDir
{
    private TNao _nao_;
    private PExpLogicaDir _expLogicaDir_;

    public AExpeNaoExpLogicaDir()
    {
        // Constructor
    }

    public AExpeNaoExpLogicaDir(
        @SuppressWarnings("hiding") TNao _nao_,
        @SuppressWarnings("hiding") PExpLogicaDir _expLogicaDir_)
    {
        // Constructor
        setNao(_nao_);

        setExpLogicaDir(_expLogicaDir_);

    }

    @Override
    public Object clone()
    {
        return new AExpeNaoExpLogicaDir(
            cloneNode(this._nao_),
            cloneNode(this._expLogicaDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpeNaoExpLogicaDir(this);
    }

    public TNao getNao()
    {
        return this._nao_;
    }

    public void setNao(TNao node)
    {
        if(this._nao_ != null)
        {
            this._nao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nao_ = node;
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
            + toString(this._nao_)
            + toString(this._expLogicaDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nao_ == child)
        {
            this._nao_ = null;
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
        if(this._nao_ == oldChild)
        {
            setNao((TNao) newChild);
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
