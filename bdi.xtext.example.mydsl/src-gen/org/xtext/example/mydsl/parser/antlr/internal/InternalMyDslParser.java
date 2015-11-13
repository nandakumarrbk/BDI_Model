package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_NETWORK", "RULE_INT", "RULE_OCTET", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BDIModel {'", "'}'", "'Agent'", "'{'", "'Imports {'", "'Import {'", "'Events {'", "'Event'", "'Parameters {'", "'Parameter {'", "'='", "'Value {'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'.'", "'Plans {'", "'Plan {'", "'Body {'", "'Trigger {'", "'BeliefSet {'", "'Belief {'", "'Fact {'", "'Achieve {'", "'Query {'", "'Maintain {'", "'Perform {'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_OCTET=9;
    public static final int RULE_NETWORK=7;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BDI";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBDI"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleBDI returns [EObject current=null] : iv_ruleBDI= ruleBDI EOF ;
    public final EObject entryRuleBDI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBDI = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleBDI= ruleBDI EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleBDI= ruleBDI EOF
            {
             newCompositeNode(grammarAccess.getBDIRule()); 
            pushFollow(FOLLOW_ruleBDI_in_entryRuleBDI75);
            iv_ruleBDI=ruleBDI();

            state._fsp--;

             current =iv_ruleBDI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBDI85); 

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
    // $ANTLR end "entryRuleBDI"


    // $ANTLR start "ruleBDI"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleBDI returns [EObject current=null] : (otherlv_0= 'BDIModel {' ( (lv_Agents_1_0= ruleAgent ) )+ otherlv_2= '}' ) ;
    public final EObject ruleBDI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_Agents_1_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'BDIModel {' ( (lv_Agents_1_0= ruleAgent ) )+ otherlv_2= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'BDIModel {' ( (lv_Agents_1_0= ruleAgent ) )+ otherlv_2= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'BDIModel {' ( (lv_Agents_1_0= ruleAgent ) )+ otherlv_2= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'BDIModel {' ( (lv_Agents_1_0= ruleAgent ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleBDI122); 

                	newLeafNode(otherlv_0, grammarAccess.getBDIAccess().getBDIModelKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ( (lv_Agents_1_0= ruleAgent ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_Agents_1_0= ruleAgent )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_Agents_1_0= ruleAgent )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: lv_Agents_1_0= ruleAgent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBDIAccess().getAgentsAgentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAgent_in_ruleBDI143);
            	    lv_Agents_1_0=ruleAgent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBDIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Agents",
            	            		lv_Agents_1_0, 
            	            		"Agent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBDI156); 

                	newLeafNode(otherlv_2, grammarAccess.getBDIAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleBDI"


    // $ANTLR start "entryRuleAgent"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:2: (iv_ruleAgent= ruleAgent EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent192);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent202); 

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
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:123:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Import_3_0= ruleImports ) )* ( (lv_Event_4_0= ruleEvents ) )* ( (lv_Parameters_5_0= ruleParameters ) )* ( (lv_Belief_6_0= ruleBeliefSet ) )* ( (lv_Plan_7_0= rulePlans ) )* otherlv_8= '}' ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_Import_3_0 = null;

        EObject lv_Event_4_0 = null;

        EObject lv_Parameters_5_0 = null;

        EObject lv_Belief_6_0 = null;

        EObject lv_Plan_7_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:28: ( (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Import_3_0= ruleImports ) )* ( (lv_Event_4_0= ruleEvents ) )* ( (lv_Parameters_5_0= ruleParameters ) )* ( (lv_Belief_6_0= ruleBeliefSet ) )* ( (lv_Plan_7_0= rulePlans ) )* otherlv_8= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:127:1: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Import_3_0= ruleImports ) )* ( (lv_Event_4_0= ruleEvents ) )* ( (lv_Parameters_5_0= ruleParameters ) )* ( (lv_Belief_6_0= ruleBeliefSet ) )* ( (lv_Plan_7_0= rulePlans ) )* otherlv_8= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:127:1: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Import_3_0= ruleImports ) )* ( (lv_Event_4_0= ruleEvents ) )* ( (lv_Parameters_5_0= ruleParameters ) )* ( (lv_Belief_6_0= ruleBeliefSet ) )* ( (lv_Plan_7_0= rulePlans ) )* otherlv_8= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:127:3: otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Import_3_0= ruleImports ) )* ( (lv_Event_4_0= ruleEvents ) )* ( (lv_Parameters_5_0= ruleParameters ) )* ( (lv_Belief_6_0= ruleBeliefSet ) )* ( (lv_Plan_7_0= rulePlans ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAgent239); 

                	newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:131:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAgent256); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAgentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAgent273); 

                	newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:1: ( (lv_Import_3_0= ruleImports ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:154:1: (lv_Import_3_0= ruleImports )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:154:1: (lv_Import_3_0= ruleImports )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:155:3: lv_Import_3_0= ruleImports
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getImportImportsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImports_in_ruleAgent294);
            	    lv_Import_3_0=ruleImports();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Import",
            	            		lv_Import_3_0, 
            	            		"Imports");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:3: ( (lv_Event_4_0= ruleEvents ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:1: (lv_Event_4_0= ruleEvents )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:1: (lv_Event_4_0= ruleEvents )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:3: lv_Event_4_0= ruleEvents
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getEventEventsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvents_in_ruleAgent316);
            	    lv_Event_4_0=ruleEvents();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Event",
            	            		lv_Event_4_0, 
            	            		"Events");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:189:3: ( (lv_Parameters_5_0= ruleParameters ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:190:1: (lv_Parameters_5_0= ruleParameters )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:190:1: (lv_Parameters_5_0= ruleParameters )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:3: lv_Parameters_5_0= ruleParameters
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getParametersParametersParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameters_in_ruleAgent338);
            	    lv_Parameters_5_0=ruleParameters();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Parameters",
            	            		lv_Parameters_5_0, 
            	            		"Parameters");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:207:3: ( (lv_Belief_6_0= ruleBeliefSet ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: (lv_Belief_6_0= ruleBeliefSet )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: (lv_Belief_6_0= ruleBeliefSet )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:3: lv_Belief_6_0= ruleBeliefSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefSetParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBeliefSet_in_ruleAgent360);
            	    lv_Belief_6_0=ruleBeliefSet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Belief",
            	            		lv_Belief_6_0, 
            	            		"BeliefSet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:3: ( (lv_Plan_7_0= rulePlans ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==41) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:226:1: (lv_Plan_7_0= rulePlans )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:226:1: (lv_Plan_7_0= rulePlans )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:227:3: lv_Plan_7_0= rulePlans
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getPlanPlansParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlans_in_ruleAgent382);
            	    lv_Plan_7_0=rulePlans();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Plan",
            	            		lv_Plan_7_0, 
            	            		"Plans");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleAgent395); 

                	newLeafNode(otherlv_8, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleImports"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:256:2: (iv_ruleImports= ruleImports EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports431);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports441); 

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
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:1: ruleImports returns [EObject current=null] : (otherlv_0= 'Imports {' ( (lv_Imports_1_0= ruleImport ) )+ otherlv_2= '}' ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_Imports_1_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:28: ( (otherlv_0= 'Imports {' ( (lv_Imports_1_0= ruleImport ) )+ otherlv_2= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:1: (otherlv_0= 'Imports {' ( (lv_Imports_1_0= ruleImport ) )+ otherlv_2= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:1: (otherlv_0= 'Imports {' ( (lv_Imports_1_0= ruleImport ) )+ otherlv_2= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:3: otherlv_0= 'Imports {' ( (lv_Imports_1_0= ruleImport ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImports478); 

                	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportsKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:272:1: ( (lv_Imports_1_0= ruleImport ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (lv_Imports_1_0= ruleImport )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (lv_Imports_1_0= ruleImport )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:3: lv_Imports_1_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleImports499);
            	    lv_Imports_1_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImportsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Imports",
            	            		lv_Imports_1_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImports512); 

                	newLeafNode(otherlv_2, grammarAccess.getImportsAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleImport"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:1: entryRuleImport returns [String current=null] : iv_ruleImport= ruleImport EOF ;
    public final String entryRuleImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:2: (iv_ruleImport= ruleImport EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport549);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport560); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: ruleImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Import {' this_Filename_1= ruleFilename kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Filename_1 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:28: ( (kw= 'Import {' this_Filename_1= ruleFilename kw= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:1: (kw= 'Import {' this_Filename_1= ruleFilename kw= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:1: (kw= 'Import {' this_Filename_1= ruleFilename kw= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:2: kw= 'Import {' this_Filename_1= ruleFilename kw= '}'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleImport598); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getImportAccess().getFilenameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFilename_in_ruleImport620);
            this_Filename_1=ruleFilename();

            state._fsp--;


            		current.merge(this_Filename_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleImport638); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getImportAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFilename"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:1: entryRuleFilename returns [String current=null] : iv_ruleFilename= ruleFilename EOF ;
    public final String entryRuleFilename() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilename = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:2: (iv_ruleFilename= ruleFilename EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:348:2: iv_ruleFilename= ruleFilename EOF
            {
             newCompositeNode(grammarAccess.getFilenameRule()); 
            pushFollow(FOLLOW_ruleFilename_in_entryRuleFilename679);
            iv_ruleFilename=ruleFilename();

            state._fsp--;

             current =iv_ruleFilename.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilename690); 

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
    // $ANTLR end "entryRuleFilename"


    // $ANTLR start "ruleFilename"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:355:1: ruleFilename returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleFilename() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:358:28: (this_STRING_0= RULE_STRING )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFilename729); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getFilenameAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleFilename"


    // $ANTLR start "entryRuleEvents"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:1: entryRuleEvents returns [EObject current=null] : iv_ruleEvents= ruleEvents EOF ;
    public final EObject entryRuleEvents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvents = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:2: (iv_ruleEvents= ruleEvents EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:376:2: iv_ruleEvents= ruleEvents EOF
            {
             newCompositeNode(grammarAccess.getEventsRule()); 
            pushFollow(FOLLOW_ruleEvents_in_entryRuleEvents773);
            iv_ruleEvents=ruleEvents();

            state._fsp--;

             current =iv_ruleEvents; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvents783); 

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
    // $ANTLR end "entryRuleEvents"


    // $ANTLR start "ruleEvents"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:1: ruleEvents returns [EObject current=null] : (otherlv_0= 'Events {' ( (lv_Events_1_0= ruleEvent ) )+ otherlv_2= '}' ) ;
    public final EObject ruleEvents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_Events_1_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:28: ( (otherlv_0= 'Events {' ( (lv_Events_1_0= ruleEvent ) )+ otherlv_2= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:1: (otherlv_0= 'Events {' ( (lv_Events_1_0= ruleEvent ) )+ otherlv_2= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:1: (otherlv_0= 'Events {' ( (lv_Events_1_0= ruleEvent ) )+ otherlv_2= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:3: otherlv_0= 'Events {' ( (lv_Events_1_0= ruleEvent ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleEvents820); 

                	newLeafNode(otherlv_0, grammarAccess.getEventsAccess().getEventsKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:1: ( (lv_Events_1_0= ruleEvent ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:1: (lv_Events_1_0= ruleEvent )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:1: (lv_Events_1_0= ruleEvent )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:393:3: lv_Events_1_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventsAccess().getEventsEventParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleEvents841);
            	    lv_Events_1_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Events",
            	            		lv_Events_1_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEvents854); 

                	newLeafNode(otherlv_2, grammarAccess.getEventsAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleEvents"


    // $ANTLR start "entryRuleEvent"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:2: (iv_ruleEvent= ruleEvent EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent890);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent900); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_EventType_3_0= RULE_STRING ) ) ( (lv_Parameter_4_0= ruleParameter ) )* otherlv_5= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_EventType_3_0=null;
        Token otherlv_5=null;
        EObject lv_Parameter_4_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:28: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_EventType_3_0= RULE_STRING ) ) ( (lv_Parameter_4_0= ruleParameter ) )* otherlv_5= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_EventType_3_0= RULE_STRING ) ) ( (lv_Parameter_4_0= ruleParameter ) )* otherlv_5= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_EventType_3_0= RULE_STRING ) ) ( (lv_Parameter_4_0= ruleParameter ) )* otherlv_5= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_EventType_3_0= RULE_STRING ) ) ( (lv_Parameter_4_0= ruleParameter ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEvent937); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:440:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent954); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEvent971); 

                	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: ( (lv_EventType_3_0= RULE_STRING ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:1: (lv_EventType_3_0= RULE_STRING )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:1: (lv_EventType_3_0= RULE_STRING )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:3: lv_EventType_3_0= RULE_STRING
            {
            lv_EventType_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent988); 

            			newLeafNode(lv_EventType_3_0, grammarAccess.getEventAccess().getEventTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"EventType",
                    		lv_EventType_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:2: ( (lv_Parameter_4_0= ruleParameter ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: (lv_Parameter_4_0= ruleParameter )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: (lv_Parameter_4_0= ruleParameter )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:3: lv_Parameter_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getParameterParameterParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleEvent1014);
            	    lv_Parameter_4_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Parameter",
            	            		lv_Parameter_4_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEvent1027); 

                	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleParameters"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:2: (iv_ruleParameters= ruleParameters EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters1063);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters1073); 

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: ruleParameters returns [EObject current=null] : (otherlv_0= 'Parameters {' ( (lv_Parameters_1_0= ruleParameter ) )+ otherlv_2= '}' ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_Parameters_1_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:28: ( (otherlv_0= 'Parameters {' ( (lv_Parameters_1_0= ruleParameter ) )+ otherlv_2= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:1: (otherlv_0= 'Parameters {' ( (lv_Parameters_1_0= ruleParameter ) )+ otherlv_2= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:1: (otherlv_0= 'Parameters {' ( (lv_Parameters_1_0= ruleParameter ) )+ otherlv_2= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:3: otherlv_0= 'Parameters {' ( (lv_Parameters_1_0= ruleParameter ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleParameters1110); 

                	newLeafNode(otherlv_0, grammarAccess.getParametersAccess().getParametersKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:1: ( (lv_Parameters_1_0= ruleParameter ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:1: (lv_Parameters_1_0= ruleParameter )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:1: (lv_Parameters_1_0= ruleParameter )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:3: lv_Parameters_1_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameters1131);
            	    lv_Parameters_1_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Parameters",
            	            		lv_Parameters_1_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleParameters1144); 

                	newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:555:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:2: (iv_ruleParameter= ruleParameter EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1180);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1190); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter {' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleValue otherlv_4= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:567:28: ( (otherlv_0= 'Parameter {' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleValue otherlv_4= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:568:1: (otherlv_0= 'Parameter {' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleValue otherlv_4= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:568:1: (otherlv_0= 'Parameter {' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleValue otherlv_4= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:568:3: otherlv_0= 'Parameter {' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleValue otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleParameter1227); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:572:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1244); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleParameter1261); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getParameterAccess().getValueParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleParameter1277);
            ruleValue();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleParameter1288); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleValue"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:614:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:615:2: (iv_ruleValue= ruleValue EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1325);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1336); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Value {' this_Code_1= ruleCode kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Code_1 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:626:28: ( (kw= 'Value {' this_Code_1= ruleCode kw= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:627:1: (kw= 'Value {' this_Code_1= ruleCode kw= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:627:1: (kw= 'Value {' this_Code_1= ruleCode kw= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:628:2: kw= 'Value {' this_Code_1= ruleCode kw= '}'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleValue1374); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValueAccess().getValueKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getValueAccess().getCodeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCode_in_ruleValue1396);
            this_Code_1=ruleCode();

            state._fsp--;


            		current.merge(this_Code_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleValue1414); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleCode"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:1: entryRuleCode returns [String current=null] : iv_ruleCode= ruleCode EOF ;
    public final String entryRuleCode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCode = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:2: (iv_ruleCode= ruleCode EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode1455);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode1466); 

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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:667:1: ruleCode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_BOOLEAN_2= RULE_BOOLEAN | this_Number_3= ruleNumber | this_NETWORK_4= RULE_NETWORK ) ;
    public final AntlrDatatypeRuleToken ruleCode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_BOOLEAN_2=null;
        Token this_NETWORK_4=null;
        AntlrDatatypeRuleToken this_Number_3 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_BOOLEAN_2= RULE_BOOLEAN | this_Number_3= ruleNumber | this_NETWORK_4= RULE_NETWORK ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_BOOLEAN_2= RULE_BOOLEAN | this_Number_3= ruleNumber | this_NETWORK_4= RULE_NETWORK )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_BOOLEAN_2= RULE_BOOLEAN | this_Number_3= ruleNumber | this_NETWORK_4= RULE_NETWORK )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt11=3;
                }
                break;
            case RULE_INT:
                {
                alt11=4;
                }
                break;
            case RULE_NETWORK:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCode1506); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getCodeAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:679:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCode1532); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getCodeAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleCode1558); 

                    		current.merge(this_BOOLEAN_2);
                        
                     
                        newLeafNode(this_BOOLEAN_2, grammarAccess.getCodeAccess().getBOOLEANTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:696:5: this_Number_3= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getCodeAccess().getNumberParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleCode1591);
                    this_Number_3=ruleNumber();

                    state._fsp--;


                    		current.merge(this_Number_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:707:10: this_NETWORK_4= RULE_NETWORK
                    {
                    this_NETWORK_4=(Token)match(input,RULE_NETWORK,FOLLOW_RULE_NETWORK_in_ruleCode1617); 

                    		current.merge(this_NETWORK_4);
                        
                     
                        newLeafNode(this_NETWORK_4, grammarAccess.getCodeAccess().getNETWORKTerminalRuleCall_4()); 
                        

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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleOperator"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:723:2: (iv_ruleOperator= ruleOperator EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:724:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1662);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1672); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:1: ruleOperator returns [EObject current=null] : ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_equalTo_0_0=null;
        Token lv_largerThan_1_0=null;
        Token lv_smallerThan_2_0=null;
        Token lv_largerOrEqualTo_3_0=null;
        Token lv_smallerOrEqualTo_4_0=null;
        Token lv_notEqualTo_5_0=null;

         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:28: ( ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 31:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:2: ( (lv_equalTo_0_0= '==' ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:2: ( (lv_equalTo_0_0= '==' ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: (lv_equalTo_0_0= '==' )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: (lv_equalTo_0_0= '==' )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:3: lv_equalTo_0_0= '=='
                    {
                    lv_equalTo_0_0=(Token)match(input,26,FOLLOW_26_in_ruleOperator1715); 

                            newLeafNode(lv_equalTo_0_0, grammarAccess.getOperatorAccess().getEqualToEqualsSignEqualsSignKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "equalTo", true, "==");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:6: ( (lv_largerThan_1_0= '>' ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:6: ( (lv_largerThan_1_0= '>' ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:752:1: (lv_largerThan_1_0= '>' )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:752:1: (lv_largerThan_1_0= '>' )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:3: lv_largerThan_1_0= '>'
                    {
                    lv_largerThan_1_0=(Token)match(input,27,FOLLOW_27_in_ruleOperator1752); 

                            newLeafNode(lv_largerThan_1_0, grammarAccess.getOperatorAccess().getLargerThanGreaterThanSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "largerThan", true, ">");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:767:6: ( (lv_smallerThan_2_0= '<' ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:767:6: ( (lv_smallerThan_2_0= '<' ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:768:1: (lv_smallerThan_2_0= '<' )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:768:1: (lv_smallerThan_2_0= '<' )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:769:3: lv_smallerThan_2_0= '<'
                    {
                    lv_smallerThan_2_0=(Token)match(input,28,FOLLOW_28_in_ruleOperator1789); 

                            newLeafNode(lv_smallerThan_2_0, grammarAccess.getOperatorAccess().getSmallerThanLessThanSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "smallerThan", true, "<");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:1: (lv_largerOrEqualTo_3_0= '>=' )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:1: (lv_largerOrEqualTo_3_0= '>=' )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:785:3: lv_largerOrEqualTo_3_0= '>='
                    {
                    lv_largerOrEqualTo_3_0=(Token)match(input,29,FOLLOW_29_in_ruleOperator1826); 

                            newLeafNode(lv_largerOrEqualTo_3_0, grammarAccess.getOperatorAccess().getLargerOrEqualToGreaterThanSignEqualsSignKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "largerOrEqualTo", true, ">=");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:801:3: lv_smallerOrEqualTo_4_0= '<='
                    {
                    lv_smallerOrEqualTo_4_0=(Token)match(input,30,FOLLOW_30_in_ruleOperator1863); 

                            newLeafNode(lv_smallerOrEqualTo_4_0, grammarAccess.getOperatorAccess().getSmallerOrEqualToLessThanSignEqualsSignKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "smallerOrEqualTo", true, "<=");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:1: (lv_notEqualTo_5_0= '!=' )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:1: (lv_notEqualTo_5_0= '!=' )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:3: lv_notEqualTo_5_0= '!='
                    {
                    lv_notEqualTo_5_0=(Token)match(input,31,FOLLOW_31_in_ruleOperator1900); 

                            newLeafNode(lv_notEqualTo_5_0, grammarAccess.getOperatorAccess().getNotEqualToExclamationMarkEqualsSignKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "notEqualTo", true, "!=");
                    	    

                    }


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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleCondition"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:2: (iv_ruleCondition= ruleCondition EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1949);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1959); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:847:1: ruleCondition returns [EObject current=null] : ( ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_and_3_0=null;
        Token lv_or_4_0=null;
        AntlrDatatypeRuleToken lv_subjective_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_objective_2_0 = null;

        EObject lv_compareCondition_5_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:28: ( ( ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )? ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:1: ( ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )? )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:1: ( ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )? )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:2: ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )?
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:2: ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:3: ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:3: ( (lv_subjective_0_0= ruleQualifiedName ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (lv_subjective_0_0= ruleQualifiedName )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (lv_subjective_0_0= ruleQualifiedName )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:853:3: lv_subjective_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getSubjectiveQualifiedNameParserRuleCall_0_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCondition2006);
            lv_subjective_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"subjective",
                    		lv_subjective_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:1: (lv_operator_1_0= ruleOperator )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:1: (lv_operator_1_0= ruleOperator )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:3: lv_operator_1_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleCondition2027);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:887:2: ( (lv_objective_2_0= ruleExpression ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:1: (lv_objective_2_0= ruleExpression )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:1: (lv_objective_2_0= ruleExpression )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:3: lv_objective_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition2048);
            lv_objective_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"objective",
                    		lv_objective_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:3: ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=32 && LA14_0<=33)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:4: ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:4: ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==32) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==33) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:5: ( (lv_and_3_0= 'and' ) )
                            {
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:5: ( (lv_and_3_0= 'and' ) )
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:906:1: (lv_and_3_0= 'and' )
                            {
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:906:1: (lv_and_3_0= 'and' )
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:907:3: lv_and_3_0= 'and'
                            {
                            lv_and_3_0=(Token)match(input,32,FOLLOW_32_in_ruleCondition2069); 

                                    newLeafNode(lv_and_3_0, grammarAccess.getConditionAccess().getAndAndKeyword_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConditionRule());
                            	        }
                                   		setWithLastConsumed(current, "and", true, "and");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:6: ( (lv_or_4_0= 'or' ) )
                            {
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:6: ( (lv_or_4_0= 'or' ) )
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:1: (lv_or_4_0= 'or' )
                            {
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:1: (lv_or_4_0= 'or' )
                            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:3: lv_or_4_0= 'or'
                            {
                            lv_or_4_0=(Token)match(input,33,FOLLOW_33_in_ruleCondition2106); 

                                    newLeafNode(lv_or_4_0, grammarAccess.getConditionAccess().getOrOrKeyword_1_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConditionRule());
                            	        }
                                   		setWithLastConsumed(current, "or", true, "or");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:3: ( (lv_compareCondition_5_0= ruleCondition ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:937:1: (lv_compareCondition_5_0= ruleCondition )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:937:1: (lv_compareCondition_5_0= ruleCondition )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:938:3: lv_compareCondition_5_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getCompareConditionConditionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleCondition2141);
                    lv_compareCondition_5_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"compareCondition",
                            		lv_compareCondition_5_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:2: (iv_ruleExpression= ruleExpression EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2179);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2189); 

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
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:1: ruleExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:974:28: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:975:1: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:975:1: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:976:5: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleExpression2236);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=34 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==34) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==35) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:3: ( () otherlv_2= '+' )
            	            {
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:3: ( () otherlv_2= '+' )
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:4: () otherlv_2= '+'
            	            {
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:4: ()
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:985:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleExpression2259); 

            	                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:995:6: ( () otherlv_4= '-' )
            	            {
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:995:6: ( () otherlv_4= '-' )
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:995:7: () otherlv_4= '-'
            	            {
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:995:7: ()
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleExpression2288); 

            	                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1005:3: ( (lv_right_5_0= ruleTerm ) )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:1: (lv_right_5_0= ruleTerm )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:1: (lv_right_5_0= ruleTerm )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:3: lv_right_5_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleExpression2311);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerm"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1031:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1032:2: (iv_ruleTerm= ruleTerm EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1033:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2349);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2359); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1043:28: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:1: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:1: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:5: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFactor_in_ruleTerm2406);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=36 && LA18_0<=37)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==36) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==37) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:3: ( () otherlv_2= '*' )
            	            {
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:3: ( () otherlv_2= '*' )
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:4: () otherlv_2= '*'
            	            {
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:4: ()
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1054:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleTerm2429); 

            	                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:6: ( () otherlv_4= '/' )
            	            {
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:6: ( () otherlv_4= '/' )
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:7: () otherlv_4= '/'
            	            {
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:7: ()
            	            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleTerm2458); 

            	                	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:3: ( (lv_right_5_0= ruleFactor ) )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:1: (lv_right_5_0= ruleFactor )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:1: (lv_right_5_0= ruleFactor )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:3: lv_right_5_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleTerm2481);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1100:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1101:2: (iv_ruleFactor= ruleFactor EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor2519);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor2529); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:1: ruleFactor returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleQualifiedName ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_boolean_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        AntlrDatatypeRuleToken lv_variable_1_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1112:28: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleQualifiedName ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleQualifiedName ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleQualifiedName ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt19=4;
                }
                break;
            case 38:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:2: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:2: ( (lv_number_0_0= ruleNumber ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: (lv_number_0_0= ruleNumber )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: (lv_number_0_0= ruleNumber )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:3: lv_number_0_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleFactor2575);
                    lv_number_0_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:6: ( (lv_variable_1_0= ruleQualifiedName ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:6: ( (lv_variable_1_0= ruleQualifiedName ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:1: (lv_variable_1_0= ruleQualifiedName )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:1: (lv_variable_1_0= ruleQualifiedName )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:3: lv_variable_1_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getVariableQualifiedNameParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFactor2602);
                    lv_variable_1_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_1_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:6: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:6: ( (lv_string_2_0= RULE_STRING ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1152:1: (lv_string_2_0= RULE_STRING )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1152:1: (lv_string_2_0= RULE_STRING )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFactor2625); 

                    			newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:6: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:6: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: (lv_boolean_3_0= RULE_BOOLEAN )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: (lv_boolean_3_0= RULE_BOOLEAN )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1172:3: lv_boolean_3_0= RULE_BOOLEAN
                    {
                    lv_boolean_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleFactor2653); 

                    			newLeafNode(lv_boolean_3_0, grammarAccess.getFactorAccess().getBooleanBOOLEANTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"boolean",
                            		lv_boolean_3_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:6: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:6: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:8: otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleFactor2677); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_4_0());
                        
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1193:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1194:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1194:1: (lv_expression_5_0= ruleExpression )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1195:3: lv_expression_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFactor2698);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleFactor2710); 

                        	newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getRightParenthesisKeyword_4_2());
                        

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleNumber"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1223:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1224:2: (iv_ruleNumber= ruleNumber EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1225:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2748);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2759); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1232:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:28: (this_INT_0= RULE_INT )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2798); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleQualifiedName"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1252:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1253:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2843);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2854); 

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
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1263:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2894); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1271:1: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1272:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName2913); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2928); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1284:3: (kw= '.' this_INT_4= RULE_INT )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==40) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:2: kw= '.' this_INT_4= RULE_INT
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName2949); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualifiedName2964); 

            	    		current.merge(this_INT_4);
            	        
            	     
            	        newLeafNode(this_INT_4, grammarAccess.getQualifiedNameAccess().getINTTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
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


    // $ANTLR start "entryRulePlans"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:1: entryRulePlans returns [EObject current=null] : iv_rulePlans= rulePlans EOF ;
    public final EObject entryRulePlans() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlans = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:2: (iv_rulePlans= rulePlans EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:2: iv_rulePlans= rulePlans EOF
            {
             newCompositeNode(grammarAccess.getPlansRule()); 
            pushFollow(FOLLOW_rulePlans_in_entryRulePlans3011);
            iv_rulePlans=rulePlans();

            state._fsp--;

             current =iv_rulePlans; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlans3021); 

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
    // $ANTLR end "entryRulePlans"


    // $ANTLR start "rulePlans"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:1: rulePlans returns [EObject current=null] : (otherlv_0= 'Plans {' ( (lv_Plans_1_0= rulePlan ) )+ otherlv_2= '}' ) ;
    public final EObject rulePlans() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_Plans_1_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:28: ( (otherlv_0= 'Plans {' ( (lv_Plans_1_0= rulePlan ) )+ otherlv_2= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:1: (otherlv_0= 'Plans {' ( (lv_Plans_1_0= rulePlan ) )+ otherlv_2= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:1: (otherlv_0= 'Plans {' ( (lv_Plans_1_0= rulePlan ) )+ otherlv_2= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:3: otherlv_0= 'Plans {' ( (lv_Plans_1_0= rulePlan ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_rulePlans3058); 

                	newLeafNode(otherlv_0, grammarAccess.getPlansAccess().getPlansKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1322:1: ( (lv_Plans_1_0= rulePlan ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: (lv_Plans_1_0= rulePlan )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: (lv_Plans_1_0= rulePlan )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:3: lv_Plans_1_0= rulePlan
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlan_in_rulePlans3079);
            	    lv_Plans_1_0=rulePlan();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlansRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Plans",
            	            		lv_Plans_1_0, 
            	            		"Plan");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePlans3092); 

                	newLeafNode(otherlv_2, grammarAccess.getPlansAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "rulePlans"


    // $ANTLR start "entryRulePlan"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1352:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1353:2: (iv_rulePlan= rulePlan EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1354:2: iv_rulePlan= rulePlan EOF
            {
             newCompositeNode(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan3128);
            iv_rulePlan=rulePlan();

            state._fsp--;

             current =iv_rulePlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan3138); 

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
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1361:1: rulePlan returns [EObject current=null] : (otherlv_0= 'Plan {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Body_2_0= ruleBody ) ) ( (lv_Trigger_3_0= ruleTrigger ) ) otherlv_4= '}' ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Body_2_0 = null;

        EObject lv_Trigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:28: ( (otherlv_0= 'Plan {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Body_2_0= ruleBody ) ) ( (lv_Trigger_3_0= ruleTrigger ) ) otherlv_4= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:1: (otherlv_0= 'Plan {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Body_2_0= ruleBody ) ) ( (lv_Trigger_3_0= ruleTrigger ) ) otherlv_4= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:1: (otherlv_0= 'Plan {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Body_2_0= ruleBody ) ) ( (lv_Trigger_3_0= ruleTrigger ) ) otherlv_4= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:3: otherlv_0= 'Plan {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Body_2_0= ruleBody ) ) ( (lv_Trigger_3_0= ruleTrigger ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_rulePlan3175); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanAccess().getPlanKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1369:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1371:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlan3192); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1387:2: ( (lv_Body_2_0= ruleBody ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:1: (lv_Body_2_0= ruleBody )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:1: (lv_Body_2_0= ruleBody )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1389:3: lv_Body_2_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getPlanAccess().getBodyBodyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_rulePlan3218);
            lv_Body_2_0=ruleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlanRule());
            	        }
                   		set(
                   			current, 
                   			"Body",
                    		lv_Body_2_0, 
                    		"Body");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:2: ( (lv_Trigger_3_0= ruleTrigger ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:1: (lv_Trigger_3_0= ruleTrigger )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:1: (lv_Trigger_3_0= ruleTrigger )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:3: lv_Trigger_3_0= ruleTrigger
            {
             
            	        newCompositeNode(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTrigger_in_rulePlan3239);
            lv_Trigger_3_0=ruleTrigger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlanRule());
            	        }
                   		set(
                   			current, 
                   			"Trigger",
                    		lv_Trigger_3_0, 
                    		"Trigger");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePlan3251); 

                	newLeafNode(otherlv_4, grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleBody"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1435:1: entryRuleBody returns [String current=null] : iv_ruleBody= ruleBody EOF ;
    public final String entryRuleBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBody = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:2: (iv_ruleBody= ruleBody EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody3288);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody3299); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:1: ruleBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Body {' this_STRING_1= RULE_STRING kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:28: ( (kw= 'Body {' this_STRING_1= RULE_STRING kw= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:1: (kw= 'Body {' this_STRING_1= RULE_STRING kw= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:1: (kw= 'Body {' this_STRING_1= RULE_STRING kw= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1449:2: kw= 'Body {' this_STRING_1= RULE_STRING kw= '}'
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleBody3337); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBodyAccess().getBodyKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBody3352); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getBodyAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleBody3370); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleTrigger"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1476:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger3410);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger3420); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1484:1: ruleTrigger returns [EObject current=null] : ( (otherlv_0= 'Trigger {' ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1487:28: ( ( (otherlv_0= 'Trigger {' ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' ) ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:1: ( (otherlv_0= 'Trigger {' ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' ) )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:1: ( (otherlv_0= 'Trigger {' ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:2: (otherlv_0= 'Trigger {' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:2: (otherlv_0= 'Trigger {' ( (otherlv_1= RULE_ID ) ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:4: otherlv_0= 'Trigger {' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleTrigger3458); 

                        	newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0_0());
                        
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:1: ( (otherlv_1= RULE_ID ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:1: (otherlv_1= RULE_ID )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:1: (otherlv_1= RULE_ID )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriggerRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrigger3478); 

                    		newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getEventEventCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:6: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:6: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:7: ( (otherlv_2= RULE_ID ) ) otherlv_3= '}'
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:7: ( (otherlv_2= RULE_ID ) )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1507:1: (otherlv_2= RULE_ID )
                    {
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1507:1: (otherlv_2= RULE_ID )
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1508:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriggerRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrigger3506); 

                    		newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getGoalGoalCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTrigger3518); 

                        	newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_1_1());
                        

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleBeliefSet"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:1: entryRuleBeliefSet returns [EObject current=null] : iv_ruleBeliefSet= ruleBeliefSet EOF ;
    public final EObject entryRuleBeliefSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeliefSet = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:2: (iv_ruleBeliefSet= ruleBeliefSet EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1533:2: iv_ruleBeliefSet= ruleBeliefSet EOF
            {
             newCompositeNode(grammarAccess.getBeliefSetRule()); 
            pushFollow(FOLLOW_ruleBeliefSet_in_entryRuleBeliefSet3555);
            iv_ruleBeliefSet=ruleBeliefSet();

            state._fsp--;

             current =iv_ruleBeliefSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeliefSet3565); 

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
    // $ANTLR end "entryRuleBeliefSet"


    // $ANTLR start "ruleBeliefSet"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:1: ruleBeliefSet returns [EObject current=null] : (otherlv_0= 'BeliefSet {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_BeliefSet_2_0= ruleBelief ) )+ otherlv_3= '}' ) ;
    public final EObject ruleBeliefSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_BeliefSet_2_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1543:28: ( (otherlv_0= 'BeliefSet {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_BeliefSet_2_0= ruleBelief ) )+ otherlv_3= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:1: (otherlv_0= 'BeliefSet {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_BeliefSet_2_0= ruleBelief ) )+ otherlv_3= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:1: (otherlv_0= 'BeliefSet {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_BeliefSet_2_0= ruleBelief ) )+ otherlv_3= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:3: otherlv_0= 'BeliefSet {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_BeliefSet_2_0= ruleBelief ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleBeliefSet3602); 

                	newLeafNode(otherlv_0, grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1548:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1550:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBeliefSet3619); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBeliefSetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBeliefSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:2: ( (lv_BeliefSet_2_0= ruleBelief ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1567:1: (lv_BeliefSet_2_0= ruleBelief )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1567:1: (lv_BeliefSet_2_0= ruleBelief )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1568:3: lv_BeliefSet_2_0= ruleBelief
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBeliefSetAccess().getBeliefSetBeliefParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBelief_in_ruleBeliefSet3645);
            	    lv_BeliefSet_2_0=ruleBelief();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBeliefSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"BeliefSet",
            	            		lv_BeliefSet_2_0, 
            	            		"Belief");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleBeliefSet3658); 

                	newLeafNode(otherlv_3, grammarAccess.getBeliefSetAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBeliefSet"


    // $ANTLR start "entryRuleBelief"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1597:2: (iv_ruleBelief= ruleBelief EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:2: iv_ruleBelief= ruleBelief EOF
            {
             newCompositeNode(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief3694);
            iv_ruleBelief=ruleBelief();

            state._fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief3704); 

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
    // $ANTLR end "entryRuleBelief"


    // $ANTLR start "ruleBelief"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:1: ruleBelief returns [EObject current=null] : (otherlv_0= 'Belief {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Fact_2_0= ruleFact ) )* otherlv_3= '}' ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_Fact_2_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1608:28: ( (otherlv_0= 'Belief {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Fact_2_0= ruleFact ) )* otherlv_3= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:1: (otherlv_0= 'Belief {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Fact_2_0= ruleFact ) )* otherlv_3= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:1: (otherlv_0= 'Belief {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Fact_2_0= ruleFact ) )* otherlv_3= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:3: otherlv_0= 'Belief {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Fact_2_0= ruleFact ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleBelief3741); 

                	newLeafNode(otherlv_0, grammarAccess.getBeliefAccess().getBeliefKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief3758); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBeliefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:2: ( (lv_Fact_2_0= ruleFact ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:1: (lv_Fact_2_0= ruleFact )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:1: (lv_Fact_2_0= ruleFact )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:3: lv_Fact_2_0= ruleFact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBeliefAccess().getFactFactParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFact_in_ruleBelief3784);
            	    lv_Fact_2_0=ruleFact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBeliefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Fact",
            	            		lv_Fact_2_0, 
            	            		"Fact");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleBelief3797); 

                	newLeafNode(otherlv_3, grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBelief"


    // $ANTLR start "entryRuleFact"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1662:2: (iv_ruleFact= ruleFact EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1663:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact3833);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact3843); 

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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:1: ruleFact returns [EObject current=null] : (otherlv_0= 'Fact {' ( (lv_Statements_1_0= ruleStatements ) ) this_STRING_2= RULE_STRING otherlv_3= '}' ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_2=null;
        Token otherlv_3=null;
        EObject lv_Statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1673:28: ( (otherlv_0= 'Fact {' ( (lv_Statements_1_0= ruleStatements ) ) this_STRING_2= RULE_STRING otherlv_3= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:1: (otherlv_0= 'Fact {' ( (lv_Statements_1_0= ruleStatements ) ) this_STRING_2= RULE_STRING otherlv_3= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:1: (otherlv_0= 'Fact {' ( (lv_Statements_1_0= ruleStatements ) ) this_STRING_2= RULE_STRING otherlv_3= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:3: otherlv_0= 'Fact {' ( (lv_Statements_1_0= ruleStatements ) ) this_STRING_2= RULE_STRING otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleFact3880); 

                	newLeafNode(otherlv_0, grammarAccess.getFactAccess().getFactKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1678:1: ( (lv_Statements_1_0= ruleStatements ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1679:1: (lv_Statements_1_0= ruleStatements )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1679:1: (lv_Statements_1_0= ruleStatements )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1680:3: lv_Statements_1_0= ruleStatements
            {
             
            	        newCompositeNode(grammarAccess.getFactAccess().getStatementsStatementsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatements_in_ruleFact3901);
            lv_Statements_1_0=ruleStatements();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactRule());
            	        }
                   		set(
                   			current, 
                   			"Statements",
                    		lv_Statements_1_0, 
                    		"Statements");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFact3912); 
             
                newLeafNode(this_STRING_2, grammarAccess.getFactAccess().getSTRINGTerminalRuleCall_2()); 
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFact3923); 

                	newLeafNode(otherlv_3, grammarAccess.getFactAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleStatements"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1712:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1713:2: (iv_ruleStatements= ruleStatements EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1714:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_ruleStatements_in_entryRuleStatements3959);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatements3969); 

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
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:1: ruleStatements returns [EObject current=null] : ( (lv_Statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_Statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1724:28: ( ( (lv_Statements_0_0= ruleStatement ) )+ )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:1: ( (lv_Statements_0_0= ruleStatement ) )+
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:1: ( (lv_Statements_0_0= ruleStatement ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==EOF||(LA26_1>=RULE_ID && LA26_1<=RULE_INT)) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==RULE_ID||(LA26_0>=RULE_BOOLEAN && LA26_0<=RULE_INT)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1726:1: (lv_Statements_0_0= ruleStatement )
            	    {
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1726:1: (lv_Statements_0_0= ruleStatement )
            	    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1727:3: lv_Statements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatements4014);
            	    lv_Statements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Statements",
            	            		lv_Statements_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


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
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleStatement"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1752:2: (iv_ruleStatement= ruleStatement EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1753:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement4051);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement4062); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1760:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Code_0= ruleCode ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Code_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1763:28: (this_Code_0= ruleCode )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1765:5: this_Code_0= ruleCode
            {
             
                    newCompositeNode(grammarAccess.getStatementAccess().getCodeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCode_in_ruleStatement4108);
            this_Code_0=ruleCode();

            state._fsp--;


            		current.merge(this_Code_0);
                
             
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleGoal"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1785:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:2: (iv_ruleGoal= ruleGoal EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal4154);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal4164); 

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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1794:1: ruleGoal returns [EObject current=null] : (this_Achieve_0= ruleAchieve | this_Query_1= ruleQuery | this_Maintain_2= ruleMaintain | this_Perform_3= rulePerform ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        EObject this_Achieve_0 = null;

        EObject this_Query_1 = null;

        EObject this_Maintain_2 = null;

        EObject this_Perform_3 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1797:28: ( (this_Achieve_0= ruleAchieve | this_Query_1= ruleQuery | this_Maintain_2= ruleMaintain | this_Perform_3= rulePerform ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:1: (this_Achieve_0= ruleAchieve | this_Query_1= ruleQuery | this_Maintain_2= ruleMaintain | this_Perform_3= rulePerform )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:1: (this_Achieve_0= ruleAchieve | this_Query_1= ruleQuery | this_Maintain_2= ruleMaintain | this_Perform_3= rulePerform )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt27=1;
                }
                break;
            case 49:
                {
                alt27=2;
                }
                break;
            case 50:
                {
                alt27=3;
                }
                break;
            case 51:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:5: this_Achieve_0= ruleAchieve
                    {
                     
                            newCompositeNode(grammarAccess.getGoalAccess().getAchieveParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAchieve_in_ruleGoal4211);
                    this_Achieve_0=ruleAchieve();

                    state._fsp--;

                     
                            current = this_Achieve_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1809:5: this_Query_1= ruleQuery
                    {
                     
                            newCompositeNode(grammarAccess.getGoalAccess().getQueryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuery_in_ruleGoal4238);
                    this_Query_1=ruleQuery();

                    state._fsp--;

                     
                            current = this_Query_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:5: this_Maintain_2= ruleMaintain
                    {
                     
                            newCompositeNode(grammarAccess.getGoalAccess().getMaintainParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMaintain_in_ruleGoal4265);
                    this_Maintain_2=ruleMaintain();

                    state._fsp--;

                     
                            current = this_Maintain_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1829:5: this_Perform_3= rulePerform
                    {
                     
                            newCompositeNode(grammarAccess.getGoalAccess().getPerformParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePerform_in_ruleGoal4292);
                    this_Perform_3=rulePerform();

                    state._fsp--;

                     
                            current = this_Perform_3; 
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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleAchieve"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1845:1: entryRuleAchieve returns [EObject current=null] : iv_ruleAchieve= ruleAchieve EOF ;
    public final EObject entryRuleAchieve() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAchieve = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1846:2: (iv_ruleAchieve= ruleAchieve EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1847:2: iv_ruleAchieve= ruleAchieve EOF
            {
             newCompositeNode(grammarAccess.getAchieveRule()); 
            pushFollow(FOLLOW_ruleAchieve_in_entryRuleAchieve4327);
            iv_ruleAchieve=ruleAchieve();

            state._fsp--;

             current =iv_ruleAchieve; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAchieve4337); 

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
    // $ANTLR end "entryRuleAchieve"


    // $ANTLR start "ruleAchieve"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:1: ruleAchieve returns [EObject current=null] : (otherlv_0= 'Achieve {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' ) ;
    public final EObject ruleAchieve() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_Condition_2_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1857:28: ( (otherlv_0= 'Achieve {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1858:1: (otherlv_0= 'Achieve {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1858:1: (otherlv_0= 'Achieve {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1858:3: otherlv_0= 'Achieve {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleAchieve4374); 

                	newLeafNode(otherlv_0, grammarAccess.getAchieveAccess().getAchieveKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1862:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1863:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1863:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1864:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAchieve4391); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAchieveAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAchieveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1880:2: ( (lv_Condition_2_0= ruleCondition ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1881:1: (lv_Condition_2_0= ruleCondition )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1881:1: (lv_Condition_2_0= ruleCondition )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1882:3: lv_Condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getAchieveAccess().getConditionConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleAchieve4417);
            lv_Condition_2_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAchieveRule());
            	        }
                   		set(
                   			current, 
                   			"Condition",
                    		lv_Condition_2_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAchieve4429); 

                	newLeafNode(otherlv_3, grammarAccess.getAchieveAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleAchieve"


    // $ANTLR start "entryRuleQuery"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1910:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1911:2: (iv_ruleQuery= ruleQuery EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1912:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery4465);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery4475); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1919:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'Query {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) ( (lv_Result_3_0= ruleResult ) ) otherlv_4= '}' ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_Condition_2_0 = null;

        AntlrDatatypeRuleToken lv_Result_3_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1922:28: ( (otherlv_0= 'Query {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) ( (lv_Result_3_0= ruleResult ) ) otherlv_4= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1923:1: (otherlv_0= 'Query {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) ( (lv_Result_3_0= ruleResult ) ) otherlv_4= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1923:1: (otherlv_0= 'Query {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) ( (lv_Result_3_0= ruleResult ) ) otherlv_4= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1923:3: otherlv_0= 'Query {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) ( (lv_Result_3_0= ruleResult ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleQuery4512); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1928:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1928:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1929:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery4529); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQueryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1945:2: ( (lv_Condition_2_0= ruleCondition ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:1: (lv_Condition_2_0= ruleCondition )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:1: (lv_Condition_2_0= ruleCondition )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1947:3: lv_Condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getQueryAccess().getConditionConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleQuery4555);
            lv_Condition_2_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	        }
                   		set(
                   			current, 
                   			"Condition",
                    		lv_Condition_2_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1963:2: ( (lv_Result_3_0= ruleResult ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:1: (lv_Result_3_0= ruleResult )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:1: (lv_Result_3_0= ruleResult )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1965:3: lv_Result_3_0= ruleResult
            {
             
            	        newCompositeNode(grammarAccess.getQueryAccess().getResultResultParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleResult_in_ruleQuery4576);
            lv_Result_3_0=ruleResult();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	        }
                   		set(
                   			current, 
                   			"Result",
                    		lv_Result_3_0, 
                    		"Result");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleQuery4588); 

                	newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleMaintain"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1993:1: entryRuleMaintain returns [EObject current=null] : iv_ruleMaintain= ruleMaintain EOF ;
    public final EObject entryRuleMaintain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaintain = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1994:2: (iv_ruleMaintain= ruleMaintain EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1995:2: iv_ruleMaintain= ruleMaintain EOF
            {
             newCompositeNode(grammarAccess.getMaintainRule()); 
            pushFollow(FOLLOW_ruleMaintain_in_entryRuleMaintain4624);
            iv_ruleMaintain=ruleMaintain();

            state._fsp--;

             current =iv_ruleMaintain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaintain4634); 

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
    // $ANTLR end "entryRuleMaintain"


    // $ANTLR start "ruleMaintain"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:1: ruleMaintain returns [EObject current=null] : (otherlv_0= 'Maintain {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' ) ;
    public final EObject ruleMaintain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_Condition_2_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2005:28: ( (otherlv_0= 'Maintain {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:1: (otherlv_0= 'Maintain {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:1: (otherlv_0= 'Maintain {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:3: otherlv_0= 'Maintain {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleMaintain4671); 

                	newLeafNode(otherlv_0, grammarAccess.getMaintainAccess().getMaintainKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2010:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2011:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2011:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2012:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMaintain4688); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMaintainAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMaintainRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2028:2: ( (lv_Condition_2_0= ruleCondition ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2029:1: (lv_Condition_2_0= ruleCondition )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2029:1: (lv_Condition_2_0= ruleCondition )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2030:3: lv_Condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getMaintainAccess().getConditionConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleMaintain4714);
            lv_Condition_2_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaintainRule());
            	        }
                   		set(
                   			current, 
                   			"Condition",
                    		lv_Condition_2_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMaintain4726); 

                	newLeafNode(otherlv_3, grammarAccess.getMaintainAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleMaintain"


    // $ANTLR start "entryRulePerform"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2058:1: entryRulePerform returns [EObject current=null] : iv_rulePerform= rulePerform EOF ;
    public final EObject entryRulePerform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerform = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2059:2: (iv_rulePerform= rulePerform EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2060:2: iv_rulePerform= rulePerform EOF
            {
             newCompositeNode(grammarAccess.getPerformRule()); 
            pushFollow(FOLLOW_rulePerform_in_entryRulePerform4762);
            iv_rulePerform=rulePerform();

            state._fsp--;

             current =iv_rulePerform; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerform4772); 

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
    // $ANTLR end "entryRulePerform"


    // $ANTLR start "rulePerform"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2067:1: rulePerform returns [EObject current=null] : (otherlv_0= 'Perform {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' ) ;
    public final EObject rulePerform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_Condition_2_0 = null;


         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2070:28: ( (otherlv_0= 'Perform {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2071:1: (otherlv_0= 'Perform {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2071:1: (otherlv_0= 'Perform {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}' )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2071:3: otherlv_0= 'Perform {' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Condition_2_0= ruleCondition ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_rulePerform4809); 

                	newLeafNode(otherlv_0, grammarAccess.getPerformAccess().getPerformKeyword_0());
                
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2075:1: ( (lv_name_1_0= RULE_ID ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2076:1: (lv_name_1_0= RULE_ID )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2076:1: (lv_name_1_0= RULE_ID )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerform4826); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPerformAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPerformRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2093:2: ( (lv_Condition_2_0= ruleCondition ) )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2094:1: (lv_Condition_2_0= ruleCondition )
            {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2094:1: (lv_Condition_2_0= ruleCondition )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2095:3: lv_Condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getPerformAccess().getConditionConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_rulePerform4852);
            lv_Condition_2_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPerformRule());
            	        }
                   		set(
                   			current, 
                   			"Condition",
                    		lv_Condition_2_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePerform4864); 

                	newLeafNode(otherlv_3, grammarAccess.getPerformAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "rulePerform"


    // $ANTLR start "entryRuleResult"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2123:1: entryRuleResult returns [String current=null] : iv_ruleResult= ruleResult EOF ;
    public final String entryRuleResult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResult = null;


        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2124:2: (iv_ruleResult= ruleResult EOF )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_ruleResult_in_entryRuleResult4901);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResult4912); 

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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2132:1: ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleResult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2135:28: (this_STRING_0= RULE_STRING )
            // ../bdi.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2136:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResult4951); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getResultAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleResult"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBDI_in_entryRuleBDI75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBDI85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBDI122 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAgent_in_ruleBDI143 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleBDI156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAgent239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAgent256 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAgent273 = new BitSet(new long[]{0x0000220000548000L});
    public static final BitSet FOLLOW_ruleImports_in_ruleAgent294 = new BitSet(new long[]{0x0000220000548000L});
    public static final BitSet FOLLOW_ruleEvents_in_ruleAgent316 = new BitSet(new long[]{0x0000220000508000L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleAgent338 = new BitSet(new long[]{0x0000220000408000L});
    public static final BitSet FOLLOW_ruleBeliefSet_in_ruleAgent360 = new BitSet(new long[]{0x0000220000008000L});
    public static final BitSet FOLLOW_rulePlans_in_ruleAgent382 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_15_in_ruleAgent395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImports478 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleImports499 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleImports512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleImport598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFilename_in_ruleImport620 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilename_in_entryRuleFilename679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilename690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFilename729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvents_in_entryRuleEvents773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvents783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEvents820 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEvents841 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15_in_ruleEvents854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEvent937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent954 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvent971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent988 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleEvent1014 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleEvent1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters1063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleParameters1110 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameters1131 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleParameters1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParameter1227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1244 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParameter1261 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter1277 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleValue1374 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleValue1396 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleValue1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCode1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCode1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleCode1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleCode1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NETWORK_in_ruleCode1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperator1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperator1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperator1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOperator1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperator1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperator1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCondition2006 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleCondition2027 = new BitSet(new long[]{0x0000004000000170L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition2048 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32_in_ruleCondition2069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_33_in_ruleCondition2106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCondition2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleExpression2236 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleExpression2259 = new BitSet(new long[]{0x0000004000000170L});
    public static final BitSet FOLLOW_35_in_ruleExpression2288 = new BitSet(new long[]{0x0000004000000170L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleExpression2311 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleTerm2406 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleTerm2429 = new BitSet(new long[]{0x0000004000000170L});
    public static final BitSet FOLLOW_37_in_ruleTerm2458 = new BitSet(new long[]{0x0000004000000170L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleTerm2481 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor2519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleFactor2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFactor2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFactor2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleFactor2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFactor2677 = new BitSet(new long[]{0x0000004000000170L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFactor2698 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleFactor2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2894 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName2913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2928 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName2949 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualifiedName2964 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rulePlans_in_entryRulePlans3011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlans3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePlans3058 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rulePlan_in_rulePlans3079 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_15_in_rulePlans3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan3128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePlan3175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlan3192 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleBody_in_rulePlan3218 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleTrigger_in_rulePlan3239 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePlan3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody3288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBody3337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBody3352 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBody3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger3410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTrigger3458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrigger3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrigger3506 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTrigger3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeliefSet_in_entryRuleBeliefSet3555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeliefSet3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBeliefSet3602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBeliefSet3619 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleBeliefSet3645 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_15_in_ruleBeliefSet3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief3694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBelief3741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief3758 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_ruleFact_in_ruleBelief3784 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_15_in_ruleBelief3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact3833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFact3880 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleStatements_in_ruleFact3901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFact3912 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFact3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatements_in_entryRuleStatements3959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatements3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatements4014 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement4051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_ruleStatement4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal4154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAchieve_in_ruleGoal4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleGoal4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaintain_in_ruleGoal4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerform_in_ruleGoal4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAchieve_in_entryRuleAchieve4327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAchieve4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAchieve4374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAchieve4391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleAchieve4417 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAchieve4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery4465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleQuery4512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery4529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleQuery4555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleResult_in_ruleQuery4576 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuery4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaintain_in_entryRuleMaintain4624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaintain4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMaintain4671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMaintain4688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleMaintain4714 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMaintain4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerform_in_entryRulePerform4762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerform4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePerform4809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerform4826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_rulePerform4852 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePerform4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResult_in_entryRuleResult4901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResult4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResult4951 = new BitSet(new long[]{0x0000000000000002L});

}