/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpEsqAninhadaExpressao extends PExpressao
{
    private TAparentese _aparentese_;
    private PExpressao _expressao_;
    private TFparentese _fparentese_;

    public AExpEsqAninhadaExpressao()
    {
        // Constructor
    }

    public AExpEsqAninhadaExpressao(
        @SuppressWarnings("hiding") TAparentese _aparentese_,
        @SuppressWarnings("hiding") PExpressao _expressao_,
        @SuppressWarnings("hiding") TFparentese _fparentese_)
    {
        // Constructor
        setAparentese(_aparentese_);

        setExpressao(_expressao_);

        setFparentese(_fparentese_);

    }

    @Override
    public Object clone()
    {
        return new AExpEsqAninhadaExpressao(
            cloneNode(this._aparentese_),
            cloneNode(this._expressao_),
            cloneNode(this._fparentese_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpEsqAninhadaExpressao(this);
    }

    public TAparentese getAparentese()
    {
        return this._aparentese_;
    }

    public void setAparentese(TAparentese node)
    {
        if(this._aparentese_ != null)
        {
            this._aparentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aparentese_ = node;
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    public TFparentese getFparentese()
    {
        return this._fparentese_;
    }

    public void setFparentese(TFparentese node)
    {
        if(this._fparentese_ != null)
        {
            this._fparentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fparentese_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aparentese_)
            + toString(this._expressao_)
            + toString(this._fparentese_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aparentese_ == child)
        {
            this._aparentese_ = null;
            return;
        }

        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        if(this._fparentese_ == child)
        {
            this._fparentese_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aparentese_ == oldChild)
        {
            setAparentese((TAparentese) newChild);
            return;
        }

        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        if(this._fparentese_ == oldChild)
        {
            setFparentese((TFparentese) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
