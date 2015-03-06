(Discontinued) Blade template support for NetBeans 8.0
=======================


## Due to the fact that PHPStorm is so, so much better then NetBeans and because PHPStorm has Blade syntax highlighting + laravel plugin, i do not plan to continue with the project.


A work in progress to include syntax highlighting for Blade files in NetBeans (8.0, currently in Beta)

### Current status
Currenlty the lexer only has token MULTI_LINE_COMMENT for {{-- comments --}}. Seems to work.

    <DEFAULT>Current character : { (123) at line 0 column 0
       Possible string literal matches : { "{{--" } 
    <DEFAULT>Current character : { (123) at line 0 column 0
       Possible string literal matches : { "{{--" } 
    <DEFAULT>Current character : - (45) at line 0 column 0
       Possible string literal matches : { "{{--" } 
    <DEFAULT>Current character : - (45) at line 0 column 0
       No more string literal token matches are possible.
       Currently matched the first 4 characters as a "{{--" token.
    ****** FOUND A "{{--" MATCH ({{--) ******

    <IN_MULTI_LINE_COMMENT>Current character :   (32) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character :   (32) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH ( ) ******

    <IN_MULTI_LINE_COMMENT>Current character : C (67) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character : C (67) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH (C) ******

    <IN_MULTI_LINE_COMMENT>Current character : o (111) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character : o (111) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH (o) ******

    <IN_MULTI_LINE_COMMENT>Current character : m (109) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character : m (109) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH (m) ******

    <IN_MULTI_LINE_COMMENT>Current character : m (109) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character : m (109) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH (m) ******

    <IN_MULTI_LINE_COMMENT>Current character : e (101) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character : e (101) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH (e) ******

    <IN_MULTI_LINE_COMMENT>Current character : n (110) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character : n (110) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH (n) ******

    <IN_MULTI_LINE_COMMENT>Current character : t (116) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character : t (116) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH (t) ******

    <IN_MULTI_LINE_COMMENT>Current character :   (32) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character :   (32) at line 0 column 0
       No string literal matches possible.
       Current character matched as a <token of kind 8> token.
    ****** FOUND A <token of kind 8> MATCH ( ) ******

    <IN_MULTI_LINE_COMMENT>Current character : - (45) at line 0 column 0
    <IN_MULTI_LINE_COMMENT>Current character : - (45) at line 0 column 0
       Possible string literal matches : { "--}}" } 
    <IN_MULTI_LINE_COMMENT>Current character : - (45) at line 0 column 0
       Possible string literal matches : { "--}}" } 
    <IN_MULTI_LINE_COMMENT>Current character : } (125) at line 0 column 0
       Possible string literal matches : { "--}}" } 
    <IN_MULTI_LINE_COMMENT>Current character : } (125) at line 0 column 0
       No more string literal token matches are possible.
       Currently matched the first 4 characters as a "--}}" token.
    ****** FOUND A "--}}" MATCH (--}}) ******

Currently when moving the caret in the editor to EOF, it produces an error. 

    SEVERE [org.openide.util.RequestProcessor]: Error in RequestProcessor org.netbeans.modules.editor.hints.HintsUI$4
    java.lang.ArrayIndexOutOfBoundsException: 18
    at org.netbeans.modules.editor.lib2.document.CharContent.charAt(CharContent.java:80)
    at org.netbeans.lib.lexer.TextLexerInputOperation.readExisting(TextLexerInputOperation.java:99)
    at org.netbeans.lib.lexer.LexerInputOperation.readExistingAtIndex(LexerInputOperation.java:190)
    at org.netbeans.spi.lexer.LexerInput$ReadText.charAt(LexerInput.java:367)
    at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:482)
    at java.lang.StringBuilder.append(StringBuilder.java:191)
    at org.netbeans.lib.editor.util.CharSequenceUtilities.toString(CharSequenceUtilities.java:158)
    at org.netbeans.lib.editor.util.AbstractCharSequence.toString(AbstractCharSequence.java:84)
    at org.netbeans.lib.editor.util.AbstractCharSequence.toString(AbstractCharSequence.java:102)
    at org.radic.nb.php.blade.jcclexer.SimpleCharStream.GetSuffix(SimpleCharStream.java:46)
    at org.radic.nb.php.blade.jcclexer.BladeLexerTokenManager.getNextToken(BladeLexerTokenManager.java:363)
    at org.radic.nb.php.blade.lexer.BladeSupportLexer.nextToken(BladeSupportLexer.java:30)
    at org.netbeans.lib.lexer.LexerInputOperation.nextToken(LexerInputOperation.java:215)
    at org.netbeans.lib.lexer.inc.IncTokenList.tokenOrEmbeddingImpl(IncTokenList.java:195)
    at org.netbeans.lib.lexer.inc.IncTokenList.tokenOrEmbedding(IncTokenList.java:190)
    at org.netbeans.api.lexer.TokenSequence.moveNext(TokenSequence.java:488)
    at org.netbeans.modules.editor.lib2.highlighting.SyntaxHighlighting$TSInfo.moveNextToken(SyntaxHighlighting.java:771)
    at org.netbeans.modules.editor.lib2.highlighting.SyntaxHighlighting$HSImpl.moveTheSequence(SyntaxHighlighting.java:478)
    at org.netbeans.modules.editor.lib2.highlighting.SyntaxHighlighting$HSImpl.moveNext(SyntaxHighlighting.java:427)
    at org.netbeans.modules.editor.lib2.highlighting.DirectMergeContainer$Wrapper.fetchNextHighlight(DirectMergeContainer.java:443)
    at org.netbeans.modules.editor.lib2.highlighting.DirectMergeContainer$Wrapper.<init>(DirectMergeContainer.java:408)
    at org.netbeans.modules.editor.lib2.highlighting.DirectMergeContainer$HlSequence.<init>(DirectMergeContainer.java:198)
    at org.netbeans.modules.editor.lib2.highlighting.DirectMergeContainer.getHighlights(DirectMergeContainer.java:104)
    at org.netbeans.modules.editor.hints.HintsUI$4$1.run(HintsUI.java:1024)
    at org.netbeans.editor.BaseDocument.render(BaseDocument.java:1391)
    at org.netbeans.modules.editor.hints.HintsUI$4.run(HintsUI.java:1022)
    at org.openide.util.RequestProcessor$Task.run(RequestProcessor.java:1423)
    at org.openide.util.RequestProcessor$Processor.run(RequestProcessor.java:2033)
    Caused: org.openide.util.RequestProcessor$FastItem: task failed due to
