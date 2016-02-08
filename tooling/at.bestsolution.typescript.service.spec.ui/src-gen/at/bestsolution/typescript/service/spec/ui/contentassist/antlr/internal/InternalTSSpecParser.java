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


    // $ANTLR start "rule__EnumVal__ValueAlternatives_3_0"
    // InternalTSSpec.g:347:1: rule__EnumVal__ValueAlternatives_3_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__EnumVal__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:351:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
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
                    // InternalTSSpec.g:352:1: ( RULE_ID )
                    {
                    // InternalTSSpec.g:352:1: ( RULE_ID )
                    // InternalTSSpec.g:353:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumValAccess().getValueIDTerminalRuleCall_3_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumValAccess().getValueIDTerminalRuleCall_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTSSpec.g:358:6: ( RULE_STRING )
                    {
                    // InternalTSSpec.g:358:6: ( RULE_STRING )
                    // InternalTSSpec.g:359:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumValAccess().getValueSTRINGTerminalRuleCall_3_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumValAccess().getValueSTRINGTerminalRuleCall_3_0_1()); 
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
    // $ANTLR end "rule__EnumVal__ValueAlternatives_3_0"


    // $ANTLR start "rule__CommandDef__Alternatives_4"
    // InternalTSSpec.g:369:1: rule__CommandDef__Alternatives_4 : ( ( 'void' ) | ( ( rule__CommandDef__ReturnValAssignment_4_1 ) ) );
    public final void rule__CommandDef__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:373:1: ( ( 'void' ) | ( ( rule__CommandDef__ReturnValAssignment_4_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
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
                    // InternalTSSpec.g:374:1: ( 'void' )
                    {
                    // InternalTSSpec.g:374:1: ( 'void' )
                    // InternalTSSpec.g:375:1: 'void'
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
                    // InternalTSSpec.g:382:6: ( ( rule__CommandDef__ReturnValAssignment_4_1 ) )
                    {
                    // InternalTSSpec.g:382:6: ( ( rule__CommandDef__ReturnValAssignment_4_1 ) )
                    // InternalTSSpec.g:383:1: ( rule__CommandDef__ReturnValAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandDefAccess().getReturnValAssignment_4_1()); 
                    }
                    // InternalTSSpec.g:384:1: ( rule__CommandDef__ReturnValAssignment_4_1 )
                    // InternalTSSpec.g:384:2: rule__CommandDef__ReturnValAssignment_4_1
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
    // InternalTSSpec.g:395:1: rule__ServiceDefs__Group__0 : rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1 ;
    public final void rule__ServiceDefs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:399:1: ( rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1 )
            // InternalTSSpec.g:400:2: rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1
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
    // InternalTSSpec.g:407:1: rule__ServiceDefs__Group__0__Impl : ( 'package' ) ;
    public final void rule__ServiceDefs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:411:1: ( ( 'package' ) )
            // InternalTSSpec.g:412:1: ( 'package' )
            {
            // InternalTSSpec.g:412:1: ( 'package' )
            // InternalTSSpec.g:413:1: 'package'
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
    // InternalTSSpec.g:426:1: rule__ServiceDefs__Group__1 : rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2 ;
    public final void rule__ServiceDefs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:430:1: ( rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2 )
            // InternalTSSpec.g:431:2: rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2
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
    // InternalTSSpec.g:438:1: rule__ServiceDefs__Group__1__Impl : ( ( rule__ServiceDefs__PackageNameAssignment_1 ) ) ;
    public final void rule__ServiceDefs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:442:1: ( ( ( rule__ServiceDefs__PackageNameAssignment_1 ) ) )
            // InternalTSSpec.g:443:1: ( ( rule__ServiceDefs__PackageNameAssignment_1 ) )
            {
            // InternalTSSpec.g:443:1: ( ( rule__ServiceDefs__PackageNameAssignment_1 ) )
            // InternalTSSpec.g:444:1: ( rule__ServiceDefs__PackageNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageNameAssignment_1()); 
            }
            // InternalTSSpec.g:445:1: ( rule__ServiceDefs__PackageNameAssignment_1 )
            // InternalTSSpec.g:445:2: rule__ServiceDefs__PackageNameAssignment_1
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
    // InternalTSSpec.g:455:1: rule__ServiceDefs__Group__2 : rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3 ;
    public final void rule__ServiceDefs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:459:1: ( rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3 )
            // InternalTSSpec.g:460:2: rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3
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
    // InternalTSSpec.g:467:1: rule__ServiceDefs__Group__2__Impl : ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* ) ;
    public final void rule__ServiceDefs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:471:1: ( ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* ) )
            // InternalTSSpec.g:472:1: ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* )
            {
            // InternalTSSpec.g:472:1: ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* )
            // InternalTSSpec.g:473:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getDomainElementsAssignment_2()); 
            }
            // InternalTSSpec.g:474:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOC||LA4_0==14||LA4_0==20||(LA4_0>=30 && LA4_0<=31)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTSSpec.g:474:2: rule__ServiceDefs__DomainElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ServiceDefs__DomainElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalTSSpec.g:484:1: rule__ServiceDefs__Group__3 : rule__ServiceDefs__Group__3__Impl ;
    public final void rule__ServiceDefs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:488:1: ( rule__ServiceDefs__Group__3__Impl )
            // InternalTSSpec.g:489:2: rule__ServiceDefs__Group__3__Impl
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
    // InternalTSSpec.g:495:1: rule__ServiceDefs__Group__3__Impl : ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* ) ;
    public final void rule__ServiceDefs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:499:1: ( ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* ) )
            // InternalTSSpec.g:500:1: ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* )
            {
            // InternalTSSpec.g:500:1: ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* )
            // InternalTSSpec.g:501:1: ( rule__ServiceDefs__ServiceDefsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getServiceDefsAssignment_3()); 
            }
            // InternalTSSpec.g:502:1: ( rule__ServiceDefs__ServiceDefsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTSSpec.g:502:2: rule__ServiceDefs__ServiceDefsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ServiceDefs__ServiceDefsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalTSSpec.g:520:1: rule__DomainElement__Group__0 : rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1 ;
    public final void rule__DomainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:524:1: ( rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1 )
            // InternalTSSpec.g:525:2: rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1
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
    // InternalTSSpec.g:532:1: rule__DomainElement__Group__0__Impl : ( ( rule__DomainElement__DocAssignment_0 )* ) ;
    public final void rule__DomainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:536:1: ( ( ( rule__DomainElement__DocAssignment_0 )* ) )
            // InternalTSSpec.g:537:1: ( ( rule__DomainElement__DocAssignment_0 )* )
            {
            // InternalTSSpec.g:537:1: ( ( rule__DomainElement__DocAssignment_0 )* )
            // InternalTSSpec.g:538:1: ( rule__DomainElement__DocAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getDocAssignment_0()); 
            }
            // InternalTSSpec.g:539:1: ( rule__DomainElement__DocAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DOC) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTSSpec.g:539:2: rule__DomainElement__DocAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalTSSpec.g:549:1: rule__DomainElement__Group__1 : rule__DomainElement__Group__1__Impl ;
    public final void rule__DomainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:553:1: ( rule__DomainElement__Group__1__Impl )
            // InternalTSSpec.g:554:2: rule__DomainElement__Group__1__Impl
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
    // InternalTSSpec.g:560:1: rule__DomainElement__Group__1__Impl : ( ( rule__DomainElement__Alternatives_1 ) ) ;
    public final void rule__DomainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:564:1: ( ( ( rule__DomainElement__Alternatives_1 ) ) )
            // InternalTSSpec.g:565:1: ( ( rule__DomainElement__Alternatives_1 ) )
            {
            // InternalTSSpec.g:565:1: ( ( rule__DomainElement__Alternatives_1 ) )
            // InternalTSSpec.g:566:1: ( rule__DomainElement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAlternatives_1()); 
            }
            // InternalTSSpec.g:567:1: ( rule__DomainElement__Alternatives_1 )
            // InternalTSSpec.g:567:2: rule__DomainElement__Alternatives_1
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
    // InternalTSSpec.g:581:1: rule__DomainElement__Group_1_0__0 : rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1 ;
    public final void rule__DomainElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:585:1: ( rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1 )
            // InternalTSSpec.g:586:2: rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1
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
    // InternalTSSpec.g:593:1: rule__DomainElement__Group_1_0__0__Impl : ( 'javatype' ) ;
    public final void rule__DomainElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:597:1: ( ( 'javatype' ) )
            // InternalTSSpec.g:598:1: ( 'javatype' )
            {
            // InternalTSSpec.g:598:1: ( 'javatype' )
            // InternalTSSpec.g:599:1: 'javatype'
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
    // InternalTSSpec.g:612:1: rule__DomainElement__Group_1_0__1 : rule__DomainElement__Group_1_0__1__Impl ;
    public final void rule__DomainElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:616:1: ( rule__DomainElement__Group_1_0__1__Impl )
            // InternalTSSpec.g:617:2: rule__DomainElement__Group_1_0__1__Impl
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
    // InternalTSSpec.g:623:1: rule__DomainElement__Group_1_0__1__Impl : ( ( rule__DomainElement__NameAssignment_1_0_1 ) ) ;
    public final void rule__DomainElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:627:1: ( ( ( rule__DomainElement__NameAssignment_1_0_1 ) ) )
            // InternalTSSpec.g:628:1: ( ( rule__DomainElement__NameAssignment_1_0_1 ) )
            {
            // InternalTSSpec.g:628:1: ( ( rule__DomainElement__NameAssignment_1_0_1 ) )
            // InternalTSSpec.g:629:1: ( rule__DomainElement__NameAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_0_1()); 
            }
            // InternalTSSpec.g:630:1: ( rule__DomainElement__NameAssignment_1_0_1 )
            // InternalTSSpec.g:630:2: rule__DomainElement__NameAssignment_1_0_1
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
    // InternalTSSpec.g:644:1: rule__DomainElement__Group_1_1__0 : rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1 ;
    public final void rule__DomainElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:648:1: ( rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1 )
            // InternalTSSpec.g:649:2: rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1
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
    // InternalTSSpec.g:656:1: rule__DomainElement__Group_1_1__0__Impl : ( ( rule__DomainElement__CustAssignment_1_1_0 ) ) ;
    public final void rule__DomainElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:660:1: ( ( ( rule__DomainElement__CustAssignment_1_1_0 ) ) )
            // InternalTSSpec.g:661:1: ( ( rule__DomainElement__CustAssignment_1_1_0 ) )
            {
            // InternalTSSpec.g:661:1: ( ( rule__DomainElement__CustAssignment_1_1_0 ) )
            // InternalTSSpec.g:662:1: ( rule__DomainElement__CustAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustAssignment_1_1_0()); 
            }
            // InternalTSSpec.g:663:1: ( rule__DomainElement__CustAssignment_1_1_0 )
            // InternalTSSpec.g:663:2: rule__DomainElement__CustAssignment_1_1_0
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
    // InternalTSSpec.g:673:1: rule__DomainElement__Group_1_1__1 : rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2 ;
    public final void rule__DomainElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:677:1: ( rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2 )
            // InternalTSSpec.g:678:2: rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2
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
    // InternalTSSpec.g:685:1: rule__DomainElement__Group_1_1__1__Impl : ( ( rule__DomainElement__NameAssignment_1_1_1 ) ) ;
    public final void rule__DomainElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:689:1: ( ( ( rule__DomainElement__NameAssignment_1_1_1 ) ) )
            // InternalTSSpec.g:690:1: ( ( rule__DomainElement__NameAssignment_1_1_1 ) )
            {
            // InternalTSSpec.g:690:1: ( ( rule__DomainElement__NameAssignment_1_1_1 ) )
            // InternalTSSpec.g:691:1: ( rule__DomainElement__NameAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_1_1()); 
            }
            // InternalTSSpec.g:692:1: ( rule__DomainElement__NameAssignment_1_1_1 )
            // InternalTSSpec.g:692:2: rule__DomainElement__NameAssignment_1_1_1
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
    // InternalTSSpec.g:702:1: rule__DomainElement__Group_1_1__2 : rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3 ;
    public final void rule__DomainElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:706:1: ( rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3 )
            // InternalTSSpec.g:707:2: rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3
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
    // InternalTSSpec.g:714:1: rule__DomainElement__Group_1_1__2__Impl : ( ( rule__DomainElement__Group_1_1_2__0 )? ) ;
    public final void rule__DomainElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:718:1: ( ( ( rule__DomainElement__Group_1_1_2__0 )? ) )
            // InternalTSSpec.g:719:1: ( ( rule__DomainElement__Group_1_1_2__0 )? )
            {
            // InternalTSSpec.g:719:1: ( ( rule__DomainElement__Group_1_1_2__0 )? )
            // InternalTSSpec.g:720:1: ( rule__DomainElement__Group_1_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getGroup_1_1_2()); 
            }
            // InternalTSSpec.g:721:1: ( rule__DomainElement__Group_1_1_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTSSpec.g:721:2: rule__DomainElement__Group_1_1_2__0
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
    // InternalTSSpec.g:731:1: rule__DomainElement__Group_1_1__3 : rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4 ;
    public final void rule__DomainElement__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:735:1: ( rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4 )
            // InternalTSSpec.g:736:2: rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4
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
    // InternalTSSpec.g:743:1: rule__DomainElement__Group_1_1__3__Impl : ( '{' ) ;
    public final void rule__DomainElement__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:747:1: ( ( '{' ) )
            // InternalTSSpec.g:748:1: ( '{' )
            {
            // InternalTSSpec.g:748:1: ( '{' )
            // InternalTSSpec.g:749:1: '{'
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
    // InternalTSSpec.g:762:1: rule__DomainElement__Group_1_1__4 : rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5 ;
    public final void rule__DomainElement__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:766:1: ( rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5 )
            // InternalTSSpec.g:767:2: rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5
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
    // InternalTSSpec.g:774:1: rule__DomainElement__Group_1_1__4__Impl : ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* ) ;
    public final void rule__DomainElement__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:778:1: ( ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* ) )
            // InternalTSSpec.g:779:1: ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* )
            {
            // InternalTSSpec.g:779:1: ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* )
            // InternalTSSpec.g:780:1: ( rule__DomainElement__AttributesAssignment_1_1_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAttributesAssignment_1_1_4()); 
            }
            // InternalTSSpec.g:781:1: ( rule__DomainElement__AttributesAssignment_1_1_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==RULE_DOC||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTSSpec.g:781:2: rule__DomainElement__AttributesAssignment_1_1_4
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalTSSpec.g:791:1: rule__DomainElement__Group_1_1__5 : rule__DomainElement__Group_1_1__5__Impl ;
    public final void rule__DomainElement__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:795:1: ( rule__DomainElement__Group_1_1__5__Impl )
            // InternalTSSpec.g:796:2: rule__DomainElement__Group_1_1__5__Impl
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
    // InternalTSSpec.g:802:1: rule__DomainElement__Group_1_1__5__Impl : ( '}' ) ;
    public final void rule__DomainElement__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:806:1: ( ( '}' ) )
            // InternalTSSpec.g:807:1: ( '}' )
            {
            // InternalTSSpec.g:807:1: ( '}' )
            // InternalTSSpec.g:808:1: '}'
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
    // InternalTSSpec.g:833:1: rule__DomainElement__Group_1_1_2__0 : rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1 ;
    public final void rule__DomainElement__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:837:1: ( rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1 )
            // InternalTSSpec.g:838:2: rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1
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
    // InternalTSSpec.g:845:1: rule__DomainElement__Group_1_1_2__0__Impl : ( 'extends' ) ;
    public final void rule__DomainElement__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:849:1: ( ( 'extends' ) )
            // InternalTSSpec.g:850:1: ( 'extends' )
            {
            // InternalTSSpec.g:850:1: ( 'extends' )
            // InternalTSSpec.g:851:1: 'extends'
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
    // InternalTSSpec.g:864:1: rule__DomainElement__Group_1_1_2__1 : rule__DomainElement__Group_1_1_2__1__Impl ;
    public final void rule__DomainElement__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:868:1: ( rule__DomainElement__Group_1_1_2__1__Impl )
            // InternalTSSpec.g:869:2: rule__DomainElement__Group_1_1_2__1__Impl
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
    // InternalTSSpec.g:875:1: rule__DomainElement__Group_1_1_2__1__Impl : ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) ) ;
    public final void rule__DomainElement__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:879:1: ( ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) ) )
            // InternalTSSpec.g:880:1: ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) )
            {
            // InternalTSSpec.g:880:1: ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) )
            // InternalTSSpec.g:881:1: ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeAssignment_1_1_2_1()); 
            }
            // InternalTSSpec.g:882:1: ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 )
            // InternalTSSpec.g:882:2: rule__DomainElement__SuperTypeAssignment_1_1_2_1
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
    // InternalTSSpec.g:896:1: rule__DomainElement__Group_1_2__0 : rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1 ;
    public final void rule__DomainElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:900:1: ( rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1 )
            // InternalTSSpec.g:901:2: rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1
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
    // InternalTSSpec.g:908:1: rule__DomainElement__Group_1_2__0__Impl : ( ( rule__DomainElement__IsEnumAssignment_1_2_0 ) ) ;
    public final void rule__DomainElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:912:1: ( ( ( rule__DomainElement__IsEnumAssignment_1_2_0 ) ) )
            // InternalTSSpec.g:913:1: ( ( rule__DomainElement__IsEnumAssignment_1_2_0 ) )
            {
            // InternalTSSpec.g:913:1: ( ( rule__DomainElement__IsEnumAssignment_1_2_0 ) )
            // InternalTSSpec.g:914:1: ( rule__DomainElement__IsEnumAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getIsEnumAssignment_1_2_0()); 
            }
            // InternalTSSpec.g:915:1: ( rule__DomainElement__IsEnumAssignment_1_2_0 )
            // InternalTSSpec.g:915:2: rule__DomainElement__IsEnumAssignment_1_2_0
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
    // InternalTSSpec.g:925:1: rule__DomainElement__Group_1_2__1 : rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2 ;
    public final void rule__DomainElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:929:1: ( rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2 )
            // InternalTSSpec.g:930:2: rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2
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
    // InternalTSSpec.g:937:1: rule__DomainElement__Group_1_2__1__Impl : ( ( rule__DomainElement__NameAssignment_1_2_1 ) ) ;
    public final void rule__DomainElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:941:1: ( ( ( rule__DomainElement__NameAssignment_1_2_1 ) ) )
            // InternalTSSpec.g:942:1: ( ( rule__DomainElement__NameAssignment_1_2_1 ) )
            {
            // InternalTSSpec.g:942:1: ( ( rule__DomainElement__NameAssignment_1_2_1 ) )
            // InternalTSSpec.g:943:1: ( rule__DomainElement__NameAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_2_1()); 
            }
            // InternalTSSpec.g:944:1: ( rule__DomainElement__NameAssignment_1_2_1 )
            // InternalTSSpec.g:944:2: rule__DomainElement__NameAssignment_1_2_1
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
    // InternalTSSpec.g:954:1: rule__DomainElement__Group_1_2__2 : rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3 ;
    public final void rule__DomainElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:958:1: ( rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3 )
            // InternalTSSpec.g:959:2: rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3
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
    // InternalTSSpec.g:966:1: rule__DomainElement__Group_1_2__2__Impl : ( '(' ) ;
    public final void rule__DomainElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:970:1: ( ( '(' ) )
            // InternalTSSpec.g:971:1: ( '(' )
            {
            // InternalTSSpec.g:971:1: ( '(' )
            // InternalTSSpec.g:972:1: '('
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
    // InternalTSSpec.g:985:1: rule__DomainElement__Group_1_2__3 : rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4 ;
    public final void rule__DomainElement__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:989:1: ( rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4 )
            // InternalTSSpec.g:990:2: rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4
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
    // InternalTSSpec.g:997:1: rule__DomainElement__Group_1_2__3__Impl : ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* ) ;
    public final void rule__DomainElement__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1001:1: ( ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* ) )
            // InternalTSSpec.g:1002:1: ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* )
            {
            // InternalTSSpec.g:1002:1: ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* )
            // InternalTSSpec.g:1003:1: ( rule__DomainElement__EnumValuesAssignment_1_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumValuesAssignment_1_2_3()); 
            }
            // InternalTSSpec.g:1004:1: ( rule__DomainElement__EnumValuesAssignment_1_2_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_DOC) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTSSpec.g:1004:2: rule__DomainElement__EnumValuesAssignment_1_2_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalTSSpec.g:1014:1: rule__DomainElement__Group_1_2__4 : rule__DomainElement__Group_1_2__4__Impl ;
    public final void rule__DomainElement__Group_1_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1018:1: ( rule__DomainElement__Group_1_2__4__Impl )
            // InternalTSSpec.g:1019:2: rule__DomainElement__Group_1_2__4__Impl
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
    // InternalTSSpec.g:1025:1: rule__DomainElement__Group_1_2__4__Impl : ( ')' ) ;
    public final void rule__DomainElement__Group_1_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1029:1: ( ( ')' ) )
            // InternalTSSpec.g:1030:1: ( ')' )
            {
            // InternalTSSpec.g:1030:1: ( ')' )
            // InternalTSSpec.g:1031:1: ')'
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
    // InternalTSSpec.g:1054:1: rule__DomainElement__Group_1_3__0 : rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1 ;
    public final void rule__DomainElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1058:1: ( rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1 )
            // InternalTSSpec.g:1059:2: rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1
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
    // InternalTSSpec.g:1066:1: rule__DomainElement__Group_1_3__0__Impl : ( 'alias' ) ;
    public final void rule__DomainElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1070:1: ( ( 'alias' ) )
            // InternalTSSpec.g:1071:1: ( 'alias' )
            {
            // InternalTSSpec.g:1071:1: ( 'alias' )
            // InternalTSSpec.g:1072:1: 'alias'
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
    // InternalTSSpec.g:1085:1: rule__DomainElement__Group_1_3__1 : rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2 ;
    public final void rule__DomainElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1089:1: ( rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2 )
            // InternalTSSpec.g:1090:2: rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2
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
    // InternalTSSpec.g:1097:1: rule__DomainElement__Group_1_3__1__Impl : ( ( rule__DomainElement__NameAssignment_1_3_1 ) ) ;
    public final void rule__DomainElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1101:1: ( ( ( rule__DomainElement__NameAssignment_1_3_1 ) ) )
            // InternalTSSpec.g:1102:1: ( ( rule__DomainElement__NameAssignment_1_3_1 ) )
            {
            // InternalTSSpec.g:1102:1: ( ( rule__DomainElement__NameAssignment_1_3_1 ) )
            // InternalTSSpec.g:1103:1: ( rule__DomainElement__NameAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_3_1()); 
            }
            // InternalTSSpec.g:1104:1: ( rule__DomainElement__NameAssignment_1_3_1 )
            // InternalTSSpec.g:1104:2: rule__DomainElement__NameAssignment_1_3_1
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
    // InternalTSSpec.g:1114:1: rule__DomainElement__Group_1_3__2 : rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3 ;
    public final void rule__DomainElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1118:1: ( rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3 )
            // InternalTSSpec.g:1119:2: rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3
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
    // InternalTSSpec.g:1126:1: rule__DomainElement__Group_1_3__2__Impl : ( 'as' ) ;
    public final void rule__DomainElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1130:1: ( ( 'as' ) )
            // InternalTSSpec.g:1131:1: ( 'as' )
            {
            // InternalTSSpec.g:1131:1: ( 'as' )
            // InternalTSSpec.g:1132:1: 'as'
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
    // InternalTSSpec.g:1145:1: rule__DomainElement__Group_1_3__3 : rule__DomainElement__Group_1_3__3__Impl ;
    public final void rule__DomainElement__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1149:1: ( rule__DomainElement__Group_1_3__3__Impl )
            // InternalTSSpec.g:1150:2: rule__DomainElement__Group_1_3__3__Impl
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
    // InternalTSSpec.g:1156:1: rule__DomainElement__Group_1_3__3__Impl : ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) ) ;
    public final void rule__DomainElement__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1160:1: ( ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) ) )
            // InternalTSSpec.g:1161:1: ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) )
            {
            // InternalTSSpec.g:1161:1: ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) )
            // InternalTSSpec.g:1162:1: ( rule__DomainElement__RealTypeAssignment_1_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRealTypeAssignment_1_3_3()); 
            }
            // InternalTSSpec.g:1163:1: ( rule__DomainElement__RealTypeAssignment_1_3_3 )
            // InternalTSSpec.g:1163:2: rule__DomainElement__RealTypeAssignment_1_3_3
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
    // InternalTSSpec.g:1181:1: rule__EnumVal__Group__0 : rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1 ;
    public final void rule__EnumVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1185:1: ( rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1 )
            // InternalTSSpec.g:1186:2: rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1
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
    // InternalTSSpec.g:1193:1: rule__EnumVal__Group__0__Impl : ( ( rule__EnumVal__DocAssignment_0 )* ) ;
    public final void rule__EnumVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1197:1: ( ( ( rule__EnumVal__DocAssignment_0 )* ) )
            // InternalTSSpec.g:1198:1: ( ( rule__EnumVal__DocAssignment_0 )* )
            {
            // InternalTSSpec.g:1198:1: ( ( rule__EnumVal__DocAssignment_0 )* )
            // InternalTSSpec.g:1199:1: ( rule__EnumVal__DocAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getDocAssignment_0()); 
            }
            // InternalTSSpec.g:1200:1: ( rule__EnumVal__DocAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTSSpec.g:1200:2: rule__EnumVal__DocAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalTSSpec.g:1210:1: rule__EnumVal__Group__1 : rule__EnumVal__Group__1__Impl rule__EnumVal__Group__2 ;
    public final void rule__EnumVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1214:1: ( rule__EnumVal__Group__1__Impl rule__EnumVal__Group__2 )
            // InternalTSSpec.g:1215:2: rule__EnumVal__Group__1__Impl rule__EnumVal__Group__2
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
    // InternalTSSpec.g:1222:1: rule__EnumVal__Group__1__Impl : ( ( rule__EnumVal__NameAssignment_1 ) ) ;
    public final void rule__EnumVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1226:1: ( ( ( rule__EnumVal__NameAssignment_1 ) ) )
            // InternalTSSpec.g:1227:1: ( ( rule__EnumVal__NameAssignment_1 ) )
            {
            // InternalTSSpec.g:1227:1: ( ( rule__EnumVal__NameAssignment_1 ) )
            // InternalTSSpec.g:1228:1: ( rule__EnumVal__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getNameAssignment_1()); 
            }
            // InternalTSSpec.g:1229:1: ( rule__EnumVal__NameAssignment_1 )
            // InternalTSSpec.g:1229:2: rule__EnumVal__NameAssignment_1
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
    // InternalTSSpec.g:1239:1: rule__EnumVal__Group__2 : rule__EnumVal__Group__2__Impl rule__EnumVal__Group__3 ;
    public final void rule__EnumVal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1243:1: ( rule__EnumVal__Group__2__Impl rule__EnumVal__Group__3 )
            // InternalTSSpec.g:1244:2: rule__EnumVal__Group__2__Impl rule__EnumVal__Group__3
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
    // InternalTSSpec.g:1251:1: rule__EnumVal__Group__2__Impl : ( '=' ) ;
    public final void rule__EnumVal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1255:1: ( ( '=' ) )
            // InternalTSSpec.g:1256:1: ( '=' )
            {
            // InternalTSSpec.g:1256:1: ( '=' )
            // InternalTSSpec.g:1257:1: '='
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
    // InternalTSSpec.g:1270:1: rule__EnumVal__Group__3 : rule__EnumVal__Group__3__Impl ;
    public final void rule__EnumVal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1274:1: ( rule__EnumVal__Group__3__Impl )
            // InternalTSSpec.g:1275:2: rule__EnumVal__Group__3__Impl
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
    // InternalTSSpec.g:1281:1: rule__EnumVal__Group__3__Impl : ( ( rule__EnumVal__ValueAssignment_3 ) ) ;
    public final void rule__EnumVal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1285:1: ( ( ( rule__EnumVal__ValueAssignment_3 ) ) )
            // InternalTSSpec.g:1286:1: ( ( rule__EnumVal__ValueAssignment_3 ) )
            {
            // InternalTSSpec.g:1286:1: ( ( rule__EnumVal__ValueAssignment_3 ) )
            // InternalTSSpec.g:1287:1: ( rule__EnumVal__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getValueAssignment_3()); 
            }
            // InternalTSSpec.g:1288:1: ( rule__EnumVal__ValueAssignment_3 )
            // InternalTSSpec.g:1288:2: rule__EnumVal__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumVal__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getValueAssignment_3()); 
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
    // InternalTSSpec.g:1306:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1310:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalTSSpec.g:1311:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalTSSpec.g:1318:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DocumentationAssignment_0 )* ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1322:1: ( ( ( rule__Attribute__DocumentationAssignment_0 )* ) )
            // InternalTSSpec.g:1323:1: ( ( rule__Attribute__DocumentationAssignment_0 )* )
            {
            // InternalTSSpec.g:1323:1: ( ( rule__Attribute__DocumentationAssignment_0 )* )
            // InternalTSSpec.g:1324:1: ( rule__Attribute__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDocumentationAssignment_0()); 
            }
            // InternalTSSpec.g:1325:1: ( rule__Attribute__DocumentationAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTSSpec.g:1325:2: rule__Attribute__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalTSSpec.g:1335:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1339:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalTSSpec.g:1340:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalTSSpec.g:1347:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__OptionalAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1351:1: ( ( ( rule__Attribute__OptionalAssignment_1 )? ) )
            // InternalTSSpec.g:1352:1: ( ( rule__Attribute__OptionalAssignment_1 )? )
            {
            // InternalTSSpec.g:1352:1: ( ( rule__Attribute__OptionalAssignment_1 )? )
            // InternalTSSpec.g:1353:1: ( rule__Attribute__OptionalAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalAssignment_1()); 
            }
            // InternalTSSpec.g:1354:1: ( rule__Attribute__OptionalAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTSSpec.g:1354:2: rule__Attribute__OptionalAssignment_1
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
    // InternalTSSpec.g:1364:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1368:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalTSSpec.g:1369:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalTSSpec.g:1376:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1380:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalTSSpec.g:1381:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalTSSpec.g:1381:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalTSSpec.g:1382:1: ( rule__Attribute__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            }
            // InternalTSSpec.g:1383:1: ( rule__Attribute__TypeAssignment_2 )
            // InternalTSSpec.g:1383:2: rule__Attribute__TypeAssignment_2
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
    // InternalTSSpec.g:1393:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1397:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalTSSpec.g:1398:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalTSSpec.g:1405:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1409:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalTSSpec.g:1410:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalTSSpec.g:1410:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalTSSpec.g:1411:1: ( rule__Attribute__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            }
            // InternalTSSpec.g:1412:1: ( rule__Attribute__NameAssignment_3 )
            // InternalTSSpec.g:1412:2: rule__Attribute__NameAssignment_3
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
    // InternalTSSpec.g:1422:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1426:1: ( rule__Attribute__Group__4__Impl )
            // InternalTSSpec.g:1427:2: rule__Attribute__Group__4__Impl
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
    // InternalTSSpec.g:1433:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1437:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // InternalTSSpec.g:1438:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // InternalTSSpec.g:1438:1: ( ( rule__Attribute__Group_4__0 )? )
            // InternalTSSpec.g:1439:1: ( rule__Attribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4()); 
            }
            // InternalTSSpec.g:1440:1: ( rule__Attribute__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTSSpec.g:1440:2: rule__Attribute__Group_4__0
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
    // InternalTSSpec.g:1460:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1464:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // InternalTSSpec.g:1465:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
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
    // InternalTSSpec.g:1472:1: rule__Attribute__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1476:1: ( ( '=' ) )
            // InternalTSSpec.g:1477:1: ( '=' )
            {
            // InternalTSSpec.g:1477:1: ( '=' )
            // InternalTSSpec.g:1478:1: '='
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
    // InternalTSSpec.g:1491:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1495:1: ( rule__Attribute__Group_4__1__Impl )
            // InternalTSSpec.g:1496:2: rule__Attribute__Group_4__1__Impl
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
    // InternalTSSpec.g:1502:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__ValueAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1506:1: ( ( ( rule__Attribute__ValueAssignment_4_1 ) ) )
            // InternalTSSpec.g:1507:1: ( ( rule__Attribute__ValueAssignment_4_1 ) )
            {
            // InternalTSSpec.g:1507:1: ( ( rule__Attribute__ValueAssignment_4_1 ) )
            // InternalTSSpec.g:1508:1: ( rule__Attribute__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_4_1()); 
            }
            // InternalTSSpec.g:1509:1: ( rule__Attribute__ValueAssignment_4_1 )
            // InternalTSSpec.g:1509:2: rule__Attribute__ValueAssignment_4_1
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
    // InternalTSSpec.g:1523:1: rule__GenericTypeArgument__Group__0 : rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1 ;
    public final void rule__GenericTypeArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1527:1: ( rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1 )
            // InternalTSSpec.g:1528:2: rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1
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
    // InternalTSSpec.g:1535:1: rule__GenericTypeArgument__Group__0__Impl : ( ( rule__GenericTypeArgument__TypeAssignment_0 ) ) ;
    public final void rule__GenericTypeArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1539:1: ( ( ( rule__GenericTypeArgument__TypeAssignment_0 ) ) )
            // InternalTSSpec.g:1540:1: ( ( rule__GenericTypeArgument__TypeAssignment_0 ) )
            {
            // InternalTSSpec.g:1540:1: ( ( rule__GenericTypeArgument__TypeAssignment_0 ) )
            // InternalTSSpec.g:1541:1: ( rule__GenericTypeArgument__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeAssignment_0()); 
            }
            // InternalTSSpec.g:1542:1: ( rule__GenericTypeArgument__TypeAssignment_0 )
            // InternalTSSpec.g:1542:2: rule__GenericTypeArgument__TypeAssignment_0
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
    // InternalTSSpec.g:1552:1: rule__GenericTypeArgument__Group__1 : rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2 ;
    public final void rule__GenericTypeArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1556:1: ( rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2 )
            // InternalTSSpec.g:1557:2: rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2
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
    // InternalTSSpec.g:1564:1: rule__GenericTypeArgument__Group__1__Impl : ( ( rule__GenericTypeArgument__Group_1__0 )? ) ;
    public final void rule__GenericTypeArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1568:1: ( ( ( rule__GenericTypeArgument__Group_1__0 )? ) )
            // InternalTSSpec.g:1569:1: ( ( rule__GenericTypeArgument__Group_1__0 )? )
            {
            // InternalTSSpec.g:1569:1: ( ( rule__GenericTypeArgument__Group_1__0 )? )
            // InternalTSSpec.g:1570:1: ( rule__GenericTypeArgument__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup_1()); 
            }
            // InternalTSSpec.g:1571:1: ( rule__GenericTypeArgument__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTSSpec.g:1571:2: rule__GenericTypeArgument__Group_1__0
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
    // InternalTSSpec.g:1581:1: rule__GenericTypeArgument__Group__2 : rule__GenericTypeArgument__Group__2__Impl ;
    public final void rule__GenericTypeArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1585:1: ( rule__GenericTypeArgument__Group__2__Impl )
            // InternalTSSpec.g:1586:2: rule__GenericTypeArgument__Group__2__Impl
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
    // InternalTSSpec.g:1592:1: rule__GenericTypeArgument__Group__2__Impl : ( ( rule__GenericTypeArgument__ListAssignment_2 )? ) ;
    public final void rule__GenericTypeArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1596:1: ( ( ( rule__GenericTypeArgument__ListAssignment_2 )? ) )
            // InternalTSSpec.g:1597:1: ( ( rule__GenericTypeArgument__ListAssignment_2 )? )
            {
            // InternalTSSpec.g:1597:1: ( ( rule__GenericTypeArgument__ListAssignment_2 )? )
            // InternalTSSpec.g:1598:1: ( rule__GenericTypeArgument__ListAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListAssignment_2()); 
            }
            // InternalTSSpec.g:1599:1: ( rule__GenericTypeArgument__ListAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTSSpec.g:1599:2: rule__GenericTypeArgument__ListAssignment_2
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
    // InternalTSSpec.g:1615:1: rule__GenericTypeArgument__Group_1__0 : rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1 ;
    public final void rule__GenericTypeArgument__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1619:1: ( rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1 )
            // InternalTSSpec.g:1620:2: rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1
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
    // InternalTSSpec.g:1627:1: rule__GenericTypeArgument__Group_1__0__Impl : ( '<' ) ;
    public final void rule__GenericTypeArgument__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1631:1: ( ( '<' ) )
            // InternalTSSpec.g:1632:1: ( '<' )
            {
            // InternalTSSpec.g:1632:1: ( '<' )
            // InternalTSSpec.g:1633:1: '<'
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
    // InternalTSSpec.g:1646:1: rule__GenericTypeArgument__Group_1__1 : rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2 ;
    public final void rule__GenericTypeArgument__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1650:1: ( rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2 )
            // InternalTSSpec.g:1651:2: rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2
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
    // InternalTSSpec.g:1658:1: rule__GenericTypeArgument__Group_1__1__Impl : ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__GenericTypeArgument__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1662:1: ( ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) ) )
            // InternalTSSpec.g:1663:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) )
            {
            // InternalTSSpec.g:1663:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) )
            // InternalTSSpec.g:1664:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_1()); 
            }
            // InternalTSSpec.g:1665:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 )
            // InternalTSSpec.g:1665:2: rule__GenericTypeArgument__ArgumentsAssignment_1_1
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
    // InternalTSSpec.g:1675:1: rule__GenericTypeArgument__Group_1__2 : rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3 ;
    public final void rule__GenericTypeArgument__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1679:1: ( rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3 )
            // InternalTSSpec.g:1680:2: rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3
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
    // InternalTSSpec.g:1687:1: rule__GenericTypeArgument__Group_1__2__Impl : ( ( rule__GenericTypeArgument__Group_1_2__0 )* ) ;
    public final void rule__GenericTypeArgument__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1691:1: ( ( ( rule__GenericTypeArgument__Group_1_2__0 )* ) )
            // InternalTSSpec.g:1692:1: ( ( rule__GenericTypeArgument__Group_1_2__0 )* )
            {
            // InternalTSSpec.g:1692:1: ( ( rule__GenericTypeArgument__Group_1_2__0 )* )
            // InternalTSSpec.g:1693:1: ( rule__GenericTypeArgument__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup_1_2()); 
            }
            // InternalTSSpec.g:1694:1: ( rule__GenericTypeArgument__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTSSpec.g:1694:2: rule__GenericTypeArgument__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalTSSpec.g:1704:1: rule__GenericTypeArgument__Group_1__3 : rule__GenericTypeArgument__Group_1__3__Impl ;
    public final void rule__GenericTypeArgument__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1708:1: ( rule__GenericTypeArgument__Group_1__3__Impl )
            // InternalTSSpec.g:1709:2: rule__GenericTypeArgument__Group_1__3__Impl
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
    // InternalTSSpec.g:1715:1: rule__GenericTypeArgument__Group_1__3__Impl : ( '>' ) ;
    public final void rule__GenericTypeArgument__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1719:1: ( ( '>' ) )
            // InternalTSSpec.g:1720:1: ( '>' )
            {
            // InternalTSSpec.g:1720:1: ( '>' )
            // InternalTSSpec.g:1721:1: '>'
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
    // InternalTSSpec.g:1742:1: rule__GenericTypeArgument__Group_1_2__0 : rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1 ;
    public final void rule__GenericTypeArgument__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1746:1: ( rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1 )
            // InternalTSSpec.g:1747:2: rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1
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
    // InternalTSSpec.g:1754:1: rule__GenericTypeArgument__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__GenericTypeArgument__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1758:1: ( ( ',' ) )
            // InternalTSSpec.g:1759:1: ( ',' )
            {
            // InternalTSSpec.g:1759:1: ( ',' )
            // InternalTSSpec.g:1760:1: ','
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
    // InternalTSSpec.g:1773:1: rule__GenericTypeArgument__Group_1_2__1 : rule__GenericTypeArgument__Group_1_2__1__Impl ;
    public final void rule__GenericTypeArgument__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1777:1: ( rule__GenericTypeArgument__Group_1_2__1__Impl )
            // InternalTSSpec.g:1778:2: rule__GenericTypeArgument__Group_1_2__1__Impl
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
    // InternalTSSpec.g:1784:1: rule__GenericTypeArgument__Group_1_2__1__Impl : ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__GenericTypeArgument__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1788:1: ( ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) ) )
            // InternalTSSpec.g:1789:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalTSSpec.g:1789:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) )
            // InternalTSSpec.g:1790:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_2_1()); 
            }
            // InternalTSSpec.g:1791:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 )
            // InternalTSSpec.g:1791:2: rule__GenericTypeArgument__ArgumentsAssignment_1_2_1
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
    // InternalTSSpec.g:1805:1: rule__ServiceDef__Group__0 : rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1 ;
    public final void rule__ServiceDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1809:1: ( rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1 )
            // InternalTSSpec.g:1810:2: rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1
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
    // InternalTSSpec.g:1817:1: rule__ServiceDef__Group__0__Impl : ( ( rule__ServiceDef__NameAssignment_0 ) ) ;
    public final void rule__ServiceDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1821:1: ( ( ( rule__ServiceDef__NameAssignment_0 ) ) )
            // InternalTSSpec.g:1822:1: ( ( rule__ServiceDef__NameAssignment_0 ) )
            {
            // InternalTSSpec.g:1822:1: ( ( rule__ServiceDef__NameAssignment_0 ) )
            // InternalTSSpec.g:1823:1: ( rule__ServiceDef__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getNameAssignment_0()); 
            }
            // InternalTSSpec.g:1824:1: ( rule__ServiceDef__NameAssignment_0 )
            // InternalTSSpec.g:1824:2: rule__ServiceDef__NameAssignment_0
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
    // InternalTSSpec.g:1834:1: rule__ServiceDef__Group__1 : rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2 ;
    public final void rule__ServiceDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1838:1: ( rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2 )
            // InternalTSSpec.g:1839:2: rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2
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
    // InternalTSSpec.g:1846:1: rule__ServiceDef__Group__1__Impl : ( '{' ) ;
    public final void rule__ServiceDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1850:1: ( ( '{' ) )
            // InternalTSSpec.g:1851:1: ( '{' )
            {
            // InternalTSSpec.g:1851:1: ( '{' )
            // InternalTSSpec.g:1852:1: '{'
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
    // InternalTSSpec.g:1865:1: rule__ServiceDef__Group__2 : rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3 ;
    public final void rule__ServiceDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1869:1: ( rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3 )
            // InternalTSSpec.g:1870:2: rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3
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
    // InternalTSSpec.g:1877:1: rule__ServiceDef__Group__2__Impl : ( ( rule__ServiceDef__CommandListAssignment_2 )* ) ;
    public final void rule__ServiceDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1881:1: ( ( ( rule__ServiceDef__CommandListAssignment_2 )* ) )
            // InternalTSSpec.g:1882:1: ( ( rule__ServiceDef__CommandListAssignment_2 )* )
            {
            // InternalTSSpec.g:1882:1: ( ( rule__ServiceDef__CommandListAssignment_2 )* )
            // InternalTSSpec.g:1883:1: ( rule__ServiceDef__CommandListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getCommandListAssignment_2()); 
            }
            // InternalTSSpec.g:1884:1: ( rule__ServiceDef__CommandListAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTSSpec.g:1884:2: rule__ServiceDef__CommandListAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ServiceDef__CommandListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalTSSpec.g:1894:1: rule__ServiceDef__Group__3 : rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4 ;
    public final void rule__ServiceDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1898:1: ( rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4 )
            // InternalTSSpec.g:1899:2: rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4
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
    // InternalTSSpec.g:1906:1: rule__ServiceDef__Group__3__Impl : ( ( rule__ServiceDef__EventListAssignment_3 )* ) ;
    public final void rule__ServiceDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1910:1: ( ( ( rule__ServiceDef__EventListAssignment_3 )* ) )
            // InternalTSSpec.g:1911:1: ( ( rule__ServiceDef__EventListAssignment_3 )* )
            {
            // InternalTSSpec.g:1911:1: ( ( rule__ServiceDef__EventListAssignment_3 )* )
            // InternalTSSpec.g:1912:1: ( rule__ServiceDef__EventListAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getEventListAssignment_3()); 
            }
            // InternalTSSpec.g:1913:1: ( rule__ServiceDef__EventListAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOC||LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTSSpec.g:1913:2: rule__ServiceDef__EventListAssignment_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ServiceDef__EventListAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalTSSpec.g:1923:1: rule__ServiceDef__Group__4 : rule__ServiceDef__Group__4__Impl ;
    public final void rule__ServiceDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1927:1: ( rule__ServiceDef__Group__4__Impl )
            // InternalTSSpec.g:1928:2: rule__ServiceDef__Group__4__Impl
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
    // InternalTSSpec.g:1934:1: rule__ServiceDef__Group__4__Impl : ( '}' ) ;
    public final void rule__ServiceDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1938:1: ( ( '}' ) )
            // InternalTSSpec.g:1939:1: ( '}' )
            {
            // InternalTSSpec.g:1939:1: ( '}' )
            // InternalTSSpec.g:1940:1: '}'
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
    // InternalTSSpec.g:1963:1: rule__CommandDef__Group__0 : rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1 ;
    public final void rule__CommandDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1967:1: ( rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1 )
            // InternalTSSpec.g:1968:2: rule__CommandDef__Group__0__Impl rule__CommandDef__Group__1
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
    // InternalTSSpec.g:1975:1: rule__CommandDef__Group__0__Impl : ( 'command' ) ;
    public final void rule__CommandDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1979:1: ( ( 'command' ) )
            // InternalTSSpec.g:1980:1: ( 'command' )
            {
            // InternalTSSpec.g:1980:1: ( 'command' )
            // InternalTSSpec.g:1981:1: 'command'
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
    // InternalTSSpec.g:1994:1: rule__CommandDef__Group__1 : rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2 ;
    public final void rule__CommandDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:1998:1: ( rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2 )
            // InternalTSSpec.g:1999:2: rule__CommandDef__Group__1__Impl rule__CommandDef__Group__2
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
    // InternalTSSpec.g:2006:1: rule__CommandDef__Group__1__Impl : ( ( rule__CommandDef__NameAssignment_1 ) ) ;
    public final void rule__CommandDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2010:1: ( ( ( rule__CommandDef__NameAssignment_1 ) ) )
            // InternalTSSpec.g:2011:1: ( ( rule__CommandDef__NameAssignment_1 ) )
            {
            // InternalTSSpec.g:2011:1: ( ( rule__CommandDef__NameAssignment_1 ) )
            // InternalTSSpec.g:2012:1: ( rule__CommandDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getNameAssignment_1()); 
            }
            // InternalTSSpec.g:2013:1: ( rule__CommandDef__NameAssignment_1 )
            // InternalTSSpec.g:2013:2: rule__CommandDef__NameAssignment_1
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
    // InternalTSSpec.g:2023:1: rule__CommandDef__Group__2 : rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3 ;
    public final void rule__CommandDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2027:1: ( rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3 )
            // InternalTSSpec.g:2028:2: rule__CommandDef__Group__2__Impl rule__CommandDef__Group__3
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
    // InternalTSSpec.g:2035:1: rule__CommandDef__Group__2__Impl : ( ( rule__CommandDef__Group_2__0 )? ) ;
    public final void rule__CommandDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2039:1: ( ( ( rule__CommandDef__Group_2__0 )? ) )
            // InternalTSSpec.g:2040:1: ( ( rule__CommandDef__Group_2__0 )? )
            {
            // InternalTSSpec.g:2040:1: ( ( rule__CommandDef__Group_2__0 )? )
            // InternalTSSpec.g:2041:1: ( rule__CommandDef__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getGroup_2()); 
            }
            // InternalTSSpec.g:2042:1: ( rule__CommandDef__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTSSpec.g:2042:2: rule__CommandDef__Group_2__0
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
    // InternalTSSpec.g:2052:1: rule__CommandDef__Group__3 : rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4 ;
    public final void rule__CommandDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2056:1: ( rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4 )
            // InternalTSSpec.g:2057:2: rule__CommandDef__Group__3__Impl rule__CommandDef__Group__4
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
    // InternalTSSpec.g:2064:1: rule__CommandDef__Group__3__Impl : ( 'returns' ) ;
    public final void rule__CommandDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2068:1: ( ( 'returns' ) )
            // InternalTSSpec.g:2069:1: ( 'returns' )
            {
            // InternalTSSpec.g:2069:1: ( 'returns' )
            // InternalTSSpec.g:2070:1: 'returns'
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
    // InternalTSSpec.g:2083:1: rule__CommandDef__Group__4 : rule__CommandDef__Group__4__Impl ;
    public final void rule__CommandDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2087:1: ( rule__CommandDef__Group__4__Impl )
            // InternalTSSpec.g:2088:2: rule__CommandDef__Group__4__Impl
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
    // InternalTSSpec.g:2094:1: rule__CommandDef__Group__4__Impl : ( ( rule__CommandDef__Alternatives_4 ) ) ;
    public final void rule__CommandDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2098:1: ( ( ( rule__CommandDef__Alternatives_4 ) ) )
            // InternalTSSpec.g:2099:1: ( ( rule__CommandDef__Alternatives_4 ) )
            {
            // InternalTSSpec.g:2099:1: ( ( rule__CommandDef__Alternatives_4 ) )
            // InternalTSSpec.g:2100:1: ( rule__CommandDef__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAlternatives_4()); 
            }
            // InternalTSSpec.g:2101:1: ( rule__CommandDef__Alternatives_4 )
            // InternalTSSpec.g:2101:2: rule__CommandDef__Alternatives_4
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
    // InternalTSSpec.g:2121:1: rule__CommandDef__Group_2__0 : rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1 ;
    public final void rule__CommandDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2125:1: ( rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1 )
            // InternalTSSpec.g:2126:2: rule__CommandDef__Group_2__0__Impl rule__CommandDef__Group_2__1
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
    // InternalTSSpec.g:2133:1: rule__CommandDef__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CommandDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2137:1: ( ( '(' ) )
            // InternalTSSpec.g:2138:1: ( '(' )
            {
            // InternalTSSpec.g:2138:1: ( '(' )
            // InternalTSSpec.g:2139:1: '('
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
    // InternalTSSpec.g:2152:1: rule__CommandDef__Group_2__1 : rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2 ;
    public final void rule__CommandDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2156:1: ( rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2 )
            // InternalTSSpec.g:2157:2: rule__CommandDef__Group_2__1__Impl rule__CommandDef__Group_2__2
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
    // InternalTSSpec.g:2164:1: rule__CommandDef__Group_2__1__Impl : ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) ) ;
    public final void rule__CommandDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2168:1: ( ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) ) )
            // InternalTSSpec.g:2169:1: ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) )
            {
            // InternalTSSpec.g:2169:1: ( ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* ) )
            // InternalTSSpec.g:2170:1: ( ( rule__CommandDef__AttributesAssignment_2_1 ) ) ( ( rule__CommandDef__AttributesAssignment_2_1 )* )
            {
            // InternalTSSpec.g:2170:1: ( ( rule__CommandDef__AttributesAssignment_2_1 ) )
            // InternalTSSpec.g:2171:1: ( rule__CommandDef__AttributesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }
            // InternalTSSpec.g:2172:1: ( rule__CommandDef__AttributesAssignment_2_1 )
            // InternalTSSpec.g:2172:2: rule__CommandDef__AttributesAssignment_2_1
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

            // InternalTSSpec.g:2175:1: ( ( rule__CommandDef__AttributesAssignment_2_1 )* )
            // InternalTSSpec.g:2176:1: ( rule__CommandDef__AttributesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandDefAccess().getAttributesAssignment_2_1()); 
            }
            // InternalTSSpec.g:2177:1: ( rule__CommandDef__AttributesAssignment_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==RULE_DOC||LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTSSpec.g:2177:2: rule__CommandDef__AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CommandDef__AttributesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalTSSpec.g:2188:1: rule__CommandDef__Group_2__2 : rule__CommandDef__Group_2__2__Impl ;
    public final void rule__CommandDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2192:1: ( rule__CommandDef__Group_2__2__Impl )
            // InternalTSSpec.g:2193:2: rule__CommandDef__Group_2__2__Impl
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
    // InternalTSSpec.g:2199:1: rule__CommandDef__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CommandDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2203:1: ( ( ')' ) )
            // InternalTSSpec.g:2204:1: ( ')' )
            {
            // InternalTSSpec.g:2204:1: ( ')' )
            // InternalTSSpec.g:2205:1: ')'
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
    // InternalTSSpec.g:2224:1: rule__EventDef__Group__0 : rule__EventDef__Group__0__Impl rule__EventDef__Group__1 ;
    public final void rule__EventDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2228:1: ( rule__EventDef__Group__0__Impl rule__EventDef__Group__1 )
            // InternalTSSpec.g:2229:2: rule__EventDef__Group__0__Impl rule__EventDef__Group__1
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
    // InternalTSSpec.g:2236:1: rule__EventDef__Group__0__Impl : ( ( rule__EventDef__DocumentationAssignment_0 )* ) ;
    public final void rule__EventDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2240:1: ( ( ( rule__EventDef__DocumentationAssignment_0 )* ) )
            // InternalTSSpec.g:2241:1: ( ( rule__EventDef__DocumentationAssignment_0 )* )
            {
            // InternalTSSpec.g:2241:1: ( ( rule__EventDef__DocumentationAssignment_0 )* )
            // InternalTSSpec.g:2242:1: ( rule__EventDef__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getDocumentationAssignment_0()); 
            }
            // InternalTSSpec.g:2243:1: ( rule__EventDef__DocumentationAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_DOC) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTSSpec.g:2243:2: rule__EventDef__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EventDef__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalTSSpec.g:2253:1: rule__EventDef__Group__1 : rule__EventDef__Group__1__Impl rule__EventDef__Group__2 ;
    public final void rule__EventDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2257:1: ( rule__EventDef__Group__1__Impl rule__EventDef__Group__2 )
            // InternalTSSpec.g:2258:2: rule__EventDef__Group__1__Impl rule__EventDef__Group__2
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
    // InternalTSSpec.g:2265:1: rule__EventDef__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2269:1: ( ( 'event' ) )
            // InternalTSSpec.g:2270:1: ( 'event' )
            {
            // InternalTSSpec.g:2270:1: ( 'event' )
            // InternalTSSpec.g:2271:1: 'event'
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
    // InternalTSSpec.g:2284:1: rule__EventDef__Group__2 : rule__EventDef__Group__2__Impl rule__EventDef__Group__3 ;
    public final void rule__EventDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2288:1: ( rule__EventDef__Group__2__Impl rule__EventDef__Group__3 )
            // InternalTSSpec.g:2289:2: rule__EventDef__Group__2__Impl rule__EventDef__Group__3
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
    // InternalTSSpec.g:2296:1: rule__EventDef__Group__2__Impl : ( ( rule__EventDef__NameAssignment_2 ) ) ;
    public final void rule__EventDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2300:1: ( ( ( rule__EventDef__NameAssignment_2 ) ) )
            // InternalTSSpec.g:2301:1: ( ( rule__EventDef__NameAssignment_2 ) )
            {
            // InternalTSSpec.g:2301:1: ( ( rule__EventDef__NameAssignment_2 ) )
            // InternalTSSpec.g:2302:1: ( rule__EventDef__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getNameAssignment_2()); 
            }
            // InternalTSSpec.g:2303:1: ( rule__EventDef__NameAssignment_2 )
            // InternalTSSpec.g:2303:2: rule__EventDef__NameAssignment_2
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
    // InternalTSSpec.g:2313:1: rule__EventDef__Group__3 : rule__EventDef__Group__3__Impl ;
    public final void rule__EventDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2317:1: ( rule__EventDef__Group__3__Impl )
            // InternalTSSpec.g:2318:2: rule__EventDef__Group__3__Impl
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
    // InternalTSSpec.g:2324:1: rule__EventDef__Group__3__Impl : ( ( rule__EventDef__TypeAssignment_3 ) ) ;
    public final void rule__EventDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2328:1: ( ( ( rule__EventDef__TypeAssignment_3 ) ) )
            // InternalTSSpec.g:2329:1: ( ( rule__EventDef__TypeAssignment_3 ) )
            {
            // InternalTSSpec.g:2329:1: ( ( rule__EventDef__TypeAssignment_3 ) )
            // InternalTSSpec.g:2330:1: ( rule__EventDef__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDefAccess().getTypeAssignment_3()); 
            }
            // InternalTSSpec.g:2331:1: ( rule__EventDef__TypeAssignment_3 )
            // InternalTSSpec.g:2331:2: rule__EventDef__TypeAssignment_3
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
    // InternalTSSpec.g:2349:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2353:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTSSpec.g:2354:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalTSSpec.g:2361:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2365:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2366:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2366:1: ( RULE_ID )
            // InternalTSSpec.g:2367:1: RULE_ID
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
    // InternalTSSpec.g:2378:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2382:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTSSpec.g:2383:2: rule__QualifiedName__Group__1__Impl
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
    // InternalTSSpec.g:2389:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2393:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTSSpec.g:2394:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTSSpec.g:2394:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTSSpec.g:2395:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalTSSpec.g:2396:1: ( rule__QualifiedName__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTSSpec.g:2396:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalTSSpec.g:2410:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2414:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTSSpec.g:2415:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalTSSpec.g:2422:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2426:1: ( ( ( '.' ) ) )
            // InternalTSSpec.g:2427:1: ( ( '.' ) )
            {
            // InternalTSSpec.g:2427:1: ( ( '.' ) )
            // InternalTSSpec.g:2428:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalTSSpec.g:2429:1: ( '.' )
            // InternalTSSpec.g:2430:2: '.'
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
    // InternalTSSpec.g:2441:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2445:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTSSpec.g:2446:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalTSSpec.g:2452:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2456:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2457:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2457:1: ( RULE_ID )
            // InternalTSSpec.g:2458:1: RULE_ID
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
    // InternalTSSpec.g:2474:1: rule__ServiceDefs__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ServiceDefs__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2478:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2479:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2479:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2480:1: ruleQualifiedName
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
    // InternalTSSpec.g:2489:1: rule__ServiceDefs__DomainElementsAssignment_2 : ( ruleDomainElement ) ;
    public final void rule__ServiceDefs__DomainElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2493:1: ( ( ruleDomainElement ) )
            // InternalTSSpec.g:2494:1: ( ruleDomainElement )
            {
            // InternalTSSpec.g:2494:1: ( ruleDomainElement )
            // InternalTSSpec.g:2495:1: ruleDomainElement
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
    // InternalTSSpec.g:2504:1: rule__ServiceDefs__ServiceDefsAssignment_3 : ( ruleServiceDef ) ;
    public final void rule__ServiceDefs__ServiceDefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2508:1: ( ( ruleServiceDef ) )
            // InternalTSSpec.g:2509:1: ( ruleServiceDef )
            {
            // InternalTSSpec.g:2509:1: ( ruleServiceDef )
            // InternalTSSpec.g:2510:1: ruleServiceDef
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
    // InternalTSSpec.g:2519:1: rule__DomainElement__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__DomainElement__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2523:1: ( ( RULE_DOC ) )
            // InternalTSSpec.g:2524:1: ( RULE_DOC )
            {
            // InternalTSSpec.g:2524:1: ( RULE_DOC )
            // InternalTSSpec.g:2525:1: RULE_DOC
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
    // InternalTSSpec.g:2534:1: rule__DomainElement__NameAssignment_1_0_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2538:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2539:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2539:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2540:1: ruleQualifiedName
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
    // InternalTSSpec.g:2549:1: rule__DomainElement__CustAssignment_1_1_0 : ( ( 'cust' ) ) ;
    public final void rule__DomainElement__CustAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2553:1: ( ( ( 'cust' ) ) )
            // InternalTSSpec.g:2554:1: ( ( 'cust' ) )
            {
            // InternalTSSpec.g:2554:1: ( ( 'cust' ) )
            // InternalTSSpec.g:2555:1: ( 'cust' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }
            // InternalTSSpec.g:2556:1: ( 'cust' )
            // InternalTSSpec.g:2557:1: 'cust'
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
    // InternalTSSpec.g:2572:1: rule__DomainElement__NameAssignment_1_1_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2576:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2577:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2577:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2578:1: ruleQualifiedName
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
    // InternalTSSpec.g:2587:1: rule__DomainElement__SuperTypeAssignment_1_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DomainElement__SuperTypeAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2591:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTSSpec.g:2592:1: ( ( ruleQualifiedName ) )
            {
            // InternalTSSpec.g:2592:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2593:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
            }
            // InternalTSSpec.g:2594:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2595:1: ruleQualifiedName
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
    // InternalTSSpec.g:2606:1: rule__DomainElement__AttributesAssignment_1_1_4 : ( ruleAttribute ) ;
    public final void rule__DomainElement__AttributesAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2610:1: ( ( ruleAttribute ) )
            // InternalTSSpec.g:2611:1: ( ruleAttribute )
            {
            // InternalTSSpec.g:2611:1: ( ruleAttribute )
            // InternalTSSpec.g:2612:1: ruleAttribute
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
    // InternalTSSpec.g:2621:1: rule__DomainElement__IsEnumAssignment_1_2_0 : ( ( 'enum' ) ) ;
    public final void rule__DomainElement__IsEnumAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2625:1: ( ( ( 'enum' ) ) )
            // InternalTSSpec.g:2626:1: ( ( 'enum' ) )
            {
            // InternalTSSpec.g:2626:1: ( ( 'enum' ) )
            // InternalTSSpec.g:2627:1: ( 'enum' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getIsEnumEnumKeyword_1_2_0_0()); 
            }
            // InternalTSSpec.g:2628:1: ( 'enum' )
            // InternalTSSpec.g:2629:1: 'enum'
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
    // InternalTSSpec.g:2644:1: rule__DomainElement__NameAssignment_1_2_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2648:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2649:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2649:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2650:1: ruleQualifiedName
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
    // InternalTSSpec.g:2659:1: rule__DomainElement__EnumValuesAssignment_1_2_3 : ( ruleEnumVal ) ;
    public final void rule__DomainElement__EnumValuesAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2663:1: ( ( ruleEnumVal ) )
            // InternalTSSpec.g:2664:1: ( ruleEnumVal )
            {
            // InternalTSSpec.g:2664:1: ( ruleEnumVal )
            // InternalTSSpec.g:2665:1: ruleEnumVal
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
    // InternalTSSpec.g:2674:1: rule__DomainElement__NameAssignment_1_3_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2678:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2679:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2679:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2680:1: ruleQualifiedName
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
    // InternalTSSpec.g:2689:1: rule__DomainElement__RealTypeAssignment_1_3_3 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__RealTypeAssignment_1_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2693:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2694:1: ( ruleQualifiedName )
            {
            // InternalTSSpec.g:2694:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2695:1: ruleQualifiedName
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
    // InternalTSSpec.g:2704:1: rule__EnumVal__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EnumVal__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2708:1: ( ( RULE_DOC ) )
            // InternalTSSpec.g:2709:1: ( RULE_DOC )
            {
            // InternalTSSpec.g:2709:1: ( RULE_DOC )
            // InternalTSSpec.g:2710:1: RULE_DOC
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
    // InternalTSSpec.g:2719:1: rule__EnumVal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumVal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2723:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2724:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2724:1: ( RULE_ID )
            // InternalTSSpec.g:2725:1: RULE_ID
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


    // $ANTLR start "rule__EnumVal__ValueAssignment_3"
    // InternalTSSpec.g:2734:1: rule__EnumVal__ValueAssignment_3 : ( ( rule__EnumVal__ValueAlternatives_3_0 ) ) ;
    public final void rule__EnumVal__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2738:1: ( ( ( rule__EnumVal__ValueAlternatives_3_0 ) ) )
            // InternalTSSpec.g:2739:1: ( ( rule__EnumVal__ValueAlternatives_3_0 ) )
            {
            // InternalTSSpec.g:2739:1: ( ( rule__EnumVal__ValueAlternatives_3_0 ) )
            // InternalTSSpec.g:2740:1: ( rule__EnumVal__ValueAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getValueAlternatives_3_0()); 
            }
            // InternalTSSpec.g:2741:1: ( rule__EnumVal__ValueAlternatives_3_0 )
            // InternalTSSpec.g:2741:2: rule__EnumVal__ValueAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumVal__ValueAlternatives_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getValueAlternatives_3_0()); 
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
    // $ANTLR end "rule__EnumVal__ValueAssignment_3"


    // $ANTLR start "rule__Attribute__DocumentationAssignment_0"
    // InternalTSSpec.g:2750:1: rule__Attribute__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Attribute__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2754:1: ( ( RULE_DOC ) )
            // InternalTSSpec.g:2755:1: ( RULE_DOC )
            {
            // InternalTSSpec.g:2755:1: ( RULE_DOC )
            // InternalTSSpec.g:2756:1: RULE_DOC
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
    // InternalTSSpec.g:2765:1: rule__Attribute__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__Attribute__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2769:1: ( ( ( 'optional' ) ) )
            // InternalTSSpec.g:2770:1: ( ( 'optional' ) )
            {
            // InternalTSSpec.g:2770:1: ( ( 'optional' ) )
            // InternalTSSpec.g:2771:1: ( 'optional' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }
            // InternalTSSpec.g:2772:1: ( 'optional' )
            // InternalTSSpec.g:2773:1: 'optional'
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
    // InternalTSSpec.g:2788:1: rule__Attribute__TypeAssignment_2 : ( ruleGenericTypeArgument ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2792:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:2793:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:2793:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:2794:1: ruleGenericTypeArgument
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
    // InternalTSSpec.g:2803:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2807:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2808:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2808:1: ( RULE_ID )
            // InternalTSSpec.g:2809:1: RULE_ID
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
    // InternalTSSpec.g:2818:1: rule__Attribute__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2822:1: ( ( RULE_STRING ) )
            // InternalTSSpec.g:2823:1: ( RULE_STRING )
            {
            // InternalTSSpec.g:2823:1: ( RULE_STRING )
            // InternalTSSpec.g:2824:1: RULE_STRING
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
    // InternalTSSpec.g:2833:1: rule__GenericTypeArgument__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GenericTypeArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2837:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTSSpec.g:2838:1: ( ( ruleQualifiedName ) )
            {
            // InternalTSSpec.g:2838:1: ( ( ruleQualifiedName ) )
            // InternalTSSpec.g:2839:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
            }
            // InternalTSSpec.g:2840:1: ( ruleQualifiedName )
            // InternalTSSpec.g:2841:1: ruleQualifiedName
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
    // InternalTSSpec.g:2852:1: rule__GenericTypeArgument__ArgumentsAssignment_1_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__GenericTypeArgument__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2856:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:2857:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:2857:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:2858:1: ruleGenericTypeArgument
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
    // InternalTSSpec.g:2867:1: rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__GenericTypeArgument__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2871:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:2872:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:2872:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:2873:1: ruleGenericTypeArgument
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
    // InternalTSSpec.g:2882:1: rule__GenericTypeArgument__ListAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__GenericTypeArgument__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2886:1: ( ( ( '[]' ) ) )
            // InternalTSSpec.g:2887:1: ( ( '[]' ) )
            {
            // InternalTSSpec.g:2887:1: ( ( '[]' ) )
            // InternalTSSpec.g:2888:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            // InternalTSSpec.g:2889:1: ( '[]' )
            // InternalTSSpec.g:2890:1: '[]'
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
    // InternalTSSpec.g:2905:1: rule__ServiceDef__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ServiceDef__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2909:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2910:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2910:1: ( RULE_ID )
            // InternalTSSpec.g:2911:1: RULE_ID
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
    // InternalTSSpec.g:2920:1: rule__ServiceDef__CommandListAssignment_2 : ( ruleCommandDef ) ;
    public final void rule__ServiceDef__CommandListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2924:1: ( ( ruleCommandDef ) )
            // InternalTSSpec.g:2925:1: ( ruleCommandDef )
            {
            // InternalTSSpec.g:2925:1: ( ruleCommandDef )
            // InternalTSSpec.g:2926:1: ruleCommandDef
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
    // InternalTSSpec.g:2935:1: rule__ServiceDef__EventListAssignment_3 : ( ruleEventDef ) ;
    public final void rule__ServiceDef__EventListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2939:1: ( ( ruleEventDef ) )
            // InternalTSSpec.g:2940:1: ( ruleEventDef )
            {
            // InternalTSSpec.g:2940:1: ( ruleEventDef )
            // InternalTSSpec.g:2941:1: ruleEventDef
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
    // InternalTSSpec.g:2950:1: rule__CommandDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommandDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2954:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:2955:1: ( RULE_ID )
            {
            // InternalTSSpec.g:2955:1: ( RULE_ID )
            // InternalTSSpec.g:2956:1: RULE_ID
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
    // InternalTSSpec.g:2965:1: rule__CommandDef__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__CommandDef__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2969:1: ( ( ruleAttribute ) )
            // InternalTSSpec.g:2970:1: ( ruleAttribute )
            {
            // InternalTSSpec.g:2970:1: ( ruleAttribute )
            // InternalTSSpec.g:2971:1: ruleAttribute
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
    // InternalTSSpec.g:2980:1: rule__CommandDef__ReturnValAssignment_4_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__CommandDef__ReturnValAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2984:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:2985:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:2985:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:2986:1: ruleGenericTypeArgument
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
    // InternalTSSpec.g:2995:1: rule__EventDef__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EventDef__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:2999:1: ( ( RULE_DOC ) )
            // InternalTSSpec.g:3000:1: ( RULE_DOC )
            {
            // InternalTSSpec.g:3000:1: ( RULE_DOC )
            // InternalTSSpec.g:3001:1: RULE_DOC
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
    // InternalTSSpec.g:3010:1: rule__EventDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:3014:1: ( ( RULE_ID ) )
            // InternalTSSpec.g:3015:1: ( RULE_ID )
            {
            // InternalTSSpec.g:3015:1: ( RULE_ID )
            // InternalTSSpec.g:3016:1: RULE_ID
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
    // InternalTSSpec.g:3025:1: rule__EventDef__TypeAssignment_3 : ( ruleGenericTypeArgument ) ;
    public final void rule__EventDef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalTSSpec.g:3029:1: ( ( ruleGenericTypeArgument ) )
            // InternalTSSpec.g:3030:1: ( ruleGenericTypeArgument )
            {
            // InternalTSSpec.g:3030:1: ( ruleGenericTypeArgument )
            // InternalTSSpec.g:3031:1: ruleGenericTypeArgument
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
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