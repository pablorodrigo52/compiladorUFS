/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AComandoPara1Comando extends PComando
{
    private TPara _para_;
    private PVar _var_;
    private TDe _de_;
    private TInteiro _frist_;
    private TAte _ate_;
    private TInteiro _second_;
    private TFaca _faca_;
    private PComandos _comandos_;
    private PComando _comando_;
    private TFimpara _fimpara_;
    private TPontoevirgula _four_;

    public AComandoPara1Comando()
    {
        // Constructor
    }

    public AComandoPara1Comando(
        @SuppressWarnings("hiding") TPara _para_,
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TDe _de_,
        @SuppressWarnings("hiding") TInteiro _frist_,
        @SuppressWarnings("hiding") TAte _ate_,
        @SuppressWarnings("hiding") TInteiro _second_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PComandos _comandos_,
        @SuppressWarnings("hiding") PComando _comando_,
        @SuppressWarnings("hiding") TFimpara _fimpara_,
        @SuppressWarnings("hiding") TPontoevirgula _four_)
    {
        // Constructor
        setPara(_para_);

        setVar(_var_);

        setDe(_de_);

        setFrist(_frist_);

        setAte(_ate_);

        setSecond(_second_);

        setFaca(_faca_);

        setComandos(_comandos_);

        setComando(_comando_);

        setFimpara(_fimpara_);

        setFour(_four_);

    }

    @Override
    public Object clone()
    {
        return new AComandoPara1Comando(
            cloneNode(this._para_),
            cloneNode(this._var_),
            cloneNode(this._de_),
            cloneNode(this._frist_),
            cloneNode(this._ate_),
            cloneNode(this._second_),
            cloneNode(this._faca_),
            cloneNode(this._comandos_),
            cloneNode(this._comando_),
            cloneNode(this._fimpara_),
            cloneNode(this._four_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoPara1Comando(this);
    }

    public TPara getPara()
    {
        return this._para_;
    }

    public void setPara(TPara node)
    {
        if(this._para_ != null)
        {
            this._para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._para_ = node;
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TDe getDe()
    {
        return this._de_;
    }

    public void setDe(TDe node)
    {
        if(this._de_ != null)
        {
            this._de_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._de_ = node;
    }

    public TInteiro getFrist()
    {
        return this._frist_;
    }

    public void setFrist(TInteiro node)
    {
        if(this._frist_ != null)
        {
            this._frist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._frist_ = node;
    }

    public TAte getAte()
    {
        return this._ate_;
    }

    public void setAte(TAte node)
    {
        if(this._ate_ != null)
        {
            this._ate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ate_ = node;
    }

    public TInteiro getSecond()
    {
        return this._second_;
    }

    public void setSecond(TInteiro node)
    {
        if(this._second_ != null)
        {
            this._second_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._second_ = node;
    }

    public TFaca getFaca()
    {
        return this._faca_;
    }

    public void setFaca(TFaca node)
    {
        if(this._faca_ != null)
        {
            this._faca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._faca_ = node;
    }

    public PComandos getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(PComandos node)
    {
        if(this._comandos_ != null)
        {
            this._comandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandos_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    public TFimpara getFimpara()
    {
        return this._fimpara_;
    }

    public void setFimpara(TFimpara node)
    {
        if(this._fimpara_ != null)
        {
            this._fimpara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimpara_ = node;
    }

    public TPontoevirgula getFour()
    {
        return this._four_;
    }

    public void setFour(TPontoevirgula node)
    {
        if(this._four_ != null)
        {
            this._four_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._four_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._para_)
            + toString(this._var_)
            + toString(this._de_)
            + toString(this._frist_)
            + toString(this._ate_)
            + toString(this._second_)
            + toString(this._faca_)
            + toString(this._comandos_)
            + toString(this._comando_)
            + toString(this._fimpara_)
            + toString(this._four_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._para_ == child)
        {
            this._para_ = null;
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._de_ == child)
        {
            this._de_ = null;
            return;
        }

        if(this._frist_ == child)
        {
            this._frist_ = null;
            return;
        }

        if(this._ate_ == child)
        {
            this._ate_ = null;
            return;
        }

        if(this._second_ == child)
        {
            this._second_ = null;
            return;
        }

        if(this._faca_ == child)
        {
            this._faca_ = null;
            return;
        }

        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        if(this._fimpara_ == child)
        {
            this._fimpara_ = null;
            return;
        }

        if(this._four_ == child)
        {
            this._four_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._para_ == oldChild)
        {
            setPara((TPara) newChild);
            return;
        }

        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._de_ == oldChild)
        {
            setDe((TDe) newChild);
            return;
        }

        if(this._frist_ == oldChild)
        {
            setFrist((TInteiro) newChild);
            return;
        }

        if(this._ate_ == oldChild)
        {
            setAte((TAte) newChild);
            return;
        }

        if(this._second_ == oldChild)
        {
            setSecond((TInteiro) newChild);
            return;
        }

        if(this._faca_ == oldChild)
        {
            setFaca((TFaca) newChild);
            return;
        }

        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        if(this._fimpara_ == oldChild)
        {
            setFimpara((TFimpara) newChild);
            return;
        }

        if(this._four_ == oldChild)
        {
            setFour((TPontoevirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
