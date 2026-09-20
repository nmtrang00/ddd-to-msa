package dact.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dact.dsl.services.ExprDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExprDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'OR'", "'or'", "'&&'", "'AND'", "'and'", "'IN'", "'in'", "'In'", "'!'", "'NOT'", "'not'", "'false'", "'TRUE'", "'FALSE'", "'True'", "'False'", "'null'", "'NULL'", "'='", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'.'", "'['", "']'", "'::'", "'true'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalExprDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExprDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExprDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExprDsl.g"; }


    	private ExprDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ExprDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleExpression"
    // InternalExprDsl.g:53:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:54:1: ( ruleExpression EOF )
            // InternalExprDsl.g:55:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExprDsl.g:62:1: ruleExpression : ( ruleAssignmentExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:66:2: ( ( ruleAssignmentExpression ) )
            // InternalExprDsl.g:67:2: ( ruleAssignmentExpression )
            {
            // InternalExprDsl.g:67:2: ( ruleAssignmentExpression )
            // InternalExprDsl.g:68:3: ruleAssignmentExpression
            {
             before(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // InternalExprDsl.g:78:1: entryRuleAssignmentExpression : ruleAssignmentExpression EOF ;
    public final void entryRuleAssignmentExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:79:1: ( ruleAssignmentExpression EOF )
            // InternalExprDsl.g:80:1: ruleAssignmentExpression EOF
            {
             before(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // InternalExprDsl.g:87:1: ruleAssignmentExpression : ( ( rule__AssignmentExpression__Alternatives ) ) ;
    public final void ruleAssignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:91:2: ( ( ( rule__AssignmentExpression__Alternatives ) ) )
            // InternalExprDsl.g:92:2: ( ( rule__AssignmentExpression__Alternatives ) )
            {
            // InternalExprDsl.g:92:2: ( ( rule__AssignmentExpression__Alternatives ) )
            // InternalExprDsl.g:93:3: ( rule__AssignmentExpression__Alternatives )
            {
             before(grammarAccess.getAssignmentExpressionAccess().getAlternatives()); 
            // InternalExprDsl.g:94:3: ( rule__AssignmentExpression__Alternatives )
            // InternalExprDsl.g:94:4: rule__AssignmentExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalExprDsl.g:103:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:104:1: ( ruleOrExpression EOF )
            // InternalExprDsl.g:105:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalExprDsl.g:112:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:116:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalExprDsl.g:117:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalExprDsl.g:117:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalExprDsl.g:118:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalExprDsl.g:119:3: ( rule__OrExpression__Group__0 )
            // InternalExprDsl.g:119:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrOperator"
    // InternalExprDsl.g:128:1: entryRuleOrOperator : ruleOrOperator EOF ;
    public final void entryRuleOrOperator() throws RecognitionException {
        try {
            // InternalExprDsl.g:129:1: ( ruleOrOperator EOF )
            // InternalExprDsl.g:130:1: ruleOrOperator EOF
            {
             before(grammarAccess.getOrOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOrOperator();

            state._fsp--;

             after(grammarAccess.getOrOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalExprDsl.g:137:1: ruleOrOperator : ( ( rule__OrOperator__Group__0 ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:141:2: ( ( ( rule__OrOperator__Group__0 ) ) )
            // InternalExprDsl.g:142:2: ( ( rule__OrOperator__Group__0 ) )
            {
            // InternalExprDsl.g:142:2: ( ( rule__OrOperator__Group__0 ) )
            // InternalExprDsl.g:143:3: ( rule__OrOperator__Group__0 )
            {
             before(grammarAccess.getOrOperatorAccess().getGroup()); 
            // InternalExprDsl.g:144:3: ( rule__OrOperator__Group__0 )
            // InternalExprDsl.g:144:4: rule__OrOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleAndExpression"
    // InternalExprDsl.g:153:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:154:1: ( ruleAndExpression EOF )
            // InternalExprDsl.g:155:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalExprDsl.g:162:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:166:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalExprDsl.g:167:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalExprDsl.g:167:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalExprDsl.g:168:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalExprDsl.g:169:3: ( rule__AndExpression__Group__0 )
            // InternalExprDsl.g:169:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperator"
    // InternalExprDsl.g:178:1: entryRuleAndOperator : ruleAndOperator EOF ;
    public final void entryRuleAndOperator() throws RecognitionException {
        try {
            // InternalExprDsl.g:179:1: ( ruleAndOperator EOF )
            // InternalExprDsl.g:180:1: ruleAndOperator EOF
            {
             before(grammarAccess.getAndOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAndOperator();

            state._fsp--;

             after(grammarAccess.getAndOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalExprDsl.g:187:1: ruleAndOperator : ( ( rule__AndOperator__Group__0 ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:191:2: ( ( ( rule__AndOperator__Group__0 ) ) )
            // InternalExprDsl.g:192:2: ( ( rule__AndOperator__Group__0 ) )
            {
            // InternalExprDsl.g:192:2: ( ( rule__AndOperator__Group__0 ) )
            // InternalExprDsl.g:193:3: ( rule__AndOperator__Group__0 )
            {
             before(grammarAccess.getAndOperatorAccess().getGroup()); 
            // InternalExprDsl.g:194:3: ( rule__AndOperator__Group__0 )
            // InternalExprDsl.g:194:4: rule__AndOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalExprDsl.g:203:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:204:1: ( ruleComparisonExpression EOF )
            // InternalExprDsl.g:205:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalExprDsl.g:212:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:216:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalExprDsl.g:217:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalExprDsl.g:217:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalExprDsl.g:218:3: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalExprDsl.g:219:3: ( rule__ComparisonExpression__Group__0 )
            // InternalExprDsl.g:219:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalExprDsl.g:228:1: entryRuleComparisonOperator : ruleComparisonOperator EOF ;
    public final void entryRuleComparisonOperator() throws RecognitionException {
        try {
            // InternalExprDsl.g:229:1: ( ruleComparisonOperator EOF )
            // InternalExprDsl.g:230:1: ruleComparisonOperator EOF
            {
             before(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalExprDsl.g:237:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:241:2: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalExprDsl.g:242:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalExprDsl.g:242:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalExprDsl.g:243:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalExprDsl.g:244:3: ( rule__ComparisonOperator__Alternatives )
            // InternalExprDsl.g:244:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalExprDsl.g:253:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:254:1: ( ruleAdditiveExpression EOF )
            // InternalExprDsl.g:255:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalExprDsl.g:262:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:266:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalExprDsl.g:267:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalExprDsl.g:267:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalExprDsl.g:268:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalExprDsl.g:269:3: ( rule__AdditiveExpression__Group__0 )
            // InternalExprDsl.g:269:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveOperator"
    // InternalExprDsl.g:278:1: entryRuleAdditiveOperator : ruleAdditiveOperator EOF ;
    public final void entryRuleAdditiveOperator() throws RecognitionException {
        try {
            // InternalExprDsl.g:279:1: ( ruleAdditiveOperator EOF )
            // InternalExprDsl.g:280:1: ruleAdditiveOperator EOF
            {
             before(grammarAccess.getAdditiveOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditiveOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalExprDsl.g:287:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:291:2: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalExprDsl.g:292:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalExprDsl.g:292:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalExprDsl.g:293:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalExprDsl.g:294:3: ( rule__AdditiveOperator__Alternatives )
            // InternalExprDsl.g:294:4: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "entryRuleInExpression"
    // InternalExprDsl.g:303:1: entryRuleInExpression : ruleInExpression EOF ;
    public final void entryRuleInExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:304:1: ( ruleInExpression EOF )
            // InternalExprDsl.g:305:1: ruleInExpression EOF
            {
             before(grammarAccess.getInExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleInExpression();

            state._fsp--;

             after(grammarAccess.getInExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // InternalExprDsl.g:312:1: ruleInExpression : ( ( rule__InExpression__Group__0 ) ) ;
    public final void ruleInExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:316:2: ( ( ( rule__InExpression__Group__0 ) ) )
            // InternalExprDsl.g:317:2: ( ( rule__InExpression__Group__0 ) )
            {
            // InternalExprDsl.g:317:2: ( ( rule__InExpression__Group__0 ) )
            // InternalExprDsl.g:318:3: ( rule__InExpression__Group__0 )
            {
             before(grammarAccess.getInExpressionAccess().getGroup()); 
            // InternalExprDsl.g:319:3: ( rule__InExpression__Group__0 )
            // InternalExprDsl.g:319:4: rule__InExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleInOperator"
    // InternalExprDsl.g:328:1: entryRuleInOperator : ruleInOperator EOF ;
    public final void entryRuleInOperator() throws RecognitionException {
        try {
            // InternalExprDsl.g:329:1: ( ruleInOperator EOF )
            // InternalExprDsl.g:330:1: ruleInOperator EOF
            {
             before(grammarAccess.getInOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleInOperator();

            state._fsp--;

             after(grammarAccess.getInOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInOperator"


    // $ANTLR start "ruleInOperator"
    // InternalExprDsl.g:337:1: ruleInOperator : ( ( rule__InOperator__Group__0 ) ) ;
    public final void ruleInOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:341:2: ( ( ( rule__InOperator__Group__0 ) ) )
            // InternalExprDsl.g:342:2: ( ( rule__InOperator__Group__0 ) )
            {
            // InternalExprDsl.g:342:2: ( ( rule__InOperator__Group__0 ) )
            // InternalExprDsl.g:343:3: ( rule__InOperator__Group__0 )
            {
             before(grammarAccess.getInOperatorAccess().getGroup()); 
            // InternalExprDsl.g:344:3: ( rule__InOperator__Group__0 )
            // InternalExprDsl.g:344:4: rule__InOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInOperator"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalExprDsl.g:353:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:354:1: ( ruleMultiplicativeExpression EOF )
            // InternalExprDsl.g:355:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalExprDsl.g:362:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:366:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalExprDsl.g:367:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalExprDsl.g:367:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalExprDsl.g:368:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalExprDsl.g:369:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalExprDsl.g:369:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalExprDsl.g:378:1: entryRuleMultiplicativeOperator : ruleMultiplicativeOperator EOF ;
    public final void entryRuleMultiplicativeOperator() throws RecognitionException {
        try {
            // InternalExprDsl.g:379:1: ( ruleMultiplicativeOperator EOF )
            // InternalExprDsl.g:380:1: ruleMultiplicativeOperator EOF
            {
             before(grammarAccess.getMultiplicativeOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalExprDsl.g:387:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:391:2: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalExprDsl.g:392:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalExprDsl.g:392:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalExprDsl.g:393:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalExprDsl.g:394:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalExprDsl.g:394:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalExprDsl.g:403:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:404:1: ( ruleUnaryExpression EOF )
            // InternalExprDsl.g:405:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalExprDsl.g:412:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:416:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalExprDsl.g:417:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalExprDsl.g:417:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalExprDsl.g:418:3: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // InternalExprDsl.g:419:3: ( rule__UnaryExpression__Alternatives )
            // InternalExprDsl.g:419:4: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalExprDsl.g:428:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalExprDsl.g:429:1: ( rulePrimaryExpression EOF )
            // InternalExprDsl.g:430:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalExprDsl.g:437:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:441:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalExprDsl.g:442:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalExprDsl.g:442:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalExprDsl.g:443:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalExprDsl.g:444:3: ( rule__PrimaryExpression__Alternatives )
            // InternalExprDsl.g:444:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteralReal"
    // InternalExprDsl.g:453:1: entryRuleLiteralReal : ruleLiteralReal EOF ;
    public final void entryRuleLiteralReal() throws RecognitionException {
        try {
            // InternalExprDsl.g:454:1: ( ruleLiteralReal EOF )
            // InternalExprDsl.g:455:1: ruleLiteralReal EOF
            {
             before(grammarAccess.getLiteralRealRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralReal();

            state._fsp--;

             after(grammarAccess.getLiteralRealRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralReal"


    // $ANTLR start "ruleLiteralReal"
    // InternalExprDsl.g:462:1: ruleLiteralReal : ( ( rule__LiteralReal__ValueAssignment ) ) ;
    public final void ruleLiteralReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:466:2: ( ( ( rule__LiteralReal__ValueAssignment ) ) )
            // InternalExprDsl.g:467:2: ( ( rule__LiteralReal__ValueAssignment ) )
            {
            // InternalExprDsl.g:467:2: ( ( rule__LiteralReal__ValueAssignment ) )
            // InternalExprDsl.g:468:3: ( rule__LiteralReal__ValueAssignment )
            {
             before(grammarAccess.getLiteralRealAccess().getValueAssignment()); 
            // InternalExprDsl.g:469:3: ( rule__LiteralReal__ValueAssignment )
            // InternalExprDsl.g:469:4: rule__LiteralReal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralReal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralRealAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralReal"


    // $ANTLR start "entryRuleRealSpecification"
    // InternalExprDsl.g:478:1: entryRuleRealSpecification : ruleRealSpecification EOF ;
    public final void entryRuleRealSpecification() throws RecognitionException {
        try {
            // InternalExprDsl.g:479:1: ( ruleRealSpecification EOF )
            // InternalExprDsl.g:480:1: ruleRealSpecification EOF
            {
             before(grammarAccess.getRealSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleRealSpecification();

            state._fsp--;

             after(grammarAccess.getRealSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealSpecification"


    // $ANTLR start "ruleRealSpecification"
    // InternalExprDsl.g:487:1: ruleRealSpecification : ( ( rule__RealSpecification__ValueAssignment ) ) ;
    public final void ruleRealSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:491:2: ( ( ( rule__RealSpecification__ValueAssignment ) ) )
            // InternalExprDsl.g:492:2: ( ( rule__RealSpecification__ValueAssignment ) )
            {
            // InternalExprDsl.g:492:2: ( ( rule__RealSpecification__ValueAssignment ) )
            // InternalExprDsl.g:493:3: ( rule__RealSpecification__ValueAssignment )
            {
             before(grammarAccess.getRealSpecificationAccess().getValueAssignment()); 
            // InternalExprDsl.g:494:3: ( rule__RealSpecification__ValueAssignment )
            // InternalExprDsl.g:494:4: rule__RealSpecification__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealSpecification__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealSpecificationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealSpecification"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalExprDsl.g:503:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalExprDsl.g:504:1: ( ruleEDoubleObject EOF )
            // InternalExprDsl.g:505:1: ruleEDoubleObject EOF
            {
             before(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getEDoubleObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalExprDsl.g:512:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Group__0 ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:516:2: ( ( ( rule__EDoubleObject__Group__0 ) ) )
            // InternalExprDsl.g:517:2: ( ( rule__EDoubleObject__Group__0 ) )
            {
            // InternalExprDsl.g:517:2: ( ( rule__EDoubleObject__Group__0 ) )
            // InternalExprDsl.g:518:3: ( rule__EDoubleObject__Group__0 )
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup()); 
            // InternalExprDsl.g:519:3: ( rule__EDoubleObject__Group__0 )
            // InternalExprDsl.g:519:4: rule__EDoubleObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleLiteralInteger"
    // InternalExprDsl.g:528:1: entryRuleLiteralInteger : ruleLiteralInteger EOF ;
    public final void entryRuleLiteralInteger() throws RecognitionException {
        try {
            // InternalExprDsl.g:529:1: ( ruleLiteralInteger EOF )
            // InternalExprDsl.g:530:1: ruleLiteralInteger EOF
            {
             before(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralInteger();

            state._fsp--;

             after(grammarAccess.getLiteralIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // InternalExprDsl.g:537:1: ruleLiteralInteger : ( ( rule__LiteralInteger__ValueAssignment ) ) ;
    public final void ruleLiteralInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:541:2: ( ( ( rule__LiteralInteger__ValueAssignment ) ) )
            // InternalExprDsl.g:542:2: ( ( rule__LiteralInteger__ValueAssignment ) )
            {
            // InternalExprDsl.g:542:2: ( ( rule__LiteralInteger__ValueAssignment ) )
            // InternalExprDsl.g:543:3: ( rule__LiteralInteger__ValueAssignment )
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueAssignment()); 
            // InternalExprDsl.g:544:3: ( rule__LiteralInteger__ValueAssignment )
            // InternalExprDsl.g:544:4: rule__LiteralInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleIntegerSpecification"
    // InternalExprDsl.g:553:1: entryRuleIntegerSpecification : ruleIntegerSpecification EOF ;
    public final void entryRuleIntegerSpecification() throws RecognitionException {
        try {
            // InternalExprDsl.g:554:1: ( ruleIntegerSpecification EOF )
            // InternalExprDsl.g:555:1: ruleIntegerSpecification EOF
            {
             before(grammarAccess.getIntegerSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerSpecification();

            state._fsp--;

             after(grammarAccess.getIntegerSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerSpecification"


    // $ANTLR start "ruleIntegerSpecification"
    // InternalExprDsl.g:562:1: ruleIntegerSpecification : ( ( rule__IntegerSpecification__ValueAssignment ) ) ;
    public final void ruleIntegerSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:566:2: ( ( ( rule__IntegerSpecification__ValueAssignment ) ) )
            // InternalExprDsl.g:567:2: ( ( rule__IntegerSpecification__ValueAssignment ) )
            {
            // InternalExprDsl.g:567:2: ( ( rule__IntegerSpecification__ValueAssignment ) )
            // InternalExprDsl.g:568:3: ( rule__IntegerSpecification__ValueAssignment )
            {
             before(grammarAccess.getIntegerSpecificationAccess().getValueAssignment()); 
            // InternalExprDsl.g:569:3: ( rule__IntegerSpecification__ValueAssignment )
            // InternalExprDsl.g:569:4: rule__IntegerSpecification__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerSpecification__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerSpecificationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerSpecification"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalExprDsl.g:578:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // InternalExprDsl.g:579:1: ( ruleEIntegerObject EOF )
            // InternalExprDsl.g:580:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalExprDsl.g:587:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:591:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // InternalExprDsl.g:592:2: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // InternalExprDsl.g:592:2: ( ( rule__EIntegerObject__Group__0 ) )
            // InternalExprDsl.g:593:3: ( rule__EIntegerObject__Group__0 )
            {
             before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            // InternalExprDsl.g:594:3: ( rule__EIntegerObject__Group__0 )
            // InternalExprDsl.g:594:4: rule__EIntegerObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntegerObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleLiteralString"
    // InternalExprDsl.g:603:1: entryRuleLiteralString : ruleLiteralString EOF ;
    public final void entryRuleLiteralString() throws RecognitionException {
        try {
            // InternalExprDsl.g:604:1: ( ruleLiteralString EOF )
            // InternalExprDsl.g:605:1: ruleLiteralString EOF
            {
             before(grammarAccess.getLiteralStringRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralString();

            state._fsp--;

             after(grammarAccess.getLiteralStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralString"


    // $ANTLR start "ruleLiteralString"
    // InternalExprDsl.g:612:1: ruleLiteralString : ( ( rule__LiteralString__ValueAssignment ) ) ;
    public final void ruleLiteralString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:616:2: ( ( ( rule__LiteralString__ValueAssignment ) ) )
            // InternalExprDsl.g:617:2: ( ( rule__LiteralString__ValueAssignment ) )
            {
            // InternalExprDsl.g:617:2: ( ( rule__LiteralString__ValueAssignment ) )
            // InternalExprDsl.g:618:3: ( rule__LiteralString__ValueAssignment )
            {
             before(grammarAccess.getLiteralStringAccess().getValueAssignment()); 
            // InternalExprDsl.g:619:3: ( rule__LiteralString__ValueAssignment )
            // InternalExprDsl.g:619:4: rule__LiteralString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralString"


    // $ANTLR start "entryRuleStringSpecification"
    // InternalExprDsl.g:628:1: entryRuleStringSpecification : ruleStringSpecification EOF ;
    public final void entryRuleStringSpecification() throws RecognitionException {
        try {
            // InternalExprDsl.g:629:1: ( ruleStringSpecification EOF )
            // InternalExprDsl.g:630:1: ruleStringSpecification EOF
            {
             before(grammarAccess.getStringSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringSpecification();

            state._fsp--;

             after(grammarAccess.getStringSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringSpecification"


    // $ANTLR start "ruleStringSpecification"
    // InternalExprDsl.g:637:1: ruleStringSpecification : ( ( rule__StringSpecification__ValueAssignment ) ) ;
    public final void ruleStringSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:641:2: ( ( ( rule__StringSpecification__ValueAssignment ) ) )
            // InternalExprDsl.g:642:2: ( ( rule__StringSpecification__ValueAssignment ) )
            {
            // InternalExprDsl.g:642:2: ( ( rule__StringSpecification__ValueAssignment ) )
            // InternalExprDsl.g:643:3: ( rule__StringSpecification__ValueAssignment )
            {
             before(grammarAccess.getStringSpecificationAccess().getValueAssignment()); 
            // InternalExprDsl.g:644:3: ( rule__StringSpecification__ValueAssignment )
            // InternalExprDsl.g:644:4: rule__StringSpecification__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringSpecification__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringSpecificationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringSpecification"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalExprDsl.g:653:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // InternalExprDsl.g:654:1: ( ruleLiteralBoolean EOF )
            // InternalExprDsl.g:655:1: ruleLiteralBoolean EOF
            {
             before(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralBoolean();

            state._fsp--;

             after(grammarAccess.getLiteralBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalExprDsl.g:662:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__ValueAssignment ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:666:2: ( ( ( rule__LiteralBoolean__ValueAssignment ) ) )
            // InternalExprDsl.g:667:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            {
            // InternalExprDsl.g:667:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            // InternalExprDsl.g:668:3: ( rule__LiteralBoolean__ValueAssignment )
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 
            // InternalExprDsl.g:669:3: ( rule__LiteralBoolean__ValueAssignment )
            // InternalExprDsl.g:669:4: rule__LiteralBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleBooleanSpecification"
    // InternalExprDsl.g:678:1: entryRuleBooleanSpecification : ruleBooleanSpecification EOF ;
    public final void entryRuleBooleanSpecification() throws RecognitionException {
        try {
            // InternalExprDsl.g:679:1: ( ruleBooleanSpecification EOF )
            // InternalExprDsl.g:680:1: ruleBooleanSpecification EOF
            {
             before(grammarAccess.getBooleanSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanSpecification();

            state._fsp--;

             after(grammarAccess.getBooleanSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanSpecification"


    // $ANTLR start "ruleBooleanSpecification"
    // InternalExprDsl.g:687:1: ruleBooleanSpecification : ( ( rule__BooleanSpecification__Group__0 ) ) ;
    public final void ruleBooleanSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:691:2: ( ( ( rule__BooleanSpecification__Group__0 ) ) )
            // InternalExprDsl.g:692:2: ( ( rule__BooleanSpecification__Group__0 ) )
            {
            // InternalExprDsl.g:692:2: ( ( rule__BooleanSpecification__Group__0 ) )
            // InternalExprDsl.g:693:3: ( rule__BooleanSpecification__Group__0 )
            {
             before(grammarAccess.getBooleanSpecificationAccess().getGroup()); 
            // InternalExprDsl.g:694:3: ( rule__BooleanSpecification__Group__0 )
            // InternalExprDsl.g:694:4: rule__BooleanSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanSpecification"


    // $ANTLR start "entryRuleLiteralNull"
    // InternalExprDsl.g:703:1: entryRuleLiteralNull : ruleLiteralNull EOF ;
    public final void entryRuleLiteralNull() throws RecognitionException {
        try {
            // InternalExprDsl.g:704:1: ( ruleLiteralNull EOF )
            // InternalExprDsl.g:705:1: ruleLiteralNull EOF
            {
             before(grammarAccess.getLiteralNullRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralNull();

            state._fsp--;

             after(grammarAccess.getLiteralNullRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralNull"


    // $ANTLR start "ruleLiteralNull"
    // InternalExprDsl.g:712:1: ruleLiteralNull : ( ( rule__LiteralNull__ValueAssignment ) ) ;
    public final void ruleLiteralNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:716:2: ( ( ( rule__LiteralNull__ValueAssignment ) ) )
            // InternalExprDsl.g:717:2: ( ( rule__LiteralNull__ValueAssignment ) )
            {
            // InternalExprDsl.g:717:2: ( ( rule__LiteralNull__ValueAssignment ) )
            // InternalExprDsl.g:718:3: ( rule__LiteralNull__ValueAssignment )
            {
             before(grammarAccess.getLiteralNullAccess().getValueAssignment()); 
            // InternalExprDsl.g:719:3: ( rule__LiteralNull__ValueAssignment )
            // InternalExprDsl.g:719:4: rule__LiteralNull__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralNull__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralNullAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralNull"


    // $ANTLR start "entryRuleNullSpecification"
    // InternalExprDsl.g:728:1: entryRuleNullSpecification : ruleNullSpecification EOF ;
    public final void entryRuleNullSpecification() throws RecognitionException {
        try {
            // InternalExprDsl.g:729:1: ( ruleNullSpecification EOF )
            // InternalExprDsl.g:730:1: ruleNullSpecification EOF
            {
             before(grammarAccess.getNullSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleNullSpecification();

            state._fsp--;

             after(grammarAccess.getNullSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullSpecification"


    // $ANTLR start "ruleNullSpecification"
    // InternalExprDsl.g:737:1: ruleNullSpecification : ( ( rule__NullSpecification__Group__0 ) ) ;
    public final void ruleNullSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:741:2: ( ( ( rule__NullSpecification__Group__0 ) ) )
            // InternalExprDsl.g:742:2: ( ( rule__NullSpecification__Group__0 ) )
            {
            // InternalExprDsl.g:742:2: ( ( rule__NullSpecification__Group__0 ) )
            // InternalExprDsl.g:743:3: ( rule__NullSpecification__Group__0 )
            {
             before(grammarAccess.getNullSpecificationAccess().getGroup()); 
            // InternalExprDsl.g:744:3: ( rule__NullSpecification__Group__0 )
            // InternalExprDsl.g:744:4: rule__NullSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullSpecification"


    // $ANTLR start "entryRulePropertyAccess"
    // InternalExprDsl.g:753:1: entryRulePropertyAccess : rulePropertyAccess EOF ;
    public final void entryRulePropertyAccess() throws RecognitionException {
        try {
            // InternalExprDsl.g:754:1: ( rulePropertyAccess EOF )
            // InternalExprDsl.g:755:1: rulePropertyAccess EOF
            {
             before(grammarAccess.getPropertyAccessRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyAccess();

            state._fsp--;

             after(grammarAccess.getPropertyAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyAccess"


    // $ANTLR start "rulePropertyAccess"
    // InternalExprDsl.g:762:1: rulePropertyAccess : ( ( rule__PropertyAccess__Group__0 ) ) ;
    public final void rulePropertyAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:766:2: ( ( ( rule__PropertyAccess__Group__0 ) ) )
            // InternalExprDsl.g:767:2: ( ( rule__PropertyAccess__Group__0 ) )
            {
            // InternalExprDsl.g:767:2: ( ( rule__PropertyAccess__Group__0 ) )
            // InternalExprDsl.g:768:3: ( rule__PropertyAccess__Group__0 )
            {
             before(grammarAccess.getPropertyAccessAccess().getGroup()); 
            // InternalExprDsl.g:769:3: ( rule__PropertyAccess__Group__0 )
            // InternalExprDsl.g:769:4: rule__PropertyAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyAccess"


    // $ANTLR start "entryRuleIdentifier"
    // InternalExprDsl.g:778:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalExprDsl.g:779:1: ( ruleIdentifier EOF )
            // InternalExprDsl.g:780:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalExprDsl.g:787:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:791:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalExprDsl.g:792:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalExprDsl.g:792:2: ( ( rule__Identifier__Group__0 ) )
            // InternalExprDsl.g:793:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalExprDsl.g:794:3: ( rule__Identifier__Group__0 )
            // InternalExprDsl.g:794:4: rule__Identifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleSignedInt"
    // InternalExprDsl.g:803:1: entryRuleSignedInt : ruleSignedInt EOF ;
    public final void entryRuleSignedInt() throws RecognitionException {
        try {
            // InternalExprDsl.g:804:1: ( ruleSignedInt EOF )
            // InternalExprDsl.g:805:1: ruleSignedInt EOF
            {
             before(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_1);
            ruleSignedInt();

            state._fsp--;

             after(grammarAccess.getSignedIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalExprDsl.g:812:1: ruleSignedInt : ( ( rule__SignedInt__Group__0 ) ) ;
    public final void ruleSignedInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:816:2: ( ( ( rule__SignedInt__Group__0 ) ) )
            // InternalExprDsl.g:817:2: ( ( rule__SignedInt__Group__0 ) )
            {
            // InternalExprDsl.g:817:2: ( ( rule__SignedInt__Group__0 ) )
            // InternalExprDsl.g:818:3: ( rule__SignedInt__Group__0 )
            {
             before(grammarAccess.getSignedIntAccess().getGroup()); 
            // InternalExprDsl.g:819:3: ( rule__SignedInt__Group__0 )
            // InternalExprDsl.g:819:4: rule__SignedInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignedInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalExprDsl.g:828:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalExprDsl.g:829:1: ( ruleQualifiedName EOF )
            // InternalExprDsl.g:830:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalExprDsl.g:837:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:841:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalExprDsl.g:842:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalExprDsl.g:842:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalExprDsl.g:843:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalExprDsl.g:844:3: ( rule__QualifiedName__Group__0 )
            // InternalExprDsl.g:844:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLiteralEnum"
    // InternalExprDsl.g:853:1: entryRuleLiteralEnum : ruleLiteralEnum EOF ;
    public final void entryRuleLiteralEnum() throws RecognitionException {
        try {
            // InternalExprDsl.g:854:1: ( ruleLiteralEnum EOF )
            // InternalExprDsl.g:855:1: ruleLiteralEnum EOF
            {
             before(grammarAccess.getLiteralEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralEnum();

            state._fsp--;

             after(grammarAccess.getLiteralEnumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralEnum"


    // $ANTLR start "ruleLiteralEnum"
    // InternalExprDsl.g:862:1: ruleLiteralEnum : ( ( rule__LiteralEnum__ValueAssignment ) ) ;
    public final void ruleLiteralEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:866:2: ( ( ( rule__LiteralEnum__ValueAssignment ) ) )
            // InternalExprDsl.g:867:2: ( ( rule__LiteralEnum__ValueAssignment ) )
            {
            // InternalExprDsl.g:867:2: ( ( rule__LiteralEnum__ValueAssignment ) )
            // InternalExprDsl.g:868:3: ( rule__LiteralEnum__ValueAssignment )
            {
             before(grammarAccess.getLiteralEnumAccess().getValueAssignment()); 
            // InternalExprDsl.g:869:3: ( rule__LiteralEnum__ValueAssignment )
            // InternalExprDsl.g:869:4: rule__LiteralEnum__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralEnum__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralEnumAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralEnum"


    // $ANTLR start "entryRuleEnumSpecification"
    // InternalExprDsl.g:878:1: entryRuleEnumSpecification : ruleEnumSpecification EOF ;
    public final void entryRuleEnumSpecification() throws RecognitionException {
        try {
            // InternalExprDsl.g:879:1: ( ruleEnumSpecification EOF )
            // InternalExprDsl.g:880:1: ruleEnumSpecification EOF
            {
             before(grammarAccess.getEnumSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumSpecification();

            state._fsp--;

             after(grammarAccess.getEnumSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumSpecification"


    // $ANTLR start "ruleEnumSpecification"
    // InternalExprDsl.g:887:1: ruleEnumSpecification : ( ( rule__EnumSpecification__NameAssignment ) ) ;
    public final void ruleEnumSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:891:2: ( ( ( rule__EnumSpecification__NameAssignment ) ) )
            // InternalExprDsl.g:892:2: ( ( rule__EnumSpecification__NameAssignment ) )
            {
            // InternalExprDsl.g:892:2: ( ( rule__EnumSpecification__NameAssignment ) )
            // InternalExprDsl.g:893:3: ( rule__EnumSpecification__NameAssignment )
            {
             before(grammarAccess.getEnumSpecificationAccess().getNameAssignment()); 
            // InternalExprDsl.g:894:3: ( rule__EnumSpecification__NameAssignment )
            // InternalExprDsl.g:894:4: rule__EnumSpecification__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumSpecification__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumSpecificationAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumSpecification"


    // $ANTLR start "entryRuleEnumQualifiedName"
    // InternalExprDsl.g:903:1: entryRuleEnumQualifiedName : ruleEnumQualifiedName EOF ;
    public final void entryRuleEnumQualifiedName() throws RecognitionException {
        try {
            // InternalExprDsl.g:904:1: ( ruleEnumQualifiedName EOF )
            // InternalExprDsl.g:905:1: ruleEnumQualifiedName EOF
            {
             before(grammarAccess.getEnumQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumQualifiedName();

            state._fsp--;

             after(grammarAccess.getEnumQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumQualifiedName"


    // $ANTLR start "ruleEnumQualifiedName"
    // InternalExprDsl.g:912:1: ruleEnumQualifiedName : ( ( rule__EnumQualifiedName__Group__0 ) ) ;
    public final void ruleEnumQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:916:2: ( ( ( rule__EnumQualifiedName__Group__0 ) ) )
            // InternalExprDsl.g:917:2: ( ( rule__EnumQualifiedName__Group__0 ) )
            {
            // InternalExprDsl.g:917:2: ( ( rule__EnumQualifiedName__Group__0 ) )
            // InternalExprDsl.g:918:3: ( rule__EnumQualifiedName__Group__0 )
            {
             before(grammarAccess.getEnumQualifiedNameAccess().getGroup()); 
            // InternalExprDsl.g:919:3: ( rule__EnumQualifiedName__Group__0 )
            // InternalExprDsl.g:919:4: rule__EnumQualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumQualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumQualifiedName"


    // $ANTLR start "rule__AssignmentExpression__Alternatives"
    // InternalExprDsl.g:927:1: rule__AssignmentExpression__Alternatives : ( ( ( rule__AssignmentExpression__Group_0__0 ) ) | ( ruleOrExpression ) );
    public final void rule__AssignmentExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:931:1: ( ( ( rule__AssignmentExpression__Group_0__0 ) ) | ( ruleOrExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalExprDsl.g:932:2: ( ( rule__AssignmentExpression__Group_0__0 ) )
                    {
                    // InternalExprDsl.g:932:2: ( ( rule__AssignmentExpression__Group_0__0 ) )
                    // InternalExprDsl.g:933:3: ( rule__AssignmentExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getGroup_0()); 
                    // InternalExprDsl.g:934:3: ( rule__AssignmentExpression__Group_0__0 )
                    // InternalExprDsl.g:934:4: rule__AssignmentExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:938:2: ( ruleOrExpression )
                    {
                    // InternalExprDsl.g:938:2: ( ruleOrExpression )
                    // InternalExprDsl.g:939:3: ruleOrExpression
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getOrExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrExpression();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getOrExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Alternatives"


    // $ANTLR start "rule__OrOperator__Alternatives_1"
    // InternalExprDsl.g:948:1: rule__OrOperator__Alternatives_1 : ( ( '||' ) | ( 'OR' ) | ( 'or' ) );
    public final void rule__OrOperator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:952:1: ( ( '||' ) | ( 'OR' ) | ( 'or' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalExprDsl.g:953:2: ( '||' )
                    {
                    // InternalExprDsl.g:953:2: ( '||' )
                    // InternalExprDsl.g:954:3: '||'
                    {
                     before(grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:959:2: ( 'OR' )
                    {
                    // InternalExprDsl.g:959:2: ( 'OR' )
                    // InternalExprDsl.g:960:3: 'OR'
                    {
                     before(grammarAccess.getOrOperatorAccess().getORKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOrOperatorAccess().getORKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:965:2: ( 'or' )
                    {
                    // InternalExprDsl.g:965:2: ( 'or' )
                    // InternalExprDsl.g:966:3: 'or'
                    {
                     before(grammarAccess.getOrOperatorAccess().getOrKeyword_1_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOrOperatorAccess().getOrKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrOperator__Alternatives_1"


    // $ANTLR start "rule__AndOperator__Alternatives_1"
    // InternalExprDsl.g:975:1: rule__AndOperator__Alternatives_1 : ( ( '&&' ) | ( 'AND' ) | ( 'and' ) );
    public final void rule__AndOperator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:979:1: ( ( '&&' ) | ( 'AND' ) | ( 'and' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalExprDsl.g:980:2: ( '&&' )
                    {
                    // InternalExprDsl.g:980:2: ( '&&' )
                    // InternalExprDsl.g:981:3: '&&'
                    {
                     before(grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:986:2: ( 'AND' )
                    {
                    // InternalExprDsl.g:986:2: ( 'AND' )
                    // InternalExprDsl.g:987:3: 'AND'
                    {
                     before(grammarAccess.getAndOperatorAccess().getANDKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAndOperatorAccess().getANDKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:992:2: ( 'and' )
                    {
                    // InternalExprDsl.g:992:2: ( 'and' )
                    // InternalExprDsl.g:993:3: 'and'
                    {
                     before(grammarAccess.getAndOperatorAccess().getAndKeyword_1_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getAndOperatorAccess().getAndKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndOperator__Alternatives_1"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalExprDsl.g:1002:1: rule__ComparisonOperator__Alternatives : ( ( ( rule__ComparisonOperator__Group_0__0 ) ) | ( ( rule__ComparisonOperator__Group_1__0 ) ) | ( ( rule__ComparisonOperator__Group_2__0 ) ) | ( ( rule__ComparisonOperator__Group_3__0 ) ) | ( ( rule__ComparisonOperator__Group_4__0 ) ) | ( ( rule__ComparisonOperator__Group_5__0 ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1006:1: ( ( ( rule__ComparisonOperator__Group_0__0 ) ) | ( ( rule__ComparisonOperator__Group_1__0 ) ) | ( ( rule__ComparisonOperator__Group_2__0 ) ) | ( ( rule__ComparisonOperator__Group_3__0 ) ) | ( ( rule__ComparisonOperator__Group_4__0 ) ) | ( ( rule__ComparisonOperator__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            case 36:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalExprDsl.g:1007:2: ( ( rule__ComparisonOperator__Group_0__0 ) )
                    {
                    // InternalExprDsl.g:1007:2: ( ( rule__ComparisonOperator__Group_0__0 ) )
                    // InternalExprDsl.g:1008:3: ( rule__ComparisonOperator__Group_0__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_0()); 
                    // InternalExprDsl.g:1009:3: ( rule__ComparisonOperator__Group_0__0 )
                    // InternalExprDsl.g:1009:4: rule__ComparisonOperator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1013:2: ( ( rule__ComparisonOperator__Group_1__0 ) )
                    {
                    // InternalExprDsl.g:1013:2: ( ( rule__ComparisonOperator__Group_1__0 ) )
                    // InternalExprDsl.g:1014:3: ( rule__ComparisonOperator__Group_1__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_1()); 
                    // InternalExprDsl.g:1015:3: ( rule__ComparisonOperator__Group_1__0 )
                    // InternalExprDsl.g:1015:4: rule__ComparisonOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:1019:2: ( ( rule__ComparisonOperator__Group_2__0 ) )
                    {
                    // InternalExprDsl.g:1019:2: ( ( rule__ComparisonOperator__Group_2__0 ) )
                    // InternalExprDsl.g:1020:3: ( rule__ComparisonOperator__Group_2__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_2()); 
                    // InternalExprDsl.g:1021:3: ( rule__ComparisonOperator__Group_2__0 )
                    // InternalExprDsl.g:1021:4: rule__ComparisonOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExprDsl.g:1025:2: ( ( rule__ComparisonOperator__Group_3__0 ) )
                    {
                    // InternalExprDsl.g:1025:2: ( ( rule__ComparisonOperator__Group_3__0 ) )
                    // InternalExprDsl.g:1026:3: ( rule__ComparisonOperator__Group_3__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_3()); 
                    // InternalExprDsl.g:1027:3: ( rule__ComparisonOperator__Group_3__0 )
                    // InternalExprDsl.g:1027:4: rule__ComparisonOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExprDsl.g:1031:2: ( ( rule__ComparisonOperator__Group_4__0 ) )
                    {
                    // InternalExprDsl.g:1031:2: ( ( rule__ComparisonOperator__Group_4__0 ) )
                    // InternalExprDsl.g:1032:3: ( rule__ComparisonOperator__Group_4__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_4()); 
                    // InternalExprDsl.g:1033:3: ( rule__ComparisonOperator__Group_4__0 )
                    // InternalExprDsl.g:1033:4: rule__ComparisonOperator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExprDsl.g:1037:2: ( ( rule__ComparisonOperator__Group_5__0 ) )
                    {
                    // InternalExprDsl.g:1037:2: ( ( rule__ComparisonOperator__Group_5__0 ) )
                    // InternalExprDsl.g:1038:3: ( rule__ComparisonOperator__Group_5__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_5()); 
                    // InternalExprDsl.g:1039:3: ( rule__ComparisonOperator__Group_5__0 )
                    // InternalExprDsl.g:1039:4: rule__ComparisonOperator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // InternalExprDsl.g:1047:1: rule__AdditiveOperator__Alternatives : ( ( ( rule__AdditiveOperator__Group_0__0 ) ) | ( ( rule__AdditiveOperator__Group_1__0 ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1051:1: ( ( ( rule__AdditiveOperator__Group_0__0 ) ) | ( ( rule__AdditiveOperator__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==38) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExprDsl.g:1052:2: ( ( rule__AdditiveOperator__Group_0__0 ) )
                    {
                    // InternalExprDsl.g:1052:2: ( ( rule__AdditiveOperator__Group_0__0 ) )
                    // InternalExprDsl.g:1053:3: ( rule__AdditiveOperator__Group_0__0 )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getGroup_0()); 
                    // InternalExprDsl.g:1054:3: ( rule__AdditiveOperator__Group_0__0 )
                    // InternalExprDsl.g:1054:4: rule__AdditiveOperator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdditiveOperator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1058:2: ( ( rule__AdditiveOperator__Group_1__0 ) )
                    {
                    // InternalExprDsl.g:1058:2: ( ( rule__AdditiveOperator__Group_1__0 ) )
                    // InternalExprDsl.g:1059:3: ( rule__AdditiveOperator__Group_1__0 )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getGroup_1()); 
                    // InternalExprDsl.g:1060:3: ( rule__AdditiveOperator__Group_1__0 )
                    // InternalExprDsl.g:1060:4: rule__AdditiveOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdditiveOperator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Alternatives"


    // $ANTLR start "rule__InOperator__Alternatives_1"
    // InternalExprDsl.g:1068:1: rule__InOperator__Alternatives_1 : ( ( 'IN' ) | ( 'in' ) | ( 'In' ) );
    public final void rule__InOperator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1072:1: ( ( 'IN' ) | ( 'in' ) | ( 'In' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalExprDsl.g:1073:2: ( 'IN' )
                    {
                    // InternalExprDsl.g:1073:2: ( 'IN' )
                    // InternalExprDsl.g:1074:3: 'IN'
                    {
                     before(grammarAccess.getInOperatorAccess().getINKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getInOperatorAccess().getINKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1079:2: ( 'in' )
                    {
                    // InternalExprDsl.g:1079:2: ( 'in' )
                    // InternalExprDsl.g:1080:3: 'in'
                    {
                     before(grammarAccess.getInOperatorAccess().getInKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getInOperatorAccess().getInKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:1085:2: ( 'In' )
                    {
                    // InternalExprDsl.g:1085:2: ( 'In' )
                    // InternalExprDsl.g:1086:3: 'In'
                    {
                     before(grammarAccess.getInOperatorAccess().getInKeyword_1_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getInOperatorAccess().getInKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InOperator__Alternatives_1"


    // $ANTLR start "rule__MultiplicativeOperator__Alternatives"
    // InternalExprDsl.g:1095:1: rule__MultiplicativeOperator__Alternatives : ( ( ( rule__MultiplicativeOperator__Group_0__0 ) ) | ( ( rule__MultiplicativeOperator__Group_1__0 ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1099:1: ( ( ( rule__MultiplicativeOperator__Group_0__0 ) ) | ( ( rule__MultiplicativeOperator__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            else if ( (LA7_0==40) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExprDsl.g:1100:2: ( ( rule__MultiplicativeOperator__Group_0__0 ) )
                    {
                    // InternalExprDsl.g:1100:2: ( ( rule__MultiplicativeOperator__Group_0__0 ) )
                    // InternalExprDsl.g:1101:3: ( rule__MultiplicativeOperator__Group_0__0 )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getGroup_0()); 
                    // InternalExprDsl.g:1102:3: ( rule__MultiplicativeOperator__Group_0__0 )
                    // InternalExprDsl.g:1102:4: rule__MultiplicativeOperator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicativeOperator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1106:2: ( ( rule__MultiplicativeOperator__Group_1__0 ) )
                    {
                    // InternalExprDsl.g:1106:2: ( ( rule__MultiplicativeOperator__Group_1__0 ) )
                    // InternalExprDsl.g:1107:3: ( rule__MultiplicativeOperator__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getGroup_1()); 
                    // InternalExprDsl.g:1108:3: ( rule__MultiplicativeOperator__Group_1__0 )
                    // InternalExprDsl.g:1108:4: rule__MultiplicativeOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicativeOperator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalExprDsl.g:1116:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1120:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=20 && LA8_0<=22)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||(LA8_0>=23 && LA8_0<=29)||LA8_0==38||LA8_0==41||LA8_0==47) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalExprDsl.g:1121:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalExprDsl.g:1121:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalExprDsl.g:1122:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    // InternalExprDsl.g:1123:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalExprDsl.g:1123:4: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1127:2: ( rulePrimaryExpression )
                    {
                    // InternalExprDsl.g:1127:2: ( rulePrimaryExpression )
                    // InternalExprDsl.g:1128:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives_0_1"
    // InternalExprDsl.g:1137:1: rule__UnaryExpression__Alternatives_0_1 : ( ( '!' ) | ( 'NOT' ) | ( 'not' ) );
    public final void rule__UnaryExpression__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1141:1: ( ( '!' ) | ( 'NOT' ) | ( 'not' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalExprDsl.g:1142:2: ( '!' )
                    {
                    // InternalExprDsl.g:1142:2: ( '!' )
                    // InternalExprDsl.g:1143:3: '!'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_0_1_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1148:2: ( 'NOT' )
                    {
                    // InternalExprDsl.g:1148:2: ( 'NOT' )
                    // InternalExprDsl.g:1149:3: 'NOT'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_0_1_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:1154:2: ( 'not' )
                    {
                    // InternalExprDsl.g:1154:2: ( 'not' )
                    // InternalExprDsl.g:1155:3: 'not'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getNotKeyword_0_1_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnaryExpressionAccess().getNotKeyword_0_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives_0_1"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalExprDsl.g:1164:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralReal ) | ( ruleLiteralInteger ) | ( ruleLiteralString ) | ( ruleLiteralBoolean ) | ( ruleLiteralNull ) | ( ruleLiteralEnum ) | ( rulePropertyAccess ) | ( ( rule__PrimaryExpression__Group_7__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1168:1: ( ( ruleLiteralReal ) | ( ruleLiteralInteger ) | ( ruleLiteralString ) | ( ruleLiteralBoolean ) | ( ruleLiteralNull ) | ( ruleLiteralEnum ) | ( rulePropertyAccess ) | ( ( rule__PrimaryExpression__Group_7__0 ) ) )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalExprDsl.g:1169:2: ( ruleLiteralReal )
                    {
                    // InternalExprDsl.g:1169:2: ( ruleLiteralReal )
                    // InternalExprDsl.g:1170:3: ruleLiteralReal
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLiteralRealParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralReal();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLiteralRealParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1175:2: ( ruleLiteralInteger )
                    {
                    // InternalExprDsl.g:1175:2: ( ruleLiteralInteger )
                    // InternalExprDsl.g:1176:3: ruleLiteralInteger
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLiteralIntegerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralInteger();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLiteralIntegerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:1181:2: ( ruleLiteralString )
                    {
                    // InternalExprDsl.g:1181:2: ( ruleLiteralString )
                    // InternalExprDsl.g:1182:3: ruleLiteralString
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLiteralStringParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralString();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLiteralStringParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExprDsl.g:1187:2: ( ruleLiteralBoolean )
                    {
                    // InternalExprDsl.g:1187:2: ( ruleLiteralBoolean )
                    // InternalExprDsl.g:1188:3: ruleLiteralBoolean
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLiteralBooleanParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralBoolean();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLiteralBooleanParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExprDsl.g:1193:2: ( ruleLiteralNull )
                    {
                    // InternalExprDsl.g:1193:2: ( ruleLiteralNull )
                    // InternalExprDsl.g:1194:3: ruleLiteralNull
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLiteralNullParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralNull();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLiteralNullParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExprDsl.g:1199:2: ( ruleLiteralEnum )
                    {
                    // InternalExprDsl.g:1199:2: ( ruleLiteralEnum )
                    // InternalExprDsl.g:1200:3: ruleLiteralEnum
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLiteralEnumParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralEnum();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLiteralEnumParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalExprDsl.g:1205:2: ( rulePropertyAccess )
                    {
                    // InternalExprDsl.g:1205:2: ( rulePropertyAccess )
                    // InternalExprDsl.g:1206:3: rulePropertyAccess
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getPropertyAccessParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyAccess();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getPropertyAccessParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalExprDsl.g:1211:2: ( ( rule__PrimaryExpression__Group_7__0 ) )
                    {
                    // InternalExprDsl.g:1211:2: ( ( rule__PrimaryExpression__Group_7__0 ) )
                    // InternalExprDsl.g:1212:3: ( rule__PrimaryExpression__Group_7__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_7()); 
                    // InternalExprDsl.g:1213:3: ( rule__PrimaryExpression__Group_7__0 )
                    // InternalExprDsl.g:1213:4: rule__PrimaryExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__BooleanSpecification__Alternatives_1"
    // InternalExprDsl.g:1221:1: rule__BooleanSpecification__Alternatives_1 : ( ( ( rule__BooleanSpecification__ValueAssignment_1_0 ) ) | ( 'false' ) | ( 'TRUE' ) | ( 'FALSE' ) | ( 'True' ) | ( 'False' ) );
    public final void rule__BooleanSpecification__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1225:1: ( ( ( rule__BooleanSpecification__ValueAssignment_1_0 ) ) | ( 'false' ) | ( 'TRUE' ) | ( 'FALSE' ) | ( 'True' ) | ( 'False' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            case 27:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalExprDsl.g:1226:2: ( ( rule__BooleanSpecification__ValueAssignment_1_0 ) )
                    {
                    // InternalExprDsl.g:1226:2: ( ( rule__BooleanSpecification__ValueAssignment_1_0 ) )
                    // InternalExprDsl.g:1227:3: ( rule__BooleanSpecification__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanSpecificationAccess().getValueAssignment_1_0()); 
                    // InternalExprDsl.g:1228:3: ( rule__BooleanSpecification__ValueAssignment_1_0 )
                    // InternalExprDsl.g:1228:4: rule__BooleanSpecification__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanSpecification__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanSpecificationAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1232:2: ( 'false' )
                    {
                    // InternalExprDsl.g:1232:2: ( 'false' )
                    // InternalExprDsl.g:1233:3: 'false'
                    {
                     before(grammarAccess.getBooleanSpecificationAccess().getFalseKeyword_1_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getBooleanSpecificationAccess().getFalseKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:1238:2: ( 'TRUE' )
                    {
                    // InternalExprDsl.g:1238:2: ( 'TRUE' )
                    // InternalExprDsl.g:1239:3: 'TRUE'
                    {
                     before(grammarAccess.getBooleanSpecificationAccess().getTRUEKeyword_1_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBooleanSpecificationAccess().getTRUEKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExprDsl.g:1244:2: ( 'FALSE' )
                    {
                    // InternalExprDsl.g:1244:2: ( 'FALSE' )
                    // InternalExprDsl.g:1245:3: 'FALSE'
                    {
                     before(grammarAccess.getBooleanSpecificationAccess().getFALSEKeyword_1_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBooleanSpecificationAccess().getFALSEKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExprDsl.g:1250:2: ( 'True' )
                    {
                    // InternalExprDsl.g:1250:2: ( 'True' )
                    // InternalExprDsl.g:1251:3: 'True'
                    {
                     before(grammarAccess.getBooleanSpecificationAccess().getTrueKeyword_1_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBooleanSpecificationAccess().getTrueKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExprDsl.g:1256:2: ( 'False' )
                    {
                    // InternalExprDsl.g:1256:2: ( 'False' )
                    // InternalExprDsl.g:1257:3: 'False'
                    {
                     before(grammarAccess.getBooleanSpecificationAccess().getFalseKeyword_1_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBooleanSpecificationAccess().getFalseKeyword_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanSpecification__Alternatives_1"


    // $ANTLR start "rule__NullSpecification__Alternatives_1"
    // InternalExprDsl.g:1266:1: rule__NullSpecification__Alternatives_1 : ( ( 'null' ) | ( 'NULL' ) );
    public final void rule__NullSpecification__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1270:1: ( ( 'null' ) | ( 'NULL' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalExprDsl.g:1271:2: ( 'null' )
                    {
                    // InternalExprDsl.g:1271:2: ( 'null' )
                    // InternalExprDsl.g:1272:3: 'null'
                    {
                     before(grammarAccess.getNullSpecificationAccess().getNullKeyword_1_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getNullSpecificationAccess().getNullKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1277:2: ( 'NULL' )
                    {
                    // InternalExprDsl.g:1277:2: ( 'NULL' )
                    // InternalExprDsl.g:1278:3: 'NULL'
                    {
                     before(grammarAccess.getNullSpecificationAccess().getNULLKeyword_1_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getNullSpecificationAccess().getNULLKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullSpecification__Alternatives_1"


    // $ANTLR start "rule__AssignmentExpression__Group_0__0"
    // InternalExprDsl.g:1287:1: rule__AssignmentExpression__Group_0__0 : rule__AssignmentExpression__Group_0__0__Impl rule__AssignmentExpression__Group_0__1 ;
    public final void rule__AssignmentExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1291:1: ( rule__AssignmentExpression__Group_0__0__Impl rule__AssignmentExpression__Group_0__1 )
            // InternalExprDsl.g:1292:2: rule__AssignmentExpression__Group_0__0__Impl rule__AssignmentExpression__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__AssignmentExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group_0__0"


    // $ANTLR start "rule__AssignmentExpression__Group_0__0__Impl"
    // InternalExprDsl.g:1299:1: rule__AssignmentExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AssignmentExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1303:1: ( ( () ) )
            // InternalExprDsl.g:1304:1: ( () )
            {
            // InternalExprDsl.g:1304:1: ( () )
            // InternalExprDsl.g:1305:2: ()
            {
             before(grammarAccess.getAssignmentExpressionAccess().getVariableAssignmentAction_0_0()); 
            // InternalExprDsl.g:1306:2: ()
            // InternalExprDsl.g:1306:3: 
            {
            }

             after(grammarAccess.getAssignmentExpressionAccess().getVariableAssignmentAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group_0__0__Impl"


    // $ANTLR start "rule__AssignmentExpression__Group_0__1"
    // InternalExprDsl.g:1314:1: rule__AssignmentExpression__Group_0__1 : rule__AssignmentExpression__Group_0__1__Impl rule__AssignmentExpression__Group_0__2 ;
    public final void rule__AssignmentExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1318:1: ( rule__AssignmentExpression__Group_0__1__Impl rule__AssignmentExpression__Group_0__2 )
            // InternalExprDsl.g:1319:2: rule__AssignmentExpression__Group_0__1__Impl rule__AssignmentExpression__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__AssignmentExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group_0__1"


    // $ANTLR start "rule__AssignmentExpression__Group_0__1__Impl"
    // InternalExprDsl.g:1326:1: rule__AssignmentExpression__Group_0__1__Impl : ( ( rule__AssignmentExpression__IdentifierAssignment_0_1 ) ) ;
    public final void rule__AssignmentExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1330:1: ( ( ( rule__AssignmentExpression__IdentifierAssignment_0_1 ) ) )
            // InternalExprDsl.g:1331:1: ( ( rule__AssignmentExpression__IdentifierAssignment_0_1 ) )
            {
            // InternalExprDsl.g:1331:1: ( ( rule__AssignmentExpression__IdentifierAssignment_0_1 ) )
            // InternalExprDsl.g:1332:2: ( rule__AssignmentExpression__IdentifierAssignment_0_1 )
            {
             before(grammarAccess.getAssignmentExpressionAccess().getIdentifierAssignment_0_1()); 
            // InternalExprDsl.g:1333:2: ( rule__AssignmentExpression__IdentifierAssignment_0_1 )
            // InternalExprDsl.g:1333:3: rule__AssignmentExpression__IdentifierAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpression__IdentifierAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentExpressionAccess().getIdentifierAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group_0__1__Impl"


    // $ANTLR start "rule__AssignmentExpression__Group_0__2"
    // InternalExprDsl.g:1341:1: rule__AssignmentExpression__Group_0__2 : rule__AssignmentExpression__Group_0__2__Impl rule__AssignmentExpression__Group_0__3 ;
    public final void rule__AssignmentExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1345:1: ( rule__AssignmentExpression__Group_0__2__Impl rule__AssignmentExpression__Group_0__3 )
            // InternalExprDsl.g:1346:2: rule__AssignmentExpression__Group_0__2__Impl rule__AssignmentExpression__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__AssignmentExpression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentExpression__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group_0__2"


    // $ANTLR start "rule__AssignmentExpression__Group_0__2__Impl"
    // InternalExprDsl.g:1353:1: rule__AssignmentExpression__Group_0__2__Impl : ( '=' ) ;
    public final void rule__AssignmentExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1357:1: ( ( '=' ) )
            // InternalExprDsl.g:1358:1: ( '=' )
            {
            // InternalExprDsl.g:1358:1: ( '=' )
            // InternalExprDsl.g:1359:2: '='
            {
             before(grammarAccess.getAssignmentExpressionAccess().getEqualsSignKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAssignmentExpressionAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group_0__2__Impl"


    // $ANTLR start "rule__AssignmentExpression__Group_0__3"
    // InternalExprDsl.g:1368:1: rule__AssignmentExpression__Group_0__3 : rule__AssignmentExpression__Group_0__3__Impl ;
    public final void rule__AssignmentExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1372:1: ( rule__AssignmentExpression__Group_0__3__Impl )
            // InternalExprDsl.g:1373:2: rule__AssignmentExpression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpression__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group_0__3"


    // $ANTLR start "rule__AssignmentExpression__Group_0__3__Impl"
    // InternalExprDsl.g:1379:1: rule__AssignmentExpression__Group_0__3__Impl : ( ( rule__AssignmentExpression__ExprAssignment_0_3 ) ) ;
    public final void rule__AssignmentExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1383:1: ( ( ( rule__AssignmentExpression__ExprAssignment_0_3 ) ) )
            // InternalExprDsl.g:1384:1: ( ( rule__AssignmentExpression__ExprAssignment_0_3 ) )
            {
            // InternalExprDsl.g:1384:1: ( ( rule__AssignmentExpression__ExprAssignment_0_3 ) )
            // InternalExprDsl.g:1385:2: ( rule__AssignmentExpression__ExprAssignment_0_3 )
            {
             before(grammarAccess.getAssignmentExpressionAccess().getExprAssignment_0_3()); 
            // InternalExprDsl.g:1386:2: ( rule__AssignmentExpression__ExprAssignment_0_3 )
            // InternalExprDsl.g:1386:3: rule__AssignmentExpression__ExprAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpression__ExprAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentExpressionAccess().getExprAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group_0__3__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalExprDsl.g:1395:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1399:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalExprDsl.g:1400:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalExprDsl.g:1407:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1411:1: ( ( ruleAndExpression ) )
            // InternalExprDsl.g:1412:1: ( ruleAndExpression )
            {
            // InternalExprDsl.g:1412:1: ( ruleAndExpression )
            // InternalExprDsl.g:1413:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalExprDsl.g:1422:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1426:1: ( rule__OrExpression__Group__1__Impl )
            // InternalExprDsl.g:1427:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalExprDsl.g:1433:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1437:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalExprDsl.g:1438:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalExprDsl.g:1438:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalExprDsl.g:1439:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalExprDsl.g:1440:2: ( rule__OrExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=13)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExprDsl.g:1440:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalExprDsl.g:1449:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1453:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalExprDsl.g:1454:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalExprDsl.g:1461:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1465:1: ( ( () ) )
            // InternalExprDsl.g:1466:1: ( () )
            {
            // InternalExprDsl.g:1466:1: ( () )
            // InternalExprDsl.g:1467:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 
            // InternalExprDsl.g:1468:2: ()
            // InternalExprDsl.g:1468:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalExprDsl.g:1476:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1480:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalExprDsl.g:1481:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalExprDsl.g:1488:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1492:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalExprDsl.g:1493:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalExprDsl.g:1493:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalExprDsl.g:1494:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalExprDsl.g:1495:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalExprDsl.g:1495:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalExprDsl.g:1503:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1507:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalExprDsl.g:1508:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalExprDsl.g:1514:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightExprAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1518:1: ( ( ( rule__OrExpression__RightExprAssignment_1_2 ) ) )
            // InternalExprDsl.g:1519:1: ( ( rule__OrExpression__RightExprAssignment_1_2 ) )
            {
            // InternalExprDsl.g:1519:1: ( ( rule__OrExpression__RightExprAssignment_1_2 ) )
            // InternalExprDsl.g:1520:2: ( rule__OrExpression__RightExprAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightExprAssignment_1_2()); 
            // InternalExprDsl.g:1521:2: ( rule__OrExpression__RightExprAssignment_1_2 )
            // InternalExprDsl.g:1521:3: rule__OrExpression__RightExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__OrOperator__Group__0"
    // InternalExprDsl.g:1530:1: rule__OrOperator__Group__0 : rule__OrOperator__Group__0__Impl rule__OrOperator__Group__1 ;
    public final void rule__OrOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1534:1: ( rule__OrOperator__Group__0__Impl rule__OrOperator__Group__1 )
            // InternalExprDsl.g:1535:2: rule__OrOperator__Group__0__Impl rule__OrOperator__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__OrOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrOperator__Group__0"


    // $ANTLR start "rule__OrOperator__Group__0__Impl"
    // InternalExprDsl.g:1542:1: rule__OrOperator__Group__0__Impl : ( () ) ;
    public final void rule__OrOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1546:1: ( ( () ) )
            // InternalExprDsl.g:1547:1: ( () )
            {
            // InternalExprDsl.g:1547:1: ( () )
            // InternalExprDsl.g:1548:2: ()
            {
             before(grammarAccess.getOrOperatorAccess().getOrAction_0()); 
            // InternalExprDsl.g:1549:2: ()
            // InternalExprDsl.g:1549:3: 
            {
            }

             after(grammarAccess.getOrOperatorAccess().getOrAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrOperator__Group__0__Impl"


    // $ANTLR start "rule__OrOperator__Group__1"
    // InternalExprDsl.g:1557:1: rule__OrOperator__Group__1 : rule__OrOperator__Group__1__Impl ;
    public final void rule__OrOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1561:1: ( rule__OrOperator__Group__1__Impl )
            // InternalExprDsl.g:1562:2: rule__OrOperator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrOperator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrOperator__Group__1"


    // $ANTLR start "rule__OrOperator__Group__1__Impl"
    // InternalExprDsl.g:1568:1: rule__OrOperator__Group__1__Impl : ( ( rule__OrOperator__Alternatives_1 ) ) ;
    public final void rule__OrOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1572:1: ( ( ( rule__OrOperator__Alternatives_1 ) ) )
            // InternalExprDsl.g:1573:1: ( ( rule__OrOperator__Alternatives_1 ) )
            {
            // InternalExprDsl.g:1573:1: ( ( rule__OrOperator__Alternatives_1 ) )
            // InternalExprDsl.g:1574:2: ( rule__OrOperator__Alternatives_1 )
            {
             before(grammarAccess.getOrOperatorAccess().getAlternatives_1()); 
            // InternalExprDsl.g:1575:2: ( rule__OrOperator__Alternatives_1 )
            // InternalExprDsl.g:1575:3: rule__OrOperator__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__OrOperator__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getOrOperatorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrOperator__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalExprDsl.g:1584:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1588:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalExprDsl.g:1589:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalExprDsl.g:1596:1: rule__AndExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1600:1: ( ( ruleComparisonExpression ) )
            // InternalExprDsl.g:1601:1: ( ruleComparisonExpression )
            {
            // InternalExprDsl.g:1601:1: ( ruleComparisonExpression )
            // InternalExprDsl.g:1602:2: ruleComparisonExpression
            {
             before(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalExprDsl.g:1611:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1615:1: ( rule__AndExpression__Group__1__Impl )
            // InternalExprDsl.g:1616:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalExprDsl.g:1622:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1626:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalExprDsl.g:1627:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalExprDsl.g:1627:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalExprDsl.g:1628:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalExprDsl.g:1629:2: ( rule__AndExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=14 && LA14_0<=16)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExprDsl.g:1629:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalExprDsl.g:1638:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1642:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalExprDsl.g:1643:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalExprDsl.g:1650:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1654:1: ( ( () ) )
            // InternalExprDsl.g:1655:1: ( () )
            {
            // InternalExprDsl.g:1655:1: ( () )
            // InternalExprDsl.g:1656:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 
            // InternalExprDsl.g:1657:2: ()
            // InternalExprDsl.g:1657:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalExprDsl.g:1665:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1669:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalExprDsl.g:1670:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalExprDsl.g:1677:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1681:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalExprDsl.g:1682:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalExprDsl.g:1682:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalExprDsl.g:1683:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalExprDsl.g:1684:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalExprDsl.g:1684:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalExprDsl.g:1692:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1696:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalExprDsl.g:1697:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalExprDsl.g:1703:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightExprAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1707:1: ( ( ( rule__AndExpression__RightExprAssignment_1_2 ) ) )
            // InternalExprDsl.g:1708:1: ( ( rule__AndExpression__RightExprAssignment_1_2 ) )
            {
            // InternalExprDsl.g:1708:1: ( ( rule__AndExpression__RightExprAssignment_1_2 ) )
            // InternalExprDsl.g:1709:2: ( rule__AndExpression__RightExprAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightExprAssignment_1_2()); 
            // InternalExprDsl.g:1710:2: ( rule__AndExpression__RightExprAssignment_1_2 )
            // InternalExprDsl.g:1710:3: rule__AndExpression__RightExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndOperator__Group__0"
    // InternalExprDsl.g:1719:1: rule__AndOperator__Group__0 : rule__AndOperator__Group__0__Impl rule__AndOperator__Group__1 ;
    public final void rule__AndOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1723:1: ( rule__AndOperator__Group__0__Impl rule__AndOperator__Group__1 )
            // InternalExprDsl.g:1724:2: rule__AndOperator__Group__0__Impl rule__AndOperator__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AndOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndOperator__Group__0"


    // $ANTLR start "rule__AndOperator__Group__0__Impl"
    // InternalExprDsl.g:1731:1: rule__AndOperator__Group__0__Impl : ( () ) ;
    public final void rule__AndOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1735:1: ( ( () ) )
            // InternalExprDsl.g:1736:1: ( () )
            {
            // InternalExprDsl.g:1736:1: ( () )
            // InternalExprDsl.g:1737:2: ()
            {
             before(grammarAccess.getAndOperatorAccess().getAndAction_0()); 
            // InternalExprDsl.g:1738:2: ()
            // InternalExprDsl.g:1738:3: 
            {
            }

             after(grammarAccess.getAndOperatorAccess().getAndAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndOperator__Group__0__Impl"


    // $ANTLR start "rule__AndOperator__Group__1"
    // InternalExprDsl.g:1746:1: rule__AndOperator__Group__1 : rule__AndOperator__Group__1__Impl ;
    public final void rule__AndOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1750:1: ( rule__AndOperator__Group__1__Impl )
            // InternalExprDsl.g:1751:2: rule__AndOperator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndOperator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndOperator__Group__1"


    // $ANTLR start "rule__AndOperator__Group__1__Impl"
    // InternalExprDsl.g:1757:1: rule__AndOperator__Group__1__Impl : ( ( rule__AndOperator__Alternatives_1 ) ) ;
    public final void rule__AndOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1761:1: ( ( ( rule__AndOperator__Alternatives_1 ) ) )
            // InternalExprDsl.g:1762:1: ( ( rule__AndOperator__Alternatives_1 ) )
            {
            // InternalExprDsl.g:1762:1: ( ( rule__AndOperator__Alternatives_1 ) )
            // InternalExprDsl.g:1763:2: ( rule__AndOperator__Alternatives_1 )
            {
             before(grammarAccess.getAndOperatorAccess().getAlternatives_1()); 
            // InternalExprDsl.g:1764:2: ( rule__AndOperator__Alternatives_1 )
            // InternalExprDsl.g:1764:3: rule__AndOperator__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AndOperator__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAndOperatorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndOperator__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalExprDsl.g:1773:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1777:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalExprDsl.g:1778:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalExprDsl.g:1785:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1789:1: ( ( ruleAdditiveExpression ) )
            // InternalExprDsl.g:1790:1: ( ruleAdditiveExpression )
            {
            // InternalExprDsl.g:1790:1: ( ruleAdditiveExpression )
            // InternalExprDsl.g:1791:2: ruleAdditiveExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalExprDsl.g:1800:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1804:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalExprDsl.g:1805:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalExprDsl.g:1811:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1815:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalExprDsl.g:1816:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalExprDsl.g:1816:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalExprDsl.g:1817:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalExprDsl.g:1818:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExprDsl.g:1818:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalExprDsl.g:1827:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1831:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalExprDsl.g:1832:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalExprDsl.g:1839:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1843:1: ( ( () ) )
            // InternalExprDsl.g:1844:1: ( () )
            {
            // InternalExprDsl.g:1844:1: ( () )
            // InternalExprDsl.g:1845:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 
            // InternalExprDsl.g:1846:2: ()
            // InternalExprDsl.g:1846:3: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalExprDsl.g:1854:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1858:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalExprDsl.g:1859:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalExprDsl.g:1866:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1870:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalExprDsl.g:1871:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalExprDsl.g:1871:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalExprDsl.g:1872:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalExprDsl.g:1873:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalExprDsl.g:1873:3: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalExprDsl.g:1881:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1885:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalExprDsl.g:1886:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalExprDsl.g:1892:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1896:1: ( ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) ) )
            // InternalExprDsl.g:1897:1: ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) )
            {
            // InternalExprDsl.g:1897:1: ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) )
            // InternalExprDsl.g:1898:2: ( rule__ComparisonExpression__RightExprAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExprAssignment_1_2()); 
            // InternalExprDsl.g:1899:2: ( rule__ComparisonExpression__RightExprAssignment_1_2 )
            // InternalExprDsl.g:1899:3: rule__ComparisonExpression__RightExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_0__0"
    // InternalExprDsl.g:1908:1: rule__ComparisonOperator__Group_0__0 : rule__ComparisonOperator__Group_0__0__Impl rule__ComparisonOperator__Group_0__1 ;
    public final void rule__ComparisonOperator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1912:1: ( rule__ComparisonOperator__Group_0__0__Impl rule__ComparisonOperator__Group_0__1 )
            // InternalExprDsl.g:1913:2: rule__ComparisonOperator__Group_0__0__Impl rule__ComparisonOperator__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__ComparisonOperator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_0__0"


    // $ANTLR start "rule__ComparisonOperator__Group_0__0__Impl"
    // InternalExprDsl.g:1920:1: rule__ComparisonOperator__Group_0__0__Impl : ( () ) ;
    public final void rule__ComparisonOperator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1924:1: ( ( () ) )
            // InternalExprDsl.g:1925:1: ( () )
            {
            // InternalExprDsl.g:1925:1: ( () )
            // InternalExprDsl.g:1926:2: ()
            {
             before(grammarAccess.getComparisonOperatorAccess().getGtAction_0_0()); 
            // InternalExprDsl.g:1927:2: ()
            // InternalExprDsl.g:1927:3: 
            {
            }

             after(grammarAccess.getComparisonOperatorAccess().getGtAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_0__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_0__1"
    // InternalExprDsl.g:1935:1: rule__ComparisonOperator__Group_0__1 : rule__ComparisonOperator__Group_0__1__Impl ;
    public final void rule__ComparisonOperator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1939:1: ( rule__ComparisonOperator__Group_0__1__Impl )
            // InternalExprDsl.g:1940:2: rule__ComparisonOperator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_0__1"


    // $ANTLR start "rule__ComparisonOperator__Group_0__1__Impl"
    // InternalExprDsl.g:1946:1: rule__ComparisonOperator__Group_0__1__Impl : ( '>' ) ;
    public final void rule__ComparisonOperator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1950:1: ( ( '>' ) )
            // InternalExprDsl.g:1951:1: ( '>' )
            {
            // InternalExprDsl.g:1951:1: ( '>' )
            // InternalExprDsl.g:1952:2: '>'
            {
             before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_0__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_1__0"
    // InternalExprDsl.g:1962:1: rule__ComparisonOperator__Group_1__0 : rule__ComparisonOperator__Group_1__0__Impl rule__ComparisonOperator__Group_1__1 ;
    public final void rule__ComparisonOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1966:1: ( rule__ComparisonOperator__Group_1__0__Impl rule__ComparisonOperator__Group_1__1 )
            // InternalExprDsl.g:1967:2: rule__ComparisonOperator__Group_1__0__Impl rule__ComparisonOperator__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ComparisonOperator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__0"


    // $ANTLR start "rule__ComparisonOperator__Group_1__0__Impl"
    // InternalExprDsl.g:1974:1: rule__ComparisonOperator__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1978:1: ( ( () ) )
            // InternalExprDsl.g:1979:1: ( () )
            {
            // InternalExprDsl.g:1979:1: ( () )
            // InternalExprDsl.g:1980:2: ()
            {
             before(grammarAccess.getComparisonOperatorAccess().getGeAction_1_0()); 
            // InternalExprDsl.g:1981:2: ()
            // InternalExprDsl.g:1981:3: 
            {
            }

             after(grammarAccess.getComparisonOperatorAccess().getGeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_1__1"
    // InternalExprDsl.g:1989:1: rule__ComparisonOperator__Group_1__1 : rule__ComparisonOperator__Group_1__1__Impl ;
    public final void rule__ComparisonOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:1993:1: ( rule__ComparisonOperator__Group_1__1__Impl )
            // InternalExprDsl.g:1994:2: rule__ComparisonOperator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__1"


    // $ANTLR start "rule__ComparisonOperator__Group_1__1__Impl"
    // InternalExprDsl.g:2000:1: rule__ComparisonOperator__Group_1__1__Impl : ( '>=' ) ;
    public final void rule__ComparisonOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2004:1: ( ( '>=' ) )
            // InternalExprDsl.g:2005:1: ( '>=' )
            {
            // InternalExprDsl.g:2005:1: ( '>=' )
            // InternalExprDsl.g:2006:2: '>='
            {
             before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_2__0"
    // InternalExprDsl.g:2016:1: rule__ComparisonOperator__Group_2__0 : rule__ComparisonOperator__Group_2__0__Impl rule__ComparisonOperator__Group_2__1 ;
    public final void rule__ComparisonOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2020:1: ( rule__ComparisonOperator__Group_2__0__Impl rule__ComparisonOperator__Group_2__1 )
            // InternalExprDsl.g:2021:2: rule__ComparisonOperator__Group_2__0__Impl rule__ComparisonOperator__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ComparisonOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__0"


    // $ANTLR start "rule__ComparisonOperator__Group_2__0__Impl"
    // InternalExprDsl.g:2028:1: rule__ComparisonOperator__Group_2__0__Impl : ( () ) ;
    public final void rule__ComparisonOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2032:1: ( ( () ) )
            // InternalExprDsl.g:2033:1: ( () )
            {
            // InternalExprDsl.g:2033:1: ( () )
            // InternalExprDsl.g:2034:2: ()
            {
             before(grammarAccess.getComparisonOperatorAccess().getLtAction_2_0()); 
            // InternalExprDsl.g:2035:2: ()
            // InternalExprDsl.g:2035:3: 
            {
            }

             after(grammarAccess.getComparisonOperatorAccess().getLtAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_2__1"
    // InternalExprDsl.g:2043:1: rule__ComparisonOperator__Group_2__1 : rule__ComparisonOperator__Group_2__1__Impl ;
    public final void rule__ComparisonOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2047:1: ( rule__ComparisonOperator__Group_2__1__Impl )
            // InternalExprDsl.g:2048:2: rule__ComparisonOperator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__1"


    // $ANTLR start "rule__ComparisonOperator__Group_2__1__Impl"
    // InternalExprDsl.g:2054:1: rule__ComparisonOperator__Group_2__1__Impl : ( '<' ) ;
    public final void rule__ComparisonOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2058:1: ( ( '<' ) )
            // InternalExprDsl.g:2059:1: ( '<' )
            {
            // InternalExprDsl.g:2059:1: ( '<' )
            // InternalExprDsl.g:2060:2: '<'
            {
             before(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_3__0"
    // InternalExprDsl.g:2070:1: rule__ComparisonOperator__Group_3__0 : rule__ComparisonOperator__Group_3__0__Impl rule__ComparisonOperator__Group_3__1 ;
    public final void rule__ComparisonOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2074:1: ( rule__ComparisonOperator__Group_3__0__Impl rule__ComparisonOperator__Group_3__1 )
            // InternalExprDsl.g:2075:2: rule__ComparisonOperator__Group_3__0__Impl rule__ComparisonOperator__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ComparisonOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_3__0"


    // $ANTLR start "rule__ComparisonOperator__Group_3__0__Impl"
    // InternalExprDsl.g:2082:1: rule__ComparisonOperator__Group_3__0__Impl : ( () ) ;
    public final void rule__ComparisonOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2086:1: ( ( () ) )
            // InternalExprDsl.g:2087:1: ( () )
            {
            // InternalExprDsl.g:2087:1: ( () )
            // InternalExprDsl.g:2088:2: ()
            {
             before(grammarAccess.getComparisonOperatorAccess().getLeAction_3_0()); 
            // InternalExprDsl.g:2089:2: ()
            // InternalExprDsl.g:2089:3: 
            {
            }

             after(grammarAccess.getComparisonOperatorAccess().getLeAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_3__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_3__1"
    // InternalExprDsl.g:2097:1: rule__ComparisonOperator__Group_3__1 : rule__ComparisonOperator__Group_3__1__Impl ;
    public final void rule__ComparisonOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2101:1: ( rule__ComparisonOperator__Group_3__1__Impl )
            // InternalExprDsl.g:2102:2: rule__ComparisonOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_3__1"


    // $ANTLR start "rule__ComparisonOperator__Group_3__1__Impl"
    // InternalExprDsl.g:2108:1: rule__ComparisonOperator__Group_3__1__Impl : ( '<=' ) ;
    public final void rule__ComparisonOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2112:1: ( ( '<=' ) )
            // InternalExprDsl.g:2113:1: ( '<=' )
            {
            // InternalExprDsl.g:2113:1: ( '<=' )
            // InternalExprDsl.g:2114:2: '<='
            {
             before(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_3_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_3__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_4__0"
    // InternalExprDsl.g:2124:1: rule__ComparisonOperator__Group_4__0 : rule__ComparisonOperator__Group_4__0__Impl rule__ComparisonOperator__Group_4__1 ;
    public final void rule__ComparisonOperator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2128:1: ( rule__ComparisonOperator__Group_4__0__Impl rule__ComparisonOperator__Group_4__1 )
            // InternalExprDsl.g:2129:2: rule__ComparisonOperator__Group_4__0__Impl rule__ComparisonOperator__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ComparisonOperator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_4__0"


    // $ANTLR start "rule__ComparisonOperator__Group_4__0__Impl"
    // InternalExprDsl.g:2136:1: rule__ComparisonOperator__Group_4__0__Impl : ( () ) ;
    public final void rule__ComparisonOperator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2140:1: ( ( () ) )
            // InternalExprDsl.g:2141:1: ( () )
            {
            // InternalExprDsl.g:2141:1: ( () )
            // InternalExprDsl.g:2142:2: ()
            {
             before(grammarAccess.getComparisonOperatorAccess().getEqAction_4_0()); 
            // InternalExprDsl.g:2143:2: ()
            // InternalExprDsl.g:2143:3: 
            {
            }

             after(grammarAccess.getComparisonOperatorAccess().getEqAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_4__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_4__1"
    // InternalExprDsl.g:2151:1: rule__ComparisonOperator__Group_4__1 : rule__ComparisonOperator__Group_4__1__Impl ;
    public final void rule__ComparisonOperator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2155:1: ( rule__ComparisonOperator__Group_4__1__Impl )
            // InternalExprDsl.g:2156:2: rule__ComparisonOperator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_4__1"


    // $ANTLR start "rule__ComparisonOperator__Group_4__1__Impl"
    // InternalExprDsl.g:2162:1: rule__ComparisonOperator__Group_4__1__Impl : ( '==' ) ;
    public final void rule__ComparisonOperator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2166:1: ( ( '==' ) )
            // InternalExprDsl.g:2167:1: ( '==' )
            {
            // InternalExprDsl.g:2167:1: ( '==' )
            // InternalExprDsl.g:2168:2: '=='
            {
             before(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_4_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_4__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_5__0"
    // InternalExprDsl.g:2178:1: rule__ComparisonOperator__Group_5__0 : rule__ComparisonOperator__Group_5__0__Impl rule__ComparisonOperator__Group_5__1 ;
    public final void rule__ComparisonOperator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2182:1: ( rule__ComparisonOperator__Group_5__0__Impl rule__ComparisonOperator__Group_5__1 )
            // InternalExprDsl.g:2183:2: rule__ComparisonOperator__Group_5__0__Impl rule__ComparisonOperator__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__ComparisonOperator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__0"


    // $ANTLR start "rule__ComparisonOperator__Group_5__0__Impl"
    // InternalExprDsl.g:2190:1: rule__ComparisonOperator__Group_5__0__Impl : ( () ) ;
    public final void rule__ComparisonOperator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2194:1: ( ( () ) )
            // InternalExprDsl.g:2195:1: ( () )
            {
            // InternalExprDsl.g:2195:1: ( () )
            // InternalExprDsl.g:2196:2: ()
            {
             before(grammarAccess.getComparisonOperatorAccess().getNeAction_5_0()); 
            // InternalExprDsl.g:2197:2: ()
            // InternalExprDsl.g:2197:3: 
            {
            }

             after(grammarAccess.getComparisonOperatorAccess().getNeAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_5__1"
    // InternalExprDsl.g:2205:1: rule__ComparisonOperator__Group_5__1 : rule__ComparisonOperator__Group_5__1__Impl ;
    public final void rule__ComparisonOperator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2209:1: ( rule__ComparisonOperator__Group_5__1__Impl )
            // InternalExprDsl.g:2210:2: rule__ComparisonOperator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__1"


    // $ANTLR start "rule__ComparisonOperator__Group_5__1__Impl"
    // InternalExprDsl.g:2216:1: rule__ComparisonOperator__Group_5__1__Impl : ( '!=' ) ;
    public final void rule__ComparisonOperator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2220:1: ( ( '!=' ) )
            // InternalExprDsl.g:2221:1: ( '!=' )
            {
            // InternalExprDsl.g:2221:1: ( '!=' )
            // InternalExprDsl.g:2222:2: '!='
            {
             before(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalExprDsl.g:2232:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2236:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalExprDsl.g:2237:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalExprDsl.g:2244:1: rule__AdditiveExpression__Group__0__Impl : ( ruleInExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2248:1: ( ( ruleInExpression ) )
            // InternalExprDsl.g:2249:1: ( ruleInExpression )
            {
            // InternalExprDsl.g:2249:1: ( ruleInExpression )
            // InternalExprDsl.g:2250:2: ruleInExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getInExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getInExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalExprDsl.g:2259:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2263:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalExprDsl.g:2264:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalExprDsl.g:2270:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2274:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalExprDsl.g:2275:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalExprDsl.g:2275:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalExprDsl.g:2276:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalExprDsl.g:2277:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=37 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExprDsl.g:2277:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalExprDsl.g:2286:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2290:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalExprDsl.g:2291:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalExprDsl.g:2298:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2302:1: ( ( () ) )
            // InternalExprDsl.g:2303:1: ( () )
            {
            // InternalExprDsl.g:2303:1: ( () )
            // InternalExprDsl.g:2304:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 
            // InternalExprDsl.g:2305:2: ()
            // InternalExprDsl.g:2305:3: 
            {
            }

             after(grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalExprDsl.g:2313:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2317:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalExprDsl.g:2318:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalExprDsl.g:2325:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2329:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalExprDsl.g:2330:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalExprDsl.g:2330:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalExprDsl.g:2331:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalExprDsl.g:2332:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalExprDsl.g:2332:3: rule__AdditiveExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2"
    // InternalExprDsl.g:2340:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2344:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalExprDsl.g:2345:2: rule__AdditiveExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__2"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2__Impl"
    // InternalExprDsl.g:2351:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightExprAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2355:1: ( ( ( rule__AdditiveExpression__RightExprAssignment_1_2 ) ) )
            // InternalExprDsl.g:2356:1: ( ( rule__AdditiveExpression__RightExprAssignment_1_2 ) )
            {
            // InternalExprDsl.g:2356:1: ( ( rule__AdditiveExpression__RightExprAssignment_1_2 ) )
            // InternalExprDsl.g:2357:2: ( rule__AdditiveExpression__RightExprAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightExprAssignment_1_2()); 
            // InternalExprDsl.g:2358:2: ( rule__AdditiveExpression__RightExprAssignment_1_2 )
            // InternalExprDsl.g:2358:3: rule__AdditiveExpression__RightExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__RightExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getRightExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditiveOperator__Group_0__0"
    // InternalExprDsl.g:2367:1: rule__AdditiveOperator__Group_0__0 : rule__AdditiveOperator__Group_0__0__Impl rule__AdditiveOperator__Group_0__1 ;
    public final void rule__AdditiveOperator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2371:1: ( rule__AdditiveOperator__Group_0__0__Impl rule__AdditiveOperator__Group_0__1 )
            // InternalExprDsl.g:2372:2: rule__AdditiveOperator__Group_0__0__Impl rule__AdditiveOperator__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__AdditiveOperator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Group_0__0"


    // $ANTLR start "rule__AdditiveOperator__Group_0__0__Impl"
    // InternalExprDsl.g:2379:1: rule__AdditiveOperator__Group_0__0__Impl : ( () ) ;
    public final void rule__AdditiveOperator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2383:1: ( ( () ) )
            // InternalExprDsl.g:2384:1: ( () )
            {
            // InternalExprDsl.g:2384:1: ( () )
            // InternalExprDsl.g:2385:2: ()
            {
             before(grammarAccess.getAdditiveOperatorAccess().getPlusAction_0_0()); 
            // InternalExprDsl.g:2386:2: ()
            // InternalExprDsl.g:2386:3: 
            {
            }

             after(grammarAccess.getAdditiveOperatorAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Group_0__0__Impl"


    // $ANTLR start "rule__AdditiveOperator__Group_0__1"
    // InternalExprDsl.g:2394:1: rule__AdditiveOperator__Group_0__1 : rule__AdditiveOperator__Group_0__1__Impl ;
    public final void rule__AdditiveOperator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2398:1: ( rule__AdditiveOperator__Group_0__1__Impl )
            // InternalExprDsl.g:2399:2: rule__AdditiveOperator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Group_0__1"


    // $ANTLR start "rule__AdditiveOperator__Group_0__1__Impl"
    // InternalExprDsl.g:2405:1: rule__AdditiveOperator__Group_0__1__Impl : ( '+' ) ;
    public final void rule__AdditiveOperator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2409:1: ( ( '+' ) )
            // InternalExprDsl.g:2410:1: ( '+' )
            {
            // InternalExprDsl.g:2410:1: ( '+' )
            // InternalExprDsl.g:2411:2: '+'
            {
             before(grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Group_0__1__Impl"


    // $ANTLR start "rule__AdditiveOperator__Group_1__0"
    // InternalExprDsl.g:2421:1: rule__AdditiveOperator__Group_1__0 : rule__AdditiveOperator__Group_1__0__Impl rule__AdditiveOperator__Group_1__1 ;
    public final void rule__AdditiveOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2425:1: ( rule__AdditiveOperator__Group_1__0__Impl rule__AdditiveOperator__Group_1__1 )
            // InternalExprDsl.g:2426:2: rule__AdditiveOperator__Group_1__0__Impl rule__AdditiveOperator__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__AdditiveOperator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Group_1__0"


    // $ANTLR start "rule__AdditiveOperator__Group_1__0__Impl"
    // InternalExprDsl.g:2433:1: rule__AdditiveOperator__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2437:1: ( ( () ) )
            // InternalExprDsl.g:2438:1: ( () )
            {
            // InternalExprDsl.g:2438:1: ( () )
            // InternalExprDsl.g:2439:2: ()
            {
             before(grammarAccess.getAdditiveOperatorAccess().getMinusAction_1_0()); 
            // InternalExprDsl.g:2440:2: ()
            // InternalExprDsl.g:2440:3: 
            {
            }

             after(grammarAccess.getAdditiveOperatorAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveOperator__Group_1__1"
    // InternalExprDsl.g:2448:1: rule__AdditiveOperator__Group_1__1 : rule__AdditiveOperator__Group_1__1__Impl ;
    public final void rule__AdditiveOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2452:1: ( rule__AdditiveOperator__Group_1__1__Impl )
            // InternalExprDsl.g:2453:2: rule__AdditiveOperator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Group_1__1"


    // $ANTLR start "rule__AdditiveOperator__Group_1__1__Impl"
    // InternalExprDsl.g:2459:1: rule__AdditiveOperator__Group_1__1__Impl : ( '-' ) ;
    public final void rule__AdditiveOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2463:1: ( ( '-' ) )
            // InternalExprDsl.g:2464:1: ( '-' )
            {
            // InternalExprDsl.g:2464:1: ( '-' )
            // InternalExprDsl.g:2465:2: '-'
            {
             before(grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Group_1__1__Impl"


    // $ANTLR start "rule__InExpression__Group__0"
    // InternalExprDsl.g:2475:1: rule__InExpression__Group__0 : rule__InExpression__Group__0__Impl rule__InExpression__Group__1 ;
    public final void rule__InExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2479:1: ( rule__InExpression__Group__0__Impl rule__InExpression__Group__1 )
            // InternalExprDsl.g:2480:2: rule__InExpression__Group__0__Impl rule__InExpression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__InExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group__0"


    // $ANTLR start "rule__InExpression__Group__0__Impl"
    // InternalExprDsl.g:2487:1: rule__InExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__InExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2491:1: ( ( ruleMultiplicativeExpression ) )
            // InternalExprDsl.g:2492:1: ( ruleMultiplicativeExpression )
            {
            // InternalExprDsl.g:2492:1: ( ruleMultiplicativeExpression )
            // InternalExprDsl.g:2493:2: ruleMultiplicativeExpression
            {
             before(grammarAccess.getInExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getInExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group__0__Impl"


    // $ANTLR start "rule__InExpression__Group__1"
    // InternalExprDsl.g:2502:1: rule__InExpression__Group__1 : rule__InExpression__Group__1__Impl ;
    public final void rule__InExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2506:1: ( rule__InExpression__Group__1__Impl )
            // InternalExprDsl.g:2507:2: rule__InExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group__1"


    // $ANTLR start "rule__InExpression__Group__1__Impl"
    // InternalExprDsl.g:2513:1: rule__InExpression__Group__1__Impl : ( ( rule__InExpression__Group_1__0 )* ) ;
    public final void rule__InExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2517:1: ( ( ( rule__InExpression__Group_1__0 )* ) )
            // InternalExprDsl.g:2518:1: ( ( rule__InExpression__Group_1__0 )* )
            {
            // InternalExprDsl.g:2518:1: ( ( rule__InExpression__Group_1__0 )* )
            // InternalExprDsl.g:2519:2: ( rule__InExpression__Group_1__0 )*
            {
             before(grammarAccess.getInExpressionAccess().getGroup_1()); 
            // InternalExprDsl.g:2520:2: ( rule__InExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=17 && LA17_0<=19)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExprDsl.g:2520:3: rule__InExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__InExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group__1__Impl"


    // $ANTLR start "rule__InExpression__Group_1__0"
    // InternalExprDsl.g:2529:1: rule__InExpression__Group_1__0 : rule__InExpression__Group_1__0__Impl rule__InExpression__Group_1__1 ;
    public final void rule__InExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2533:1: ( rule__InExpression__Group_1__0__Impl rule__InExpression__Group_1__1 )
            // InternalExprDsl.g:2534:2: rule__InExpression__Group_1__0__Impl rule__InExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__InExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group_1__0"


    // $ANTLR start "rule__InExpression__Group_1__0__Impl"
    // InternalExprDsl.g:2541:1: rule__InExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__InExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2545:1: ( ( () ) )
            // InternalExprDsl.g:2546:1: ( () )
            {
            // InternalExprDsl.g:2546:1: ( () )
            // InternalExprDsl.g:2547:2: ()
            {
             before(grammarAccess.getInExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 
            // InternalExprDsl.g:2548:2: ()
            // InternalExprDsl.g:2548:3: 
            {
            }

             after(grammarAccess.getInExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group_1__0__Impl"


    // $ANTLR start "rule__InExpression__Group_1__1"
    // InternalExprDsl.g:2556:1: rule__InExpression__Group_1__1 : rule__InExpression__Group_1__1__Impl rule__InExpression__Group_1__2 ;
    public final void rule__InExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2560:1: ( rule__InExpression__Group_1__1__Impl rule__InExpression__Group_1__2 )
            // InternalExprDsl.g:2561:2: rule__InExpression__Group_1__1__Impl rule__InExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__InExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group_1__1"


    // $ANTLR start "rule__InExpression__Group_1__1__Impl"
    // InternalExprDsl.g:2568:1: rule__InExpression__Group_1__1__Impl : ( ( rule__InExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__InExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2572:1: ( ( ( rule__InExpression__OperatorAssignment_1_1 ) ) )
            // InternalExprDsl.g:2573:1: ( ( rule__InExpression__OperatorAssignment_1_1 ) )
            {
            // InternalExprDsl.g:2573:1: ( ( rule__InExpression__OperatorAssignment_1_1 ) )
            // InternalExprDsl.g:2574:2: ( rule__InExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getInExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalExprDsl.g:2575:2: ( rule__InExpression__OperatorAssignment_1_1 )
            // InternalExprDsl.g:2575:3: rule__InExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group_1__1__Impl"


    // $ANTLR start "rule__InExpression__Group_1__2"
    // InternalExprDsl.g:2583:1: rule__InExpression__Group_1__2 : rule__InExpression__Group_1__2__Impl ;
    public final void rule__InExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2587:1: ( rule__InExpression__Group_1__2__Impl )
            // InternalExprDsl.g:2588:2: rule__InExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group_1__2"


    // $ANTLR start "rule__InExpression__Group_1__2__Impl"
    // InternalExprDsl.g:2594:1: rule__InExpression__Group_1__2__Impl : ( ( rule__InExpression__RightExprAssignment_1_2 ) ) ;
    public final void rule__InExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2598:1: ( ( ( rule__InExpression__RightExprAssignment_1_2 ) ) )
            // InternalExprDsl.g:2599:1: ( ( rule__InExpression__RightExprAssignment_1_2 ) )
            {
            // InternalExprDsl.g:2599:1: ( ( rule__InExpression__RightExprAssignment_1_2 ) )
            // InternalExprDsl.g:2600:2: ( rule__InExpression__RightExprAssignment_1_2 )
            {
             before(grammarAccess.getInExpressionAccess().getRightExprAssignment_1_2()); 
            // InternalExprDsl.g:2601:2: ( rule__InExpression__RightExprAssignment_1_2 )
            // InternalExprDsl.g:2601:3: rule__InExpression__RightExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__RightExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInExpressionAccess().getRightExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__Group_1__2__Impl"


    // $ANTLR start "rule__InOperator__Group__0"
    // InternalExprDsl.g:2610:1: rule__InOperator__Group__0 : rule__InOperator__Group__0__Impl rule__InOperator__Group__1 ;
    public final void rule__InOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2614:1: ( rule__InOperator__Group__0__Impl rule__InOperator__Group__1 )
            // InternalExprDsl.g:2615:2: rule__InOperator__Group__0__Impl rule__InOperator__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__InOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InOperator__Group__0"


    // $ANTLR start "rule__InOperator__Group__0__Impl"
    // InternalExprDsl.g:2622:1: rule__InOperator__Group__0__Impl : ( () ) ;
    public final void rule__InOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2626:1: ( ( () ) )
            // InternalExprDsl.g:2627:1: ( () )
            {
            // InternalExprDsl.g:2627:1: ( () )
            // InternalExprDsl.g:2628:2: ()
            {
             before(grammarAccess.getInOperatorAccess().getInAction_0()); 
            // InternalExprDsl.g:2629:2: ()
            // InternalExprDsl.g:2629:3: 
            {
            }

             after(grammarAccess.getInOperatorAccess().getInAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InOperator__Group__0__Impl"


    // $ANTLR start "rule__InOperator__Group__1"
    // InternalExprDsl.g:2637:1: rule__InOperator__Group__1 : rule__InOperator__Group__1__Impl ;
    public final void rule__InOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2641:1: ( rule__InOperator__Group__1__Impl )
            // InternalExprDsl.g:2642:2: rule__InOperator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InOperator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InOperator__Group__1"


    // $ANTLR start "rule__InOperator__Group__1__Impl"
    // InternalExprDsl.g:2648:1: rule__InOperator__Group__1__Impl : ( ( rule__InOperator__Alternatives_1 ) ) ;
    public final void rule__InOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2652:1: ( ( ( rule__InOperator__Alternatives_1 ) ) )
            // InternalExprDsl.g:2653:1: ( ( rule__InOperator__Alternatives_1 ) )
            {
            // InternalExprDsl.g:2653:1: ( ( rule__InOperator__Alternatives_1 ) )
            // InternalExprDsl.g:2654:2: ( rule__InOperator__Alternatives_1 )
            {
             before(grammarAccess.getInOperatorAccess().getAlternatives_1()); 
            // InternalExprDsl.g:2655:2: ( rule__InOperator__Alternatives_1 )
            // InternalExprDsl.g:2655:3: rule__InOperator__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__InOperator__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getInOperatorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InOperator__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalExprDsl.g:2664:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2668:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalExprDsl.g:2669:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalExprDsl.g:2676:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2680:1: ( ( ruleUnaryExpression ) )
            // InternalExprDsl.g:2681:1: ( ruleUnaryExpression )
            {
            // InternalExprDsl.g:2681:1: ( ruleUnaryExpression )
            // InternalExprDsl.g:2682:2: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalExprDsl.g:2691:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2695:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalExprDsl.g:2696:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalExprDsl.g:2702:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2706:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalExprDsl.g:2707:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalExprDsl.g:2707:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalExprDsl.g:2708:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalExprDsl.g:2709:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=39 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExprDsl.g:2709:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalExprDsl.g:2718:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2722:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalExprDsl.g:2723:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalExprDsl.g:2730:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2734:1: ( ( () ) )
            // InternalExprDsl.g:2735:1: ( () )
            {
            // InternalExprDsl.g:2735:1: ( () )
            // InternalExprDsl.g:2736:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 
            // InternalExprDsl.g:2737:2: ()
            // InternalExprDsl.g:2737:3: 
            {
            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalExprDsl.g:2745:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2749:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalExprDsl.g:2750:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalExprDsl.g:2757:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2761:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalExprDsl.g:2762:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalExprDsl.g:2762:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalExprDsl.g:2763:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalExprDsl.g:2764:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalExprDsl.g:2764:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2"
    // InternalExprDsl.g:2772:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2776:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalExprDsl.g:2777:2: rule__MultiplicativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2__Impl"
    // InternalExprDsl.g:2783:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightExprAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2787:1: ( ( ( rule__MultiplicativeExpression__RightExprAssignment_1_2 ) ) )
            // InternalExprDsl.g:2788:1: ( ( rule__MultiplicativeExpression__RightExprAssignment_1_2 ) )
            {
            // InternalExprDsl.g:2788:1: ( ( rule__MultiplicativeExpression__RightExprAssignment_1_2 ) )
            // InternalExprDsl.g:2789:2: ( rule__MultiplicativeExpression__RightExprAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightExprAssignment_1_2()); 
            // InternalExprDsl.g:2790:2: ( rule__MultiplicativeExpression__RightExprAssignment_1_2 )
            // InternalExprDsl.g:2790:3: rule__MultiplicativeExpression__RightExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__RightExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getRightExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicativeOperator__Group_0__0"
    // InternalExprDsl.g:2799:1: rule__MultiplicativeOperator__Group_0__0 : rule__MultiplicativeOperator__Group_0__0__Impl rule__MultiplicativeOperator__Group_0__1 ;
    public final void rule__MultiplicativeOperator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2803:1: ( rule__MultiplicativeOperator__Group_0__0__Impl rule__MultiplicativeOperator__Group_0__1 )
            // InternalExprDsl.g:2804:2: rule__MultiplicativeOperator__Group_0__0__Impl rule__MultiplicativeOperator__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__MultiplicativeOperator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Group_0__0"


    // $ANTLR start "rule__MultiplicativeOperator__Group_0__0__Impl"
    // InternalExprDsl.g:2811:1: rule__MultiplicativeOperator__Group_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeOperator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2815:1: ( ( () ) )
            // InternalExprDsl.g:2816:1: ( () )
            {
            // InternalExprDsl.g:2816:1: ( () )
            // InternalExprDsl.g:2817:2: ()
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getTimesAction_0_0()); 
            // InternalExprDsl.g:2818:2: ()
            // InternalExprDsl.g:2818:3: 
            {
            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getTimesAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Group_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeOperator__Group_0__1"
    // InternalExprDsl.g:2826:1: rule__MultiplicativeOperator__Group_0__1 : rule__MultiplicativeOperator__Group_0__1__Impl ;
    public final void rule__MultiplicativeOperator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2830:1: ( rule__MultiplicativeOperator__Group_0__1__Impl )
            // InternalExprDsl.g:2831:2: rule__MultiplicativeOperator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Group_0__1"


    // $ANTLR start "rule__MultiplicativeOperator__Group_0__1__Impl"
    // InternalExprDsl.g:2837:1: rule__MultiplicativeOperator__Group_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplicativeOperator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2841:1: ( ( '*' ) )
            // InternalExprDsl.g:2842:1: ( '*' )
            {
            // InternalExprDsl.g:2842:1: ( '*' )
            // InternalExprDsl.g:2843:2: '*'
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Group_0__1__Impl"


    // $ANTLR start "rule__MultiplicativeOperator__Group_1__0"
    // InternalExprDsl.g:2853:1: rule__MultiplicativeOperator__Group_1__0 : rule__MultiplicativeOperator__Group_1__0__Impl rule__MultiplicativeOperator__Group_1__1 ;
    public final void rule__MultiplicativeOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2857:1: ( rule__MultiplicativeOperator__Group_1__0__Impl rule__MultiplicativeOperator__Group_1__1 )
            // InternalExprDsl.g:2858:2: rule__MultiplicativeOperator__Group_1__0__Impl rule__MultiplicativeOperator__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__MultiplicativeOperator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Group_1__0"


    // $ANTLR start "rule__MultiplicativeOperator__Group_1__0__Impl"
    // InternalExprDsl.g:2865:1: rule__MultiplicativeOperator__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2869:1: ( ( () ) )
            // InternalExprDsl.g:2870:1: ( () )
            {
            // InternalExprDsl.g:2870:1: ( () )
            // InternalExprDsl.g:2871:2: ()
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getDivideAction_1_0()); 
            // InternalExprDsl.g:2872:2: ()
            // InternalExprDsl.g:2872:3: 
            {
            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getDivideAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeOperator__Group_1__1"
    // InternalExprDsl.g:2880:1: rule__MultiplicativeOperator__Group_1__1 : rule__MultiplicativeOperator__Group_1__1__Impl ;
    public final void rule__MultiplicativeOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2884:1: ( rule__MultiplicativeOperator__Group_1__1__Impl )
            // InternalExprDsl.g:2885:2: rule__MultiplicativeOperator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Group_1__1"


    // $ANTLR start "rule__MultiplicativeOperator__Group_1__1__Impl"
    // InternalExprDsl.g:2891:1: rule__MultiplicativeOperator__Group_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplicativeOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2895:1: ( ( '/' ) )
            // InternalExprDsl.g:2896:1: ( '/' )
            {
            // InternalExprDsl.g:2896:1: ( '/' )
            // InternalExprDsl.g:2897:2: '/'
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // InternalExprDsl.g:2907:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2911:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalExprDsl.g:2912:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0__0__Impl"
    // InternalExprDsl.g:2919:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2923:1: ( ( () ) )
            // InternalExprDsl.g:2924:1: ( () )
            {
            // InternalExprDsl.g:2924:1: ( () )
            // InternalExprDsl.g:2925:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getNotExpressionAction_0_0()); 
            // InternalExprDsl.g:2926:2: ()
            // InternalExprDsl.g:2926:3: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getNotExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__1"
    // InternalExprDsl.g:2934:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2938:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalExprDsl.g:2939:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0__1__Impl"
    // InternalExprDsl.g:2946:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__Alternatives_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2950:1: ( ( ( rule__UnaryExpression__Alternatives_0_1 ) ) )
            // InternalExprDsl.g:2951:1: ( ( rule__UnaryExpression__Alternatives_0_1 ) )
            {
            // InternalExprDsl.g:2951:1: ( ( rule__UnaryExpression__Alternatives_0_1 ) )
            // InternalExprDsl.g:2952:2: ( rule__UnaryExpression__Alternatives_0_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives_0_1()); 
            // InternalExprDsl.g:2953:2: ( rule__UnaryExpression__Alternatives_0_1 )
            // InternalExprDsl.g:2953:3: rule__UnaryExpression__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__2"
    // InternalExprDsl.g:2961:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2965:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalExprDsl.g:2966:2: rule__UnaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__2"


    // $ANTLR start "rule__UnaryExpression__Group_0__2__Impl"
    // InternalExprDsl.g:2972:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__ExprAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2976:1: ( ( ( rule__UnaryExpression__ExprAssignment_0_2 ) ) )
            // InternalExprDsl.g:2977:1: ( ( rule__UnaryExpression__ExprAssignment_0_2 ) )
            {
            // InternalExprDsl.g:2977:1: ( ( rule__UnaryExpression__ExprAssignment_0_2 ) )
            // InternalExprDsl.g:2978:2: ( rule__UnaryExpression__ExprAssignment_0_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getExprAssignment_0_2()); 
            // InternalExprDsl.g:2979:2: ( rule__UnaryExpression__ExprAssignment_0_2 )
            // InternalExprDsl.g:2979:3: rule__UnaryExpression__ExprAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__ExprAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getExprAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_7__0"
    // InternalExprDsl.g:2988:1: rule__PrimaryExpression__Group_7__0 : rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1 ;
    public final void rule__PrimaryExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:2992:1: ( rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1 )
            // InternalExprDsl.g:2993:2: rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimaryExpression__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__0"


    // $ANTLR start "rule__PrimaryExpression__Group_7__0__Impl"
    // InternalExprDsl.g:3000:1: rule__PrimaryExpression__Group_7__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3004:1: ( ( '(' ) )
            // InternalExprDsl.g:3005:1: ( '(' )
            {
            // InternalExprDsl.g:3005:1: ( '(' )
            // InternalExprDsl.g:3006:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_7__1"
    // InternalExprDsl.g:3015:1: rule__PrimaryExpression__Group_7__1 : rule__PrimaryExpression__Group_7__1__Impl rule__PrimaryExpression__Group_7__2 ;
    public final void rule__PrimaryExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3019:1: ( rule__PrimaryExpression__Group_7__1__Impl rule__PrimaryExpression__Group_7__2 )
            // InternalExprDsl.g:3020:2: rule__PrimaryExpression__Group_7__1__Impl rule__PrimaryExpression__Group_7__2
            {
            pushFollow(FOLLOW_26);
            rule__PrimaryExpression__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__1"


    // $ANTLR start "rule__PrimaryExpression__Group_7__1__Impl"
    // InternalExprDsl.g:3027:1: rule__PrimaryExpression__Group_7__1__Impl : ( ruleAssignmentExpression ) ;
    public final void rule__PrimaryExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3031:1: ( ( ruleAssignmentExpression ) )
            // InternalExprDsl.g:3032:1: ( ruleAssignmentExpression )
            {
            // InternalExprDsl.g:3032:1: ( ruleAssignmentExpression )
            // InternalExprDsl.g:3033:2: ruleAssignmentExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAssignmentExpressionParserRuleCall_7_1()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getAssignmentExpressionParserRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_7__2"
    // InternalExprDsl.g:3042:1: rule__PrimaryExpression__Group_7__2 : rule__PrimaryExpression__Group_7__2__Impl ;
    public final void rule__PrimaryExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3046:1: ( rule__PrimaryExpression__Group_7__2__Impl )
            // InternalExprDsl.g:3047:2: rule__PrimaryExpression__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__2"


    // $ANTLR start "rule__PrimaryExpression__Group_7__2__Impl"
    // InternalExprDsl.g:3053:1: rule__PrimaryExpression__Group_7__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3057:1: ( ( ')' ) )
            // InternalExprDsl.g:3058:1: ( ')' )
            {
            // InternalExprDsl.g:3058:1: ( ')' )
            // InternalExprDsl.g:3059:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__2__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__0"
    // InternalExprDsl.g:3069:1: rule__EDoubleObject__Group__0 : rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 ;
    public final void rule__EDoubleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3073:1: ( rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 )
            // InternalExprDsl.g:3074:2: rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EDoubleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Group__0"


    // $ANTLR start "rule__EDoubleObject__Group__0__Impl"
    // InternalExprDsl.g:3081:1: rule__EDoubleObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDoubleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3085:1: ( ( ( '-' )? ) )
            // InternalExprDsl.g:3086:1: ( ( '-' )? )
            {
            // InternalExprDsl.g:3086:1: ( ( '-' )? )
            // InternalExprDsl.g:3087:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalExprDsl.g:3088:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalExprDsl.g:3088:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Group__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__1"
    // InternalExprDsl.g:3096:1: rule__EDoubleObject__Group__1 : rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2 ;
    public final void rule__EDoubleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3100:1: ( rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2 )
            // InternalExprDsl.g:3101:2: rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__EDoubleObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Group__1"


    // $ANTLR start "rule__EDoubleObject__Group__1__Impl"
    // InternalExprDsl.g:3108:1: rule__EDoubleObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3112:1: ( ( RULE_INT ) )
            // InternalExprDsl.g:3113:1: ( RULE_INT )
            {
            // InternalExprDsl.g:3113:1: ( RULE_INT )
            // InternalExprDsl.g:3114:2: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Group__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__2"
    // InternalExprDsl.g:3123:1: rule__EDoubleObject__Group__2 : rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3 ;
    public final void rule__EDoubleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3127:1: ( rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3 )
            // InternalExprDsl.g:3128:2: rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__EDoubleObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Group__2"


    // $ANTLR start "rule__EDoubleObject__Group__2__Impl"
    // InternalExprDsl.g:3135:1: rule__EDoubleObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EDoubleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3139:1: ( ( '.' ) )
            // InternalExprDsl.g:3140:1: ( '.' )
            {
            // InternalExprDsl.g:3140:1: ( '.' )
            // InternalExprDsl.g:3141:2: '.'
            {
             before(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Group__2__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__3"
    // InternalExprDsl.g:3150:1: rule__EDoubleObject__Group__3 : rule__EDoubleObject__Group__3__Impl ;
    public final void rule__EDoubleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3154:1: ( rule__EDoubleObject__Group__3__Impl )
            // InternalExprDsl.g:3155:2: rule__EDoubleObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Group__3"


    // $ANTLR start "rule__EDoubleObject__Group__3__Impl"
    // InternalExprDsl.g:3161:1: rule__EDoubleObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3165:1: ( ( RULE_INT ) )
            // InternalExprDsl.g:3166:1: ( RULE_INT )
            {
            // InternalExprDsl.g:3166:1: ( RULE_INT )
            // InternalExprDsl.g:3167:2: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Group__3__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__0"
    // InternalExprDsl.g:3177:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3181:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // InternalExprDsl.g:3182:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EIntegerObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0"


    // $ANTLR start "rule__EIntegerObject__Group__0__Impl"
    // InternalExprDsl.g:3189:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3193:1: ( ( ( '-' )? ) )
            // InternalExprDsl.g:3194:1: ( ( '-' )? )
            {
            // InternalExprDsl.g:3194:1: ( ( '-' )? )
            // InternalExprDsl.g:3195:2: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalExprDsl.g:3196:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalExprDsl.g:3196:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__1"
    // InternalExprDsl.g:3204:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3208:1: ( rule__EIntegerObject__Group__1__Impl )
            // InternalExprDsl.g:3209:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1"


    // $ANTLR start "rule__EIntegerObject__Group__1__Impl"
    // InternalExprDsl.g:3215:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3219:1: ( ( RULE_INT ) )
            // InternalExprDsl.g:3220:1: ( RULE_INT )
            {
            // InternalExprDsl.g:3220:1: ( RULE_INT )
            // InternalExprDsl.g:3221:2: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1__Impl"


    // $ANTLR start "rule__BooleanSpecification__Group__0"
    // InternalExprDsl.g:3231:1: rule__BooleanSpecification__Group__0 : rule__BooleanSpecification__Group__0__Impl rule__BooleanSpecification__Group__1 ;
    public final void rule__BooleanSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3235:1: ( rule__BooleanSpecification__Group__0__Impl rule__BooleanSpecification__Group__1 )
            // InternalExprDsl.g:3236:2: rule__BooleanSpecification__Group__0__Impl rule__BooleanSpecification__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__BooleanSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanSpecification__Group__0"


    // $ANTLR start "rule__BooleanSpecification__Group__0__Impl"
    // InternalExprDsl.g:3243:1: rule__BooleanSpecification__Group__0__Impl : ( () ) ;
    public final void rule__BooleanSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3247:1: ( ( () ) )
            // InternalExprDsl.g:3248:1: ( () )
            {
            // InternalExprDsl.g:3248:1: ( () )
            // InternalExprDsl.g:3249:2: ()
            {
             before(grammarAccess.getBooleanSpecificationAccess().getLiteralBooleanAction_0()); 
            // InternalExprDsl.g:3250:2: ()
            // InternalExprDsl.g:3250:3: 
            {
            }

             after(grammarAccess.getBooleanSpecificationAccess().getLiteralBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanSpecification__Group__0__Impl"


    // $ANTLR start "rule__BooleanSpecification__Group__1"
    // InternalExprDsl.g:3258:1: rule__BooleanSpecification__Group__1 : rule__BooleanSpecification__Group__1__Impl ;
    public final void rule__BooleanSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3262:1: ( rule__BooleanSpecification__Group__1__Impl )
            // InternalExprDsl.g:3263:2: rule__BooleanSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanSpecification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanSpecification__Group__1"


    // $ANTLR start "rule__BooleanSpecification__Group__1__Impl"
    // InternalExprDsl.g:3269:1: rule__BooleanSpecification__Group__1__Impl : ( ( rule__BooleanSpecification__Alternatives_1 ) ) ;
    public final void rule__BooleanSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3273:1: ( ( ( rule__BooleanSpecification__Alternatives_1 ) ) )
            // InternalExprDsl.g:3274:1: ( ( rule__BooleanSpecification__Alternatives_1 ) )
            {
            // InternalExprDsl.g:3274:1: ( ( rule__BooleanSpecification__Alternatives_1 ) )
            // InternalExprDsl.g:3275:2: ( rule__BooleanSpecification__Alternatives_1 )
            {
             before(grammarAccess.getBooleanSpecificationAccess().getAlternatives_1()); 
            // InternalExprDsl.g:3276:2: ( rule__BooleanSpecification__Alternatives_1 )
            // InternalExprDsl.g:3276:3: rule__BooleanSpecification__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanSpecification__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanSpecificationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanSpecification__Group__1__Impl"


    // $ANTLR start "rule__NullSpecification__Group__0"
    // InternalExprDsl.g:3285:1: rule__NullSpecification__Group__0 : rule__NullSpecification__Group__0__Impl rule__NullSpecification__Group__1 ;
    public final void rule__NullSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3289:1: ( rule__NullSpecification__Group__0__Impl rule__NullSpecification__Group__1 )
            // InternalExprDsl.g:3290:2: rule__NullSpecification__Group__0__Impl rule__NullSpecification__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__NullSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullSpecification__Group__0"


    // $ANTLR start "rule__NullSpecification__Group__0__Impl"
    // InternalExprDsl.g:3297:1: rule__NullSpecification__Group__0__Impl : ( () ) ;
    public final void rule__NullSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3301:1: ( ( () ) )
            // InternalExprDsl.g:3302:1: ( () )
            {
            // InternalExprDsl.g:3302:1: ( () )
            // InternalExprDsl.g:3303:2: ()
            {
             before(grammarAccess.getNullSpecificationAccess().getLiteralNullAction_0()); 
            // InternalExprDsl.g:3304:2: ()
            // InternalExprDsl.g:3304:3: 
            {
            }

             after(grammarAccess.getNullSpecificationAccess().getLiteralNullAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullSpecification__Group__0__Impl"


    // $ANTLR start "rule__NullSpecification__Group__1"
    // InternalExprDsl.g:3312:1: rule__NullSpecification__Group__1 : rule__NullSpecification__Group__1__Impl ;
    public final void rule__NullSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3316:1: ( rule__NullSpecification__Group__1__Impl )
            // InternalExprDsl.g:3317:2: rule__NullSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullSpecification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullSpecification__Group__1"


    // $ANTLR start "rule__NullSpecification__Group__1__Impl"
    // InternalExprDsl.g:3323:1: rule__NullSpecification__Group__1__Impl : ( ( rule__NullSpecification__Alternatives_1 ) ) ;
    public final void rule__NullSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3327:1: ( ( ( rule__NullSpecification__Alternatives_1 ) ) )
            // InternalExprDsl.g:3328:1: ( ( rule__NullSpecification__Alternatives_1 ) )
            {
            // InternalExprDsl.g:3328:1: ( ( rule__NullSpecification__Alternatives_1 ) )
            // InternalExprDsl.g:3329:2: ( rule__NullSpecification__Alternatives_1 )
            {
             before(grammarAccess.getNullSpecificationAccess().getAlternatives_1()); 
            // InternalExprDsl.g:3330:2: ( rule__NullSpecification__Alternatives_1 )
            // InternalExprDsl.g:3330:3: rule__NullSpecification__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__NullSpecification__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNullSpecificationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullSpecification__Group__1__Impl"


    // $ANTLR start "rule__PropertyAccess__Group__0"
    // InternalExprDsl.g:3339:1: rule__PropertyAccess__Group__0 : rule__PropertyAccess__Group__0__Impl rule__PropertyAccess__Group__1 ;
    public final void rule__PropertyAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3343:1: ( rule__PropertyAccess__Group__0__Impl rule__PropertyAccess__Group__1 )
            // InternalExprDsl.g:3344:2: rule__PropertyAccess__Group__0__Impl rule__PropertyAccess__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PropertyAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAccess__Group__0"


    // $ANTLR start "rule__PropertyAccess__Group__0__Impl"
    // InternalExprDsl.g:3351:1: rule__PropertyAccess__Group__0__Impl : ( () ) ;
    public final void rule__PropertyAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3355:1: ( ( () ) )
            // InternalExprDsl.g:3356:1: ( () )
            {
            // InternalExprDsl.g:3356:1: ( () )
            // InternalExprDsl.g:3357:2: ()
            {
             before(grammarAccess.getPropertyAccessAccess().getUnaryExpressionAction_0()); 
            // InternalExprDsl.g:3358:2: ()
            // InternalExprDsl.g:3358:3: 
            {
            }

             after(grammarAccess.getPropertyAccessAccess().getUnaryExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAccess__Group__0__Impl"


    // $ANTLR start "rule__PropertyAccess__Group__1"
    // InternalExprDsl.g:3366:1: rule__PropertyAccess__Group__1 : rule__PropertyAccess__Group__1__Impl ;
    public final void rule__PropertyAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3370:1: ( rule__PropertyAccess__Group__1__Impl )
            // InternalExprDsl.g:3371:2: rule__PropertyAccess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAccess__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAccess__Group__1"


    // $ANTLR start "rule__PropertyAccess__Group__1__Impl"
    // InternalExprDsl.g:3377:1: rule__PropertyAccess__Group__1__Impl : ( ( rule__PropertyAccess__IdentifierAssignment_1 ) ) ;
    public final void rule__PropertyAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3381:1: ( ( ( rule__PropertyAccess__IdentifierAssignment_1 ) ) )
            // InternalExprDsl.g:3382:1: ( ( rule__PropertyAccess__IdentifierAssignment_1 ) )
            {
            // InternalExprDsl.g:3382:1: ( ( rule__PropertyAccess__IdentifierAssignment_1 ) )
            // InternalExprDsl.g:3383:2: ( rule__PropertyAccess__IdentifierAssignment_1 )
            {
             before(grammarAccess.getPropertyAccessAccess().getIdentifierAssignment_1()); 
            // InternalExprDsl.g:3384:2: ( rule__PropertyAccess__IdentifierAssignment_1 )
            // InternalExprDsl.g:3384:3: rule__PropertyAccess__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAccess__IdentifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccessAccess().getIdentifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAccess__Group__1__Impl"


    // $ANTLR start "rule__Identifier__Group__0"
    // InternalExprDsl.g:3393:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3397:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalExprDsl.g:3398:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0"


    // $ANTLR start "rule__Identifier__Group__0__Impl"
    // InternalExprDsl.g:3405:1: rule__Identifier__Group__0__Impl : ( () ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3409:1: ( ( () ) )
            // InternalExprDsl.g:3410:1: ( () )
            {
            // InternalExprDsl.g:3410:1: ( () )
            // InternalExprDsl.g:3411:2: ()
            {
             before(grammarAccess.getIdentifierAccess().getIdentifierAction_0()); 
            // InternalExprDsl.g:3412:2: ()
            // InternalExprDsl.g:3412:3: 
            {
            }

             after(grammarAccess.getIdentifierAccess().getIdentifierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0__Impl"


    // $ANTLR start "rule__Identifier__Group__1"
    // InternalExprDsl.g:3420:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3424:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // InternalExprDsl.g:3425:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Identifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1"


    // $ANTLR start "rule__Identifier__Group__1__Impl"
    // InternalExprDsl.g:3432:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NameAssignment_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3436:1: ( ( ( rule__Identifier__NameAssignment_1 ) ) )
            // InternalExprDsl.g:3437:1: ( ( rule__Identifier__NameAssignment_1 ) )
            {
            // InternalExprDsl.g:3437:1: ( ( rule__Identifier__NameAssignment_1 ) )
            // InternalExprDsl.g:3438:2: ( rule__Identifier__NameAssignment_1 )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 
            // InternalExprDsl.g:3439:2: ( rule__Identifier__NameAssignment_1 )
            // InternalExprDsl.g:3439:3: rule__Identifier__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1__Impl"


    // $ANTLR start "rule__Identifier__Group__2"
    // InternalExprDsl.g:3447:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3451:1: ( rule__Identifier__Group__2__Impl )
            // InternalExprDsl.g:3452:2: rule__Identifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__2"


    // $ANTLR start "rule__Identifier__Group__2__Impl"
    // InternalExprDsl.g:3458:1: rule__Identifier__Group__2__Impl : ( ( rule__Identifier__Group_2__0 )? ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3462:1: ( ( ( rule__Identifier__Group_2__0 )? ) )
            // InternalExprDsl.g:3463:1: ( ( rule__Identifier__Group_2__0 )? )
            {
            // InternalExprDsl.g:3463:1: ( ( rule__Identifier__Group_2__0 )? )
            // InternalExprDsl.g:3464:2: ( rule__Identifier__Group_2__0 )?
            {
             before(grammarAccess.getIdentifierAccess().getGroup_2()); 
            // InternalExprDsl.g:3465:2: ( rule__Identifier__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalExprDsl.g:3465:3: rule__Identifier__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Identifier__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIdentifierAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__2__Impl"


    // $ANTLR start "rule__Identifier__Group_2__0"
    // InternalExprDsl.g:3474:1: rule__Identifier__Group_2__0 : rule__Identifier__Group_2__0__Impl rule__Identifier__Group_2__1 ;
    public final void rule__Identifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3478:1: ( rule__Identifier__Group_2__0__Impl rule__Identifier__Group_2__1 )
            // InternalExprDsl.g:3479:2: rule__Identifier__Group_2__0__Impl rule__Identifier__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Identifier__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_2__0"


    // $ANTLR start "rule__Identifier__Group_2__0__Impl"
    // InternalExprDsl.g:3486:1: rule__Identifier__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Identifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3490:1: ( ( '[' ) )
            // InternalExprDsl.g:3491:1: ( '[' )
            {
            // InternalExprDsl.g:3491:1: ( '[' )
            // InternalExprDsl.g:3492:2: '['
            {
             before(grammarAccess.getIdentifierAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_2__0__Impl"


    // $ANTLR start "rule__Identifier__Group_2__1"
    // InternalExprDsl.g:3501:1: rule__Identifier__Group_2__1 : rule__Identifier__Group_2__1__Impl rule__Identifier__Group_2__2 ;
    public final void rule__Identifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3505:1: ( rule__Identifier__Group_2__1__Impl rule__Identifier__Group_2__2 )
            // InternalExprDsl.g:3506:2: rule__Identifier__Group_2__1__Impl rule__Identifier__Group_2__2
            {
            pushFollow(FOLLOW_33);
            rule__Identifier__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_2__1"


    // $ANTLR start "rule__Identifier__Group_2__1__Impl"
    // InternalExprDsl.g:3513:1: rule__Identifier__Group_2__1__Impl : ( ( rule__Identifier__IndexAssignment_2_1 ) ) ;
    public final void rule__Identifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3517:1: ( ( ( rule__Identifier__IndexAssignment_2_1 ) ) )
            // InternalExprDsl.g:3518:1: ( ( rule__Identifier__IndexAssignment_2_1 ) )
            {
            // InternalExprDsl.g:3518:1: ( ( rule__Identifier__IndexAssignment_2_1 ) )
            // InternalExprDsl.g:3519:2: ( rule__Identifier__IndexAssignment_2_1 )
            {
             before(grammarAccess.getIdentifierAccess().getIndexAssignment_2_1()); 
            // InternalExprDsl.g:3520:2: ( rule__Identifier__IndexAssignment_2_1 )
            // InternalExprDsl.g:3520:3: rule__Identifier__IndexAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__IndexAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getIndexAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_2__1__Impl"


    // $ANTLR start "rule__Identifier__Group_2__2"
    // InternalExprDsl.g:3528:1: rule__Identifier__Group_2__2 : rule__Identifier__Group_2__2__Impl ;
    public final void rule__Identifier__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3532:1: ( rule__Identifier__Group_2__2__Impl )
            // InternalExprDsl.g:3533:2: rule__Identifier__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_2__2"


    // $ANTLR start "rule__Identifier__Group_2__2__Impl"
    // InternalExprDsl.g:3539:1: rule__Identifier__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Identifier__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3543:1: ( ( ']' ) )
            // InternalExprDsl.g:3544:1: ( ']' )
            {
            // InternalExprDsl.g:3544:1: ( ']' )
            // InternalExprDsl.g:3545:2: ']'
            {
             before(grammarAccess.getIdentifierAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_2__2__Impl"


    // $ANTLR start "rule__SignedInt__Group__0"
    // InternalExprDsl.g:3555:1: rule__SignedInt__Group__0 : rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 ;
    public final void rule__SignedInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3559:1: ( rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 )
            // InternalExprDsl.g:3560:2: rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__SignedInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Group__0"


    // $ANTLR start "rule__SignedInt__Group__0__Impl"
    // InternalExprDsl.g:3567:1: rule__SignedInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3571:1: ( ( ( '-' )? ) )
            // InternalExprDsl.g:3572:1: ( ( '-' )? )
            {
            // InternalExprDsl.g:3572:1: ( ( '-' )? )
            // InternalExprDsl.g:3573:2: ( '-' )?
            {
             before(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0()); 
            // InternalExprDsl.g:3574:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalExprDsl.g:3574:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Group__0__Impl"


    // $ANTLR start "rule__SignedInt__Group__1"
    // InternalExprDsl.g:3582:1: rule__SignedInt__Group__1 : rule__SignedInt__Group__1__Impl ;
    public final void rule__SignedInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3586:1: ( rule__SignedInt__Group__1__Impl )
            // InternalExprDsl.g:3587:2: rule__SignedInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignedInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Group__1"


    // $ANTLR start "rule__SignedInt__Group__1__Impl"
    // InternalExprDsl.g:3593:1: rule__SignedInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3597:1: ( ( RULE_INT ) )
            // InternalExprDsl.g:3598:1: ( RULE_INT )
            {
            // InternalExprDsl.g:3598:1: ( RULE_INT )
            // InternalExprDsl.g:3599:2: RULE_INT
            {
             before(grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalExprDsl.g:3609:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3613:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalExprDsl.g:3614:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalExprDsl.g:3621:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3625:1: ( ( RULE_ID ) )
            // InternalExprDsl.g:3626:1: ( RULE_ID )
            {
            // InternalExprDsl.g:3626:1: ( RULE_ID )
            // InternalExprDsl.g:3627:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalExprDsl.g:3636:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3640:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalExprDsl.g:3641:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalExprDsl.g:3647:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3651:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalExprDsl.g:3652:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalExprDsl.g:3652:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalExprDsl.g:3653:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalExprDsl.g:3654:2: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalExprDsl.g:3654:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalExprDsl.g:3663:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3667:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalExprDsl.g:3668:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalExprDsl.g:3675:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3679:1: ( ( '.' ) )
            // InternalExprDsl.g:3680:1: ( '.' )
            {
            // InternalExprDsl.g:3680:1: ( '.' )
            // InternalExprDsl.g:3681:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalExprDsl.g:3690:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3694:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalExprDsl.g:3695:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalExprDsl.g:3701:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3705:1: ( ( RULE_ID ) )
            // InternalExprDsl.g:3706:1: ( RULE_ID )
            {
            // InternalExprDsl.g:3706:1: ( RULE_ID )
            // InternalExprDsl.g:3707:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EnumQualifiedName__Group__0"
    // InternalExprDsl.g:3717:1: rule__EnumQualifiedName__Group__0 : rule__EnumQualifiedName__Group__0__Impl rule__EnumQualifiedName__Group__1 ;
    public final void rule__EnumQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3721:1: ( rule__EnumQualifiedName__Group__0__Impl rule__EnumQualifiedName__Group__1 )
            // InternalExprDsl.g:3722:2: rule__EnumQualifiedName__Group__0__Impl rule__EnumQualifiedName__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__EnumQualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumQualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumQualifiedName__Group__0"


    // $ANTLR start "rule__EnumQualifiedName__Group__0__Impl"
    // InternalExprDsl.g:3729:1: rule__EnumQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EnumQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3733:1: ( ( RULE_ID ) )
            // InternalExprDsl.g:3734:1: ( RULE_ID )
            {
            // InternalExprDsl.g:3734:1: ( RULE_ID )
            // InternalExprDsl.g:3735:2: RULE_ID
            {
             before(grammarAccess.getEnumQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumQualifiedName__Group__0__Impl"


    // $ANTLR start "rule__EnumQualifiedName__Group__1"
    // InternalExprDsl.g:3744:1: rule__EnumQualifiedName__Group__1 : rule__EnumQualifiedName__Group__1__Impl rule__EnumQualifiedName__Group__2 ;
    public final void rule__EnumQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3748:1: ( rule__EnumQualifiedName__Group__1__Impl rule__EnumQualifiedName__Group__2 )
            // InternalExprDsl.g:3749:2: rule__EnumQualifiedName__Group__1__Impl rule__EnumQualifiedName__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__EnumQualifiedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumQualifiedName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumQualifiedName__Group__1"


    // $ANTLR start "rule__EnumQualifiedName__Group__1__Impl"
    // InternalExprDsl.g:3756:1: rule__EnumQualifiedName__Group__1__Impl : ( '::' ) ;
    public final void rule__EnumQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3760:1: ( ( '::' ) )
            // InternalExprDsl.g:3761:1: ( '::' )
            {
            // InternalExprDsl.g:3761:1: ( '::' )
            // InternalExprDsl.g:3762:2: '::'
            {
             before(grammarAccess.getEnumQualifiedNameAccess().getColonColonKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEnumQualifiedNameAccess().getColonColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumQualifiedName__Group__1__Impl"


    // $ANTLR start "rule__EnumQualifiedName__Group__2"
    // InternalExprDsl.g:3771:1: rule__EnumQualifiedName__Group__2 : rule__EnumQualifiedName__Group__2__Impl ;
    public final void rule__EnumQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3775:1: ( rule__EnumQualifiedName__Group__2__Impl )
            // InternalExprDsl.g:3776:2: rule__EnumQualifiedName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumQualifiedName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumQualifiedName__Group__2"


    // $ANTLR start "rule__EnumQualifiedName__Group__2__Impl"
    // InternalExprDsl.g:3782:1: rule__EnumQualifiedName__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__EnumQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3786:1: ( ( RULE_ID ) )
            // InternalExprDsl.g:3787:1: ( RULE_ID )
            {
            // InternalExprDsl.g:3787:1: ( RULE_ID )
            // InternalExprDsl.g:3788:2: RULE_ID
            {
             before(grammarAccess.getEnumQualifiedNameAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumQualifiedNameAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumQualifiedName__Group__2__Impl"


    // $ANTLR start "rule__AssignmentExpression__IdentifierAssignment_0_1"
    // InternalExprDsl.g:3798:1: rule__AssignmentExpression__IdentifierAssignment_0_1 : ( ruleIdentifier ) ;
    public final void rule__AssignmentExpression__IdentifierAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3802:1: ( ( ruleIdentifier ) )
            // InternalExprDsl.g:3803:2: ( ruleIdentifier )
            {
            // InternalExprDsl.g:3803:2: ( ruleIdentifier )
            // InternalExprDsl.g:3804:3: ruleIdentifier
            {
             before(grammarAccess.getAssignmentExpressionAccess().getIdentifierIdentifierParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionAccess().getIdentifierIdentifierParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__IdentifierAssignment_0_1"


    // $ANTLR start "rule__AssignmentExpression__ExprAssignment_0_3"
    // InternalExprDsl.g:3813:1: rule__AssignmentExpression__ExprAssignment_0_3 : ( ruleAssignmentExpression ) ;
    public final void rule__AssignmentExpression__ExprAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3817:1: ( ( ruleAssignmentExpression ) )
            // InternalExprDsl.g:3818:2: ( ruleAssignmentExpression )
            {
            // InternalExprDsl.g:3818:2: ( ruleAssignmentExpression )
            // InternalExprDsl.g:3819:3: ruleAssignmentExpression
            {
             before(grammarAccess.getAssignmentExpressionAccess().getExprAssignmentExpressionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionAccess().getExprAssignmentExpressionParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__ExprAssignment_0_3"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalExprDsl.g:3828:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3832:1: ( ( ruleOrOperator ) )
            // InternalExprDsl.g:3833:2: ( ruleOrOperator )
            {
            // InternalExprDsl.g:3833:2: ( ruleOrOperator )
            // InternalExprDsl.g:3834:3: ruleOrOperator
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrOperator();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RightExprAssignment_1_2"
    // InternalExprDsl.g:3843:1: rule__OrExpression__RightExprAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3847:1: ( ( ruleAndExpression ) )
            // InternalExprDsl.g:3848:2: ( ruleAndExpression )
            {
            // InternalExprDsl.g:3848:2: ( ruleAndExpression )
            // InternalExprDsl.g:3849:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightExprAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalExprDsl.g:3858:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3862:1: ( ( ruleAndOperator ) )
            // InternalExprDsl.g:3863:2: ( ruleAndOperator )
            {
            // InternalExprDsl.g:3863:2: ( ruleAndOperator )
            // InternalExprDsl.g:3864:3: ruleAndOperator
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperator();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightExprAssignment_1_2"
    // InternalExprDsl.g:3873:1: rule__AndExpression__RightExprAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__AndExpression__RightExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3877:1: ( ( ruleComparisonExpression ) )
            // InternalExprDsl.g:3878:2: ( ruleComparisonExpression )
            {
            // InternalExprDsl.g:3878:2: ( ruleComparisonExpression )
            // InternalExprDsl.g:3879:3: ruleComparisonExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightExprComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightExprComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightExprAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalExprDsl.g:3888:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3892:1: ( ( ruleComparisonOperator ) )
            // InternalExprDsl.g:3893:2: ( ruleComparisonOperator )
            {
            // InternalExprDsl.g:3893:2: ( ruleComparisonOperator )
            // InternalExprDsl.g:3894:3: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightExprAssignment_1_2"
    // InternalExprDsl.g:3903:1: rule__ComparisonExpression__RightExprAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__RightExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3907:1: ( ( ruleAdditiveExpression ) )
            // InternalExprDsl.g:3908:2: ( ruleAdditiveExpression )
            {
            // InternalExprDsl.g:3908:2: ( ruleAdditiveExpression )
            // InternalExprDsl.g:3909:3: ruleAdditiveExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightExprAssignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalExprDsl.g:3918:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3922:1: ( ( ruleAdditiveOperator ) )
            // InternalExprDsl.g:3923:2: ( ruleAdditiveOperator )
            {
            // InternalExprDsl.g:3923:2: ( ruleAdditiveOperator )
            // InternalExprDsl.g:3924:3: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__RightExprAssignment_1_2"
    // InternalExprDsl.g:3933:1: rule__AdditiveExpression__RightExprAssignment_1_2 : ( ruleInExpression ) ;
    public final void rule__AdditiveExpression__RightExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3937:1: ( ( ruleInExpression ) )
            // InternalExprDsl.g:3938:2: ( ruleInExpression )
            {
            // InternalExprDsl.g:3938:2: ( ruleInExpression )
            // InternalExprDsl.g:3939:3: ruleInExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightExprInExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getRightExprInExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__RightExprAssignment_1_2"


    // $ANTLR start "rule__InExpression__OperatorAssignment_1_1"
    // InternalExprDsl.g:3948:1: rule__InExpression__OperatorAssignment_1_1 : ( ruleInOperator ) ;
    public final void rule__InExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3952:1: ( ( ruleInOperator ) )
            // InternalExprDsl.g:3953:2: ( ruleInOperator )
            {
            // InternalExprDsl.g:3953:2: ( ruleInOperator )
            // InternalExprDsl.g:3954:3: ruleInOperator
            {
             before(grammarAccess.getInExpressionAccess().getOperatorInOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInOperator();

            state._fsp--;

             after(grammarAccess.getInExpressionAccess().getOperatorInOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__InExpression__RightExprAssignment_1_2"
    // InternalExprDsl.g:3963:1: rule__InExpression__RightExprAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__InExpression__RightExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3967:1: ( ( ruleMultiplicativeExpression ) )
            // InternalExprDsl.g:3968:2: ( ruleMultiplicativeExpression )
            {
            // InternalExprDsl.g:3968:2: ( ruleMultiplicativeExpression )
            // InternalExprDsl.g:3969:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getInExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getInExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InExpression__RightExprAssignment_1_2"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_1_1"
    // InternalExprDsl.g:3978:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3982:1: ( ( ruleMultiplicativeOperator ) )
            // InternalExprDsl.g:3983:2: ( ruleMultiplicativeOperator )
            {
            // InternalExprDsl.g:3983:2: ( ruleMultiplicativeOperator )
            // InternalExprDsl.g:3984:3: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__RightExprAssignment_1_2"
    // InternalExprDsl.g:3993:1: rule__MultiplicativeExpression__RightExprAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__RightExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:3997:1: ( ( ruleUnaryExpression ) )
            // InternalExprDsl.g:3998:2: ( ruleUnaryExpression )
            {
            // InternalExprDsl.g:3998:2: ( ruleUnaryExpression )
            // InternalExprDsl.g:3999:3: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightExprUnaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getRightExprUnaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__RightExprAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__ExprAssignment_0_2"
    // InternalExprDsl.g:4008:1: rule__UnaryExpression__ExprAssignment_0_2 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4012:1: ( ( rulePrimaryExpression ) )
            // InternalExprDsl.g:4013:2: ( rulePrimaryExpression )
            {
            // InternalExprDsl.g:4013:2: ( rulePrimaryExpression )
            // InternalExprDsl.g:4014:3: rulePrimaryExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getExprPrimaryExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getExprPrimaryExpressionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ExprAssignment_0_2"


    // $ANTLR start "rule__LiteralReal__ValueAssignment"
    // InternalExprDsl.g:4023:1: rule__LiteralReal__ValueAssignment : ( ruleRealSpecification ) ;
    public final void rule__LiteralReal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4027:1: ( ( ruleRealSpecification ) )
            // InternalExprDsl.g:4028:2: ( ruleRealSpecification )
            {
            // InternalExprDsl.g:4028:2: ( ruleRealSpecification )
            // InternalExprDsl.g:4029:3: ruleRealSpecification
            {
             before(grammarAccess.getLiteralRealAccess().getValueRealSpecificationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRealSpecification();

            state._fsp--;

             after(grammarAccess.getLiteralRealAccess().getValueRealSpecificationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralReal__ValueAssignment"


    // $ANTLR start "rule__RealSpecification__ValueAssignment"
    // InternalExprDsl.g:4038:1: rule__RealSpecification__ValueAssignment : ( ruleEDoubleObject ) ;
    public final void rule__RealSpecification__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4042:1: ( ( ruleEDoubleObject ) )
            // InternalExprDsl.g:4043:2: ( ruleEDoubleObject )
            {
            // InternalExprDsl.g:4043:2: ( ruleEDoubleObject )
            // InternalExprDsl.g:4044:3: ruleEDoubleObject
            {
             before(grammarAccess.getRealSpecificationAccess().getValueEDoubleObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getRealSpecificationAccess().getValueEDoubleObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealSpecification__ValueAssignment"


    // $ANTLR start "rule__LiteralInteger__ValueAssignment"
    // InternalExprDsl.g:4053:1: rule__LiteralInteger__ValueAssignment : ( ruleIntegerSpecification ) ;
    public final void rule__LiteralInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4057:1: ( ( ruleIntegerSpecification ) )
            // InternalExprDsl.g:4058:2: ( ruleIntegerSpecification )
            {
            // InternalExprDsl.g:4058:2: ( ruleIntegerSpecification )
            // InternalExprDsl.g:4059:3: ruleIntegerSpecification
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueIntegerSpecificationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerSpecification();

            state._fsp--;

             after(grammarAccess.getLiteralIntegerAccess().getValueIntegerSpecificationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInteger__ValueAssignment"


    // $ANTLR start "rule__IntegerSpecification__ValueAssignment"
    // InternalExprDsl.g:4068:1: rule__IntegerSpecification__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerSpecification__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4072:1: ( ( ruleEIntegerObject ) )
            // InternalExprDsl.g:4073:2: ( ruleEIntegerObject )
            {
            // InternalExprDsl.g:4073:2: ( ruleEIntegerObject )
            // InternalExprDsl.g:4074:3: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerSpecificationAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getIntegerSpecificationAccess().getValueEIntegerObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerSpecification__ValueAssignment"


    // $ANTLR start "rule__LiteralString__ValueAssignment"
    // InternalExprDsl.g:4083:1: rule__LiteralString__ValueAssignment : ( ruleStringSpecification ) ;
    public final void rule__LiteralString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4087:1: ( ( ruleStringSpecification ) )
            // InternalExprDsl.g:4088:2: ( ruleStringSpecification )
            {
            // InternalExprDsl.g:4088:2: ( ruleStringSpecification )
            // InternalExprDsl.g:4089:3: ruleStringSpecification
            {
             before(grammarAccess.getLiteralStringAccess().getValueStringSpecificationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStringSpecification();

            state._fsp--;

             after(grammarAccess.getLiteralStringAccess().getValueStringSpecificationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralString__ValueAssignment"


    // $ANTLR start "rule__StringSpecification__ValueAssignment"
    // InternalExprDsl.g:4098:1: rule__StringSpecification__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringSpecification__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4102:1: ( ( RULE_STRING ) )
            // InternalExprDsl.g:4103:2: ( RULE_STRING )
            {
            // InternalExprDsl.g:4103:2: ( RULE_STRING )
            // InternalExprDsl.g:4104:3: RULE_STRING
            {
             before(grammarAccess.getStringSpecificationAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringSpecificationAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringSpecification__ValueAssignment"


    // $ANTLR start "rule__LiteralBoolean__ValueAssignment"
    // InternalExprDsl.g:4113:1: rule__LiteralBoolean__ValueAssignment : ( ruleBooleanSpecification ) ;
    public final void rule__LiteralBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4117:1: ( ( ruleBooleanSpecification ) )
            // InternalExprDsl.g:4118:2: ( ruleBooleanSpecification )
            {
            // InternalExprDsl.g:4118:2: ( ruleBooleanSpecification )
            // InternalExprDsl.g:4119:3: ruleBooleanSpecification
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueBooleanSpecificationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanSpecification();

            state._fsp--;

             after(grammarAccess.getLiteralBooleanAccess().getValueBooleanSpecificationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__ValueAssignment"


    // $ANTLR start "rule__BooleanSpecification__ValueAssignment_1_0"
    // InternalExprDsl.g:4128:1: rule__BooleanSpecification__ValueAssignment_1_0 : ( ( 'true' ) ) ;
    public final void rule__BooleanSpecification__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4132:1: ( ( ( 'true' ) ) )
            // InternalExprDsl.g:4133:2: ( ( 'true' ) )
            {
            // InternalExprDsl.g:4133:2: ( ( 'true' ) )
            // InternalExprDsl.g:4134:3: ( 'true' )
            {
             before(grammarAccess.getBooleanSpecificationAccess().getValueTrueKeyword_1_0_0()); 
            // InternalExprDsl.g:4135:3: ( 'true' )
            // InternalExprDsl.g:4136:4: 'true'
            {
             before(grammarAccess.getBooleanSpecificationAccess().getValueTrueKeyword_1_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBooleanSpecificationAccess().getValueTrueKeyword_1_0_0()); 

            }

             after(grammarAccess.getBooleanSpecificationAccess().getValueTrueKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanSpecification__ValueAssignment_1_0"


    // $ANTLR start "rule__LiteralNull__ValueAssignment"
    // InternalExprDsl.g:4147:1: rule__LiteralNull__ValueAssignment : ( ruleNullSpecification ) ;
    public final void rule__LiteralNull__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4151:1: ( ( ruleNullSpecification ) )
            // InternalExprDsl.g:4152:2: ( ruleNullSpecification )
            {
            // InternalExprDsl.g:4152:2: ( ruleNullSpecification )
            // InternalExprDsl.g:4153:3: ruleNullSpecification
            {
             before(grammarAccess.getLiteralNullAccess().getValueNullSpecificationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNullSpecification();

            state._fsp--;

             after(grammarAccess.getLiteralNullAccess().getValueNullSpecificationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralNull__ValueAssignment"


    // $ANTLR start "rule__PropertyAccess__IdentifierAssignment_1"
    // InternalExprDsl.g:4162:1: rule__PropertyAccess__IdentifierAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__PropertyAccess__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4166:1: ( ( ruleIdentifier ) )
            // InternalExprDsl.g:4167:2: ( ruleIdentifier )
            {
            // InternalExprDsl.g:4167:2: ( ruleIdentifier )
            // InternalExprDsl.g:4168:3: ruleIdentifier
            {
             before(grammarAccess.getPropertyAccessAccess().getIdentifierIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getPropertyAccessAccess().getIdentifierIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAccess__IdentifierAssignment_1"


    // $ANTLR start "rule__Identifier__NameAssignment_1"
    // InternalExprDsl.g:4177:1: rule__Identifier__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Identifier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4181:1: ( ( ruleQualifiedName ) )
            // InternalExprDsl.g:4182:2: ( ruleQualifiedName )
            {
            // InternalExprDsl.g:4182:2: ( ruleQualifiedName )
            // InternalExprDsl.g:4183:3: ruleQualifiedName
            {
             before(grammarAccess.getIdentifierAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__NameAssignment_1"


    // $ANTLR start "rule__Identifier__IndexAssignment_2_1"
    // InternalExprDsl.g:4192:1: rule__Identifier__IndexAssignment_2_1 : ( ruleSignedInt ) ;
    public final void rule__Identifier__IndexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4196:1: ( ( ruleSignedInt ) )
            // InternalExprDsl.g:4197:2: ( ruleSignedInt )
            {
            // InternalExprDsl.g:4197:2: ( ruleSignedInt )
            // InternalExprDsl.g:4198:3: ruleSignedInt
            {
             before(grammarAccess.getIdentifierAccess().getIndexSignedIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignedInt();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getIndexSignedIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__IndexAssignment_2_1"


    // $ANTLR start "rule__LiteralEnum__ValueAssignment"
    // InternalExprDsl.g:4207:1: rule__LiteralEnum__ValueAssignment : ( ruleEnumSpecification ) ;
    public final void rule__LiteralEnum__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4211:1: ( ( ruleEnumSpecification ) )
            // InternalExprDsl.g:4212:2: ( ruleEnumSpecification )
            {
            // InternalExprDsl.g:4212:2: ( ruleEnumSpecification )
            // InternalExprDsl.g:4213:3: ruleEnumSpecification
            {
             before(grammarAccess.getLiteralEnumAccess().getValueEnumSpecificationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumSpecification();

            state._fsp--;

             after(grammarAccess.getLiteralEnumAccess().getValueEnumSpecificationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralEnum__ValueAssignment"


    // $ANTLR start "rule__EnumSpecification__NameAssignment"
    // InternalExprDsl.g:4222:1: rule__EnumSpecification__NameAssignment : ( ruleEnumQualifiedName ) ;
    public final void rule__EnumSpecification__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExprDsl.g:4226:1: ( ( ruleEnumQualifiedName ) )
            // InternalExprDsl.g:4227:2: ( ruleEnumQualifiedName )
            {
            // InternalExprDsl.g:4227:2: ( ruleEnumQualifiedName )
            // InternalExprDsl.g:4228:3: ruleEnumQualifiedName
            {
             before(grammarAccess.getEnumSpecificationAccess().getNameEnumQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumQualifiedName();

            state._fsp--;

             after(grammarAccess.getEnumSpecificationAccess().getNameEnumQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSpecification__NameAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\uffff\1\2\4\uffff\1\2\2\uffff\1\2";
    static final String dfa_3s = "\1\4\1\13\1\uffff\1\5\1\4\1\uffff\1\13\1\4\1\55\1\13";
    static final String dfa_4s = "\1\57\1\56\1\uffff\1\5\1\46\1\uffff\1\54\1\4\1\55\1\52";
    static final String dfa_5s = "\2\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\1\2\15\uffff\12\2\10\uffff\1\2\2\uffff\1\2\5\uffff\1\2",
            "\11\2\12\uffff\1\5\12\2\1\uffff\1\2\1\3\1\4\1\uffff\1\2",
            "",
            "\1\6",
            "\1\10\41\uffff\1\7",
            "",
            "\11\2\12\uffff\1\5\12\2\1\uffff\1\2\1\3\1\4",
            "\1\10",
            "\1\11",
            "\11\2\12\uffff\1\5\12\2\1\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "927:1: rule__AssignmentExpression__Alternatives : ( ( ( rule__AssignmentExpression__Group_0__0 ) ) | ( ruleOrExpression ) );";
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\2\uffff\1\10\3\uffff\1\13\5\uffff";
    static final String dfa_10s = "\2\4\1\13\3\uffff\1\13\5\uffff";
    static final String dfa_11s = "\1\57\1\4\1\53\3\uffff\1\56\5\uffff";
    static final String dfa_12s = "\3\uffff\1\3\1\4\1\5\1\uffff\1\10\1\2\1\1\1\6\1\7";
    static final String dfa_13s = "\14\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\6\1\3\20\uffff\5\4\2\5\10\uffff\1\1\2\uffff\1\7\5\uffff\1\4",
            "\1\2",
            "\11\10\13\uffff\12\10\1\uffff\1\10\1\11",
            "",
            "",
            "",
            "\11\13\13\uffff\12\13\1\uffff\3\13\1\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1164:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralReal ) | ( ruleLiteralInteger ) | ( ruleLiteralString ) | ( ruleLiteralBoolean ) | ( ruleLiteralNull ) | ( ruleLiteralEnum ) | ( rulePropertyAccess ) | ( ( rule__PrimaryExpression__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000082403FF00070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000080000F800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});

}