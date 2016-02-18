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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOC", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'void'", "'package'", "'javatype'", "'{'", "'}'", "'extends'", "'('", "')'", "'alias'", "'as'", "'='", "'<'", "'>'", "','", "'command'", "'returns'", "'event'", "'.'", "'cust'", "'enum'", "'optional'", "'[]'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_DOC=6;
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
    // InternalTSSpec.g:61:1: entryRuleServiceDefs : ruleServiceDefs EOF ;
    public final void entryRuleServiceDefs() throws RecognitionException {
        try {
            // InternalTSSpec.g:62:1: ( ruleServiceDefs EOF )
            // InternalTSSpec.g:63:1: ruleServiceDefs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleServiceDefs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:70:1: ruleServiceDefs : ( ( rule__ServiceDefs__Group__0 ) ) ;
    public final void ruleServiceDefs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:74:2: ( ( ( rule__ServiceDefs__Group__0 ) ) )
            // InternalTSSpec.g:75:1: ( ( rule__ServiceDefs__Group__0 ) )
            {
            // InternalTSSpec.g:75:1: ( ( rule__ServiceDefs__Group__0 ) )
            // InternalTSSpec.g:76:1: ( rule__ServiceDefs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getGroup()); 
            }
            // InternalTSSpec.g:77:1: ( rule__ServiceDefs__Group__0 )
            // InternalTSSpec.g:77:2: rule__ServiceDefs__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:89:1: entryRuleDomainElement : ruleDomainElement EOF ;
    public final void entryRuleDomainElement() throws RecognitionException {
        try {
            // InternalTSSpec.g:90:1: ( ruleDomainElement EOF )
            // InternalTSSpec.g:91:1: ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDomainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:98:1: ruleDomainElement : ( ( rule__DomainElement__Group__0 ) ) ;
    public final void ruleDomainElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:102:2: ( ( ( rule__DomainElement__Group__0 ) ) )
            // InternalTSSpec.g:103:1: ( ( rule__DomainElement__Group__0 ) )
            {
            // InternalTSSpec.g:103:1: ( ( rule__DomainElement__Group__0 ) )
            // InternalTSSpec.g:104:1: ( rule__DomainElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getGroup()); 
            }
            // InternalTSSpec.g:105:1: ( rule__DomainElement__Group__0 )
            // InternalTSSpec.g:105:2: rule__DomainElement__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:117:1: entryRuleEnumVal : ruleEnumVal EOF ;
    public final void entryRuleEnumVal() throws RecognitionException {
        try {
            // InternalTSSpec.g:118:1: ( ruleEnumVal EOF )
            // InternalTSSpec.g:119:1: ruleEnumVal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumVal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:126:1: ruleEnumVal : ( ( rule__EnumVal__Group__0 ) ) ;
    public final void ruleEnumVal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:130:2: ( ( ( rule__EnumVal__Group__0 ) ) )
            // InternalTSSpec.g:131:1: ( ( rule__EnumVal__Group__0 ) )
            {
            // InternalTSSpec.g:131:1: ( ( rule__EnumVal__Group__0 ) )
            // InternalTSSpec.g:132:1: ( rule__EnumVal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getGroup()); 
            }
            // InternalTSSpec.g:133:1: ( rule__EnumVal__Group__0 )
            // InternalTSSpec.g:133:2: rule__EnumVal__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:145:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalTSSpec.g:146:1: ( ruleAttribute EOF )
            // InternalTSSpec.g:147:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:154:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:158:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalTSSpec.g:159:1: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalTSSpec.g:159:1: ( ( rule__Attribute__Group__0 ) )
            // InternalTSSpec.g:160:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalTSSpec.g:161:1: ( rule__Attribute__Group__0 )
            // InternalTSSpec.g:161:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:173:1: entryRuleGenericTypeArgument : ruleGenericTypeArgument EOF ;
    public final void entryRuleGenericTypeArgument() throws RecognitionException {
        try {
            // InternalTSSpec.g:174:1: ( ruleGenericTypeArgument EOF )
            // InternalTSSpec.g:175:1: ruleGenericTypeArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:182:1: ruleGenericTypeArgument : ( ( rule__GenericTypeArgument__Group__0 ) ) ;
    public final void ruleGenericTypeArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:186:2: ( ( ( rule__GenericTypeArgument__Group__0 ) ) )
            // InternalTSSpec.g:187:1: ( ( rule__GenericTypeArgument__Group__0 ) )
            {
            // InternalTSSpec.g:187:1: ( ( rule__GenericTypeArgument__Group__0 ) )
            // InternalTSSpec.g:188:1: ( rule__GenericTypeArgument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup()); 
            }
            // InternalTSSpec.g:189:1: ( rule__GenericTypeArgument__Group__0 )
            // InternalTSSpec.g:189:2: rule__GenericTypeArgument__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleServiceDef"
    // InternalTSSpec.g:201:1: entryRuleServiceDef : ruleServiceDef EOF ;
    public final void entryRuleServiceDef() throws RecognitionException {
        try {
            // InternalTSSpec.g:202:1: ( ruleServiceDef EOF )
            // InternalTSSpec.g:203:1: ruleServiceDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleServiceDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleServiceDef"


    // $ANTLR start "ruleServiceDef"
    // InternalTSSpec.g:210:1: ruleServiceDef : ( ( rule__ServiceDef__Group__0 ) ) ;
    public final void ruleServiceDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:214:2: ( ( ( rule__ServiceDef__Group__0 ) ) )
            // InternalTSSpec.g:215:1: ( ( rule__ServiceDef__Group__0 ) )
            {
            // InternalTSSpec.g:215:1: ( ( rule__ServiceDef__Group__0 ) )
            // InternalTSSpec.g:216:1: ( rule__ServiceDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getGroup()); 
            }
            // InternalTSSpec.g:217:1: ( rule__ServiceDef__Group__0 )
            // InternalTSSpec.g:217:2: rule__ServiceDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getGroup()); 
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
    // $ANTLR end "ruleServiceDef"


    // $ANTLR start "entryRuleCommandDef"
    // InternalTSSpec.g:229:1: entryRuleCommandDef : ruleCommandDef EOF ;
    public final void entryRuleCommandDef() throws RecognitionException {
        try {
            // InternalTSSpec.g:230:1: ( ruleCommandDef EOF )
            // InternalTSSpec.g:231:1: ruleCommandDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCommandDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:238:1: ruleCommandDef : ( ( rule__CommandDef__Group__0 ) ) ;
    public final void ruleCommandDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:242:2: ( ( ( rule__CommandDef__Group__0 ) ) )
            // InternalTSSpec.g:243:1: ( ( rule__CommandDef__Group__0 ) )
            {
            // InternalTSSpec.g:243:1: ( ( rule__CommandDef__Group__0 ) )
            // InternalTSSpec.g:244:1: ( rule__CommandDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getGroup()); 
            }
            // InternalTSSpec.g:245:1: ( rule__CommandDef__Group__0 )
            // InternalTSSpec.g:245:2: rule__CommandDef__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:257:1: entryRuleEventDef : ruleEventDef EOF ;
    public final void entryRuleEventDef() throws RecognitionException {
        try {
            // InternalTSSpec.g:258:1: ( ruleEventDef EOF )
            // InternalTSSpec.g:259:1: ruleEventDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:266:1: ruleEventDef : ( ( rule__EventDef__Group__0 ) ) ;
    public final void ruleEventDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:270:2: ( ( ( rule__EventDef__Group__0 ) ) )
            // InternalTSSpec.g:271:1: ( ( rule__EventDef__Group__0 ) )
            {
            // InternalTSSpec.g:271:1: ( ( rule__EventDef__Group__0 ) )
            // InternalTSSpec.g:272:1: ( rule__EventDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getGroup()); 
            }
            // InternalTSSpec.g:273:1: ( rule__EventDef__Group__0 )
            // InternalTSSpec.g:273:2: rule__EventDef__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:285:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalTSSpec.g:286:1: ( ruleQualifiedName EOF )
            // InternalTSSpec.g:287:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:294:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:298:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalTSSpec.g:299:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalTSSpec.g:299:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalTSSpec.g:300:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalTSSpec.g:301:1: ( rule__QualifiedName__Group__0 )
            // InternalTSSpec.g:301:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:313:1: rule__DomainElement__Alternatives_1 : ( ( ( rule__DomainElement__Group_1_0__0 ) ) | ( ( rule__DomainElement__Group_1_1__0 ) ) | ( ( rule__DomainElement__Group_1_2__0 ) ) | ( ( rule__DomainElement__Group_1_3__0 ) ) );
    public final void rule__DomainElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:317:1: ( ( ( rule__DomainElement__Group_1_0__0 ) ) | ( ( rule__DomainElement__Group_1_1__0 ) ) | ( ( rule__DomainElement__Group_1_2__0 ) ) | ( ( rule__DomainElement__Group_1_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            case 20:
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
                    // InternalTSSpec.g:318:1: ( ( rule__DomainElement__Group_1_0__0 ) )
                    {
                    // InternalTSSpec.g:318:1: ( ( rule__DomainElement__Group_1_0__0 ) )
                    // InternalTSSpec.g:319:1: ( rule__DomainElement__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_0()); 
                    }
                    // InternalTSSpec.g:320:1: ( rule__DomainElement__Group_1_0__0 )
                    // InternalTSSpec.g:320:2: rule__DomainElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalTSSpec.g:324:6: ( ( rule__DomainElement__Group_1_1__0 ) )
                    {
                    // InternalTSSpec.g:324:6: ( ( rule__DomainElement__Group_1_1__0 ) )
                    // InternalTSSpec.g:325:1: ( rule__DomainElement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_1()); 
                    }
                    // InternalTSSpec.g:326:1: ( rule__DomainElement__Group_1_1__0 )
                    // InternalTSSpec.g:326:2: rule__DomainElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalTSSpec.g:330:6: ( ( rule__DomainElement__Group_1_2__0 ) )
                    {
                    // InternalTSSpec.g:330:6: ( ( rule__DomainElement__Group_1_2__0 ) )
                    // InternalTSSpec.g:331:1: ( rule__DomainElement__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_2()); 
                    }
                    // InternalTSSpec.g:332:1: ( rule__DomainElement__Group_1_2__0 )
                    // InternalTSSpec.g:332:2: rule__DomainElement__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalTSSpec.g:336:6: ( ( rule__DomainElement__Group_1_3__0 ) )
                    {
                    // InternalTSSpec.g:336:6: ( ( rule__DomainElement__Group_1_3__0 ) )
                    // InternalTSSpec.g:337:1: ( rule__DomainElement__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_3()); 
                    }
                    // InternalTSSpec.g:338:1: ( rule__DomainElement__Group_1_3__0 )
                    // InternalTSSpec.g:338:2: rule__DomainElement__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__EnumVal__Alternatives_3"
    // InternalTSSpec.g:347:1: rule__EnumVal__Alternatives_3 : ( ( ( rule__EnumVal__ValueAssignment_3_0 ) ) | ( ( rule__EnumVal__IntValueAssignment_3_1 ) ) );
    public final void rule__EnumVal__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:351:1: ( ( ( rule__EnumVal__ValueAssignment_3_0 ) ) | ( ( rule__EnumVal__IntValueAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
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
                    // InternalTSSpec.g:352:1: ( ( rule__EnumVal__ValueAssignment_3_0 ) )
                    {
                    // InternalTSSpec.g:352:1: ( ( rule__EnumVal__ValueAssignment_3_0 ) )
                    // InternalTSSpec.g:353:1: ( rule__EnumVal__ValueAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumValAccess().getValueAssignment_3_0()); 
                    }
                    // InternalTSSpec.g:354:1: ( rule__EnumVal__ValueAssignment_3_0 )
                    // InternalTSSpec.g:354:2: rule__EnumVal__ValueAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumVal__ValueAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumValAccess().getValueAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTSSpec.g:358:6: ( ( rule__EnumVal__IntValueAssignment_3_1 ) )
                    {
                    // InternalTSSpec.g:358:6: ( ( rule__EnumVal__IntValueAssignment_3_1 ) )
                    // InternalTSSpec.g:359:1: ( rule__EnumVal__IntValueAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumValAccess().getIntValueAssignment_3_1()); 
                    }
                    // InternalTSSpec.g:360:1: ( rule__EnumVal__IntValueAssignment_3_1 )
                    // InternalTSSpec.g:360:2: rule__EnumVal__IntValueAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumVal__IntValueAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumValAccess().getIntValueAssignment_3_1()); 
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
    // $ANTLR end "rule__EnumVal__Alternatives_3"


    // $ANTLR start "rule__EnumVal__ValueAlternatives_3_0_0"
    // InternalTSSpec.g:369:1: rule__EnumVal__ValueAlternatives_3_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__EnumVal__ValueAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:373:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTSSpec.g:374:1: ( RULE_ID )
                    {
                    // InternalTSSpec.g:374:1: ( RULE_ID )
                    // InternalTSSpec.g:375:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumValAccess().getValueIDTerminalRuleCall_3_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumValAccess().getValueIDTerminalRuleCall_3_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTSSpec.g:380:6: ( RULE_STRING )
                    {
                    // InternalTSSpec.g:380:6: ( RULE_STRING )
                    // InternalTSSpec.g:381:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumValAccess().getValueSTRINGTerminalRuleCall_3_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumValAccess().getValueSTRINGTerminalRuleCall_3_0_0_1()); 
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
    // $ANTLR end "rule__EnumVal__ValueAlternatives_3_0_0"


    // $ANTLR start "rule__CommandDef__Alternatives_4"
    // InternalTSSpec.g:391:1: rule__CommandDef__Alternatives_4 : ( ( 'void' ) | ( ( rule__CommandDef__ReturnValAssignment_4_1 ) ) );
    public final void rule__CommandDef__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:395:1: ( ( 'void' ) | ( ( rule__CommandDef__ReturnValAssignment_4_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTSSpec.g:396:1: ( 'void' )
                    {
                    // InternalTSSpec.g:396:1: ( 'void' )
                    // InternalTSSpec.g:397:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandDefAccess().getVoidKeyword_4_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandDefAccess().getVoidKeyword_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTSSpec.g:404:6: ( ( rule__CommandDef__ReturnValAssignment_4_1 ) )
                    {
                    // InternalTSSpec.g:404:6: ( ( rule__CommandDef__ReturnValAssignment_4_1 ) )
                    // InternalTSSpec.g:405:1: ( rule__CommandDef__ReturnValAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandDefAccess().getReturnValAssignment_4_1()); 
                    }
                    // InternalTSSpec.g:406:1: ( rule__CommandDef__ReturnValAssignment_4_1 )
                    // InternalTSSpec.g:406:2: rule__CommandDef__ReturnValAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:417:1: rule__ServiceDefs__Group__0 : rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1 ;
    public final void rule__ServiceDefs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:421:1: ( rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1 )
            // InternalTSSpec.g:422:2: rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ServiceDefs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:429:1: rule__ServiceDefs__Group__0__Impl : ( 'package' ) ;
    public final void rule__ServiceDefs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:433:1: ( ( 'package' ) )
            // InternalTSSpec.g:434:1: ( 'package' )
            {
            // InternalTSSpec.g:434:1: ( 'package' )
            // InternalTSSpec.g:435:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:448:1: rule__ServiceDefs__Group__1 : rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2 ;
    public final void rule__ServiceDefs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:452:1: ( rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2 )
            // InternalTSSpec.g:453:2: rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServiceDefs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:460:1: rule__ServiceDefs__Group__1__Impl : ( ( rule__ServiceDefs__PackageNameAssignment_1 ) ) ;
    public final void rule__ServiceDefs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:464:1: ( ( ( rule__ServiceDefs__PackageNameAssignment_1 ) ) )
            // InternalTSSpec.g:465:1: ( ( rule__ServiceDefs__PackageNameAssignment_1 ) )
            {
            // InternalTSSpec.g:465:1: ( ( rule__ServiceDefs__PackageNameAssignment_1 ) )
            // InternalTSSpec.g:466:1: ( rule__ServiceDefs__PackageNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageNameAssignment_1()); 
            }
            // InternalTSSpec.g:467:1: ( rule__ServiceDefs__PackageNameAssignment_1 )
            // InternalTSSpec.g:467:2: rule__ServiceDefs__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:477:1: rule__ServiceDefs__Group__2 : rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3 ;
    public final void rule__ServiceDefs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:481:1: ( rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3 )
            // InternalTSSpec.g:482:2: rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ServiceDefs__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:489:1: rule__ServiceDefs__Group__2__Impl : ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* ) ;
    public final void rule__ServiceDefs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:493:1: ( ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* ) )
            // InternalTSSpec.g:494:1: ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* )
            {
            // InternalTSSpec.g:494:1: ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* )
            // InternalTSSpec.g:495:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getDomainElementsAssignment_2()); 
            }
            // InternalTSSpec.g:496:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_DOC||LA5_0==14||LA5_0==20||(LA5_0>=30 && LA5_0<=31)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTSSpec.g:496:2: rule__ServiceDefs__DomainElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ServiceDefs__DomainElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalTSSpec.g:506:1: rule__ServiceDefs__Group__3 : rule__ServiceDefs__Group__3__Impl ;
    public final void rule__ServiceDefs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:510:1: ( rule__ServiceDefs__Group__3__Impl )
            // InternalTSSpec.g:511:2: rule__ServiceDefs__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefs__Group__3__Impl();

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
    // InternalTSSpec.g:517:1: rule__ServiceDefs__Group__3__Impl : ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* ) ;
    public final void rule__ServiceDefs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:521:1: ( ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* ) )
            // InternalTSSpec.g:522:1: ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* )
            {
            // InternalTSSpec.g:522:1: ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* )
            // InternalTSSpec.g:523:1: ( rule__ServiceDefs__ServiceDefsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getServiceDefsAssignment_3()); 
            }
            // InternalTSSpec.g:524:1: ( rule__ServiceDefs__ServiceDefsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTSSpec.g:524:2: rule__ServiceDefs__ServiceDefsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ServiceDefs__ServiceDefsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getServiceDefsAssignment_3()); 
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


    // $ANTLR start "rule__DomainElement__Group__0"
    // InternalTSSpec.g:542:1: rule__DomainElement__Group__0 : rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1 ;
    public final void rule__DomainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:546:1: ( rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1 )
            // InternalTSSpec.g:547:2: rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DomainElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:554:1: rule__DomainElement__Group__0__Impl : ( ( rule__DomainElement__DocAssignment_0 )* ) ;
    public final void rule__DomainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:558:1: ( ( ( rule__DomainElement__DocAssignment_0 )* ) )
            // InternalTSSpec.g:559:1: ( ( rule__DomainElement__DocAssignment_0 )* )
            {
            // InternalTSSpec.g:559:1: ( ( rule__DomainElement__DocAssignment_0 )* )
            // InternalTSSpec.g:560:1: ( rule__DomainElement__DocAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getDocAssignment_0()); 
            }
            // InternalTSSpec.g:561:1: ( rule__DomainElement__DocAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DOC) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTSSpec.g:561:2: rule__DomainElement__DocAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DomainElement__DocAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalTSSpec.g:571:1: rule__DomainElement__Group__1 : rule__DomainElement__Group__1__Impl ;
    public final void rule__DomainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:575:1: ( rule__DomainElement__Group__1__Impl )
            // InternalTSSpec.g:576:2: rule__DomainElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:582:1: rule__DomainElement__Group__1__Impl : ( ( rule__DomainElement__Alternatives_1 ) ) ;
    public final void rule__DomainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:586:1: ( ( ( rule__DomainElement__Alternatives_1 ) ) )
            // InternalTSSpec.g:587:1: ( ( rule__DomainElement__Alternatives_1 ) )
            {
            // InternalTSSpec.g:587:1: ( ( rule__DomainElement__Alternatives_1 ) )
            // InternalTSSpec.g:588:1: ( rule__DomainElement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAlternatives_1()); 
            }
            // InternalTSSpec.g:589:1: ( rule__DomainElement__Alternatives_1 )
            // InternalTSSpec.g:589:2: rule__DomainElement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:603:1: rule__DomainElement__Group_1_0__0 : rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1 ;
    public final void rule__DomainElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:607:1: ( rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1 )
            // InternalTSSpec.g:608:2: rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainElement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:615:1: rule__DomainElement__Group_1_0__0__Impl : ( 'javatype' ) ;
    public final void rule__DomainElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:619:1: ( ( 'javatype' ) )
            // InternalTSSpec.g:620:1: ( 'javatype' )
            {
            // InternalTSSpec.g:620:1: ( 'javatype' )
            // InternalTSSpec.g:621:1: 'javatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getJavatypeKeyword_1_0_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:634:1: rule__DomainElement__Group_1_0__1 : rule__DomainElement__Group_1_0__1__Impl ;
    public final void rule__DomainElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:638:1: ( rule__DomainElement__Group_1_0__1__Impl )
            // InternalTSSpec.g:639:2: rule__DomainElement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:645:1: rule__DomainElement__Group_1_0__1__Impl : ( ( rule__DomainElement__NameAssignment_1_0_1 ) ) ;
    public final void rule__DomainElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:649:1: ( ( ( rule__DomainElement__NameAssignment_1_0_1 ) ) )
            // InternalTSSpec.g:650:1: ( ( rule__DomainElement__NameAssignment_1_0_1 ) )
            {
            // InternalTSSpec.g:650:1: ( ( rule__DomainElement__NameAssignment_1_0_1 ) )
            // InternalTSSpec.g:651:1: ( rule__DomainElement__NameAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_0_1()); 
            }
            // InternalTSSpec.g:652:1: ( rule__DomainElement__NameAssignment_1_0_1 )
            // InternalTSSpec.g:652:2: rule__DomainElement__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:666:1: rule__DomainElement__Group_1_1__0 : rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1 ;
    public final void rule__DomainElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:670:1: ( rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1 )
            // InternalTSSpec.g:671:2: rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainElement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:678:1: rule__DomainElement__Group_1_1__0__Impl : ( ( rule__DomainElement__CustAssignment_1_1_0 ) ) ;
    public final void rule__DomainElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:682:1: ( ( ( rule__DomainElement__CustAssignment_1_1_0 ) ) )
            // InternalTSSpec.g:683:1: ( ( rule__DomainElement__CustAssignment_1_1_0 ) )
            {
            // InternalTSSpec.g:683:1: ( ( rule__DomainElement__CustAssignment_1_1_0 ) )
            // InternalTSSpec.g:684:1: ( rule__DomainElement__CustAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustAssignment_1_1_0()); 
            }
            // InternalTSSpec.g:685:1: ( rule__DomainElement__CustAssignment_1_1_0 )
            // InternalTSSpec.g:685:2: rule__DomainElement__CustAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:695:1: rule__DomainElement__Group_1_1__1 : rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2 ;
    public final void rule__DomainElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:699:1: ( rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2 )
            // InternalTSSpec.g:700:2: rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__DomainElement__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:707:1: rule__DomainElement__Group_1_1__1__Impl : ( ( rule__DomainElement__NameAssignment_1_1_1 ) ) ;
    public final void rule__DomainElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:711:1: ( ( ( rule__DomainElement__NameAssignment_1_1_1 ) ) )
            // InternalTSSpec.g:712:1: ( ( rule__DomainElement__NameAssignment_1_1_1 ) )
            {
            // InternalTSSpec.g:712:1: ( ( rule__DomainElement__NameAssignment_1_1_1 ) )
            // InternalTSSpec.g:713:1: ( rule__DomainElement__NameAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_1_1()); 
            }
            // InternalTSSpec.g:714:1: ( rule__DomainElement__NameAssignment_1_1_1 )
            // InternalTSSpec.g:714:2: rule__DomainElement__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:724:1: rule__DomainElement__Group_1_1__2 : rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3 ;
    public final void rule__DomainElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:728:1: ( rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3 )
            // InternalTSSpec.g:729:2: rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3
            {
            pushFollow(FOLLOW_9);
            rule__DomainElement__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:736:1: rule__DomainElement__Group_1_1__2__Impl : ( ( rule__DomainElement__Group_1_1_2__0 )? ) ;
    public final void rule__DomainElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:740:1: ( ( ( rule__DomainElement__Group_1_1_2__0 )? ) )
            // InternalTSSpec.g:741:1: ( ( rule__DomainElement__Group_1_1_2__0 )? )
            {
            // InternalTSSpec.g:741:1: ( ( rule__DomainElement__Group_1_1_2__0 )? )
            // InternalTSSpec.g:742:1: ( rule__DomainElement__Group_1_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getGroup_1_1_2()); 
            }
            // InternalTSSpec.g:743:1: ( rule__DomainElement__Group_1_1_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTSSpec.g:743:2: rule__DomainElement__Group_1_1_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:753:1: rule__DomainElement__Group_1_1__3 : rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4 ;
    public final void rule__DomainElement__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:757:1: ( rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4 )
            // InternalTSSpec.g:758:2: rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4
            {
            pushFollow(FOLLOW_10);
            rule__DomainElement__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:765:1: rule__DomainElement__Group_1_1__3__Impl : ( '{' ) ;
    public final void rule__DomainElement__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:769:1: ( ( '{' ) )
            // InternalTSSpec.g:770:1: ( '{' )
            {
            // InternalTSSpec.g:770:1: ( '{' )
            // InternalTSSpec.g:771:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getLeftCurlyBracketKeyword_1_1_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:784:1: rule__DomainElement__Group_1_1__4 : rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5 ;
    public final void rule__DomainElement__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:788:1: ( rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5 )
            // InternalTSSpec.g:789:2: rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5
            {
            pushFollow(FOLLOW_10);
            rule__DomainElement__Group_1_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:796:1: rule__DomainElement__Group_1_1__4__Impl : ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* ) ;
    public final void rule__DomainElement__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:800:1: ( ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* ) )
            // InternalTSSpec.g:801:1: ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* )
            {
            // InternalTSSpec.g:801:1: ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* )
            // InternalTSSpec.g:802:1: ( rule__DomainElement__AttributesAssignment_1_1_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAttributesAssignment_1_1_4()); 
            }
            // InternalTSSpec.g:803:1: ( rule__DomainElement__AttributesAssignment_1_1_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_DOC||LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTSSpec.g:803:2: rule__DomainElement__AttributesAssignment_1_1_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DomainElement__AttributesAssignment_1_1_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTSSpec.g:813:1: rule__DomainElement__Group_1_1__5 : rule__DomainElement__Group_1_1__5__Impl ;
    public final void rule__DomainElement__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:817:1: ( rule__DomainElement__Group_1_1__5__Impl )
            // InternalTSSpec.g:818:2: rule__DomainElement__Group_1_1__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:824:1: rule__DomainElement__Group_1_1__5__Impl : ( '}' ) ;
    public final void rule__DomainElement__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:828:1: ( ( '}' ) )
            // InternalTSSpec.g:829:1: ( '}' )
            {
            // InternalTSSpec.g:829:1: ( '}' )
            // InternalTSSpec.g:830:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRightCurlyBracketKeyword_1_1_5()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:855:1: rule__DomainElement__Group_1_1_2__0 : rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1 ;
    public final void rule__DomainElement__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:859:1: ( rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1 )
            // InternalTSSpec.g:860:2: rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainElement__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:867:1: rule__DomainElement__Group_1_1_2__0__Impl : ( 'extends' ) ;
    public final void rule__DomainElement__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:871:1: ( ( 'extends' ) )
            // InternalTSSpec.g:872:1: ( 'extends' )
            {
            // InternalTSSpec.g:872:1: ( 'extends' )
            // InternalTSSpec.g:873:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getExtendsKeyword_1_1_2_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:886:1: rule__DomainElement__Group_1_1_2__1 : rule__DomainElement__Group_1_1_2__1__Impl ;
    public final void rule__DomainElement__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:890:1: ( rule__DomainElement__Group_1_1_2__1__Impl )
            // InternalTSSpec.g:891:2: rule__DomainElement__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:897:1: rule__DomainElement__Group_1_1_2__1__Impl : ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) ) ;
    public final void rule__DomainElement__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:901:1: ( ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) ) )
            // InternalTSSpec.g:902:1: ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) )
            {
            // InternalTSSpec.g:902:1: ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) )
            // InternalTSSpec.g:903:1: ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeAssignment_1_1_2_1()); 
            }
            // InternalTSSpec.g:904:1: ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 )
            // InternalTSSpec.g:904:2: rule__DomainElement__SuperTypeAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:918:1: rule__DomainElement__Group_1_2__0 : rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1 ;
    public final void rule__DomainElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:922:1: ( rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1 )
            // InternalTSSpec.g:923:2: rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainElement__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:930:1: rule__DomainElement__Group_1_2__0__Impl : ( ( rule__DomainElement__IsEnumAssignment_1_2_0 ) ) ;
    public final void rule__DomainElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:934:1: ( ( ( rule__DomainElement__IsEnumAssignment_1_2_0 ) ) )
            // InternalTSSpec.g:935:1: ( ( rule__DomainElement__IsEnumAssignment_1_2_0 ) )
            {
            // InternalTSSpec.g:935:1: ( ( rule__DomainElement__IsEnumAssignment_1_2_0 ) )
            // InternalTSSpec.g:936:1: ( rule__DomainElement__IsEnumAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getIsEnumAssignment_1_2_0()); 
            }
            // InternalTSSpec.g:937:1: ( rule__DomainElement__IsEnumAssignment_1_2_0 )
            // InternalTSSpec.g:937:2: rule__DomainElement__IsEnumAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DomainElement__IsEnumAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getIsEnumAssignment_1_2_0()); 
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
    // InternalTSSpec.g:947:1: rule__DomainElement__Group_1_2__1 : rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2 ;
    public final void rule__DomainElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:951:1: ( rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2 )
            // InternalTSSpec.g:952:2: rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2
            {
            pushFollow(FOLLOW_12);
            rule__DomainElement__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:959:1: rule__DomainElement__Group_1_2__1__Impl : ( ( rule__DomainElement__NameAssignment_1_2_1 ) ) ;
    public final void rule__DomainElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:963:1: ( ( ( rule__DomainElement__NameAssignment_1_2_1 ) ) )
            // InternalTSSpec.g:964:1: ( ( rule__DomainElement__NameAssignment_1_2_1 ) )
            {
            // InternalTSSpec.g:964:1: ( ( rule__DomainElement__NameAssignment_1_2_1 ) )
            // InternalTSSpec.g:965:1: ( rule__DomainElement__NameAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_2_1()); 
            }
            // InternalTSSpec.g:966:1: ( rule__DomainElement__NameAssignment_1_2_1 )
            // InternalTSSpec.g:966:2: rule__DomainElement__NameAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:976:1: rule__DomainElement__Group_1_2__2 : rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3 ;
    public final void rule__DomainElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:980:1: ( rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3 )
            // InternalTSSpec.g:981:2: rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3
            {
            pushFollow(FOLLOW_13);
            rule__DomainElement__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:988:1: rule__DomainElement__Group_1_2__2__Impl : ( '(' ) ;
    public final void rule__DomainElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:992:1: ( ( '(' ) )
            // InternalTSSpec.g:993:1: ( '(' )
            {
            // InternalTSSpec.g:993:1: ( '(' )
            // InternalTSSpec.g:994:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getLeftParenthesisKeyword_1_2_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:1007:1: rule__DomainElement__Group_1_2__3 : rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4 ;
    public final void rule__DomainElement__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1011:1: ( rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4 )
            // InternalTSSpec.g:1012:2: rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4
            {
            pushFollow(FOLLOW_13);
            rule__DomainElement__Group_1_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1019:1: rule__DomainElement__Group_1_2__3__Impl : ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* ) ;
    public final void rule__DomainElement__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1023:1: ( ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* ) )
            // InternalTSSpec.g:1024:1: ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* )
            {
            // InternalTSSpec.g:1024:1: ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* )
            // InternalTSSpec.g:1025:1: ( rule__DomainElement__EnumValuesAssignment_1_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumValuesAssignment_1_2_3()); 
            }
            // InternalTSSpec.g:1026:1: ( rule__DomainElement__EnumValuesAssignment_1_2_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_DOC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTSSpec.g:1026:2: rule__DomainElement__EnumValuesAssignment_1_2_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DomainElement__EnumValuesAssignment_1_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTSSpec.g:1036:1: rule__DomainElement__Group_1_2__4 : rule__DomainElement__Group_1_2__4__Impl ;
    public final void rule__DomainElement__Group_1_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1040:1: ( rule__DomainElement__Group_1_2__4__Impl )
            // InternalTSSpec.g:1041:2: rule__DomainElement__Group_1_2__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1047:1: rule__DomainElement__Group_1_2__4__Impl : ( ')' ) ;
    public final void rule__DomainElement__Group_1_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1051:1: ( ( ')' ) )
            // InternalTSSpec.g:1052:1: ( ')' )
            {
            // InternalTSSpec.g:1052:1: ( ')' )
            // InternalTSSpec.g:1053:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRightParenthesisKeyword_1_2_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:1076:1: rule__DomainElement__Group_1_3__0 : rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1 ;
    public final void rule__DomainElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1080:1: ( rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1 )
            // InternalTSSpec.g:1081:2: rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainElement__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1088:1: rule__DomainElement__Group_1_3__0__Impl : ( 'alias' ) ;
    public final void rule__DomainElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1092:1: ( ( 'alias' ) )
            // InternalTSSpec.g:1093:1: ( 'alias' )
            {
            // InternalTSSpec.g:1093:1: ( 'alias' )
            // InternalTSSpec.g:1094:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAliasKeyword_1_3_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:1107:1: rule__DomainElement__Group_1_3__1 : rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2 ;
    public final void rule__DomainElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1111:1: ( rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2 )
            // InternalTSSpec.g:1112:2: rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2
            {
            pushFollow(FOLLOW_15);
            rule__DomainElement__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1119:1: rule__DomainElement__Group_1_3__1__Impl : ( ( rule__DomainElement__NameAssignment_1_3_1 ) ) ;
    public final void rule__DomainElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1123:1: ( ( ( rule__DomainElement__NameAssignment_1_3_1 ) ) )
            // InternalTSSpec.g:1124:1: ( ( rule__DomainElement__NameAssignment_1_3_1 ) )
            {
            // InternalTSSpec.g:1124:1: ( ( rule__DomainElement__NameAssignment_1_3_1 ) )
            // InternalTSSpec.g:1125:1: ( rule__DomainElement__NameAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_3_1()); 
            }
            // InternalTSSpec.g:1126:1: ( rule__DomainElement__NameAssignment_1_3_1 )
            // InternalTSSpec.g:1126:2: rule__DomainElement__NameAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1136:1: rule__DomainElement__Group_1_3__2 : rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3 ;
    public final void rule__DomainElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1140:1: ( rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3 )
            // InternalTSSpec.g:1141:2: rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3
            {
            pushFollow(FOLLOW_3);
            rule__DomainElement__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1148:1: rule__DomainElement__Group_1_3__2__Impl : ( 'as' ) ;
    public final void rule__DomainElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1152:1: ( ( 'as' ) )
            // InternalTSSpec.g:1153:1: ( 'as' )
            {
            // InternalTSSpec.g:1153:1: ( 'as' )
            // InternalTSSpec.g:1154:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAsKeyword_1_3_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:1167:1: rule__DomainElement__Group_1_3__3 : rule__DomainElement__Group_1_3__3__Impl ;
    public final void rule__DomainElement__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1171:1: ( rule__DomainElement__Group_1_3__3__Impl )
            // InternalTSSpec.g:1172:2: rule__DomainElement__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1178:1: rule__DomainElement__Group_1_3__3__Impl : ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) ) ;
    public final void rule__DomainElement__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1182:1: ( ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) ) )
            // InternalTSSpec.g:1183:1: ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) )
            {
            // InternalTSSpec.g:1183:1: ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) )
            // InternalTSSpec.g:1184:1: ( rule__DomainElement__RealTypeAssignment_1_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRealTypeAssignment_1_3_3()); 
            }
            // InternalTSSpec.g:1185:1: ( rule__DomainElement__RealTypeAssignment_1_3_3 )
            // InternalTSSpec.g:1185:2: rule__DomainElement__RealTypeAssignment_1_3_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1203:1: rule__EnumVal__Group__0 : rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1 ;
    public final void rule__EnumVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1207:1: ( rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1 )
            // InternalTSSpec.g:1208:2: rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EnumVal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1215:1: rule__EnumVal__Group__0__Impl : ( ( rule__EnumVal__DocAssignment_0 )* ) ;
    public final void rule__EnumVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1219:1: ( ( ( rule__EnumVal__DocAssignment_0 )* ) )
            // InternalTSSpec.g:1220:1: ( ( rule__EnumVal__DocAssignment_0 )* )
            {
            // InternalTSSpec.g:1220:1: ( ( rule__EnumVal__DocAssignment_0 )* )
            // InternalTSSpec.g:1221:1: ( rule__EnumVal__DocAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getDocAssignment_0()); 
            }
            // InternalTSSpec.g:1222:1: ( rule__EnumVal__DocAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTSSpec.g:1222:2: rule__EnumVal__DocAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EnumVal__DocAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTSSpec.g:1232:1: rule__EnumVal__Group__1 : rule__EnumVal__Group__1__Impl rule__EnumVal__Group__2 ;
    public final void rule__EnumVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1236:1: ( rule__EnumVal__Group__1__Impl rule__EnumVal__Group__2 )
            // InternalTSSpec.g:1237:2: rule__EnumVal__Group__1__Impl rule__EnumVal__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EnumVal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumVal__Group__2();

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
    // InternalTSSpec.g:1244:1: rule__EnumVal__Group__1__Impl : ( ( rule__EnumVal__NameAssignment_1 ) ) ;
    public final void rule__EnumVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1248:1: ( ( ( rule__EnumVal__NameAssignment_1 ) ) )
            // InternalTSSpec.g:1249:1: ( ( rule__EnumVal__NameAssignment_1 ) )
            {
            // InternalTSSpec.g:1249:1: ( ( rule__EnumVal__NameAssignment_1 ) )
            // InternalTSSpec.g:1250:1: ( rule__EnumVal__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getNameAssignment_1()); 
            }
            // InternalTSSpec.g:1251:1: ( rule__EnumVal__NameAssignment_1 )
            // InternalTSSpec.g:1251:2: rule__EnumVal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__EnumVal__Group__2"
    // InternalTSSpec.g:1261:1: rule__EnumVal__Group__2 : rule__EnumVal__Group__2__Impl rule__EnumVal__Group__3 ;
    public final void rule__EnumVal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1265:1: ( rule__EnumVal__Group__2__Impl rule__EnumVal__Group__3 )
            // InternalTSSpec.g:1266:2: rule__EnumVal__Group__2__Impl rule__EnumVal__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EnumVal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumVal__Group__3();

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
    // $ANTLR end "rule__EnumVal__Group__2"


    // $ANTLR start "rule__EnumVal__Group__2__Impl"
    // InternalTSSpec.g:1273:1: rule__EnumVal__Group__2__Impl : ( '=' ) ;
    public final void rule__EnumVal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1277:1: ( ( '=' ) )
            // InternalTSSpec.g:1278:1: ( '=' )
            {
            // InternalTSSpec.g:1278:1: ( '=' )
            // InternalTSSpec.g:1279:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getEqualsSignKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__EnumVal__Group__2__Impl"


    // $ANTLR start "rule__EnumVal__Group__3"
    // InternalTSSpec.g:1292:1: rule__EnumVal__Group__3 : rule__EnumVal__Group__3__Impl ;
    public final void rule__EnumVal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1296:1: ( rule__EnumVal__Group__3__Impl )
            // InternalTSSpec.g:1297:2: rule__EnumVal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumVal__Group__3__Impl();

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
    // $ANTLR end "rule__EnumVal__Group__3"


    // $ANTLR start "rule__EnumVal__Group__3__Impl"
    // InternalTSSpec.g:1303:1: rule__EnumVal__Group__3__Impl : ( ( rule__EnumVal__Alternatives_3 ) ) ;
    public final void rule__EnumVal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1307:1: ( ( ( rule__EnumVal__Alternatives_3 ) ) )
            // InternalTSSpec.g:1308:1: ( ( rule__EnumVal__Alternatives_3 ) )
            {
            // InternalTSSpec.g:1308:1: ( ( rule__EnumVal__Alternatives_3 ) )
            // InternalTSSpec.g:1309:1: ( rule__EnumVal__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getAlternatives_3()); 
            }
            // InternalTSSpec.g:1310:1: ( rule__EnumVal__Alternatives_3 )
            // InternalTSSpec.g:1310:2: rule__EnumVal__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumVal__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__EnumVal__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalTSSpec.g:1328:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1332:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalTSSpec.g:1333:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1340:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DocumentationAssignment_0 )* ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1344:1: ( ( ( rule__Attribute__DocumentationAssignment_0 )* ) )
            // InternalTSSpec.g:1345:1: ( ( rule__Attribute__DocumentationAssignment_0 )* )
            {
            // InternalTSSpec.g:1345:1: ( ( rule__Attribute__DocumentationAssignment_0 )* )
            // InternalTSSpec.g:1346:1: ( rule__Attribute__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDocumentationAssignment_0()); 
            }
            // InternalTSSpec.g:1347:1: ( rule__Attribute__DocumentationAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DOC) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTSSpec.g:1347:2: rule__Attribute__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Attribute__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalTSSpec.g:1357:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1361:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalTSSpec.g:1362:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1369:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__OptionalAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1373:1: ( ( ( rule__Attribute__OptionalAssignment_1 )? ) )
            // InternalTSSpec.g:1374:1: ( ( rule__Attribute__OptionalAssignment_1 )? )
            {
            // InternalTSSpec.g:1374:1: ( ( rule__Attribute__OptionalAssignment_1 )? )
            // InternalTSSpec.g:1375:1: ( rule__Attribute__OptionalAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalAssignment_1()); 
            }
            // InternalTSSpec.g:1376:1: ( rule__Attribute__OptionalAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTSSpec.g:1376:2: rule__Attribute__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1386:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1390:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalTSSpec.g:1391:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1398:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1402:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalTSSpec.g:1403:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalTSSpec.g:1403:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalTSSpec.g:1404:1: ( rule__Attribute__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            }
            // InternalTSSpec.g:1405:1: ( rule__Attribute__TypeAssignment_2 )
            // InternalTSSpec.g:1405:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1415:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1419:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalTSSpec.g:1420:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1427:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1431:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalTSSpec.g:1432:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalTSSpec.g:1432:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalTSSpec.g:1433:1: ( rule__Attribute__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            }
            // InternalTSSpec.g:1434:1: ( rule__Attribute__NameAssignment_3 )
            // InternalTSSpec.g:1434:2: rule__Attribute__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1444:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1448:1: ( rule__Attribute__Group__4__Impl )
            // InternalTSSpec.g:1449:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1455:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1459:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // InternalTSSpec.g:1460:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // InternalTSSpec.g:1460:1: ( ( rule__Attribute__Group_4__0 )? )
            // InternalTSSpec.g:1461:1: ( rule__Attribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4()); 
            }
            // InternalTSSpec.g:1462:1: ( rule__Attribute__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTSSpec.g:1462:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1482:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1486:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // InternalTSSpec.g:1487:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1494:1: rule__Attribute__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1498:1: ( ( '=' ) )
            // InternalTSSpec.g:1499:1: ( '=' )
            {
            // InternalTSSpec.g:1499:1: ( '=' )
            // InternalTSSpec.g:1500:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:1513:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1517:1: ( rule__Attribute__Group_4__1__Impl )
            // InternalTSSpec.g:1518:2: rule__Attribute__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1524:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__ValueAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1528:1: ( ( ( rule__Attribute__ValueAssignment_4_1 ) ) )
            // InternalTSSpec.g:1529:1: ( ( rule__Attribute__ValueAssignment_4_1 ) )
            {
            // InternalTSSpec.g:1529:1: ( ( rule__Attribute__ValueAssignment_4_1 ) )
            // InternalTSSpec.g:1530:1: ( rule__Attribute__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_4_1()); 
            }
            // InternalTSSpec.g:1531:1: ( rule__Attribute__ValueAssignment_4_1 )
            // InternalTSSpec.g:1531:2: rule__Attribute__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1545:1: rule__GenericTypeArgument__Group__0 : rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1 ;
    public final void rule__GenericTypeArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1549:1: ( rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1 )
            // InternalTSSpec.g:1550:2: rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__GenericTypeArgument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1557:1: rule__GenericTypeArgument__Group__0__Impl : ( ( rule__GenericTypeArgument__TypeAssignment_0 ) ) ;
    public final void rule__GenericTypeArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1561:1: ( ( ( rule__GenericTypeArgument__TypeAssignment_0 ) ) )
            // InternalTSSpec.g:1562:1: ( ( rule__GenericTypeArgument__TypeAssignment_0 ) )
            {
            // InternalTSSpec.g:1562:1: ( ( rule__GenericTypeArgument__TypeAssignment_0 ) )
            // InternalTSSpec.g:1563:1: ( rule__GenericTypeArgument__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeAssignment_0()); 
            }
            // InternalTSSpec.g:1564:1: ( rule__GenericTypeArgument__TypeAssignment_0 )
            // InternalTSSpec.g:1564:2: rule__GenericTypeArgument__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1574:1: rule__GenericTypeArgument__Group__1 : rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2 ;
    public final void rule__GenericTypeArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1578:1: ( rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2 )
            // InternalTSSpec.g:1579:2: rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__GenericTypeArgument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1586:1: rule__GenericTypeArgument__Group__1__Impl : ( ( rule__GenericTypeArgument__Group_1__0 )? ) ;
    public final void rule__GenericTypeArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1590:1: ( ( ( rule__GenericTypeArgument__Group_1__0 )? ) )
            // InternalTSSpec.g:1591:1: ( ( rule__GenericTypeArgument__Group_1__0 )? )
            {
            // InternalTSSpec.g:1591:1: ( ( rule__GenericTypeArgument__Group_1__0 )? )
            // InternalTSSpec.g:1592:1: ( rule__GenericTypeArgument__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup_1()); 
            }
            // InternalTSSpec.g:1593:1: ( rule__GenericTypeArgument__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTSSpec.g:1593:2: rule__GenericTypeArgument__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1603:1: rule__GenericTypeArgument__Group__2 : rule__GenericTypeArgument__Group__2__Impl ;
    public final void rule__GenericTypeArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1607:1: ( rule__GenericTypeArgument__Group__2__Impl )
            // InternalTSSpec.g:1608:2: rule__GenericTypeArgument__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1614:1: rule__GenericTypeArgument__Group__2__Impl : ( ( rule__GenericTypeArgument__ListAssignment_2 )? ) ;
    public final void rule__GenericTypeArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1618:1: ( ( ( rule__GenericTypeArgument__ListAssignment_2 )? ) )
            // InternalTSSpec.g:1619:1: ( ( rule__GenericTypeArgument__ListAssignment_2 )? )
            {
            // InternalTSSpec.g:1619:1: ( ( rule__GenericTypeArgument__ListAssignment_2 )? )
            // InternalTSSpec.g:1620:1: ( rule__GenericTypeArgument__ListAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListAssignment_2()); 
            }
            // InternalTSSpec.g:1621:1: ( rule__GenericTypeArgument__ListAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTSSpec.g:1621:2: rule__GenericTypeArgument__ListAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1637:1: rule__GenericTypeArgument__Group_1__0 : rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1 ;
    public final void rule__GenericTypeArgument__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1641:1: ( rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1 )
            // InternalTSSpec.g:1642:2: rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__GenericTypeArgument__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1649:1: rule__GenericTypeArgument__Group_1__0__Impl : ( '<' ) ;
    public final void rule__GenericTypeArgument__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1653:1: ( ( '<' ) )
            // InternalTSSpec.g:1654:1: ( '<' )
            {
            // InternalTSSpec.g:1654:1: ( '<' )
            // InternalTSSpec.g:1655:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:1668:1: rule__GenericTypeArgument__Group_1__1 : rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2 ;
    public final void rule__GenericTypeArgument__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1672:1: ( rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2 )
            // InternalTSSpec.g:1673:2: rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__GenericTypeArgument__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1680:1: rule__GenericTypeArgument__Group_1__1__Impl : ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__GenericTypeArgument__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1684:1: ( ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) ) )
            // InternalTSSpec.g:1685:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) )
            {
            // InternalTSSpec.g:1685:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) )
            // InternalTSSpec.g:1686:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_1()); 
            }
            // InternalTSSpec.g:1687:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 )
            // InternalTSSpec.g:1687:2: rule__GenericTypeArgument__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1697:1: rule__GenericTypeArgument__Group_1__2 : rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3 ;
    public final void rule__GenericTypeArgument__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1701:1: ( rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3 )
            // InternalTSSpec.g:1702:2: rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3
            {
            pushFollow(FOLLOW_22);
            rule__GenericTypeArgument__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1709:1: rule__GenericTypeArgument__Group_1__2__Impl : ( ( rule__GenericTypeArgument__Group_1_2__0 )* ) ;
    public final void rule__GenericTypeArgument__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1713:1: ( ( ( rule__GenericTypeArgument__Group_1_2__0 )* ) )
            // InternalTSSpec.g:1714:1: ( ( rule__GenericTypeArgument__Group_1_2__0 )* )
            {
            // InternalTSSpec.g:1714:1: ( ( rule__GenericTypeArgument__Group_1_2__0 )* )
            // InternalTSSpec.g:1715:1: ( rule__GenericTypeArgument__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup_1_2()); 
            }
            // InternalTSSpec.g:1716:1: ( rule__GenericTypeArgument__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTSSpec.g:1716:2: rule__GenericTypeArgument__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__GenericTypeArgument__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalTSSpec.g:1726:1: rule__GenericTypeArgument__Group_1__3 : rule__GenericTypeArgument__Group_1__3__Impl ;
    public final void rule__GenericTypeArgument__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1730:1: ( rule__GenericTypeArgument__Group_1__3__Impl )
            // InternalTSSpec.g:1731:2: rule__GenericTypeArgument__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1737:1: rule__GenericTypeArgument__Group_1__3__Impl : ( '>' ) ;
    public final void rule__GenericTypeArgument__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1741:1: ( ( '>' ) )
            // InternalTSSpec.g:1742:1: ( '>' )
            {
            // InternalTSSpec.g:1742:1: ( '>' )
            // InternalTSSpec.g:1743:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:1764:1: rule__GenericTypeArgument__Group_1_2__0 : rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1 ;
    public final void rule__GenericTypeArgument__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1768:1: ( rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1 )
            // InternalTSSpec.g:1769:2: rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1
            {
            pushFollow(FOLLOW_19);
            rule__GenericTypeArgument__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1776:1: rule__GenericTypeArgument__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__GenericTypeArgument__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1780:1: ( ( ',' ) )
            // InternalTSSpec.g:1781:1: ( ',' )
            {
            // InternalTSSpec.g:1781:1: ( ',' )
            // InternalTSSpec.g:1782:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:1795:1: rule__GenericTypeArgument__Group_1_2__1 : rule__GenericTypeArgument__Group_1_2__1__Impl ;
    public final void rule__GenericTypeArgument__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1799:1: ( rule__GenericTypeArgument__Group_1_2__1__Impl )
            // InternalTSSpec.g:1800:2: rule__GenericTypeArgument__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1806:1: rule__GenericTypeArgument__Group_1_2__1__Impl : ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__GenericTypeArgument__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1810:1: ( ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) ) )
            // InternalTSSpec.g:1811:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalTSSpec.g:1811:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) )
            // InternalTSSpec.g:1812:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_2_1()); 
            }
            // InternalTSSpec.g:1813:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 )
            // InternalTSSpec.g:1813:2: rule__GenericTypeArgument__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__ServiceDef__Group__0"
    // InternalTSSpec.g:1827:1: rule__ServiceDef__Group__0 : rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1 ;
    public final void rule__ServiceDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1831:1: ( rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1 )
            // InternalTSSpec.g:1832:2: rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ServiceDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ServiceDef__Group__1();

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
    // $ANTLR end "rule__ServiceDef__Group__0"


    // $ANTLR start "rule__ServiceDef__Group__0__Impl"
    // InternalTSSpec.g:1839:1: rule__ServiceDef__Group__0__Impl : ( ( rule__ServiceDef__NameAssignment_0 ) ) ;
    public final void rule__ServiceDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1843:1: ( ( ( rule__ServiceDef__NameAssignment_0 ) ) )
            // InternalTSSpec.g:1844:1: ( ( rule__ServiceDef__NameAssignment_0 ) )
            {
            // InternalTSSpec.g:1844:1: ( ( rule__ServiceDef__NameAssignment_0 ) )
            // InternalTSSpec.g:1845:1: ( rule__ServiceDef__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getNameAssignment_0()); 
            }
            // InternalTSSpec.g:1846:1: ( rule__ServiceDef__NameAssignment_0 )
            // InternalTSSpec.g:1846:2: rule__ServiceDef__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDef__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__ServiceDef__Group__0__Impl"


    // $ANTLR start "rule__ServiceDef__Group__1"
    // InternalTSSpec.g:1856:1: rule__ServiceDef__Group__1 : rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2 ;
    public final void rule__ServiceDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1860:1: ( rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2 )
            // InternalTSSpec.g:1861:2: rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ServiceDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ServiceDef__Group__2();

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
    // $ANTLR end "rule__ServiceDef__Group__1"


    // $ANTLR start "rule__ServiceDef__Group__1__Impl"
    // InternalTSSpec.g:1868:1: rule__ServiceDef__Group__1__Impl : ( '{' ) ;
    public final void rule__ServiceDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1872:1: ( ( '{' ) )
            // InternalTSSpec.g:1873:1: ( '{' )
            {
            // InternalTSSpec.g:1873:1: ( '{' )
            // InternalTSSpec.g:1874:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__ServiceDef__Group__1__Impl"


    // $ANTLR start "rule__ServiceDef__Group__2"
    // InternalTSSpec.g:1887:1: rule__ServiceDef__Group__2 : rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3 ;
    public final void rule__ServiceDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1891:1: ( rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3 )
            // InternalTSSpec.g:1892:2: rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ServiceDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ServiceDef__Group__3();

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
    // $ANTLR end "rule__ServiceDef__Group__2"


    // $ANTLR start "rule__ServiceDef__Group__2__Impl"
    // InternalTSSpec.g:1899:1: rule__ServiceDef__Group__2__Impl : ( ( rule__ServiceDef__CommandListAssignment_2 )* ) ;
    public final void rule__ServiceDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1903:1: ( ( ( rule__ServiceDef__CommandListAssignment_2 )* ) )
            // InternalTSSpec.g:1904:1: ( ( rule__ServiceDef__CommandListAssignment_2 )* )
            {
            // InternalTSSpec.g:1904:1: ( ( rule__ServiceDef__CommandListAssignment_2 )* )
            // InternalTSSpec.g:1905:1: ( rule__ServiceDef__CommandListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getCommandListAssignment_2()); 
            }
            // InternalTSSpec.g:1906:1: ( rule__ServiceDef__CommandListAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTSSpec.g:1906:2: rule__ServiceDef__CommandListAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ServiceDef__CommandListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getCommandListAssignment_2()); 
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
    // $ANTLR end "rule__ServiceDef__Group__2__Impl"


    // $ANTLR start "rule__ServiceDef__Group__3"
    // InternalTSSpec.g:1916:1: rule__ServiceDef__Group__3 : rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4 ;
    public final void rule__ServiceDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1920:1: ( rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4 )
            // InternalTSSpec.g:1921:2: rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ServiceDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ServiceDef__Group__4();

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
    // $ANTLR end "rule__ServiceDef__Group__3"


    // $ANTLR start "rule__ServiceDef__Group__3__Impl"
    // InternalTSSpec.g:1928:1: rule__ServiceDef__Group__3__Impl : ( ( rule__ServiceDef__EventListAssignment_3 )* ) ;
    public final void rule__ServiceDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1932:1: ( ( ( rule__ServiceDef__EventListAssignment_3 )* ) )
            // InternalTSSpec.g:1933:1: ( ( rule__ServiceDef__EventListAssignment_3 )* )
            {
            // InternalTSSpec.g:1933:1: ( ( rule__ServiceDef__EventListAssignment_3 )* )
            // InternalTSSpec.g:1934:1: ( rule__ServiceDef__EventListAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getEventListAssignment_3()); 
            }
            // InternalTSSpec.g:1935:1: ( rule__ServiceDef__EventListAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOC||LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTSSpec.g:1935:2: rule__ServiceDef__EventListAssignment_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ServiceDef__EventListAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getEventListAssignment_3()); 
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
    // $ANTLR end "rule__ServiceDef__Group__3__Impl"


    // $ANTLR start "rule__ServiceDef__Group__4"
    // InternalTSSpec.g:1945:1: rule__ServiceDef__Group__4 : rule__ServiceDef__Group__4__Impl ;
    public final void rule__ServiceDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1949:1: ( rule__ServiceDef__Group__4__Impl )
            // InternalTSSpec.g:1950:2: rule__ServiceDef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDef__Group__4__Impl();

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
    // $ANTLR end "rule__ServiceDef__Group__4"


    // $ANTLR start "rule__ServiceDef__Group__4__Impl"
    // InternalTSSpec.g:1956:1: rule__ServiceDef__Group__4__Impl : ( '}' ) ;
    public final void rule__ServiceDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1960:1: ( ( '}' ) )
            // InternalTSSpec.g:1961:1: ( '}' )
            {
            // InternalTSSpec.g:1961:1: ( '}' )
            // InternalTSSpec.g:1962:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__ServiceDef__Group__4__Impl"


    // $ANTLR start "rule__CommandDef__Group__0"
    // InternalTSSpec.g:1985:1: rule__CommandDef__Group__0 : rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1 ;
    public final void rule__CommandDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1989:1: ( rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1 )
            // InternalTSSpec.g:1990:2: rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CommandDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:1997:1: rule__CommandDef__Group__0__Impl : ( 'command' ) ;
    public final void rule__CommandDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2001:1: ( ( 'command' ) )
            // InternalTSSpec.g:2002:1: ( 'command' )
            {
            // InternalTSSpec.g:2002:1: ( 'command' )
            // InternalTSSpec.g:2003:1: 'command'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getCommandKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2016:1: rule__CommandDef__Group__1 : rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2 ;
    public final void rule__CommandDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2020:1: ( rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2 )
            // InternalTSSpec.g:2021:2: rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__CommandDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2028:1: rule__CommandDef__Group__1__Impl : ( ( rule__CommandDef__NameAssignment_1 ) ) ;
    public final void rule__CommandDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2032:1: ( ( ( rule__CommandDef__NameAssignment_1 ) ) )
            // InternalTSSpec.g:2033:1: ( ( rule__CommandDef__NameAssignment_1 ) )
            {
            // InternalTSSpec.g:2033:1: ( ( rule__CommandDef__NameAssignment_1 ) )
            // InternalTSSpec.g:2034:1: ( rule__CommandDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getNameAssignment_1()); 
            }
            // InternalTSSpec.g:2035:1: ( rule__CommandDef__NameAssignment_1 )
            // InternalTSSpec.g:2035:2: rule__CommandDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2045:1: rule__CommandDef__Group__2 : rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3 ;
    public final void rule__CommandDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2049:1: ( rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3 )
            // InternalTSSpec.g:2050:2: rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__CommandDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2057:1: rule__CommandDef__Group__2__Impl : ( ( rule__CommandDef__Group_2__0 )? ) ;
    public final void rule__CommandDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2061:1: ( ( ( rule__CommandDef__Group_2__0 )? ) )
            // InternalTSSpec.g:2062:1: ( ( rule__CommandDef__Group_2__0 )? )
            {
            // InternalTSSpec.g:2062:1: ( ( rule__CommandDef__Group_2__0 )? )
            // InternalTSSpec.g:2063:1: ( rule__CommandDef__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getGroup_2()); 
            }
            // InternalTSSpec.g:2064:1: ( rule__CommandDef__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTSSpec.g:2064:2: rule__CommandDef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2074:1: rule__CommandDef__Group__3 : rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4 ;
    public final void rule__CommandDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2078:1: ( rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4 )
            // InternalTSSpec.g:2079:2: rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__CommandDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2086:1: rule__CommandDef__Group__3__Impl : ( 'returns' ) ;
    public final void rule__CommandDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2090:1: ( ( 'returns' ) )
            // InternalTSSpec.g:2091:1: ( 'returns' )
            {
            // InternalTSSpec.g:2091:1: ( 'returns' )
            // InternalTSSpec.g:2092:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getReturnsKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2105:1: rule__CommandDef__Group__4 : rule__CommandDef__Group__4__Impl ;
    public final void rule__CommandDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2109:1: ( rule__CommandDef__Group__4__Impl )
            // InternalTSSpec.g:2110:2: rule__CommandDef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2116:1: rule__CommandDef__Group__4__Impl : ( ( rule__CommandDef__Alternatives_4 ) ) ;
    public final void rule__CommandDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2120:1: ( ( ( rule__CommandDef__Alternatives_4 ) ) )
            // InternalTSSpec.g:2121:1: ( ( rule__CommandDef__Alternatives_4 ) )
            {
            // InternalTSSpec.g:2121:1: ( ( rule__CommandDef__Alternatives_4 ) )
            // InternalTSSpec.g:2122:1: ( rule__CommandDef__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAlternatives_4()); 
            }
            // InternalTSSpec.g:2123:1: ( rule__CommandDef__Alternatives_4 )
            // InternalTSSpec.g:2123:2: rule__CommandDef__Alternatives_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2143:1: rule__CommandDef__Group_2__0 : rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1 ;
    public final void rule__CommandDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2147:1: ( rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1 )
            // InternalTSSpec.g:2148:2: rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__CommandDef__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2155:1: rule__CommandDef__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CommandDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2159:1: ( ( '(' ) )
            // InternalTSSpec.g:2160:1: ( '(' )
            {
            // InternalTSSpec.g:2160:1: ( '(' )
            // InternalTSSpec.g:2161:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2174:1: rule__CommandDef__Group_2__1 : rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2 ;
    public final void rule__CommandDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2178:1: ( rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2 )
            // InternalTSSpec.g:2179:2: rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2
            {
            pushFollow(FOLLOW_30);
            rule__CommandDef__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2186:1: rule__CommandDef__Group_2__1__Impl : ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) ) ;
    public final void rule__CommandDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2190:1: ( ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) ) )
            // InternalTSSpec.g:2191:1: ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) )
            {
            // InternalTSSpec.g:2191:1: ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) )
            // InternalTSSpec.g:2192:1: ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* )
            {
            // InternalTSSpec.g:2192:1: ( ( rule__CommandDef__AttributesAssignment_2_1 ) )
            // InternalTSSpec.g:2193:1: ( rule__CommandDef__AttributesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }
            // InternalTSSpec.g:2194:1: ( rule__CommandDef__AttributesAssignment_2_1 )
            // InternalTSSpec.g:2194:2: rule__CommandDef__AttributesAssignment_2_1
            {
            pushFollow(FOLLOW_11);
            rule__CommandDef__AttributesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }

            }

            // InternalTSSpec.g:2197:1: ( ( rule__CommandDef__AttributesAssignment_2_1 )* )
            // InternalTSSpec.g:2198:1: ( rule__CommandDef__AttributesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }
            // InternalTSSpec.g:2199:1: ( rule__CommandDef__AttributesAssignment_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==RULE_DOC||LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTSSpec.g:2199:2: rule__CommandDef__AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CommandDef__AttributesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalTSSpec.g:2210:1: rule__CommandDef__Group_2__2 : rule__CommandDef__Group_2__2__Impl ;
    public final void rule__CommandDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2214:1: ( rule__CommandDef__Group_2__2__Impl )
            // InternalTSSpec.g:2215:2: rule__CommandDef__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2221:1: rule__CommandDef__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CommandDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2225:1: ( ( ')' ) )
            // InternalTSSpec.g:2226:1: ( ')' )
            {
            // InternalTSSpec.g:2226:1: ( ')' )
            // InternalTSSpec.g:2227:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2246:1: rule__EventDef__Group__0 : rule__EventDef__Group__0__Impl rule__EventDef__Group__1 ;
    public final void rule__EventDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2250:1: ( rule__EventDef__Group__0__Impl rule__EventDef__Group__1 )
            // InternalTSSpec.g:2251:2: rule__EventDef__Group__0__Impl rule__EventDef__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__EventDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2258:1: rule__EventDef__Group__0__Impl : ( ( rule__EventDef__DocumentationAssignment_0 )* ) ;
    public final void rule__EventDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2262:1: ( ( ( rule__EventDef__DocumentationAssignment_0 )* ) )
            // InternalTSSpec.g:2263:1: ( ( rule__EventDef__DocumentationAssignment_0 )* )
            {
            // InternalTSSpec.g:2263:1: ( ( rule__EventDef__DocumentationAssignment_0 )* )
            // InternalTSSpec.g:2264:1: ( rule__EventDef__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getDocumentationAssignment_0()); 
            }
            // InternalTSSpec.g:2265:1: ( rule__EventDef__DocumentationAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOC) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTSSpec.g:2265:2: rule__EventDef__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EventDef__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalTSSpec.g:2275:1: rule__EventDef__Group__1 : rule__EventDef__Group__1__Impl rule__EventDef__Group__2 ;
    public final void rule__EventDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2279:1: ( rule__EventDef__Group__1__Impl rule__EventDef__Group__2 )
            // InternalTSSpec.g:2280:2: rule__EventDef__Group__1__Impl rule__EventDef__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__EventDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2287:1: rule__EventDef__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2291:1: ( ( 'event' ) )
            // InternalTSSpec.g:2292:1: ( 'event' )
            {
            // InternalTSSpec.g:2292:1: ( 'event' )
            // InternalTSSpec.g:2293:1: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getEventKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2306:1: rule__EventDef__Group__2 : rule__EventDef__Group__2__Impl rule__EventDef__Group__3 ;
    public final void rule__EventDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2310:1: ( rule__EventDef__Group__2__Impl rule__EventDef__Group__3 )
            // InternalTSSpec.g:2311:2: rule__EventDef__Group__2__Impl rule__EventDef__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__EventDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2318:1: rule__EventDef__Group__2__Impl : ( ( rule__EventDef__NameAssignment_2 ) ) ;
    public final void rule__EventDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2322:1: ( ( ( rule__EventDef__NameAssignment_2 ) ) )
            // InternalTSSpec.g:2323:1: ( ( rule__EventDef__NameAssignment_2 ) )
            {
            // InternalTSSpec.g:2323:1: ( ( rule__EventDef__NameAssignment_2 ) )
            // InternalTSSpec.g:2324:1: ( rule__EventDef__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getNameAssignment_2()); 
            }
            // InternalTSSpec.g:2325:1: ( rule__EventDef__NameAssignment_2 )
            // InternalTSSpec.g:2325:2: rule__EventDef__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2335:1: rule__EventDef__Group__3 : rule__EventDef__Group__3__Impl ;
    public final void rule__EventDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2339:1: ( rule__EventDef__Group__3__Impl )
            // InternalTSSpec.g:2340:2: rule__EventDef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2346:1: rule__EventDef__Group__3__Impl : ( ( rule__EventDef__TypeAssignment_3 ) ) ;
    public final void rule__EventDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2350:1: ( ( ( rule__EventDef__TypeAssignment_3 ) ) )
            // InternalTSSpec.g:2351:1: ( ( rule__EventDef__TypeAssignment_3 ) )
            {
            // InternalTSSpec.g:2351:1: ( ( rule__EventDef__TypeAssignment_3 ) )
            // InternalTSSpec.g:2352:1: ( rule__EventDef__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getTypeAssignment_3()); 
            }
            // InternalTSSpec.g:2353:1: ( rule__EventDef__TypeAssignment_3 )
            // InternalTSSpec.g:2353:2: rule__EventDef__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2371:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2375:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTSSpec.g:2376:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2383:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2387:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2388:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2388:1: ( RULE_ID )
            // InternalTSSpec.g:2389:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2400:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2404:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTSSpec.g:2405:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2411:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2415:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTSSpec.g:2416:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTSSpec.g:2416:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTSSpec.g:2417:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalTSSpec.g:2418:1: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTSSpec.g:2418:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalTSSpec.g:2432:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2436:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTSSpec.g:2437:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2444:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2448:1: ( ( ( '.' ) ) )
            // InternalTSSpec.g:2449:1: ( ( '.' ) )
            {
            // InternalTSSpec.g:2449:1: ( ( '.' ) )
            // InternalTSSpec.g:2450:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalTSSpec.g:2451:1: ( '.' )
            // InternalTSSpec.g:2452:2: '.'
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

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
    // InternalTSSpec.g:2463:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2467:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTSSpec.g:2468:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2474:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2478:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2479:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2479:1: ( RULE_ID )
            // InternalTSSpec.g:2480:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2496:1: rule__ServiceDefs__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ServiceDefs__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2500:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2501:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2501:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2502:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2511:1: rule__ServiceDefs__DomainElementsAssignment_2 : ( ruleDomainElement ) ;
    public final void rule__ServiceDefs__DomainElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2515:1: ( ( ruleDomainElement ) )
            // InternalTSSpec.g:2516:1: ( ruleDomainElement )
            {
            // InternalTSSpec.g:2516:1: ( ruleDomainElement )
            // InternalTSSpec.g:2517:1: ruleDomainElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getDomainElementsDomainElementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__ServiceDefs__ServiceDefsAssignment_3"
    // InternalTSSpec.g:2526:1: rule__ServiceDefs__ServiceDefsAssignment_3 : ( ruleServiceDef ) ;
    public final void rule__ServiceDefs__ServiceDefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2530:1: ( ( ruleServiceDef ) )
            // InternalTSSpec.g:2531:1: ( ruleServiceDef )
            {
            // InternalTSSpec.g:2531:1: ( ruleServiceDef )
            // InternalTSSpec.g:2532:1: ruleServiceDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getServiceDefsServiceDefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleServiceDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getServiceDefsServiceDefParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ServiceDefs__ServiceDefsAssignment_3"


    // $ANTLR start "rule__DomainElement__DocAssignment_0"
    // InternalTSSpec.g:2541:1: rule__DomainElement__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__DomainElement__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2545:1: ( ( RULE_DOC ) )
            // InternalTSSpec.g:2546:1: ( RULE_DOC )
            {
            // InternalTSSpec.g:2546:1: ( RULE_DOC )
            // InternalTSSpec.g:2547:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getDocDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2556:1: rule__DomainElement__NameAssignment_1_0_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2560:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2561:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2561:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2562:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2571:1: rule__DomainElement__CustAssignment_1_1_0 : ( ( 'cust' ) ) ;
    public final void rule__DomainElement__CustAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2575:1: ( ( ( 'cust' ) ) )
            // InternalTSSpec.g:2576:1: ( ( 'cust' ) )
            {
            // InternalTSSpec.g:2576:1: ( ( 'cust' ) )
            // InternalTSSpec.g:2577:1: ( 'cust' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }
            // InternalTSSpec.g:2578:1: ( 'cust' )
            // InternalTSSpec.g:2579:1: 'cust'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2594:1: rule__DomainElement__NameAssignment_1_1_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2598:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2599:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2599:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2600:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2609:1: rule__DomainElement__SuperTypeAssignment_1_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DomainElement__SuperTypeAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2613:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTSSpec.g:2614:1: ( ( ruleQualifiedName ) )
            {
            // InternalTSSpec.g:2614:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2615:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
            }
            // InternalTSSpec.g:2616:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2617:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementQualifiedNameParserRuleCall_1_1_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2628:1: rule__DomainElement__AttributesAssignment_1_1_4 : ( ruleAttribute ) ;
    public final void rule__DomainElement__AttributesAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2632:1: ( ( ruleAttribute ) )
            // InternalTSSpec.g:2633:1: ( ruleAttribute )
            {
            // InternalTSSpec.g:2633:1: ( ruleAttribute )
            // InternalTSSpec.g:2634:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAttributesAttributeParserRuleCall_1_1_4_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__DomainElement__IsEnumAssignment_1_2_0"
    // InternalTSSpec.g:2643:1: rule__DomainElement__IsEnumAssignment_1_2_0 : ( ( 'enum' ) ) ;
    public final void rule__DomainElement__IsEnumAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2647:1: ( ( ( 'enum' ) ) )
            // InternalTSSpec.g:2648:1: ( ( 'enum' ) )
            {
            // InternalTSSpec.g:2648:1: ( ( 'enum' ) )
            // InternalTSSpec.g:2649:1: ( 'enum' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getIsEnumEnumKeyword_1_2_0_0()); 
            }
            // InternalTSSpec.g:2650:1: ( 'enum' )
            // InternalTSSpec.g:2651:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getIsEnumEnumKeyword_1_2_0_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getIsEnumEnumKeyword_1_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getIsEnumEnumKeyword_1_2_0_0()); 
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
    // $ANTLR end "rule__DomainElement__IsEnumAssignment_1_2_0"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_2_1"
    // InternalTSSpec.g:2666:1: rule__DomainElement__NameAssignment_1_2_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2670:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2671:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2671:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2672:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2681:1: rule__DomainElement__EnumValuesAssignment_1_2_3 : ( ruleEnumVal ) ;
    public final void rule__DomainElement__EnumValuesAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2685:1: ( ( ruleEnumVal ) )
            // InternalTSSpec.g:2686:1: ( ruleEnumVal )
            {
            // InternalTSSpec.g:2686:1: ( ruleEnumVal )
            // InternalTSSpec.g:2687:1: ruleEnumVal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumValuesEnumValParserRuleCall_1_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2696:1: rule__DomainElement__NameAssignment_1_3_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2700:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2701:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2701:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2702:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2711:1: rule__DomainElement__RealTypeAssignment_1_3_3 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__RealTypeAssignment_1_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2715:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2716:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2716:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2717:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRealTypeQualifiedNameParserRuleCall_1_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2726:1: rule__EnumVal__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EnumVal__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2730:1: ( ( RULE_DOC ) )
            // InternalTSSpec.g:2731:1: ( RULE_DOC )
            {
            // InternalTSSpec.g:2731:1: ( RULE_DOC )
            // InternalTSSpec.g:2732:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getDocDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2741:1: rule__EnumVal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumVal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2745:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2746:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2746:1: ( RULE_ID )
            // InternalTSSpec.g:2747:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__EnumVal__ValueAssignment_3_0"
    // InternalTSSpec.g:2756:1: rule__EnumVal__ValueAssignment_3_0 : ( ( rule__EnumVal__ValueAlternatives_3_0_0 ) ) ;
    public final void rule__EnumVal__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2760:1: ( ( ( rule__EnumVal__ValueAlternatives_3_0_0 ) ) )
            // InternalTSSpec.g:2761:1: ( ( rule__EnumVal__ValueAlternatives_3_0_0 ) )
            {
            // InternalTSSpec.g:2761:1: ( ( rule__EnumVal__ValueAlternatives_3_0_0 ) )
            // InternalTSSpec.g:2762:1: ( rule__EnumVal__ValueAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getValueAlternatives_3_0_0()); 
            }
            // InternalTSSpec.g:2763:1: ( rule__EnumVal__ValueAlternatives_3_0_0 )
            // InternalTSSpec.g:2763:2: rule__EnumVal__ValueAlternatives_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumVal__ValueAlternatives_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getValueAlternatives_3_0_0()); 
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
    // $ANTLR end "rule__EnumVal__ValueAssignment_3_0"


    // $ANTLR start "rule__EnumVal__IntValueAssignment_3_1"
    // InternalTSSpec.g:2772:1: rule__EnumVal__IntValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__EnumVal__IntValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2776:1: ( ( RULE_INT ) )
            // InternalTSSpec.g:2777:1: ( RULE_INT )
            {
            // InternalTSSpec.g:2777:1: ( RULE_INT )
            // InternalTSSpec.g:2778:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getIntValueINTTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getIntValueINTTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__EnumVal__IntValueAssignment_3_1"


    // $ANTLR start "rule__Attribute__DocumentationAssignment_0"
    // InternalTSSpec.g:2787:1: rule__Attribute__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Attribute__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2791:1: ( ( RULE_DOC ) )
            // InternalTSSpec.g:2792:1: ( RULE_DOC )
            {
            // InternalTSSpec.g:2792:1: ( RULE_DOC )
            // InternalTSSpec.g:2793:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2802:1: rule__Attribute__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__Attribute__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2806:1: ( ( ( 'optional' ) ) )
            // InternalTSSpec.g:2807:1: ( ( 'optional' ) )
            {
            // InternalTSSpec.g:2807:1: ( ( 'optional' ) )
            // InternalTSSpec.g:2808:1: ( 'optional' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }
            // InternalTSSpec.g:2809:1: ( 'optional' )
            // InternalTSSpec.g:2810:1: 'optional'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2825:1: rule__Attribute__TypeAssignment_2 : ( ruleGenericTypeArgument ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2829:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:2830:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:2830:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:2831:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeGenericTypeArgumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2840:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2844:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2845:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2845:1: ( RULE_ID )
            // InternalTSSpec.g:2846:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2855:1: rule__Attribute__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2859:1: ( ( RULE_STRING ) )
            // InternalTSSpec.g:2860:1: ( RULE_STRING )
            {
            // InternalTSSpec.g:2860:1: ( RULE_STRING )
            // InternalTSSpec.g:2861:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:2870:1: rule__GenericTypeArgument__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GenericTypeArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2874:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTSSpec.g:2875:1: ( ( ruleQualifiedName ) )
            {
            // InternalTSSpec.g:2875:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2876:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
            }
            // InternalTSSpec.g:2877:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2878:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2889:1: rule__GenericTypeArgument__ArgumentsAssignment_1_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__GenericTypeArgument__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2893:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:2894:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:2894:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:2895:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2904:1: rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__GenericTypeArgument__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2908:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:2909:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:2909:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:2910:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:2919:1: rule__GenericTypeArgument__ListAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__GenericTypeArgument__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2923:1: ( ( ( '[]' ) ) )
            // InternalTSSpec.g:2924:1: ( ( '[]' ) )
            {
            // InternalTSSpec.g:2924:1: ( ( '[]' ) )
            // InternalTSSpec.g:2925:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            // InternalTSSpec.g:2926:1: ( '[]' )
            // InternalTSSpec.g:2927:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ServiceDef__NameAssignment_0"
    // InternalTSSpec.g:2942:1: rule__ServiceDef__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ServiceDef__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2946:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2947:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2947:1: ( RULE_ID )
            // InternalTSSpec.g:2948:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__ServiceDef__NameAssignment_0"


    // $ANTLR start "rule__ServiceDef__CommandListAssignment_2"
    // InternalTSSpec.g:2957:1: rule__ServiceDef__CommandListAssignment_2 : ( ruleCommandDef ) ;
    public final void rule__ServiceDef__CommandListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2961:1: ( ( ruleCommandDef ) )
            // InternalTSSpec.g:2962:1: ( ruleCommandDef )
            {
            // InternalTSSpec.g:2962:1: ( ruleCommandDef )
            // InternalTSSpec.g:2963:1: ruleCommandDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getCommandListCommandDefParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCommandDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getCommandListCommandDefParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ServiceDef__CommandListAssignment_2"


    // $ANTLR start "rule__ServiceDef__EventListAssignment_3"
    // InternalTSSpec.g:2972:1: rule__ServiceDef__EventListAssignment_3 : ( ruleEventDef ) ;
    public final void rule__ServiceDef__EventListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2976:1: ( ( ruleEventDef ) )
            // InternalTSSpec.g:2977:1: ( ruleEventDef )
            {
            // InternalTSSpec.g:2977:1: ( ruleEventDef )
            // InternalTSSpec.g:2978:1: ruleEventDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getEventListEventDefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getEventListEventDefParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ServiceDef__EventListAssignment_3"


    // $ANTLR start "rule__CommandDef__NameAssignment_1"
    // InternalTSSpec.g:2987:1: rule__CommandDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommandDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2991:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2992:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2992:1: ( RULE_ID )
            // InternalTSSpec.g:2993:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:3002:1: rule__CommandDef__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__CommandDef__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:3006:1: ( ( ruleAttribute ) )
            // InternalTSSpec.g:3007:1: ( ruleAttribute )
            {
            // InternalTSSpec.g:3007:1: ( ruleAttribute )
            // InternalTSSpec.g:3008:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:3017:1: rule__CommandDef__ReturnValAssignment_4_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__CommandDef__ReturnValAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:3021:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:3022:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:3022:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:3023:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getReturnValGenericTypeArgumentParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalTSSpec.g:3032:1: rule__EventDef__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EventDef__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:3036:1: ( ( RULE_DOC ) )
            // InternalTSSpec.g:3037:1: ( RULE_DOC )
            {
            // InternalTSSpec.g:3037:1: ( RULE_DOC )
            // InternalTSSpec.g:3038:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:3047:1: rule__EventDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:3051:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:3052:1: ( RULE_ID )
            {
            // InternalTSSpec.g:3052:1: ( RULE_ID )
            // InternalTSSpec.g:3053:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalTSSpec.g:3062:1: rule__EventDef__TypeAssignment_3 : ( ruleGenericTypeArgument ) ;
    public final void rule__EventDef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:3066:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:3067:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:3067:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:3068:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getTypeGenericTypeArgumentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000C0104050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000C0104042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000C0104040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100010050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000052L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000014010040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000042L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100001050L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000002L});

}