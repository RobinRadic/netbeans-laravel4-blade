package org.radic.nb.php.blade;

//import net.sourceforge.luatopping.luasupport.lexer.LuaSupportTokenId;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.radic.nb.php.blade.lexer.BladeSupportTokenId;

@LanguageRegistration(mimeType = "text/x-blade")
public class BladeLanguage extends DefaultLanguageConfig {
    
    @Override
    public Language<BladeSupportTokenId> getLexerLanguage() {
        return BladeSupportTokenId.getLanguage();
    }

    @Override
    public String getDisplayName() {
        return "blade";
    }
    
    @Override
    public String getPreferredExtension() { return "blade"; }
    
    
    @Override
    public boolean hasHintsProvider() { return false; }
}
