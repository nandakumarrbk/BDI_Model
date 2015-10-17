/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTriggerAccess().getAlternatives(), "rule__Trigger__Alternatives");
					put(grammarAccess.getGoalAccess().getAlternatives(), "rule__Goal__Alternatives");
					put(grammarAccess.getBDIAccess().getGroup(), "rule__BDI__Group__0");
					put(grammarAccess.getAgentAccess().getGroup(), "rule__Agent__Group__0");
					put(grammarAccess.getImportsAccess().getGroup(), "rule__Imports__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getEventsAccess().getGroup(), "rule__Events__Group__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
					put(grammarAccess.getPlansAccess().getGroup(), "rule__Plans__Group__0");
					put(grammarAccess.getPlanAccess().getGroup(), "rule__Plan__Group__0");
					put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
					put(grammarAccess.getTriggerAccess().getGroup_0(), "rule__Trigger__Group_0__0");
					put(grammarAccess.getTriggerAccess().getGroup_1(), "rule__Trigger__Group_1__0");
					put(grammarAccess.getBeliefSetAccess().getGroup(), "rule__BeliefSet__Group__0");
					put(grammarAccess.getBeliefAccess().getGroup(), "rule__Belief__Group__0");
					put(grammarAccess.getFactAccess().getGroup(), "rule__Fact__Group__0");
					put(grammarAccess.getGoalsAccess().getGroup(), "rule__Goals__Group__0");
					put(grammarAccess.getAchieveAccess().getGroup(), "rule__Achieve__Group__0");
					put(grammarAccess.getQueryAccess().getGroup(), "rule__Query__Group__0");
					put(grammarAccess.getMaintainAccess().getGroup(), "rule__Maintain__Group__0");
					put(grammarAccess.getPerformAccess().getGroup(), "rule__Perform__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getBDIAccess().getAgentsAssignment_1(), "rule__BDI__AgentsAssignment_1");
					put(grammarAccess.getAgentAccess().getNameAssignment_1(), "rule__Agent__NameAssignment_1");
					put(grammarAccess.getAgentAccess().getImportAssignment_2(), "rule__Agent__ImportAssignment_2");
					put(grammarAccess.getAgentAccess().getBeliefAssignment_3(), "rule__Agent__BeliefAssignment_3");
					put(grammarAccess.getAgentAccess().getPlanAssignment_4(), "rule__Agent__PlanAssignment_4");
					put(grammarAccess.getAgentAccess().getEventAssignment_5(), "rule__Agent__EventAssignment_5");
					put(grammarAccess.getAgentAccess().getParametersAssignment_6(), "rule__Agent__ParametersAssignment_6");
					put(grammarAccess.getImportsAccess().getImportsAssignment_1(), "rule__Imports__ImportsAssignment_1");
					put(grammarAccess.getEventsAccess().getEventsAssignment_1(), "rule__Events__EventsAssignment_1");
					put(grammarAccess.getEventAccess().getNameAssignment_1(), "rule__Event__NameAssignment_1");
					put(grammarAccess.getEventAccess().getEventTypeAssignment_2(), "rule__Event__EventTypeAssignment_2");
					put(grammarAccess.getEventAccess().getParameterAssignment_3(), "rule__Event__ParameterAssignment_3");
					put(grammarAccess.getParametersAccess().getParametersAssignment_1(), "rule__Parameters__ParametersAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getPlansAccess().getPlansAssignment_1(), "rule__Plans__PlansAssignment_1");
					put(grammarAccess.getPlanAccess().getNameAssignment_1(), "rule__Plan__NameAssignment_1");
					put(grammarAccess.getPlanAccess().getBodyAssignment_2(), "rule__Plan__BodyAssignment_2");
					put(grammarAccess.getPlanAccess().getTriggerAssignment_3(), "rule__Plan__TriggerAssignment_3");
					put(grammarAccess.getBeliefSetAccess().getNameAssignment_1(), "rule__BeliefSet__NameAssignment_1");
					put(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_2(), "rule__BeliefSet__BeliefSetAssignment_2");
					put(grammarAccess.getBeliefAccess().getNameAssignment_1(), "rule__Belief__NameAssignment_1");
					put(grammarAccess.getBeliefAccess().getFactAssignment_2(), "rule__Belief__FactAssignment_2");
					put(grammarAccess.getFactAccess().getStatementsAssignment_1(), "rule__Fact__StatementsAssignment_1");
					put(grammarAccess.getStatementsAccess().getStatementsAssignment(), "rule__Statements__StatementsAssignment");
					put(grammarAccess.getGoalsAccess().getGoalsAssignment_1(), "rule__Goals__GoalsAssignment_1");
					put(grammarAccess.getAchieveAccess().getNameAssignment_1(), "rule__Achieve__NameAssignment_1");
					put(grammarAccess.getAchieveAccess().getConditionAssignment_2(), "rule__Achieve__ConditionAssignment_2");
					put(grammarAccess.getQueryAccess().getNameAssignment_1(), "rule__Query__NameAssignment_1");
					put(grammarAccess.getQueryAccess().getConditionAssignment_2(), "rule__Query__ConditionAssignment_2");
					put(grammarAccess.getQueryAccess().getResultAssignment_3(), "rule__Query__ResultAssignment_3");
					put(grammarAccess.getMaintainAccess().getNameAssignment_1(), "rule__Maintain__NameAssignment_1");
					put(grammarAccess.getMaintainAccess().getConditionAssignment_2(), "rule__Maintain__ConditionAssignment_2");
					put(grammarAccess.getPerformAccess().getNameAssignment_1(), "rule__Perform__NameAssignment_1");
					put(grammarAccess.getPerformAccess().getConditionAssignment_2(), "rule__Perform__ConditionAssignment_2");
					put(grammarAccess.getConditionAccess().getStatementsAssignment_1(), "rule__Condition__StatementsAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleBDI();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}