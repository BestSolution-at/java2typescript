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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'javatype'", "'cust'", "'extends'", "'{'", "'}'", "'enum'", "'('", "')'", "'alias'", "'as'", "'='", "'optional'", "'<'", "','", "'>'", "'[]'", "'command'", "'returns'", "'void'", "'event'", "'.'"
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
    public String getGrammarFileName() { return "InternalTSSpec.g"; }



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
    // InternalTSSpec.g:67:1: entryRuleServiceDefs returns [EObject current=null] : iv_ruleServiceDefs= ruleServiceDefs EOF ;
    public final EObject entryRuleServiceDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDefs = null;


        try {
            // InternalTSSpec.g:68:2: (iv_ruleServiceDefs= ruleServiceDefs EOF )
            // InternalTSSpec.g:69:2: iv_ruleServiceDefs= ruleServiceDefs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceDefsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleServiceDefs=ruleServiceDefs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceDefs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTSSpec.g:76:1: ruleServiceDefs returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )* ) ;
    public final EObject ruleServiceDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_domainElements_2_0 = null;

        EObject lv_serviceDefs_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTSSpec.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )* ) )
            // InternalTSSpec.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )* )
            {
            // InternalTSSpec.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )* )
            // InternalTSSpec.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceDefsAccess().getPackageKeyword_0());
                  
            }
            // InternalTSSpec.g:84:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // InternalTSSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // InternalTSSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            // InternalTSSpec.g:86:3: lv_packageName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceDefsAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"at.bestsolution.typescript.service.spec.TSSpec.QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTSSpec.g:102:2: ( (lv_domainElements_2_0= ruleDomainElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_DOC||(LA1_0>=13 && LA1_0<=14)||LA1_0==18||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTSSpec.g:103:1: (lv_domainElements_2_0= ruleDomainElement )
            	    {
            	    // InternalTSSpec.g:103:1: (lv_domainElements_2_0= ruleDomainElement )
            	    // InternalTSSpec.g:104:3: lv_domainElements_2_0= ruleDomainElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefsAccess().getDomainElementsDomainElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
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
            	              		"at.bestsolution.typescript.service.spec.TSSpec.DomainElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTSSpec.g:120:3: ( (lv_serviceDefs_3_0= ruleServiceDef ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTSSpec.g:121:1: (lv_serviceDefs_3_0= ruleServiceDef )
            	    {
            	    // InternalTSSpec.g:121:1: (lv_serviceDefs_3_0= ruleServiceDef )
            	    // InternalTSSpec.g:122:3: lv_serviceDefs_3_0= ruleServiceDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefsAccess().getServiceDefsServiceDefParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_serviceDefs_3_0=ruleServiceDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"serviceDefs",
            	              		lv_serviceDefs_3_0, 
            	              		"at.bestsolution.typescript.service.spec.TSSpec.ServiceDef");
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
    // InternalTSSpec.g:146:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // InternalTSSpec.g:147:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // InternalTSSpec.g:148:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainElement=ruleDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTSSpec.g:155:1: ruleDomainElement returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | ( ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_cust_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_isEnum_10_0=null;
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
            // InternalTSSpec.g:158:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | ( ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) ) )
            // InternalTSSpec.g:159:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | ( ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) )
            {
            // InternalTSSpec.g:159:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | ( ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) )
            // InternalTSSpec.g:159:2: ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | ( ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) )
            {
            // InternalTSSpec.g:159:2: ( (lv_doc_0_0= RULE_DOC ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTSSpec.g:160:1: (lv_doc_0_0= RULE_DOC )
            	    {
            	    // InternalTSSpec.g:160:1: (lv_doc_0_0= RULE_DOC )
            	    // InternalTSSpec.g:161:3: lv_doc_0_0= RULE_DOC
            	    {
            	    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_6); if (state.failed) return current;
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
            	              		"at.bestsolution.typescript.service.spec.TSSpec.DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalTSSpec.g:177:3: ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | ( ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTSSpec.g:177:4: (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) )
                    {
                    // InternalTSSpec.g:177:4: (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) )
                    // InternalTSSpec.g:177:6: otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDomainElementAccess().getJavatypeKeyword_1_0_0());
                          
                    }
                    // InternalTSSpec.g:181:1: ( (lv_name_2_0= ruleQualifiedName ) )
                    // InternalTSSpec.g:182:1: (lv_name_2_0= ruleQualifiedName )
                    {
                    // InternalTSSpec.g:182:1: (lv_name_2_0= ruleQualifiedName )
                    // InternalTSSpec.g:183:3: lv_name_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.typescript.service.spec.TSSpec.QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTSSpec.g:200:6: ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
                    {
                    // InternalTSSpec.g:200:6: ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
                    // InternalTSSpec.g:200:7: ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
                    {
                    // InternalTSSpec.g:200:7: ( (lv_cust_3_0= 'cust' ) )
                    // InternalTSSpec.g:201:1: (lv_cust_3_0= 'cust' )
                    {
                    // InternalTSSpec.g:201:1: (lv_cust_3_0= 'cust' )
                    // InternalTSSpec.g:202:3: lv_cust_3_0= 'cust'
                    {
                    lv_cust_3_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
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

                    // InternalTSSpec.g:215:2: ( (lv_name_4_0= ruleQualifiedName ) )
                    // InternalTSSpec.g:216:1: (lv_name_4_0= ruleQualifiedName )
                    {
                    // InternalTSSpec.g:216:1: (lv_name_4_0= ruleQualifiedName )
                    // InternalTSSpec.g:217:3: lv_name_4_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
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
                              		"at.bestsolution.typescript.service.spec.TSSpec.QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalTSSpec.g:233:2: (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalTSSpec.g:233:4: otherlv_5= 'extends' ( ( ruleQualifiedName ) )
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getDomainElementAccess().getExtendsKeyword_1_1_2_0());
                                  
                            }
                            // InternalTSSpec.g:237:1: ( ( ruleQualifiedName ) )
                            // InternalTSSpec.g:238:1: ( ruleQualifiedName )
                            {
                            // InternalTSSpec.g:238:1: ( ruleQualifiedName )
                            // InternalTSSpec.g:239:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getDomainElementRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_8);
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

                    otherlv_7=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDomainElementAccess().getLeftCurlyBracketKeyword_1_1_3());
                          
                    }
                    // InternalTSSpec.g:256:1: ( (lv_attributes_8_0= ruleAttribute ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_DOC && LA5_0<=RULE_ID)||LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTSSpec.g:257:1: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // InternalTSSpec.g:257:1: (lv_attributes_8_0= ruleAttribute )
                    	    // InternalTSSpec.g:258:3: lv_attributes_8_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDomainElementAccess().getAttributesAttributeParserRuleCall_1_1_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	              		"at.bestsolution.typescript.service.spec.TSSpec.Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDomainElementAccess().getRightCurlyBracketKeyword_1_1_5());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTSSpec.g:279:6: ( ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' )
                    {
                    // InternalTSSpec.g:279:6: ( ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' )
                    // InternalTSSpec.g:279:7: ( (lv_isEnum_10_0= 'enum' ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')'
                    {
                    // InternalTSSpec.g:279:7: ( (lv_isEnum_10_0= 'enum' ) )
                    // InternalTSSpec.g:280:1: (lv_isEnum_10_0= 'enum' )
                    {
                    // InternalTSSpec.g:280:1: (lv_isEnum_10_0= 'enum' )
                    // InternalTSSpec.g:281:3: lv_isEnum_10_0= 'enum'
                    {
                    lv_isEnum_10_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isEnum_10_0, grammarAccess.getDomainElementAccess().getIsEnumEnumKeyword_1_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDomainElementRule());
                      	        }
                             		setWithLastConsumed(current, "isEnum", true, "enum");
                      	    
                    }

                    }


                    }

                    // InternalTSSpec.g:294:2: ( (lv_name_11_0= ruleQualifiedName ) )
                    // InternalTSSpec.g:295:1: (lv_name_11_0= ruleQualifiedName )
                    {
                    // InternalTSSpec.g:295:1: (lv_name_11_0= ruleQualifiedName )
                    // InternalTSSpec.g:296:3: lv_name_11_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_10);
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
                              		"at.bestsolution.typescript.service.spec.TSSpec.QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDomainElementAccess().getLeftParenthesisKeyword_1_2_2());
                          
                    }
                    // InternalTSSpec.g:316:1: ( (lv_enumValues_13_0= ruleEnumVal ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_DOC && LA6_0<=RULE_ID)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTSSpec.g:317:1: (lv_enumValues_13_0= ruleEnumVal )
                    	    {
                    	    // InternalTSSpec.g:317:1: (lv_enumValues_13_0= ruleEnumVal )
                    	    // InternalTSSpec.g:318:3: lv_enumValues_13_0= ruleEnumVal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDomainElementAccess().getEnumValuesEnumValParserRuleCall_1_2_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_11);
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
                    	              		"at.bestsolution.typescript.service.spec.TSSpec.EnumVal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDomainElementAccess().getRightParenthesisKeyword_1_2_4());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTSSpec.g:339:6: (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) )
                    {
                    // InternalTSSpec.g:339:6: (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) )
                    // InternalTSSpec.g:339:8: otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) )
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDomainElementAccess().getAliasKeyword_1_3_0());
                          
                    }
                    // InternalTSSpec.g:343:1: ( (lv_name_16_0= ruleQualifiedName ) )
                    // InternalTSSpec.g:344:1: (lv_name_16_0= ruleQualifiedName )
                    {
                    // InternalTSSpec.g:344:1: (lv_name_16_0= ruleQualifiedName )
                    // InternalTSSpec.g:345:3: lv_name_16_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_12);
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
                              		"at.bestsolution.typescript.service.spec.TSSpec.QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getDomainElementAccess().getAsKeyword_1_3_2());
                          
                    }
                    // InternalTSSpec.g:365:1: ( (lv_realType_18_0= ruleQualifiedName ) )
                    // InternalTSSpec.g:366:1: (lv_realType_18_0= ruleQualifiedName )
                    {
                    // InternalTSSpec.g:366:1: (lv_realType_18_0= ruleQualifiedName )
                    // InternalTSSpec.g:367:3: lv_realType_18_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getRealTypeQualifiedNameParserRuleCall_1_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.typescript.service.spec.TSSpec.QualifiedName");
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
    // InternalTSSpec.g:391:1: entryRuleEnumVal returns [EObject current=null] : iv_ruleEnumVal= ruleEnumVal EOF ;
    public final EObject entryRuleEnumVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumVal = null;


        try {
            // InternalTSSpec.g:392:2: (iv_ruleEnumVal= ruleEnumVal EOF )
            // InternalTSSpec.g:393:2: iv_ruleEnumVal= ruleEnumVal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumValRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumVal=ruleEnumVal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumVal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTSSpec.g:400:1: ruleEnumVal returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) ) ) | ( (lv_intValue_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleEnumVal() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        Token lv_intValue_4_0=null;

         enterRule(); 
            
        try {
            // InternalTSSpec.g:403:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) ) ) | ( (lv_intValue_4_0= RULE_INT ) ) ) ) )
            // InternalTSSpec.g:404:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) ) ) | ( (lv_intValue_4_0= RULE_INT ) ) ) )
            {
            // InternalTSSpec.g:404:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) ) ) | ( (lv_intValue_4_0= RULE_INT ) ) ) )
            // InternalTSSpec.g:404:2: ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) ) ) | ( (lv_intValue_4_0= RULE_INT ) ) )
            {
            // InternalTSSpec.g:404:2: ( (lv_doc_0_0= RULE_DOC ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOC) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTSSpec.g:405:1: (lv_doc_0_0= RULE_DOC )
            	    {
            	    // InternalTSSpec.g:405:1: (lv_doc_0_0= RULE_DOC )
            	    // InternalTSSpec.g:406:3: lv_doc_0_0= RULE_DOC
            	    {
            	    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_13); if (state.failed) return current;
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
            	              		"at.bestsolution.typescript.service.spec.TSSpec.DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalTSSpec.g:422:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTSSpec.g:423:1: (lv_name_1_0= RULE_ID )
            {
            // InternalTSSpec.g:423:1: (lv_name_1_0= RULE_ID )
            // InternalTSSpec.g:424:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumValAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalTSSpec.g:444:1: ( ( ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) ) ) | ( (lv_intValue_4_0= RULE_INT ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTSSpec.g:444:2: ( ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) ) )
                    {
                    // InternalTSSpec.g:444:2: ( ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) ) )
                    // InternalTSSpec.g:445:1: ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) )
                    {
                    // InternalTSSpec.g:445:1: ( (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING ) )
                    // InternalTSSpec.g:446:1: (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING )
                    {
                    // InternalTSSpec.g:446:1: (lv_value_3_1= RULE_ID | lv_value_3_2= RULE_STRING )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_STRING) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTSSpec.g:447:3: lv_value_3_1= RULE_ID
                            {
                            lv_value_3_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_3_1, grammarAccess.getEnumValAccess().getValueIDTerminalRuleCall_3_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEnumValRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_3_1, 
                                      		"org.eclipse.xtext.common.Terminals.ID");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalTSSpec.g:462:8: lv_value_3_2= RULE_STRING
                            {
                            lv_value_3_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_3_2, grammarAccess.getEnumValAccess().getValueSTRINGTerminalRuleCall_3_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEnumValRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_3_2, 
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTSSpec.g:481:6: ( (lv_intValue_4_0= RULE_INT ) )
                    {
                    // InternalTSSpec.g:481:6: ( (lv_intValue_4_0= RULE_INT ) )
                    // InternalTSSpec.g:482:1: (lv_intValue_4_0= RULE_INT )
                    {
                    // InternalTSSpec.g:482:1: (lv_intValue_4_0= RULE_INT )
                    // InternalTSSpec.g:483:3: lv_intValue_4_0= RULE_INT
                    {
                    lv_intValue_4_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_intValue_4_0, grammarAccess.getEnumValAccess().getIntValueINTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEnumValRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"intValue",
                              		lv_intValue_4_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
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
    // $ANTLR end "ruleEnumVal"


    // $ANTLR start "entryRuleAttribute"
    // InternalTSSpec.g:507:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTSSpec.g:508:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTSSpec.g:509:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTSSpec.g:516:1: ruleAttribute returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) ;
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
            // InternalTSSpec.g:519:28: ( ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) )
            // InternalTSSpec.g:520:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            {
            // InternalTSSpec.g:520:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            // InternalTSSpec.g:520:2: ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            {
            // InternalTSSpec.g:520:2: ( (lv_documentation_0_0= RULE_DOC ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTSSpec.g:521:1: (lv_documentation_0_0= RULE_DOC )
            	    {
            	    // InternalTSSpec.g:521:1: (lv_documentation_0_0= RULE_DOC )
            	    // InternalTSSpec.g:522:3: lv_documentation_0_0= RULE_DOC
            	    {
            	    lv_documentation_0_0=(Token)match(input,RULE_DOC,FOLLOW_16); if (state.failed) return current;
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
            	              		"at.bestsolution.typescript.service.spec.TSSpec.DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalTSSpec.g:538:3: ( (lv_optional_1_0= 'optional' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTSSpec.g:539:1: (lv_optional_1_0= 'optional' )
                    {
                    // InternalTSSpec.g:539:1: (lv_optional_1_0= 'optional' )
                    // InternalTSSpec.g:540:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
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

            // InternalTSSpec.g:553:3: ( (lv_type_2_0= ruleGenericTypeArgument ) )
            // InternalTSSpec.g:554:1: (lv_type_2_0= ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:554:1: (lv_type_2_0= ruleGenericTypeArgument )
            // InternalTSSpec.g:555:3: lv_type_2_0= ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeGenericTypeArgumentParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_3);
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
                      		"at.bestsolution.typescript.service.spec.TSSpec.GenericTypeArgument");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTSSpec.g:571:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalTSSpec.g:572:1: (lv_name_3_0= RULE_ID )
            {
            // InternalTSSpec.g:572:1: (lv_name_3_0= RULE_ID )
            // InternalTSSpec.g:573:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalTSSpec.g:589:2: (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTSSpec.g:589:4: otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // InternalTSSpec.g:593:1: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalTSSpec.g:594:1: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalTSSpec.g:594:1: (lv_value_5_0= RULE_STRING )
                    // InternalTSSpec.g:595:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
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
    // InternalTSSpec.g:619:1: entryRuleGenericTypeArgument returns [EObject current=null] : iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF ;
    public final EObject entryRuleGenericTypeArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericTypeArgument = null;


        try {
            // InternalTSSpec.g:620:2: (iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF )
            // InternalTSSpec.g:621:2: iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericTypeArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGenericTypeArgument=ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericTypeArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTSSpec.g:628:1: ruleGenericTypeArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? ) ;
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
            // InternalTSSpec.g:631:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? ) )
            // InternalTSSpec.g:632:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? )
            {
            // InternalTSSpec.g:632:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? )
            // InternalTSSpec.g:632:2: ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )?
            {
            // InternalTSSpec.g:632:2: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:633:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:633:1: ( ruleQualifiedName )
            // InternalTSSpec.g:634:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGenericTypeArgumentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTSSpec.g:647:2: (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTSSpec.g:647:4: otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getGenericTypeArgumentAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // InternalTSSpec.g:651:1: ( (lv_arguments_2_0= ruleGenericTypeArgument ) )
                    // InternalTSSpec.g:652:1: (lv_arguments_2_0= ruleGenericTypeArgument )
                    {
                    // InternalTSSpec.g:652:1: (lv_arguments_2_0= ruleGenericTypeArgument )
                    // InternalTSSpec.g:653:3: lv_arguments_2_0= ruleGenericTypeArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
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
                              		"at.bestsolution.typescript.service.spec.TSSpec.GenericTypeArgument");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalTSSpec.g:669:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==26) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTSSpec.g:669:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getGenericTypeArgumentAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalTSSpec.g:673:1: ( (lv_arguments_4_0= ruleGenericTypeArgument ) )
                    	    // InternalTSSpec.g:674:1: (lv_arguments_4_0= ruleGenericTypeArgument )
                    	    {
                    	    // InternalTSSpec.g:674:1: (lv_arguments_4_0= ruleGenericTypeArgument )
                    	    // InternalTSSpec.g:675:3: lv_arguments_4_0= ruleGenericTypeArgument
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	              		"at.bestsolution.typescript.service.spec.TSSpec.GenericTypeArgument");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getGenericTypeArgumentAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // InternalTSSpec.g:695:3: ( (lv_list_6_0= '[]' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTSSpec.g:696:1: (lv_list_6_0= '[]' )
                    {
                    // InternalTSSpec.g:696:1: (lv_list_6_0= '[]' )
                    // InternalTSSpec.g:697:3: lv_list_6_0= '[]'
                    {
                    lv_list_6_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleServiceDef"
    // InternalTSSpec.g:718:1: entryRuleServiceDef returns [EObject current=null] : iv_ruleServiceDef= ruleServiceDef EOF ;
    public final EObject entryRuleServiceDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDef = null;


        try {
            // InternalTSSpec.g:719:2: (iv_ruleServiceDef= ruleServiceDef EOF )
            // InternalTSSpec.g:720:2: iv_ruleServiceDef= ruleServiceDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleServiceDef=ruleServiceDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleServiceDef"


    // $ANTLR start "ruleServiceDef"
    // InternalTSSpec.g:727:1: ruleServiceDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commandList_2_0= ruleCommandDef ) )* ( (lv_eventList_3_0= ruleEventDef ) )* otherlv_4= '}' ) ;
    public final EObject ruleServiceDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_commandList_2_0 = null;

        EObject lv_eventList_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTSSpec.g:730:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commandList_2_0= ruleCommandDef ) )* ( (lv_eventList_3_0= ruleEventDef ) )* otherlv_4= '}' ) )
            // InternalTSSpec.g:731:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commandList_2_0= ruleCommandDef ) )* ( (lv_eventList_3_0= ruleEventDef ) )* otherlv_4= '}' )
            {
            // InternalTSSpec.g:731:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commandList_2_0= ruleCommandDef ) )* ( (lv_eventList_3_0= ruleEventDef ) )* otherlv_4= '}' )
            // InternalTSSpec.g:731:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commandList_2_0= ruleCommandDef ) )* ( (lv_eventList_3_0= ruleEventDef ) )* otherlv_4= '}'
            {
            // InternalTSSpec.g:731:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTSSpec.g:732:1: (lv_name_0_0= RULE_ID )
            {
            // InternalTSSpec.g:732:1: (lv_name_0_0= RULE_ID )
            // InternalTSSpec.g:733:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getServiceDefAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getServiceDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getServiceDefAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalTSSpec.g:753:1: ( (lv_commandList_2_0= ruleCommandDef ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTSSpec.g:754:1: (lv_commandList_2_0= ruleCommandDef )
            	    {
            	    // InternalTSSpec.g:754:1: (lv_commandList_2_0= ruleCommandDef )
            	    // InternalTSSpec.g:755:3: lv_commandList_2_0= ruleCommandDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefAccess().getCommandListCommandDefParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_commandList_2_0=ruleCommandDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"commandList",
            	              		lv_commandList_2_0, 
            	              		"at.bestsolution.typescript.service.spec.TSSpec.CommandDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalTSSpec.g:771:3: ( (lv_eventList_3_0= ruleEventDef ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOC||LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTSSpec.g:772:1: (lv_eventList_3_0= ruleEventDef )
            	    {
            	    // InternalTSSpec.g:772:1: (lv_eventList_3_0= ruleEventDef )
            	    // InternalTSSpec.g:773:3: lv_eventList_3_0= ruleEventDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefAccess().getEventListEventDefParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_eventList_3_0=ruleEventDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"eventList",
            	              		lv_eventList_3_0, 
            	              		"at.bestsolution.typescript.service.spec.TSSpec.EventDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getServiceDefAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleServiceDef"


    // $ANTLR start "entryRuleCommandDef"
    // InternalTSSpec.g:801:1: entryRuleCommandDef returns [EObject current=null] : iv_ruleCommandDef= ruleCommandDef EOF ;
    public final EObject entryRuleCommandDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandDef = null;


        try {
            // InternalTSSpec.g:802:2: (iv_ruleCommandDef= ruleCommandDef EOF )
            // InternalTSSpec.g:803:2: iv_ruleCommandDef= ruleCommandDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommandDef=ruleCommandDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTSSpec.g:810:1: ruleCommandDef returns [EObject current=null] : (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) ) ) ;
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
            // InternalTSSpec.g:813:28: ( (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) ) ) )
            // InternalTSSpec.g:814:1: (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) ) )
            {
            // InternalTSSpec.g:814:1: (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) ) )
            // InternalTSSpec.g:814:3: otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )? otherlv_5= 'returns' (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCommandDefAccess().getCommandKeyword_0());
                  
            }
            // InternalTSSpec.g:818:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalTSSpec.g:819:1: (lv_name_1_0= RULE_ID )
            {
            // InternalTSSpec.g:819:1: (lv_name_1_0= RULE_ID )
            // InternalTSSpec.g:820:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalTSSpec.g:836:2: (otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTSSpec.g:836:4: otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCommandDefAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalTSSpec.g:840:1: ( (lv_attributes_3_0= ruleAttribute ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=RULE_DOC && LA19_0<=RULE_ID)||LA19_0==24) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalTSSpec.g:841:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // InternalTSSpec.g:841:1: (lv_attributes_3_0= ruleAttribute )
                    	    // InternalTSSpec.g:842:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCommandDefAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_25);
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
                    	              		"at.bestsolution.typescript.service.spec.TSSpec.Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    otherlv_4=(Token)match(input,20,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCommandDefAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCommandDefAccess().getReturnsKeyword_3());
                  
            }
            // InternalTSSpec.g:866:1: (otherlv_6= 'void' | ( (lv_returnVal_7_0= ruleGenericTypeArgument ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTSSpec.g:866:3: otherlv_6= 'void'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCommandDefAccess().getVoidKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalTSSpec.g:871:6: ( (lv_returnVal_7_0= ruleGenericTypeArgument ) )
                    {
                    // InternalTSSpec.g:871:6: ( (lv_returnVal_7_0= ruleGenericTypeArgument ) )
                    // InternalTSSpec.g:872:1: (lv_returnVal_7_0= ruleGenericTypeArgument )
                    {
                    // InternalTSSpec.g:872:1: (lv_returnVal_7_0= ruleGenericTypeArgument )
                    // InternalTSSpec.g:873:3: lv_returnVal_7_0= ruleGenericTypeArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandDefAccess().getReturnValGenericTypeArgumentParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.typescript.service.spec.TSSpec.GenericTypeArgument");
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
    // InternalTSSpec.g:897:1: entryRuleEventDef returns [EObject current=null] : iv_ruleEventDef= ruleEventDef EOF ;
    public final EObject entryRuleEventDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDef = null;


        try {
            // InternalTSSpec.g:898:2: (iv_ruleEventDef= ruleEventDef EOF )
            // InternalTSSpec.g:899:2: iv_ruleEventDef= ruleEventDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventDef=ruleEventDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTSSpec.g:906:1: ruleEventDef returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) ) ) ;
    public final EObject ruleEventDef() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTSSpec.g:909:28: ( ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) ) ) )
            // InternalTSSpec.g:910:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) ) )
            {
            // InternalTSSpec.g:910:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) ) )
            // InternalTSSpec.g:910:2: ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleGenericTypeArgument ) )
            {
            // InternalTSSpec.g:910:2: ( (lv_documentation_0_0= RULE_DOC ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOC) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTSSpec.g:911:1: (lv_documentation_0_0= RULE_DOC )
            	    {
            	    // InternalTSSpec.g:911:1: (lv_documentation_0_0= RULE_DOC )
            	    // InternalTSSpec.g:912:3: lv_documentation_0_0= RULE_DOC
            	    {
            	    lv_documentation_0_0=(Token)match(input,RULE_DOC,FOLLOW_28); if (state.failed) return current;
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
            	              		"at.bestsolution.typescript.service.spec.TSSpec.DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_1=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefAccess().getEventKeyword_1());
                  
            }
            // InternalTSSpec.g:932:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalTSSpec.g:933:1: (lv_name_2_0= RULE_ID )
            {
            // InternalTSSpec.g:933:1: (lv_name_2_0= RULE_ID )
            // InternalTSSpec.g:934:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalTSSpec.g:950:2: ( (lv_type_3_0= ruleGenericTypeArgument ) )
            // InternalTSSpec.g:951:1: (lv_type_3_0= ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:951:1: (lv_type_3_0= ruleGenericTypeArgument )
            // InternalTSSpec.g:952:3: lv_type_3_0= ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefAccess().getTypeGenericTypeArgumentParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"at.bestsolution.typescript.service.spec.TSSpec.GenericTypeArgument");
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
    // InternalTSSpec.g:976:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalTSSpec.g:977:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTSSpec.g:978:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTSSpec.g:985:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalTSSpec.g:988:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalTSSpec.g:989:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalTSSpec.g:989:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalTSSpec.g:989:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalTSSpec.g:996:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) && (synpred1_InternalTSSpec())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTSSpec.g:996:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalTSSpec.g:996:2: ( ( '.' )=>kw= '.' )
            	    // InternalTSSpec.g:996:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
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
        // InternalTSSpec.g:996:3: ( '.' )
        // InternalTSSpec.g:997:2: '.'
        {
        match(input,33,FOLLOW_2); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000246032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000246010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001020030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000120020010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100020010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001100030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000081000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});

}