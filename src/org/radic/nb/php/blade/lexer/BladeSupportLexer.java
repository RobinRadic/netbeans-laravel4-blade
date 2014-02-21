

package org.radic.nb.php.blade.lexer;

import org.radic.nb.php.blade.jcclexer.BladeLexerTokenManager;
import org.radic.nb.php.blade.jcclexer.SimpleCharStream;
import org.radic.nb.php.blade.jcclexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Arcanefoam (Horacio Hoyos) <arcanefoam at gmail dot com>
 */
public class BladeSupportLexer implements Lexer<BladeSupportTokenId> {

    private LexerRestartInfo<BladeSupportTokenId> lri;
    private BladeLexerTokenManager bladeLexerTokenManager;


    public BladeSupportLexer(LexerRestartInfo<BladeSupportTokenId> lri) {
        this.lri = lri;
        SimpleCharStream stream = new SimpleCharStream(lri.input());
        bladeLexerTokenManager = new BladeLexerTokenManager(stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<BladeSupportTokenId> nextToken() {

        Token token = bladeLexerTokenManager.getNextToken();
        if (lri.input().readLength() < 1) {
            return null;
        }
        return lri.tokenFactory().createToken(BladeLanguageHierarchy.getToken(token.kind));
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }

}
