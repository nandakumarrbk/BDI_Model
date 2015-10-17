package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<BDIModel>'", "'</BDIModel>'", "'<Agent>'", "'</Agent>'", "'<Imports>'", "'</Imports>'", "'<Import>'", "'</Import>'", "'<Event>'", "'</Events>'", "'</Event>'", "'<Parameters>'", "'</Parameters>'", "'<Parameter>'", "'</Parameter>'", "'<Value>'", "'</Value>'", "'<Plans>'", "'</Plans>'", "'<Plan>'", "'</Plan>'", "'<Body>'", "'</Body>'", "'<Trigger>'", "'</Trigger>'", "'<BeliefSet>'", "'</BeliefSet>'", "'<Belief>'", "'</Belief>'", "'<Fact>'", "'</Fact>'", "'<Achieve>'", "'</Achieve>'", "'<Query>'", "'</Query>'", "'<Maintain>'", "'</Maintain>'", "'<Perform>'", "'</Perform>'", "'<Condition>'", "'</Condition>'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleBDI"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleBDI : ruleBDI EOF ;
    public final void entryRuleBDI() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleBDI EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleBDI EOF
            {
             before(grammarAccess.getBDIRule()); 
            pushFollow(FOLLOW_ruleBDI_in_entryRuleBDI61);
            ruleBDI();

            state._fsp--;

             after(grammarAccess.getBDIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBDI68); 

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
    // $ANTLR end "entryRuleBDI"


    // $ANTLR start "ruleBDI"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleBDI : ( ( rule__BDI__Group__0 ) ) ;
    public final void ruleBDI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__BDI__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__BDI__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__BDI__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__BDI__Group__0 )
            {
             before(grammarAccess.getBDIAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__BDI__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__BDI__Group__0
            {
            pushFollow(FOLLOW_rule__BDI__Group__0_in_ruleBDI94);
            rule__BDI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBDIAccess().getGroup()); 

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
    // $ANTLR end "ruleBDI"


    // $ANTLR start "entryRuleAgent"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleAgent EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent121);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent128); 

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
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Agent__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Agent__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Agent__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Agent__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Agent__Group__0
            {
            pushFollow(FOLLOW_rule__Agent__Group__0_in_ruleAgent154);
            rule__Agent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getGroup()); 

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
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleImports"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleImports : ruleImports EOF ;
    public final void entryRuleImports() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleImports EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleImports EOF
            {
             before(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports181);
            ruleImports();

            state._fsp--;

             after(grammarAccess.getImportsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports188); 

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
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleImports : ( ( rule__Imports__Group__0 ) ) ;
    public final void ruleImports() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Imports__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Imports__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Imports__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Imports__Group__0 )
            {
             before(grammarAccess.getImportsAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Imports__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Imports__Group__0
            {
            pushFollow(FOLLOW_rule__Imports__Group__0_in_ruleImports214);
            rule__Imports__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getGroup()); 

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
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleImport"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleImport EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Import__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFilename"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleFilename : ruleFilename EOF ;
    public final void entryRuleFilename() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleFilename EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleFilename EOF
            {
             before(grammarAccess.getFilenameRule()); 
            pushFollow(FOLLOW_ruleFilename_in_entryRuleFilename301);
            ruleFilename();

            state._fsp--;

             after(grammarAccess.getFilenameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilename308); 

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
    // $ANTLR end "entryRuleFilename"


    // $ANTLR start "ruleFilename"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleFilename : ( RULE_STRING ) ;
    public final void ruleFilename() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( RULE_STRING ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( RULE_STRING )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( RULE_STRING )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: RULE_STRING
            {
             before(grammarAccess.getFilenameAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFilename334); 
             after(grammarAccess.getFilenameAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleFilename"


    // $ANTLR start "entryRuleEvents"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleEvents : ruleEvents EOF ;
    public final void entryRuleEvents() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleEvents EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleEvents EOF
            {
             before(grammarAccess.getEventsRule()); 
            pushFollow(FOLLOW_ruleEvents_in_entryRuleEvents360);
            ruleEvents();

            state._fsp--;

             after(grammarAccess.getEventsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvents367); 

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
    // $ANTLR end "entryRuleEvents"


    // $ANTLR start "ruleEvents"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleEvents : ( ( rule__Events__Group__0 ) ) ;
    public final void ruleEvents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Events__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Events__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Events__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Events__Group__0 )
            {
             before(grammarAccess.getEventsAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Events__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Events__Group__0
            {
            pushFollow(FOLLOW_rule__Events__Group__0_in_ruleEvents393);
            rule__Events__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventsAccess().getGroup()); 

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
    // $ANTLR end "ruleEvents"


    // $ANTLR start "entryRuleEvent"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleEvent EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent420);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent427); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Event__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Event__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Event__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent453);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleParameters"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleParameters EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters480);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters487); 

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Parameters__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Parameters__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Parameters__Group__0 )
            {
             before(grammarAccess.getParametersAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Parameters__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_rule__Parameters__Group__0_in_ruleParameters513);
            rule__Parameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getGroup()); 

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleParameter EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter540);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter547); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Parameter__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Parameter__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter573);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleValue"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleValue EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue600);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue607); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__Value__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Value__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Value__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__Value__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__Value__Group__0
            {
            pushFollow(FOLLOW_rule__Value__Group__0_in_ruleValue633);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleCode"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleCode EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleCode EOF
            {
             before(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode660);
            ruleCode();

            state._fsp--;

             after(grammarAccess.getCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode667); 

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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleCode : ( RULE_STRING ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( RULE_STRING ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( RULE_STRING )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( RULE_STRING )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: RULE_STRING
            {
             before(grammarAccess.getCodeAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCode693); 
             after(grammarAccess.getCodeAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRulePlans"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRulePlans : rulePlans EOF ;
    public final void entryRulePlans() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( rulePlans EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: rulePlans EOF
            {
             before(grammarAccess.getPlansRule()); 
            pushFollow(FOLLOW_rulePlans_in_entryRulePlans719);
            rulePlans();

            state._fsp--;

             after(grammarAccess.getPlansRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlans726); 

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
    // $ANTLR end "entryRulePlans"


    // $ANTLR start "rulePlans"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: rulePlans : ( ( rule__Plans__Group__0 ) ) ;
    public final void rulePlans() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__Plans__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Plans__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Plans__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__Plans__Group__0 )
            {
             before(grammarAccess.getPlansAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__Plans__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__Plans__Group__0
            {
            pushFollow(FOLLOW_rule__Plans__Group__0_in_rulePlans752);
            rule__Plans__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlansAccess().getGroup()); 

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
    // $ANTLR end "rulePlans"


    // $ANTLR start "entryRulePlan"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRulePlan : rulePlan EOF ;
    public final void entryRulePlan() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( rulePlan EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: rulePlan EOF
            {
             before(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan779);
            rulePlan();

            state._fsp--;

             after(grammarAccess.getPlanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan786); 

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
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: rulePlan : ( ( rule__Plan__Group__0 ) ) ;
    public final void rulePlan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__Plan__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Plan__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Plan__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__Plan__Group__0 )
            {
             before(grammarAccess.getPlanAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Plan__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__Plan__Group__0
            {
            pushFollow(FOLLOW_rule__Plan__Group__0_in_rulePlan812);
            rule__Plan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getGroup()); 

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
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleBody"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleBody EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody839);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody846); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Body__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Body__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__Body__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody872);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleTrigger"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( ruleTrigger EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger899);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger906); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ruleTrigger : ( ( rule__Trigger__Alternatives ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__Trigger__Alternatives ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Trigger__Alternatives ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Trigger__Alternatives ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__Trigger__Alternatives )
            {
             before(grammarAccess.getTriggerAccess().getAlternatives()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__Trigger__Alternatives )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__Trigger__Alternatives
            {
            pushFollow(FOLLOW_rule__Trigger__Alternatives_in_ruleTrigger932);
            rule__Trigger__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleBeliefSet"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: entryRuleBeliefSet : ruleBeliefSet EOF ;
    public final void entryRuleBeliefSet() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ruleBeliefSet EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ruleBeliefSet EOF
            {
             before(grammarAccess.getBeliefSetRule()); 
            pushFollow(FOLLOW_ruleBeliefSet_in_entryRuleBeliefSet959);
            ruleBeliefSet();

            state._fsp--;

             after(grammarAccess.getBeliefSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeliefSet966); 

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
    // $ANTLR end "entryRuleBeliefSet"


    // $ANTLR start "ruleBeliefSet"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ruleBeliefSet : ( ( rule__BeliefSet__Group__0 ) ) ;
    public final void ruleBeliefSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: ( ( ( rule__BeliefSet__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__BeliefSet__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__BeliefSet__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( rule__BeliefSet__Group__0 )
            {
             before(grammarAccess.getBeliefSetAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__BeliefSet__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: rule__BeliefSet__Group__0
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__0_in_ruleBeliefSet992);
            rule__BeliefSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeliefSetAccess().getGroup()); 

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
    // $ANTLR end "ruleBeliefSet"


    // $ANTLR start "entryRuleBelief"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: entryRuleBelief : ruleBelief EOF ;
    public final void entryRuleBelief() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ruleBelief EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ruleBelief EOF
            {
             before(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief1019);
            ruleBelief();

            state._fsp--;

             after(grammarAccess.getBeliefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief1026); 

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
    // $ANTLR end "entryRuleBelief"


    // $ANTLR start "ruleBelief"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ruleBelief : ( ( rule__Belief__Group__0 ) ) ;
    public final void ruleBelief() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:2: ( ( ( rule__Belief__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__Belief__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__Belief__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( rule__Belief__Group__0 )
            {
             before(grammarAccess.getBeliefAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__Belief__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: rule__Belief__Group__0
            {
            pushFollow(FOLLOW_rule__Belief__Group__0_in_ruleBelief1052);
            rule__Belief__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeliefAccess().getGroup()); 

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
    // $ANTLR end "ruleBelief"


    // $ANTLR start "entryRuleFact"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( ruleFact EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact1079);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact1086); 

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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:2: ( ( ( rule__Fact__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__Fact__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__Fact__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__Fact__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_rule__Fact__Group__0_in_ruleFact1112);
            rule__Fact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleStatements"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( ruleStatements EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ruleStatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_ruleStatements_in_entryRuleStatements1139);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatements1146); 

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
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ruleStatements : ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: ( ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Statements__StatementsAssignment ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Statements__StatementsAssignment )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__Statements__StatementsAssignment )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: rule__Statements__StatementsAssignment
            {
            pushFollow(FOLLOW_rule__Statements__StatementsAssignment_in_ruleStatements1174);
            rule__Statements__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getStatementsAssignment()); 

            }

            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: ( ( rule__Statements__StatementsAssignment )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ( rule__Statements__StatementsAssignment )*
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:586:1: ( rule__Statements__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==EOF||LA1_2==RULE_STRING) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:586:2: rule__Statements__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Statements__StatementsAssignment_in_ruleStatements1186);
            	    rule__Statements__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStatementsAccess().getStatementsAssignment()); 

            }


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
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleStatement"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ( ruleStatement EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1216);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1223); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ruleStatement : ( ruleCode ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:2: ( ( ruleCode ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( ruleCode )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( ruleCode )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: ruleCode
            {
             before(grammarAccess.getStatementAccess().getCodeParserRuleCall()); 
            pushFollow(FOLLOW_ruleCode_in_ruleStatement1249);
            ruleCode();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getCodeParserRuleCall()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleGoal"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ( ruleGoal EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1277);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1284); 

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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ruleGoal : ( ( rule__Goal__Alternatives ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:2: ( ( ( rule__Goal__Alternatives ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: ( ( rule__Goal__Alternatives ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: ( ( rule__Goal__Alternatives ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: ( rule__Goal__Alternatives )
            {
             before(grammarAccess.getGoalAccess().getAlternatives()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( rule__Goal__Alternatives )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:2: rule__Goal__Alternatives
            {
            pushFollow(FOLLOW_rule__Goal__Alternatives_in_ruleGoal1310);
            rule__Goal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleAchieve"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: entryRuleAchieve : ruleAchieve EOF ;
    public final void entryRuleAchieve() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( ruleAchieve EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ruleAchieve EOF
            {
             before(grammarAccess.getAchieveRule()); 
            pushFollow(FOLLOW_ruleAchieve_in_entryRuleAchieve1337);
            ruleAchieve();

            state._fsp--;

             after(grammarAccess.getAchieveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAchieve1344); 

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
    // $ANTLR end "entryRuleAchieve"


    // $ANTLR start "ruleAchieve"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ruleAchieve : ( ( rule__Achieve__Group__0 ) ) ;
    public final void ruleAchieve() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:2: ( ( ( rule__Achieve__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( ( rule__Achieve__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( ( rule__Achieve__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ( rule__Achieve__Group__0 )
            {
             before(grammarAccess.getAchieveAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: ( rule__Achieve__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:673:2: rule__Achieve__Group__0
            {
            pushFollow(FOLLOW_rule__Achieve__Group__0_in_ruleAchieve1370);
            rule__Achieve__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAchieveAccess().getGroup()); 

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
    // $ANTLR end "ruleAchieve"


    // $ANTLR start "entryRuleQuery"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( ruleQuery EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery1397);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery1404); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( ( rule__Query__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( ( rule__Query__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: ( rule__Query__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery1430);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleMaintain"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: entryRuleMaintain : ruleMaintain EOF ;
    public final void entryRuleMaintain() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( ruleMaintain EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ruleMaintain EOF
            {
             before(grammarAccess.getMaintainRule()); 
            pushFollow(FOLLOW_ruleMaintain_in_entryRuleMaintain1457);
            ruleMaintain();

            state._fsp--;

             after(grammarAccess.getMaintainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaintain1464); 

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
    // $ANTLR end "entryRuleMaintain"


    // $ANTLR start "ruleMaintain"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: ruleMaintain : ( ( rule__Maintain__Group__0 ) ) ;
    public final void ruleMaintain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:726:2: ( ( ( rule__Maintain__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( ( rule__Maintain__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( ( rule__Maintain__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ( rule__Maintain__Group__0 )
            {
             before(grammarAccess.getMaintainAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( rule__Maintain__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:2: rule__Maintain__Group__0
            {
            pushFollow(FOLLOW_rule__Maintain__Group__0_in_ruleMaintain1490);
            rule__Maintain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainAccess().getGroup()); 

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
    // $ANTLR end "ruleMaintain"


    // $ANTLR start "entryRulePerform"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: entryRulePerform : rulePerform EOF ;
    public final void entryRulePerform() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( rulePerform EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: rulePerform EOF
            {
             before(grammarAccess.getPerformRule()); 
            pushFollow(FOLLOW_rulePerform_in_entryRulePerform1517);
            rulePerform();

            state._fsp--;

             after(grammarAccess.getPerformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerform1524); 

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
    // $ANTLR end "entryRulePerform"


    // $ANTLR start "rulePerform"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: rulePerform : ( ( rule__Perform__Group__0 ) ) ;
    public final void rulePerform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:2: ( ( ( rule__Perform__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( ( rule__Perform__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( ( rule__Perform__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ( rule__Perform__Group__0 )
            {
             before(grammarAccess.getPerformAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( rule__Perform__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:757:2: rule__Perform__Group__0
            {
            pushFollow(FOLLOW_rule__Perform__Group__0_in_rulePerform1550);
            rule__Perform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerformAccess().getGroup()); 

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
    // $ANTLR end "rulePerform"


    // $ANTLR start "entryRuleCondition"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( ruleCondition EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1577);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1584); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( ( rule__Condition__Group__0 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( rule__Condition__Group__0 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition1610);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleResult"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ruleResult EOF )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ruleResult EOF
            {
             before(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_ruleResult_in_entryRuleResult1637);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResult1644); 

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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ruleResult : ( RULE_STRING ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:2: ( ( RULE_STRING ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( RULE_STRING )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( RULE_STRING )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: RULE_STRING
            {
             before(grammarAccess.getResultAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResult1670); 
             after(grammarAccess.getResultAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleResult"


    // $ANTLR start "rule__Trigger__Alternatives"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: rule__Trigger__Alternatives : ( ( ( rule__Trigger__Group_0__0 ) ) | ( ( rule__Trigger__Group_1__0 ) ) );
    public final void rule__Trigger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( ( ( rule__Trigger__Group_0__0 ) ) | ( ( rule__Trigger__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==42||LA2_0==44||LA2_0==46||LA2_0==48) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__Trigger__Group_0__0 ) )
                    {
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__Trigger__Group_0__0 ) )
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( rule__Trigger__Group_0__0 )
                    {
                     before(grammarAccess.getTriggerAccess().getGroup_0()); 
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__Trigger__Group_0__0 )
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:2: rule__Trigger__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Trigger__Group_0__0_in_rule__Trigger__Alternatives1705);
                    rule__Trigger__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTriggerAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:6: ( ( rule__Trigger__Group_1__0 ) )
                    {
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:6: ( ( rule__Trigger__Group_1__0 ) )
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( rule__Trigger__Group_1__0 )
                    {
                     before(grammarAccess.getTriggerAccess().getGroup_1()); 
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( rule__Trigger__Group_1__0 )
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:2: rule__Trigger__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Trigger__Group_1__0_in_rule__Trigger__Alternatives1723);
                    rule__Trigger__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTriggerAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Trigger__Alternatives"


    // $ANTLR start "rule__Goal__Alternatives"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: rule__Goal__Alternatives : ( ( ruleAchieve ) | ( ruleQuery ) | ( ruleMaintain ) | ( rulePerform ) );
    public final void rule__Goal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( ( ruleAchieve ) | ( ruleQuery ) | ( ruleMaintain ) | ( rulePerform ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case 46:
                {
                alt3=3;
                }
                break;
            case 48:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( ruleAchieve )
                    {
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( ruleAchieve )
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ruleAchieve
                    {
                     before(grammarAccess.getGoalAccess().getAchieveParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAchieve_in_rule__Goal__Alternatives1756);
                    ruleAchieve();

                    state._fsp--;

                     after(grammarAccess.getGoalAccess().getAchieveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:6: ( ruleQuery )
                    {
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:6: ( ruleQuery )
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ruleQuery
                    {
                     before(grammarAccess.getGoalAccess().getQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQuery_in_rule__Goal__Alternatives1773);
                    ruleQuery();

                    state._fsp--;

                     after(grammarAccess.getGoalAccess().getQueryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:6: ( ruleMaintain )
                    {
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:6: ( ruleMaintain )
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ruleMaintain
                    {
                     before(grammarAccess.getGoalAccess().getMaintainParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMaintain_in_rule__Goal__Alternatives1790);
                    ruleMaintain();

                    state._fsp--;

                     after(grammarAccess.getGoalAccess().getMaintainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:6: ( rulePerform )
                    {
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:6: ( rulePerform )
                    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: rulePerform
                    {
                     before(grammarAccess.getGoalAccess().getPerformParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePerform_in_rule__Goal__Alternatives1807);
                    rulePerform();

                    state._fsp--;

                     after(grammarAccess.getGoalAccess().getPerformParserRuleCall_3()); 

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
    // $ANTLR end "rule__Goal__Alternatives"


    // $ANTLR start "rule__BDI__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: rule__BDI__Group__0 : rule__BDI__Group__0__Impl rule__BDI__Group__1 ;
    public final void rule__BDI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__BDI__Group__0__Impl rule__BDI__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:2: rule__BDI__Group__0__Impl rule__BDI__Group__1
            {
            pushFollow(FOLLOW_rule__BDI__Group__0__Impl_in_rule__BDI__Group__01837);
            rule__BDI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BDI__Group__1_in_rule__BDI__Group__01840);
            rule__BDI__Group__1();

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
    // $ANTLR end "rule__BDI__Group__0"


    // $ANTLR start "rule__BDI__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: rule__BDI__Group__0__Impl : ( '<BDIModel>' ) ;
    public final void rule__BDI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( ( '<BDIModel>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( '<BDIModel>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( '<BDIModel>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: '<BDIModel>'
            {
             before(grammarAccess.getBDIAccess().getBDIModelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__BDI__Group__0__Impl1868); 
             after(grammarAccess.getBDIAccess().getBDIModelKeyword_0()); 

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
    // $ANTLR end "rule__BDI__Group__0__Impl"


    // $ANTLR start "rule__BDI__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: rule__BDI__Group__1 : rule__BDI__Group__1__Impl rule__BDI__Group__2 ;
    public final void rule__BDI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( rule__BDI__Group__1__Impl rule__BDI__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:919:2: rule__BDI__Group__1__Impl rule__BDI__Group__2
            {
            pushFollow(FOLLOW_rule__BDI__Group__1__Impl_in_rule__BDI__Group__11899);
            rule__BDI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BDI__Group__2_in_rule__BDI__Group__11902);
            rule__BDI__Group__2();

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
    // $ANTLR end "rule__BDI__Group__1"


    // $ANTLR start "rule__BDI__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: rule__BDI__Group__1__Impl : ( ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* ) ) ;
    public final void rule__BDI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( ( ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( ( rule__BDI__AgentsAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( rule__BDI__AgentsAssignment_1 )
            {
             before(grammarAccess.getBDIAccess().getAgentsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ( rule__BDI__AgentsAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:2: rule__BDI__AgentsAssignment_1
            {
            pushFollow(FOLLOW_rule__BDI__AgentsAssignment_1_in_rule__BDI__Group__1__Impl1931);
            rule__BDI__AgentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBDIAccess().getAgentsAssignment_1()); 

            }

            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ( ( rule__BDI__AgentsAssignment_1 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( rule__BDI__AgentsAssignment_1 )*
            {
             before(grammarAccess.getBDIAccess().getAgentsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( rule__BDI__AgentsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:2: rule__BDI__AgentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__BDI__AgentsAssignment_1_in_rule__BDI__Group__1__Impl1943);
            	    rule__BDI__AgentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBDIAccess().getAgentsAssignment_1()); 

            }


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
    // $ANTLR end "rule__BDI__Group__1__Impl"


    // $ANTLR start "rule__BDI__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: rule__BDI__Group__2 : rule__BDI__Group__2__Impl ;
    public final void rule__BDI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__BDI__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:2: rule__BDI__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BDI__Group__2__Impl_in_rule__BDI__Group__21976);
            rule__BDI__Group__2__Impl();

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
    // $ANTLR end "rule__BDI__Group__2"


    // $ANTLR start "rule__BDI__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: rule__BDI__Group__2__Impl : ( '</BDIModel>' ) ;
    public final void rule__BDI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: ( ( '</BDIModel>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( '</BDIModel>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( '</BDIModel>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: '</BDIModel>'
            {
             before(grammarAccess.getBDIAccess().getBDIModelKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__BDI__Group__2__Impl2004); 
             after(grammarAccess.getBDIAccess().getBDIModelKeyword_2()); 

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
    // $ANTLR end "rule__BDI__Group__2__Impl"


    // $ANTLR start "rule__Agent__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
            {
            pushFollow(FOLLOW_rule__Agent__Group__0__Impl_in_rule__Agent__Group__02041);
            rule__Agent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02044);
            rule__Agent__Group__1();

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
    // $ANTLR end "rule__Agent__Group__0"


    // $ANTLR start "rule__Agent__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: rule__Agent__Group__0__Impl : ( '<Agent>' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( ( '<Agent>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( '<Agent>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( '<Agent>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:1: '<Agent>'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Agent__Group__0__Impl2072); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

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
    // $ANTLR end "rule__Agent__Group__0__Impl"


    // $ANTLR start "rule__Agent__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FOLLOW_rule__Agent__Group__1__Impl_in_rule__Agent__Group__12103);
            rule__Agent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12106);
            rule__Agent__Group__2();

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
    // $ANTLR end "rule__Agent__Group__1"


    // $ANTLR start "rule__Agent__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( rule__Agent__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__1__Impl2133);
            rule__Agent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Agent__Group__1__Impl"


    // $ANTLR start "rule__Agent__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl rule__Agent__Group__3 ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: ( rule__Agent__Group__2__Impl rule__Agent__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:2: rule__Agent__Group__2__Impl rule__Agent__Group__3
            {
            pushFollow(FOLLOW_rule__Agent__Group__2__Impl_in_rule__Agent__Group__22163);
            rule__Agent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__3_in_rule__Agent__Group__22166);
            rule__Agent__Group__3();

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
    // $ANTLR end "rule__Agent__Group__2"


    // $ANTLR start "rule__Agent__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__ImportAssignment_2 )* ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( ( ( rule__Agent__ImportAssignment_2 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: ( ( rule__Agent__ImportAssignment_2 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: ( ( rule__Agent__ImportAssignment_2 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: ( rule__Agent__ImportAssignment_2 )*
            {
             before(grammarAccess.getAgentAccess().getImportAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:1: ( rule__Agent__ImportAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:2: rule__Agent__ImportAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Agent__ImportAssignment_2_in_rule__Agent__Group__2__Impl2193);
            	    rule__Agent__ImportAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getImportAssignment_2()); 

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
    // $ANTLR end "rule__Agent__Group__2__Impl"


    // $ANTLR start "rule__Agent__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: rule__Agent__Group__3 : rule__Agent__Group__3__Impl rule__Agent__Group__4 ;
    public final void rule__Agent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( rule__Agent__Group__3__Impl rule__Agent__Group__4 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:2: rule__Agent__Group__3__Impl rule__Agent__Group__4
            {
            pushFollow(FOLLOW_rule__Agent__Group__3__Impl_in_rule__Agent__Group__32224);
            rule__Agent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__4_in_rule__Agent__Group__32227);
            rule__Agent__Group__4();

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
    // $ANTLR end "rule__Agent__Group__3"


    // $ANTLR start "rule__Agent__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: rule__Agent__Group__3__Impl : ( ( rule__Agent__BeliefAssignment_3 )* ) ;
    public final void rule__Agent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ( ( ( rule__Agent__BeliefAssignment_3 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( ( rule__Agent__BeliefAssignment_3 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( ( rule__Agent__BeliefAssignment_3 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: ( rule__Agent__BeliefAssignment_3 )*
            {
             before(grammarAccess.getAgentAccess().getBeliefAssignment_3()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:1: ( rule__Agent__BeliefAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:2: rule__Agent__BeliefAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Agent__BeliefAssignment_3_in_rule__Agent__Group__3__Impl2254);
            	    rule__Agent__BeliefAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getBeliefAssignment_3()); 

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
    // $ANTLR end "rule__Agent__Group__3__Impl"


    // $ANTLR start "rule__Agent__Group__4"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: rule__Agent__Group__4 : rule__Agent__Group__4__Impl rule__Agent__Group__5 ;
    public final void rule__Agent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( rule__Agent__Group__4__Impl rule__Agent__Group__5 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:2: rule__Agent__Group__4__Impl rule__Agent__Group__5
            {
            pushFollow(FOLLOW_rule__Agent__Group__4__Impl_in_rule__Agent__Group__42285);
            rule__Agent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__5_in_rule__Agent__Group__42288);
            rule__Agent__Group__5();

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
    // $ANTLR end "rule__Agent__Group__4"


    // $ANTLR start "rule__Agent__Group__4__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: rule__Agent__Group__4__Impl : ( ( rule__Agent__PlanAssignment_4 )* ) ;
    public final void rule__Agent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( ( ( rule__Agent__PlanAssignment_4 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( ( rule__Agent__PlanAssignment_4 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( ( rule__Agent__PlanAssignment_4 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: ( rule__Agent__PlanAssignment_4 )*
            {
             before(grammarAccess.getAgentAccess().getPlanAssignment_4()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: ( rule__Agent__PlanAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:2: rule__Agent__PlanAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Agent__PlanAssignment_4_in_rule__Agent__Group__4__Impl2315);
            	    rule__Agent__PlanAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getPlanAssignment_4()); 

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
    // $ANTLR end "rule__Agent__Group__4__Impl"


    // $ANTLR start "rule__Agent__Group__5"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: rule__Agent__Group__5 : rule__Agent__Group__5__Impl rule__Agent__Group__6 ;
    public final void rule__Agent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( rule__Agent__Group__5__Impl rule__Agent__Group__6 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:2: rule__Agent__Group__5__Impl rule__Agent__Group__6
            {
            pushFollow(FOLLOW_rule__Agent__Group__5__Impl_in_rule__Agent__Group__52346);
            rule__Agent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__6_in_rule__Agent__Group__52349);
            rule__Agent__Group__6();

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
    // $ANTLR end "rule__Agent__Group__5"


    // $ANTLR start "rule__Agent__Group__5__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: rule__Agent__Group__5__Impl : ( ( rule__Agent__EventAssignment_5 )* ) ;
    public final void rule__Agent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( ( ( rule__Agent__EventAssignment_5 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( ( rule__Agent__EventAssignment_5 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( ( rule__Agent__EventAssignment_5 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( rule__Agent__EventAssignment_5 )*
            {
             before(grammarAccess.getAgentAccess().getEventAssignment_5()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( rule__Agent__EventAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:2: rule__Agent__EventAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Agent__EventAssignment_5_in_rule__Agent__Group__5__Impl2376);
            	    rule__Agent__EventAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getEventAssignment_5()); 

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
    // $ANTLR end "rule__Agent__Group__5__Impl"


    // $ANTLR start "rule__Agent__Group__6"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: rule__Agent__Group__6 : rule__Agent__Group__6__Impl rule__Agent__Group__7 ;
    public final void rule__Agent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ( rule__Agent__Group__6__Impl rule__Agent__Group__7 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:2: rule__Agent__Group__6__Impl rule__Agent__Group__7
            {
            pushFollow(FOLLOW_rule__Agent__Group__6__Impl_in_rule__Agent__Group__62407);
            rule__Agent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__7_in_rule__Agent__Group__62410);
            rule__Agent__Group__7();

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
    // $ANTLR end "rule__Agent__Group__6"


    // $ANTLR start "rule__Agent__Group__6__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: rule__Agent__Group__6__Impl : ( ( rule__Agent__ParametersAssignment_6 )* ) ;
    public final void rule__Agent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:1: ( ( ( rule__Agent__ParametersAssignment_6 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( ( rule__Agent__ParametersAssignment_6 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( ( rule__Agent__ParametersAssignment_6 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( rule__Agent__ParametersAssignment_6 )*
            {
             before(grammarAccess.getAgentAccess().getParametersAssignment_6()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( rule__Agent__ParametersAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:2: rule__Agent__ParametersAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Agent__ParametersAssignment_6_in_rule__Agent__Group__6__Impl2437);
            	    rule__Agent__ParametersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getParametersAssignment_6()); 

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
    // $ANTLR end "rule__Agent__Group__6__Impl"


    // $ANTLR start "rule__Agent__Group__7"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: rule__Agent__Group__7 : rule__Agent__Group__7__Impl ;
    public final void rule__Agent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( rule__Agent__Group__7__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:2: rule__Agent__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Agent__Group__7__Impl_in_rule__Agent__Group__72468);
            rule__Agent__Group__7__Impl();

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
    // $ANTLR end "rule__Agent__Group__7"


    // $ANTLR start "rule__Agent__Group__7__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: rule__Agent__Group__7__Impl : ( '</Agent>' ) ;
    public final void rule__Agent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( ( '</Agent>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( '</Agent>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( '</Agent>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: '</Agent>'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Agent__Group__7__Impl2496); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_7()); 

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
    // $ANTLR end "rule__Agent__Group__7__Impl"


    // $ANTLR start "rule__Imports__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
            {
            pushFollow(FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__02543);
            rule__Imports__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__02546);
            rule__Imports__Group__1();

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
    // $ANTLR end "rule__Imports__Group__0"


    // $ANTLR start "rule__Imports__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:1: rule__Imports__Group__0__Impl : ( '<Imports>' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: ( ( '<Imports>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: ( '<Imports>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: ( '<Imports>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: '<Imports>'
            {
             before(grammarAccess.getImportsAccess().getImportsKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Imports__Group__0__Impl2574); 
             after(grammarAccess.getImportsAccess().getImportsKeyword_0()); 

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
    // $ANTLR end "rule__Imports__Group__0__Impl"


    // $ANTLR start "rule__Imports__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl rule__Imports__Group__2 ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( rule__Imports__Group__1__Impl rule__Imports__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:2: rule__Imports__Group__1__Impl rule__Imports__Group__2
            {
            pushFollow(FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__12605);
            rule__Imports__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__12608);
            rule__Imports__Group__2();

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
    // $ANTLR end "rule__Imports__Group__1"


    // $ANTLR start "rule__Imports__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: rule__Imports__Group__1__Impl : ( ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( ( ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( ( rule__Imports__ImportsAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( rule__Imports__ImportsAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( rule__Imports__ImportsAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:2: rule__Imports__ImportsAssignment_1
            {
            pushFollow(FOLLOW_rule__Imports__ImportsAssignment_1_in_rule__Imports__Group__1__Impl2637);
            rule__Imports__ImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getImportsAssignment_1()); 

            }

            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: ( ( rule__Imports__ImportsAssignment_1 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( rule__Imports__ImportsAssignment_1 )*
            {
             before(grammarAccess.getImportsAccess().getImportsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( rule__Imports__ImportsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:2: rule__Imports__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Imports__ImportsAssignment_1_in_rule__Imports__Group__1__Impl2649);
            	    rule__Imports__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getImportsAccess().getImportsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Imports__Group__1__Impl"


    // $ANTLR start "rule__Imports__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: rule__Imports__Group__2 : rule__Imports__Group__2__Impl ;
    public final void rule__Imports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( rule__Imports__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:2: rule__Imports__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__22682);
            rule__Imports__Group__2__Impl();

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
    // $ANTLR end "rule__Imports__Group__2"


    // $ANTLR start "rule__Imports__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: rule__Imports__Group__2__Impl : ( '</Imports>' ) ;
    public final void rule__Imports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ( '</Imports>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ( '</Imports>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ( '</Imports>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: '</Imports>'
            {
             before(grammarAccess.getImportsAccess().getImportsKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Imports__Group__2__Impl2710); 
             after(grammarAccess.getImportsAccess().getImportsKeyword_2()); 

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
    // $ANTLR end "rule__Imports__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02747);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02750);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: rule__Import__Group__0__Impl : ( '<Import>' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: ( ( '<Import>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: ( '<Import>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: ( '<Import>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: '<Import>'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl2778); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12809);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__12812);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: rule__Import__Group__1__Impl : ( ruleFilename ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( ( ruleFilename ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ( ruleFilename )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ( ruleFilename )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ruleFilename
            {
             before(grammarAccess.getImportAccess().getFilenameParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFilename_in_rule__Import__Group__1__Impl2839);
            ruleFilename();

            state._fsp--;

             after(grammarAccess.getImportAccess().getFilenameParserRuleCall_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: ( rule__Import__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__22868);
            rule__Import__Group__2__Impl();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: rule__Import__Group__2__Impl : ( '</Import>' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1415:1: ( ( '</Import>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: ( '</Import>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: ( '</Import>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: '</Import>'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Import__Group__2__Impl2896); 
             after(grammarAccess.getImportAccess().getImportKeyword_2()); 

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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Events__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: rule__Events__Group__0 : rule__Events__Group__0__Impl rule__Events__Group__1 ;
    public final void rule__Events__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: ( rule__Events__Group__0__Impl rule__Events__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:2: rule__Events__Group__0__Impl rule__Events__Group__1
            {
            pushFollow(FOLLOW_rule__Events__Group__0__Impl_in_rule__Events__Group__02933);
            rule__Events__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Events__Group__1_in_rule__Events__Group__02936);
            rule__Events__Group__1();

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
    // $ANTLR end "rule__Events__Group__0"


    // $ANTLR start "rule__Events__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: rule__Events__Group__0__Impl : ( '<Event>' ) ;
    public final void rule__Events__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( '<Event>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( '<Event>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( '<Event>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: '<Event>'
            {
             before(grammarAccess.getEventsAccess().getEventKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Events__Group__0__Impl2964); 
             after(grammarAccess.getEventsAccess().getEventKeyword_0()); 

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
    // $ANTLR end "rule__Events__Group__0__Impl"


    // $ANTLR start "rule__Events__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: rule__Events__Group__1 : rule__Events__Group__1__Impl rule__Events__Group__2 ;
    public final void rule__Events__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( rule__Events__Group__1__Impl rule__Events__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:2: rule__Events__Group__1__Impl rule__Events__Group__2
            {
            pushFollow(FOLLOW_rule__Events__Group__1__Impl_in_rule__Events__Group__12995);
            rule__Events__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Events__Group__2_in_rule__Events__Group__12998);
            rule__Events__Group__2();

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
    // $ANTLR end "rule__Events__Group__1"


    // $ANTLR start "rule__Events__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: rule__Events__Group__1__Impl : ( ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* ) ) ;
    public final void rule__Events__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( ( ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( ( rule__Events__EventsAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( rule__Events__EventsAssignment_1 )
            {
             before(grammarAccess.getEventsAccess().getEventsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ( rule__Events__EventsAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:2: rule__Events__EventsAssignment_1
            {
            pushFollow(FOLLOW_rule__Events__EventsAssignment_1_in_rule__Events__Group__1__Impl3027);
            rule__Events__EventsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventsAccess().getEventsAssignment_1()); 

            }

            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( ( rule__Events__EventsAssignment_1 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( rule__Events__EventsAssignment_1 )*
            {
             before(grammarAccess.getEventsAccess().getEventsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( rule__Events__EventsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:2: rule__Events__EventsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Events__EventsAssignment_1_in_rule__Events__Group__1__Impl3039);
            	    rule__Events__EventsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEventsAccess().getEventsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Events__Group__1__Impl"


    // $ANTLR start "rule__Events__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: rule__Events__Group__2 : rule__Events__Group__2__Impl ;
    public final void rule__Events__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: ( rule__Events__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:2: rule__Events__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Events__Group__2__Impl_in_rule__Events__Group__23072);
            rule__Events__Group__2__Impl();

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
    // $ANTLR end "rule__Events__Group__2"


    // $ANTLR start "rule__Events__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: rule__Events__Group__2__Impl : ( '</Events>' ) ;
    public final void rule__Events__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( ( '</Events>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( '</Events>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( '</Events>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: '</Events>'
            {
             before(grammarAccess.getEventsAccess().getEventsKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Events__Group__2__Impl3100); 
             after(grammarAccess.getEventsAccess().getEventsKeyword_2()); 

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
    // $ANTLR end "rule__Events__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03137);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03140);
            rule__Event__Group__1();

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
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: rule__Event__Group__0__Impl : ( '<Event>' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( ( '<Event>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( '<Event>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( '<Event>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: '<Event>'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Event__Group__0__Impl3168); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

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
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13199);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__13202);
            rule__Event__Group__2();

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
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: ( rule__Event__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:2: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl3229);
            rule__Event__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__23259);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__3_in_rule__Event__Group__23262);
            rule__Event__Group__3();

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
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: rule__Event__Group__2__Impl : ( ( rule__Event__EventTypeAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( ( ( rule__Event__EventTypeAssignment_2 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: ( ( rule__Event__EventTypeAssignment_2 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: ( ( rule__Event__EventTypeAssignment_2 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: ( rule__Event__EventTypeAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getEventTypeAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: ( rule__Event__EventTypeAssignment_2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:2: rule__Event__EventTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Event__EventTypeAssignment_2_in_rule__Event__Group__2__Impl3289);
            rule__Event__EventTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventTypeAssignment_2()); 

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
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__33319);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__4_in_rule__Event__Group__33322);
            rule__Event__Group__4();

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
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: rule__Event__Group__3__Impl : ( ( rule__Event__ParameterAssignment_3 )* ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( ( ( rule__Event__ParameterAssignment_3 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ( rule__Event__ParameterAssignment_3 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ( rule__Event__ParameterAssignment_3 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( rule__Event__ParameterAssignment_3 )*
            {
             before(grammarAccess.getEventAccess().getParameterAssignment_3()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( rule__Event__ParameterAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:2: rule__Event__ParameterAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Event__ParameterAssignment_3_in_rule__Event__Group__3__Impl3349);
            	    rule__Event__ParameterAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getParameterAssignment_3()); 

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
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1657:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( rule__Event__Group__4__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:2: rule__Event__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__43380);
            rule__Event__Group__4__Impl();

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
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: rule__Event__Group__4__Impl : ( '</Event>' ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ( ( '</Event>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( '</Event>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( '</Event>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: '</Event>'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Event__Group__4__Impl3408); 
             after(grammarAccess.getEventAccess().getEventKeyword_4()); 

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
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_rule__Parameters__Group__0__Impl_in_rule__Parameters__Group__03449);
            rule__Parameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameters__Group__1_in_rule__Parameters__Group__03452);
            rule__Parameters__Group__1();

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
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: rule__Parameters__Group__0__Impl : ( '<Parameters>' ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( ( '<Parameters>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( '<Parameters>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( '<Parameters>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1715:1: '<Parameters>'
            {
             before(grammarAccess.getParametersAccess().getParametersKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Parameters__Group__0__Impl3480); 
             after(grammarAccess.getParametersAccess().getParametersKeyword_0()); 

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
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl rule__Parameters__Group__2 ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: ( rule__Parameters__Group__1__Impl rule__Parameters__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:2: rule__Parameters__Group__1__Impl rule__Parameters__Group__2
            {
            pushFollow(FOLLOW_rule__Parameters__Group__1__Impl_in_rule__Parameters__Group__13511);
            rule__Parameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameters__Group__2_in_rule__Parameters__Group__13514);
            rule__Parameters__Group__2();

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
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: rule__Parameters__Group__1__Impl : ( ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* ) ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( ( ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ( ( rule__Parameters__ParametersAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: ( rule__Parameters__ParametersAssignment_1 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:1: ( rule__Parameters__ParametersAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:2: rule__Parameters__ParametersAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameters__ParametersAssignment_1_in_rule__Parameters__Group__1__Impl3543);
            rule__Parameters__ParametersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getParametersAssignment_1()); 

            }

            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: ( ( rule__Parameters__ParametersAssignment_1 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: ( rule__Parameters__ParametersAssignment_1 )*
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( rule__Parameters__ParametersAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:2: rule__Parameters__ParametersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Parameters__ParametersAssignment_1_in_rule__Parameters__Group__1__Impl3555);
            	    rule__Parameters__ParametersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getParametersAccess().getParametersAssignment_1()); 

            }


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
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: rule__Parameters__Group__2 : rule__Parameters__Group__2__Impl ;
    public final void rule__Parameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( rule__Parameters__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:2: rule__Parameters__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameters__Group__2__Impl_in_rule__Parameters__Group__23588);
            rule__Parameters__Group__2__Impl();

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
    // $ANTLR end "rule__Parameters__Group__2"


    // $ANTLR start "rule__Parameters__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: rule__Parameters__Group__2__Impl : ( '</Parameters>' ) ;
    public final void rule__Parameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( '</Parameters>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( '</Parameters>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( '</Parameters>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: '</Parameters>'
            {
             before(grammarAccess.getParametersAccess().getParametersKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Parameters__Group__2__Impl3616); 
             after(grammarAccess.getParametersAccess().getParametersKeyword_2()); 

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
    // $ANTLR end "rule__Parameters__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03653);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03656);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: rule__Parameter__Group__0__Impl : ( '<Parameter>' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( ( '<Parameter>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: ( '<Parameter>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: ( '<Parameter>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: '<Parameter>'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Parameter__Group__0__Impl3684); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13715);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__13718);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: ( rule__Parameter__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3745);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__23775);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__23778);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: rule__Parameter__Group__2__Impl : ( ruleValue ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ( ( ruleValue ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( ruleValue )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( ruleValue )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ruleValue
            {
             before(grammarAccess.getParameterAccess().getValueParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Parameter__Group__2__Impl3805);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueParserRuleCall_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( rule__Parameter__Group__3__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__33834);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: rule__Parameter__Group__3__Impl : ( '</Parameter>' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: ( ( '</Parameter>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: ( '</Parameter>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: ( '</Parameter>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: '</Parameter>'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Parameter__Group__3__Impl3862); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1927:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__03901);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group__1_in_rule__Value__Group__03904);
            rule__Value__Group__1();

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
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: rule__Value__Group__0__Impl : ( '<Value>' ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: ( ( '<Value>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: ( '<Value>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: ( '<Value>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: '<Value>'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Value__Group__0__Impl3932); 
             after(grammarAccess.getValueAccess().getValueKeyword_0()); 

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
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1958:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__13963);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group__2_in_rule__Value__Group__13966);
            rule__Value__Group__2();

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
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:1: rule__Value__Group__1__Impl : ( ruleCode ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( ( ruleCode ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: ( ruleCode )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: ( ruleCode )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: ruleCode
            {
             before(grammarAccess.getValueAccess().getCodeParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleCode_in_rule__Value__Group__1__Impl3993);
            ruleCode();

            state._fsp--;

             after(grammarAccess.getValueAccess().getCodeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: rule__Value__Group__2 : rule__Value__Group__2__Impl ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( rule__Value__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:2: rule__Value__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group__2__Impl_in_rule__Value__Group__24022);
            rule__Value__Group__2__Impl();

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
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: rule__Value__Group__2__Impl : ( '</Value>' ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:1: ( ( '</Value>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( '</Value>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( '</Value>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: '</Value>'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Value__Group__2__Impl4050); 
             after(grammarAccess.getValueAccess().getValueKeyword_2()); 

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
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__Plans__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: rule__Plans__Group__0 : rule__Plans__Group__0__Impl rule__Plans__Group__1 ;
    public final void rule__Plans__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( rule__Plans__Group__0__Impl rule__Plans__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:2: rule__Plans__Group__0__Impl rule__Plans__Group__1
            {
            pushFollow(FOLLOW_rule__Plans__Group__0__Impl_in_rule__Plans__Group__04087);
            rule__Plans__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plans__Group__1_in_rule__Plans__Group__04090);
            rule__Plans__Group__1();

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
    // $ANTLR end "rule__Plans__Group__0"


    // $ANTLR start "rule__Plans__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: rule__Plans__Group__0__Impl : ( '<Plans>' ) ;
    public final void rule__Plans__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ( '<Plans>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( '<Plans>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( '<Plans>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: '<Plans>'
            {
             before(grammarAccess.getPlansAccess().getPlansKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Plans__Group__0__Impl4118); 
             after(grammarAccess.getPlansAccess().getPlansKeyword_0()); 

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
    // $ANTLR end "rule__Plans__Group__0__Impl"


    // $ANTLR start "rule__Plans__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: rule__Plans__Group__1 : rule__Plans__Group__1__Impl rule__Plans__Group__2 ;
    public final void rule__Plans__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( rule__Plans__Group__1__Impl rule__Plans__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:2: rule__Plans__Group__1__Impl rule__Plans__Group__2
            {
            pushFollow(FOLLOW_rule__Plans__Group__1__Impl_in_rule__Plans__Group__14149);
            rule__Plans__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plans__Group__2_in_rule__Plans__Group__14152);
            rule__Plans__Group__2();

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
    // $ANTLR end "rule__Plans__Group__1"


    // $ANTLR start "rule__Plans__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: rule__Plans__Group__1__Impl : ( ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* ) ) ;
    public final void rule__Plans__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( ( ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: ( ( rule__Plans__PlansAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( rule__Plans__PlansAssignment_1 )
            {
             before(grammarAccess.getPlansAccess().getPlansAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( rule__Plans__PlansAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:2: rule__Plans__PlansAssignment_1
            {
            pushFollow(FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl4181);
            rule__Plans__PlansAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlansAccess().getPlansAssignment_1()); 

            }

            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: ( ( rule__Plans__PlansAssignment_1 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ( rule__Plans__PlansAssignment_1 )*
            {
             before(grammarAccess.getPlansAccess().getPlansAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( rule__Plans__PlansAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:2: rule__Plans__PlansAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl4193);
            	    rule__Plans__PlansAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPlansAccess().getPlansAssignment_1()); 

            }


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
    // $ANTLR end "rule__Plans__Group__1__Impl"


    // $ANTLR start "rule__Plans__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: rule__Plans__Group__2 : rule__Plans__Group__2__Impl ;
    public final void rule__Plans__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ( rule__Plans__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:2: rule__Plans__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Plans__Group__2__Impl_in_rule__Plans__Group__24226);
            rule__Plans__Group__2__Impl();

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
    // $ANTLR end "rule__Plans__Group__2"


    // $ANTLR start "rule__Plans__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: rule__Plans__Group__2__Impl : ( '</Plans>' ) ;
    public final void rule__Plans__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: ( ( '</Plans>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: ( '</Plans>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: ( '</Plans>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: '</Plans>'
            {
             before(grammarAccess.getPlansAccess().getPlansKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Plans__Group__2__Impl4254); 
             after(grammarAccess.getPlansAccess().getPlansKeyword_2()); 

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
    // $ANTLR end "rule__Plans__Group__2__Impl"


    // $ANTLR start "rule__Plan__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:1: rule__Plan__Group__0 : rule__Plan__Group__0__Impl rule__Plan__Group__1 ;
    public final void rule__Plan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( rule__Plan__Group__0__Impl rule__Plan__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:2: rule__Plan__Group__0__Impl rule__Plan__Group__1
            {
            pushFollow(FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__04291);
            rule__Plan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__04294);
            rule__Plan__Group__1();

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
    // $ANTLR end "rule__Plan__Group__0"


    // $ANTLR start "rule__Plan__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: rule__Plan__Group__0__Impl : ( '<Plan>' ) ;
    public final void rule__Plan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: ( ( '<Plan>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( '<Plan>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( '<Plan>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: '<Plan>'
            {
             before(grammarAccess.getPlanAccess().getPlanKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Plan__Group__0__Impl4322); 
             after(grammarAccess.getPlanAccess().getPlanKeyword_0()); 

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
    // $ANTLR end "rule__Plan__Group__0__Impl"


    // $ANTLR start "rule__Plan__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: rule__Plan__Group__1 : rule__Plan__Group__1__Impl rule__Plan__Group__2 ;
    public final void rule__Plan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( rule__Plan__Group__1__Impl rule__Plan__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:2: rule__Plan__Group__1__Impl rule__Plan__Group__2
            {
            pushFollow(FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__14353);
            rule__Plan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__14356);
            rule__Plan__Group__2();

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
    // $ANTLR end "rule__Plan__Group__1"


    // $ANTLR start "rule__Plan__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: rule__Plan__Group__1__Impl : ( ( rule__Plan__NameAssignment_1 ) ) ;
    public final void rule__Plan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( ( ( rule__Plan__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ( ( rule__Plan__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ( ( rule__Plan__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( rule__Plan__NameAssignment_1 )
            {
             before(grammarAccess.getPlanAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ( rule__Plan__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:2: rule__Plan__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Plan__NameAssignment_1_in_rule__Plan__Group__1__Impl4383);
            rule__Plan__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Plan__Group__1__Impl"


    // $ANTLR start "rule__Plan__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: rule__Plan__Group__2 : rule__Plan__Group__2__Impl rule__Plan__Group__3 ;
    public final void rule__Plan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: ( rule__Plan__Group__2__Impl rule__Plan__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:2: rule__Plan__Group__2__Impl rule__Plan__Group__3
            {
            pushFollow(FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__24413);
            rule__Plan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__24416);
            rule__Plan__Group__3();

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
    // $ANTLR end "rule__Plan__Group__2"


    // $ANTLR start "rule__Plan__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: rule__Plan__Group__2__Impl : ( ( rule__Plan__BodyAssignment_2 ) ) ;
    public final void rule__Plan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( ( ( rule__Plan__BodyAssignment_2 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ( ( rule__Plan__BodyAssignment_2 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ( ( rule__Plan__BodyAssignment_2 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: ( rule__Plan__BodyAssignment_2 )
            {
             before(grammarAccess.getPlanAccess().getBodyAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: ( rule__Plan__BodyAssignment_2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:2: rule__Plan__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Plan__BodyAssignment_2_in_rule__Plan__Group__2__Impl4443);
            rule__Plan__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getBodyAssignment_2()); 

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
    // $ANTLR end "rule__Plan__Group__2__Impl"


    // $ANTLR start "rule__Plan__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: rule__Plan__Group__3 : rule__Plan__Group__3__Impl rule__Plan__Group__4 ;
    public final void rule__Plan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: ( rule__Plan__Group__3__Impl rule__Plan__Group__4 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:2: rule__Plan__Group__3__Impl rule__Plan__Group__4
            {
            pushFollow(FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__34473);
            rule__Plan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__34476);
            rule__Plan__Group__4();

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
    // $ANTLR end "rule__Plan__Group__3"


    // $ANTLR start "rule__Plan__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: rule__Plan__Group__3__Impl : ( ( rule__Plan__TriggerAssignment_3 ) ) ;
    public final void rule__Plan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( ( ( rule__Plan__TriggerAssignment_3 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ( ( rule__Plan__TriggerAssignment_3 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ( ( rule__Plan__TriggerAssignment_3 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( rule__Plan__TriggerAssignment_3 )
            {
             before(grammarAccess.getPlanAccess().getTriggerAssignment_3()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: ( rule__Plan__TriggerAssignment_3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:2: rule__Plan__TriggerAssignment_3
            {
            pushFollow(FOLLOW_rule__Plan__TriggerAssignment_3_in_rule__Plan__Group__3__Impl4503);
            rule__Plan__TriggerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getTriggerAssignment_3()); 

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
    // $ANTLR end "rule__Plan__Group__3__Impl"


    // $ANTLR start "rule__Plan__Group__4"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: rule__Plan__Group__4 : rule__Plan__Group__4__Impl ;
    public final void rule__Plan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( rule__Plan__Group__4__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:2: rule__Plan__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__44533);
            rule__Plan__Group__4__Impl();

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
    // $ANTLR end "rule__Plan__Group__4"


    // $ANTLR start "rule__Plan__Group__4__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: rule__Plan__Group__4__Impl : ( '</Plan>' ) ;
    public final void rule__Plan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( ( '</Plan>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( '</Plan>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( '</Plan>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: '</Plan>'
            {
             before(grammarAccess.getPlanAccess().getPlanKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Plan__Group__4__Impl4561); 
             after(grammarAccess.getPlanAccess().getPlanKeyword_4()); 

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
    // $ANTLR end "rule__Plan__Group__4__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04602);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04605);
            rule__Body__Group__1();

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
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: rule__Body__Group__0__Impl : ( '<Body>' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( ( '<Body>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: ( '<Body>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: ( '<Body>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: '<Body>'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Body__Group__0__Impl4633); 
             after(grammarAccess.getBodyAccess().getBodyKeyword_0()); 

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
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__14664);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__14667);
            rule__Body__Group__2();

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
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: rule__Body__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( ( RULE_STRING ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: ( RULE_STRING )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: ( RULE_STRING )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: RULE_STRING
            {
             before(grammarAccess.getBodyAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Body__Group__1__Impl4694); 
             after(grammarAccess.getBodyAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: rule__Body__Group__2 : rule__Body__Group__2__Impl ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:1: ( rule__Body__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:2: rule__Body__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__24723);
            rule__Body__Group__2__Impl();

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
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: rule__Body__Group__2__Impl : ( '</Body>' ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:1: ( ( '</Body>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( '</Body>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( '</Body>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: '</Body>'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Body__Group__2__Impl4751); 
             after(grammarAccess.getBodyAccess().getBodyKeyword_2()); 

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
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Trigger__Group_0__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: rule__Trigger__Group_0__0 : rule__Trigger__Group_0__0__Impl rule__Trigger__Group_0__1 ;
    public final void rule__Trigger__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( rule__Trigger__Group_0__0__Impl rule__Trigger__Group_0__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:2: rule__Trigger__Group_0__0__Impl rule__Trigger__Group_0__1
            {
            pushFollow(FOLLOW_rule__Trigger__Group_0__0__Impl_in_rule__Trigger__Group_0__04788);
            rule__Trigger__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group_0__1_in_rule__Trigger__Group_0__04791);
            rule__Trigger__Group_0__1();

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
    // $ANTLR end "rule__Trigger__Group_0__0"


    // $ANTLR start "rule__Trigger__Group_0__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: rule__Trigger__Group_0__0__Impl : ( '<Trigger>' ) ;
    public final void rule__Trigger__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: ( ( '<Trigger>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( '<Trigger>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( '<Trigger>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: '<Trigger>'
            {
             before(grammarAccess.getTriggerAccess().getTriggerKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Trigger__Group_0__0__Impl4819); 
             after(grammarAccess.getTriggerAccess().getTriggerKeyword_0_0()); 

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
    // $ANTLR end "rule__Trigger__Group_0__0__Impl"


    // $ANTLR start "rule__Trigger__Group_0__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: rule__Trigger__Group_0__1 : rule__Trigger__Group_0__1__Impl ;
    public final void rule__Trigger__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rule__Trigger__Group_0__1__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:2: rule__Trigger__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Trigger__Group_0__1__Impl_in_rule__Trigger__Group_0__14850);
            rule__Trigger__Group_0__1__Impl();

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
    // $ANTLR end "rule__Trigger__Group_0__1"


    // $ANTLR start "rule__Trigger__Group_0__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: rule__Trigger__Group_0__1__Impl : ( ruleEvent ) ;
    public final void rule__Trigger__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: ( ( ruleEvent ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( ruleEvent )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( ruleEvent )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ruleEvent
            {
             before(grammarAccess.getTriggerAccess().getEventParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Trigger__Group_0__1__Impl4877);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getEventParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Trigger__Group_0__1__Impl"


    // $ANTLR start "rule__Trigger__Group_1__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:1: rule__Trigger__Group_1__0 : rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1 ;
    public final void rule__Trigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:2: rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1
            {
            pushFollow(FOLLOW_rule__Trigger__Group_1__0__Impl_in_rule__Trigger__Group_1__04910);
            rule__Trigger__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group_1__1_in_rule__Trigger__Group_1__04913);
            rule__Trigger__Group_1__1();

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
    // $ANTLR end "rule__Trigger__Group_1__0"


    // $ANTLR start "rule__Trigger__Group_1__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: rule__Trigger__Group_1__0__Impl : ( ruleGoal ) ;
    public final void rule__Trigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: ( ( ruleGoal ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:1: ( ruleGoal )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:1: ( ruleGoal )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: ruleGoal
            {
             before(grammarAccess.getTriggerAccess().getGoalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGoal_in_rule__Trigger__Group_1__0__Impl4940);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getGoalParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Trigger__Group_1__0__Impl"


    // $ANTLR start "rule__Trigger__Group_1__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: rule__Trigger__Group_1__1 : rule__Trigger__Group_1__1__Impl ;
    public final void rule__Trigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( rule__Trigger__Group_1__1__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:2: rule__Trigger__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Trigger__Group_1__1__Impl_in_rule__Trigger__Group_1__14969);
            rule__Trigger__Group_1__1__Impl();

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
    // $ANTLR end "rule__Trigger__Group_1__1"


    // $ANTLR start "rule__Trigger__Group_1__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: rule__Trigger__Group_1__1__Impl : ( '</Trigger>' ) ;
    public final void rule__Trigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( ( '</Trigger>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( '</Trigger>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( '</Trigger>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: '</Trigger>'
            {
             before(grammarAccess.getTriggerAccess().getTriggerKeyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__Trigger__Group_1__1__Impl4997); 
             after(grammarAccess.getTriggerAccess().getTriggerKeyword_1_1()); 

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
    // $ANTLR end "rule__Trigger__Group_1__1__Impl"


    // $ANTLR start "rule__BeliefSet__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:1: rule__BeliefSet__Group__0 : rule__BeliefSet__Group__0__Impl rule__BeliefSet__Group__1 ;
    public final void rule__BeliefSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( rule__BeliefSet__Group__0__Impl rule__BeliefSet__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:2: rule__BeliefSet__Group__0__Impl rule__BeliefSet__Group__1
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__0__Impl_in_rule__BeliefSet__Group__05032);
            rule__BeliefSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BeliefSet__Group__1_in_rule__BeliefSet__Group__05035);
            rule__BeliefSet__Group__1();

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
    // $ANTLR end "rule__BeliefSet__Group__0"


    // $ANTLR start "rule__BeliefSet__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: rule__BeliefSet__Group__0__Impl : ( '<BeliefSet>' ) ;
    public final void rule__BeliefSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: ( ( '<BeliefSet>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( '<BeliefSet>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( '<BeliefSet>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: '<BeliefSet>'
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__BeliefSet__Group__0__Impl5063); 
             after(grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_0()); 

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
    // $ANTLR end "rule__BeliefSet__Group__0__Impl"


    // $ANTLR start "rule__BeliefSet__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: rule__BeliefSet__Group__1 : rule__BeliefSet__Group__1__Impl rule__BeliefSet__Group__2 ;
    public final void rule__BeliefSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: ( rule__BeliefSet__Group__1__Impl rule__BeliefSet__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:2: rule__BeliefSet__Group__1__Impl rule__BeliefSet__Group__2
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__1__Impl_in_rule__BeliefSet__Group__15094);
            rule__BeliefSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BeliefSet__Group__2_in_rule__BeliefSet__Group__15097);
            rule__BeliefSet__Group__2();

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
    // $ANTLR end "rule__BeliefSet__Group__1"


    // $ANTLR start "rule__BeliefSet__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: rule__BeliefSet__Group__1__Impl : ( ( rule__BeliefSet__NameAssignment_1 ) ) ;
    public final void rule__BeliefSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( ( ( rule__BeliefSet__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( ( rule__BeliefSet__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( ( rule__BeliefSet__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( rule__BeliefSet__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefSetAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ( rule__BeliefSet__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:2: rule__BeliefSet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BeliefSet__NameAssignment_1_in_rule__BeliefSet__Group__1__Impl5124);
            rule__BeliefSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBeliefSetAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BeliefSet__Group__1__Impl"


    // $ANTLR start "rule__BeliefSet__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: rule__BeliefSet__Group__2 : rule__BeliefSet__Group__2__Impl rule__BeliefSet__Group__3 ;
    public final void rule__BeliefSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: ( rule__BeliefSet__Group__2__Impl rule__BeliefSet__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:2: rule__BeliefSet__Group__2__Impl rule__BeliefSet__Group__3
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__2__Impl_in_rule__BeliefSet__Group__25154);
            rule__BeliefSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BeliefSet__Group__3_in_rule__BeliefSet__Group__25157);
            rule__BeliefSet__Group__3();

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
    // $ANTLR end "rule__BeliefSet__Group__2"


    // $ANTLR start "rule__BeliefSet__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__BeliefSet__Group__2__Impl : ( ( ( rule__BeliefSet__BeliefSetAssignment_2 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_2 )* ) ) ;
    public final void rule__BeliefSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( ( ( ( rule__BeliefSet__BeliefSetAssignment_2 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_2 )* ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ( ( rule__BeliefSet__BeliefSetAssignment_2 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_2 )* ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ( ( rule__BeliefSet__BeliefSetAssignment_2 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_2 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( ( rule__BeliefSet__BeliefSetAssignment_2 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_2 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( ( rule__BeliefSet__BeliefSetAssignment_2 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( rule__BeliefSet__BeliefSetAssignment_2 )
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( rule__BeliefSet__BeliefSetAssignment_2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:2: rule__BeliefSet__BeliefSetAssignment_2
            {
            pushFollow(FOLLOW_rule__BeliefSet__BeliefSetAssignment_2_in_rule__BeliefSet__Group__2__Impl5186);
            rule__BeliefSet__BeliefSetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_2()); 

            }

            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: ( ( rule__BeliefSet__BeliefSetAssignment_2 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( rule__BeliefSet__BeliefSetAssignment_2 )*
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( rule__BeliefSet__BeliefSetAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:2: rule__BeliefSet__BeliefSetAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BeliefSet__BeliefSetAssignment_2_in_rule__BeliefSet__Group__2__Impl5198);
            	    rule__BeliefSet__BeliefSetAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_2()); 

            }


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
    // $ANTLR end "rule__BeliefSet__Group__2__Impl"


    // $ANTLR start "rule__BeliefSet__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: rule__BeliefSet__Group__3 : rule__BeliefSet__Group__3__Impl ;
    public final void rule__BeliefSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( rule__BeliefSet__Group__3__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:2: rule__BeliefSet__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__3__Impl_in_rule__BeliefSet__Group__35231);
            rule__BeliefSet__Group__3__Impl();

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
    // $ANTLR end "rule__BeliefSet__Group__3"


    // $ANTLR start "rule__BeliefSet__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: rule__BeliefSet__Group__3__Impl : ( '</BeliefSet>' ) ;
    public final void rule__BeliefSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: ( ( '</BeliefSet>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ( '</BeliefSet>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ( '</BeliefSet>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: '</BeliefSet>'
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__BeliefSet__Group__3__Impl5259); 
             after(grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_3()); 

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
    // $ANTLR end "rule__BeliefSet__Group__3__Impl"


    // $ANTLR start "rule__Belief__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: rule__Belief__Group__0 : rule__Belief__Group__0__Impl rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( rule__Belief__Group__0__Impl rule__Belief__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:2: rule__Belief__Group__0__Impl rule__Belief__Group__1
            {
            pushFollow(FOLLOW_rule__Belief__Group__0__Impl_in_rule__Belief__Group__05298);
            rule__Belief__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__05301);
            rule__Belief__Group__1();

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
    // $ANTLR end "rule__Belief__Group__0"


    // $ANTLR start "rule__Belief__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: rule__Belief__Group__0__Impl : ( '<Belief>' ) ;
    public final void rule__Belief__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( ( '<Belief>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( '<Belief>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( '<Belief>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: '<Belief>'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Belief__Group__0__Impl5329); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 

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
    // $ANTLR end "rule__Belief__Group__0__Impl"


    // $ANTLR start "rule__Belief__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: rule__Belief__Group__1 : rule__Belief__Group__1__Impl rule__Belief__Group__2 ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2675:1: ( rule__Belief__Group__1__Impl rule__Belief__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:2: rule__Belief__Group__1__Impl rule__Belief__Group__2
            {
            pushFollow(FOLLOW_rule__Belief__Group__1__Impl_in_rule__Belief__Group__15360);
            rule__Belief__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Belief__Group__2_in_rule__Belief__Group__15363);
            rule__Belief__Group__2();

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
    // $ANTLR end "rule__Belief__Group__1"


    // $ANTLR start "rule__Belief__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: rule__Belief__Group__1__Impl : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: ( rule__Belief__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__1__Impl5390);
            rule__Belief__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBeliefAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Belief__Group__1__Impl"


    // $ANTLR start "rule__Belief__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: rule__Belief__Group__2 : rule__Belief__Group__2__Impl rule__Belief__Group__3 ;
    public final void rule__Belief__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: ( rule__Belief__Group__2__Impl rule__Belief__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:2: rule__Belief__Group__2__Impl rule__Belief__Group__3
            {
            pushFollow(FOLLOW_rule__Belief__Group__2__Impl_in_rule__Belief__Group__25420);
            rule__Belief__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Belief__Group__3_in_rule__Belief__Group__25423);
            rule__Belief__Group__3();

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
    // $ANTLR end "rule__Belief__Group__2"


    // $ANTLR start "rule__Belief__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: rule__Belief__Group__2__Impl : ( ( rule__Belief__FactAssignment_2 )* ) ;
    public final void rule__Belief__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: ( ( ( rule__Belief__FactAssignment_2 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( ( rule__Belief__FactAssignment_2 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( ( rule__Belief__FactAssignment_2 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: ( rule__Belief__FactAssignment_2 )*
            {
             before(grammarAccess.getBeliefAccess().getFactAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: ( rule__Belief__FactAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:2: rule__Belief__FactAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Belief__FactAssignment_2_in_rule__Belief__Group__2__Impl5450);
            	    rule__Belief__FactAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBeliefAccess().getFactAssignment_2()); 

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
    // $ANTLR end "rule__Belief__Group__2__Impl"


    // $ANTLR start "rule__Belief__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: rule__Belief__Group__3 : rule__Belief__Group__3__Impl ;
    public final void rule__Belief__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: ( rule__Belief__Group__3__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:2: rule__Belief__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Belief__Group__3__Impl_in_rule__Belief__Group__35481);
            rule__Belief__Group__3__Impl();

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
    // $ANTLR end "rule__Belief__Group__3"


    // $ANTLR start "rule__Belief__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: rule__Belief__Group__3__Impl : ( '</Belief>' ) ;
    public final void rule__Belief__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: ( ( '</Belief>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: ( '</Belief>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: ( '</Belief>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: '</Belief>'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__Belief__Group__3__Impl5509); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_3()); 

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
    // $ANTLR end "rule__Belief__Group__3__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__05548);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__05551);
            rule__Fact__Group__1();

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
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: rule__Fact__Group__0__Impl : ( '<Fact>' ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( ( '<Fact>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( '<Fact>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( '<Fact>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: '<Fact>'
            {
             before(grammarAccess.getFactAccess().getFactKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Fact__Group__0__Impl5579); 
             after(grammarAccess.getFactAccess().getFactKeyword_0()); 

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
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__15610);
            rule__Fact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__15613);
            rule__Fact__Group__2();

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
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2810:1: rule__Fact__Group__1__Impl : ( ( rule__Fact__StatementsAssignment_1 ) ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( ( ( rule__Fact__StatementsAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( ( rule__Fact__StatementsAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( ( rule__Fact__StatementsAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( rule__Fact__StatementsAssignment_1 )
            {
             before(grammarAccess.getFactAccess().getStatementsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( rule__Fact__StatementsAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:2: rule__Fact__StatementsAssignment_1
            {
            pushFollow(FOLLOW_rule__Fact__StatementsAssignment_1_in_rule__Fact__Group__1__Impl5640);
            rule__Fact__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getStatementsAssignment_1()); 

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
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Fact__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl rule__Fact__Group__3 ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( rule__Fact__Group__2__Impl rule__Fact__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:2: rule__Fact__Group__2__Impl rule__Fact__Group__3
            {
            pushFollow(FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__25670);
            rule__Fact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__3_in_rule__Fact__Group__25673);
            rule__Fact__Group__3();

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
    // $ANTLR end "rule__Fact__Group__2"


    // $ANTLR start "rule__Fact__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:1: rule__Fact__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: ( ( RULE_STRING ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( RULE_STRING )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( RULE_STRING )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: RULE_STRING
            {
             before(grammarAccess.getFactAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fact__Group__2__Impl5700); 
             after(grammarAccess.getFactAccess().getSTRINGTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Fact__Group__2__Impl"


    // $ANTLR start "rule__Fact__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2856:1: rule__Fact__Group__3 : rule__Fact__Group__3__Impl ;
    public final void rule__Fact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: ( rule__Fact__Group__3__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:2: rule__Fact__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group__3__Impl_in_rule__Fact__Group__35729);
            rule__Fact__Group__3__Impl();

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
    // $ANTLR end "rule__Fact__Group__3"


    // $ANTLR start "rule__Fact__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:1: rule__Fact__Group__3__Impl : ( '</Fact>' ) ;
    public final void rule__Fact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: ( ( '</Fact>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: ( '</Fact>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: ( '</Fact>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2873:1: '</Fact>'
            {
             before(grammarAccess.getFactAccess().getFactKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__Fact__Group__3__Impl5757); 
             after(grammarAccess.getFactAccess().getFactKeyword_3()); 

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
    // $ANTLR end "rule__Fact__Group__3__Impl"


    // $ANTLR start "rule__Achieve__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: rule__Achieve__Group__0 : rule__Achieve__Group__0__Impl rule__Achieve__Group__1 ;
    public final void rule__Achieve__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: ( rule__Achieve__Group__0__Impl rule__Achieve__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:2: rule__Achieve__Group__0__Impl rule__Achieve__Group__1
            {
            pushFollow(FOLLOW_rule__Achieve__Group__0__Impl_in_rule__Achieve__Group__05797);
            rule__Achieve__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Achieve__Group__1_in_rule__Achieve__Group__05800);
            rule__Achieve__Group__1();

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
    // $ANTLR end "rule__Achieve__Group__0"


    // $ANTLR start "rule__Achieve__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:1: rule__Achieve__Group__0__Impl : ( '<Achieve>' ) ;
    public final void rule__Achieve__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: ( ( '<Achieve>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( '<Achieve>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( '<Achieve>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: '<Achieve>'
            {
             before(grammarAccess.getAchieveAccess().getAchieveKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Achieve__Group__0__Impl5828); 
             after(grammarAccess.getAchieveAccess().getAchieveKeyword_0()); 

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
    // $ANTLR end "rule__Achieve__Group__0__Impl"


    // $ANTLR start "rule__Achieve__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: rule__Achieve__Group__1 : rule__Achieve__Group__1__Impl rule__Achieve__Group__2 ;
    public final void rule__Achieve__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2930:1: ( rule__Achieve__Group__1__Impl rule__Achieve__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:2: rule__Achieve__Group__1__Impl rule__Achieve__Group__2
            {
            pushFollow(FOLLOW_rule__Achieve__Group__1__Impl_in_rule__Achieve__Group__15859);
            rule__Achieve__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Achieve__Group__2_in_rule__Achieve__Group__15862);
            rule__Achieve__Group__2();

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
    // $ANTLR end "rule__Achieve__Group__1"


    // $ANTLR start "rule__Achieve__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:1: rule__Achieve__Group__1__Impl : ( ( rule__Achieve__NameAssignment_1 ) ) ;
    public final void rule__Achieve__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: ( ( ( rule__Achieve__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( ( rule__Achieve__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( ( rule__Achieve__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( rule__Achieve__NameAssignment_1 )
            {
             before(grammarAccess.getAchieveAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:1: ( rule__Achieve__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:2: rule__Achieve__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Achieve__NameAssignment_1_in_rule__Achieve__Group__1__Impl5889);
            rule__Achieve__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAchieveAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Achieve__Group__1__Impl"


    // $ANTLR start "rule__Achieve__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: rule__Achieve__Group__2 : rule__Achieve__Group__2__Impl rule__Achieve__Group__3 ;
    public final void rule__Achieve__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: ( rule__Achieve__Group__2__Impl rule__Achieve__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:2: rule__Achieve__Group__2__Impl rule__Achieve__Group__3
            {
            pushFollow(FOLLOW_rule__Achieve__Group__2__Impl_in_rule__Achieve__Group__25919);
            rule__Achieve__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Achieve__Group__3_in_rule__Achieve__Group__25922);
            rule__Achieve__Group__3();

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
    // $ANTLR end "rule__Achieve__Group__2"


    // $ANTLR start "rule__Achieve__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:1: rule__Achieve__Group__2__Impl : ( ( rule__Achieve__ConditionAssignment_2 ) ) ;
    public final void rule__Achieve__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: ( ( ( rule__Achieve__ConditionAssignment_2 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( ( rule__Achieve__ConditionAssignment_2 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( ( rule__Achieve__ConditionAssignment_2 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: ( rule__Achieve__ConditionAssignment_2 )
            {
             before(grammarAccess.getAchieveAccess().getConditionAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: ( rule__Achieve__ConditionAssignment_2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:2: rule__Achieve__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__Achieve__ConditionAssignment_2_in_rule__Achieve__Group__2__Impl5949);
            rule__Achieve__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAchieveAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__Achieve__Group__2__Impl"


    // $ANTLR start "rule__Achieve__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: rule__Achieve__Group__3 : rule__Achieve__Group__3__Impl ;
    public final void rule__Achieve__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: ( rule__Achieve__Group__3__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:2: rule__Achieve__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Achieve__Group__3__Impl_in_rule__Achieve__Group__35979);
            rule__Achieve__Group__3__Impl();

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
    // $ANTLR end "rule__Achieve__Group__3"


    // $ANTLR start "rule__Achieve__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: rule__Achieve__Group__3__Impl : ( '</Achieve>' ) ;
    public final void rule__Achieve__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2999:1: ( ( '</Achieve>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: ( '</Achieve>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: ( '</Achieve>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: '</Achieve>'
            {
             before(grammarAccess.getAchieveAccess().getAchieveKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__Achieve__Group__3__Impl6007); 
             after(grammarAccess.getAchieveAccess().getAchieveKeyword_3()); 

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
    // $ANTLR end "rule__Achieve__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__06046);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__06049);
            rule__Query__Group__1();

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
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: rule__Query__Group__0__Impl : ( '<Query>' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( ( '<Query>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( '<Query>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( '<Query>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: '<Query>'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Query__Group__0__Impl6077); 
             after(grammarAccess.getQueryAccess().getQueryKeyword_0()); 

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
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__16108);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__2_in_rule__Query__Group__16111);
            rule__Query__Group__2();

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
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ( ( rule__Query__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:1: ( rule__Query__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:2: rule__Query__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Query__NameAssignment_1_in_rule__Query__Group__1__Impl6138);
            rule__Query__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_rule__Query__Group__2__Impl_in_rule__Query__Group__26168);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__3_in_rule__Query__Group__26171);
            rule__Query__Group__3();

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
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: rule__Query__Group__2__Impl : ( ( rule__Query__ConditionAssignment_2 ) ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: ( ( ( rule__Query__ConditionAssignment_2 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ( rule__Query__ConditionAssignment_2 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ( rule__Query__ConditionAssignment_2 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( rule__Query__ConditionAssignment_2 )
            {
             before(grammarAccess.getQueryAccess().getConditionAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( rule__Query__ConditionAssignment_2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:2: rule__Query__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__Query__ConditionAssignment_2_in_rule__Query__Group__2__Impl6198);
            rule__Query__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3111:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_rule__Query__Group__3__Impl_in_rule__Query__Group__36228);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__4_in_rule__Query__Group__36231);
            rule__Query__Group__4();

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
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: rule__Query__Group__3__Impl : ( ( rule__Query__ResultAssignment_3 ) ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( ( ( rule__Query__ResultAssignment_3 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ( ( rule__Query__ResultAssignment_3 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ( ( rule__Query__ResultAssignment_3 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: ( rule__Query__ResultAssignment_3 )
            {
             before(grammarAccess.getQueryAccess().getResultAssignment_3()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: ( rule__Query__ResultAssignment_3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:2: rule__Query__ResultAssignment_3
            {
            pushFollow(FOLLOW_rule__Query__ResultAssignment_3_in_rule__Query__Group__3__Impl6258);
            rule__Query__ResultAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getResultAssignment_3()); 

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
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: rule__Query__Group__4 : rule__Query__Group__4__Impl ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( rule__Query__Group__4__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:2: rule__Query__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__4__Impl_in_rule__Query__Group__46288);
            rule__Query__Group__4__Impl();

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
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: rule__Query__Group__4__Impl : ( '</Query>' ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3155:1: ( ( '</Query>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: ( '</Query>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: ( '</Query>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: '</Query>'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__Query__Group__4__Impl6316); 
             after(grammarAccess.getQueryAccess().getQueryKeyword_4()); 

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
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Maintain__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: rule__Maintain__Group__0 : rule__Maintain__Group__0__Impl rule__Maintain__Group__1 ;
    public final void rule__Maintain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: ( rule__Maintain__Group__0__Impl rule__Maintain__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:2: rule__Maintain__Group__0__Impl rule__Maintain__Group__1
            {
            pushFollow(FOLLOW_rule__Maintain__Group__0__Impl_in_rule__Maintain__Group__06357);
            rule__Maintain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Maintain__Group__1_in_rule__Maintain__Group__06360);
            rule__Maintain__Group__1();

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
    // $ANTLR end "rule__Maintain__Group__0"


    // $ANTLR start "rule__Maintain__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: rule__Maintain__Group__0__Impl : ( '<Maintain>' ) ;
    public final void rule__Maintain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:1: ( ( '<Maintain>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:1: ( '<Maintain>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:1: ( '<Maintain>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: '<Maintain>'
            {
             before(grammarAccess.getMaintainAccess().getMaintainKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Maintain__Group__0__Impl6388); 
             after(grammarAccess.getMaintainAccess().getMaintainKeyword_0()); 

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
    // $ANTLR end "rule__Maintain__Group__0__Impl"


    // $ANTLR start "rule__Maintain__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:1: rule__Maintain__Group__1 : rule__Maintain__Group__1__Impl rule__Maintain__Group__2 ;
    public final void rule__Maintain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:1: ( rule__Maintain__Group__1__Impl rule__Maintain__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:2: rule__Maintain__Group__1__Impl rule__Maintain__Group__2
            {
            pushFollow(FOLLOW_rule__Maintain__Group__1__Impl_in_rule__Maintain__Group__16419);
            rule__Maintain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Maintain__Group__2_in_rule__Maintain__Group__16422);
            rule__Maintain__Group__2();

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
    // $ANTLR end "rule__Maintain__Group__1"


    // $ANTLR start "rule__Maintain__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: rule__Maintain__Group__1__Impl : ( ( rule__Maintain__NameAssignment_1 ) ) ;
    public final void rule__Maintain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( ( ( rule__Maintain__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( ( rule__Maintain__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( ( rule__Maintain__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( rule__Maintain__NameAssignment_1 )
            {
             before(grammarAccess.getMaintainAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: ( rule__Maintain__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:2: rule__Maintain__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Maintain__NameAssignment_1_in_rule__Maintain__Group__1__Impl6449);
            rule__Maintain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaintainAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Maintain__Group__1__Impl"


    // $ANTLR start "rule__Maintain__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: rule__Maintain__Group__2 : rule__Maintain__Group__2__Impl rule__Maintain__Group__3 ;
    public final void rule__Maintain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: ( rule__Maintain__Group__2__Impl rule__Maintain__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:2: rule__Maintain__Group__2__Impl rule__Maintain__Group__3
            {
            pushFollow(FOLLOW_rule__Maintain__Group__2__Impl_in_rule__Maintain__Group__26479);
            rule__Maintain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Maintain__Group__3_in_rule__Maintain__Group__26482);
            rule__Maintain__Group__3();

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
    // $ANTLR end "rule__Maintain__Group__2"


    // $ANTLR start "rule__Maintain__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: rule__Maintain__Group__2__Impl : ( ( rule__Maintain__ConditionAssignment_2 ) ) ;
    public final void rule__Maintain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: ( ( ( rule__Maintain__ConditionAssignment_2 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:1: ( ( rule__Maintain__ConditionAssignment_2 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:1: ( ( rule__Maintain__ConditionAssignment_2 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: ( rule__Maintain__ConditionAssignment_2 )
            {
             before(grammarAccess.getMaintainAccess().getConditionAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: ( rule__Maintain__ConditionAssignment_2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:2: rule__Maintain__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__Maintain__ConditionAssignment_2_in_rule__Maintain__Group__2__Impl6509);
            rule__Maintain__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaintainAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__Maintain__Group__2__Impl"


    // $ANTLR start "rule__Maintain__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: rule__Maintain__Group__3 : rule__Maintain__Group__3__Impl ;
    public final void rule__Maintain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: ( rule__Maintain__Group__3__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3274:2: rule__Maintain__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Maintain__Group__3__Impl_in_rule__Maintain__Group__36539);
            rule__Maintain__Group__3__Impl();

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
    // $ANTLR end "rule__Maintain__Group__3"


    // $ANTLR start "rule__Maintain__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: rule__Maintain__Group__3__Impl : ( '</Maintain>' ) ;
    public final void rule__Maintain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:1: ( ( '</Maintain>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( '</Maintain>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( '</Maintain>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:1: '</Maintain>'
            {
             before(grammarAccess.getMaintainAccess().getMaintainKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__Maintain__Group__3__Impl6567); 
             after(grammarAccess.getMaintainAccess().getMaintainKeyword_3()); 

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
    // $ANTLR end "rule__Maintain__Group__3__Impl"


    // $ANTLR start "rule__Perform__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:1: rule__Perform__Group__0 : rule__Perform__Group__0__Impl rule__Perform__Group__1 ;
    public final void rule__Perform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: ( rule__Perform__Group__0__Impl rule__Perform__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:2: rule__Perform__Group__0__Impl rule__Perform__Group__1
            {
            pushFollow(FOLLOW_rule__Perform__Group__0__Impl_in_rule__Perform__Group__06606);
            rule__Perform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perform__Group__1_in_rule__Perform__Group__06609);
            rule__Perform__Group__1();

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
    // $ANTLR end "rule__Perform__Group__0"


    // $ANTLR start "rule__Perform__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:1: rule__Perform__Group__0__Impl : ( '<Perform>' ) ;
    public final void rule__Perform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3323:1: ( ( '<Perform>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:1: ( '<Perform>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:1: ( '<Perform>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: '<Perform>'
            {
             before(grammarAccess.getPerformAccess().getPerformKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Perform__Group__0__Impl6637); 
             after(grammarAccess.getPerformAccess().getPerformKeyword_0()); 

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
    // $ANTLR end "rule__Perform__Group__0__Impl"


    // $ANTLR start "rule__Perform__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: rule__Perform__Group__1 : rule__Perform__Group__1__Impl rule__Perform__Group__2 ;
    public final void rule__Perform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ( rule__Perform__Group__1__Impl rule__Perform__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:2: rule__Perform__Group__1__Impl rule__Perform__Group__2
            {
            pushFollow(FOLLOW_rule__Perform__Group__1__Impl_in_rule__Perform__Group__16668);
            rule__Perform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perform__Group__2_in_rule__Perform__Group__16671);
            rule__Perform__Group__2();

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
    // $ANTLR end "rule__Perform__Group__1"


    // $ANTLR start "rule__Perform__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: rule__Perform__Group__1__Impl : ( ( rule__Perform__NameAssignment_1 ) ) ;
    public final void rule__Perform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3354:1: ( ( ( rule__Perform__NameAssignment_1 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( rule__Perform__NameAssignment_1 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( rule__Perform__NameAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( rule__Perform__NameAssignment_1 )
            {
             before(grammarAccess.getPerformAccess().getNameAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( rule__Perform__NameAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:2: rule__Perform__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Perform__NameAssignment_1_in_rule__Perform__Group__1__Impl6698);
            rule__Perform__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerformAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Perform__Group__1__Impl"


    // $ANTLR start "rule__Perform__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: rule__Perform__Group__2 : rule__Perform__Group__2__Impl rule__Perform__Group__3 ;
    public final void rule__Perform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( rule__Perform__Group__2__Impl rule__Perform__Group__3 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:2: rule__Perform__Group__2__Impl rule__Perform__Group__3
            {
            pushFollow(FOLLOW_rule__Perform__Group__2__Impl_in_rule__Perform__Group__26728);
            rule__Perform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perform__Group__3_in_rule__Perform__Group__26731);
            rule__Perform__Group__3();

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
    // $ANTLR end "rule__Perform__Group__2"


    // $ANTLR start "rule__Perform__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:1: rule__Perform__Group__2__Impl : ( ( rule__Perform__ConditionAssignment_2 ) ) ;
    public final void rule__Perform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: ( ( ( rule__Perform__ConditionAssignment_2 ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: ( ( rule__Perform__ConditionAssignment_2 ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: ( ( rule__Perform__ConditionAssignment_2 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: ( rule__Perform__ConditionAssignment_2 )
            {
             before(grammarAccess.getPerformAccess().getConditionAssignment_2()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: ( rule__Perform__ConditionAssignment_2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:2: rule__Perform__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__Perform__ConditionAssignment_2_in_rule__Perform__Group__2__Impl6758);
            rule__Perform__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPerformAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__Perform__Group__2__Impl"


    // $ANTLR start "rule__Perform__Group__3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:1: rule__Perform__Group__3 : rule__Perform__Group__3__Impl ;
    public final void rule__Perform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( rule__Perform__Group__3__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:2: rule__Perform__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Perform__Group__3__Impl_in_rule__Perform__Group__36788);
            rule__Perform__Group__3__Impl();

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
    // $ANTLR end "rule__Perform__Group__3"


    // $ANTLR start "rule__Perform__Group__3__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: rule__Perform__Group__3__Impl : ( '</Perform>' ) ;
    public final void rule__Perform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3411:1: ( ( '</Perform>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: ( '</Perform>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: ( '</Perform>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3413:1: '</Perform>'
            {
             before(grammarAccess.getPerformAccess().getPerformKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__Perform__Group__3__Impl6816); 
             after(grammarAccess.getPerformAccess().getPerformKeyword_3()); 

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
    // $ANTLR end "rule__Perform__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__06855);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__06858);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: rule__Condition__Group__0__Impl : ( '<Condition>' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ( ( '<Condition>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( '<Condition>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( '<Condition>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: '<Condition>'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Condition__Group__0__Impl6886); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__16917);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__16920);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: rule__Condition__Group__1__Impl : ( ( ( rule__Condition__StatementsAssignment_1 ) ) ( ( rule__Condition__StatementsAssignment_1 )* ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( ( ( ( rule__Condition__StatementsAssignment_1 ) ) ( ( rule__Condition__StatementsAssignment_1 )* ) ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( ( ( rule__Condition__StatementsAssignment_1 ) ) ( ( rule__Condition__StatementsAssignment_1 )* ) )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( ( ( rule__Condition__StatementsAssignment_1 ) ) ( ( rule__Condition__StatementsAssignment_1 )* ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: ( ( rule__Condition__StatementsAssignment_1 ) ) ( ( rule__Condition__StatementsAssignment_1 )* )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: ( ( rule__Condition__StatementsAssignment_1 ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: ( rule__Condition__StatementsAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getStatementsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ( rule__Condition__StatementsAssignment_1 )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:2: rule__Condition__StatementsAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__StatementsAssignment_1_in_rule__Condition__Group__1__Impl6949);
            rule__Condition__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getStatementsAssignment_1()); 

            }

            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3488:1: ( ( rule__Condition__StatementsAssignment_1 )* )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: ( rule__Condition__StatementsAssignment_1 )*
            {
             before(grammarAccess.getConditionAccess().getStatementsAssignment_1()); 
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:1: ( rule__Condition__StatementsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:2: rule__Condition__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Condition__StatementsAssignment_1_in_rule__Condition__Group__1__Impl6961);
            	    rule__Condition__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getStatementsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: ( rule__Condition__Group__2__Impl )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__26994);
            rule__Condition__Group__2__Impl();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: rule__Condition__Group__2__Impl : ( '</Condition>' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: ( ( '</Condition>' ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( '</Condition>' )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( '</Condition>' )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:1: '</Condition>'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__Condition__Group__2__Impl7022); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__BDI__AgentsAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: rule__BDI__AgentsAssignment_1 : ( ruleAgent ) ;
    public final void rule__BDI__AgentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( ( ruleAgent ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( ruleAgent )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( ruleAgent )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:1: ruleAgent
            {
             before(grammarAccess.getBDIAccess().getAgentsAgentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAgent_in_rule__BDI__AgentsAssignment_17064);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getBDIAccess().getAgentsAgentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BDI__AgentsAssignment_1"


    // $ANTLR start "rule__Agent__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3553:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_17095); 
             after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Agent__NameAssignment_1"


    // $ANTLR start "rule__Agent__ImportAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: rule__Agent__ImportAssignment_2 : ( ruleImports ) ;
    public final void rule__Agent__ImportAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( ( ruleImports ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ( ruleImports )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ( ruleImports )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:1: ruleImports
            {
             before(grammarAccess.getAgentAccess().getImportImportsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImports_in_rule__Agent__ImportAssignment_27126);
            ruleImports();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getImportImportsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Agent__ImportAssignment_2"


    // $ANTLR start "rule__Agent__BeliefAssignment_3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: rule__Agent__BeliefAssignment_3 : ( ruleBeliefSet ) ;
    public final void rule__Agent__BeliefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( ( ruleBeliefSet ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ( ruleBeliefSet )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ( ruleBeliefSet )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:1: ruleBeliefSet
            {
             before(grammarAccess.getAgentAccess().getBeliefBeliefSetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBeliefSet_in_rule__Agent__BeliefAssignment_37157);
            ruleBeliefSet();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getBeliefBeliefSetParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Agent__BeliefAssignment_3"


    // $ANTLR start "rule__Agent__PlanAssignment_4"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: rule__Agent__PlanAssignment_4 : ( rulePlans ) ;
    public final void rule__Agent__PlanAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( ( rulePlans ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: ( rulePlans )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: ( rulePlans )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: rulePlans
            {
             before(grammarAccess.getAgentAccess().getPlanPlansParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePlans_in_rule__Agent__PlanAssignment_47188);
            rulePlans();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getPlanPlansParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Agent__PlanAssignment_4"


    // $ANTLR start "rule__Agent__EventAssignment_5"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:1: rule__Agent__EventAssignment_5 : ( ruleEvents ) ;
    public final void rule__Agent__EventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( ( ruleEvents ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ( ruleEvents )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ( ruleEvents )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: ruleEvents
            {
             before(grammarAccess.getAgentAccess().getEventEventsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEvents_in_rule__Agent__EventAssignment_57219);
            ruleEvents();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getEventEventsParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Agent__EventAssignment_5"


    // $ANTLR start "rule__Agent__ParametersAssignment_6"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: rule__Agent__ParametersAssignment_6 : ( ruleParameters ) ;
    public final void rule__Agent__ParametersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( ( ruleParameters ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( ruleParameters )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( ruleParameters )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: ruleParameters
            {
             before(grammarAccess.getAgentAccess().getParametersParametersParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleParameters_in_rule__Agent__ParametersAssignment_67250);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getParametersParametersParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Agent__ParametersAssignment_6"


    // $ANTLR start "rule__Imports__ImportsAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: rule__Imports__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Imports__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( ( ruleImport ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( ruleImport )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( ruleImport )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ruleImport
            {
             before(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Imports__ImportsAssignment_17281);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Imports__ImportsAssignment_1"


    // $ANTLR start "rule__Events__EventsAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3658:1: rule__Events__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__Events__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ( ( ruleEvent ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( ruleEvent )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( ruleEvent )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ruleEvent
            {
             before(grammarAccess.getEventsAccess().getEventsEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Events__EventsAssignment_17312);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventsAccess().getEventsEventParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Events__EventsAssignment_1"


    // $ANTLR start "rule__Event__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3673:1: rule__Event__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_17343); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Event__NameAssignment_1"


    // $ANTLR start "rule__Event__EventTypeAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: rule__Event__EventTypeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Event__EventTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: ( ( RULE_STRING ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( RULE_STRING )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( RULE_STRING )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventTypeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__EventTypeAssignment_27374); 
             after(grammarAccess.getEventAccess().getEventTypeSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Event__EventTypeAssignment_2"


    // $ANTLR start "rule__Event__ParameterAssignment_3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:1: rule__Event__ParameterAssignment_3 : ( ruleParameter ) ;
    public final void rule__Event__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( ( ruleParameter ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( ruleParameter )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( ruleParameter )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ruleParameter
            {
             before(grammarAccess.getEventAccess().getParameterParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Event__ParameterAssignment_37405);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParameterParameterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Event__ParameterAssignment_3"


    // $ANTLR start "rule__Parameters__ParametersAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: rule__Parameters__ParametersAssignment_1 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( ( ruleParameter ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( ruleParameter )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( ruleParameter )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ruleParameter
            {
             before(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameters__ParametersAssignment_17436);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameters__ParametersAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_17467); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Plans__PlansAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: rule__Plans__PlansAssignment_1 : ( rulePlan ) ;
    public final void rule__Plans__PlansAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: ( ( rulePlan ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3753:1: ( rulePlan )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3753:1: ( rulePlan )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: rulePlan
            {
             before(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlan_in_rule__Plans__PlansAssignment_17498);
            rulePlan();

            state._fsp--;

             after(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Plans__PlansAssignment_1"


    // $ANTLR start "rule__Plan__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: rule__Plan__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Plan__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: RULE_ID
            {
             before(grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plan__NameAssignment_17529); 
             after(grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Plan__NameAssignment_1"


    // $ANTLR start "rule__Plan__BodyAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: rule__Plan__BodyAssignment_2 : ( ruleBody ) ;
    public final void rule__Plan__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( ( ruleBody ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( ruleBody )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( ruleBody )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: ruleBody
            {
             before(grammarAccess.getPlanAccess().getBodyBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBody_in_rule__Plan__BodyAssignment_27560);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getPlanAccess().getBodyBodyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Plan__BodyAssignment_2"


    // $ANTLR start "rule__Plan__TriggerAssignment_3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3793:1: rule__Plan__TriggerAssignment_3 : ( ruleTrigger ) ;
    public final void rule__Plan__TriggerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:1: ( ( ruleTrigger ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3798:1: ( ruleTrigger )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3798:1: ( ruleTrigger )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: ruleTrigger
            {
             before(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTrigger_in_rule__Plan__TriggerAssignment_37591);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Plan__TriggerAssignment_3"


    // $ANTLR start "rule__BeliefSet__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:1: rule__BeliefSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BeliefSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3812:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3813:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3813:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:1: RULE_ID
            {
             before(grammarAccess.getBeliefSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BeliefSet__NameAssignment_17622); 
             after(grammarAccess.getBeliefSetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BeliefSet__NameAssignment_1"


    // $ANTLR start "rule__BeliefSet__BeliefSetAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3823:1: rule__BeliefSet__BeliefSetAssignment_2 : ( ruleBelief ) ;
    public final void rule__BeliefSet__BeliefSetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: ( ( ruleBelief ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: ( ruleBelief )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: ( ruleBelief )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: ruleBelief
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetBeliefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBelief_in_rule__BeliefSet__BeliefSetAssignment_27653);
            ruleBelief();

            state._fsp--;

             after(grammarAccess.getBeliefSetAccess().getBeliefSetBeliefParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BeliefSet__BeliefSetAssignment_2"


    // $ANTLR start "rule__Belief__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3842:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3844:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_17684); 
             after(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Belief__NameAssignment_1"


    // $ANTLR start "rule__Belief__FactAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: rule__Belief__FactAssignment_2 : ( ruleFact ) ;
    public final void rule__Belief__FactAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: ( ( ruleFact ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: ( ruleFact )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: ( ruleFact )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3859:1: ruleFact
            {
             before(grammarAccess.getBeliefAccess().getFactFactParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFact_in_rule__Belief__FactAssignment_27715);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getBeliefAccess().getFactFactParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Belief__FactAssignment_2"


    // $ANTLR start "rule__Fact__StatementsAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: rule__Fact__StatementsAssignment_1 : ( ruleStatements ) ;
    public final void rule__Fact__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: ( ( ruleStatements ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: ( ruleStatements )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: ( ruleStatements )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3874:1: ruleStatements
            {
             before(grammarAccess.getFactAccess().getStatementsStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatements_in_rule__Fact__StatementsAssignment_17746);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getFactAccess().getStatementsStatementsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fact__StatementsAssignment_1"


    // $ANTLR start "rule__Statements__StatementsAssignment"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: rule__Statements__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Statements__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:1: ( ( ruleStatement ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: ( ruleStatement )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: ( ruleStatement )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ruleStatement
            {
             before(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Statements__StatementsAssignment7777);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Statements__StatementsAssignment"


    // $ANTLR start "rule__Achieve__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: rule__Achieve__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Achieve__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: RULE_ID
            {
             before(grammarAccess.getAchieveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Achieve__NameAssignment_17809); 
             after(grammarAccess.getAchieveAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Achieve__NameAssignment_1"


    // $ANTLR start "rule__Achieve__ConditionAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:1: rule__Achieve__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Achieve__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: ( ( ruleCondition ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3919:1: ( ruleCondition )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3919:1: ( ruleCondition )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: ruleCondition
            {
             before(grammarAccess.getAchieveAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Achieve__ConditionAssignment_27840);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getAchieveAccess().getConditionConditionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Achieve__ConditionAssignment_2"


    // $ANTLR start "rule__Query__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__NameAssignment_17871); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Query__NameAssignment_1"


    // $ANTLR start "rule__Query__ConditionAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: rule__Query__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Query__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: ( ( ruleCondition ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: ( ruleCondition )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: ( ruleCondition )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3950:1: ruleCondition
            {
             before(grammarAccess.getQueryAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Query__ConditionAssignment_27902);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getConditionConditionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Query__ConditionAssignment_2"


    // $ANTLR start "rule__Query__ResultAssignment_3"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: rule__Query__ResultAssignment_3 : ( ruleResult ) ;
    public final void rule__Query__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3963:1: ( ( ruleResult ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ( ruleResult )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ( ruleResult )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ruleResult
            {
             before(grammarAccess.getQueryAccess().getResultResultParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleResult_in_rule__Query__ResultAssignment_37933);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getResultResultParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Query__ResultAssignment_3"


    // $ANTLR start "rule__Maintain__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: rule__Maintain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Maintain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3979:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3979:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3980:1: RULE_ID
            {
             before(grammarAccess.getMaintainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Maintain__NameAssignment_17964); 
             after(grammarAccess.getMaintainAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Maintain__NameAssignment_1"


    // $ANTLR start "rule__Maintain__ConditionAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: rule__Maintain__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Maintain__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( ( ruleCondition ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( ruleCondition )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( ruleCondition )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: ruleCondition
            {
             before(grammarAccess.getMaintainAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Maintain__ConditionAssignment_27995);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getMaintainAccess().getConditionConditionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Maintain__ConditionAssignment_2"


    // $ANTLR start "rule__Perform__NameAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: rule__Perform__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Perform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: ( ( RULE_ID ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:1: ( RULE_ID )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:1: ( RULE_ID )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4010:1: RULE_ID
            {
             before(grammarAccess.getPerformAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Perform__NameAssignment_18026); 
             after(grammarAccess.getPerformAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Perform__NameAssignment_1"


    // $ANTLR start "rule__Perform__ConditionAssignment_2"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: rule__Perform__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Perform__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( ( ruleCondition ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( ruleCondition )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( ruleCondition )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ruleCondition
            {
             before(grammarAccess.getPerformAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Perform__ConditionAssignment_28057);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPerformAccess().getConditionConditionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Perform__ConditionAssignment_2"


    // $ANTLR start "rule__Condition__StatementsAssignment_1"
    // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: rule__Condition__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Condition__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: ( ( ruleStatement ) )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ( ruleStatement )
            {
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ( ruleStatement )
            // ../bdi.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4040:1: ruleStatement
            {
             before(grammarAccess.getConditionAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Condition__StatementsAssignment_18088);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getStatementsStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Condition__StatementsAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBDI_in_entryRuleBDI61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBDI68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BDI__Group__0_in_ruleBDI94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__0_in_ruleAgent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__0_in_ruleImports214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilename_in_entryRuleFilename301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilename308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFilename334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvents_in_entryRuleEvents360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvents367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Events__Group__0_in_ruleEvents393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__0_in_ruleParameters513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0_in_ruleValue633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCode693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlans_in_entryRulePlans719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlans726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__0_in_rulePlans752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0_in_rulePlan812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Alternatives_in_ruleTrigger932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeliefSet_in_entryRuleBeliefSet959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeliefSet966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__0_in_ruleBeliefSet992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__0_in_ruleBelief1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0_in_ruleFact1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatements_in_entryRuleStatements1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatements1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statements__StatementsAssignment_in_ruleStatements1174 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statements__StatementsAssignment_in_ruleStatements1186 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_ruleStatement1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Alternatives_in_ruleGoal1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAchieve_in_entryRuleAchieve1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAchieve1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__0_in_ruleAchieve1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaintain_in_entryRuleMaintain1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaintain1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__0_in_ruleMaintain1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerform_in_entryRulePerform1517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerform1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__0_in_rulePerform1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResult_in_entryRuleResult1637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResult1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResult1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_0__0_in_rule__Trigger__Alternatives1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1__0_in_rule__Trigger__Alternatives1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAchieve_in_rule__Goal__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Goal__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaintain_in_rule__Goal__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerform_in_rule__Goal__Alternatives1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BDI__Group__0__Impl_in_rule__BDI__Group__01837 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__BDI__Group__1_in_rule__BDI__Group__01840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BDI__Group__0__Impl1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BDI__Group__1__Impl_in_rule__BDI__Group__11899 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BDI__Group__2_in_rule__BDI__Group__11902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BDI__AgentsAssignment_1_in_rule__BDI__Group__1__Impl1931 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__BDI__AgentsAssignment_1_in_rule__BDI__Group__1__Impl1943 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__BDI__Group__2__Impl_in_rule__BDI__Group__21976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BDI__Group__2__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__0__Impl_in_rule__Agent__Group__02041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Agent__Group__0__Impl2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__1__Impl_in_rule__Agent__Group__12103 = new BitSet(new long[]{0x000000101048C000L});
    public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__1__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__2__Impl_in_rule__Agent__Group__22163 = new BitSet(new long[]{0x000000101048C000L});
    public static final BitSet FOLLOW_rule__Agent__Group__3_in_rule__Agent__Group__22166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__ImportAssignment_2_in_rule__Agent__Group__2__Impl2193 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Agent__Group__3__Impl_in_rule__Agent__Group__32224 = new BitSet(new long[]{0x000000101048C000L});
    public static final BitSet FOLLOW_rule__Agent__Group__4_in_rule__Agent__Group__32227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__BeliefAssignment_3_in_rule__Agent__Group__3__Impl2254 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__4__Impl_in_rule__Agent__Group__42285 = new BitSet(new long[]{0x000000101048C000L});
    public static final BitSet FOLLOW_rule__Agent__Group__5_in_rule__Agent__Group__42288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__PlanAssignment_4_in_rule__Agent__Group__4__Impl2315 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__5__Impl_in_rule__Agent__Group__52346 = new BitSet(new long[]{0x000000101048C000L});
    public static final BitSet FOLLOW_rule__Agent__Group__6_in_rule__Agent__Group__52349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__EventAssignment_5_in_rule__Agent__Group__5__Impl2376 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Agent__Group__6__Impl_in_rule__Agent__Group__62407 = new BitSet(new long[]{0x000000101048C000L});
    public static final BitSet FOLLOW_rule__Agent__Group__7_in_rule__Agent__Group__62410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__ParametersAssignment_6_in_rule__Agent__Group__6__Impl2437 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Agent__Group__7__Impl_in_rule__Agent__Group__72468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Agent__Group__7__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__02543 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__02546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Imports__Group__0__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__12605 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__ImportsAssignment_1_in_rule__Imports__Group__1__Impl2637 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Imports__ImportsAssignment_1_in_rule__Imports__Group__1__Impl2649 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__22682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Imports__Group__2__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12809 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__12812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilename_in_rule__Import__Group__1__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__22868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__2__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Events__Group__0__Impl_in_rule__Events__Group__02933 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Events__Group__1_in_rule__Events__Group__02936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Events__Group__0__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Events__Group__1__Impl_in_rule__Events__Group__12995 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Events__Group__2_in_rule__Events__Group__12998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Events__EventsAssignment_1_in_rule__Events__Group__1__Impl3027 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Events__EventsAssignment_1_in_rule__Events__Group__1__Impl3039 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Events__Group__2__Impl_in_rule__Events__Group__23072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Events__Group__2__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Event__Group__0__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__13202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__23259 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__23262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventTypeAssignment_2_in_rule__Event__Group__2__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__33319 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__Event__Group__4_in_rule__Event__Group__33322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParameterAssignment_3_in_rule__Event__Group__3__Impl3349 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__43380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Event__Group__4__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__0__Impl_in_rule__Parameters__Group__03449 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Parameters__Group__1_in_rule__Parameters__Group__03452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Parameters__Group__0__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__1__Impl_in_rule__Parameters__Group__13511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Parameters__Group__2_in_rule__Parameters__Group__13514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__ParametersAssignment_1_in_rule__Parameters__Group__1__Impl3543 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Parameters__ParametersAssignment_1_in_rule__Parameters__Group__1__Impl3555 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__2__Impl_in_rule__Parameters__Group__23588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Parameters__Group__2__Impl3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Parameter__Group__0__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13715 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__23775 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__23778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Parameter__Group__2__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__33834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Parameter__Group__3__Impl3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__03901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Value__Group__1_in_rule__Value__Group__03904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Value__Group__0__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__13963 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Value__Group__2_in_rule__Value__Group__13966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__Value__Group__1__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__2__Impl_in_rule__Value__Group__24022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Value__Group__2__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__0__Impl_in_rule__Plans__Group__04087 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Plans__Group__1_in_rule__Plans__Group__04090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Plans__Group__0__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__1__Impl_in_rule__Plans__Group__14149 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Plans__Group__2_in_rule__Plans__Group__14152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl4181 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl4193 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__2__Impl_in_rule__Plans__Group__24226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Plans__Group__2__Impl4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__04291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__04294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Plan__Group__0__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__14353 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__14356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__NameAssignment_1_in_rule__Plan__Group__1__Impl4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__24413 = new BitSet(new long[]{0x0001540400000000L});
    public static final BitSet FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__24416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__BodyAssignment_2_in_rule__Plan__Group__2__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__34473 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__34476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__TriggerAssignment_3_in_rule__Plan__Group__3__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__44533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Plan__Group__4__Impl4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Body__Group__0__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__14664 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__14667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Body__Group__1__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__24723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Body__Group__2__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_0__0__Impl_in_rule__Trigger__Group_0__04788 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Trigger__Group_0__1_in_rule__Trigger__Group_0__04791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Trigger__Group_0__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_0__1__Impl_in_rule__Trigger__Group_0__14850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Trigger__Group_0__1__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1__0__Impl_in_rule__Trigger__Group_1__04910 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1__1_in_rule__Trigger__Group_1__04913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__Trigger__Group_1__0__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1__1__Impl_in_rule__Trigger__Group_1__14969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Trigger__Group_1__1__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__0__Impl_in_rule__BeliefSet__Group__05032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__1_in_rule__BeliefSet__Group__05035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BeliefSet__Group__0__Impl5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__1__Impl_in_rule__BeliefSet__Group__15094 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__2_in_rule__BeliefSet__Group__15097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__NameAssignment_1_in_rule__BeliefSet__Group__1__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__2__Impl_in_rule__BeliefSet__Group__25154 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__3_in_rule__BeliefSet__Group__25157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__BeliefSetAssignment_2_in_rule__BeliefSet__Group__2__Impl5186 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__BeliefSetAssignment_2_in_rule__BeliefSet__Group__2__Impl5198 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__3__Impl_in_rule__BeliefSet__Group__35231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BeliefSet__Group__3__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__0__Impl_in_rule__Belief__Group__05298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__05301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Belief__Group__0__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__1__Impl_in_rule__Belief__Group__15360 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Belief__Group__2_in_rule__Belief__Group__15363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__1__Impl5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__2__Impl_in_rule__Belief__Group__25420 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Belief__Group__3_in_rule__Belief__Group__25423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__FactAssignment_2_in_rule__Belief__Group__2__Impl5450 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__3__Impl_in_rule__Belief__Group__35481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Belief__Group__3__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__05548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__05551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Fact__Group__0__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__15610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__15613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__StatementsAssignment_1_in_rule__Fact__Group__1__Impl5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__25670 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Fact__Group__3_in_rule__Fact__Group__25673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fact__Group__2__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__3__Impl_in_rule__Fact__Group__35729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Fact__Group__3__Impl5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__0__Impl_in_rule__Achieve__Group__05797 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Achieve__Group__1_in_rule__Achieve__Group__05800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Achieve__Group__0__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__1__Impl_in_rule__Achieve__Group__15859 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Achieve__Group__2_in_rule__Achieve__Group__15862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__NameAssignment_1_in_rule__Achieve__Group__1__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__2__Impl_in_rule__Achieve__Group__25919 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Achieve__Group__3_in_rule__Achieve__Group__25922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__ConditionAssignment_2_in_rule__Achieve__Group__2__Impl5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__3__Impl_in_rule__Achieve__Group__35979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Achieve__Group__3__Impl6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__06046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__06049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Query__Group__0__Impl6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__16108 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Query__Group__2_in_rule__Query__Group__16111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__NameAssignment_1_in_rule__Query__Group__1__Impl6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__2__Impl_in_rule__Query__Group__26168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group__3_in_rule__Query__Group__26171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ConditionAssignment_2_in_rule__Query__Group__2__Impl6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__3__Impl_in_rule__Query__Group__36228 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Query__Group__4_in_rule__Query__Group__36231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ResultAssignment_3_in_rule__Query__Group__3__Impl6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__4__Impl_in_rule__Query__Group__46288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Query__Group__4__Impl6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__0__Impl_in_rule__Maintain__Group__06357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Maintain__Group__1_in_rule__Maintain__Group__06360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Maintain__Group__0__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__1__Impl_in_rule__Maintain__Group__16419 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Maintain__Group__2_in_rule__Maintain__Group__16422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__NameAssignment_1_in_rule__Maintain__Group__1__Impl6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__2__Impl_in_rule__Maintain__Group__26479 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Maintain__Group__3_in_rule__Maintain__Group__26482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__ConditionAssignment_2_in_rule__Maintain__Group__2__Impl6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__3__Impl_in_rule__Maintain__Group__36539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Maintain__Group__3__Impl6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__0__Impl_in_rule__Perform__Group__06606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Perform__Group__1_in_rule__Perform__Group__06609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Perform__Group__0__Impl6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__1__Impl_in_rule__Perform__Group__16668 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Perform__Group__2_in_rule__Perform__Group__16671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__NameAssignment_1_in_rule__Perform__Group__1__Impl6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__2__Impl_in_rule__Perform__Group__26728 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Perform__Group__3_in_rule__Perform__Group__26731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__ConditionAssignment_2_in_rule__Perform__Group__2__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__3__Impl_in_rule__Perform__Group__36788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Perform__Group__3__Impl6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__06855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__06858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Condition__Group__0__Impl6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__16917 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__16920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__StatementsAssignment_1_in_rule__Condition__Group__1__Impl6949 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Condition__StatementsAssignment_1_in_rule__Condition__Group__1__Impl6961 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__26994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Condition__Group__2__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_rule__BDI__AgentsAssignment_17064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_rule__Agent__ImportAssignment_27126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeliefSet_in_rule__Agent__BeliefAssignment_37157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlans_in_rule__Agent__PlanAssignment_47188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvents_in_rule__Agent__EventAssignment_57219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_rule__Agent__ParametersAssignment_67250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Imports__ImportsAssignment_17281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Events__EventsAssignment_17312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_17343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__EventTypeAssignment_27374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Event__ParameterAssignment_37405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameters__ParametersAssignment_17436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_17467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_rule__Plans__PlansAssignment_17498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plan__NameAssignment_17529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Plan__BodyAssignment_27560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_rule__Plan__TriggerAssignment_37591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BeliefSet__NameAssignment_17622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_rule__BeliefSet__BeliefSetAssignment_27653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_17684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rule__Belief__FactAssignment_27715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatements_in_rule__Fact__StatementsAssignment_17746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statements__StatementsAssignment7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Achieve__NameAssignment_17809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Achieve__ConditionAssignment_27840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__NameAssignment_17871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Query__ConditionAssignment_27902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResult_in_rule__Query__ResultAssignment_37933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Maintain__NameAssignment_17964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Maintain__ConditionAssignment_27995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Perform__NameAssignment_18026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Perform__ConditionAssignment_28057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Condition__StatementsAssignment_18088 = new BitSet(new long[]{0x0000000000000002L});

}