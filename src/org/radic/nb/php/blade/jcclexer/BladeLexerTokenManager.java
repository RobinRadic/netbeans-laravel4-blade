/* Generated By:JavaCC: Do not edit this line. BladeLexerTokenManager.java */
package org.radic.nb.php.blade.jcclexer;

/** Token Manager. */
public class BladeLexerTokenManager implements BladeLexerConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   debugStream.println("   No more string literal token matches are possible.");
   debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 123:
         return jjMoveStringLiteralDfa1_0(0x40L);
      default :
      debugStream.println("   No string literal matches possible.");
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 123:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      default :
      debugStream.println("   No string literal matches possible.");
         return 2;
   }
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      default :
      debugStream.println("   No string literal matches possible.");
         return 3;
   }
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(3, 6);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         return 4;
   }
   return 4;
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa1_1(0x80L);
      default :
      debugStream.println("   No string literal matches possible.");
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa2_1(active0, 0x80L);
      default :
      debugStream.println("   No string literal matches possible.");
         return 2;
   }
}
private int jjMoveStringLiteralDfa2_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 125:
         return jjMoveStringLiteralDfa3_1(active0, 0x80L);
      default :
      debugStream.println("   No string literal matches possible.");
         return 3;
   }
}
private int jjMoveStringLiteralDfa3_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 125:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(3, 7);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         return 4;
   }
   return 4;
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_MULTI_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 0, -1, -1, 
};
static final long[] jjtoToken = {
   0x201L, 
};
static final long[] jjtoSkip = {
   0xbeL, 
};
static final long[] jjtoSpecial = {
   0x80L, 
};
static final long[] jjtoMore = {
   0x140L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[0];
private final int[] jjstateSet = new int[0];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public BladeLexerTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public BladeLexerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 0; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      debugStream.println("Returning the <EOF> token.");
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         {
      debugStream.println("<" + lexStateNames[curLexState] + ">" + "Skipping character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ")");
               curChar = input_stream.BeginToken();
         }
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
      debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
         curPos = jjMoveStringLiteralDfa0_0();
         if (jjmatchedPos == 0 && jjmatchedKind > 9)
         {
           debugStream.println("   Current character matched as a " + tokenImage[9] + " token.");
            jjmatchedKind = 9;
         }
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
      debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
           debugStream.println("   Current character matched as a " + tokenImage[8] + " token.");
            jjmatchedKind = 8;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
        {
           debugStream.println("   Putting back " + (curPos - jjmatchedPos - 1) + " characters into the input stream.");
           input_stream.backup(curPos - jjmatchedPos - 1);
        }
    debugStream.println("****** FOUND A " + tokenImage[jjmatchedKind] + " MATCH (" + TokenMgrError.addEscapes(new String(input_stream.GetSuffix(jjmatchedPos + 1))) + ") ******\n");
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
   debugStream.println("<" + lexStateNames[curLexState] + ">" + "Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

protected static final int[][][] statesForState = null;
protected static final int[][] kindForState = null;
   int kindCnt = 0;
  protected  final String jjKindsForBitVector(int i, long vec)
  {
    String retVal = "";
    if (i == 0)
       kindCnt = 0;
    for (int j = 0; j < 64; j++)
    {
       if ((vec & (1L << j)) != 0L)
       {
          if (kindCnt++ > 0)
             retVal += ", ";
          if (kindCnt % 5 == 0)
             retVal += "\n     ";
          retVal += tokenImage[i * 64 + j];
       }
    }
    return retVal;
  }

  protected  final String jjKindsForStateVector(int lexState, int[] vec, int start, int end)
  {
    boolean[] kindDone = new boolean[10];
    String retVal = "";
    int cnt = 0;
    for (int i = start; i < end; i++)
    {
     if (vec[i] == -1)
       continue;
     int[] stateSet = statesForState[curLexState][vec[i]];
     for (int j = 0; j < stateSet.length; j++)
     {
       int state = stateSet[j];
       if (!kindDone[kindForState[lexState][state]])
       {
          kindDone[kindForState[lexState][state]] = true;
          if (cnt++ > 0)
             retVal += ", ";
          if (cnt % 5 == 0)
             retVal += "\n     ";
          retVal += tokenImage[kindForState[lexState][state]];
       }
     }
    }
    if (cnt == 0)
       return "{  }";
    else
       return "{ " + retVal + " }";
  }

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}