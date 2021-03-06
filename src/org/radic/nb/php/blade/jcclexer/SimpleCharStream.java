/* Generated By:JavaCC: Do not edit this line. SimpleCharStream.java Version 5.0 */
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.radic.nb.php.blade.jcclexer;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import org.netbeans.spi.lexer.LexerInput;

/**
 * An implementation of interface CharStream, where the stream is assumed to
 * contain only ASCII characters (without unicode processing).
 */


public class SimpleCharStream
{
    private LexerInput input;

    static boolean staticFlag;

    public SimpleCharStream(LexerInput input) {
        this.input = input;
    }

    SimpleCharStream(Reader stream, int i, int i0) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    SimpleCharStream(InputStream stream, String encoding, int i, int i0) throws UnsupportedEncodingException {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    char BeginToken() throws IOException {
        return (char)input.read();
    }

    String GetImage() {
        return input.readText().toString();
    }

     public char[] GetSuffix(int len) {
        if (len > input.readLength ())
            throw new IllegalArgumentException ();
        return input.readText (input.readLength () - len, input.readLength ()).toString ().toCharArray ();
     }

    void ReInit(Reader stream, int i, int i0) {
        throw new UnsupportedOperationException ("Not yet implemented");
    }

    void ReInit(InputStream stream, String encoding, int i, int i0) throws UnsupportedEncodingException {
        throw new UnsupportedOperationException ("Not yet implemented");
    }

    void backup(int i) {
        try {
            input.backup(i);
        } catch (IndexOutOfBoundsException ex) {
            
        }
    }

    int getBeginColumn () {
        return 0;
    }

    int getBeginLine () {
        return 0;
    }

    int getEndColumn () {
        return 0;
    }

    int getEndLine () {
        return 0;
    }

    char readChar () throws IOException {
        int result = input.read();
        if (result == LexerInput.EOF) {
            throw new IOException("LexerInput EOF");
        }
        return (char) result;
    }
}
/* JavaCC - OriginalChecksum=0d7b08657b25c87ecd27f3ffff4e8c6c (do not edit this line) */
