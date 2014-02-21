/*
 *  Copyright (C) 2012 Arcanefoam (Horacio Hoyos) <arcanefoam at gmail dot com>
 * 
 *  This file is part of lusSupport
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *//*
 *  Copyright (C) 2012 Arcanefoam (Horacio Hoyos) <arcanefoam at gmail dot com>
 * 
 *  This file is part of lusSupport
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.radic.nb.php.blade.lexer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Arcanefoam (Horacio Hoyos) <arcanefoam at gmail dot com>
 */
public class BladeLanguageHierarchy extends LanguageHierarchy<BladeSupportTokenId> {

    private static List<BladeSupportTokenId>  tokens;
    private static Map<Integer,BladeSupportTokenId> idToToken;

    private static void init () {
        int i;
        tokens = Arrays.<BladeSupportTokenId> asList (new BladeSupportTokenId[] {
            new BladeSupportTokenId("EOF", "whitespace", 0),
            //new BladeSupportTokenId("WHITESPACE", "whitespace", 1),
            //new BladeSupportTokenId("SINGLE_LINE_COMMENT", "comment", 4),
            new BladeSupportTokenId("MULTI_LINE_COMMENT", "comment", 7),
            /*new BladeSupportTokenId("LIT_STRING", "litstring", 7),
            new BladeSupportTokenId("SIN_QUOTE", "string", 10),
            new BladeSupportTokenId("DBL_QUOTE", "string", 11),
            new BladeSupportTokenId("NIL", "keyword", i=13),
            new BladeSupportTokenId("BOOL", "keyword", ++i),
            new BladeSupportTokenId("AND", "keyword", ++i),
            new BladeSupportTokenId("NOT", "keyword", ++i),
            new BladeSupportTokenId("OR", "keyword", ++i),
            new BladeSupportTokenId("DO", "keyword", ++i),
            new BladeSupportTokenId("END", "keyword", ++i),
            new BladeSupportTokenId("WHILE", "keyword", ++i),
            new BladeSupportTokenId("REPEAT", "keyword", ++i),
            new BladeSupportTokenId("UNTIL", "keyword", ++i),
            new BladeSupportTokenId("IF", "keyword", ++i),
            new BladeSupportTokenId("THEN", "keyword", ++i),
            new BladeSupportTokenId("ELSEIF", "keyword", ++i),
            new BladeSupportTokenId("ELSE", "keyword", ++i),
            new BladeSupportTokenId("FOR", "keyword", ++i),
            new BladeSupportTokenId("IN", "keyword", ++i),
            new BladeSupportTokenId("FUNCTION", "keyword", ++i),
            new BladeSupportTokenId("BREAK", "keyword", ++i),
            new BladeSupportTokenId("RETURN", "keyword", ++i),
            new BladeSupportTokenId("BASIC", "basic", ++i),
            new BladeSupportTokenId("COROUTINE_LIB", "library", ++i),
            new BladeSupportTokenId("PACKAGE_LIB", "library", ++i),
            new BladeSupportTokenId("STRING_LIB", "library", ++i),
            new BladeSupportTokenId("TABLE_LIB", "library", ++i),
            new BladeSupportTokenId("MATH_LIB", "library", ++i),
            new BladeSupportTokenId("IO_LIB", "library", ++i),
            new BladeSupportTokenId("OS_LIB", "library", ++i),
            new BladeSupportTokenId("DEBUG", "library", ++i),
            new BladeSupportTokenId("LOCAL", "keyword", ++i),
            new BladeSupportTokenId("NUMBER", "number", ++i),
            new BladeSupportTokenId("IDENTIFIER", "identifier", ++i),
            new BladeSupportTokenId("LENGTH_OP", "operator", ++i),
            new BladeSupportTokenId("ASIGN_OP", "operator", ++i),
            new BladeSupportTokenId("FIELD_SEPARATOR", "separator", ++i),
            new BladeSupportTokenId("LIST_SEPARATOR", "separator", ++i),
            new BladeSupportTokenId("FUNC_NAME", "separator", ++i),
            new BladeSupportTokenId("FUNC_CALL", "separator", ++i),
            new BladeSupportTokenId("CONCAT", "separator", ++i),
            new BladeSupportTokenId("VARARG", "separator", ++i),
            new BladeSupportTokenId("OPEN_PAR", "separator", ++i),
            new BladeSupportTokenId("CLOSE_PAR", "separator", ++i),
            new BladeSupportTokenId("OPEN_CUR", "separator", ++i),
            new BladeSupportTokenId("CLOSE_CUR", "separator", ++i),
            new BladeSupportTokenId("OPEN_SQRE", "separator", ++i),
            new BladeSupportTokenId("CLOSE_SQRE", "separator", ++i),
            new BladeSupportTokenId("PLUS", "operator", ++i),
            new BladeSupportTokenId("MINUS", "operator", ++i),
            new BladeSupportTokenId("TIMES", "operator", ++i),
            new BladeSupportTokenId("DIVIDE", "operator", ++i),
            new BladeSupportTokenId("MODULO", "operator", ++i),
            new BladeSupportTokenId("EXPO", "operator", ++i),
            new BladeSupportTokenId("REL_OP", "operator", ++i),*/
           new BladeSupportTokenId("UNEXPECTED_CHARACTER", "identifier", 9)
        });
        idToToken = new HashMap<Integer, BladeSupportTokenId> ();
        for (BladeSupportTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized BladeSupportTokenId getToken (int id) {
        if (idToToken == null) {
            init();
        }
        return idToToken.get(id);
    }

    @Override
    protected Collection<BladeSupportTokenId> createTokenIds() {
        if (tokens == null) {
            init ();
        }
        return tokens;
    }

    @Override
    protected Lexer<BladeSupportTokenId> createLexer(LexerRestartInfo<BladeSupportTokenId> lri) {
        return new BladeSupportLexer(lri);
    }

    @Override
    protected String mimeType() {
        return "text/x-blade";
    }

}
