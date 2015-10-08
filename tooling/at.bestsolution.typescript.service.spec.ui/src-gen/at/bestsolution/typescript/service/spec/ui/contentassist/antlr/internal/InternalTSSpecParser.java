package at.bestsolution.typescript.service.spec.ui.contentassist.antlr.internal; 

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
import at.bestsolution.typescript.service.spec.services.TSSpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTSSpecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'void'", "'package'", "'javatype'", "'{'", "'}'", "'extends'", "'enum'", "'('", "')'", "'alias'", "'as'", "'='", "'<'", "'>'", "','", "'command'", "'returns'", "'event'", "'.'", "'cust'", "'optional'", "'[]'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DOC=5;
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
    public String getGrammarFileName() { return "../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g"; }


     
     	private TSSpecGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TSSpecGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleServiceDefs"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:61:1: entryRuleServiceDefs : ruleServiceDefs EOF ;
    public final void entryRuleServiceDefs() throws RecognitionException {
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:62:1: ( ruleServiceDefs EOF )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:63:1: ruleServiceDefs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsRule()); 
            }
            pushFollow(FOLLOW_ruleServiceDefs_in_entryRuleServiceDefs67);
            ruleServiceDefs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDefs74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleServiceDefs"


    // $ANTLR start "ruleServiceDefs"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:70:1: ruleServiceDefs : ( ( rule__ServiceDefs__Group__0 ) ) ;
    public final void ruleServiceDefs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:74:2: ( ( ( rule__ServiceDefs__Group__0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:75:1: ( ( rule__ServiceDefs__Group__0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:75:1: ( ( rule__ServiceDefs__Group__0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:76:1: ( rule__ServiceDefs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getGroup()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:77:1: ( rule__ServiceDefs__Group__0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:77:2: rule__ServiceDefs__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__0_in_ruleServiceDefs100);
            rule__ServiceDefs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getGroup()); 
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
    // $ANTLR end "ruleServiceDefs"


    // $ANTLR start "entryRuleDomainElement"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:89:1: entryRuleDomainElement : ruleDomainElement EOF ;
    public final void entryRuleDomainElement() throws RecognitionException {
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:90:1: ( ruleDomainElement EOF )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:91:1: ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement127);
            ruleDomainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDomainElement"


    // $ANTLR start "ruleDomainElement"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:98:1: ruleDomainElement : ( ( rule__DomainElement__Group__0 ) ) ;
    public final void ruleDomainElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:102:2: ( ( ( rule__DomainElement__Group__0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:103:1: ( ( rule__DomainElement__Group__0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:103:1: ( ( rule__DomainElement__Group__0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:104:1: ( rule__DomainElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getGroup()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:105:1: ( rule__DomainElement__Group__0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:105:2: rule__DomainElement__Group__0
            {
            pushFollow(FOLLOW_rule__DomainElement__Group__0_in_ruleDomainElement160);
            rule__DomainElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getGroup()); 
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
    // $ANTLR end "ruleDomainElement"


    // $ANTLR start "entryRuleEnumVal"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:117:1: entryRuleEnumVal : ruleEnumVal EOF ;
    public final void entryRuleEnumVal() throws RecognitionException {
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:118:1: ( ruleEnumVal EOF )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:119:1: ruleEnumVal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValRule()); 
            }
            pushFollow(FOLLOW_ruleEnumVal_in_entryRuleEnumVal187);
            ruleEnumVal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumVal194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumVal"


    // $ANTLR start "ruleEnumVal"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:126:1: ruleEnumVal : ( ( rule__EnumVal__Group__0 ) ) ;
    public final void ruleEnumVal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:130:2: ( ( ( rule__EnumVal__Group__0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:131:1: ( ( rule__EnumVal__Group__0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:131:1: ( ( rule__EnumVal__Group__0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:132:1: ( rule__EnumVal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getGroup()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:133:1: ( rule__EnumVal__Group__0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:133:2: rule__EnumVal__Group__0
            {
            pushFollow(FOLLOW_rule__EnumVal__Group__0_in_ruleEnumVal220);
            rule__EnumVal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getGroup()); 
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
    // $ANTLR end "ruleEnumVal"


    // $ANTLR start "entryRuleAttribute"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:145:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:146:1: ( ruleAttribute EOF )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:147:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute247);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:154:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:158:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:159:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:159:1: ( ( rule__Attribute__Group__0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:160:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:161:1: ( rule__Attribute__Group__0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:161:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute280);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleGenericTypeArgument"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:173:1: entryRuleGenericTypeArgument : ruleGenericTypeArgument EOF ;
    public final void entryRuleGenericTypeArgument() throws RecognitionException {
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:174:1: ( ruleGenericTypeArgument EOF )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:175:1: ruleGenericTypeArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_entryRuleGenericTypeArgument307);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericTypeArgument314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGenericTypeArgument"


    // $ANTLR start "ruleGenericTypeArgument"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:182:1: ruleGenericTypeArgument : ( ( rule__GenericTypeArgument__Group__0 ) ) ;
    public final void ruleGenericTypeArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:186:2: ( ( ( rule__GenericTypeArgument__Group__0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:187:1: ( ( rule__GenericTypeArgument__Group__0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:187:1: ( ( rule__GenericTypeArgument__Group__0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:188:1: ( rule__GenericTypeArgument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:189:1: ( rule__GenericTypeArgument__Group__0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:189:2: rule__GenericTypeArgument__Group__0
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__0_in_ruleGenericTypeArgument340);
            rule__GenericTypeArgument__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getGroup()); 
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
    // $ANTLR end "ruleGenericTypeArgument"


    // $ANTLR start "entryRuleCommandDef"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:201:1: entryRuleCommandDef : ruleCommandDef EOF ;
    public final void entryRuleCommandDef() throws RecognitionException {
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:202:1: ( ruleCommandDef EOF )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:203:1: ruleCommandDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefRule()); 
            }
            pushFollow(FOLLOW_ruleCommandDef_in_entryRuleCommandDef367);
            ruleCommandDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandDef374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCommandDef"


    // $ANTLR start "ruleCommandDef"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:210:1: ruleCommandDef : ( ( rule__CommandDef__Group__0 ) ) ;
    public final void ruleCommandDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:214:2: ( ( ( rule__CommandDef__Group__0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:215:1: ( ( rule__CommandDef__Group__0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:215:1: ( ( rule__CommandDef__Group__0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:216:1: ( rule__CommandDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getGroup()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:217:1: ( rule__CommandDef__Group__0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:217:2: rule__CommandDef__Group__0
            {
            pushFollow(FOLLOW_rule__CommandDef__Group__0_in_ruleCommandDef400);
            rule__CommandDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getGroup()); 
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
    // $ANTLR end "ruleCommandDef"


    // $ANTLR start "entryRuleEventDef"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:229:1: entryRuleEventDef : ruleEventDef EOF ;
    public final void entryRuleEventDef() throws RecognitionException {
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:230:1: ( ruleEventDef EOF )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:231:1: ruleEventDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefRule()); 
            }
            pushFollow(FOLLOW_ruleEventDef_in_entryRuleEventDef427);
            ruleEventDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDef434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEventDef"


    // $ANTLR start "ruleEventDef"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:238:1: ruleEventDef : ( ( rule__EventDef__Group__0 ) ) ;
    public final void ruleEventDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:242:2: ( ( ( rule__EventDef__Group__0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:243:1: ( ( rule__EventDef__Group__0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:243:1: ( ( rule__EventDef__Group__0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:244:1: ( rule__EventDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getGroup()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:245:1: ( rule__EventDef__Group__0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:245:2: rule__EventDef__Group__0
            {
            pushFollow(FOLLOW_rule__EventDef__Group__0_in_ruleEventDef460);
            rule__EventDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefAccess().getGroup()); 
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
    // $ANTLR end "ruleEventDef"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:257:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:258:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:259:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName487);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName494); if (state.failed) return ;

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
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:266:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:270:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:271:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:271:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:272:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:273:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:273:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName520);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__DomainElement__Alternatives_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:285:1: rule__DomainElement__Alternatives_1 : ( ( ( rule__DomainElement__Group_1_0__0 ) ) | ( ( rule__DomainElement__Group_1_1__0 ) ) | ( ( rule__DomainElement__Group_1_2__0 ) ) | ( ( rule__DomainElement__Group_1_3__0 ) ) );
    public final void rule__DomainElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:289:1: ( ( ( rule__DomainElement__Group_1_0__0 ) ) | ( ( rule__DomainElement__Group_1_1__0 ) ) | ( ( rule__DomainElement__Group_1_2__0 ) ) | ( ( rule__DomainElement__Group_1_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:290:1: ( ( rule__DomainElement__Group_1_0__0 ) )
                    {
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:290:1: ( ( rule__DomainElement__Group_1_0__0 ) )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:291:1: ( rule__DomainElement__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_0()); 
                    }
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:292:1: ( rule__DomainElement__Group_1_0__0 )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:292:2: rule__DomainElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_0__0_in_rule__DomainElement__Alternatives_1556);
                    rule__DomainElement__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainElementAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:296:6: ( ( rule__DomainElement__Group_1_1__0 ) )
                    {
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:296:6: ( ( rule__DomainElement__Group_1_1__0 ) )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:297:1: ( rule__DomainElement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_1()); 
                    }
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:298:1: ( rule__DomainElement__Group_1_1__0 )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:298:2: rule__DomainElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_1__0_in_rule__DomainElement__Alternatives_1574);
                    rule__DomainElement__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainElementAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:302:6: ( ( rule__DomainElement__Group_1_2__0 ) )
                    {
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:302:6: ( ( rule__DomainElement__Group_1_2__0 ) )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:303:1: ( rule__DomainElement__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_2()); 
                    }
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:304:1: ( rule__DomainElement__Group_1_2__0 )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:304:2: rule__DomainElement__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_2__0_in_rule__DomainElement__Alternatives_1592);
                    rule__DomainElement__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainElementAccess().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:308:6: ( ( rule__DomainElement__Group_1_3__0 ) )
                    {
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:308:6: ( ( rule__DomainElement__Group_1_3__0 ) )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:309:1: ( rule__DomainElement__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_3()); 
                    }
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:310:1: ( rule__DomainElement__Group_1_3__0 )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:310:2: rule__DomainElement__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_3__0_in_rule__DomainElement__Alternatives_1610);
                    rule__DomainElement__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainElementAccess().getGroup_1_3()); 
                    }

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
    // $ANTLR end "rule__DomainElement__Alternatives_1"


    // $ANTLR start "rule__CommandDef__Alternatives_4"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:319:1: rule__CommandDef__Alternatives_4 : ( ( 'void' ) | ( ( rule__CommandDef__ReturnValAssignment_4_1 ) ) );
    public final void rule__CommandDef__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:323:1: ( ( 'void' ) | ( ( rule__CommandDef__ReturnValAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:324:1: ( 'void' )
                    {
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:324:1: ( 'void' )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:325:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandDefAccess().getVoidKeyword_4_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__CommandDef__Alternatives_4644); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandDefAccess().getVoidKeyword_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:332:6: ( ( rule__CommandDef__ReturnValAssignment_4_1 ) )
                    {
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:332:6: ( ( rule__CommandDef__ReturnValAssignment_4_1 ) )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:333:1: ( rule__CommandDef__ReturnValAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandDefAccess().getReturnValAssignment_4_1()); 
                    }
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:334:1: ( rule__CommandDef__ReturnValAssignment_4_1 )
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:334:2: rule__CommandDef__ReturnValAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__CommandDef__ReturnValAssignment_4_1_in_rule__CommandDef__Alternatives_4663);
                    rule__CommandDef__ReturnValAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandDefAccess().getReturnValAssignment_4_1()); 
                    }

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
    // $ANTLR end "rule__CommandDef__Alternatives_4"


    // $ANTLR start "rule__ServiceDefs__Group__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:345:1: rule__ServiceDefs__Group__0 : rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1 ;
    public final void rule__ServiceDefs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:349:1: ( rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:350:2: rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__0__Impl_in_rule__ServiceDefs__Group__0694);
            rule__ServiceDefs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDefs__Group__1_in_rule__ServiceDefs__Group__0697);
            rule__ServiceDefs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefs__Group__0"


    // $ANTLR start "rule__ServiceDefs__Group__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:357:1: rule__ServiceDefs__Group__0__Impl : ( 'package' ) ;
    public final void rule__ServiceDefs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:361:1: ( ( 'package' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:362:1: ( 'package' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:362:1: ( 'package' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:363:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ServiceDefs__Group__0__Impl725); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__ServiceDefs__Group__0__Impl"


    // $ANTLR start "rule__ServiceDefs__Group__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:376:1: rule__ServiceDefs__Group__1 : rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2 ;
    public final void rule__ServiceDefs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:380:1: ( rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:381:2: rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__1__Impl_in_rule__ServiceDefs__Group__1756);
            rule__ServiceDefs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDefs__Group__2_in_rule__ServiceDefs__Group__1759);
            rule__ServiceDefs__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefs__Group__1"


    // $ANTLR start "rule__ServiceDefs__Group__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:388:1: rule__ServiceDefs__Group__1__Impl : ( ( rule__ServiceDefs__PackageNameAssignment_1 ) ) ;
    public final void rule__ServiceDefs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:392:1: ( ( ( rule__ServiceDefs__PackageNameAssignment_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:393:1: ( ( rule__ServiceDefs__PackageNameAssignment_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:393:1: ( ( rule__ServiceDefs__PackageNameAssignment_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:394:1: ( rule__ServiceDefs__PackageNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageNameAssignment_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:395:1: ( rule__ServiceDefs__PackageNameAssignment_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:395:2: rule__ServiceDefs__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceDefs__PackageNameAssignment_1_in_rule__ServiceDefs__Group__1__Impl786);
            rule__ServiceDefs__PackageNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getPackageNameAssignment_1()); 
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
    // $ANTLR end "rule__ServiceDefs__Group__1__Impl"


    // $ANTLR start "rule__ServiceDefs__Group__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:405:1: rule__ServiceDefs__Group__2 : rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3 ;
    public final void rule__ServiceDefs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:409:1: ( rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:410:2: rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__2__Impl_in_rule__ServiceDefs__Group__2816);
            rule__ServiceDefs__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDefs__Group__3_in_rule__ServiceDefs__Group__2819);
            rule__ServiceDefs__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefs__Group__2"


    // $ANTLR start "rule__ServiceDefs__Group__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:417:1: rule__ServiceDefs__Group__2__Impl : ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* ) ;
    public final void rule__ServiceDefs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:421:1: ( ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:422:1: ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:422:1: ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:423:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getDomainElementsAssignment_2()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:424:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:424:2: rule__ServiceDefs__DomainElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDefs__DomainElementsAssignment_2_in_rule__ServiceDefs__Group__2__Impl846);
            	    rule__ServiceDefs__DomainElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getDomainElementsAssignment_2()); 
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
    // $ANTLR end "rule__ServiceDefs__Group__2__Impl"


    // $ANTLR start "rule__ServiceDefs__Group__3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:434:1: rule__ServiceDefs__Group__3 : rule__ServiceDefs__Group__3__Impl rule__ServiceDefs__Group__4 ;
    public final void rule__ServiceDefs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:438:1: ( rule__ServiceDefs__Group__3__Impl rule__ServiceDefs__Group__4 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:439:2: rule__ServiceDefs__Group__3__Impl rule__ServiceDefs__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__3__Impl_in_rule__ServiceDefs__Group__3877);
            rule__ServiceDefs__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDefs__Group__4_in_rule__ServiceDefs__Group__3880);
            rule__ServiceDefs__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefs__Group__3"


    // $ANTLR start "rule__ServiceDefs__Group__3__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:446:1: rule__ServiceDefs__Group__3__Impl : ( ( rule__ServiceDefs__CommandListAssignment_3 )* ) ;
    public final void rule__ServiceDefs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:450:1: ( ( ( rule__ServiceDefs__CommandListAssignment_3 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:451:1: ( ( rule__ServiceDefs__CommandListAssignment_3 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:451:1: ( ( rule__ServiceDefs__CommandListAssignment_3 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:452:1: ( rule__ServiceDefs__CommandListAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getCommandListAssignment_3()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:453:1: ( rule__ServiceDefs__CommandListAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:453:2: rule__ServiceDefs__CommandListAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDefs__CommandListAssignment_3_in_rule__ServiceDefs__Group__3__Impl907);
            	    rule__ServiceDefs__CommandListAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getCommandListAssignment_3()); 
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
    // $ANTLR end "rule__ServiceDefs__Group__3__Impl"


    // $ANTLR start "rule__ServiceDefs__Group__4"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:463:1: rule__ServiceDefs__Group__4 : rule__ServiceDefs__Group__4__Impl ;
    public final void rule__ServiceDefs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:467:1: ( rule__ServiceDefs__Group__4__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:468:2: rule__ServiceDefs__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__4__Impl_in_rule__ServiceDefs__Group__4938);
            rule__ServiceDefs__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefs__Group__4"


    // $ANTLR start "rule__ServiceDefs__Group__4__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:474:1: rule__ServiceDefs__Group__4__Impl : ( ( rule__ServiceDefs__EventListAssignment_4 )* ) ;
    public final void rule__ServiceDefs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:478:1: ( ( ( rule__ServiceDefs__EventListAssignment_4 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:479:1: ( ( rule__ServiceDefs__EventListAssignment_4 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:479:1: ( ( rule__ServiceDefs__EventListAssignment_4 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:480:1: ( rule__ServiceDefs__EventListAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getEventListAssignment_4()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:481:1: ( rule__ServiceDefs__EventListAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_DOC||LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:481:2: rule__ServiceDefs__EventListAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDefs__EventListAssignment_4_in_rule__ServiceDefs__Group__4__Impl965);
            	    rule__ServiceDefs__EventListAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getEventListAssignment_4()); 
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
    // $ANTLR end "rule__ServiceDefs__Group__4__Impl"


    // $ANTLR start "rule__DomainElement__Group__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:501:1: rule__DomainElement__Group__0 : rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1 ;
    public final void rule__DomainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:505:1: ( rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:506:2: rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group__0__Impl_in_rule__DomainElement__Group__01006);
            rule__DomainElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group__1_in_rule__DomainElement__Group__01009);
            rule__DomainElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group__0"


    // $ANTLR start "rule__DomainElement__Group__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:513:1: rule__DomainElement__Group__0__Impl : ( ( rule__DomainElement__DocAssignment_0 )* ) ;
    public final void rule__DomainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:517:1: ( ( ( rule__DomainElement__DocAssignment_0 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:518:1: ( ( rule__DomainElement__DocAssignment_0 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:518:1: ( ( rule__DomainElement__DocAssignment_0 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:519:1: ( rule__DomainElement__DocAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getDocAssignment_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:520:1: ( rule__DomainElement__DocAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DOC) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:520:2: rule__DomainElement__DocAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DomainElement__DocAssignment_0_in_rule__DomainElement__Group__0__Impl1036);
            	    rule__DomainElement__DocAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getDocAssignment_0()); 
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
    // $ANTLR end "rule__DomainElement__Group__0__Impl"


    // $ANTLR start "rule__DomainElement__Group__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:530:1: rule__DomainElement__Group__1 : rule__DomainElement__Group__1__Impl ;
    public final void rule__DomainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:534:1: ( rule__DomainElement__Group__1__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:535:2: rule__DomainElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group__1__Impl_in_rule__DomainElement__Group__11067);
            rule__DomainElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group__1"


    // $ANTLR start "rule__DomainElement__Group__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:541:1: rule__DomainElement__Group__1__Impl : ( ( rule__DomainElement__Alternatives_1 ) ) ;
    public final void rule__DomainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:545:1: ( ( ( rule__DomainElement__Alternatives_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:546:1: ( ( rule__DomainElement__Alternatives_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:546:1: ( ( rule__DomainElement__Alternatives_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:547:1: ( rule__DomainElement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAlternatives_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:548:1: ( rule__DomainElement__Alternatives_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:548:2: rule__DomainElement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__DomainElement__Alternatives_1_in_rule__DomainElement__Group__1__Impl1094);
            rule__DomainElement__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DomainElement__Group__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_0__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:562:1: rule__DomainElement__Group_1_0__0 : rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1 ;
    public final void rule__DomainElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:566:1: ( rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:567:2: rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_0__0__Impl_in_rule__DomainElement__Group_1_0__01128);
            rule__DomainElement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_0__1_in_rule__DomainElement__Group_1_0__01131);
            rule__DomainElement__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_0__0"


    // $ANTLR start "rule__DomainElement__Group_1_0__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:574:1: rule__DomainElement__Group_1_0__0__Impl : ( 'javatype' ) ;
    public final void rule__DomainElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:578:1: ( ( 'javatype' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:579:1: ( 'javatype' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:579:1: ( 'javatype' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:580:1: 'javatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getJavatypeKeyword_1_0_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__DomainElement__Group_1_0__0__Impl1159); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getJavatypeKeyword_1_0_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_0__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:593:1: rule__DomainElement__Group_1_0__1 : rule__DomainElement__Group_1_0__1__Impl ;
    public final void rule__DomainElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:597:1: ( rule__DomainElement__Group_1_0__1__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:598:2: rule__DomainElement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_0__1__Impl_in_rule__DomainElement__Group_1_0__11190);
            rule__DomainElement__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_0__1"


    // $ANTLR start "rule__DomainElement__Group_1_0__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:604:1: rule__DomainElement__Group_1_0__1__Impl : ( ( rule__DomainElement__NameAssignment_1_0_1 ) ) ;
    public final void rule__DomainElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:608:1: ( ( ( rule__DomainElement__NameAssignment_1_0_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:609:1: ( ( rule__DomainElement__NameAssignment_1_0_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:609:1: ( ( rule__DomainElement__NameAssignment_1_0_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:610:1: ( rule__DomainElement__NameAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_0_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:611:1: ( rule__DomainElement__NameAssignment_1_0_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:611:2: rule__DomainElement__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__DomainElement__NameAssignment_1_0_1_in_rule__DomainElement__Group_1_0__1__Impl1217);
            rule__DomainElement__NameAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameAssignment_1_0_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:625:1: rule__DomainElement__Group_1_1__0 : rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1 ;
    public final void rule__DomainElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:629:1: ( rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:630:2: rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__0__Impl_in_rule__DomainElement__Group_1_1__01251);
            rule__DomainElement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__1_in_rule__DomainElement__Group_1_1__01254);
            rule__DomainElement__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_1__0"


    // $ANTLR start "rule__DomainElement__Group_1_1__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:637:1: rule__DomainElement__Group_1_1__0__Impl : ( ( rule__DomainElement__CustAssignment_1_1_0 ) ) ;
    public final void rule__DomainElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:641:1: ( ( ( rule__DomainElement__CustAssignment_1_1_0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:642:1: ( ( rule__DomainElement__CustAssignment_1_1_0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:642:1: ( ( rule__DomainElement__CustAssignment_1_1_0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:643:1: ( rule__DomainElement__CustAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustAssignment_1_1_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:644:1: ( rule__DomainElement__CustAssignment_1_1_0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:644:2: rule__DomainElement__CustAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__DomainElement__CustAssignment_1_1_0_in_rule__DomainElement__Group_1_1__0__Impl1281);
            rule__DomainElement__CustAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getCustAssignment_1_1_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:654:1: rule__DomainElement__Group_1_1__1 : rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2 ;
    public final void rule__DomainElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:658:1: ( rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:659:2: rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__1__Impl_in_rule__DomainElement__Group_1_1__11311);
            rule__DomainElement__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__2_in_rule__DomainElement__Group_1_1__11314);
            rule__DomainElement__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_1__1"


    // $ANTLR start "rule__DomainElement__Group_1_1__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:666:1: rule__DomainElement__Group_1_1__1__Impl : ( ( rule__DomainElement__NameAssignment_1_1_1 ) ) ;
    public final void rule__DomainElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:670:1: ( ( ( rule__DomainElement__NameAssignment_1_1_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:671:1: ( ( rule__DomainElement__NameAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:671:1: ( ( rule__DomainElement__NameAssignment_1_1_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:672:1: ( rule__DomainElement__NameAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_1_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:673:1: ( rule__DomainElement__NameAssignment_1_1_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:673:2: rule__DomainElement__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__DomainElement__NameAssignment_1_1_1_in_rule__DomainElement__Group_1_1__1__Impl1341);
            rule__DomainElement__NameAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameAssignment_1_1_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:683:1: rule__DomainElement__Group_1_1__2 : rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3 ;
    public final void rule__DomainElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:687:1: ( rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:688:2: rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__2__Impl_in_rule__DomainElement__Group_1_1__21371);
            rule__DomainElement__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__3_in_rule__DomainElement__Group_1_1__21374);
            rule__DomainElement__Group_1_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_1__2"


    // $ANTLR start "rule__DomainElement__Group_1_1__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:695:1: rule__DomainElement__Group_1_1__2__Impl : ( ( rule__DomainElement__Group_1_1_2__0 )? ) ;
    public final void rule__DomainElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:699:1: ( ( ( rule__DomainElement__Group_1_1_2__0 )? ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:700:1: ( ( rule__DomainElement__Group_1_1_2__0 )? )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:700:1: ( ( rule__DomainElement__Group_1_1_2__0 )? )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:701:1: ( rule__DomainElement__Group_1_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getGroup_1_1_2()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:702:1: ( rule__DomainElement__Group_1_1_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:702:2: rule__DomainElement__Group_1_1_2__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_1_2__0_in_rule__DomainElement__Group_1_1__2__Impl1401);
                    rule__DomainElement__Group_1_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getGroup_1_1_2()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:712:1: rule__DomainElement__Group_1_1__3 : rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4 ;
    public final void rule__DomainElement__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:716:1: ( rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:717:2: rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__3__Impl_in_rule__DomainElement__Group_1_1__31432);
            rule__DomainElement__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__4_in_rule__DomainElement__Group_1_1__31435);
            rule__DomainElement__Group_1_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_1__3"


    // $ANTLR start "rule__DomainElement__Group_1_1__3__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:724:1: rule__DomainElement__Group_1_1__3__Impl : ( '{' ) ;
    public final void rule__DomainElement__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:728:1: ( ( '{' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:729:1: ( '{' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:729:1: ( '{' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:730:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getLeftCurlyBracketKeyword_1_1_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__DomainElement__Group_1_1__3__Impl1463); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getLeftCurlyBracketKeyword_1_1_3()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__3__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__4"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:743:1: rule__DomainElement__Group_1_1__4 : rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5 ;
    public final void rule__DomainElement__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:747:1: ( rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:748:2: rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__4__Impl_in_rule__DomainElement__Group_1_1__41494);
            rule__DomainElement__Group_1_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__5_in_rule__DomainElement__Group_1_1__41497);
            rule__DomainElement__Group_1_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_1__4"


    // $ANTLR start "rule__DomainElement__Group_1_1__4__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:755:1: rule__DomainElement__Group_1_1__4__Impl : ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* ) ;
    public final void rule__DomainElement__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:759:1: ( ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:760:1: ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:760:1: ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:761:1: ( rule__DomainElement__AttributesAssignment_1_1_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAttributesAssignment_1_1_4()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:762:1: ( rule__DomainElement__AttributesAssignment_1_1_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_DOC)||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:762:2: rule__DomainElement__AttributesAssignment_1_1_4
            	    {
            	    pushFollow(FOLLOW_rule__DomainElement__AttributesAssignment_1_1_4_in_rule__DomainElement__Group_1_1__4__Impl1524);
            	    rule__DomainElement__AttributesAssignment_1_1_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAttributesAssignment_1_1_4()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__4__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__5"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:772:1: rule__DomainElement__Group_1_1__5 : rule__DomainElement__Group_1_1__5__Impl ;
    public final void rule__DomainElement__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:776:1: ( rule__DomainElement__Group_1_1__5__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:777:2: rule__DomainElement__Group_1_1__5__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__5__Impl_in_rule__DomainElement__Group_1_1__51555);
            rule__DomainElement__Group_1_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_1__5"


    // $ANTLR start "rule__DomainElement__Group_1_1__5__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:783:1: rule__DomainElement__Group_1_1__5__Impl : ( '}' ) ;
    public final void rule__DomainElement__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:787:1: ( ( '}' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:788:1: ( '}' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:788:1: ( '}' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:789:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRightCurlyBracketKeyword_1_1_5()); 
            }
            match(input,16,FOLLOW_16_in_rule__DomainElement__Group_1_1__5__Impl1583); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getRightCurlyBracketKeyword_1_1_5()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__5__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1_2__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:814:1: rule__DomainElement__Group_1_1_2__0 : rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1 ;
    public final void rule__DomainElement__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:818:1: ( rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:819:2: rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1_2__0__Impl_in_rule__DomainElement__Group_1_1_2__01626);
            rule__DomainElement__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1_2__1_in_rule__DomainElement__Group_1_1_2__01629);
            rule__DomainElement__Group_1_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_1_2__0"


    // $ANTLR start "rule__DomainElement__Group_1_1_2__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:826:1: rule__DomainElement__Group_1_1_2__0__Impl : ( 'extends' ) ;
    public final void rule__DomainElement__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:830:1: ( ( 'extends' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:831:1: ( 'extends' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:831:1: ( 'extends' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:832:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getExtendsKeyword_1_1_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__DomainElement__Group_1_1_2__0__Impl1657); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getExtendsKeyword_1_1_2_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1_2__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:845:1: rule__DomainElement__Group_1_1_2__1 : rule__DomainElement__Group_1_1_2__1__Impl ;
    public final void rule__DomainElement__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:849:1: ( rule__DomainElement__Group_1_1_2__1__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:850:2: rule__DomainElement__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1_2__1__Impl_in_rule__DomainElement__Group_1_1_2__11688);
            rule__DomainElement__Group_1_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_1_2__1"


    // $ANTLR start "rule__DomainElement__Group_1_1_2__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:856:1: rule__DomainElement__Group_1_1_2__1__Impl : ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) ) ;
    public final void rule__DomainElement__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:860:1: ( ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:861:1: ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:861:1: ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:862:1: ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeAssignment_1_1_2_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:863:1: ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:863:2: rule__DomainElement__SuperTypeAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__DomainElement__SuperTypeAssignment_1_1_2_1_in_rule__DomainElement__Group_1_1_2__1__Impl1715);
            rule__DomainElement__SuperTypeAssignment_1_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getSuperTypeAssignment_1_1_2_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:877:1: rule__DomainElement__Group_1_2__0 : rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1 ;
    public final void rule__DomainElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:881:1: ( rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:882:2: rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__0__Impl_in_rule__DomainElement__Group_1_2__01749);
            rule__DomainElement__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__1_in_rule__DomainElement__Group_1_2__01752);
            rule__DomainElement__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_2__0"


    // $ANTLR start "rule__DomainElement__Group_1_2__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:889:1: rule__DomainElement__Group_1_2__0__Impl : ( 'enum' ) ;
    public final void rule__DomainElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:893:1: ( ( 'enum' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:894:1: ( 'enum' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:894:1: ( 'enum' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:895:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumKeyword_1_2_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__DomainElement__Group_1_2__0__Impl1780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getEnumKeyword_1_2_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:908:1: rule__DomainElement__Group_1_2__1 : rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2 ;
    public final void rule__DomainElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:912:1: ( rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:913:2: rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__1__Impl_in_rule__DomainElement__Group_1_2__11811);
            rule__DomainElement__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__2_in_rule__DomainElement__Group_1_2__11814);
            rule__DomainElement__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_2__1"


    // $ANTLR start "rule__DomainElement__Group_1_2__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:920:1: rule__DomainElement__Group_1_2__1__Impl : ( ( rule__DomainElement__NameAssignment_1_2_1 ) ) ;
    public final void rule__DomainElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:924:1: ( ( ( rule__DomainElement__NameAssignment_1_2_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:925:1: ( ( rule__DomainElement__NameAssignment_1_2_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:925:1: ( ( rule__DomainElement__NameAssignment_1_2_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:926:1: ( rule__DomainElement__NameAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_2_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:927:1: ( rule__DomainElement__NameAssignment_1_2_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:927:2: rule__DomainElement__NameAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__DomainElement__NameAssignment_1_2_1_in_rule__DomainElement__Group_1_2__1__Impl1841);
            rule__DomainElement__NameAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameAssignment_1_2_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:937:1: rule__DomainElement__Group_1_2__2 : rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3 ;
    public final void rule__DomainElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:941:1: ( rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:942:2: rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__2__Impl_in_rule__DomainElement__Group_1_2__21871);
            rule__DomainElement__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__3_in_rule__DomainElement__Group_1_2__21874);
            rule__DomainElement__Group_1_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_2__2"


    // $ANTLR start "rule__DomainElement__Group_1_2__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:949:1: rule__DomainElement__Group_1_2__2__Impl : ( '(' ) ;
    public final void rule__DomainElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:953:1: ( ( '(' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:954:1: ( '(' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:954:1: ( '(' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:955:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getLeftParenthesisKeyword_1_2_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__DomainElement__Group_1_2__2__Impl1902); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getLeftParenthesisKeyword_1_2_2()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__2__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:968:1: rule__DomainElement__Group_1_2__3 : rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4 ;
    public final void rule__DomainElement__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:972:1: ( rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:973:2: rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__3__Impl_in_rule__DomainElement__Group_1_2__31933);
            rule__DomainElement__Group_1_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__4_in_rule__DomainElement__Group_1_2__31936);
            rule__DomainElement__Group_1_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_2__3"


    // $ANTLR start "rule__DomainElement__Group_1_2__3__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:980:1: rule__DomainElement__Group_1_2__3__Impl : ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* ) ;
    public final void rule__DomainElement__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:984:1: ( ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:985:1: ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:985:1: ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:986:1: ( rule__DomainElement__EnumValuesAssignment_1_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumValuesAssignment_1_2_3()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:987:1: ( rule__DomainElement__EnumValuesAssignment_1_2_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DOC)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:987:2: rule__DomainElement__EnumValuesAssignment_1_2_3
            	    {
            	    pushFollow(FOLLOW_rule__DomainElement__EnumValuesAssignment_1_2_3_in_rule__DomainElement__Group_1_2__3__Impl1963);
            	    rule__DomainElement__EnumValuesAssignment_1_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getEnumValuesAssignment_1_2_3()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__3__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__4"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:997:1: rule__DomainElement__Group_1_2__4 : rule__DomainElement__Group_1_2__4__Impl ;
    public final void rule__DomainElement__Group_1_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1001:1: ( rule__DomainElement__Group_1_2__4__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1002:2: rule__DomainElement__Group_1_2__4__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__4__Impl_in_rule__DomainElement__Group_1_2__41994);
            rule__DomainElement__Group_1_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_2__4"


    // $ANTLR start "rule__DomainElement__Group_1_2__4__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1008:1: rule__DomainElement__Group_1_2__4__Impl : ( ')' ) ;
    public final void rule__DomainElement__Group_1_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1012:1: ( ( ')' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1013:1: ( ')' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1013:1: ( ')' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1014:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRightParenthesisKeyword_1_2_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__DomainElement__Group_1_2__4__Impl2022); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getRightParenthesisKeyword_1_2_4()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__4__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_3__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1037:1: rule__DomainElement__Group_1_3__0 : rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1 ;
    public final void rule__DomainElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1041:1: ( rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1042:2: rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__0__Impl_in_rule__DomainElement__Group_1_3__02063);
            rule__DomainElement__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__1_in_rule__DomainElement__Group_1_3__02066);
            rule__DomainElement__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_3__0"


    // $ANTLR start "rule__DomainElement__Group_1_3__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1049:1: rule__DomainElement__Group_1_3__0__Impl : ( 'alias' ) ;
    public final void rule__DomainElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1053:1: ( ( 'alias' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1054:1: ( 'alias' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1054:1: ( 'alias' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1055:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAliasKeyword_1_3_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__DomainElement__Group_1_3__0__Impl2094); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAliasKeyword_1_3_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_3__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_3__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1068:1: rule__DomainElement__Group_1_3__1 : rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2 ;
    public final void rule__DomainElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1072:1: ( rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1073:2: rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__1__Impl_in_rule__DomainElement__Group_1_3__12125);
            rule__DomainElement__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__2_in_rule__DomainElement__Group_1_3__12128);
            rule__DomainElement__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_3__1"


    // $ANTLR start "rule__DomainElement__Group_1_3__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1080:1: rule__DomainElement__Group_1_3__1__Impl : ( ( rule__DomainElement__NameAssignment_1_3_1 ) ) ;
    public final void rule__DomainElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1084:1: ( ( ( rule__DomainElement__NameAssignment_1_3_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1085:1: ( ( rule__DomainElement__NameAssignment_1_3_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1085:1: ( ( rule__DomainElement__NameAssignment_1_3_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1086:1: ( rule__DomainElement__NameAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_3_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1087:1: ( rule__DomainElement__NameAssignment_1_3_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1087:2: rule__DomainElement__NameAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__DomainElement__NameAssignment_1_3_1_in_rule__DomainElement__Group_1_3__1__Impl2155);
            rule__DomainElement__NameAssignment_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameAssignment_1_3_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_3__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_3__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1097:1: rule__DomainElement__Group_1_3__2 : rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3 ;
    public final void rule__DomainElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1101:1: ( rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1102:2: rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__2__Impl_in_rule__DomainElement__Group_1_3__22185);
            rule__DomainElement__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__3_in_rule__DomainElement__Group_1_3__22188);
            rule__DomainElement__Group_1_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_3__2"


    // $ANTLR start "rule__DomainElement__Group_1_3__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1109:1: rule__DomainElement__Group_1_3__2__Impl : ( 'as' ) ;
    public final void rule__DomainElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1113:1: ( ( 'as' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1114:1: ( 'as' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1114:1: ( 'as' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1115:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAsKeyword_1_3_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__DomainElement__Group_1_3__2__Impl2216); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAsKeyword_1_3_2()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_3__2__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_3__3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1128:1: rule__DomainElement__Group_1_3__3 : rule__DomainElement__Group_1_3__3__Impl ;
    public final void rule__DomainElement__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1132:1: ( rule__DomainElement__Group_1_3__3__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1133:2: rule__DomainElement__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__3__Impl_in_rule__DomainElement__Group_1_3__32247);
            rule__DomainElement__Group_1_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Group_1_3__3"


    // $ANTLR start "rule__DomainElement__Group_1_3__3__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1139:1: rule__DomainElement__Group_1_3__3__Impl : ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) ) ;
    public final void rule__DomainElement__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1143:1: ( ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1144:1: ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1144:1: ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1145:1: ( rule__DomainElement__RealTypeAssignment_1_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRealTypeAssignment_1_3_3()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1146:1: ( rule__DomainElement__RealTypeAssignment_1_3_3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1146:2: rule__DomainElement__RealTypeAssignment_1_3_3
            {
            pushFollow(FOLLOW_rule__DomainElement__RealTypeAssignment_1_3_3_in_rule__DomainElement__Group_1_3__3__Impl2274);
            rule__DomainElement__RealTypeAssignment_1_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getRealTypeAssignment_1_3_3()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_3__3__Impl"


    // $ANTLR start "rule__EnumVal__Group__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1164:1: rule__EnumVal__Group__0 : rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1 ;
    public final void rule__EnumVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1168:1: ( rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1169:2: rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1
            {
            pushFollow(FOLLOW_rule__EnumVal__Group__0__Impl_in_rule__EnumVal__Group__02312);
            rule__EnumVal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumVal__Group__1_in_rule__EnumVal__Group__02315);
            rule__EnumVal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumVal__Group__0"


    // $ANTLR start "rule__EnumVal__Group__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1176:1: rule__EnumVal__Group__0__Impl : ( ( rule__EnumVal__DocAssignment_0 )* ) ;
    public final void rule__EnumVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1180:1: ( ( ( rule__EnumVal__DocAssignment_0 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1181:1: ( ( rule__EnumVal__DocAssignment_0 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1181:1: ( ( rule__EnumVal__DocAssignment_0 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1182:1: ( rule__EnumVal__DocAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getDocAssignment_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1183:1: ( rule__EnumVal__DocAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1183:2: rule__EnumVal__DocAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__EnumVal__DocAssignment_0_in_rule__EnumVal__Group__0__Impl2342);
            	    rule__EnumVal__DocAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getDocAssignment_0()); 
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
    // $ANTLR end "rule__EnumVal__Group__0__Impl"


    // $ANTLR start "rule__EnumVal__Group__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1193:1: rule__EnumVal__Group__1 : rule__EnumVal__Group__1__Impl ;
    public final void rule__EnumVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1197:1: ( rule__EnumVal__Group__1__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1198:2: rule__EnumVal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumVal__Group__1__Impl_in_rule__EnumVal__Group__12373);
            rule__EnumVal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumVal__Group__1"


    // $ANTLR start "rule__EnumVal__Group__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1204:1: rule__EnumVal__Group__1__Impl : ( ( rule__EnumVal__NameAssignment_1 ) ) ;
    public final void rule__EnumVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1208:1: ( ( ( rule__EnumVal__NameAssignment_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1209:1: ( ( rule__EnumVal__NameAssignment_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1209:1: ( ( rule__EnumVal__NameAssignment_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1210:1: ( rule__EnumVal__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1211:1: ( rule__EnumVal__NameAssignment_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1211:2: rule__EnumVal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumVal__NameAssignment_1_in_rule__EnumVal__Group__1__Impl2400);
            rule__EnumVal__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EnumVal__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1225:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1229:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1230:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02434);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02437);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1237:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DocumentationAssignment_0 )* ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1241:1: ( ( ( rule__Attribute__DocumentationAssignment_0 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1242:1: ( ( rule__Attribute__DocumentationAssignment_0 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1242:1: ( ( rule__Attribute__DocumentationAssignment_0 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1243:1: ( rule__Attribute__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDocumentationAssignment_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1244:1: ( rule__Attribute__DocumentationAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1244:2: rule__Attribute__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__DocumentationAssignment_0_in_rule__Attribute__Group__0__Impl2464);
            	    rule__Attribute__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getDocumentationAssignment_0()); 
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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1254:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1258:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1259:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12495);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12498);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1266:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__OptionalAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1270:1: ( ( ( rule__Attribute__OptionalAssignment_1 )? ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1271:1: ( ( rule__Attribute__OptionalAssignment_1 )? )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1271:1: ( ( rule__Attribute__OptionalAssignment_1 )? )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1272:1: ( rule__Attribute__OptionalAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalAssignment_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1273:1: ( rule__Attribute__OptionalAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1273:2: rule__Attribute__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__OptionalAssignment_1_in_rule__Attribute__Group__1__Impl2525);
                    rule__Attribute__OptionalAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getOptionalAssignment_1()); 
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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1283:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1287:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1288:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22556);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22559);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1295:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1299:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1300:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1300:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1301:1: ( rule__Attribute__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1302:1: ( rule__Attribute__TypeAssignment_2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1302:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2586);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1312:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1316:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1317:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32616);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32619);
            rule__Attribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1324:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1328:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1329:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1329:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1330:1: ( rule__Attribute__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1331:1: ( rule__Attribute__NameAssignment_3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1331:2: rule__Attribute__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_3_in_rule__Attribute__Group__3__Impl2646);
            rule__Attribute__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1341:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1345:1: ( rule__Attribute__Group__4__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1346:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42676);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1352:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1356:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1357:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1357:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1358:1: ( rule__Attribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1359:1: ( rule__Attribute__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1359:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl2703);
                    rule__Attribute__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1379:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1383:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1384:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__02744);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__02747);
            rule__Attribute__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1391:1: rule__Attribute__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1395:1: ( ( '=' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1396:1: ( '=' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1396:1: ( '=' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1397:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Attribute__Group_4__0__Impl2775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
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
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1410:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1414:1: ( rule__Attribute__Group_4__1__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1415:2: rule__Attribute__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__12806);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1421:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__ValueAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1425:1: ( ( ( rule__Attribute__ValueAssignment_4_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1426:1: ( ( rule__Attribute__ValueAssignment_4_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1426:1: ( ( rule__Attribute__ValueAssignment_4_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1427:1: ( rule__Attribute__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_4_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1428:1: ( rule__Attribute__ValueAssignment_4_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1428:2: rule__Attribute__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_4_1_in_rule__Attribute__Group_4__1__Impl2833);
            rule__Attribute__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAssignment_4_1()); 
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
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1442:1: rule__GenericTypeArgument__Group__0 : rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1 ;
    public final void rule__GenericTypeArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1446:1: ( rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1447:2: rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__0__Impl_in_rule__GenericTypeArgument__Group__02867);
            rule__GenericTypeArgument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__1_in_rule__GenericTypeArgument__Group__02870);
            rule__GenericTypeArgument__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group__0"


    // $ANTLR start "rule__GenericTypeArgument__Group__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1454:1: rule__GenericTypeArgument__Group__0__Impl : ( ( rule__GenericTypeArgument__TypeAssignment_0 ) ) ;
    public final void rule__GenericTypeArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1458:1: ( ( ( rule__GenericTypeArgument__TypeAssignment_0 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1459:1: ( ( rule__GenericTypeArgument__TypeAssignment_0 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1459:1: ( ( rule__GenericTypeArgument__TypeAssignment_0 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1460:1: ( rule__GenericTypeArgument__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeAssignment_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1461:1: ( rule__GenericTypeArgument__TypeAssignment_0 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1461:2: rule__GenericTypeArgument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__TypeAssignment_0_in_rule__GenericTypeArgument__Group__0__Impl2897);
            rule__GenericTypeArgument__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group__0__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1471:1: rule__GenericTypeArgument__Group__1 : rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2 ;
    public final void rule__GenericTypeArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1475:1: ( rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1476:2: rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__1__Impl_in_rule__GenericTypeArgument__Group__12927);
            rule__GenericTypeArgument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__2_in_rule__GenericTypeArgument__Group__12930);
            rule__GenericTypeArgument__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group__1"


    // $ANTLR start "rule__GenericTypeArgument__Group__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1483:1: rule__GenericTypeArgument__Group__1__Impl : ( ( rule__GenericTypeArgument__Group_1__0 )? ) ;
    public final void rule__GenericTypeArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1487:1: ( ( ( rule__GenericTypeArgument__Group_1__0 )? ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1488:1: ( ( rule__GenericTypeArgument__Group_1__0 )? )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1488:1: ( ( rule__GenericTypeArgument__Group_1__0 )? )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1489:1: ( rule__GenericTypeArgument__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1490:1: ( rule__GenericTypeArgument__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1490:2: rule__GenericTypeArgument__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__0_in_rule__GenericTypeArgument__Group__1__Impl2957);
                    rule__GenericTypeArgument__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getGroup_1()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group__1__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1500:1: rule__GenericTypeArgument__Group__2 : rule__GenericTypeArgument__Group__2__Impl ;
    public final void rule__GenericTypeArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1504:1: ( rule__GenericTypeArgument__Group__2__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1505:2: rule__GenericTypeArgument__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__2__Impl_in_rule__GenericTypeArgument__Group__22988);
            rule__GenericTypeArgument__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group__2"


    // $ANTLR start "rule__GenericTypeArgument__Group__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1511:1: rule__GenericTypeArgument__Group__2__Impl : ( ( rule__GenericTypeArgument__ListAssignment_2 )? ) ;
    public final void rule__GenericTypeArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1515:1: ( ( ( rule__GenericTypeArgument__ListAssignment_2 )? ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1516:1: ( ( rule__GenericTypeArgument__ListAssignment_2 )? )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1516:1: ( ( rule__GenericTypeArgument__ListAssignment_2 )? )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1517:1: ( rule__GenericTypeArgument__ListAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListAssignment_2()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1518:1: ( rule__GenericTypeArgument__ListAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1518:2: rule__GenericTypeArgument__ListAssignment_2
                    {
                    pushFollow(FOLLOW_rule__GenericTypeArgument__ListAssignment_2_in_rule__GenericTypeArgument__Group__2__Impl3015);
                    rule__GenericTypeArgument__ListAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getListAssignment_2()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group__2__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1534:1: rule__GenericTypeArgument__Group_1__0 : rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1 ;
    public final void rule__GenericTypeArgument__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1538:1: ( rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1539:2: rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__0__Impl_in_rule__GenericTypeArgument__Group_1__03052);
            rule__GenericTypeArgument__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__1_in_rule__GenericTypeArgument__Group_1__03055);
            rule__GenericTypeArgument__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group_1__0"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1546:1: rule__GenericTypeArgument__Group_1__0__Impl : ( '<' ) ;
    public final void rule__GenericTypeArgument__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1550:1: ( ( '<' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1551:1: ( '<' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1551:1: ( '<' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1552:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__GenericTypeArgument__Group_1__0__Impl3083); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getLessThanSignKeyword_1_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__0__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1565:1: rule__GenericTypeArgument__Group_1__1 : rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2 ;
    public final void rule__GenericTypeArgument__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1569:1: ( rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1570:2: rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__1__Impl_in_rule__GenericTypeArgument__Group_1__13114);
            rule__GenericTypeArgument__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__2_in_rule__GenericTypeArgument__Group_1__13117);
            rule__GenericTypeArgument__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group_1__1"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1577:1: rule__GenericTypeArgument__Group_1__1__Impl : ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__GenericTypeArgument__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1581:1: ( ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1582:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1582:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1583:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1584:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1584:2: rule__GenericTypeArgument__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__ArgumentsAssignment_1_1_in_rule__GenericTypeArgument__Group_1__1__Impl3144);
            rule__GenericTypeArgument__ArgumentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_1()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__1__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1594:1: rule__GenericTypeArgument__Group_1__2 : rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3 ;
    public final void rule__GenericTypeArgument__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1598:1: ( rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1599:2: rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__2__Impl_in_rule__GenericTypeArgument__Group_1__23174);
            rule__GenericTypeArgument__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__3_in_rule__GenericTypeArgument__Group_1__23177);
            rule__GenericTypeArgument__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group_1__2"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1606:1: rule__GenericTypeArgument__Group_1__2__Impl : ( ( rule__GenericTypeArgument__Group_1_2__0 )* ) ;
    public final void rule__GenericTypeArgument__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1610:1: ( ( ( rule__GenericTypeArgument__Group_1_2__0 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1611:1: ( ( rule__GenericTypeArgument__Group_1_2__0 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1611:1: ( ( rule__GenericTypeArgument__Group_1_2__0 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1612:1: ( rule__GenericTypeArgument__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup_1_2()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1613:1: ( rule__GenericTypeArgument__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1613:2: rule__GenericTypeArgument__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1_2__0_in_rule__GenericTypeArgument__Group_1__2__Impl3204);
            	    rule__GenericTypeArgument__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__2__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1623:1: rule__GenericTypeArgument__Group_1__3 : rule__GenericTypeArgument__Group_1__3__Impl ;
    public final void rule__GenericTypeArgument__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1627:1: ( rule__GenericTypeArgument__Group_1__3__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1628:2: rule__GenericTypeArgument__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__3__Impl_in_rule__GenericTypeArgument__Group_1__33235);
            rule__GenericTypeArgument__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group_1__3"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__3__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1634:1: rule__GenericTypeArgument__Group_1__3__Impl : ( '>' ) ;
    public final void rule__GenericTypeArgument__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1638:1: ( ( '>' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1639:1: ( '>' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1639:1: ( '>' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1640:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__GenericTypeArgument__Group_1__3__Impl3263); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getGreaterThanSignKeyword_1_3()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__3__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1_2__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1661:1: rule__GenericTypeArgument__Group_1_2__0 : rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1 ;
    public final void rule__GenericTypeArgument__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1665:1: ( rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1666:2: rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1_2__0__Impl_in_rule__GenericTypeArgument__Group_1_2__03302);
            rule__GenericTypeArgument__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1_2__1_in_rule__GenericTypeArgument__Group_1_2__03305);
            rule__GenericTypeArgument__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group_1_2__0"


    // $ANTLR start "rule__GenericTypeArgument__Group_1_2__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1673:1: rule__GenericTypeArgument__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__GenericTypeArgument__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1677:1: ( ( ',' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1678:1: ( ',' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1678:1: ( ',' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1679:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__GenericTypeArgument__Group_1_2__0__Impl3333); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getCommaKeyword_1_2_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1_2__0__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1_2__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1692:1: rule__GenericTypeArgument__Group_1_2__1 : rule__GenericTypeArgument__Group_1_2__1__Impl ;
    public final void rule__GenericTypeArgument__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1696:1: ( rule__GenericTypeArgument__Group_1_2__1__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1697:2: rule__GenericTypeArgument__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1_2__1__Impl_in_rule__GenericTypeArgument__Group_1_2__13364);
            rule__GenericTypeArgument__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericTypeArgument__Group_1_2__1"


    // $ANTLR start "rule__GenericTypeArgument__Group_1_2__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1703:1: rule__GenericTypeArgument__Group_1_2__1__Impl : ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__GenericTypeArgument__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1707:1: ( ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1708:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1708:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1709:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_2_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1710:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1710:2: rule__GenericTypeArgument__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__ArgumentsAssignment_1_2_1_in_rule__GenericTypeArgument__Group_1_2__1__Impl3391);
            rule__GenericTypeArgument__ArgumentsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_2_1()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1_2__1__Impl"


    // $ANTLR start "rule__CommandDef__Group__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1724:1: rule__CommandDef__Group__0 : rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1 ;
    public final void rule__CommandDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1728:1: ( rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1729:2: rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1
            {
            pushFollow(FOLLOW_rule__CommandDef__Group__0__Impl_in_rule__CommandDef__Group__03425);
            rule__CommandDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandDef__Group__1_in_rule__CommandDef__Group__03428);
            rule__CommandDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDef__Group__0"


    // $ANTLR start "rule__CommandDef__Group__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1736:1: rule__CommandDef__Group__0__Impl : ( 'command' ) ;
    public final void rule__CommandDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1740:1: ( ( 'command' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1741:1: ( 'command' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1741:1: ( 'command' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1742:1: 'command'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getCommandKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__CommandDef__Group__0__Impl3456); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getCommandKeyword_0()); 
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
    // $ANTLR end "rule__CommandDef__Group__0__Impl"


    // $ANTLR start "rule__CommandDef__Group__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1755:1: rule__CommandDef__Group__1 : rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2 ;
    public final void rule__CommandDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1759:1: ( rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1760:2: rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2
            {
            pushFollow(FOLLOW_rule__CommandDef__Group__1__Impl_in_rule__CommandDef__Group__13487);
            rule__CommandDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandDef__Group__2_in_rule__CommandDef__Group__13490);
            rule__CommandDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDef__Group__1"


    // $ANTLR start "rule__CommandDef__Group__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1767:1: rule__CommandDef__Group__1__Impl : ( ( rule__CommandDef__NameAssignment_1 ) ) ;
    public final void rule__CommandDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1771:1: ( ( ( rule__CommandDef__NameAssignment_1 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1772:1: ( ( rule__CommandDef__NameAssignment_1 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1772:1: ( ( rule__CommandDef__NameAssignment_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1773:1: ( rule__CommandDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1774:1: ( rule__CommandDef__NameAssignment_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1774:2: rule__CommandDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandDef__NameAssignment_1_in_rule__CommandDef__Group__1__Impl3517);
            rule__CommandDef__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__CommandDef__Group__1__Impl"


    // $ANTLR start "rule__CommandDef__Group__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1784:1: rule__CommandDef__Group__2 : rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3 ;
    public final void rule__CommandDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1788:1: ( rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1789:2: rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3
            {
            pushFollow(FOLLOW_rule__CommandDef__Group__2__Impl_in_rule__CommandDef__Group__23547);
            rule__CommandDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandDef__Group__3_in_rule__CommandDef__Group__23550);
            rule__CommandDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDef__Group__2"


    // $ANTLR start "rule__CommandDef__Group__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1796:1: rule__CommandDef__Group__2__Impl : ( ( rule__CommandDef__Group_2__0 )? ) ;
    public final void rule__CommandDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1800:1: ( ( ( rule__CommandDef__Group_2__0 )? ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1801:1: ( ( rule__CommandDef__Group_2__0 )? )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1801:1: ( ( rule__CommandDef__Group_2__0 )? )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1802:1: ( rule__CommandDef__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getGroup_2()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1803:1: ( rule__CommandDef__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1803:2: rule__CommandDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CommandDef__Group_2__0_in_rule__CommandDef__Group__2__Impl3577);
                    rule__CommandDef__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getGroup_2()); 
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
    // $ANTLR end "rule__CommandDef__Group__2__Impl"


    // $ANTLR start "rule__CommandDef__Group__3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1813:1: rule__CommandDef__Group__3 : rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4 ;
    public final void rule__CommandDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1817:1: ( rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1818:2: rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4
            {
            pushFollow(FOLLOW_rule__CommandDef__Group__3__Impl_in_rule__CommandDef__Group__33608);
            rule__CommandDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandDef__Group__4_in_rule__CommandDef__Group__33611);
            rule__CommandDef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDef__Group__3"


    // $ANTLR start "rule__CommandDef__Group__3__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1825:1: rule__CommandDef__Group__3__Impl : ( 'returns' ) ;
    public final void rule__CommandDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1829:1: ( ( 'returns' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1830:1: ( 'returns' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1830:1: ( 'returns' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1831:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getReturnsKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__CommandDef__Group__3__Impl3639); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getReturnsKeyword_3()); 
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
    // $ANTLR end "rule__CommandDef__Group__3__Impl"


    // $ANTLR start "rule__CommandDef__Group__4"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1844:1: rule__CommandDef__Group__4 : rule__CommandDef__Group__4__Impl ;
    public final void rule__CommandDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1848:1: ( rule__CommandDef__Group__4__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1849:2: rule__CommandDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CommandDef__Group__4__Impl_in_rule__CommandDef__Group__43670);
            rule__CommandDef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDef__Group__4"


    // $ANTLR start "rule__CommandDef__Group__4__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1855:1: rule__CommandDef__Group__4__Impl : ( ( rule__CommandDef__Alternatives_4 ) ) ;
    public final void rule__CommandDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1859:1: ( ( ( rule__CommandDef__Alternatives_4 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1860:1: ( ( rule__CommandDef__Alternatives_4 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1860:1: ( ( rule__CommandDef__Alternatives_4 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1861:1: ( rule__CommandDef__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAlternatives_4()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1862:1: ( rule__CommandDef__Alternatives_4 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1862:2: rule__CommandDef__Alternatives_4
            {
            pushFollow(FOLLOW_rule__CommandDef__Alternatives_4_in_rule__CommandDef__Group__4__Impl3697);
            rule__CommandDef__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getAlternatives_4()); 
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
    // $ANTLR end "rule__CommandDef__Group__4__Impl"


    // $ANTLR start "rule__CommandDef__Group_2__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1882:1: rule__CommandDef__Group_2__0 : rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1 ;
    public final void rule__CommandDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1886:1: ( rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1887:2: rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__CommandDef__Group_2__0__Impl_in_rule__CommandDef__Group_2__03737);
            rule__CommandDef__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandDef__Group_2__1_in_rule__CommandDef__Group_2__03740);
            rule__CommandDef__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDef__Group_2__0"


    // $ANTLR start "rule__CommandDef__Group_2__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1894:1: rule__CommandDef__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CommandDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1898:1: ( ( '(' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1899:1: ( '(' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1899:1: ( '(' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1900:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__CommandDef__Group_2__0__Impl3768); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__CommandDef__Group_2__0__Impl"


    // $ANTLR start "rule__CommandDef__Group_2__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1913:1: rule__CommandDef__Group_2__1 : rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2 ;
    public final void rule__CommandDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1917:1: ( rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1918:2: rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2
            {
            pushFollow(FOLLOW_rule__CommandDef__Group_2__1__Impl_in_rule__CommandDef__Group_2__13799);
            rule__CommandDef__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandDef__Group_2__2_in_rule__CommandDef__Group_2__13802);
            rule__CommandDef__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDef__Group_2__1"


    // $ANTLR start "rule__CommandDef__Group_2__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1925:1: rule__CommandDef__Group_2__1__Impl : ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) ) ;
    public final void rule__CommandDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1929:1: ( ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1930:1: ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1930:1: ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1931:1: ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1931:1: ( ( rule__CommandDef__AttributesAssignment_2_1 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1932:1: ( rule__CommandDef__AttributesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1933:1: ( rule__CommandDef__AttributesAssignment_2_1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1933:2: rule__CommandDef__AttributesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CommandDef__AttributesAssignment_2_1_in_rule__CommandDef__Group_2__1__Impl3831);
            rule__CommandDef__AttributesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }

            }

            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1936:1: ( ( rule__CommandDef__AttributesAssignment_2_1 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1937:1: ( rule__CommandDef__AttributesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1938:1: ( rule__CommandDef__AttributesAssignment_2_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_DOC)||LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1938:2: rule__CommandDef__AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__CommandDef__AttributesAssignment_2_1_in_rule__CommandDef__Group_2__1__Impl3843);
            	    rule__CommandDef__AttributesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__CommandDef__Group_2__1__Impl"


    // $ANTLR start "rule__CommandDef__Group_2__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1949:1: rule__CommandDef__Group_2__2 : rule__CommandDef__Group_2__2__Impl ;
    public final void rule__CommandDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1953:1: ( rule__CommandDef__Group_2__2__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1954:2: rule__CommandDef__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CommandDef__Group_2__2__Impl_in_rule__CommandDef__Group_2__23876);
            rule__CommandDef__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDef__Group_2__2"


    // $ANTLR start "rule__CommandDef__Group_2__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1960:1: rule__CommandDef__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CommandDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1964:1: ( ( ')' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1965:1: ( ')' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1965:1: ( ')' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1966:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__CommandDef__Group_2__2__Impl3904); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__CommandDef__Group_2__2__Impl"


    // $ANTLR start "rule__EventDef__Group__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1985:1: rule__EventDef__Group__0 : rule__EventDef__Group__0__Impl rule__EventDef__Group__1 ;
    public final void rule__EventDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1989:1: ( rule__EventDef__Group__0__Impl rule__EventDef__Group__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1990:2: rule__EventDef__Group__0__Impl rule__EventDef__Group__1
            {
            pushFollow(FOLLOW_rule__EventDef__Group__0__Impl_in_rule__EventDef__Group__03941);
            rule__EventDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDef__Group__1_in_rule__EventDef__Group__03944);
            rule__EventDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDef__Group__0"


    // $ANTLR start "rule__EventDef__Group__0__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:1997:1: rule__EventDef__Group__0__Impl : ( ( rule__EventDef__DocumentationAssignment_0 )* ) ;
    public final void rule__EventDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2001:1: ( ( ( rule__EventDef__DocumentationAssignment_0 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2002:1: ( ( rule__EventDef__DocumentationAssignment_0 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2002:1: ( ( rule__EventDef__DocumentationAssignment_0 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2003:1: ( rule__EventDef__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getDocumentationAssignment_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2004:1: ( rule__EventDef__DocumentationAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOC) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2004:2: rule__EventDef__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__EventDef__DocumentationAssignment_0_in_rule__EventDef__Group__0__Impl3971);
            	    rule__EventDef__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefAccess().getDocumentationAssignment_0()); 
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
    // $ANTLR end "rule__EventDef__Group__0__Impl"


    // $ANTLR start "rule__EventDef__Group__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2014:1: rule__EventDef__Group__1 : rule__EventDef__Group__1__Impl rule__EventDef__Group__2 ;
    public final void rule__EventDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2018:1: ( rule__EventDef__Group__1__Impl rule__EventDef__Group__2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2019:2: rule__EventDef__Group__1__Impl rule__EventDef__Group__2
            {
            pushFollow(FOLLOW_rule__EventDef__Group__1__Impl_in_rule__EventDef__Group__14002);
            rule__EventDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDef__Group__2_in_rule__EventDef__Group__14005);
            rule__EventDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDef__Group__1"


    // $ANTLR start "rule__EventDef__Group__1__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2026:1: rule__EventDef__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2030:1: ( ( 'event' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2031:1: ( 'event' )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2031:1: ( 'event' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2032:1: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getEventKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__EventDef__Group__1__Impl4033); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefAccess().getEventKeyword_1()); 
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
    // $ANTLR end "rule__EventDef__Group__1__Impl"


    // $ANTLR start "rule__EventDef__Group__2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2045:1: rule__EventDef__Group__2 : rule__EventDef__Group__2__Impl rule__EventDef__Group__3 ;
    public final void rule__EventDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2049:1: ( rule__EventDef__Group__2__Impl rule__EventDef__Group__3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2050:2: rule__EventDef__Group__2__Impl rule__EventDef__Group__3
            {
            pushFollow(FOLLOW_rule__EventDef__Group__2__Impl_in_rule__EventDef__Group__24064);
            rule__EventDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDef__Group__3_in_rule__EventDef__Group__24067);
            rule__EventDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDef__Group__2"


    // $ANTLR start "rule__EventDef__Group__2__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2057:1: rule__EventDef__Group__2__Impl : ( ( rule__EventDef__NameAssignment_2 ) ) ;
    public final void rule__EventDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2061:1: ( ( ( rule__EventDef__NameAssignment_2 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2062:1: ( ( rule__EventDef__NameAssignment_2 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2062:1: ( ( rule__EventDef__NameAssignment_2 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2063:1: ( rule__EventDef__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2064:1: ( rule__EventDef__NameAssignment_2 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2064:2: rule__EventDef__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EventDef__NameAssignment_2_in_rule__EventDef__Group__2__Impl4094);
            rule__EventDef__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__EventDef__Group__2__Impl"


    // $ANTLR start "rule__EventDef__Group__3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2074:1: rule__EventDef__Group__3 : rule__EventDef__Group__3__Impl ;
    public final void rule__EventDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2078:1: ( rule__EventDef__Group__3__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2079:2: rule__EventDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EventDef__Group__3__Impl_in_rule__EventDef__Group__34124);
            rule__EventDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDef__Group__3"


    // $ANTLR start "rule__EventDef__Group__3__Impl"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2085:1: rule__EventDef__Group__3__Impl : ( ( rule__EventDef__TypeAssignment_3 ) ) ;
    public final void rule__EventDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2089:1: ( ( ( rule__EventDef__TypeAssignment_3 ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2090:1: ( ( rule__EventDef__TypeAssignment_3 ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2090:1: ( ( rule__EventDef__TypeAssignment_3 ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2091:1: ( rule__EventDef__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getTypeAssignment_3()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2092:1: ( rule__EventDef__TypeAssignment_3 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2092:2: rule__EventDef__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__EventDef__TypeAssignment_3_in_rule__EventDef__Group__3__Impl4151);
            rule__EventDef__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__EventDef__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2110:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2114:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2115:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04189);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04192);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2122:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2126:1: ( ( RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2127:1: ( RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2127:1: ( RULE_ID )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2128:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4219); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2139:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2143:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2144:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14248);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2150:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2154:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2155:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2155:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2156:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2157:1: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2157:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4275);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2171:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2175:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2176:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04310);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04313);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2183:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2187:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2188:1: ( ( '.' ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2188:1: ( ( '.' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2189:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2190:1: ( '.' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2191:2: '.'
            {
            match(input,30,FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl4342); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2202:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2206:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2207:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14374);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2213:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2217:1: ( ( RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2218:1: ( RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2218:1: ( RULE_ID )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2219:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ServiceDefs__PackageNameAssignment_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2235:1: rule__ServiceDefs__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ServiceDefs__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2239:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2240:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2240:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2241:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ServiceDefs__PackageNameAssignment_14439);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ServiceDefs__PackageNameAssignment_1"


    // $ANTLR start "rule__ServiceDefs__DomainElementsAssignment_2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2250:1: rule__ServiceDefs__DomainElementsAssignment_2 : ( ruleDomainElement ) ;
    public final void rule__ServiceDefs__DomainElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2254:1: ( ( ruleDomainElement ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2255:1: ( ruleDomainElement )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2255:1: ( ruleDomainElement )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2256:1: ruleDomainElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getDomainElementsDomainElementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_rule__ServiceDefs__DomainElementsAssignment_24470);
            ruleDomainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getDomainElementsDomainElementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ServiceDefs__DomainElementsAssignment_2"


    // $ANTLR start "rule__ServiceDefs__CommandListAssignment_3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2265:1: rule__ServiceDefs__CommandListAssignment_3 : ( ruleCommandDef ) ;
    public final void rule__ServiceDefs__CommandListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2269:1: ( ( ruleCommandDef ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2270:1: ( ruleCommandDef )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2270:1: ( ruleCommandDef )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2271:1: ruleCommandDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getCommandListCommandDefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommandDef_in_rule__ServiceDefs__CommandListAssignment_34501);
            ruleCommandDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getCommandListCommandDefParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ServiceDefs__CommandListAssignment_3"


    // $ANTLR start "rule__ServiceDefs__EventListAssignment_4"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2280:1: rule__ServiceDefs__EventListAssignment_4 : ( ruleEventDef ) ;
    public final void rule__ServiceDefs__EventListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2284:1: ( ( ruleEventDef ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2285:1: ( ruleEventDef )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2285:1: ( ruleEventDef )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2286:1: ruleEventDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getEventListEventDefParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleEventDef_in_rule__ServiceDefs__EventListAssignment_44532);
            ruleEventDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getEventListEventDefParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__ServiceDefs__EventListAssignment_4"


    // $ANTLR start "rule__DomainElement__DocAssignment_0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2295:1: rule__DomainElement__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__DomainElement__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2299:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2300:1: ( RULE_DOC )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2300:1: ( RULE_DOC )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2301:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getDocDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__DomainElement__DocAssignment_04563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getDocDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__DomainElement__DocAssignment_0"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_0_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2310:1: rule__DomainElement__NameAssignment_1_0_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2314:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2315:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2315:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2316:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_0_14594);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__DomainElement__NameAssignment_1_0_1"


    // $ANTLR start "rule__DomainElement__CustAssignment_1_1_0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2325:1: rule__DomainElement__CustAssignment_1_1_0 : ( ( 'cust' ) ) ;
    public final void rule__DomainElement__CustAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2329:1: ( ( ( 'cust' ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2330:1: ( ( 'cust' ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2330:1: ( ( 'cust' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2331:1: ( 'cust' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2332:1: ( 'cust' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2333:1: 'cust'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__DomainElement__CustAssignment_1_1_04630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
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
    // $ANTLR end "rule__DomainElement__CustAssignment_1_1_0"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_1_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2348:1: rule__DomainElement__NameAssignment_1_1_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2352:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2353:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2353:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2354:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_1_14669);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__DomainElement__NameAssignment_1_1_1"


    // $ANTLR start "rule__DomainElement__SuperTypeAssignment_1_1_2_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2363:1: rule__DomainElement__SuperTypeAssignment_1_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DomainElement__SuperTypeAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2367:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2368:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2368:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2369:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2370:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2371:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementQualifiedNameParserRuleCall_1_1_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__SuperTypeAssignment_1_1_2_14704);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementQualifiedNameParserRuleCall_1_1_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
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
    // $ANTLR end "rule__DomainElement__SuperTypeAssignment_1_1_2_1"


    // $ANTLR start "rule__DomainElement__AttributesAssignment_1_1_4"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2382:1: rule__DomainElement__AttributesAssignment_1_1_4 : ( ruleAttribute ) ;
    public final void rule__DomainElement__AttributesAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2386:1: ( ( ruleAttribute ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2387:1: ( ruleAttribute )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2387:1: ( ruleAttribute )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2388:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAttributesAttributeParserRuleCall_1_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__DomainElement__AttributesAssignment_1_1_44739);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAttributesAttributeParserRuleCall_1_1_4_0()); 
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
    // $ANTLR end "rule__DomainElement__AttributesAssignment_1_1_4"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_2_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2397:1: rule__DomainElement__NameAssignment_1_2_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2401:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2402:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2402:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2403:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_2_14770);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__DomainElement__NameAssignment_1_2_1"


    // $ANTLR start "rule__DomainElement__EnumValuesAssignment_1_2_3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2412:1: rule__DomainElement__EnumValuesAssignment_1_2_3 : ( ruleEnumVal ) ;
    public final void rule__DomainElement__EnumValuesAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2416:1: ( ( ruleEnumVal ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2417:1: ( ruleEnumVal )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2417:1: ( ruleEnumVal )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2418:1: ruleEnumVal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumValuesEnumValParserRuleCall_1_2_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumVal_in_rule__DomainElement__EnumValuesAssignment_1_2_34801);
            ruleEnumVal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getEnumValuesEnumValParserRuleCall_1_2_3_0()); 
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
    // $ANTLR end "rule__DomainElement__EnumValuesAssignment_1_2_3"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_3_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2427:1: rule__DomainElement__NameAssignment_1_3_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2431:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2432:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2432:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2433:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_3_14832);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_3_1_0()); 
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
    // $ANTLR end "rule__DomainElement__NameAssignment_1_3_1"


    // $ANTLR start "rule__DomainElement__RealTypeAssignment_1_3_3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2442:1: rule__DomainElement__RealTypeAssignment_1_3_3 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__RealTypeAssignment_1_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2446:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2447:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2447:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2448:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRealTypeQualifiedNameParserRuleCall_1_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__RealTypeAssignment_1_3_34863);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getRealTypeQualifiedNameParserRuleCall_1_3_3_0()); 
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
    // $ANTLR end "rule__DomainElement__RealTypeAssignment_1_3_3"


    // $ANTLR start "rule__EnumVal__DocAssignment_0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2457:1: rule__EnumVal__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EnumVal__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2461:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2462:1: ( RULE_DOC )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2462:1: ( RULE_DOC )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2463:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getDocDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__EnumVal__DocAssignment_04894); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getDocDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__EnumVal__DocAssignment_0"


    // $ANTLR start "rule__EnumVal__NameAssignment_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2472:1: rule__EnumVal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumVal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2476:1: ( ( RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2477:1: ( RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2477:1: ( RULE_ID )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2478:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumVal__NameAssignment_14925); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EnumVal__NameAssignment_1"


    // $ANTLR start "rule__Attribute__DocumentationAssignment_0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2487:1: rule__Attribute__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Attribute__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2491:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2492:1: ( RULE_DOC )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2492:1: ( RULE_DOC )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2493:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Attribute__DocumentationAssignment_04956); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Attribute__DocumentationAssignment_0"


    // $ANTLR start "rule__Attribute__OptionalAssignment_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2502:1: rule__Attribute__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__Attribute__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2506:1: ( ( ( 'optional' ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2507:1: ( ( 'optional' ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2507:1: ( ( 'optional' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2508:1: ( 'optional' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2509:1: ( 'optional' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2510:1: 'optional'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Attribute__OptionalAssignment_14992); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
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
    // $ANTLR end "rule__Attribute__OptionalAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2525:1: rule__Attribute__TypeAssignment_2 : ( ruleGenericTypeArgument ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2529:1: ( ( ruleGenericTypeArgument ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2530:1: ( ruleGenericTypeArgument )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2530:1: ( ruleGenericTypeArgument )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2531:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeGenericTypeArgumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_rule__Attribute__TypeAssignment_25031);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeGenericTypeArgumentParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2540:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2544:1: ( ( RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2545:1: ( RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2545:1: ( RULE_ID )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2546:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_35062); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Attribute__NameAssignment_3"


    // $ANTLR start "rule__Attribute__ValueAssignment_4_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2555:1: rule__Attribute__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2559:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2560:1: ( RULE_STRING )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2560:1: ( RULE_STRING )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2561:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_4_15093); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__Attribute__ValueAssignment_4_1"


    // $ANTLR start "rule__GenericTypeArgument__TypeAssignment_0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2570:1: rule__GenericTypeArgument__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GenericTypeArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2574:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2575:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2575:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2576:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2577:1: ( ruleQualifiedName )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2578:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GenericTypeArgument__TypeAssignment_05128);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__TypeAssignment_0"


    // $ANTLR start "rule__GenericTypeArgument__ArgumentsAssignment_1_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2589:1: rule__GenericTypeArgument__ArgumentsAssignment_1_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__GenericTypeArgument__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2593:1: ( ( ruleGenericTypeArgument ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2594:1: ( ruleGenericTypeArgument )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2594:1: ( ruleGenericTypeArgument )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2595:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_rule__GenericTypeArgument__ArgumentsAssignment_1_15163);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__GenericTypeArgument__ArgumentsAssignment_1_2_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2604:1: rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__GenericTypeArgument__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2608:1: ( ( ruleGenericTypeArgument ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2609:1: ( ruleGenericTypeArgument )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2609:1: ( ruleGenericTypeArgument )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2610:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_rule__GenericTypeArgument__ArgumentsAssignment_1_2_15194);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__GenericTypeArgument__ListAssignment_2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2619:1: rule__GenericTypeArgument__ListAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__GenericTypeArgument__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2623:1: ( ( ( '[]' ) ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2624:1: ( ( '[]' ) )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2624:1: ( ( '[]' ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2625:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2626:1: ( '[]' )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2627:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__GenericTypeArgument__ListAssignment_25230); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__ListAssignment_2"


    // $ANTLR start "rule__CommandDef__NameAssignment_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2642:1: rule__CommandDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommandDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2646:1: ( ( RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2647:1: ( RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2647:1: ( RULE_ID )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2648:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CommandDef__NameAssignment_15269); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CommandDef__NameAssignment_1"


    // $ANTLR start "rule__CommandDef__AttributesAssignment_2_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2657:1: rule__CommandDef__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__CommandDef__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2661:1: ( ( ruleAttribute ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2662:1: ( ruleAttribute )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2662:1: ( ruleAttribute )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2663:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__CommandDef__AttributesAssignment_2_15300);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__CommandDef__AttributesAssignment_2_1"


    // $ANTLR start "rule__CommandDef__ReturnValAssignment_4_1"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2672:1: rule__CommandDef__ReturnValAssignment_4_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__CommandDef__ReturnValAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2676:1: ( ( ruleGenericTypeArgument ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2677:1: ( ruleGenericTypeArgument )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2677:1: ( ruleGenericTypeArgument )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2678:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getReturnValGenericTypeArgumentParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_rule__CommandDef__ReturnValAssignment_4_15331);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getReturnValGenericTypeArgumentParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__CommandDef__ReturnValAssignment_4_1"


    // $ANTLR start "rule__EventDef__DocumentationAssignment_0"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2687:1: rule__EventDef__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EventDef__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2691:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2692:1: ( RULE_DOC )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2692:1: ( RULE_DOC )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2693:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__EventDef__DocumentationAssignment_05362); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__EventDef__DocumentationAssignment_0"


    // $ANTLR start "rule__EventDef__NameAssignment_2"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2702:1: rule__EventDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2706:1: ( ( RULE_ID ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2707:1: ( RULE_ID )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2707:1: ( RULE_ID )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2708:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventDef__NameAssignment_25393); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__EventDef__NameAssignment_2"


    // $ANTLR start "rule__EventDef__TypeAssignment_3"
    // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2717:1: rule__EventDef__TypeAssignment_3 : ( ruleGenericTypeArgument ) ;
    public final void rule__EventDef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2721:1: ( ( ruleGenericTypeArgument ) )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2722:1: ( ruleGenericTypeArgument )
            {
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2722:1: ( ruleGenericTypeArgument )
            // ../at.bestsolution.typescript.service.spec.ui/src-gen/at/bestsolution/typescript/service/spec/ui/contentassist/antlr/internal/InternalTSSpec.g:2723:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getTypeGenericTypeArgumentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_rule__EventDef__TypeAssignment_35424);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefAccess().getTypeGenericTypeArgumentParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__EventDef__TypeAssignment_3"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\4\uffff";
    static final String DFA3_eofS =
        "\1\1\3\uffff";
    static final String DFA3_minS =
        "\1\5\1\uffff\1\5\1\uffff";
    static final String DFA3_maxS =
        "\1\37\1\uffff\1\37\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\10\uffff\1\3\3\uffff\1\3\2\uffff\1\3\5\uffff\1\1\1\uffff\1\1\1\uffff\1\3",
            "",
            "\1\2\10\uffff\1\3\3\uffff\1\3\2\uffff\1\3\7\uffff\1\1\1\uffff\1\3",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 424:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleServiceDefs_in_entryRuleServiceDefs67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDefs74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__0_in_ruleServiceDefs100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group__0_in_ruleDomainElement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumVal_in_entryRuleEnumVal187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumVal194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumVal__Group__0_in_ruleEnumVal220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_entryRuleGenericTypeArgument307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericTypeArgument314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__0_in_ruleGenericTypeArgument340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandDef_in_entryRuleCommandDef367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandDef374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__0_in_ruleCommandDef400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDef_in_entryRuleEventDef427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDef434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDef__Group__0_in_ruleEventDef460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_0__0_in_rule__DomainElement__Alternatives_1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__0_in_rule__DomainElement__Alternatives_1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__0_in_rule__DomainElement__Alternatives_1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__0_in_rule__DomainElement__Alternatives_1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CommandDef__Alternatives_4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__ReturnValAssignment_4_1_in_rule__CommandDef__Alternatives_4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__0__Impl_in_rule__ServiceDefs__Group__0694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__1_in_rule__ServiceDefs__Group__0697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ServiceDefs__Group__0__Impl725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__1__Impl_in_rule__ServiceDefs__Group__1756 = new BitSet(new long[]{0x00000000A8244020L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__2_in_rule__ServiceDefs__Group__1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__PackageNameAssignment_1_in_rule__ServiceDefs__Group__1__Impl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__2__Impl_in_rule__ServiceDefs__Group__2816 = new BitSet(new long[]{0x00000000A8244020L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__3_in_rule__ServiceDefs__Group__2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__DomainElementsAssignment_2_in_rule__ServiceDefs__Group__2__Impl846 = new BitSet(new long[]{0x0000000080244022L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__3__Impl_in_rule__ServiceDefs__Group__3877 = new BitSet(new long[]{0x00000000A8244020L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__4_in_rule__ServiceDefs__Group__3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__CommandListAssignment_3_in_rule__ServiceDefs__Group__3__Impl907 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__4__Impl_in_rule__ServiceDefs__Group__4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__EventListAssignment_4_in_rule__ServiceDefs__Group__4__Impl965 = new BitSet(new long[]{0x0000000020000022L});
    public static final BitSet FOLLOW_rule__DomainElement__Group__0__Impl_in_rule__DomainElement__Group__01006 = new BitSet(new long[]{0x0000000080244020L});
    public static final BitSet FOLLOW_rule__DomainElement__Group__1_in_rule__DomainElement__Group__01009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__DocAssignment_0_in_rule__DomainElement__Group__0__Impl1036 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__DomainElement__Group__1__Impl_in_rule__DomainElement__Group__11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Alternatives_1_in_rule__DomainElement__Group__1__Impl1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_0__0__Impl_in_rule__DomainElement__Group_1_0__01128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_0__1_in_rule__DomainElement__Group_1_0__01131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainElement__Group_1_0__0__Impl1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_0__1__Impl_in_rule__DomainElement__Group_1_0__11190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__NameAssignment_1_0_1_in_rule__DomainElement__Group_1_0__1__Impl1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__0__Impl_in_rule__DomainElement__Group_1_1__01251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__1_in_rule__DomainElement__Group_1_1__01254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__CustAssignment_1_1_0_in_rule__DomainElement__Group_1_1__0__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__1__Impl_in_rule__DomainElement__Group_1_1__11311 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__2_in_rule__DomainElement__Group_1_1__11314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__NameAssignment_1_1_1_in_rule__DomainElement__Group_1_1__1__Impl1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__2__Impl_in_rule__DomainElement__Group_1_1__21371 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__3_in_rule__DomainElement__Group_1_1__21374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1_2__0_in_rule__DomainElement__Group_1_1__2__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__3__Impl_in_rule__DomainElement__Group_1_1__31432 = new BitSet(new long[]{0x0000000100010030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__4_in_rule__DomainElement__Group_1_1__31435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DomainElement__Group_1_1__3__Impl1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__4__Impl_in_rule__DomainElement__Group_1_1__41494 = new BitSet(new long[]{0x0000000100010030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__5_in_rule__DomainElement__Group_1_1__41497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__AttributesAssignment_1_1_4_in_rule__DomainElement__Group_1_1__4__Impl1524 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__5__Impl_in_rule__DomainElement__Group_1_1__51555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DomainElement__Group_1_1__5__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1_2__0__Impl_in_rule__DomainElement__Group_1_1_2__01626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1_2__1_in_rule__DomainElement__Group_1_1_2__01629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DomainElement__Group_1_1_2__0__Impl1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1_2__1__Impl_in_rule__DomainElement__Group_1_1_2__11688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__SuperTypeAssignment_1_1_2_1_in_rule__DomainElement__Group_1_1_2__1__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__0__Impl_in_rule__DomainElement__Group_1_2__01749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__1_in_rule__DomainElement__Group_1_2__01752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DomainElement__Group_1_2__0__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__1__Impl_in_rule__DomainElement__Group_1_2__11811 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__2_in_rule__DomainElement__Group_1_2__11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__NameAssignment_1_2_1_in_rule__DomainElement__Group_1_2__1__Impl1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__2__Impl_in_rule__DomainElement__Group_1_2__21871 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__3_in_rule__DomainElement__Group_1_2__21874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DomainElement__Group_1_2__2__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__3__Impl_in_rule__DomainElement__Group_1_2__31933 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__4_in_rule__DomainElement__Group_1_2__31936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__EnumValuesAssignment_1_2_3_in_rule__DomainElement__Group_1_2__3__Impl1963 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__4__Impl_in_rule__DomainElement__Group_1_2__41994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DomainElement__Group_1_2__4__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__0__Impl_in_rule__DomainElement__Group_1_3__02063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__1_in_rule__DomainElement__Group_1_3__02066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DomainElement__Group_1_3__0__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__1__Impl_in_rule__DomainElement__Group_1_3__12125 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__2_in_rule__DomainElement__Group_1_3__12128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__NameAssignment_1_3_1_in_rule__DomainElement__Group_1_3__1__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__2__Impl_in_rule__DomainElement__Group_1_3__22185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__3_in_rule__DomainElement__Group_1_3__22188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DomainElement__Group_1_3__2__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__3__Impl_in_rule__DomainElement__Group_1_3__32247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__RealTypeAssignment_1_3_3_in_rule__DomainElement__Group_1_3__3__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumVal__Group__0__Impl_in_rule__EnumVal__Group__02312 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__EnumVal__Group__1_in_rule__EnumVal__Group__02315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumVal__DocAssignment_0_in_rule__EnumVal__Group__0__Impl2342 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EnumVal__Group__1__Impl_in_rule__EnumVal__Group__12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumVal__NameAssignment_1_in_rule__EnumVal__Group__1__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02434 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DocumentationAssignment_0_in_rule__Attribute__Group__0__Impl2464 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12495 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__OptionalAssignment_1_in_rule__Attribute__Group__1__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32616 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_3_in_rule__Attribute__Group__3__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__02744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__02747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attribute__Group_4__0__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_4_1_in_rule__Attribute__Group_4__1__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__0__Impl_in_rule__GenericTypeArgument__Group__02867 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__1_in_rule__GenericTypeArgument__Group__02870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__TypeAssignment_0_in_rule__GenericTypeArgument__Group__0__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__1__Impl_in_rule__GenericTypeArgument__Group__12927 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__2_in_rule__GenericTypeArgument__Group__12930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__0_in_rule__GenericTypeArgument__Group__1__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__2__Impl_in_rule__GenericTypeArgument__Group__22988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__ListAssignment_2_in_rule__GenericTypeArgument__Group__2__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__0__Impl_in_rule__GenericTypeArgument__Group_1__03052 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__1_in_rule__GenericTypeArgument__Group_1__03055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GenericTypeArgument__Group_1__0__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__1__Impl_in_rule__GenericTypeArgument__Group_1__13114 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__2_in_rule__GenericTypeArgument__Group_1__13117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__ArgumentsAssignment_1_1_in_rule__GenericTypeArgument__Group_1__1__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__2__Impl_in_rule__GenericTypeArgument__Group_1__23174 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__3_in_rule__GenericTypeArgument__Group_1__23177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1_2__0_in_rule__GenericTypeArgument__Group_1__2__Impl3204 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__3__Impl_in_rule__GenericTypeArgument__Group_1__33235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GenericTypeArgument__Group_1__3__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1_2__0__Impl_in_rule__GenericTypeArgument__Group_1_2__03302 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1_2__1_in_rule__GenericTypeArgument__Group_1_2__03305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GenericTypeArgument__Group_1_2__0__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1_2__1__Impl_in_rule__GenericTypeArgument__Group_1_2__13364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__ArgumentsAssignment_1_2_1_in_rule__GenericTypeArgument__Group_1_2__1__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__0__Impl_in_rule__CommandDef__Group__03425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__1_in_rule__CommandDef__Group__03428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CommandDef__Group__0__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__1__Impl_in_rule__CommandDef__Group__13487 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__2_in_rule__CommandDef__Group__13490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__NameAssignment_1_in_rule__CommandDef__Group__1__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__2__Impl_in_rule__CommandDef__Group__23547 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__3_in_rule__CommandDef__Group__23550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group_2__0_in_rule__CommandDef__Group__2__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__3__Impl_in_rule__CommandDef__Group__33608 = new BitSet(new long[]{0x0000000100001030L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__4_in_rule__CommandDef__Group__33611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CommandDef__Group__3__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group__4__Impl_in_rule__CommandDef__Group__43670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Alternatives_4_in_rule__CommandDef__Group__4__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group_2__0__Impl_in_rule__CommandDef__Group_2__03737 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_rule__CommandDef__Group_2__1_in_rule__CommandDef__Group_2__03740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CommandDef__Group_2__0__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__Group_2__1__Impl_in_rule__CommandDef__Group_2__13799 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CommandDef__Group_2__2_in_rule__CommandDef__Group_2__13802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandDef__AttributesAssignment_2_1_in_rule__CommandDef__Group_2__1__Impl3831 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__CommandDef__AttributesAssignment_2_1_in_rule__CommandDef__Group_2__1__Impl3843 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__CommandDef__Group_2__2__Impl_in_rule__CommandDef__Group_2__23876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CommandDef__Group_2__2__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDef__Group__0__Impl_in_rule__EventDef__Group__03941 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__EventDef__Group__1_in_rule__EventDef__Group__03944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDef__DocumentationAssignment_0_in_rule__EventDef__Group__0__Impl3971 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EventDef__Group__1__Impl_in_rule__EventDef__Group__14002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDef__Group__2_in_rule__EventDef__Group__14005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EventDef__Group__1__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDef__Group__2__Impl_in_rule__EventDef__Group__24064 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_rule__EventDef__Group__3_in_rule__EventDef__Group__24067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDef__NameAssignment_2_in_rule__EventDef__Group__2__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDef__Group__3__Impl_in_rule__EventDef__Group__34124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDef__TypeAssignment_3_in_rule__EventDef__Group__3__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04189 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4275 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ServiceDefs__PackageNameAssignment_14439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_rule__ServiceDefs__DomainElementsAssignment_24470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandDef_in_rule__ServiceDefs__CommandListAssignment_34501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDef_in_rule__ServiceDefs__EventListAssignment_44532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__DomainElement__DocAssignment_04563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_0_14594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DomainElement__CustAssignment_1_1_04630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_1_14669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__SuperTypeAssignment_1_1_2_14704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__DomainElement__AttributesAssignment_1_1_44739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_2_14770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumVal_in_rule__DomainElement__EnumValuesAssignment_1_2_34801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_3_14832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__RealTypeAssignment_1_3_34863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__EnumVal__DocAssignment_04894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumVal__NameAssignment_14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Attribute__DocumentationAssignment_04956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Attribute__OptionalAssignment_14992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_rule__Attribute__TypeAssignment_25031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_35062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_4_15093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GenericTypeArgument__TypeAssignment_05128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_rule__GenericTypeArgument__ArgumentsAssignment_1_15163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_rule__GenericTypeArgument__ArgumentsAssignment_1_2_15194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GenericTypeArgument__ListAssignment_25230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CommandDef__NameAssignment_15269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__CommandDef__AttributesAssignment_2_15300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_rule__CommandDef__ReturnValAssignment_4_15331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__EventDef__DocumentationAssignment_05362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventDef__NameAssignment_25393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_rule__EventDef__TypeAssignment_35424 = new BitSet(new long[]{0x0000000000000002L});

}