/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Achieve;
import org.xtext.example.mydsl.myDsl.Agent;
import org.xtext.example.mydsl.myDsl.BDI;
import org.xtext.example.mydsl.myDsl.Belief;
import org.xtext.example.mydsl.myDsl.BeliefSet;
import org.xtext.example.mydsl.myDsl.Condition;
import org.xtext.example.mydsl.myDsl.Division;
import org.xtext.example.mydsl.myDsl.Event;
import org.xtext.example.mydsl.myDsl.Events;
import org.xtext.example.mydsl.myDsl.Fact;
import org.xtext.example.mydsl.myDsl.Factor;
import org.xtext.example.mydsl.myDsl.Goals;
import org.xtext.example.mydsl.myDsl.Imports;
import org.xtext.example.mydsl.myDsl.Maintain;
import org.xtext.example.mydsl.myDsl.Minus;
import org.xtext.example.mydsl.myDsl.Multiply;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Operator;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Parameters;
import org.xtext.example.mydsl.myDsl.Perform;
import org.xtext.example.mydsl.myDsl.Plan;
import org.xtext.example.mydsl.myDsl.Plans;
import org.xtext.example.mydsl.myDsl.Plus;
import org.xtext.example.mydsl.myDsl.Query;
import org.xtext.example.mydsl.myDsl.Statements;
import org.xtext.example.mydsl.myDsl.Trigger;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ACHIEVE:
				sequence_Achieve(context, (Achieve) semanticObject); 
				return; 
			case MyDslPackage.AGENT:
				sequence_Agent(context, (Agent) semanticObject); 
				return; 
			case MyDslPackage.BDI:
				sequence_BDI(context, (BDI) semanticObject); 
				return; 
			case MyDslPackage.BELIEF:
				sequence_Belief(context, (Belief) semanticObject); 
				return; 
			case MyDslPackage.BELIEF_SET:
				sequence_BeliefSet(context, (BeliefSet) semanticObject); 
				return; 
			case MyDslPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case MyDslPackage.DIVISION:
				sequence_Term(context, (Division) semanticObject); 
				return; 
			case MyDslPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case MyDslPackage.EVENTS:
				sequence_Events(context, (Events) semanticObject); 
				return; 
			case MyDslPackage.FACT:
				sequence_Fact(context, (Fact) semanticObject); 
				return; 
			case MyDslPackage.FACTOR:
				sequence_Factor(context, (Factor) semanticObject); 
				return; 
			case MyDslPackage.GOALS:
				sequence_Goals(context, (Goals) semanticObject); 
				return; 
			case MyDslPackage.IMPORTS:
				sequence_Imports(context, (Imports) semanticObject); 
				return; 
			case MyDslPackage.MAINTAIN:
				sequence_Maintain(context, (Maintain) semanticObject); 
				return; 
			case MyDslPackage.MINUS:
				sequence_Expression(context, (Minus) semanticObject); 
				return; 
			case MyDslPackage.MULTIPLY:
				sequence_Term(context, (Multiply) semanticObject); 
				return; 
			case MyDslPackage.OPERATOR:
				sequence_Operator(context, (Operator) semanticObject); 
				return; 
			case MyDslPackage.PARAMETER:
				sequence_Parameter(context, (Parameter) semanticObject); 
				return; 
			case MyDslPackage.PARAMETERS:
				sequence_Parameters(context, (Parameters) semanticObject); 
				return; 
			case MyDslPackage.PERFORM:
				sequence_Perform(context, (Perform) semanticObject); 
				return; 
			case MyDslPackage.PLAN:
				sequence_Plan(context, (Plan) semanticObject); 
				return; 
			case MyDslPackage.PLANS:
				sequence_Plans(context, (Plans) semanticObject); 
				return; 
			case MyDslPackage.PLUS:
				sequence_Expression(context, (Plus) semanticObject); 
				return; 
			case MyDslPackage.QUERY:
				sequence_Query(context, (Query) semanticObject); 
				return; 
			case MyDslPackage.STATEMENTS:
				sequence_Statements(context, (Statements) semanticObject); 
				return; 
			case MyDslPackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID Condition=Condition)
	 */
	protected void sequence_Achieve(EObject context, Achieve semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GOAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GOAL__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GOAL__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GOAL__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAchieveAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAchieveAccess().getConditionConditionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         Import+=Imports* 
	 *         Event+=Events* 
	 *         Parameters+=Parameters* 
	 *         Belief+=BeliefSet* 
	 *         Plan+=Plans*
	 *     )
	 */
	protected void sequence_Agent(EObject context, Agent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     Agents+=Agent+
	 */
	protected void sequence_BDI(EObject context, BDI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID BeliefSet+=Belief+)
	 */
	protected void sequence_BeliefSet(EObject context, BeliefSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Fact+=Fact*)
	 */
	protected void sequence_Belief(EObject context, Belief semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subjective=QualifiedName operator=Operator objective=Expression ((and?='and' | or?='or') compareCondition=Condition)?)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID EventType=STRING Parameter+=Parameter*)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     Events+=Event+
	 */
	protected void sequence_Events(EObject context, Events semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Minus_1_0_1_0 right=Term)
	 */
	protected void sequence_Expression(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Plus_1_0_0_0 right=Term)
	 */
	protected void sequence_Expression(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     Statements=Statements
	 */
	protected void sequence_Fact(EObject context, Fact semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FACT__STATEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FACT__STATEMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFactAccess().getStatementsStatementsParserRuleCall_1_0(), semanticObject.getStatements());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (number=Number | variable=QualifiedName | string=STRING | boolean=BOOLEAN | expression=Expression)
	 */
	protected void sequence_Factor(EObject context, Factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     Goals+=Goal+
	 */
	protected void sequence_Goals(EObject context, Goals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     Imports+=Import+
	 */
	protected void sequence_Imports(EObject context, Imports semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Condition=Condition)
	 */
	protected void sequence_Maintain(EObject context, Maintain semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GOAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GOAL__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GOAL__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GOAL__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMaintainAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMaintainAccess().getConditionConditionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         equalTo?='==' | 
	 *         largerThan?='>' | 
	 *         smallerThan?='<' | 
	 *         largerOrEqualTo?='>=' | 
	 *         smallerOrEqualTo?='<=' | 
	 *         notEqualTo?='!='
	 *     )
	 */
	protected void sequence_Operator(EObject context, Operator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     Parameters+=Parameter+
	 */
	protected void sequence_Parameters(EObject context, Parameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Condition=Condition)
	 */
	protected void sequence_Perform(EObject context, Perform semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GOAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GOAL__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GOAL__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GOAL__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPerformAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPerformAccess().getConditionConditionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Body=Body Trigger=Trigger)
	 */
	protected void sequence_Plan(EObject context, Plan semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLAN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLAN__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLAN__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLAN__BODY));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLAN__TRIGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLAN__TRIGGER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPlanAccess().getBodyBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.accept(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_3_0(), semanticObject.getTrigger());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     Plans+=Plan+
	 */
	protected void sequence_Plans(EObject context, Plans semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Condition=Condition Result=Result)
	 */
	protected void sequence_Query(EObject context, Query semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GOAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GOAL__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GOAL__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GOAL__CONDITION));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.QUERY__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.QUERY__RESULT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getQueryAccess().getConditionConditionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getQueryAccess().getResultResultParserRuleCall_3_0(), semanticObject.getResult());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     Statements+=Statement+
	 */
	protected void sequence_Statements(EObject context, Statements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Term_Division_1_0_1_0 right=Factor)
	 */
	protected void sequence_Term(EObject context, Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Term_Multiply_1_0_0_0 right=Factor)
	 */
	protected void sequence_Term(EObject context, Multiply semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MULTIPLY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MULTIPLY__LEFT));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MULTIPLY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MULTIPLY__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (Event=[Event|ID] | Goal=[Goal|ID])
	 */
	protected void sequence_Trigger(EObject context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
