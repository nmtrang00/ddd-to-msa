package dact.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dact.dsl.services.ExprDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExprDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'OR'", "'||'", "'or'", "'AND'", "'&&'", "'and'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'NOT'", "'!'", "'not'", "'('", "')'", "'.'", "'true'", "'false'", "'null'", "'NULL'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

        public InternalExprDslParser(TokenStream input, ExprDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Expression";
       	}

       	@Override
       	protected ExprDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpression"
    // InternalExprDsl.g:64:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalExprDsl.g:64:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalExprDsl.g:65:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExprDsl.g:71:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:77:2: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // InternalExprDsl.g:78:2: this_AssignmentExpression_0= ruleAssignmentExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssignmentExpression_0=ruleAssignmentExpression();

            state._fsp--;


            		current = this_AssignmentExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // InternalExprDsl.g:89:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // InternalExprDsl.g:89:61: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // InternalExprDsl.g:90:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // InternalExprDsl.g:96:1: ruleAssignmentExpression returns [EObject current=null] : ( ( () ( (lv_identifier_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleAssignmentExpression ) ) ) | this_OrExpression_4= ruleOrExpression ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject this_OrExpression_4 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:102:2: ( ( ( () ( (lv_identifier_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleAssignmentExpression ) ) ) | this_OrExpression_4= ruleOrExpression ) )
            // InternalExprDsl.g:103:2: ( ( () ( (lv_identifier_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleAssignmentExpression ) ) ) | this_OrExpression_4= ruleOrExpression )
            {
            // InternalExprDsl.g:103:2: ( ( () ( (lv_identifier_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleAssignmentExpression ) ) ) | this_OrExpression_4= ruleOrExpression )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalExprDsl.g:104:3: ( () ( (lv_identifier_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleAssignmentExpression ) ) )
                    {
                    // InternalExprDsl.g:104:3: ( () ( (lv_identifier_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleAssignmentExpression ) ) )
                    // InternalExprDsl.g:105:4: () ( (lv_identifier_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleAssignmentExpression ) )
                    {
                    // InternalExprDsl.g:105:4: ()
                    // InternalExprDsl.g:106:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssignmentExpressionAccess().getVariableAssignmentAction_0_0(),
                    						current);
                    				

                    }

                    // InternalExprDsl.g:112:4: ( (lv_identifier_1_0= ruleIdentifier ) )
                    // InternalExprDsl.g:113:5: (lv_identifier_1_0= ruleIdentifier )
                    {
                    // InternalExprDsl.g:113:5: (lv_identifier_1_0= ruleIdentifier )
                    // InternalExprDsl.g:114:6: lv_identifier_1_0= ruleIdentifier
                    {

                    						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getIdentifierIdentifierParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_identifier_1_0=ruleIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                    						}
                    						set(
                    							current,
                    							"identifier",
                    							lv_identifier_1_0,
                    							"dact.dsl.ExprDsl.Identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssignmentExpressionAccess().getEqualsSignKeyword_0_2());
                    			
                    // InternalExprDsl.g:135:4: ( (lv_expr_3_0= ruleAssignmentExpression ) )
                    // InternalExprDsl.g:136:5: (lv_expr_3_0= ruleAssignmentExpression )
                    {
                    // InternalExprDsl.g:136:5: (lv_expr_3_0= ruleAssignmentExpression )
                    // InternalExprDsl.g:137:6: lv_expr_3_0= ruleAssignmentExpression
                    {

                    						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExprAssignmentExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_3_0=ruleAssignmentExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"dact.dsl.ExprDsl.AssignmentExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:156:3: this_OrExpression_4= ruleOrExpression
                    {

                    			newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOrExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrExpression_4=ruleOrExpression();

                    state._fsp--;


                    			current = this_OrExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalExprDsl.g:168:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalExprDsl.g:168:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalExprDsl.g:169:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalExprDsl.g:175:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:181:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* ) )
            // InternalExprDsl.g:182:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* )
            {
            // InternalExprDsl.g:182:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* )
            // InternalExprDsl.g:183:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpr_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExprDsl.g:191:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpr_3_0= ruleAndExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExprDsl.g:192:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpr_3_0= ruleAndExpression ) )
            	    {
            	    // InternalExprDsl.g:192:4: ()
            	    // InternalExprDsl.g:193:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftExprAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalExprDsl.g:199:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalExprDsl.g:200:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalExprDsl.g:200:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalExprDsl.g:201:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleOrOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dact.dsl.ExprDsl.OrOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalExprDsl.g:218:4: ( (lv_rightExpr_3_0= ruleAndExpression ) )
            	    // InternalExprDsl.g:219:5: (lv_rightExpr_3_0= ruleAndExpression )
            	    {
            	    // InternalExprDsl.g:219:5: (lv_rightExpr_3_0= ruleAndExpression )
            	    // InternalExprDsl.g:220:6: lv_rightExpr_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_rightExpr_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpr",
            	    							lv_rightExpr_3_0,
            	    							"dact.dsl.ExprDsl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrOperator"
    // InternalExprDsl.g:242:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // InternalExprDsl.g:242:51: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalExprDsl.g:243:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
             newCompositeNode(grammarAccess.getOrOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;

             current =iv_ruleOrOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalExprDsl.g:249:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'OR' | otherlv_2= '||' | otherlv_3= 'or' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExprDsl.g:255:2: ( ( () (otherlv_1= 'OR' | otherlv_2= '||' | otherlv_3= 'or' ) ) )
            // InternalExprDsl.g:256:2: ( () (otherlv_1= 'OR' | otherlv_2= '||' | otherlv_3= 'or' ) )
            {
            // InternalExprDsl.g:256:2: ( () (otherlv_1= 'OR' | otherlv_2= '||' | otherlv_3= 'or' ) )
            // InternalExprDsl.g:257:3: () (otherlv_1= 'OR' | otherlv_2= '||' | otherlv_3= 'or' )
            {
            // InternalExprDsl.g:257:3: ()
            // InternalExprDsl.g:258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrOperatorAccess().getOrAction_0(),
            					current);
            			

            }

            // InternalExprDsl.g:264:3: (otherlv_1= 'OR' | otherlv_2= '||' | otherlv_3= 'or' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
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
                    // InternalExprDsl.g:265:4: otherlv_1= 'OR'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getORKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:270:4: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:275:4: otherlv_3= 'or'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrOperatorAccess().getOrKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleAndExpression"
    // InternalExprDsl.g:284:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalExprDsl.g:284:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalExprDsl.g:285:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalExprDsl.g:291:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:297:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalExprDsl.g:298:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalExprDsl.g:298:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )* )
            // InternalExprDsl.g:299:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExprDsl.g:307:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExprDsl.g:308:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalExprDsl.g:308:4: ()
            	    // InternalExprDsl.g:309:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftExprAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalExprDsl.g:315:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalExprDsl.g:316:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalExprDsl.g:316:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalExprDsl.g:317:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dact.dsl.ExprDsl.AndOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalExprDsl.g:334:4: ( (lv_rightExpr_3_0= ruleComparisonExpression ) )
            	    // InternalExprDsl.g:335:5: (lv_rightExpr_3_0= ruleComparisonExpression )
            	    {
            	    // InternalExprDsl.g:335:5: (lv_rightExpr_3_0= ruleComparisonExpression )
            	    // InternalExprDsl.g:336:6: lv_rightExpr_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprComparisonExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rightExpr_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpr",
            	    							lv_rightExpr_3_0,
            	    							"dact.dsl.ExprDsl.ComparisonExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperator"
    // InternalExprDsl.g:358:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // InternalExprDsl.g:358:52: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalExprDsl.g:359:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
             newCompositeNode(grammarAccess.getAndOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;

             current =iv_ruleAndOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalExprDsl.g:365:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'AND' | otherlv_2= '&&' | otherlv_3= 'and' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExprDsl.g:371:2: ( ( () (otherlv_1= 'AND' | otherlv_2= '&&' | otherlv_3= 'and' ) ) )
            // InternalExprDsl.g:372:2: ( () (otherlv_1= 'AND' | otherlv_2= '&&' | otherlv_3= 'and' ) )
            {
            // InternalExprDsl.g:372:2: ( () (otherlv_1= 'AND' | otherlv_2= '&&' | otherlv_3= 'and' ) )
            // InternalExprDsl.g:373:3: () (otherlv_1= 'AND' | otherlv_2= '&&' | otherlv_3= 'and' )
            {
            // InternalExprDsl.g:373:3: ()
            // InternalExprDsl.g:374:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAndOperatorAccess().getAndAction_0(),
            					current);
            			

            }

            // InternalExprDsl.g:380:3: (otherlv_1= 'AND' | otherlv_2= '&&' | otherlv_3= 'and' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalExprDsl.g:381:4: otherlv_1= 'AND'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getANDKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:386:4: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:391:4: otherlv_3= 'and'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAndOperatorAccess().getAndKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalExprDsl.g:400:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalExprDsl.g:400:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalExprDsl.g:401:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalExprDsl.g:407:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:413:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalExprDsl.g:414:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalExprDsl.g:414:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* )
            // InternalExprDsl.g:415:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExprDsl.g:423:3: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExprDsl.g:424:4: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalExprDsl.g:424:4: ()
            	    // InternalExprDsl.g:425:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getBinaryExpressionLeftExprAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalExprDsl.g:431:4: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // InternalExprDsl.g:432:5: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // InternalExprDsl.g:432:5: (lv_operator_2_0= ruleComparisonOperator )
            	    // InternalExprDsl.g:433:6: lv_operator_2_0= ruleComparisonOperator
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleComparisonOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dact.dsl.ExprDsl.ComparisonOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalExprDsl.g:450:4: ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
            	    // InternalExprDsl.g:451:5: (lv_rightExpr_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalExprDsl.g:451:5: (lv_rightExpr_3_0= ruleAdditiveExpression )
            	    // InternalExprDsl.g:452:6: lv_rightExpr_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rightExpr_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpr",
            	    							lv_rightExpr_3_0,
            	    							"dact.dsl.ExprDsl.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalExprDsl.g:474:1: entryRuleComparisonOperator returns [EObject current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final EObject entryRuleComparisonOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperator = null;


        try {
            // InternalExprDsl.g:474:59: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalExprDsl.g:475:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;

             current =iv_ruleComparisonOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalExprDsl.g:481:1: ruleComparisonOperator returns [EObject current=null] : ( ( () otherlv_1= '>' ) | ( () otherlv_3= '>=' ) | ( () otherlv_5= '<' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '==' ) | ( () otherlv_11= '!=' ) ) ;
    public final EObject ruleComparisonOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalExprDsl.g:487:2: ( ( ( () otherlv_1= '>' ) | ( () otherlv_3= '>=' ) | ( () otherlv_5= '<' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '==' ) | ( () otherlv_11= '!=' ) ) )
            // InternalExprDsl.g:488:2: ( ( () otherlv_1= '>' ) | ( () otherlv_3= '>=' ) | ( () otherlv_5= '<' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '==' ) | ( () otherlv_11= '!=' ) )
            {
            // InternalExprDsl.g:488:2: ( ( () otherlv_1= '>' ) | ( () otherlv_3= '>=' ) | ( () otherlv_5= '<' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '==' ) | ( () otherlv_11= '!=' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            case 22:
                {
                alt7=5;
                }
                break;
            case 23:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExprDsl.g:489:3: ( () otherlv_1= '>' )
                    {
                    // InternalExprDsl.g:489:3: ( () otherlv_1= '>' )
                    // InternalExprDsl.g:490:4: () otherlv_1= '>'
                    {
                    // InternalExprDsl.g:490:4: ()
                    // InternalExprDsl.g:491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonOperatorAccess().getGtAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:503:3: ( () otherlv_3= '>=' )
                    {
                    // InternalExprDsl.g:503:3: ( () otherlv_3= '>=' )
                    // InternalExprDsl.g:504:4: () otherlv_3= '>='
                    {
                    // InternalExprDsl.g:504:4: ()
                    // InternalExprDsl.g:505:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonOperatorAccess().getGeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:517:3: ( () otherlv_5= '<' )
                    {
                    // InternalExprDsl.g:517:3: ( () otherlv_5= '<' )
                    // InternalExprDsl.g:518:4: () otherlv_5= '<'
                    {
                    // InternalExprDsl.g:518:4: ()
                    // InternalExprDsl.g:519:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonOperatorAccess().getLtAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalExprDsl.g:531:3: ( () otherlv_7= '<=' )
                    {
                    // InternalExprDsl.g:531:3: ( () otherlv_7= '<=' )
                    // InternalExprDsl.g:532:4: () otherlv_7= '<='
                    {
                    // InternalExprDsl.g:532:4: ()
                    // InternalExprDsl.g:533:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonOperatorAccess().getLeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalExprDsl.g:545:3: ( () otherlv_9= '==' )
                    {
                    // InternalExprDsl.g:545:3: ( () otherlv_9= '==' )
                    // InternalExprDsl.g:546:4: () otherlv_9= '=='
                    {
                    // InternalExprDsl.g:546:4: ()
                    // InternalExprDsl.g:547:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonOperatorAccess().getEqAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalExprDsl.g:559:3: ( () otherlv_11= '!=' )
                    {
                    // InternalExprDsl.g:559:3: ( () otherlv_11= '!=' )
                    // InternalExprDsl.g:560:4: () otherlv_11= '!='
                    {
                    // InternalExprDsl.g:560:4: ()
                    // InternalExprDsl.g:561:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonOperatorAccess().getNeAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_5_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalExprDsl.g:576:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalExprDsl.g:576:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalExprDsl.g:577:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalExprDsl.g:583:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:589:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalExprDsl.g:590:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalExprDsl.g:590:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalExprDsl.g:591:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExprDsl.g:599:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExprDsl.g:600:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalExprDsl.g:600:4: ()
            	    // InternalExprDsl.g:601:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftExprAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalExprDsl.g:607:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalExprDsl.g:608:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalExprDsl.g:608:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalExprDsl.g:609:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dact.dsl.ExprDsl.AdditiveOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalExprDsl.g:626:4: ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
            	    // InternalExprDsl.g:627:5: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalExprDsl.g:627:5: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
            	    // InternalExprDsl.g:628:6: lv_rightExpr_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_rightExpr_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpr",
            	    							lv_rightExpr_3_0,
            	    							"dact.dsl.ExprDsl.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveOperator"
    // InternalExprDsl.g:650:1: entryRuleAdditiveOperator returns [EObject current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final EObject entryRuleAdditiveOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveOperator = null;


        try {
            // InternalExprDsl.g:650:57: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalExprDsl.g:651:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
            {
             newCompositeNode(grammarAccess.getAdditiveOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveOperator=ruleAdditiveOperator();

            state._fsp--;

             current =iv_ruleAdditiveOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalExprDsl.g:657:1: ruleAdditiveOperator returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject ruleAdditiveOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExprDsl.g:663:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalExprDsl.g:664:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalExprDsl.g:664:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExprDsl.g:665:3: ( () otherlv_1= '+' )
                    {
                    // InternalExprDsl.g:665:3: ( () otherlv_1= '+' )
                    // InternalExprDsl.g:666:4: () otherlv_1= '+'
                    {
                    // InternalExprDsl.g:666:4: ()
                    // InternalExprDsl.g:667:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAdditiveOperatorAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:679:3: ( () otherlv_3= '-' )
                    {
                    // InternalExprDsl.g:679:3: ( () otherlv_3= '-' )
                    // InternalExprDsl.g:680:4: () otherlv_3= '-'
                    {
                    // InternalExprDsl.g:680:4: ()
                    // InternalExprDsl.g:681:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAdditiveOperatorAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalExprDsl.g:696:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalExprDsl.g:696:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalExprDsl.g:697:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalExprDsl.g:703:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:709:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalExprDsl.g:710:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalExprDsl.g:710:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleUnaryExpression ) ) )* )
            // InternalExprDsl.g:711:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExprDsl.g:719:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleUnaryExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExprDsl.g:720:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalExprDsl.g:720:4: ()
            	    // InternalExprDsl.g:721:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftExprAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalExprDsl.g:727:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalExprDsl.g:728:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalExprDsl.g:728:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalExprDsl.g:729:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dact.dsl.ExprDsl.MultiplicativeOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalExprDsl.g:746:4: ( (lv_rightExpr_3_0= ruleUnaryExpression ) )
            	    // InternalExprDsl.g:747:5: (lv_rightExpr_3_0= ruleUnaryExpression )
            	    {
            	    // InternalExprDsl.g:747:5: (lv_rightExpr_3_0= ruleUnaryExpression )
            	    // InternalExprDsl.g:748:6: lv_rightExpr_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExprUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_rightExpr_3_0=ruleUnaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpr",
            	    							lv_rightExpr_3_0,
            	    							"dact.dsl.ExprDsl.UnaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalExprDsl.g:770:1: entryRuleMultiplicativeOperator returns [EObject current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final EObject entryRuleMultiplicativeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeOperator = null;


        try {
            // InternalExprDsl.g:770:63: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalExprDsl.g:771:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;

             current =iv_ruleMultiplicativeOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalExprDsl.g:777:1: ruleMultiplicativeOperator returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleMultiplicativeOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExprDsl.g:783:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalExprDsl.g:784:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalExprDsl.g:784:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalExprDsl.g:785:3: ( () otherlv_1= '*' )
                    {
                    // InternalExprDsl.g:785:3: ( () otherlv_1= '*' )
                    // InternalExprDsl.g:786:4: () otherlv_1= '*'
                    {
                    // InternalExprDsl.g:786:4: ()
                    // InternalExprDsl.g:787:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultiplicativeOperatorAccess().getTimesAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:799:3: ( () otherlv_3= '/' )
                    {
                    // InternalExprDsl.g:799:3: ( () otherlv_3= '/' )
                    // InternalExprDsl.g:800:4: () otherlv_3= '/'
                    {
                    // InternalExprDsl.g:800:4: ()
                    // InternalExprDsl.g:801:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultiplicativeOperatorAccess().getDivideAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalExprDsl.g:816:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalExprDsl.g:816:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalExprDsl.g:817:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalExprDsl.g:823:1: ruleUnaryExpression returns [EObject current=null] : ( ( () (otherlv_1= 'NOT' | otherlv_2= '!' | otherlv_3= 'not' ) ( (lv_expr_4_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_5= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expr_4_0 = null;

        EObject this_PrimaryExpression_5 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:829:2: ( ( ( () (otherlv_1= 'NOT' | otherlv_2= '!' | otherlv_3= 'not' ) ( (lv_expr_4_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_5= rulePrimaryExpression ) )
            // InternalExprDsl.g:830:2: ( ( () (otherlv_1= 'NOT' | otherlv_2= '!' | otherlv_3= 'not' ) ( (lv_expr_4_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_5= rulePrimaryExpression )
            {
            // InternalExprDsl.g:830:2: ( ( () (otherlv_1= 'NOT' | otherlv_2= '!' | otherlv_3= 'not' ) ( (lv_expr_4_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_5= rulePrimaryExpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=28 && LA13_0<=30)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_ID)||LA13_0==25||LA13_0==31||(LA13_0>=34 && LA13_0<=37)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalExprDsl.g:831:3: ( () (otherlv_1= 'NOT' | otherlv_2= '!' | otherlv_3= 'not' ) ( (lv_expr_4_0= rulePrimaryExpression ) ) )
                    {
                    // InternalExprDsl.g:831:3: ( () (otherlv_1= 'NOT' | otherlv_2= '!' | otherlv_3= 'not' ) ( (lv_expr_4_0= rulePrimaryExpression ) ) )
                    // InternalExprDsl.g:832:4: () (otherlv_1= 'NOT' | otherlv_2= '!' | otherlv_3= 'not' ) ( (lv_expr_4_0= rulePrimaryExpression ) )
                    {
                    // InternalExprDsl.g:832:4: ()
                    // InternalExprDsl.g:833:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getNotExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalExprDsl.g:839:4: (otherlv_1= 'NOT' | otherlv_2= '!' | otherlv_3= 'not' )
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case 28:
                        {
                        alt12=1;
                        }
                        break;
                    case 29:
                        {
                        alt12=2;
                        }
                        break;
                    case 30:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalExprDsl.g:840:5: otherlv_1= 'NOT'
                            {
                            otherlv_1=(Token)match(input,28,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getUnaryExpressionAccess().getNOTKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalExprDsl.g:845:5: otherlv_2= '!'
                            {
                            otherlv_2=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_0_1_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalExprDsl.g:850:5: otherlv_3= 'not'
                            {
                            otherlv_3=(Token)match(input,30,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getUnaryExpressionAccess().getNotKeyword_0_1_2());
                            				

                            }
                            break;

                    }

                    // InternalExprDsl.g:855:4: ( (lv_expr_4_0= rulePrimaryExpression ) )
                    // InternalExprDsl.g:856:5: (lv_expr_4_0= rulePrimaryExpression )
                    {
                    // InternalExprDsl.g:856:5: (lv_expr_4_0= rulePrimaryExpression )
                    // InternalExprDsl.g:857:6: lv_expr_4_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExprPrimaryExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_4_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"dact.dsl.ExprDsl.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:876:3: this_PrimaryExpression_5= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_5=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalExprDsl.g:888:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalExprDsl.g:888:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalExprDsl.g:889:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalExprDsl.g:895:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralReal_0= ruleLiteralReal | this_LiteralInteger_1= ruleLiteralInteger | this_LiteralString_2= ruleLiteralString | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralNull_4= ruleLiteralNull | this_PropertyAccess_5= rulePropertyAccess | (otherlv_6= '(' this_AssignmentExpression_7= ruleAssignmentExpression otherlv_8= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_LiteralReal_0 = null;

        EObject this_LiteralInteger_1 = null;

        EObject this_LiteralString_2 = null;

        EObject this_LiteralBoolean_3 = null;

        EObject this_LiteralNull_4 = null;

        EObject this_PropertyAccess_5 = null;

        EObject this_AssignmentExpression_7 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:901:2: ( (this_LiteralReal_0= ruleLiteralReal | this_LiteralInteger_1= ruleLiteralInteger | this_LiteralString_2= ruleLiteralString | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralNull_4= ruleLiteralNull | this_PropertyAccess_5= rulePropertyAccess | (otherlv_6= '(' this_AssignmentExpression_7= ruleAssignmentExpression otherlv_8= ')' ) ) )
            // InternalExprDsl.g:902:2: (this_LiteralReal_0= ruleLiteralReal | this_LiteralInteger_1= ruleLiteralInteger | this_LiteralString_2= ruleLiteralString | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralNull_4= ruleLiteralNull | this_PropertyAccess_5= rulePropertyAccess | (otherlv_6= '(' this_AssignmentExpression_7= ruleAssignmentExpression otherlv_8= ')' ) )
            {
            // InternalExprDsl.g:902:2: (this_LiteralReal_0= ruleLiteralReal | this_LiteralInteger_1= ruleLiteralInteger | this_LiteralString_2= ruleLiteralString | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralNull_4= ruleLiteralNull | this_PropertyAccess_5= rulePropertyAccess | (otherlv_6= '(' this_AssignmentExpression_7= ruleAssignmentExpression otherlv_8= ')' ) )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalExprDsl.g:903:3: this_LiteralReal_0= ruleLiteralReal
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralRealParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralReal_0=ruleLiteralReal();

                    state._fsp--;


                    			current = this_LiteralReal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:912:3: this_LiteralInteger_1= ruleLiteralInteger
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralInteger_1=ruleLiteralInteger();

                    state._fsp--;


                    			current = this_LiteralInteger_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExprDsl.g:921:3: this_LiteralString_2= ruleLiteralString
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralStringParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralString_2=ruleLiteralString();

                    state._fsp--;


                    			current = this_LiteralString_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExprDsl.g:930:3: this_LiteralBoolean_3= ruleLiteralBoolean
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralBooleanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralBoolean_3=ruleLiteralBoolean();

                    state._fsp--;


                    			current = this_LiteralBoolean_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalExprDsl.g:939:3: this_LiteralNull_4= ruleLiteralNull
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralNullParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralNull_4=ruleLiteralNull();

                    state._fsp--;


                    			current = this_LiteralNull_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalExprDsl.g:948:3: this_PropertyAccess_5= rulePropertyAccess
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPropertyAccessParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyAccess_5=rulePropertyAccess();

                    state._fsp--;


                    			current = this_PropertyAccess_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalExprDsl.g:957:3: (otherlv_6= '(' this_AssignmentExpression_7= ruleAssignmentExpression otherlv_8= ')' )
                    {
                    // InternalExprDsl.g:957:3: (otherlv_6= '(' this_AssignmentExpression_7= ruleAssignmentExpression otherlv_8= ')' )
                    // InternalExprDsl.g:958:4: otherlv_6= '(' this_AssignmentExpression_7= ruleAssignmentExpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAssignmentExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_AssignmentExpression_7=ruleAssignmentExpression();

                    state._fsp--;


                    				current = this_AssignmentExpression_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_6_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteralReal"
    // InternalExprDsl.g:979:1: entryRuleLiteralReal returns [EObject current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final EObject entryRuleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralReal = null;


        try {
            // InternalExprDsl.g:979:52: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalExprDsl.g:980:2: iv_ruleLiteralReal= ruleLiteralReal EOF
            {
             newCompositeNode(grammarAccess.getLiteralRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralReal=ruleLiteralReal();

            state._fsp--;

             current =iv_ruleLiteralReal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralReal"


    // $ANTLR start "ruleLiteralReal"
    // InternalExprDsl.g:986:1: ruleLiteralReal returns [EObject current=null] : ( (lv_value_0_0= ruleRealSpecification ) ) ;
    public final EObject ruleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:992:2: ( ( (lv_value_0_0= ruleRealSpecification ) ) )
            // InternalExprDsl.g:993:2: ( (lv_value_0_0= ruleRealSpecification ) )
            {
            // InternalExprDsl.g:993:2: ( (lv_value_0_0= ruleRealSpecification ) )
            // InternalExprDsl.g:994:3: (lv_value_0_0= ruleRealSpecification )
            {
            // InternalExprDsl.g:994:3: (lv_value_0_0= ruleRealSpecification )
            // InternalExprDsl.g:995:4: lv_value_0_0= ruleRealSpecification
            {

            				newCompositeNode(grammarAccess.getLiteralRealAccess().getValueRealSpecificationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleRealSpecification();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralRealRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dact.dsl.ExprDsl.RealSpecification");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralReal"


    // $ANTLR start "entryRuleRealSpecification"
    // InternalExprDsl.g:1015:1: entryRuleRealSpecification returns [EObject current=null] : iv_ruleRealSpecification= ruleRealSpecification EOF ;
    public final EObject entryRuleRealSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealSpecification = null;


        try {
            // InternalExprDsl.g:1015:58: (iv_ruleRealSpecification= ruleRealSpecification EOF )
            // InternalExprDsl.g:1016:2: iv_ruleRealSpecification= ruleRealSpecification EOF
            {
             newCompositeNode(grammarAccess.getRealSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealSpecification=ruleRealSpecification();

            state._fsp--;

             current =iv_ruleRealSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealSpecification"


    // $ANTLR start "ruleRealSpecification"
    // InternalExprDsl.g:1022:1: ruleRealSpecification returns [EObject current=null] : ( (lv_value_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleRealSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:1028:2: ( ( (lv_value_0_0= ruleEDoubleObject ) ) )
            // InternalExprDsl.g:1029:2: ( (lv_value_0_0= ruleEDoubleObject ) )
            {
            // InternalExprDsl.g:1029:2: ( (lv_value_0_0= ruleEDoubleObject ) )
            // InternalExprDsl.g:1030:3: (lv_value_0_0= ruleEDoubleObject )
            {
            // InternalExprDsl.g:1030:3: (lv_value_0_0= ruleEDoubleObject )
            // InternalExprDsl.g:1031:4: lv_value_0_0= ruleEDoubleObject
            {

            				newCompositeNode(grammarAccess.getRealSpecificationAccess().getValueEDoubleObjectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEDoubleObject();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealSpecificationRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dact.dsl.ExprDsl.EDoubleObject");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealSpecification"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalExprDsl.g:1051:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalExprDsl.g:1051:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalExprDsl.g:1052:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
             newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;

             current =iv_ruleEDoubleObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalExprDsl.g:1058:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalExprDsl.g:1064:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalExprDsl.g:1065:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalExprDsl.g:1065:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalExprDsl.g:1066:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalExprDsl.g:1066:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalExprDsl.g:1067:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,33,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleLiteralInteger"
    // InternalExprDsl.g:1096:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalExprDsl.g:1096:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalExprDsl.g:1097:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             newCompositeNode(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInteger=ruleLiteralInteger();

            state._fsp--;

             current =iv_ruleLiteralInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // InternalExprDsl.g:1103:1: ruleLiteralInteger returns [EObject current=null] : ( (lv_value_0_0= ruleIntegerSpecification ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:1109:2: ( ( (lv_value_0_0= ruleIntegerSpecification ) ) )
            // InternalExprDsl.g:1110:2: ( (lv_value_0_0= ruleIntegerSpecification ) )
            {
            // InternalExprDsl.g:1110:2: ( (lv_value_0_0= ruleIntegerSpecification ) )
            // InternalExprDsl.g:1111:3: (lv_value_0_0= ruleIntegerSpecification )
            {
            // InternalExprDsl.g:1111:3: (lv_value_0_0= ruleIntegerSpecification )
            // InternalExprDsl.g:1112:4: lv_value_0_0= ruleIntegerSpecification
            {

            				newCompositeNode(grammarAccess.getLiteralIntegerAccess().getValueIntegerSpecificationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleIntegerSpecification();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralIntegerRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dact.dsl.ExprDsl.IntegerSpecification");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleIntegerSpecification"
    // InternalExprDsl.g:1132:1: entryRuleIntegerSpecification returns [EObject current=null] : iv_ruleIntegerSpecification= ruleIntegerSpecification EOF ;
    public final EObject entryRuleIntegerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerSpecification = null;


        try {
            // InternalExprDsl.g:1132:61: (iv_ruleIntegerSpecification= ruleIntegerSpecification EOF )
            // InternalExprDsl.g:1133:2: iv_ruleIntegerSpecification= ruleIntegerSpecification EOF
            {
             newCompositeNode(grammarAccess.getIntegerSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerSpecification=ruleIntegerSpecification();

            state._fsp--;

             current =iv_ruleIntegerSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerSpecification"


    // $ANTLR start "ruleIntegerSpecification"
    // InternalExprDsl.g:1139:1: ruleIntegerSpecification returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:1145:2: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // InternalExprDsl.g:1146:2: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // InternalExprDsl.g:1146:2: ( (lv_value_0_0= ruleEIntegerObject ) )
            // InternalExprDsl.g:1147:3: (lv_value_0_0= ruleEIntegerObject )
            {
            // InternalExprDsl.g:1147:3: (lv_value_0_0= ruleEIntegerObject )
            // InternalExprDsl.g:1148:4: lv_value_0_0= ruleEIntegerObject
            {

            				newCompositeNode(grammarAccess.getIntegerSpecificationAccess().getValueEIntegerObjectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEIntegerObject();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntegerSpecificationRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dact.dsl.ExprDsl.EIntegerObject");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerSpecification"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalExprDsl.g:1168:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalExprDsl.g:1168:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalExprDsl.g:1169:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalExprDsl.g:1175:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalExprDsl.g:1181:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalExprDsl.g:1182:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalExprDsl.g:1182:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalExprDsl.g:1183:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalExprDsl.g:1183:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalExprDsl.g:1184:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleLiteralString"
    // InternalExprDsl.g:1201:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // InternalExprDsl.g:1201:54: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalExprDsl.g:1202:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             newCompositeNode(grammarAccess.getLiteralStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralString=ruleLiteralString();

            state._fsp--;

             current =iv_ruleLiteralString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralString"


    // $ANTLR start "ruleLiteralString"
    // InternalExprDsl.g:1208:1: ruleLiteralString returns [EObject current=null] : ( (lv_value_0_0= ruleStringSpecification ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:1214:2: ( ( (lv_value_0_0= ruleStringSpecification ) ) )
            // InternalExprDsl.g:1215:2: ( (lv_value_0_0= ruleStringSpecification ) )
            {
            // InternalExprDsl.g:1215:2: ( (lv_value_0_0= ruleStringSpecification ) )
            // InternalExprDsl.g:1216:3: (lv_value_0_0= ruleStringSpecification )
            {
            // InternalExprDsl.g:1216:3: (lv_value_0_0= ruleStringSpecification )
            // InternalExprDsl.g:1217:4: lv_value_0_0= ruleStringSpecification
            {

            				newCompositeNode(grammarAccess.getLiteralStringAccess().getValueStringSpecificationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleStringSpecification();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralStringRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dact.dsl.ExprDsl.StringSpecification");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralString"


    // $ANTLR start "entryRuleStringSpecification"
    // InternalExprDsl.g:1237:1: entryRuleStringSpecification returns [EObject current=null] : iv_ruleStringSpecification= ruleStringSpecification EOF ;
    public final EObject entryRuleStringSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringSpecification = null;


        try {
            // InternalExprDsl.g:1237:60: (iv_ruleStringSpecification= ruleStringSpecification EOF )
            // InternalExprDsl.g:1238:2: iv_ruleStringSpecification= ruleStringSpecification EOF
            {
             newCompositeNode(grammarAccess.getStringSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringSpecification=ruleStringSpecification();

            state._fsp--;

             current =iv_ruleStringSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringSpecification"


    // $ANTLR start "ruleStringSpecification"
    // InternalExprDsl.g:1244:1: ruleStringSpecification returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalExprDsl.g:1250:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalExprDsl.g:1251:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalExprDsl.g:1251:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalExprDsl.g:1252:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalExprDsl.g:1252:3: (lv_value_0_0= RULE_STRING )
            // InternalExprDsl.g:1253:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringSpecificationAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringSpecificationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringSpecification"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalExprDsl.g:1272:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalExprDsl.g:1272:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalExprDsl.g:1273:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalExprDsl.g:1279:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanSpecification ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:1285:2: ( ( (lv_value_0_0= ruleBooleanSpecification ) ) )
            // InternalExprDsl.g:1286:2: ( (lv_value_0_0= ruleBooleanSpecification ) )
            {
            // InternalExprDsl.g:1286:2: ( (lv_value_0_0= ruleBooleanSpecification ) )
            // InternalExprDsl.g:1287:3: (lv_value_0_0= ruleBooleanSpecification )
            {
            // InternalExprDsl.g:1287:3: (lv_value_0_0= ruleBooleanSpecification )
            // InternalExprDsl.g:1288:4: lv_value_0_0= ruleBooleanSpecification
            {

            				newCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanSpecificationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBooleanSpecification();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralBooleanRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dact.dsl.ExprDsl.BooleanSpecification");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleBooleanSpecification"
    // InternalExprDsl.g:1308:1: entryRuleBooleanSpecification returns [EObject current=null] : iv_ruleBooleanSpecification= ruleBooleanSpecification EOF ;
    public final EObject entryRuleBooleanSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSpecification = null;


        try {
            // InternalExprDsl.g:1308:61: (iv_ruleBooleanSpecification= ruleBooleanSpecification EOF )
            // InternalExprDsl.g:1309:2: iv_ruleBooleanSpecification= ruleBooleanSpecification EOF
            {
             newCompositeNode(grammarAccess.getBooleanSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanSpecification=ruleBooleanSpecification();

            state._fsp--;

             current =iv_ruleBooleanSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanSpecification"


    // $ANTLR start "ruleBooleanSpecification"
    // InternalExprDsl.g:1315:1: ruleBooleanSpecification returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExprDsl.g:1321:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalExprDsl.g:1322:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalExprDsl.g:1322:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalExprDsl.g:1323:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalExprDsl.g:1323:3: ()
            // InternalExprDsl.g:1324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanSpecificationAccess().getLiteralBooleanAction_0(),
            					current);
            			

            }

            // InternalExprDsl.g:1330:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalExprDsl.g:1331:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalExprDsl.g:1331:4: ( (lv_value_1_0= 'true' ) )
                    // InternalExprDsl.g:1332:5: (lv_value_1_0= 'true' )
                    {
                    // InternalExprDsl.g:1332:5: (lv_value_1_0= 'true' )
                    // InternalExprDsl.g:1333:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getBooleanSpecificationAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanSpecificationRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_0 != null, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1346:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanSpecificationAccess().getFalseKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanSpecification"


    // $ANTLR start "entryRuleLiteralNull"
    // InternalExprDsl.g:1355:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // InternalExprDsl.g:1355:52: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // InternalExprDsl.g:1356:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
             newCompositeNode(grammarAccess.getLiteralNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralNull=ruleLiteralNull();

            state._fsp--;

             current =iv_ruleLiteralNull; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralNull"


    // $ANTLR start "ruleLiteralNull"
    // InternalExprDsl.g:1362:1: ruleLiteralNull returns [EObject current=null] : ( (lv_value_0_0= ruleNullSpecification ) ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:1368:2: ( ( (lv_value_0_0= ruleNullSpecification ) ) )
            // InternalExprDsl.g:1369:2: ( (lv_value_0_0= ruleNullSpecification ) )
            {
            // InternalExprDsl.g:1369:2: ( (lv_value_0_0= ruleNullSpecification ) )
            // InternalExprDsl.g:1370:3: (lv_value_0_0= ruleNullSpecification )
            {
            // InternalExprDsl.g:1370:3: (lv_value_0_0= ruleNullSpecification )
            // InternalExprDsl.g:1371:4: lv_value_0_0= ruleNullSpecification
            {

            				newCompositeNode(grammarAccess.getLiteralNullAccess().getValueNullSpecificationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNullSpecification();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralNullRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dact.dsl.ExprDsl.NullSpecification");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralNull"


    // $ANTLR start "entryRuleNullSpecification"
    // InternalExprDsl.g:1391:1: entryRuleNullSpecification returns [EObject current=null] : iv_ruleNullSpecification= ruleNullSpecification EOF ;
    public final EObject entryRuleNullSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullSpecification = null;


        try {
            // InternalExprDsl.g:1391:58: (iv_ruleNullSpecification= ruleNullSpecification EOF )
            // InternalExprDsl.g:1392:2: iv_ruleNullSpecification= ruleNullSpecification EOF
            {
             newCompositeNode(grammarAccess.getNullSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullSpecification=ruleNullSpecification();

            state._fsp--;

             current =iv_ruleNullSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullSpecification"


    // $ANTLR start "ruleNullSpecification"
    // InternalExprDsl.g:1398:1: ruleNullSpecification returns [EObject current=null] : ( () (otherlv_1= 'null' | otherlv_2= 'NULL' ) ) ;
    public final EObject ruleNullSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExprDsl.g:1404:2: ( ( () (otherlv_1= 'null' | otherlv_2= 'NULL' ) ) )
            // InternalExprDsl.g:1405:2: ( () (otherlv_1= 'null' | otherlv_2= 'NULL' ) )
            {
            // InternalExprDsl.g:1405:2: ( () (otherlv_1= 'null' | otherlv_2= 'NULL' ) )
            // InternalExprDsl.g:1406:3: () (otherlv_1= 'null' | otherlv_2= 'NULL' )
            {
            // InternalExprDsl.g:1406:3: ()
            // InternalExprDsl.g:1407:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullSpecificationAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            // InternalExprDsl.g:1413:3: (otherlv_1= 'null' | otherlv_2= 'NULL' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==37) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalExprDsl.g:1414:4: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNullSpecificationAccess().getNullKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalExprDsl.g:1419:4: otherlv_2= 'NULL'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getNullSpecificationAccess().getNULLKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullSpecification"


    // $ANTLR start "entryRulePropertyAccess"
    // InternalExprDsl.g:1428:1: entryRulePropertyAccess returns [EObject current=null] : iv_rulePropertyAccess= rulePropertyAccess EOF ;
    public final EObject entryRulePropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAccess = null;


        try {
            // InternalExprDsl.g:1428:55: (iv_rulePropertyAccess= rulePropertyAccess EOF )
            // InternalExprDsl.g:1429:2: iv_rulePropertyAccess= rulePropertyAccess EOF
            {
             newCompositeNode(grammarAccess.getPropertyAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyAccess=rulePropertyAccess();

            state._fsp--;

             current =iv_rulePropertyAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyAccess"


    // $ANTLR start "rulePropertyAccess"
    // InternalExprDsl.g:1435:1: rulePropertyAccess returns [EObject current=null] : ( () ( (lv_identifier_1_0= ruleIdentifier ) ) ) ;
    public final EObject rulePropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:1441:2: ( ( () ( (lv_identifier_1_0= ruleIdentifier ) ) ) )
            // InternalExprDsl.g:1442:2: ( () ( (lv_identifier_1_0= ruleIdentifier ) ) )
            {
            // InternalExprDsl.g:1442:2: ( () ( (lv_identifier_1_0= ruleIdentifier ) ) )
            // InternalExprDsl.g:1443:3: () ( (lv_identifier_1_0= ruleIdentifier ) )
            {
            // InternalExprDsl.g:1443:3: ()
            // InternalExprDsl.g:1444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccessAccess().getUnaryExpressionAction_0(),
            					current);
            			

            }

            // InternalExprDsl.g:1450:3: ( (lv_identifier_1_0= ruleIdentifier ) )
            // InternalExprDsl.g:1451:4: (lv_identifier_1_0= ruleIdentifier )
            {
            // InternalExprDsl.g:1451:4: (lv_identifier_1_0= ruleIdentifier )
            // InternalExprDsl.g:1452:5: lv_identifier_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getPropertyAccessAccess().getIdentifierIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_identifier_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyAccessRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_1_0,
            						"dact.dsl.ExprDsl.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyAccess"


    // $ANTLR start "entryRuleIdentifier"
    // InternalExprDsl.g:1473:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalExprDsl.g:1473:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalExprDsl.g:1474:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalExprDsl.g:1480:1: ruleIdentifier returns [EObject current=null] : ( () ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalExprDsl.g:1486:2: ( ( () ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalExprDsl.g:1487:2: ( () ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalExprDsl.g:1487:2: ( () ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalExprDsl.g:1488:3: () ( (lv_name_1_0= ruleQualifiedName ) )
            {
            // InternalExprDsl.g:1488:3: ()
            // InternalExprDsl.g:1489:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdentifierAccess().getIdentifierAction_0(),
            					current);
            			

            }

            // InternalExprDsl.g:1495:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalExprDsl.g:1496:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalExprDsl.g:1496:4: (lv_name_1_0= ruleQualifiedName )
            // InternalExprDsl.g:1497:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getIdentifierAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentifierRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"dact.dsl.ExprDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalExprDsl.g:1518:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalExprDsl.g:1518:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalExprDsl.g:1519:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalExprDsl.g:1525:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExprDsl.g:1531:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalExprDsl.g:1532:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalExprDsl.g:1532:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalExprDsl.g:1533:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalExprDsl.g:1540:3: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalExprDsl.g:1541:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_14); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\1\2\3\uffff\1\2";
    static final String dfa_3s = "\1\4\1\13\1\uffff\1\6\1\uffff\1\13";
    static final String dfa_4s = "\1\45\1\41\1\uffff\1\6\1\uffff\1\41";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\1\1\22\uffff\1\2\2\uffff\4\2\2\uffff\4\2",
            "\1\4\20\2\4\uffff\1\2\1\3",
            "",
            "\1\5",
            "",
            "\1\4\20\2\4\uffff\1\2\1\3"
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
            return "103:2: ( ( () ( (lv_identifier_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleAssignmentExpression ) ) ) | this_OrExpression_4= ruleOrExpression )";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\2\uffff\1\11\7\uffff";
    static final String dfa_10s = "\2\4\1\14\7\uffff";
    static final String dfa_11s = "\1\45\1\4\1\41\7\uffff";
    static final String dfa_12s = "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\1\1\2";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\1\6\22\uffff\1\1\5\uffff\1\7\2\uffff\2\4\2\5",
            "\1\2",
            "\20\11\4\uffff\1\11\1\10",
            "",
            "",
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "902:2: (this_LiteralReal_0= ruleLiteralReal | this_LiteralInteger_1= ruleLiteralInteger | this_LiteralString_2= ruleLiteralString | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralNull_4= ruleLiteralNull | this_PropertyAccess_5= rulePropertyAccess | (otherlv_6= '(' this_AssignmentExpression_7= ruleAssignmentExpression otherlv_8= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000003CF2000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});

}