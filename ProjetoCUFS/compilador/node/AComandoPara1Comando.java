/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import compilador.analysis.Analysis;

@SuppressWarnings("nls")
public final class AComandoPara1Comando extends PComando
{
    private PVar _var_;
    private TInteiro _frist_;
    private TInteiro _second_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AComandoPara1Comando()
    {
        // Constructor
    }

    public AComandoPara1Comando(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TInteiro _frist_,
        @SuppressWarnings("hiding") TInteiro _second_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setVar(_var_);

        setFrist(_frist_);

        setSecond(_second_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AComandoPara1Comando(
            cloneNode(this._var_),
            cloneNode(this._frist_),
            cloneNode(this._second_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoPara1Comando(this);
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

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._var_)
            + toString(this._frist_)
            + toString(this._second_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._frist_ == child)
        {
            this._frist_ = null;
            return;
        }

        if(this._second_ == child)
        {
            this._second_ = null;
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._frist_ == oldChild)
        {
            setFrist((TInteiro) newChild);
            return;
        }

        if(this._second_ == oldChild)
        {
            setSecond((TInteiro) newChild);
            return;
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
