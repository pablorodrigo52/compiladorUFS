/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.lexer;

import java.io.IOException;

@SuppressWarnings("serial")
public interface IPushbackReader
{
    public int read() throws IOException;
    public void unread(int c) throws IOException;
}
