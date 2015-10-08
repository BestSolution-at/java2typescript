package at.bestsolution.typescript.service.spec.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.typescript.service.spec.services.TSSpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTSSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'javatype'", "'cust'", "'extends'", "'{'", "'}'", "'enum'", "'('", "')'", "'alias'", "'as'", "'optional'", "'='", "'<'", "','", "'>'", "'[]'", "'command'", "'returns'", "'void'", "'event'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DOC=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTSSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTSSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTSSpecParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g"; }



     	private TSSpecGrammarAccess grammarAccess;
     	
        public InternalTSSpecParser(TokenStream input, TSSpecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ServiceDefs";	
       	}
       	
       	@Override
       	protected TSSpecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleServiceDefs"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:67:1: entryRuleServiceDefs returns [EObject current=null] : iv_ruleServiceDefs= ruleServiceDefs EOF ;
    public final EObject entryRuleServiceDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDefs = null;


        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:68:2: (iv_ruleServiceDefs= ruleServiceDefs EOF )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:69:2: iv_ruleServiceDefs= ruleServiceDefs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceDefsRule()); 
            }
            pushFollow(FOLLOW_ruleServiceDefs_in_entryRuleServiceDefs75);
            iv_ruleServiceDefs=ruleServiceDefs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceDefs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDefs85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleServiceDefs"


    // $ANTLR start "ruleServiceDefs"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:76:1: ruleServiceDefs returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_commandList_3_0= ruleCommandDef ) )* ( (lv_eventList_4_0= ruleEventDef ) )* ) ;
    public final EObject ruleServiceDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_domainElements_2_0 = null;

        EObject lv_commandList_3_0 = null;

        EObject lv_eventList_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_commandList_3_0= ruleCommandDef ) )* ( (lv_eventList_4_0= ruleEventDef ) )* ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_commandList_3_0= ruleCommandDef ) )* ( (lv_eventList_4_0= ruleEventDef ) )* )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_commandList_3_0= ruleCommandDef ) )* ( (lv_eventList_4_0= ruleEventDef ) )* )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_commandList_3_0= ruleCommandDef ) )* ( (lv_eventList_4_0= ruleEventDef ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleServiceDefs122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceDefsAccess().getPackageKeyword_0());
                  
            }
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:84:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:86:3: lv_packageName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceDefsAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleServiceDefs143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceDefsRule());
              	        }
                     		set(
                     			current, 
                     			"packageName",
                      		lv_packageName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:102:2: ( (lv_domainElements_2_0= ruleDomainElement ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:103:1: (lv_domainElements_2_0= ruleDomainElement )
            	    {
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:103:1: (lv_domainElements_2_0= ruleDomainElement )
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:104:3: lv_domainElements_2_0= ruleDomainElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefsAccess().getDomainElementsDomainElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDomainElement_in_ruleServiceDefs164);
            	    lv_domainElements_2_0=ruleDomainElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"domainElements",
            	              		lv_domainElements_2_0, 
            	              		"DomainElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:120:3: ( (lv_commandList_3_0= ruleCommandDef ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:121:1: (lv_commandList_3_0= ruleCommandDef )
            	    {
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:121:1: (lv_commandList_3_0= ruleCommandDef )
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:122:3: lv_commandList_3_0= ruleCommandDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefsAccess().getCommandListCommandDefParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommandDef_in_ruleServiceDefs186);
            	    lv_commandList_3_0=ruleCommandDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"commandList",
            	              		lv_commandList_3_0, 
            	              		"CommandDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:138:3: ( (lv_eventList_4_0= ruleEventDef ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:139:1: (lv_eventList_4_0= ruleEventDef )
            	    {
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:139:1: (lv_eventList_4_0= ruleEventDef )
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:140:3: lv_eventList_4_0= ruleEventDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefsAccess().getEventListEventDefParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEventDef_in_ruleServiceDefs208);
            	    lv_eventList_4_0=ruleEventDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"eventList",
            	              		lv_eventList_4_0, 
            	              		"EventDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleServiceDefs"


    // $ANTLR start "entryRuleDomainElement"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:164:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:165:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:166:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement245);
            iv_ruleDomainElement=ruleDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement255); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainElement"


    // $ANTLR start "ruleDomainElement"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:173:1: ruleDomainElement returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_cust_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_attributes_8_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;

        EObject lv_enumValues_13_0 = null;

        AntlrDatatypeRuleToken lv_name_16_0 = null;

        AntlrDatatypeRuleToken lv_realType_18_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:176:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:177:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:177:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:177:2: ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:177:2: ( (lv_doc_0_0= RULE_DOC ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOC) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:178:1: (lv_doc_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:178:1: (lv_doc_0_0= RULE_DOC )
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:179:3: lv_doc_0_0= RULE_DOC
            	    {
            	    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleDomainElement297); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_doc_0_0, grammarAccess.getDomainElementAccess().getDocDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDomainElementRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"doc",
            	              		lv_doc_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:195:3: ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:195:4: (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:195:4: (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:195:6: otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDomainElement317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDomainElementAccess().getJavatypeKeyword_1_0_0());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:199:1: ( (lv_name_2_0= ruleQualifiedName ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:200:1: (lv_name_2_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:200:1: (lv_name_2_0= ruleQualifiedName )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:201:3: lv_name_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement338);
                    lv_name_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:218:6: ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:218:6: ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:218:7: ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:218:7: ( (lv_cust_3_0= 'cust' ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:219:1: (lv_cust_3_0= 'cust' )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:219:1: (lv_cust_3_0= 'cust' )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:220:3: lv_cust_3_0= 'cust'
                    {
                    lv_cust_3_0=(Token)match(input,14,FOLLOW_14_in_ruleDomainElement364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_cust_3_0, grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDomainElementRule());
                      	        }
                             		setWithLastConsumed(current, "cust", true, "cust");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:233:2: ( (lv_name_4_0= ruleQualifiedName ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:234:1: (lv_name_4_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:234:1: (lv_name_4_0= ruleQualifiedName )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:235:3: lv_name_4_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement398);
                    lv_name_4_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:251:2: (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==15) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:251:4: otherlv_5= 'extends' ( ( ruleQualifiedName ) )
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDomainElement411); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getDomainElementAccess().getExtendsKeyword_1_1_2_0());
                                  
                            }
                            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:255:1: ( ( ruleQualifiedName ) )
                            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:256:1: ( ruleQualifiedName )
                            {
                            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:256:1: ( ruleQualifiedName )
                            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:257:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getDomainElementRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement434);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleDomainElement448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDomainElementAccess().getLeftCurlyBracketKeyword_1_1_3());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:274:1: ( (lv_attributes_8_0= ruleAttribute ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_DOC && LA6_0<=RULE_ID)||LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:275:1: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:275:1: (lv_attributes_8_0= ruleAttribute )
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:276:3: lv_attributes_8_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDomainElementAccess().getAttributesAttributeParserRuleCall_1_1_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleDomainElement469);
                    	    lv_attributes_8_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_8_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleDomainElement482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDomainElementAccess().getRightCurlyBracketKeyword_1_1_5());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:297:6: (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:297:6: (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:297:8: otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleDomainElement502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDomainElementAccess().getEnumKeyword_1_2_0());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:301:1: ( (lv_name_11_0= ruleQualifiedName ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:302:1: (lv_name_11_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:302:1: (lv_name_11_0= ruleQualifiedName )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:303:3: lv_name_11_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement523);
                    lv_name_11_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_11_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleDomainElement535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDomainElementAccess().getLeftParenthesisKeyword_1_2_2());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:323:1: ( (lv_enumValues_13_0= ruleEnumVal ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_DOC && LA7_0<=RULE_ID)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:324:1: (lv_enumValues_13_0= ruleEnumVal )
                    	    {
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:324:1: (lv_enumValues_13_0= ruleEnumVal )
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:325:3: lv_enumValues_13_0= ruleEnumVal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDomainElementAccess().getEnumValuesEnumValParserRuleCall_1_2_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEnumVal_in_ruleDomainElement556);
                    	    lv_enumValues_13_0=ruleEnumVal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"enumValues",
                    	              		lv_enumValues_13_0, 
                    	              		"EnumVal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleDomainElement569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDomainElementAccess().getRightParenthesisKeyword_1_2_4());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:346:6: (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:346:6: (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:346:8: otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) )
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleDomainElement589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDomainElementAccess().getAliasKeyword_1_3_0());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:350:1: ( (lv_name_16_0= ruleQualifiedName ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:351:1: (lv_name_16_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:351:1: (lv_name_16_0= ruleQualifiedName )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:352:3: lv_name_16_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement610);
                    lv_name_16_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_16_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleDomainElement622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getDomainElementAccess().getAsKeyword_1_3_2());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:372:1: ( (lv_realType_18_0= ruleQualifiedName ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:373:1: (lv_realType_18_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:373:1: (lv_realType_18_0= ruleQualifiedName )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:374:3: lv_realType_18_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getRealTypeQualifiedNameParserRuleCall_1_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement643);
                    lv_realType_18_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"realType",
                              		lv_realType_18_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDomainElement"


    // $ANTLR start "entryRuleEnumVal"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:398:1: entryRuleEnumVal returns [EObject current=null] : iv_ruleEnumVal= ruleEnumVal EOF ;
    public final EObject entryRuleEnumVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumVal = null;


        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:399:2: (iv_ruleEnumVal= ruleEnumVal EOF )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:400:2: iv_ruleEnumVal= ruleEnumVal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumValRule()); 
            }
            pushFollow(FOLLOW_ruleEnumVal_in_entryRuleEnumVal681);
            iv_ruleEnumVal=ruleEnumVal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumVal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumVal691); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumVal"


    // $ANTLR start "ruleEnumVal"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:407:1: ruleEnumVal returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumVal() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:410:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:411:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:411:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:411:2: ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:411:2: ( (lv_doc_0_0= RULE_DOC ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOC) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:412:1: (lv_doc_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:412:1: (lv_doc_0_0= RULE_DOC )
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:413:3: lv_doc_0_0= RULE_DOC
            	    {
            	    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumVal733); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_doc_0_0, grammarAccess.getEnumValAccess().getDocDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEnumValRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"doc",
            	              		lv_doc_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:429:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:430:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:430:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:431:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumVal756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEnumValAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumValRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumVal"


    // $ANTLR start "entryRuleAttribute"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:455:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:456:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:457:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute797);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute807); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:464:1: ruleAttribute returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_optional_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:467:28: ( ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:468:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:468:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:468:2: ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:468:2: ( (lv_documentation_0_0= RULE_DOC ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:469:1: (lv_documentation_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:469:1: (lv_documentation_0_0= RULE_DOC )
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:470:3: lv_documentation_0_0= RULE_DOC
            	    {
            	    lv_documentation_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAttribute849); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_documentation_0_0, grammarAccess.getAttributeAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAttributeRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"documentation",
            	              		lv_documentation_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:486:3: ( (lv_optional_1_0= 'optional' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:487:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:487:1: (lv_optional_1_0= 'optional' )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:488:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,23,FOLLOW_23_in_ruleAttribute873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_1_0, grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:501:3: ( (lv_type_2_0= ruleGenericTypeArgument ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:502:1: (lv_type_2_0= ruleGenericTypeArgument )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:502:1: (lv_type_2_0= ruleGenericTypeArgument )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:503:3: lv_type_2_0= ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeGenericTypeArgumentParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_ruleAttribute908);
            lv_type_2_0=ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"GenericTypeArgument");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:519:2: ( (lv_name_3_0= RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:520:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:520:1: (lv_name_3_0= RULE_ID )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:521:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:537:2: (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:537:4: otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleAttribute943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:541:1: ( (lv_value_5_0= RULE_STRING ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:542:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:542:1: (lv_value_5_0= RULE_STRING )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:543:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_5_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleGenericTypeArgument"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:567:1: entryRuleGenericTypeArgument returns [EObject current=null] : iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF ;
    public final EObject entryRuleGenericTypeArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericTypeArgument = null;


        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:568:2: (iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:569:2: iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericTypeArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_entryRuleGenericTypeArgument1003);
            iv_ruleGenericTypeArgument=ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericTypeArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericTypeArgument1013); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenericTypeArgument"


    // $ANTLR start "ruleGenericTypeArgument"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:576:1: ruleGenericTypeArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? ) ;
    public final EObject ruleGenericTypeArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_list_6_0=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:579:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:580:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:580:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:580:2: ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )?
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:580:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:581:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:581:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:582:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGenericTypeArgumentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGenericTypeArgument1061);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:595:2: (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:595:4: otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleGenericTypeArgument1074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getGenericTypeArgumentAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:599:1: ( (lv_arguments_2_0= ruleGenericTypeArgument ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:600:1: (lv_arguments_2_0= ruleGenericTypeArgument )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:600:1: (lv_arguments_2_0= ruleGenericTypeArgument )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:601:3: lv_arguments_2_0= ruleGenericTypeArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenericTypeArgument_in_ruleGenericTypeArgument1095);
                    lv_arguments_2_0=ruleGenericTypeArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGenericTypeArgumentRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"GenericTypeArgument");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:617:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==26) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:617:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleGenericTypeArgument1108); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getGenericTypeArgumentAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:621:1: ( (lv_arguments_4_0= ruleGenericTypeArgument ) )
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:622:1: (lv_arguments_4_0= ruleGenericTypeArgument )
                    	    {
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:622:1: (lv_arguments_4_0= ruleGenericTypeArgument )
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:623:3: lv_arguments_4_0= ruleGenericTypeArgument
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleGenericTypeArgument_in_ruleGenericTypeArgument1129);
                    	    lv_arguments_4_0=ruleGenericTypeArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getGenericTypeArgumentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"GenericTypeArgument");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleGenericTypeArgument1143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getGenericTypeArgumentAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:643:3: ( (lv_list_6_0= '[]' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:644:1: (lv_list_6_0= '[]' )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:644:1: (lv_list_6_0= '[]' )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:645:3: lv_list_6_0= '[]'
                    {
                    lv_list_6_0=(Token)match(input,28,FOLLOW_28_in_ruleGenericTypeArgument1163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_list_6_0, grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGenericTypeArgumentRule());
                      	        }
                             		setWithLastConsumed(current, "list", true, "[]");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGenericTypeArgument"


    // $ANTLR start "entryRuleCommandDef"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:666:1: entryRuleCommandDef returns [EObject current=null] : iv_ruleCommandDef= ruleCommandDef EOF ;
    public final EObject entryRuleCommandDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandDef = null;


        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:667:2: (iv_ruleCommandDef= ruleCommandDef EOF )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:668:2: iv_ruleCommandDef= ruleCommandDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandDefRule()); 
            }
            pushFollow(FOLLOW_ruleCommandDef_in_entryRuleCommandDef1213);
            iv_ruleCommandDef=ruleCommandDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandDef1223); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommandDef"


    // $ANTLR start "ruleCommandDef"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:675:1: ruleCommandDef returns [EObject current=null] : (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) ) ) ;
    public final EObject ruleCommandDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_returnVal_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:678:28: ( (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) ) ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:679:1: (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) ) )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:679:1: (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:679:3: otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleCommandDef1260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCommandDefAccess().getCommandKeyword_0());
                  
            }
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:683:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:684:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:684:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:685:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandDef1277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getCommandDefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommandDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:701:2: (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:701:4: otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleCommandDef1295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCommandDefAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:705:1: ( (lv_attributes_3_0= ruleAttribute ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_DOC && LA16_0<=RULE_ID)||LA16_0==23) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:706:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:706:1: (lv_attributes_3_0= ruleAttribute )
                    	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:707:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCommandDefAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleCommandDef1316);
                    	    lv_attributes_3_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCommandDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_3_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleCommandDef1329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCommandDefAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleCommandDef1343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCommandDefAccess().getReturnsKeyword_3());
                  
            }
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:731:1: (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:731:3: otherlv_6= 'void'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleCommandDef1356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCommandDefAccess().getVoidKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:736:6: ( (lv_returnVal_7_0= ruleGenericTypeArgument ) )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:736:6: ( (lv_returnVal_7_0= ruleGenericTypeArgument ) )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:737:1: (lv_returnVal_7_0= ruleGenericTypeArgument )
                    {
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:737:1: (lv_returnVal_7_0= ruleGenericTypeArgument )
                    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:738:3: lv_returnVal_7_0= ruleGenericTypeArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandDefAccess().getReturnValGenericTypeArgumentParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenericTypeArgument_in_ruleCommandDef1383);
                    lv_returnVal_7_0=ruleGenericTypeArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandDefRule());
                      	        }
                             		set(
                             			current, 
                             			"returnVal",
                              		lv_returnVal_7_0, 
                              		"GenericTypeArgument");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCommandDef"


    // $ANTLR start "entryRuleEventDef"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:762:1: entryRuleEventDef returns [EObject current=null] : iv_ruleEventDef= ruleEventDef EOF ;
    public final EObject entryRuleEventDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDef = null;


        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:763:2: (iv_ruleEventDef= ruleEventDef EOF )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:764:2: iv_ruleEventDef= ruleEventDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefRule()); 
            }
            pushFollow(FOLLOW_ruleEventDef_in_entryRuleEventDef1420);
            iv_ruleEventDef=ruleEventDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDef1430); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventDef"


    // $ANTLR start "ruleEventDef"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:771:1: ruleEventDef returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) ) ) ;
    public final EObject ruleEventDef() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:774:28: ( ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) ) ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:775:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) ) )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:775:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:775:2: ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:775:2: ( (lv_documentation_0_0= RULE_DOC ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOC) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:776:1: (lv_documentation_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:776:1: (lv_documentation_0_0= RULE_DOC )
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:777:3: lv_documentation_0_0= RULE_DOC
            	    {
            	    lv_documentation_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEventDef1472); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_documentation_0_0, grammarAccess.getEventDefAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEventDefRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"documentation",
            	              		lv_documentation_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleEventDef1490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefAccess().getEventKeyword_1());
                  
            }
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:797:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:798:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:798:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:799:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDef1507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEventDefAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:815:2: ( (lv_type_3_0= ruleGenericTypeArgument ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:816:1: (lv_type_3_0= ruleGenericTypeArgument )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:816:1: (lv_type_3_0= ruleGenericTypeArgument )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:817:3: lv_type_3_0= ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefAccess().getTypeGenericTypeArgumentParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_ruleEventDef1533);
            lv_type_3_0=ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"GenericTypeArgument");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEventDef"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:841:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:842:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:843:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1570);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1581); if (state.failed) return current;

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
    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:850:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:853:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:854:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:854:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:854:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:861:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) && (synpred1_InternalTSSpec())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:861:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:861:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:861:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleQualifiedName1649); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1665); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"

    // $ANTLR start synpred1_InternalTSSpec
    public final void synpred1_InternalTSSpec_fragment() throws RecognitionException {   
        // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:861:3: ( '.' )
        // ../at.bestsolution.typescript.service.spec/src-gen/at/bestsolution/typescript/service/spec/parser/antlr/internal/InternalTSSpec.g:862:2: '.'
        {
        match(input,33,FOLLOW_33_in_synpred1_InternalTSSpec1640); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTSSpec

    // Delegated rules

    public final boolean synpred1_InternalTSSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTSSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\1\1\3\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA1_maxS =
        "\1\40\1\uffff\1\40\1\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\10\uffff\2\3\3\uffff\1\3\2\uffff\1\3\7\uffff\1\1\2\uffff\1\1",
            "",
            "\1\2\10\uffff\2\3\3\uffff\1\3\2\uffff\1\3\12\uffff\1\1",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 102:2: ( (lv_domainElements_2_0= ruleDomainElement ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleServiceDefs_in_entryRuleServiceDefs75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDefs85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleServiceDefs122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleServiceDefs143 = new BitSet(new long[]{0x0000000120246012L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleServiceDefs164 = new BitSet(new long[]{0x0000000120246012L});
    public static final BitSet FOLLOW_ruleCommandDef_in_ruleServiceDefs186 = new BitSet(new long[]{0x0000000120000012L});
    public static final BitSet FOLLOW_ruleEventDef_in_ruleServiceDefs208 = new BitSet(new long[]{0x0000000100000012L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleDomainElement297 = new BitSet(new long[]{0x0000000000246010L});
    public static final BitSet FOLLOW_13_in_ruleDomainElement317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDomainElement364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement398 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDomainElement411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement434 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDomainElement448 = new BitSet(new long[]{0x0000000000820030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDomainElement469 = new BitSet(new long[]{0x0000000000820030L});
    public static final BitSet FOLLOW_17_in_ruleDomainElement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDomainElement502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement523 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDomainElement535 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleEnumVal_in_ruleDomainElement556 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_20_in_ruleDomainElement569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDomainElement589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement610 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDomainElement622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumVal_in_entryRuleEnumVal681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumVal691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumVal733 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumVal756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAttribute849 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_23_in_ruleAttribute873 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_ruleAttribute908 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute925 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute943 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_entryRuleGenericTypeArgument1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericTypeArgument1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGenericTypeArgument1061 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_25_in_ruleGenericTypeArgument1074 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_ruleGenericTypeArgument1095 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleGenericTypeArgument1108 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_ruleGenericTypeArgument1129 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleGenericTypeArgument1143 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleGenericTypeArgument1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandDef_in_entryRuleCommandDef1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandDef1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCommandDef1260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandDef1277 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleCommandDef1295 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleCommandDef1316 = new BitSet(new long[]{0x0000000000900030L});
    public static final BitSet FOLLOW_20_in_ruleCommandDef1329 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCommandDef1343 = new BitSet(new long[]{0x0000000080800030L});
    public static final BitSet FOLLOW_31_in_ruleCommandDef1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_ruleCommandDef1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDef_in_entryRuleEventDef1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDef1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEventDef1472 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleEventDef1490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDef1507 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_ruleEventDef1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1621 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleQualifiedName1649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1665 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_synpred1_InternalTSSpec1640 = new BitSet(new long[]{0x0000000000000002L});

}