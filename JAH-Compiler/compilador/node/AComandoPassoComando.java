/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.*;
import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AComandoPassoComando extends PComando
{
    private PVar _var_;
    private TInteiro _fifth_;
    private TInteiro _sixth_;
    private TInteiro _seventh_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AComandoPassoComando()
    {
        // Constructor
    }

    public AComandoPassoComando(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TInteiro _fifth_,
        @SuppressWarnings("hiding") TInteiro _sixth_,
        @SuppressWarnings("hiding") TInteiro _seventh_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setVar(_var_);

        setFifth(_fifth_);

        setSixth(_sixth_);

        setSeventh(_seventh_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AComandoPassoComando(
            cloneNode(this._var_),
            cloneNode(this._fifth_),
            cloneNode(this._sixth_),
            cloneNode(this._seventh_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoPassoComando(this);
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

    public TInteiro getFifth()
    {
        return this._fifth_;
    }

    public void setFifth(TInteiro node)
    {
        if(this._fifth_ != null)
        {
            this._fifth_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fifth_ = node;
    }

    public TInteiro getSixth()
    {
        return this._sixth_;
    }

    public void setSixth(TInteiro node)
    {
        if(this._sixth_ != null)
        {
            this._sixth_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sixth_ = node;
    }

    public TInteiro getSeventh()
    {
        return this._seventh_;
    }

    public void setSeventh(TInteiro node)
    {
        if(this._seventh_ != null)
        {
            this._seventh_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seventh_ = node;
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
            + toString(this._fifth_)
            + toString(this._sixth_)
            + toString(this._seventh_)
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

        if(this._fifth_ == child)
        {
            this._fifth_ = null;
            return;
        }

        if(this._sixth_ == child)
        {
            this._sixth_ = null;
            return;
        }

        if(this._seventh_ == child)
        {
            this._seventh_ = null;
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

        if(this._fifth_ == oldChild)
        {
            setFifth((TInteiro) newChild);
            return;
        }

        if(this._sixth_ == oldChild)
        {
            setSixth((TInteiro) newChild);
            return;
        }

        if(this._seventh_ == oldChild)
        {
            setSeventh((TInteiro) newChild);
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
