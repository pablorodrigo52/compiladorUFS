/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.Analysis;

@SuppressWarnings("nls")
public final class TReal extends Token
{
    public TReal(String text)
    {
        setText(text);
    }

    public TReal(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReal(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReal(this);
    }
}
