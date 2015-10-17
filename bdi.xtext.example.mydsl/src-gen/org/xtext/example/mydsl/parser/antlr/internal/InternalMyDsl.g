/*
 * generated by Xtext
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleBDI
entryRuleBDI returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBDIRule()); }
	 iv_ruleBDI=ruleBDI 
	 { $current=$iv_ruleBDI.current; } 
	 EOF 
;

// Rule BDI
ruleBDI returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<BDIModel>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBDIAccess().getBDIModelKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBDIAccess().getAgentsAgentParserRuleCall_1_0()); 
	    }
		lv_Agents_1_0=ruleAgent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBDIRule());
	        }
       		add(
       			$current, 
       			"Agents",
        		lv_Agents_1_0, 
        		"Agent");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='</BDIModel>' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBDIAccess().getBDIModelKeyword_2());
    }
)
;





// Entry rule entryRuleAgent
entryRuleAgent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAgentRule()); }
	 iv_ruleAgent=ruleAgent 
	 { $current=$iv_ruleAgent.current; } 
	 EOF 
;

// Rule Agent
ruleAgent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Agent>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAgentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAgentAccess().getImportImportsParserRuleCall_2_0()); 
	    }
		lv_Import_2_0=ruleImports		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAgentRule());
	        }
       		add(
       			$current, 
       			"Import",
        		lv_Import_2_0, 
        		"Imports");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefSetParserRuleCall_3_0()); 
	    }
		lv_Belief_3_0=ruleBeliefSet		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAgentRule());
	        }
       		add(
       			$current, 
       			"Belief",
        		lv_Belief_3_0, 
        		"BeliefSet");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getAgentAccess().getPlanPlansParserRuleCall_4_0()); 
	    }
		lv_Plan_4_0=rulePlans		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAgentRule());
	        }
       		add(
       			$current, 
       			"Plan",
        		lv_Plan_4_0, 
        		"Plans");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getAgentAccess().getEventEventsParserRuleCall_5_0()); 
	    }
		lv_Event_5_0=ruleEvents		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAgentRule());
	        }
       		add(
       			$current, 
       			"Event",
        		lv_Event_5_0, 
        		"Events");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getAgentAccess().getParametersParametersParserRuleCall_6_0()); 
	    }
		lv_Parameters_6_0=ruleParameters		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAgentRule());
	        }
       		add(
       			$current, 
       			"Parameters",
        		lv_Parameters_6_0, 
        		"Parameters");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='</Agent>' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getAgentAccess().getAgentKeyword_7());
    }
)
;





// Entry rule entryRuleImports
entryRuleImports returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportsRule()); }
	 iv_ruleImports=ruleImports 
	 { $current=$iv_ruleImports.current; } 
	 EOF 
;

// Rule Imports
ruleImports returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Imports>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportsKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0()); 
	    }
		lv_Imports_1_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportsRule());
	        }
       		add(
       			$current, 
       			"Imports",
        		lv_Imports_1_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='</Imports>' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImportsAccess().getImportsKeyword_2());
    }
)
;





// Entry rule entryRuleImport
entryRuleImport returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); } 
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current.getText(); }  
	 EOF 
;

// Rule Import
ruleImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='<Import>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getImportAccess().getFilenameParserRuleCall_1()); 
    }
    this_Filename_1=ruleFilename    {
		$current.merge(this_Filename_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='</Import>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleFilename
entryRuleFilename returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFilenameRule()); } 
	 iv_ruleFilename=ruleFilename 
	 { $current=$iv_ruleFilename.current.getText(); }  
	 EOF 
;

// Rule Filename
ruleFilename returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getFilenameAccess().getSTRINGTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleEvents
entryRuleEvents returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventsRule()); }
	 iv_ruleEvents=ruleEvents 
	 { $current=$iv_ruleEvents.current; } 
	 EOF 
;

// Rule Events
ruleEvents returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Event>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEventsAccess().getEventKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEventsAccess().getEventsEventParserRuleCall_1_0()); 
	    }
		lv_Events_1_0=ruleEvent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEventsRule());
	        }
       		add(
       			$current, 
       			"Events",
        		lv_Events_1_0, 
        		"Event");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='</Events>' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEventsAccess().getEventsKeyword_2());
    }
)
;





// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	 iv_ruleEvent=ruleEvent 
	 { $current=$iv_ruleEvent.current; } 
	 EOF 
;

// Rule Event
ruleEvent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Event>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_EventType_2_0=RULE_STRING
		{
			newLeafNode(lv_EventType_2_0, grammarAccess.getEventAccess().getEventTypeSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"EventType",
        		lv_EventType_2_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEventAccess().getParameterParameterParserRuleCall_3_0()); 
	    }
		lv_Parameter_3_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEventRule());
	        }
       		add(
       			$current, 
       			"Parameter",
        		lv_Parameter_3_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='</Event>' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEventAccess().getEventKeyword_4());
    }
)
;





// Entry rule entryRuleParameters
entryRuleParameters returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParametersRule()); }
	 iv_ruleParameters=ruleParameters 
	 { $current=$iv_ruleParameters.current; } 
	 EOF 
;

// Rule Parameters
ruleParameters returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Parameters>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParametersAccess().getParametersKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_0()); 
	    }
		lv_Parameters_1_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParametersRule());
	        }
       		add(
       			$current, 
       			"Parameters",
        		lv_Parameters_1_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='</Parameters>' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getParametersKeyword_2());
    }
)
;





// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	 iv_ruleParameter=ruleParameter 
	 { $current=$iv_ruleParameter.current; } 
	 EOF 
;

// Rule Parameter
ruleParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Parameter>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)
    { 
        newCompositeNode(grammarAccess.getParameterAccess().getValueParserRuleCall_2()); 
    }
ruleValue
    { 
        afterParserOrEnumRuleCall();
    }
	otherlv_3='</Parameter>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getParameterKeyword_3());
    }
)
;





// Entry rule entryRuleValue
entryRuleValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); } 
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current.getText(); }  
	 EOF 
;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='<Value>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValueAccess().getValueKeyword_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getValueAccess().getCodeParserRuleCall_1()); 
    }
    this_Code_1=ruleCode    {
		$current.merge(this_Code_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='</Value>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValueAccess().getValueKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleCode
entryRuleCode returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getCodeRule()); } 
	 iv_ruleCode=ruleCode 
	 { $current=$iv_ruleCode.current.getText(); }  
	 EOF 
;

// Rule Code
ruleCode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getCodeAccess().getSTRINGTerminalRuleCall()); 
    }

    ;





// Entry rule entryRulePlans
entryRulePlans returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPlansRule()); }
	 iv_rulePlans=rulePlans 
	 { $current=$iv_rulePlans.current; } 
	 EOF 
;

// Rule Plans
rulePlans returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Plans>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPlansAccess().getPlansKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 
	    }
		lv_Plans_1_0=rulePlan		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPlansRule());
	        }
       		add(
       			$current, 
       			"Plans",
        		lv_Plans_1_0, 
        		"Plan");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='</Plans>' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPlansAccess().getPlansKeyword_2());
    }
)
;





// Entry rule entryRulePlan
entryRulePlan returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPlanRule()); }
	 iv_rulePlan=rulePlan 
	 { $current=$iv_rulePlan.current; } 
	 EOF 
;

// Rule Plan
rulePlan returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Plan>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPlanAccess().getPlanKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPlanRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPlanAccess().getBodyBodyParserRuleCall_2_0()); 
	    }
		lv_Body_2_0=ruleBody		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPlanRule());
	        }
       		set(
       			$current, 
       			"Body",
        		lv_Body_2_0, 
        		"Body");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_3_0()); 
	    }
		lv_Trigger_3_0=ruleTrigger		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPlanRule());
	        }
       		set(
       			$current, 
       			"Trigger",
        		lv_Trigger_3_0, 
        		"Trigger");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='</Plan>' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPlanAccess().getPlanKeyword_4());
    }
)
;





// Entry rule entryRuleBody
entryRuleBody returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getBodyRule()); } 
	 iv_ruleBody=ruleBody 
	 { $current=$iv_ruleBody.current.getText(); }  
	 EOF 
;

// Rule Body
ruleBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='<Body>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getBodyAccess().getBodyKeyword_0()); 
    }
    this_STRING_1=RULE_STRING    {
		$current.merge(this_STRING_1);
    }

    { 
    newLeafNode(this_STRING_1, grammarAccess.getBodyAccess().getSTRINGTerminalRuleCall_1()); 
    }

	kw='</Body>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getBodyAccess().getBodyKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleTrigger
entryRuleTrigger returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTriggerRule()); }
	 iv_ruleTrigger=ruleTrigger 
	 { $current=$iv_ruleTrigger.current; } 
	 EOF 
;

// Rule Trigger
ruleTrigger returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='<Trigger>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0_0());
    }

    { 
        newCompositeNode(grammarAccess.getTriggerAccess().getEventParserRuleCall_0_1()); 
    }
    this_Event_1=ruleEvent
    { 
        $current = $this_Event_1.current; 
        afterParserOrEnumRuleCall();
    }
)
    |(
    { 
        newCompositeNode(grammarAccess.getTriggerAccess().getGoalParserRuleCall_1_0()); 
    }
    this_Goal_2=ruleGoal
    { 
        $current = $this_Goal_2.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_3='</Trigger>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getTriggerKeyword_1_1());
    }
))
;





// Entry rule entryRuleBeliefSet
entryRuleBeliefSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBeliefSetRule()); }
	 iv_ruleBeliefSet=ruleBeliefSet 
	 { $current=$iv_ruleBeliefSet.current; } 
	 EOF 
;

// Rule BeliefSet
ruleBeliefSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<BeliefSet>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getBeliefSetAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBeliefSetRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBeliefSetAccess().getBeliefSetBeliefParserRuleCall_2_0()); 
	    }
		lv_BeliefSet_2_0=ruleBelief		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBeliefSetRule());
	        }
       		add(
       			$current, 
       			"BeliefSet",
        		lv_BeliefSet_2_0, 
        		"Belief");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='</BeliefSet>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_3());
    }
)
;





// Entry rule entryRuleBelief
entryRuleBelief returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBeliefRule()); }
	 iv_ruleBelief=ruleBelief 
	 { $current=$iv_ruleBelief.current; } 
	 EOF 
;

// Rule Belief
ruleBelief returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Belief>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBeliefAccess().getBeliefKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBeliefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBeliefAccess().getFactFactParserRuleCall_2_0()); 
	    }
		lv_Fact_2_0=ruleFact		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBeliefRule());
	        }
       		add(
       			$current, 
       			"Fact",
        		lv_Fact_2_0, 
        		"Fact");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='</Belief>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBeliefAccess().getBeliefKeyword_3());
    }
)
;





// Entry rule entryRuleFact
entryRuleFact returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFactRule()); }
	 iv_ruleFact=ruleFact 
	 { $current=$iv_ruleFact.current; } 
	 EOF 
;

// Rule Fact
ruleFact returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Fact>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFactAccess().getFactKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFactAccess().getStatementsStatementsParserRuleCall_1_0()); 
	    }
		lv_Statements_1_0=ruleStatements		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFactRule());
	        }
       		set(
       			$current, 
       			"Statements",
        		lv_Statements_1_0, 
        		"Statements");
	        afterParserOrEnumRuleCall();
	    }

)
)this_STRING_2=RULE_STRING
    { 
    newLeafNode(this_STRING_2, grammarAccess.getFactAccess().getSTRINGTerminalRuleCall_2()); 
    }
	otherlv_3='</Fact>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFactAccess().getFactKeyword_3());
    }
)
;





// Entry rule entryRuleStatements
entryRuleStatements returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementsRule()); }
	 iv_ruleStatements=ruleStatements 
	 { $current=$iv_ruleStatements.current; } 
	 EOF 
;

// Rule Statements
ruleStatements returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0()); 
	    }
		lv_Statements_0_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatementsRule());
	        }
       		add(
       			$current, 
       			"Statements",
        		lv_Statements_0_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





// Entry rule entryRuleStatement
entryRuleStatement returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); } 
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current.getText(); }  
	 EOF 
;

// Rule Statement
ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getStatementAccess().getCodeParserRuleCall()); 
    }
    this_Code_0=ruleCode    {
		$current.merge(this_Code_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;







// Entry rule entryRuleGoal
entryRuleGoal returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGoalRule()); }
	 iv_ruleGoal=ruleGoal 
	 { $current=$iv_ruleGoal.current; } 
	 EOF 
;

// Rule Goal
ruleGoal returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getGoalAccess().getAchieveParserRuleCall_0()); 
    }
    this_Achieve_0=ruleAchieve
    { 
        $current = $this_Achieve_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getGoalAccess().getQueryParserRuleCall_1()); 
    }
    this_Query_1=ruleQuery
    { 
        $current = $this_Query_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getGoalAccess().getMaintainParserRuleCall_2()); 
    }
    this_Maintain_2=ruleMaintain
    { 
        $current = $this_Maintain_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getGoalAccess().getPerformParserRuleCall_3()); 
    }
    this_Perform_3=rulePerform
    { 
        $current = $this_Perform_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAchieve
entryRuleAchieve returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAchieveRule()); }
	 iv_ruleAchieve=ruleAchieve 
	 { $current=$iv_ruleAchieve.current; } 
	 EOF 
;

// Rule Achieve
ruleAchieve returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Achieve>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAchieveAccess().getAchieveKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAchieveAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAchieveRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAchieveAccess().getConditionConditionParserRuleCall_2_0()); 
	    }
		lv_Condition_2_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAchieveRule());
	        }
       		set(
       			$current, 
       			"Condition",
        		lv_Condition_2_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='</Achieve>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAchieveAccess().getAchieveKeyword_3());
    }
)
;





// Entry rule entryRuleQuery
entryRuleQuery returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQueryRule()); }
	 iv_ruleQuery=ruleQuery 
	 { $current=$iv_ruleQuery.current; } 
	 EOF 
;

// Rule Query
ruleQuery returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Query>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQueryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getQueryAccess().getConditionConditionParserRuleCall_2_0()); 
	    }
		lv_Condition_2_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQueryRule());
	        }
       		set(
       			$current, 
       			"Condition",
        		lv_Condition_2_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getQueryAccess().getResultResultParserRuleCall_3_0()); 
	    }
		lv_Result_3_0=ruleResult		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQueryRule());
	        }
       		set(
       			$current, 
       			"Result",
        		lv_Result_3_0, 
        		"Result");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='</Query>' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getQueryKeyword_4());
    }
)
;





// Entry rule entryRuleMaintain
entryRuleMaintain returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMaintainRule()); }
	 iv_ruleMaintain=ruleMaintain 
	 { $current=$iv_ruleMaintain.current; } 
	 EOF 
;

// Rule Maintain
ruleMaintain returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Maintain>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMaintainAccess().getMaintainKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMaintainAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMaintainRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMaintainAccess().getConditionConditionParserRuleCall_2_0()); 
	    }
		lv_Condition_2_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMaintainRule());
	        }
       		set(
       			$current, 
       			"Condition",
        		lv_Condition_2_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='</Maintain>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMaintainAccess().getMaintainKeyword_3());
    }
)
;





// Entry rule entryRulePerform
entryRulePerform returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPerformRule()); }
	 iv_rulePerform=rulePerform 
	 { $current=$iv_rulePerform.current; } 
	 EOF 
;

// Rule Perform
rulePerform returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Perform>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPerformAccess().getPerformKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPerformAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPerformRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPerformAccess().getConditionConditionParserRuleCall_2_0()); 
	    }
		lv_Condition_2_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPerformRule());
	        }
       		set(
       			$current, 
       			"Condition",
        		lv_Condition_2_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='</Perform>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPerformAccess().getPerformKeyword_3());
    }
)
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<Condition>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionAccess().getStatementsStatementParserRuleCall_1_0()); 
	    }
		lv_Statements_1_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionRule());
	        }
       		add(
       			$current, 
       			"Statements",
        		lv_Statements_1_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='</Condition>' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getConditionKeyword_2());
    }
)
;





// Entry rule entryRuleResult
entryRuleResult returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getResultRule()); } 
	 iv_ruleResult=ruleResult 
	 { $current=$iv_ruleResult.current.getText(); }  
	 EOF 
;

// Rule Result
ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getResultAccess().getSTRINGTerminalRuleCall()); 
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


