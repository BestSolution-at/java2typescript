/*
 * generated by Xtext
 */
package at.bestsolution.typescript.service.spec.serializer;

import at.bestsolution.typescript.service.spec.services.TSSpecGrammarAccess;
import at.bestsolution.typescript.service.spec.tSSpec.Attribute;
import at.bestsolution.typescript.service.spec.tSSpec.CommandDef;
import at.bestsolution.typescript.service.spec.tSSpec.DomainElement;
import at.bestsolution.typescript.service.spec.tSSpec.EnumVal;
import at.bestsolution.typescript.service.spec.tSSpec.EventDef;
import at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument;
import at.bestsolution.typescript.service.spec.tSSpec.ServiceDef;
import at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs;
import at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class TSSpecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TSSpecGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TSSpecPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TSSpecPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case TSSpecPackage.COMMAND_DEF:
				sequence_CommandDef(context, (CommandDef) semanticObject); 
				return; 
			case TSSpecPackage.DOMAIN_ELEMENT:
				sequence_DomainElement(context, (DomainElement) semanticObject); 
				return; 
			case TSSpecPackage.ENUM_VAL:
				sequence_EnumVal(context, (EnumVal) semanticObject); 
				return; 
			case TSSpecPackage.EVENT_DEF:
				sequence_EventDef(context, (EventDef) semanticObject); 
				return; 
			case TSSpecPackage.GENERIC_TYPE_ARGUMENT:
				sequence_GenericTypeArgument(context, (GenericTypeArgument) semanticObject); 
				return; 
			case TSSpecPackage.SERVICE_DEF:
				sequence_ServiceDef(context, (ServiceDef) semanticObject); 
				return; 
			case TSSpecPackage.SERVICE_DEFS:
				sequence_ServiceDefs(context, (ServiceDefs) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (documentation+=DOC* optional?='optional'? type=GenericTypeArgument name=ID value=STRING?)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CommandDef returns CommandDef
	 *
	 * Constraint:
	 *     (name=ID attributes+=Attribute* returnVal=GenericTypeArgument?)
	 */
	protected void sequence_CommandDef(ISerializationContext context, CommandDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainElement returns DomainElement
	 *
	 * Constraint:
	 *     (
	 *         doc+=DOC* 
	 *         (
	 *             name=QualifiedName | 
	 *             (cust?='cust' name=QualifiedName superType=[DomainElement|QualifiedName]? attributes+=Attribute*) | 
	 *             (isEnum?='enum' name=QualifiedName enumValues+=EnumVal*) | 
	 *             (name=QualifiedName realType=QualifiedName)
	 *         )
	 *     )
	 */
	protected void sequence_DomainElement(ISerializationContext context, DomainElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumVal returns EnumVal
	 *
	 * Constraint:
	 *     (doc+=DOC* name=ID (value=ID | value=STRING))
	 */
	protected void sequence_EnumVal(ISerializationContext context, EnumVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventDef returns EventDef
	 *
	 * Constraint:
	 *     (documentation+=DOC* name=ID type=GenericTypeArgument)
	 */
	protected void sequence_EventDef(ISerializationContext context, EventDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenericTypeArgument returns GenericTypeArgument
	 *
	 * Constraint:
	 *     (type=[DomainElement|QualifiedName] (arguments+=GenericTypeArgument arguments+=GenericTypeArgument*)? list?='[]'?)
	 */
	protected void sequence_GenericTypeArgument(ISerializationContext context, GenericTypeArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceDef returns ServiceDef
	 *
	 * Constraint:
	 *     (name=ID commandList+=CommandDef* eventList+=EventDef*)
	 */
	protected void sequence_ServiceDef(ISerializationContext context, ServiceDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceDefs returns ServiceDefs
	 *
	 * Constraint:
	 *     (packageName=QualifiedName domainElements+=DomainElement* serviceDefs+=ServiceDef*)
	 */
	protected void sequence_ServiceDefs(ISerializationContext context, ServiceDefs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
