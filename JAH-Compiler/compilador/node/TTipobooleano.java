/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TTipobooleano extends Token
{
    public TTipobooleano()
    {
        super.setText("booleano");
    }

    public TTipobooleano(int line, int pos)
    {
        super.setText("booleano");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTipobooleano(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTipobooleano(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTipobooleano text.");
    }
}