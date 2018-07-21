/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoDirMultiplicacaoExpressaoDir extends PExpressaoDir
{
    private PExpressaoDir _expressaoDir_;
    private TMult _mult_;
    private PFatorExp _fatorExp_;

    public AExpressaoDirMultiplicacaoExpressaoDir()
    {
        // Constructor
    }

    public AExpressaoDirMultiplicacaoExpressaoDir(
        @SuppressWarnings("hiding") PExpressaoDir _expressaoDir_,
        @SuppressWarnings("hiding") TMult _mult_,
        @SuppressWarnings("hiding") PFatorExp _fatorExp_)
    {
        // Constructor
        setExpressaoDir(_expressaoDir_);

        setMult(_mult_);

        setFatorExp(_fatorExp_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoDirMultiplicacaoExpressaoDir(
            cloneNode(this._expressaoDir_),
            cloneNode(this._mult_),
            cloneNode(this._fatorExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoDirMultiplicacaoExpressaoDir(this);
    }

    public PExpressaoDir getExpressaoDir()
    {
        return this._expressaoDir_;
    }

    public void setExpressaoDir(PExpressaoDir node)
    {
        if(this._expressaoDir_ != null)
        {
            this._expressaoDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoDir_ = node;
    }

    public TMult getMult()
    {
        return this._mult_;
    }

    public void setMult(TMult node)
    {
        if(this._mult_ != null)
        {
            this._mult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mult_ = node;
    }

    public PFatorExp getFatorExp()
    {
        return this._fatorExp_;
    }

    public void setFatorExp(PFatorExp node)
    {
        if(this._fatorExp_ != null)
        {
            this._fatorExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoDir_)
            + toString(this._mult_)
            + toString(this._fatorExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoDir_ == child)
        {
            this._expressaoDir_ = null;
            return;
        }

        if(this._mult_ == child)
        {
            this._mult_ = null;
            return;
        }

        if(this._fatorExp_ == child)
        {
            this._fatorExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoDir_ == oldChild)
        {
            setExpressaoDir((PExpressaoDir) newChild);
            return;
        }

        if(this._mult_ == oldChild)
        {
            setMult((TMult) newChild);
            return;
        }

        if(this._fatorExp_ == oldChild)
        {
            setFatorExp((PFatorExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
