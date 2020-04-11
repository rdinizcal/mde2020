package org.xtext.assignment3.msdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.assignment3.msdsl.services.MSDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'or'", "'ManufacturingSystem'", "'{'", "'start'", "'('", "')'", "'end'", "'consistsOf'", "'}'", "','", "'responsible'", "'workPieceTypes'", "'initialWorkPieces'", "'staff'", "'ManufacturingSystemElement'", "'transition'", "'StoragePoint'", "'stores'", "'WorkPiece'", "'of'", "'type'", "'ManufacturingStep'", "'inputConditions'", "'transforms'", "'speed'", "'TransportStep'", "'transports'", "'QualityAssuranceStep'", "'verifies'", "'CompositeManufacturingStep'", "'contains'", "'-'", "'InputCondition'", "'into'", "'WorkPieceCondition'", "'ofType'", "'BinaryCondition'", "'!'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalMSDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSDsl.g"; }


    	private MSDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MSDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleManufacturingSystem"
    // InternalMSDsl.g:53:1: entryRuleManufacturingSystem : ruleManufacturingSystem EOF ;
    public final void entryRuleManufacturingSystem() throws RecognitionException {
        try {
            // InternalMSDsl.g:54:1: ( ruleManufacturingSystem EOF )
            // InternalMSDsl.g:55:1: ruleManufacturingSystem EOF
            {
             before(grammarAccess.getManufacturingSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleManufacturingSystem();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManufacturingSystem"


    // $ANTLR start "ruleManufacturingSystem"
    // InternalMSDsl.g:62:1: ruleManufacturingSystem : ( ( rule__ManufacturingSystem__Group__0 ) ) ;
    public final void ruleManufacturingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:66:2: ( ( ( rule__ManufacturingSystem__Group__0 ) ) )
            // InternalMSDsl.g:67:2: ( ( rule__ManufacturingSystem__Group__0 ) )
            {
            // InternalMSDsl.g:67:2: ( ( rule__ManufacturingSystem__Group__0 ) )
            // InternalMSDsl.g:68:3: ( rule__ManufacturingSystem__Group__0 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup()); 
            // InternalMSDsl.g:69:3: ( rule__ManufacturingSystem__Group__0 )
            // InternalMSDsl.g:69:4: rule__ManufacturingSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturingSystem"


    // $ANTLR start "entryRuleManufacturingSystemElement"
    // InternalMSDsl.g:78:1: entryRuleManufacturingSystemElement : ruleManufacturingSystemElement EOF ;
    public final void entryRuleManufacturingSystemElement() throws RecognitionException {
        try {
            // InternalMSDsl.g:79:1: ( ruleManufacturingSystemElement EOF )
            // InternalMSDsl.g:80:1: ruleManufacturingSystemElement EOF
            {
             before(grammarAccess.getManufacturingSystemElementRule()); 
            pushFollow(FOLLOW_1);
            ruleManufacturingSystemElement();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManufacturingSystemElement"


    // $ANTLR start "ruleManufacturingSystemElement"
    // InternalMSDsl.g:87:1: ruleManufacturingSystemElement : ( ( rule__ManufacturingSystemElement__Alternatives ) ) ;
    public final void ruleManufacturingSystemElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:91:2: ( ( ( rule__ManufacturingSystemElement__Alternatives ) ) )
            // InternalMSDsl.g:92:2: ( ( rule__ManufacturingSystemElement__Alternatives ) )
            {
            // InternalMSDsl.g:92:2: ( ( rule__ManufacturingSystemElement__Alternatives ) )
            // InternalMSDsl.g:93:3: ( rule__ManufacturingSystemElement__Alternatives )
            {
             before(grammarAccess.getManufacturingSystemElementAccess().getAlternatives()); 
            // InternalMSDsl.g:94:3: ( rule__ManufacturingSystemElement__Alternatives )
            // InternalMSDsl.g:94:4: rule__ManufacturingSystemElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturingSystemElement"


    // $ANTLR start "entryRuleInputCondition"
    // InternalMSDsl.g:103:1: entryRuleInputCondition : ruleInputCondition EOF ;
    public final void entryRuleInputCondition() throws RecognitionException {
        try {
            // InternalMSDsl.g:104:1: ( ruleInputCondition EOF )
            // InternalMSDsl.g:105:1: ruleInputCondition EOF
            {
             before(grammarAccess.getInputConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getInputConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputCondition"


    // $ANTLR start "ruleInputCondition"
    // InternalMSDsl.g:112:1: ruleInputCondition : ( ( rule__InputCondition__Alternatives ) ) ;
    public final void ruleInputCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:116:2: ( ( ( rule__InputCondition__Alternatives ) ) )
            // InternalMSDsl.g:117:2: ( ( rule__InputCondition__Alternatives ) )
            {
            // InternalMSDsl.g:117:2: ( ( rule__InputCondition__Alternatives ) )
            // InternalMSDsl.g:118:3: ( rule__InputCondition__Alternatives )
            {
             before(grammarAccess.getInputConditionAccess().getAlternatives()); 
            // InternalMSDsl.g:119:3: ( rule__InputCondition__Alternatives )
            // InternalMSDsl.g:119:4: rule__InputCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputCondition"


    // $ANTLR start "entryRuleManufacturingSystemElement_Impl"
    // InternalMSDsl.g:128:1: entryRuleManufacturingSystemElement_Impl : ruleManufacturingSystemElement_Impl EOF ;
    public final void entryRuleManufacturingSystemElement_Impl() throws RecognitionException {
        try {
            // InternalMSDsl.g:129:1: ( ruleManufacturingSystemElement_Impl EOF )
            // InternalMSDsl.g:130:1: ruleManufacturingSystemElement_Impl EOF
            {
             before(grammarAccess.getManufacturingSystemElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleManufacturingSystemElement_Impl();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManufacturingSystemElement_Impl"


    // $ANTLR start "ruleManufacturingSystemElement_Impl"
    // InternalMSDsl.g:137:1: ruleManufacturingSystemElement_Impl : ( ( rule__ManufacturingSystemElement_Impl__Group__0 ) ) ;
    public final void ruleManufacturingSystemElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:141:2: ( ( ( rule__ManufacturingSystemElement_Impl__Group__0 ) ) )
            // InternalMSDsl.g:142:2: ( ( rule__ManufacturingSystemElement_Impl__Group__0 ) )
            {
            // InternalMSDsl.g:142:2: ( ( rule__ManufacturingSystemElement_Impl__Group__0 ) )
            // InternalMSDsl.g:143:3: ( rule__ManufacturingSystemElement_Impl__Group__0 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup()); 
            // InternalMSDsl.g:144:3: ( rule__ManufacturingSystemElement_Impl__Group__0 )
            // InternalMSDsl.g:144:4: rule__ManufacturingSystemElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturingSystemElement_Impl"


    // $ANTLR start "entryRuleStoragePoint"
    // InternalMSDsl.g:153:1: entryRuleStoragePoint : ruleStoragePoint EOF ;
    public final void entryRuleStoragePoint() throws RecognitionException {
        try {
            // InternalMSDsl.g:154:1: ( ruleStoragePoint EOF )
            // InternalMSDsl.g:155:1: ruleStoragePoint EOF
            {
             before(grammarAccess.getStoragePointRule()); 
            pushFollow(FOLLOW_1);
            ruleStoragePoint();

            state._fsp--;

             after(grammarAccess.getStoragePointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStoragePoint"


    // $ANTLR start "ruleStoragePoint"
    // InternalMSDsl.g:162:1: ruleStoragePoint : ( ( rule__StoragePoint__Group__0 ) ) ;
    public final void ruleStoragePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:166:2: ( ( ( rule__StoragePoint__Group__0 ) ) )
            // InternalMSDsl.g:167:2: ( ( rule__StoragePoint__Group__0 ) )
            {
            // InternalMSDsl.g:167:2: ( ( rule__StoragePoint__Group__0 ) )
            // InternalMSDsl.g:168:3: ( rule__StoragePoint__Group__0 )
            {
             before(grammarAccess.getStoragePointAccess().getGroup()); 
            // InternalMSDsl.g:169:3: ( rule__StoragePoint__Group__0 )
            // InternalMSDsl.g:169:4: rule__StoragePoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoragePoint"


    // $ANTLR start "entryRuleWorkPieceType"
    // InternalMSDsl.g:178:1: entryRuleWorkPieceType : ruleWorkPieceType EOF ;
    public final void entryRuleWorkPieceType() throws RecognitionException {
        try {
            // InternalMSDsl.g:179:1: ( ruleWorkPieceType EOF )
            // InternalMSDsl.g:180:1: ruleWorkPieceType EOF
            {
             before(grammarAccess.getWorkPieceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkPieceType();

            state._fsp--;

             after(grammarAccess.getWorkPieceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkPieceType"


    // $ANTLR start "ruleWorkPieceType"
    // InternalMSDsl.g:187:1: ruleWorkPieceType : ( ( rule__WorkPieceType__Group__0 ) ) ;
    public final void ruleWorkPieceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:191:2: ( ( ( rule__WorkPieceType__Group__0 ) ) )
            // InternalMSDsl.g:192:2: ( ( rule__WorkPieceType__Group__0 ) )
            {
            // InternalMSDsl.g:192:2: ( ( rule__WorkPieceType__Group__0 ) )
            // InternalMSDsl.g:193:3: ( rule__WorkPieceType__Group__0 )
            {
             before(grammarAccess.getWorkPieceTypeAccess().getGroup()); 
            // InternalMSDsl.g:194:3: ( rule__WorkPieceType__Group__0 )
            // InternalMSDsl.g:194:4: rule__WorkPieceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkPieceType"


    // $ANTLR start "entryRuleWorkPiece"
    // InternalMSDsl.g:203:1: entryRuleWorkPiece : ruleWorkPiece EOF ;
    public final void entryRuleWorkPiece() throws RecognitionException {
        try {
            // InternalMSDsl.g:204:1: ( ruleWorkPiece EOF )
            // InternalMSDsl.g:205:1: ruleWorkPiece EOF
            {
             before(grammarAccess.getWorkPieceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkPiece();

            state._fsp--;

             after(grammarAccess.getWorkPieceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkPiece"


    // $ANTLR start "ruleWorkPiece"
    // InternalMSDsl.g:212:1: ruleWorkPiece : ( ( rule__WorkPiece__Group__0 ) ) ;
    public final void ruleWorkPiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:216:2: ( ( ( rule__WorkPiece__Group__0 ) ) )
            // InternalMSDsl.g:217:2: ( ( rule__WorkPiece__Group__0 ) )
            {
            // InternalMSDsl.g:217:2: ( ( rule__WorkPiece__Group__0 ) )
            // InternalMSDsl.g:218:3: ( rule__WorkPiece__Group__0 )
            {
             before(grammarAccess.getWorkPieceAccess().getGroup()); 
            // InternalMSDsl.g:219:3: ( rule__WorkPiece__Group__0 )
            // InternalMSDsl.g:219:4: rule__WorkPiece__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkPiece"


    // $ANTLR start "entryRuleEString"
    // InternalMSDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMSDsl.g:229:1: ( ruleEString EOF )
            // InternalMSDsl.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMSDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMSDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMSDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalMSDsl.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMSDsl.g:244:3: ( rule__EString__Alternatives )
            // InternalMSDsl.g:244:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleResponsible"
    // InternalMSDsl.g:253:1: entryRuleResponsible : ruleResponsible EOF ;
    public final void entryRuleResponsible() throws RecognitionException {
        try {
            // InternalMSDsl.g:254:1: ( ruleResponsible EOF )
            // InternalMSDsl.g:255:1: ruleResponsible EOF
            {
             before(grammarAccess.getResponsibleRule()); 
            pushFollow(FOLLOW_1);
            ruleResponsible();

            state._fsp--;

             after(grammarAccess.getResponsibleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResponsible"


    // $ANTLR start "ruleResponsible"
    // InternalMSDsl.g:262:1: ruleResponsible : ( ( rule__Responsible__Group__0 ) ) ;
    public final void ruleResponsible() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:266:2: ( ( ( rule__Responsible__Group__0 ) ) )
            // InternalMSDsl.g:267:2: ( ( rule__Responsible__Group__0 ) )
            {
            // InternalMSDsl.g:267:2: ( ( rule__Responsible__Group__0 ) )
            // InternalMSDsl.g:268:3: ( rule__Responsible__Group__0 )
            {
             before(grammarAccess.getResponsibleAccess().getGroup()); 
            // InternalMSDsl.g:269:3: ( rule__Responsible__Group__0 )
            // InternalMSDsl.g:269:4: rule__Responsible__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Responsible__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponsibleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponsible"


    // $ANTLR start "entryRuleManufacturingStep"
    // InternalMSDsl.g:278:1: entryRuleManufacturingStep : ruleManufacturingStep EOF ;
    public final void entryRuleManufacturingStep() throws RecognitionException {
        try {
            // InternalMSDsl.g:279:1: ( ruleManufacturingStep EOF )
            // InternalMSDsl.g:280:1: ruleManufacturingStep EOF
            {
             before(grammarAccess.getManufacturingStepRule()); 
            pushFollow(FOLLOW_1);
            ruleManufacturingStep();

            state._fsp--;

             after(grammarAccess.getManufacturingStepRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManufacturingStep"


    // $ANTLR start "ruleManufacturingStep"
    // InternalMSDsl.g:287:1: ruleManufacturingStep : ( ( rule__ManufacturingStep__Group__0 ) ) ;
    public final void ruleManufacturingStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:291:2: ( ( ( rule__ManufacturingStep__Group__0 ) ) )
            // InternalMSDsl.g:292:2: ( ( rule__ManufacturingStep__Group__0 ) )
            {
            // InternalMSDsl.g:292:2: ( ( rule__ManufacturingStep__Group__0 ) )
            // InternalMSDsl.g:293:3: ( rule__ManufacturingStep__Group__0 )
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup()); 
            // InternalMSDsl.g:294:3: ( rule__ManufacturingStep__Group__0 )
            // InternalMSDsl.g:294:4: rule__ManufacturingStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturingStep"


    // $ANTLR start "entryRuleTransportStep"
    // InternalMSDsl.g:303:1: entryRuleTransportStep : ruleTransportStep EOF ;
    public final void entryRuleTransportStep() throws RecognitionException {
        try {
            // InternalMSDsl.g:304:1: ( ruleTransportStep EOF )
            // InternalMSDsl.g:305:1: ruleTransportStep EOF
            {
             before(grammarAccess.getTransportStepRule()); 
            pushFollow(FOLLOW_1);
            ruleTransportStep();

            state._fsp--;

             after(grammarAccess.getTransportStepRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransportStep"


    // $ANTLR start "ruleTransportStep"
    // InternalMSDsl.g:312:1: ruleTransportStep : ( ( rule__TransportStep__Group__0 ) ) ;
    public final void ruleTransportStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:316:2: ( ( ( rule__TransportStep__Group__0 ) ) )
            // InternalMSDsl.g:317:2: ( ( rule__TransportStep__Group__0 ) )
            {
            // InternalMSDsl.g:317:2: ( ( rule__TransportStep__Group__0 ) )
            // InternalMSDsl.g:318:3: ( rule__TransportStep__Group__0 )
            {
             before(grammarAccess.getTransportStepAccess().getGroup()); 
            // InternalMSDsl.g:319:3: ( rule__TransportStep__Group__0 )
            // InternalMSDsl.g:319:4: rule__TransportStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransportStep"


    // $ANTLR start "entryRuleQualityAssuranceStep"
    // InternalMSDsl.g:328:1: entryRuleQualityAssuranceStep : ruleQualityAssuranceStep EOF ;
    public final void entryRuleQualityAssuranceStep() throws RecognitionException {
        try {
            // InternalMSDsl.g:329:1: ( ruleQualityAssuranceStep EOF )
            // InternalMSDsl.g:330:1: ruleQualityAssuranceStep EOF
            {
             before(grammarAccess.getQualityAssuranceStepRule()); 
            pushFollow(FOLLOW_1);
            ruleQualityAssuranceStep();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualityAssuranceStep"


    // $ANTLR start "ruleQualityAssuranceStep"
    // InternalMSDsl.g:337:1: ruleQualityAssuranceStep : ( ( rule__QualityAssuranceStep__Group__0 ) ) ;
    public final void ruleQualityAssuranceStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:341:2: ( ( ( rule__QualityAssuranceStep__Group__0 ) ) )
            // InternalMSDsl.g:342:2: ( ( rule__QualityAssuranceStep__Group__0 ) )
            {
            // InternalMSDsl.g:342:2: ( ( rule__QualityAssuranceStep__Group__0 ) )
            // InternalMSDsl.g:343:3: ( rule__QualityAssuranceStep__Group__0 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup()); 
            // InternalMSDsl.g:344:3: ( rule__QualityAssuranceStep__Group__0 )
            // InternalMSDsl.g:344:4: rule__QualityAssuranceStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualityAssuranceStep"


    // $ANTLR start "entryRuleCompositeManufacturingStep"
    // InternalMSDsl.g:353:1: entryRuleCompositeManufacturingStep : ruleCompositeManufacturingStep EOF ;
    public final void entryRuleCompositeManufacturingStep() throws RecognitionException {
        try {
            // InternalMSDsl.g:354:1: ( ruleCompositeManufacturingStep EOF )
            // InternalMSDsl.g:355:1: ruleCompositeManufacturingStep EOF
            {
             before(grammarAccess.getCompositeManufacturingStepRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeManufacturingStep();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeManufacturingStep"


    // $ANTLR start "ruleCompositeManufacturingStep"
    // InternalMSDsl.g:362:1: ruleCompositeManufacturingStep : ( ( rule__CompositeManufacturingStep__Group__0 ) ) ;
    public final void ruleCompositeManufacturingStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:366:2: ( ( ( rule__CompositeManufacturingStep__Group__0 ) ) )
            // InternalMSDsl.g:367:2: ( ( rule__CompositeManufacturingStep__Group__0 ) )
            {
            // InternalMSDsl.g:367:2: ( ( rule__CompositeManufacturingStep__Group__0 ) )
            // InternalMSDsl.g:368:3: ( rule__CompositeManufacturingStep__Group__0 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup()); 
            // InternalMSDsl.g:369:3: ( rule__CompositeManufacturingStep__Group__0 )
            // InternalMSDsl.g:369:4: rule__CompositeManufacturingStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeManufacturingStep"


    // $ANTLR start "entryRuleEInt"
    // InternalMSDsl.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMSDsl.g:379:1: ( ruleEInt EOF )
            // InternalMSDsl.g:380:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMSDsl.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMSDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMSDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalMSDsl.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMSDsl.g:394:3: ( rule__EInt__Group__0 )
            // InternalMSDsl.g:394:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInputCondition_Impl"
    // InternalMSDsl.g:403:1: entryRuleInputCondition_Impl : ruleInputCondition_Impl EOF ;
    public final void entryRuleInputCondition_Impl() throws RecognitionException {
        try {
            // InternalMSDsl.g:404:1: ( ruleInputCondition_Impl EOF )
            // InternalMSDsl.g:405:1: ruleInputCondition_Impl EOF
            {
             before(grammarAccess.getInputCondition_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleInputCondition_Impl();

            state._fsp--;

             after(grammarAccess.getInputCondition_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputCondition_Impl"


    // $ANTLR start "ruleInputCondition_Impl"
    // InternalMSDsl.g:412:1: ruleInputCondition_Impl : ( ( rule__InputCondition_Impl__Group__0 ) ) ;
    public final void ruleInputCondition_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:416:2: ( ( ( rule__InputCondition_Impl__Group__0 ) ) )
            // InternalMSDsl.g:417:2: ( ( rule__InputCondition_Impl__Group__0 ) )
            {
            // InternalMSDsl.g:417:2: ( ( rule__InputCondition_Impl__Group__0 ) )
            // InternalMSDsl.g:418:3: ( rule__InputCondition_Impl__Group__0 )
            {
             before(grammarAccess.getInputCondition_ImplAccess().getGroup()); 
            // InternalMSDsl.g:419:3: ( rule__InputCondition_Impl__Group__0 )
            // InternalMSDsl.g:419:4: rule__InputCondition_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputCondition_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputCondition_Impl"


    // $ANTLR start "entryRuleOutputDecision"
    // InternalMSDsl.g:428:1: entryRuleOutputDecision : ruleOutputDecision EOF ;
    public final void entryRuleOutputDecision() throws RecognitionException {
        try {
            // InternalMSDsl.g:429:1: ( ruleOutputDecision EOF )
            // InternalMSDsl.g:430:1: ruleOutputDecision EOF
            {
             before(grammarAccess.getOutputDecisionRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getOutputDecisionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutputDecision"


    // $ANTLR start "ruleOutputDecision"
    // InternalMSDsl.g:437:1: ruleOutputDecision : ( ( rule__OutputDecision__Group__0 ) ) ;
    public final void ruleOutputDecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:441:2: ( ( ( rule__OutputDecision__Group__0 ) ) )
            // InternalMSDsl.g:442:2: ( ( rule__OutputDecision__Group__0 ) )
            {
            // InternalMSDsl.g:442:2: ( ( rule__OutputDecision__Group__0 ) )
            // InternalMSDsl.g:443:3: ( rule__OutputDecision__Group__0 )
            {
             before(grammarAccess.getOutputDecisionAccess().getGroup()); 
            // InternalMSDsl.g:444:3: ( rule__OutputDecision__Group__0 )
            // InternalMSDsl.g:444:4: rule__OutputDecision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputDecisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputDecision"


    // $ANTLR start "entryRuleWorkPieceCondition"
    // InternalMSDsl.g:453:1: entryRuleWorkPieceCondition : ruleWorkPieceCondition EOF ;
    public final void entryRuleWorkPieceCondition() throws RecognitionException {
        try {
            // InternalMSDsl.g:454:1: ( ruleWorkPieceCondition EOF )
            // InternalMSDsl.g:455:1: ruleWorkPieceCondition EOF
            {
             before(grammarAccess.getWorkPieceConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkPieceCondition();

            state._fsp--;

             after(grammarAccess.getWorkPieceConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkPieceCondition"


    // $ANTLR start "ruleWorkPieceCondition"
    // InternalMSDsl.g:462:1: ruleWorkPieceCondition : ( ( rule__WorkPieceCondition__Group__0 ) ) ;
    public final void ruleWorkPieceCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:466:2: ( ( ( rule__WorkPieceCondition__Group__0 ) ) )
            // InternalMSDsl.g:467:2: ( ( rule__WorkPieceCondition__Group__0 ) )
            {
            // InternalMSDsl.g:467:2: ( ( rule__WorkPieceCondition__Group__0 ) )
            // InternalMSDsl.g:468:3: ( rule__WorkPieceCondition__Group__0 )
            {
             before(grammarAccess.getWorkPieceConditionAccess().getGroup()); 
            // InternalMSDsl.g:469:3: ( rule__WorkPieceCondition__Group__0 )
            // InternalMSDsl.g:469:4: rule__WorkPieceCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkPieceCondition"


    // $ANTLR start "entryRuleBinaryCondition"
    // InternalMSDsl.g:478:1: entryRuleBinaryCondition : ruleBinaryCondition EOF ;
    public final void entryRuleBinaryCondition() throws RecognitionException {
        try {
            // InternalMSDsl.g:479:1: ( ruleBinaryCondition EOF )
            // InternalMSDsl.g:480:1: ruleBinaryCondition EOF
            {
             before(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryCondition();

            state._fsp--;

             after(grammarAccess.getBinaryConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // InternalMSDsl.g:487:1: ruleBinaryCondition : ( ( rule__BinaryCondition__Group__0 ) ) ;
    public final void ruleBinaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:491:2: ( ( ( rule__BinaryCondition__Group__0 ) ) )
            // InternalMSDsl.g:492:2: ( ( rule__BinaryCondition__Group__0 ) )
            {
            // InternalMSDsl.g:492:2: ( ( rule__BinaryCondition__Group__0 ) )
            // InternalMSDsl.g:493:3: ( rule__BinaryCondition__Group__0 )
            {
             before(grammarAccess.getBinaryConditionAccess().getGroup()); 
            // InternalMSDsl.g:494:3: ( rule__BinaryCondition__Group__0 )
            // InternalMSDsl.g:494:4: rule__BinaryCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "entryRuleNegation"
    // InternalMSDsl.g:503:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalMSDsl.g:504:1: ( ruleNegation EOF )
            // InternalMSDsl.g:505:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMSDsl.g:512:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:516:2: ( ( ( rule__Negation__Group__0 ) ) )
            // InternalMSDsl.g:517:2: ( ( rule__Negation__Group__0 ) )
            {
            // InternalMSDsl.g:517:2: ( ( rule__Negation__Group__0 ) )
            // InternalMSDsl.g:518:3: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // InternalMSDsl.g:519:3: ( rule__Negation__Group__0 )
            // InternalMSDsl.g:519:4: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "ruleBinaryType"
    // InternalMSDsl.g:528:1: ruleBinaryType : ( ( rule__BinaryType__Alternatives ) ) ;
    public final void ruleBinaryType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:532:1: ( ( ( rule__BinaryType__Alternatives ) ) )
            // InternalMSDsl.g:533:2: ( ( rule__BinaryType__Alternatives ) )
            {
            // InternalMSDsl.g:533:2: ( ( rule__BinaryType__Alternatives ) )
            // InternalMSDsl.g:534:3: ( rule__BinaryType__Alternatives )
            {
             before(grammarAccess.getBinaryTypeAccess().getAlternatives()); 
            // InternalMSDsl.g:535:3: ( rule__BinaryType__Alternatives )
            // InternalMSDsl.g:535:4: rule__BinaryType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryType"


    // $ANTLR start "rule__ManufacturingSystemElement__Alternatives"
    // InternalMSDsl.g:543:1: rule__ManufacturingSystemElement__Alternatives : ( ( ruleManufacturingSystemElement_Impl ) | ( ruleManufacturingStep ) | ( ruleTransportStep ) | ( ruleQualityAssuranceStep ) | ( ruleStoragePoint ) | ( ruleCompositeManufacturingStep ) );
    public final void rule__ManufacturingSystemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:547:1: ( ( ruleManufacturingSystemElement_Impl ) | ( ruleManufacturingStep ) | ( ruleTransportStep ) | ( ruleQualityAssuranceStep ) | ( ruleStoragePoint ) | ( ruleCompositeManufacturingStep ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 39:
                {
                alt1=4;
                }
                break;
            case 28:
                {
                alt1=5;
                }
                break;
            case 41:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMSDsl.g:548:2: ( ruleManufacturingSystemElement_Impl )
                    {
                    // InternalMSDsl.g:548:2: ( ruleManufacturingSystemElement_Impl )
                    // InternalMSDsl.g:549:3: ruleManufacturingSystemElement_Impl
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getManufacturingSystemElement_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleManufacturingSystemElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getManufacturingSystemElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSDsl.g:554:2: ( ruleManufacturingStep )
                    {
                    // InternalMSDsl.g:554:2: ( ruleManufacturingStep )
                    // InternalMSDsl.g:555:3: ruleManufacturingStep
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getManufacturingStepParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleManufacturingStep();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getManufacturingStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSDsl.g:560:2: ( ruleTransportStep )
                    {
                    // InternalMSDsl.g:560:2: ( ruleTransportStep )
                    // InternalMSDsl.g:561:3: ruleTransportStep
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getTransportStepParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTransportStep();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getTransportStepParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMSDsl.g:566:2: ( ruleQualityAssuranceStep )
                    {
                    // InternalMSDsl.g:566:2: ( ruleQualityAssuranceStep )
                    // InternalMSDsl.g:567:3: ruleQualityAssuranceStep
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getQualityAssuranceStepParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQualityAssuranceStep();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getQualityAssuranceStepParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMSDsl.g:572:2: ( ruleStoragePoint )
                    {
                    // InternalMSDsl.g:572:2: ( ruleStoragePoint )
                    // InternalMSDsl.g:573:3: ruleStoragePoint
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getStoragePointParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStoragePoint();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getStoragePointParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMSDsl.g:578:2: ( ruleCompositeManufacturingStep )
                    {
                    // InternalMSDsl.g:578:2: ( ruleCompositeManufacturingStep )
                    // InternalMSDsl.g:579:3: ruleCompositeManufacturingStep
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getCompositeManufacturingStepParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeManufacturingStep();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getCompositeManufacturingStepParserRuleCall_5()); 

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
    // $ANTLR end "rule__ManufacturingSystemElement__Alternatives"


    // $ANTLR start "rule__InputCondition__Alternatives"
    // InternalMSDsl.g:588:1: rule__InputCondition__Alternatives : ( ( ruleInputCondition_Impl ) | ( ruleWorkPieceCondition ) | ( ruleBinaryCondition ) | ( ruleNegation ) );
    public final void rule__InputCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:592:1: ( ( ruleInputCondition_Impl ) | ( ruleWorkPieceCondition ) | ( ruleBinaryCondition ) | ( ruleNegation ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 46:
                {
                alt2=2;
                }
                break;
            case 48:
                {
                alt2=3;
                }
                break;
            case 49:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMSDsl.g:593:2: ( ruleInputCondition_Impl )
                    {
                    // InternalMSDsl.g:593:2: ( ruleInputCondition_Impl )
                    // InternalMSDsl.g:594:3: ruleInputCondition_Impl
                    {
                     before(grammarAccess.getInputConditionAccess().getInputCondition_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInputCondition_Impl();

                    state._fsp--;

                     after(grammarAccess.getInputConditionAccess().getInputCondition_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSDsl.g:599:2: ( ruleWorkPieceCondition )
                    {
                    // InternalMSDsl.g:599:2: ( ruleWorkPieceCondition )
                    // InternalMSDsl.g:600:3: ruleWorkPieceCondition
                    {
                     before(grammarAccess.getInputConditionAccess().getWorkPieceConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkPieceCondition();

                    state._fsp--;

                     after(grammarAccess.getInputConditionAccess().getWorkPieceConditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSDsl.g:605:2: ( ruleBinaryCondition )
                    {
                    // InternalMSDsl.g:605:2: ( ruleBinaryCondition )
                    // InternalMSDsl.g:606:3: ruleBinaryCondition
                    {
                     before(grammarAccess.getInputConditionAccess().getBinaryConditionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryCondition();

                    state._fsp--;

                     after(grammarAccess.getInputConditionAccess().getBinaryConditionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMSDsl.g:611:2: ( ruleNegation )
                    {
                    // InternalMSDsl.g:611:2: ( ruleNegation )
                    // InternalMSDsl.g:612:3: ruleNegation
                    {
                     before(grammarAccess.getInputConditionAccess().getNegationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getInputConditionAccess().getNegationParserRuleCall_3()); 

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
    // $ANTLR end "rule__InputCondition__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMSDsl.g:621:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:625:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSDsl.g:626:2: ( RULE_STRING )
                    {
                    // InternalMSDsl.g:626:2: ( RULE_STRING )
                    // InternalMSDsl.g:627:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSDsl.g:632:2: ( RULE_ID )
                    {
                    // InternalMSDsl.g:632:2: ( RULE_ID )
                    // InternalMSDsl.g:633:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__BinaryType__Alternatives"
    // InternalMSDsl.g:642:1: rule__BinaryType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BinaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:646:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSDsl.g:647:2: ( ( 'and' ) )
                    {
                    // InternalMSDsl.g:647:2: ( ( 'and' ) )
                    // InternalMSDsl.g:648:3: ( 'and' )
                    {
                     before(grammarAccess.getBinaryTypeAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalMSDsl.g:649:3: ( 'and' )
                    // InternalMSDsl.g:649:4: 'and'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryTypeAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSDsl.g:653:2: ( ( 'or' ) )
                    {
                    // InternalMSDsl.g:653:2: ( ( 'or' ) )
                    // InternalMSDsl.g:654:3: ( 'or' )
                    {
                     before(grammarAccess.getBinaryTypeAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalMSDsl.g:655:3: ( 'or' )
                    // InternalMSDsl.g:655:4: 'or'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryTypeAccess().getOrEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BinaryType__Alternatives"


    // $ANTLR start "rule__ManufacturingSystem__Group__0"
    // InternalMSDsl.g:663:1: rule__ManufacturingSystem__Group__0 : rule__ManufacturingSystem__Group__0__Impl rule__ManufacturingSystem__Group__1 ;
    public final void rule__ManufacturingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:667:1: ( rule__ManufacturingSystem__Group__0__Impl rule__ManufacturingSystem__Group__1 )
            // InternalMSDsl.g:668:2: rule__ManufacturingSystem__Group__0__Impl rule__ManufacturingSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__0"


    // $ANTLR start "rule__ManufacturingSystem__Group__0__Impl"
    // InternalMSDsl.g:675:1: rule__ManufacturingSystem__Group__0__Impl : ( 'ManufacturingSystem' ) ;
    public final void rule__ManufacturingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:679:1: ( ( 'ManufacturingSystem' ) )
            // InternalMSDsl.g:680:1: ( 'ManufacturingSystem' )
            {
            // InternalMSDsl.g:680:1: ( 'ManufacturingSystem' )
            // InternalMSDsl.g:681:2: 'ManufacturingSystem'
            {
             before(grammarAccess.getManufacturingSystemAccess().getManufacturingSystemKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getManufacturingSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__1"
    // InternalMSDsl.g:690:1: rule__ManufacturingSystem__Group__1 : rule__ManufacturingSystem__Group__1__Impl rule__ManufacturingSystem__Group__2 ;
    public final void rule__ManufacturingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:694:1: ( rule__ManufacturingSystem__Group__1__Impl rule__ManufacturingSystem__Group__2 )
            // InternalMSDsl.g:695:2: rule__ManufacturingSystem__Group__1__Impl rule__ManufacturingSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__2();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__1"


    // $ANTLR start "rule__ManufacturingSystem__Group__1__Impl"
    // InternalMSDsl.g:702:1: rule__ManufacturingSystem__Group__1__Impl : ( ( rule__ManufacturingSystem__NameAssignment_1 ) ) ;
    public final void rule__ManufacturingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:706:1: ( ( ( rule__ManufacturingSystem__NameAssignment_1 ) ) )
            // InternalMSDsl.g:707:1: ( ( rule__ManufacturingSystem__NameAssignment_1 ) )
            {
            // InternalMSDsl.g:707:1: ( ( rule__ManufacturingSystem__NameAssignment_1 ) )
            // InternalMSDsl.g:708:2: ( rule__ManufacturingSystem__NameAssignment_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:709:2: ( rule__ManufacturingSystem__NameAssignment_1 )
            // InternalMSDsl.g:709:3: rule__ManufacturingSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__2"
    // InternalMSDsl.g:717:1: rule__ManufacturingSystem__Group__2 : rule__ManufacturingSystem__Group__2__Impl rule__ManufacturingSystem__Group__3 ;
    public final void rule__ManufacturingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:721:1: ( rule__ManufacturingSystem__Group__2__Impl rule__ManufacturingSystem__Group__3 )
            // InternalMSDsl.g:722:2: rule__ManufacturingSystem__Group__2__Impl rule__ManufacturingSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ManufacturingSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__3();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__2"


    // $ANTLR start "rule__ManufacturingSystem__Group__2__Impl"
    // InternalMSDsl.g:729:1: rule__ManufacturingSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:733:1: ( ( '{' ) )
            // InternalMSDsl.g:734:1: ( '{' )
            {
            // InternalMSDsl.g:734:1: ( '{' )
            // InternalMSDsl.g:735:2: '{'
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__2__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__3"
    // InternalMSDsl.g:744:1: rule__ManufacturingSystem__Group__3 : rule__ManufacturingSystem__Group__3__Impl rule__ManufacturingSystem__Group__4 ;
    public final void rule__ManufacturingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:748:1: ( rule__ManufacturingSystem__Group__3__Impl rule__ManufacturingSystem__Group__4 )
            // InternalMSDsl.g:749:2: rule__ManufacturingSystem__Group__3__Impl rule__ManufacturingSystem__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ManufacturingSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__4();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__3"


    // $ANTLR start "rule__ManufacturingSystem__Group__3__Impl"
    // InternalMSDsl.g:756:1: rule__ManufacturingSystem__Group__3__Impl : ( 'start' ) ;
    public final void rule__ManufacturingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:760:1: ( ( 'start' ) )
            // InternalMSDsl.g:761:1: ( 'start' )
            {
            // InternalMSDsl.g:761:1: ( 'start' )
            // InternalMSDsl.g:762:2: 'start'
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getStartKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__3__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__4"
    // InternalMSDsl.g:771:1: rule__ManufacturingSystem__Group__4 : rule__ManufacturingSystem__Group__4__Impl rule__ManufacturingSystem__Group__5 ;
    public final void rule__ManufacturingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:775:1: ( rule__ManufacturingSystem__Group__4__Impl rule__ManufacturingSystem__Group__5 )
            // InternalMSDsl.g:776:2: rule__ManufacturingSystem__Group__4__Impl rule__ManufacturingSystem__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__5();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__4"


    // $ANTLR start "rule__ManufacturingSystem__Group__4__Impl"
    // InternalMSDsl.g:783:1: rule__ManufacturingSystem__Group__4__Impl : ( '(' ) ;
    public final void rule__ManufacturingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:787:1: ( ( '(' ) )
            // InternalMSDsl.g:788:1: ( '(' )
            {
            // InternalMSDsl.g:788:1: ( '(' )
            // InternalMSDsl.g:789:2: '('
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__4__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__5"
    // InternalMSDsl.g:798:1: rule__ManufacturingSystem__Group__5 : rule__ManufacturingSystem__Group__5__Impl rule__ManufacturingSystem__Group__6 ;
    public final void rule__ManufacturingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:802:1: ( rule__ManufacturingSystem__Group__5__Impl rule__ManufacturingSystem__Group__6 )
            // InternalMSDsl.g:803:2: rule__ManufacturingSystem__Group__5__Impl rule__ManufacturingSystem__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ManufacturingSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__6();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__5"


    // $ANTLR start "rule__ManufacturingSystem__Group__5__Impl"
    // InternalMSDsl.g:810:1: rule__ManufacturingSystem__Group__5__Impl : ( ( rule__ManufacturingSystem__StartAssignment_5 ) ) ;
    public final void rule__ManufacturingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:814:1: ( ( ( rule__ManufacturingSystem__StartAssignment_5 ) ) )
            // InternalMSDsl.g:815:1: ( ( rule__ManufacturingSystem__StartAssignment_5 ) )
            {
            // InternalMSDsl.g:815:1: ( ( rule__ManufacturingSystem__StartAssignment_5 ) )
            // InternalMSDsl.g:816:2: ( rule__ManufacturingSystem__StartAssignment_5 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartAssignment_5()); 
            // InternalMSDsl.g:817:2: ( rule__ManufacturingSystem__StartAssignment_5 )
            // InternalMSDsl.g:817:3: rule__ManufacturingSystem__StartAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__StartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getStartAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__5__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__6"
    // InternalMSDsl.g:825:1: rule__ManufacturingSystem__Group__6 : rule__ManufacturingSystem__Group__6__Impl rule__ManufacturingSystem__Group__7 ;
    public final void rule__ManufacturingSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:829:1: ( rule__ManufacturingSystem__Group__6__Impl rule__ManufacturingSystem__Group__7 )
            // InternalMSDsl.g:830:2: rule__ManufacturingSystem__Group__6__Impl rule__ManufacturingSystem__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__ManufacturingSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__7();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__6"


    // $ANTLR start "rule__ManufacturingSystem__Group__6__Impl"
    // InternalMSDsl.g:837:1: rule__ManufacturingSystem__Group__6__Impl : ( ( rule__ManufacturingSystem__Group_6__0 )* ) ;
    public final void rule__ManufacturingSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:841:1: ( ( ( rule__ManufacturingSystem__Group_6__0 )* ) )
            // InternalMSDsl.g:842:1: ( ( rule__ManufacturingSystem__Group_6__0 )* )
            {
            // InternalMSDsl.g:842:1: ( ( rule__ManufacturingSystem__Group_6__0 )* )
            // InternalMSDsl.g:843:2: ( rule__ManufacturingSystem__Group_6__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_6()); 
            // InternalMSDsl.g:844:2: ( rule__ManufacturingSystem__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSDsl.g:844:3: rule__ManufacturingSystem__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingSystem__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__6__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__7"
    // InternalMSDsl.g:852:1: rule__ManufacturingSystem__Group__7 : rule__ManufacturingSystem__Group__7__Impl rule__ManufacturingSystem__Group__8 ;
    public final void rule__ManufacturingSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:856:1: ( rule__ManufacturingSystem__Group__7__Impl rule__ManufacturingSystem__Group__8 )
            // InternalMSDsl.g:857:2: rule__ManufacturingSystem__Group__7__Impl rule__ManufacturingSystem__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ManufacturingSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__8();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__7"


    // $ANTLR start "rule__ManufacturingSystem__Group__7__Impl"
    // InternalMSDsl.g:864:1: rule__ManufacturingSystem__Group__7__Impl : ( ')' ) ;
    public final void rule__ManufacturingSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:868:1: ( ( ')' ) )
            // InternalMSDsl.g:869:1: ( ')' )
            {
            // InternalMSDsl.g:869:1: ( ')' )
            // InternalMSDsl.g:870:2: ')'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__7__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__8"
    // InternalMSDsl.g:879:1: rule__ManufacturingSystem__Group__8 : rule__ManufacturingSystem__Group__8__Impl rule__ManufacturingSystem__Group__9 ;
    public final void rule__ManufacturingSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:883:1: ( rule__ManufacturingSystem__Group__8__Impl rule__ManufacturingSystem__Group__9 )
            // InternalMSDsl.g:884:2: rule__ManufacturingSystem__Group__8__Impl rule__ManufacturingSystem__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ManufacturingSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__9();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__8"


    // $ANTLR start "rule__ManufacturingSystem__Group__8__Impl"
    // InternalMSDsl.g:891:1: rule__ManufacturingSystem__Group__8__Impl : ( 'end' ) ;
    public final void rule__ManufacturingSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:895:1: ( ( 'end' ) )
            // InternalMSDsl.g:896:1: ( 'end' )
            {
            // InternalMSDsl.g:896:1: ( 'end' )
            // InternalMSDsl.g:897:2: 'end'
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getEndKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__8__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__9"
    // InternalMSDsl.g:906:1: rule__ManufacturingSystem__Group__9 : rule__ManufacturingSystem__Group__9__Impl rule__ManufacturingSystem__Group__10 ;
    public final void rule__ManufacturingSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:910:1: ( rule__ManufacturingSystem__Group__9__Impl rule__ManufacturingSystem__Group__10 )
            // InternalMSDsl.g:911:2: rule__ManufacturingSystem__Group__9__Impl rule__ManufacturingSystem__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__10();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__9"


    // $ANTLR start "rule__ManufacturingSystem__Group__9__Impl"
    // InternalMSDsl.g:918:1: rule__ManufacturingSystem__Group__9__Impl : ( '(' ) ;
    public final void rule__ManufacturingSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:922:1: ( ( '(' ) )
            // InternalMSDsl.g:923:1: ( '(' )
            {
            // InternalMSDsl.g:923:1: ( '(' )
            // InternalMSDsl.g:924:2: '('
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftParenthesisKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__9__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__10"
    // InternalMSDsl.g:933:1: rule__ManufacturingSystem__Group__10 : rule__ManufacturingSystem__Group__10__Impl rule__ManufacturingSystem__Group__11 ;
    public final void rule__ManufacturingSystem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:937:1: ( rule__ManufacturingSystem__Group__10__Impl rule__ManufacturingSystem__Group__11 )
            // InternalMSDsl.g:938:2: rule__ManufacturingSystem__Group__10__Impl rule__ManufacturingSystem__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__ManufacturingSystem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__11();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__10"


    // $ANTLR start "rule__ManufacturingSystem__Group__10__Impl"
    // InternalMSDsl.g:945:1: rule__ManufacturingSystem__Group__10__Impl : ( ( rule__ManufacturingSystem__EndAssignment_10 ) ) ;
    public final void rule__ManufacturingSystem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:949:1: ( ( ( rule__ManufacturingSystem__EndAssignment_10 ) ) )
            // InternalMSDsl.g:950:1: ( ( rule__ManufacturingSystem__EndAssignment_10 ) )
            {
            // InternalMSDsl.g:950:1: ( ( rule__ManufacturingSystem__EndAssignment_10 ) )
            // InternalMSDsl.g:951:2: ( rule__ManufacturingSystem__EndAssignment_10 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndAssignment_10()); 
            // InternalMSDsl.g:952:2: ( rule__ManufacturingSystem__EndAssignment_10 )
            // InternalMSDsl.g:952:3: rule__ManufacturingSystem__EndAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__EndAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getEndAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__10__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__11"
    // InternalMSDsl.g:960:1: rule__ManufacturingSystem__Group__11 : rule__ManufacturingSystem__Group__11__Impl rule__ManufacturingSystem__Group__12 ;
    public final void rule__ManufacturingSystem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:964:1: ( rule__ManufacturingSystem__Group__11__Impl rule__ManufacturingSystem__Group__12 )
            // InternalMSDsl.g:965:2: rule__ManufacturingSystem__Group__11__Impl rule__ManufacturingSystem__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__ManufacturingSystem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__12();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__11"


    // $ANTLR start "rule__ManufacturingSystem__Group__11__Impl"
    // InternalMSDsl.g:972:1: rule__ManufacturingSystem__Group__11__Impl : ( ( rule__ManufacturingSystem__Group_11__0 )* ) ;
    public final void rule__ManufacturingSystem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:976:1: ( ( ( rule__ManufacturingSystem__Group_11__0 )* ) )
            // InternalMSDsl.g:977:1: ( ( rule__ManufacturingSystem__Group_11__0 )* )
            {
            // InternalMSDsl.g:977:1: ( ( rule__ManufacturingSystem__Group_11__0 )* )
            // InternalMSDsl.g:978:2: ( rule__ManufacturingSystem__Group_11__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_11()); 
            // InternalMSDsl.g:979:2: ( rule__ManufacturingSystem__Group_11__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMSDsl.g:979:3: rule__ManufacturingSystem__Group_11__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingSystem__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__11__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__12"
    // InternalMSDsl.g:987:1: rule__ManufacturingSystem__Group__12 : rule__ManufacturingSystem__Group__12__Impl rule__ManufacturingSystem__Group__13 ;
    public final void rule__ManufacturingSystem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:991:1: ( rule__ManufacturingSystem__Group__12__Impl rule__ManufacturingSystem__Group__13 )
            // InternalMSDsl.g:992:2: rule__ManufacturingSystem__Group__12__Impl rule__ManufacturingSystem__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__ManufacturingSystem__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__13();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__12"


    // $ANTLR start "rule__ManufacturingSystem__Group__12__Impl"
    // InternalMSDsl.g:999:1: rule__ManufacturingSystem__Group__12__Impl : ( ')' ) ;
    public final void rule__ManufacturingSystem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1003:1: ( ( ')' ) )
            // InternalMSDsl.g:1004:1: ( ')' )
            {
            // InternalMSDsl.g:1004:1: ( ')' )
            // InternalMSDsl.g:1005:2: ')'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightParenthesisKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__12__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__13"
    // InternalMSDsl.g:1014:1: rule__ManufacturingSystem__Group__13 : rule__ManufacturingSystem__Group__13__Impl rule__ManufacturingSystem__Group__14 ;
    public final void rule__ManufacturingSystem__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1018:1: ( rule__ManufacturingSystem__Group__13__Impl rule__ManufacturingSystem__Group__14 )
            // InternalMSDsl.g:1019:2: rule__ManufacturingSystem__Group__13__Impl rule__ManufacturingSystem__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__ManufacturingSystem__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__14();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__13"


    // $ANTLR start "rule__ManufacturingSystem__Group__13__Impl"
    // InternalMSDsl.g:1026:1: rule__ManufacturingSystem__Group__13__Impl : ( ( rule__ManufacturingSystem__Group_13__0 )? ) ;
    public final void rule__ManufacturingSystem__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1030:1: ( ( ( rule__ManufacturingSystem__Group_13__0 )? ) )
            // InternalMSDsl.g:1031:1: ( ( rule__ManufacturingSystem__Group_13__0 )? )
            {
            // InternalMSDsl.g:1031:1: ( ( rule__ManufacturingSystem__Group_13__0 )? )
            // InternalMSDsl.g:1032:2: ( rule__ManufacturingSystem__Group_13__0 )?
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_13()); 
            // InternalMSDsl.g:1033:2: ( rule__ManufacturingSystem__Group_13__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMSDsl.g:1033:3: rule__ManufacturingSystem__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystem__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__13__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__14"
    // InternalMSDsl.g:1041:1: rule__ManufacturingSystem__Group__14 : rule__ManufacturingSystem__Group__14__Impl rule__ManufacturingSystem__Group__15 ;
    public final void rule__ManufacturingSystem__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1045:1: ( rule__ManufacturingSystem__Group__14__Impl rule__ManufacturingSystem__Group__15 )
            // InternalMSDsl.g:1046:2: rule__ManufacturingSystem__Group__14__Impl rule__ManufacturingSystem__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__15();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__14"


    // $ANTLR start "rule__ManufacturingSystem__Group__14__Impl"
    // InternalMSDsl.g:1053:1: rule__ManufacturingSystem__Group__14__Impl : ( 'consistsOf' ) ;
    public final void rule__ManufacturingSystem__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1057:1: ( ( 'consistsOf' ) )
            // InternalMSDsl.g:1058:1: ( 'consistsOf' )
            {
            // InternalMSDsl.g:1058:1: ( 'consistsOf' )
            // InternalMSDsl.g:1059:2: 'consistsOf'
            {
             before(grammarAccess.getManufacturingSystemAccess().getConsistsOfKeyword_14()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getConsistsOfKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__14__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__15"
    // InternalMSDsl.g:1068:1: rule__ManufacturingSystem__Group__15 : rule__ManufacturingSystem__Group__15__Impl rule__ManufacturingSystem__Group__16 ;
    public final void rule__ManufacturingSystem__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1072:1: ( rule__ManufacturingSystem__Group__15__Impl rule__ManufacturingSystem__Group__16 )
            // InternalMSDsl.g:1073:2: rule__ManufacturingSystem__Group__15__Impl rule__ManufacturingSystem__Group__16
            {
            pushFollow(FOLLOW_11);
            rule__ManufacturingSystem__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__16();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__15"


    // $ANTLR start "rule__ManufacturingSystem__Group__15__Impl"
    // InternalMSDsl.g:1080:1: rule__ManufacturingSystem__Group__15__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystem__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1084:1: ( ( '{' ) )
            // InternalMSDsl.g:1085:1: ( '{' )
            {
            // InternalMSDsl.g:1085:1: ( '{' )
            // InternalMSDsl.g:1086:2: '{'
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__15__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__16"
    // InternalMSDsl.g:1095:1: rule__ManufacturingSystem__Group__16 : rule__ManufacturingSystem__Group__16__Impl rule__ManufacturingSystem__Group__17 ;
    public final void rule__ManufacturingSystem__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1099:1: ( rule__ManufacturingSystem__Group__16__Impl rule__ManufacturingSystem__Group__17 )
            // InternalMSDsl.g:1100:2: rule__ManufacturingSystem__Group__16__Impl rule__ManufacturingSystem__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__17();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__16"


    // $ANTLR start "rule__ManufacturingSystem__Group__16__Impl"
    // InternalMSDsl.g:1107:1: rule__ManufacturingSystem__Group__16__Impl : ( ( rule__ManufacturingSystem__ConsistsOfAssignment_16 ) ) ;
    public final void rule__ManufacturingSystem__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1111:1: ( ( ( rule__ManufacturingSystem__ConsistsOfAssignment_16 ) ) )
            // InternalMSDsl.g:1112:1: ( ( rule__ManufacturingSystem__ConsistsOfAssignment_16 ) )
            {
            // InternalMSDsl.g:1112:1: ( ( rule__ManufacturingSystem__ConsistsOfAssignment_16 ) )
            // InternalMSDsl.g:1113:2: ( rule__ManufacturingSystem__ConsistsOfAssignment_16 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getConsistsOfAssignment_16()); 
            // InternalMSDsl.g:1114:2: ( rule__ManufacturingSystem__ConsistsOfAssignment_16 )
            // InternalMSDsl.g:1114:3: rule__ManufacturingSystem__ConsistsOfAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__ConsistsOfAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getConsistsOfAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__16__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__17"
    // InternalMSDsl.g:1122:1: rule__ManufacturingSystem__Group__17 : rule__ManufacturingSystem__Group__17__Impl rule__ManufacturingSystem__Group__18 ;
    public final void rule__ManufacturingSystem__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1126:1: ( rule__ManufacturingSystem__Group__17__Impl rule__ManufacturingSystem__Group__18 )
            // InternalMSDsl.g:1127:2: rule__ManufacturingSystem__Group__17__Impl rule__ManufacturingSystem__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__18();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__17"


    // $ANTLR start "rule__ManufacturingSystem__Group__17__Impl"
    // InternalMSDsl.g:1134:1: rule__ManufacturingSystem__Group__17__Impl : ( ( rule__ManufacturingSystem__Group_17__0 )* ) ;
    public final void rule__ManufacturingSystem__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1138:1: ( ( ( rule__ManufacturingSystem__Group_17__0 )* ) )
            // InternalMSDsl.g:1139:1: ( ( rule__ManufacturingSystem__Group_17__0 )* )
            {
            // InternalMSDsl.g:1139:1: ( ( rule__ManufacturingSystem__Group_17__0 )* )
            // InternalMSDsl.g:1140:2: ( rule__ManufacturingSystem__Group_17__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_17()); 
            // InternalMSDsl.g:1141:2: ( rule__ManufacturingSystem__Group_17__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMSDsl.g:1141:3: rule__ManufacturingSystem__Group_17__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingSystem__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__17__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__18"
    // InternalMSDsl.g:1149:1: rule__ManufacturingSystem__Group__18 : rule__ManufacturingSystem__Group__18__Impl rule__ManufacturingSystem__Group__19 ;
    public final void rule__ManufacturingSystem__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1153:1: ( rule__ManufacturingSystem__Group__18__Impl rule__ManufacturingSystem__Group__19 )
            // InternalMSDsl.g:1154:2: rule__ManufacturingSystem__Group__18__Impl rule__ManufacturingSystem__Group__19
            {
            pushFollow(FOLLOW_13);
            rule__ManufacturingSystem__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__19();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__18"


    // $ANTLR start "rule__ManufacturingSystem__Group__18__Impl"
    // InternalMSDsl.g:1161:1: rule__ManufacturingSystem__Group__18__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystem__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1165:1: ( ( '}' ) )
            // InternalMSDsl.g:1166:1: ( '}' )
            {
            // InternalMSDsl.g:1166:1: ( '}' )
            // InternalMSDsl.g:1167:2: '}'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_18()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__18__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__19"
    // InternalMSDsl.g:1176:1: rule__ManufacturingSystem__Group__19 : rule__ManufacturingSystem__Group__19__Impl rule__ManufacturingSystem__Group__20 ;
    public final void rule__ManufacturingSystem__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1180:1: ( rule__ManufacturingSystem__Group__19__Impl rule__ManufacturingSystem__Group__20 )
            // InternalMSDsl.g:1181:2: rule__ManufacturingSystem__Group__19__Impl rule__ManufacturingSystem__Group__20
            {
            pushFollow(FOLLOW_13);
            rule__ManufacturingSystem__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__20();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__19"


    // $ANTLR start "rule__ManufacturingSystem__Group__19__Impl"
    // InternalMSDsl.g:1188:1: rule__ManufacturingSystem__Group__19__Impl : ( ( rule__ManufacturingSystem__Group_19__0 )? ) ;
    public final void rule__ManufacturingSystem__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1192:1: ( ( ( rule__ManufacturingSystem__Group_19__0 )? ) )
            // InternalMSDsl.g:1193:1: ( ( rule__ManufacturingSystem__Group_19__0 )? )
            {
            // InternalMSDsl.g:1193:1: ( ( rule__ManufacturingSystem__Group_19__0 )? )
            // InternalMSDsl.g:1194:2: ( rule__ManufacturingSystem__Group_19__0 )?
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_19()); 
            // InternalMSDsl.g:1195:2: ( rule__ManufacturingSystem__Group_19__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSDsl.g:1195:3: rule__ManufacturingSystem__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystem__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__19__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__20"
    // InternalMSDsl.g:1203:1: rule__ManufacturingSystem__Group__20 : rule__ManufacturingSystem__Group__20__Impl rule__ManufacturingSystem__Group__21 ;
    public final void rule__ManufacturingSystem__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1207:1: ( rule__ManufacturingSystem__Group__20__Impl rule__ManufacturingSystem__Group__21 )
            // InternalMSDsl.g:1208:2: rule__ManufacturingSystem__Group__20__Impl rule__ManufacturingSystem__Group__21
            {
            pushFollow(FOLLOW_13);
            rule__ManufacturingSystem__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__21();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__20"


    // $ANTLR start "rule__ManufacturingSystem__Group__20__Impl"
    // InternalMSDsl.g:1215:1: rule__ManufacturingSystem__Group__20__Impl : ( ( rule__ManufacturingSystem__Group_20__0 )? ) ;
    public final void rule__ManufacturingSystem__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1219:1: ( ( ( rule__ManufacturingSystem__Group_20__0 )? ) )
            // InternalMSDsl.g:1220:1: ( ( rule__ManufacturingSystem__Group_20__0 )? )
            {
            // InternalMSDsl.g:1220:1: ( ( rule__ManufacturingSystem__Group_20__0 )? )
            // InternalMSDsl.g:1221:2: ( rule__ManufacturingSystem__Group_20__0 )?
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_20()); 
            // InternalMSDsl.g:1222:2: ( rule__ManufacturingSystem__Group_20__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSDsl.g:1222:3: rule__ManufacturingSystem__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystem__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__20__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__21"
    // InternalMSDsl.g:1230:1: rule__ManufacturingSystem__Group__21 : rule__ManufacturingSystem__Group__21__Impl rule__ManufacturingSystem__Group__22 ;
    public final void rule__ManufacturingSystem__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1234:1: ( rule__ManufacturingSystem__Group__21__Impl rule__ManufacturingSystem__Group__22 )
            // InternalMSDsl.g:1235:2: rule__ManufacturingSystem__Group__21__Impl rule__ManufacturingSystem__Group__22
            {
            pushFollow(FOLLOW_13);
            rule__ManufacturingSystem__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__22();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__21"


    // $ANTLR start "rule__ManufacturingSystem__Group__21__Impl"
    // InternalMSDsl.g:1242:1: rule__ManufacturingSystem__Group__21__Impl : ( ( rule__ManufacturingSystem__Group_21__0 )? ) ;
    public final void rule__ManufacturingSystem__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1246:1: ( ( ( rule__ManufacturingSystem__Group_21__0 )? ) )
            // InternalMSDsl.g:1247:1: ( ( rule__ManufacturingSystem__Group_21__0 )? )
            {
            // InternalMSDsl.g:1247:1: ( ( rule__ManufacturingSystem__Group_21__0 )? )
            // InternalMSDsl.g:1248:2: ( rule__ManufacturingSystem__Group_21__0 )?
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_21()); 
            // InternalMSDsl.g:1249:2: ( rule__ManufacturingSystem__Group_21__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMSDsl.g:1249:3: rule__ManufacturingSystem__Group_21__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystem__Group_21__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__21__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__22"
    // InternalMSDsl.g:1257:1: rule__ManufacturingSystem__Group__22 : rule__ManufacturingSystem__Group__22__Impl ;
    public final void rule__ManufacturingSystem__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1261:1: ( rule__ManufacturingSystem__Group__22__Impl )
            // InternalMSDsl.g:1262:2: rule__ManufacturingSystem__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__22__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group__22"


    // $ANTLR start "rule__ManufacturingSystem__Group__22__Impl"
    // InternalMSDsl.g:1268:1: rule__ManufacturingSystem__Group__22__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystem__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1272:1: ( ( '}' ) )
            // InternalMSDsl.g:1273:1: ( '}' )
            {
            // InternalMSDsl.g:1273:1: ( '}' )
            // InternalMSDsl.g:1274:2: '}'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_22()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__22__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_6__0"
    // InternalMSDsl.g:1284:1: rule__ManufacturingSystem__Group_6__0 : rule__ManufacturingSystem__Group_6__0__Impl rule__ManufacturingSystem__Group_6__1 ;
    public final void rule__ManufacturingSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1288:1: ( rule__ManufacturingSystem__Group_6__0__Impl rule__ManufacturingSystem__Group_6__1 )
            // InternalMSDsl.g:1289:2: rule__ManufacturingSystem__Group_6__0__Impl rule__ManufacturingSystem__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_6__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_6__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_6__0__Impl"
    // InternalMSDsl.g:1296:1: rule__ManufacturingSystem__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1300:1: ( ( ',' ) )
            // InternalMSDsl.g:1301:1: ( ',' )
            {
            // InternalMSDsl.g:1301:1: ( ',' )
            // InternalMSDsl.g:1302:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_6__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_6__1"
    // InternalMSDsl.g:1311:1: rule__ManufacturingSystem__Group_6__1 : rule__ManufacturingSystem__Group_6__1__Impl ;
    public final void rule__ManufacturingSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1315:1: ( rule__ManufacturingSystem__Group_6__1__Impl )
            // InternalMSDsl.g:1316:2: rule__ManufacturingSystem__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_6__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_6__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_6__1__Impl"
    // InternalMSDsl.g:1322:1: rule__ManufacturingSystem__Group_6__1__Impl : ( ( rule__ManufacturingSystem__StartAssignment_6_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1326:1: ( ( ( rule__ManufacturingSystem__StartAssignment_6_1 ) ) )
            // InternalMSDsl.g:1327:1: ( ( rule__ManufacturingSystem__StartAssignment_6_1 ) )
            {
            // InternalMSDsl.g:1327:1: ( ( rule__ManufacturingSystem__StartAssignment_6_1 ) )
            // InternalMSDsl.g:1328:2: ( rule__ManufacturingSystem__StartAssignment_6_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartAssignment_6_1()); 
            // InternalMSDsl.g:1329:2: ( rule__ManufacturingSystem__StartAssignment_6_1 )
            // InternalMSDsl.g:1329:3: rule__ManufacturingSystem__StartAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__StartAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getStartAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_6__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_11__0"
    // InternalMSDsl.g:1338:1: rule__ManufacturingSystem__Group_11__0 : rule__ManufacturingSystem__Group_11__0__Impl rule__ManufacturingSystem__Group_11__1 ;
    public final void rule__ManufacturingSystem__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1342:1: ( rule__ManufacturingSystem__Group_11__0__Impl rule__ManufacturingSystem__Group_11__1 )
            // InternalMSDsl.g:1343:2: rule__ManufacturingSystem__Group_11__0__Impl rule__ManufacturingSystem__Group_11__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_11__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_11__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_11__0__Impl"
    // InternalMSDsl.g:1350:1: rule__ManufacturingSystem__Group_11__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1354:1: ( ( ',' ) )
            // InternalMSDsl.g:1355:1: ( ',' )
            {
            // InternalMSDsl.g:1355:1: ( ',' )
            // InternalMSDsl.g:1356:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_11_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_11__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_11__1"
    // InternalMSDsl.g:1365:1: rule__ManufacturingSystem__Group_11__1 : rule__ManufacturingSystem__Group_11__1__Impl ;
    public final void rule__ManufacturingSystem__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1369:1: ( rule__ManufacturingSystem__Group_11__1__Impl )
            // InternalMSDsl.g:1370:2: rule__ManufacturingSystem__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_11__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_11__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_11__1__Impl"
    // InternalMSDsl.g:1376:1: rule__ManufacturingSystem__Group_11__1__Impl : ( ( rule__ManufacturingSystem__EndAssignment_11_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1380:1: ( ( ( rule__ManufacturingSystem__EndAssignment_11_1 ) ) )
            // InternalMSDsl.g:1381:1: ( ( rule__ManufacturingSystem__EndAssignment_11_1 ) )
            {
            // InternalMSDsl.g:1381:1: ( ( rule__ManufacturingSystem__EndAssignment_11_1 ) )
            // InternalMSDsl.g:1382:2: ( rule__ManufacturingSystem__EndAssignment_11_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndAssignment_11_1()); 
            // InternalMSDsl.g:1383:2: ( rule__ManufacturingSystem__EndAssignment_11_1 )
            // InternalMSDsl.g:1383:3: rule__ManufacturingSystem__EndAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__EndAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getEndAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_11__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_13__0"
    // InternalMSDsl.g:1392:1: rule__ManufacturingSystem__Group_13__0 : rule__ManufacturingSystem__Group_13__0__Impl rule__ManufacturingSystem__Group_13__1 ;
    public final void rule__ManufacturingSystem__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1396:1: ( rule__ManufacturingSystem__Group_13__0__Impl rule__ManufacturingSystem__Group_13__1 )
            // InternalMSDsl.g:1397:2: rule__ManufacturingSystem__Group_13__0__Impl rule__ManufacturingSystem__Group_13__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_13__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_13__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_13__0__Impl"
    // InternalMSDsl.g:1404:1: rule__ManufacturingSystem__Group_13__0__Impl : ( 'responsible' ) ;
    public final void rule__ManufacturingSystem__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1408:1: ( ( 'responsible' ) )
            // InternalMSDsl.g:1409:1: ( 'responsible' )
            {
            // InternalMSDsl.g:1409:1: ( 'responsible' )
            // InternalMSDsl.g:1410:2: 'responsible'
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_13_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_13__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_13__1"
    // InternalMSDsl.g:1419:1: rule__ManufacturingSystem__Group_13__1 : rule__ManufacturingSystem__Group_13__1__Impl ;
    public final void rule__ManufacturingSystem__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1423:1: ( rule__ManufacturingSystem__Group_13__1__Impl )
            // InternalMSDsl.g:1424:2: rule__ManufacturingSystem__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_13__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_13__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_13__1__Impl"
    // InternalMSDsl.g:1430:1: rule__ManufacturingSystem__Group_13__1__Impl : ( ( rule__ManufacturingSystem__ResponsibleAssignment_13_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1434:1: ( ( ( rule__ManufacturingSystem__ResponsibleAssignment_13_1 ) ) )
            // InternalMSDsl.g:1435:1: ( ( rule__ManufacturingSystem__ResponsibleAssignment_13_1 ) )
            {
            // InternalMSDsl.g:1435:1: ( ( rule__ManufacturingSystem__ResponsibleAssignment_13_1 ) )
            // InternalMSDsl.g:1436:2: ( rule__ManufacturingSystem__ResponsibleAssignment_13_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleAssignment_13_1()); 
            // InternalMSDsl.g:1437:2: ( rule__ManufacturingSystem__ResponsibleAssignment_13_1 )
            // InternalMSDsl.g:1437:3: rule__ManufacturingSystem__ResponsibleAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__ResponsibleAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getResponsibleAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_13__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_17__0"
    // InternalMSDsl.g:1446:1: rule__ManufacturingSystem__Group_17__0 : rule__ManufacturingSystem__Group_17__0__Impl rule__ManufacturingSystem__Group_17__1 ;
    public final void rule__ManufacturingSystem__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1450:1: ( rule__ManufacturingSystem__Group_17__0__Impl rule__ManufacturingSystem__Group_17__1 )
            // InternalMSDsl.g:1451:2: rule__ManufacturingSystem__Group_17__0__Impl rule__ManufacturingSystem__Group_17__1
            {
            pushFollow(FOLLOW_11);
            rule__ManufacturingSystem__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_17__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_17__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_17__0__Impl"
    // InternalMSDsl.g:1458:1: rule__ManufacturingSystem__Group_17__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1462:1: ( ( ',' ) )
            // InternalMSDsl.g:1463:1: ( ',' )
            {
            // InternalMSDsl.g:1463:1: ( ',' )
            // InternalMSDsl.g:1464:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_17_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_17__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_17__1"
    // InternalMSDsl.g:1473:1: rule__ManufacturingSystem__Group_17__1 : rule__ManufacturingSystem__Group_17__1__Impl ;
    public final void rule__ManufacturingSystem__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1477:1: ( rule__ManufacturingSystem__Group_17__1__Impl )
            // InternalMSDsl.g:1478:2: rule__ManufacturingSystem__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_17__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_17__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_17__1__Impl"
    // InternalMSDsl.g:1484:1: rule__ManufacturingSystem__Group_17__1__Impl : ( ( rule__ManufacturingSystem__ConsistsOfAssignment_17_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1488:1: ( ( ( rule__ManufacturingSystem__ConsistsOfAssignment_17_1 ) ) )
            // InternalMSDsl.g:1489:1: ( ( rule__ManufacturingSystem__ConsistsOfAssignment_17_1 ) )
            {
            // InternalMSDsl.g:1489:1: ( ( rule__ManufacturingSystem__ConsistsOfAssignment_17_1 ) )
            // InternalMSDsl.g:1490:2: ( rule__ManufacturingSystem__ConsistsOfAssignment_17_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getConsistsOfAssignment_17_1()); 
            // InternalMSDsl.g:1491:2: ( rule__ManufacturingSystem__ConsistsOfAssignment_17_1 )
            // InternalMSDsl.g:1491:3: rule__ManufacturingSystem__ConsistsOfAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__ConsistsOfAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getConsistsOfAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_17__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__0"
    // InternalMSDsl.g:1500:1: rule__ManufacturingSystem__Group_19__0 : rule__ManufacturingSystem__Group_19__0__Impl rule__ManufacturingSystem__Group_19__1 ;
    public final void rule__ManufacturingSystem__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1504:1: ( rule__ManufacturingSystem__Group_19__0__Impl rule__ManufacturingSystem__Group_19__1 )
            // InternalMSDsl.g:1505:2: rule__ManufacturingSystem__Group_19__0__Impl rule__ManufacturingSystem__Group_19__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_19__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_19__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__0__Impl"
    // InternalMSDsl.g:1512:1: rule__ManufacturingSystem__Group_19__0__Impl : ( 'workPieceTypes' ) ;
    public final void rule__ManufacturingSystem__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1516:1: ( ( 'workPieceTypes' ) )
            // InternalMSDsl.g:1517:1: ( 'workPieceTypes' )
            {
            // InternalMSDsl.g:1517:1: ( 'workPieceTypes' )
            // InternalMSDsl.g:1518:2: 'workPieceTypes'
            {
             before(grammarAccess.getManufacturingSystemAccess().getWorkPieceTypesKeyword_19_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getWorkPieceTypesKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_19__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__1"
    // InternalMSDsl.g:1527:1: rule__ManufacturingSystem__Group_19__1 : rule__ManufacturingSystem__Group_19__1__Impl rule__ManufacturingSystem__Group_19__2 ;
    public final void rule__ManufacturingSystem__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1531:1: ( rule__ManufacturingSystem__Group_19__1__Impl rule__ManufacturingSystem__Group_19__2 )
            // InternalMSDsl.g:1532:2: rule__ManufacturingSystem__Group_19__1__Impl rule__ManufacturingSystem__Group_19__2
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_19__2();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_19__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__1__Impl"
    // InternalMSDsl.g:1539:1: rule__ManufacturingSystem__Group_19__1__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystem__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1543:1: ( ( '{' ) )
            // InternalMSDsl.g:1544:1: ( '{' )
            {
            // InternalMSDsl.g:1544:1: ( '{' )
            // InternalMSDsl.g:1545:2: '{'
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_19_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_19__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__2"
    // InternalMSDsl.g:1554:1: rule__ManufacturingSystem__Group_19__2 : rule__ManufacturingSystem__Group_19__2__Impl rule__ManufacturingSystem__Group_19__3 ;
    public final void rule__ManufacturingSystem__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1558:1: ( rule__ManufacturingSystem__Group_19__2__Impl rule__ManufacturingSystem__Group_19__3 )
            // InternalMSDsl.g:1559:2: rule__ManufacturingSystem__Group_19__2__Impl rule__ManufacturingSystem__Group_19__3
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_19__3();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_19__2"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__2__Impl"
    // InternalMSDsl.g:1566:1: rule__ManufacturingSystem__Group_19__2__Impl : ( ( rule__ManufacturingSystem__UsesAssignment_19_2 ) ) ;
    public final void rule__ManufacturingSystem__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1570:1: ( ( ( rule__ManufacturingSystem__UsesAssignment_19_2 ) ) )
            // InternalMSDsl.g:1571:1: ( ( rule__ManufacturingSystem__UsesAssignment_19_2 ) )
            {
            // InternalMSDsl.g:1571:1: ( ( rule__ManufacturingSystem__UsesAssignment_19_2 ) )
            // InternalMSDsl.g:1572:2: ( rule__ManufacturingSystem__UsesAssignment_19_2 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getUsesAssignment_19_2()); 
            // InternalMSDsl.g:1573:2: ( rule__ManufacturingSystem__UsesAssignment_19_2 )
            // InternalMSDsl.g:1573:3: rule__ManufacturingSystem__UsesAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__UsesAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getUsesAssignment_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_19__2__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__3"
    // InternalMSDsl.g:1581:1: rule__ManufacturingSystem__Group_19__3 : rule__ManufacturingSystem__Group_19__3__Impl rule__ManufacturingSystem__Group_19__4 ;
    public final void rule__ManufacturingSystem__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1585:1: ( rule__ManufacturingSystem__Group_19__3__Impl rule__ManufacturingSystem__Group_19__4 )
            // InternalMSDsl.g:1586:2: rule__ManufacturingSystem__Group_19__3__Impl rule__ManufacturingSystem__Group_19__4
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_19__4();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_19__3"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__3__Impl"
    // InternalMSDsl.g:1593:1: rule__ManufacturingSystem__Group_19__3__Impl : ( ( rule__ManufacturingSystem__Group_19_3__0 )* ) ;
    public final void rule__ManufacturingSystem__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1597:1: ( ( ( rule__ManufacturingSystem__Group_19_3__0 )* ) )
            // InternalMSDsl.g:1598:1: ( ( rule__ManufacturingSystem__Group_19_3__0 )* )
            {
            // InternalMSDsl.g:1598:1: ( ( rule__ManufacturingSystem__Group_19_3__0 )* )
            // InternalMSDsl.g:1599:2: ( rule__ManufacturingSystem__Group_19_3__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_19_3()); 
            // InternalMSDsl.g:1600:2: ( rule__ManufacturingSystem__Group_19_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSDsl.g:1600:3: rule__ManufacturingSystem__Group_19_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingSystem__Group_19_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_19__3__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__4"
    // InternalMSDsl.g:1608:1: rule__ManufacturingSystem__Group_19__4 : rule__ManufacturingSystem__Group_19__4__Impl ;
    public final void rule__ManufacturingSystem__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1612:1: ( rule__ManufacturingSystem__Group_19__4__Impl )
            // InternalMSDsl.g:1613:2: rule__ManufacturingSystem__Group_19__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_19__4__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_19__4"


    // $ANTLR start "rule__ManufacturingSystem__Group_19__4__Impl"
    // InternalMSDsl.g:1619:1: rule__ManufacturingSystem__Group_19__4__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystem__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1623:1: ( ( '}' ) )
            // InternalMSDsl.g:1624:1: ( '}' )
            {
            // InternalMSDsl.g:1624:1: ( '}' )
            // InternalMSDsl.g:1625:2: '}'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_19_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_19__4__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_19_3__0"
    // InternalMSDsl.g:1635:1: rule__ManufacturingSystem__Group_19_3__0 : rule__ManufacturingSystem__Group_19_3__0__Impl rule__ManufacturingSystem__Group_19_3__1 ;
    public final void rule__ManufacturingSystem__Group_19_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1639:1: ( rule__ManufacturingSystem__Group_19_3__0__Impl rule__ManufacturingSystem__Group_19_3__1 )
            // InternalMSDsl.g:1640:2: rule__ManufacturingSystem__Group_19_3__0__Impl rule__ManufacturingSystem__Group_19_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group_19_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_19_3__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_19_3__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_19_3__0__Impl"
    // InternalMSDsl.g:1647:1: rule__ManufacturingSystem__Group_19_3__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_19_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1651:1: ( ( ',' ) )
            // InternalMSDsl.g:1652:1: ( ',' )
            {
            // InternalMSDsl.g:1652:1: ( ',' )
            // InternalMSDsl.g:1653:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_19_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_19_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_19_3__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_19_3__1"
    // InternalMSDsl.g:1662:1: rule__ManufacturingSystem__Group_19_3__1 : rule__ManufacturingSystem__Group_19_3__1__Impl ;
    public final void rule__ManufacturingSystem__Group_19_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1666:1: ( rule__ManufacturingSystem__Group_19_3__1__Impl )
            // InternalMSDsl.g:1667:2: rule__ManufacturingSystem__Group_19_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_19_3__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_19_3__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_19_3__1__Impl"
    // InternalMSDsl.g:1673:1: rule__ManufacturingSystem__Group_19_3__1__Impl : ( ( rule__ManufacturingSystem__UsesAssignment_19_3_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_19_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1677:1: ( ( ( rule__ManufacturingSystem__UsesAssignment_19_3_1 ) ) )
            // InternalMSDsl.g:1678:1: ( ( rule__ManufacturingSystem__UsesAssignment_19_3_1 ) )
            {
            // InternalMSDsl.g:1678:1: ( ( rule__ManufacturingSystem__UsesAssignment_19_3_1 ) )
            // InternalMSDsl.g:1679:2: ( rule__ManufacturingSystem__UsesAssignment_19_3_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getUsesAssignment_19_3_1()); 
            // InternalMSDsl.g:1680:2: ( rule__ManufacturingSystem__UsesAssignment_19_3_1 )
            // InternalMSDsl.g:1680:3: rule__ManufacturingSystem__UsesAssignment_19_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__UsesAssignment_19_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getUsesAssignment_19_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_19_3__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__0"
    // InternalMSDsl.g:1689:1: rule__ManufacturingSystem__Group_20__0 : rule__ManufacturingSystem__Group_20__0__Impl rule__ManufacturingSystem__Group_20__1 ;
    public final void rule__ManufacturingSystem__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1693:1: ( rule__ManufacturingSystem__Group_20__0__Impl rule__ManufacturingSystem__Group_20__1 )
            // InternalMSDsl.g:1694:2: rule__ManufacturingSystem__Group_20__0__Impl rule__ManufacturingSystem__Group_20__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_20__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_20__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__0__Impl"
    // InternalMSDsl.g:1701:1: rule__ManufacturingSystem__Group_20__0__Impl : ( 'initialWorkPieces' ) ;
    public final void rule__ManufacturingSystem__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1705:1: ( ( 'initialWorkPieces' ) )
            // InternalMSDsl.g:1706:1: ( 'initialWorkPieces' )
            {
            // InternalMSDsl.g:1706:1: ( 'initialWorkPieces' )
            // InternalMSDsl.g:1707:2: 'initialWorkPieces'
            {
             before(grammarAccess.getManufacturingSystemAccess().getInitialWorkPiecesKeyword_20_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getInitialWorkPiecesKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_20__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__1"
    // InternalMSDsl.g:1716:1: rule__ManufacturingSystem__Group_20__1 : rule__ManufacturingSystem__Group_20__1__Impl rule__ManufacturingSystem__Group_20__2 ;
    public final void rule__ManufacturingSystem__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1720:1: ( rule__ManufacturingSystem__Group_20__1__Impl rule__ManufacturingSystem__Group_20__2 )
            // InternalMSDsl.g:1721:2: rule__ManufacturingSystem__Group_20__1__Impl rule__ManufacturingSystem__Group_20__2
            {
            pushFollow(FOLLOW_14);
            rule__ManufacturingSystem__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_20__2();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_20__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__1__Impl"
    // InternalMSDsl.g:1728:1: rule__ManufacturingSystem__Group_20__1__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystem__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1732:1: ( ( '{' ) )
            // InternalMSDsl.g:1733:1: ( '{' )
            {
            // InternalMSDsl.g:1733:1: ( '{' )
            // InternalMSDsl.g:1734:2: '{'
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_20_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_20__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__2"
    // InternalMSDsl.g:1743:1: rule__ManufacturingSystem__Group_20__2 : rule__ManufacturingSystem__Group_20__2__Impl rule__ManufacturingSystem__Group_20__3 ;
    public final void rule__ManufacturingSystem__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1747:1: ( rule__ManufacturingSystem__Group_20__2__Impl rule__ManufacturingSystem__Group_20__3 )
            // InternalMSDsl.g:1748:2: rule__ManufacturingSystem__Group_20__2__Impl rule__ManufacturingSystem__Group_20__3
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_20__3();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_20__2"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__2__Impl"
    // InternalMSDsl.g:1755:1: rule__ManufacturingSystem__Group_20__2__Impl : ( ( rule__ManufacturingSystem__TransformsAssignment_20_2 ) ) ;
    public final void rule__ManufacturingSystem__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1759:1: ( ( ( rule__ManufacturingSystem__TransformsAssignment_20_2 ) ) )
            // InternalMSDsl.g:1760:1: ( ( rule__ManufacturingSystem__TransformsAssignment_20_2 ) )
            {
            // InternalMSDsl.g:1760:1: ( ( rule__ManufacturingSystem__TransformsAssignment_20_2 ) )
            // InternalMSDsl.g:1761:2: ( rule__ManufacturingSystem__TransformsAssignment_20_2 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getTransformsAssignment_20_2()); 
            // InternalMSDsl.g:1762:2: ( rule__ManufacturingSystem__TransformsAssignment_20_2 )
            // InternalMSDsl.g:1762:3: rule__ManufacturingSystem__TransformsAssignment_20_2
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__TransformsAssignment_20_2();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getTransformsAssignment_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_20__2__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__3"
    // InternalMSDsl.g:1770:1: rule__ManufacturingSystem__Group_20__3 : rule__ManufacturingSystem__Group_20__3__Impl rule__ManufacturingSystem__Group_20__4 ;
    public final void rule__ManufacturingSystem__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1774:1: ( rule__ManufacturingSystem__Group_20__3__Impl rule__ManufacturingSystem__Group_20__4 )
            // InternalMSDsl.g:1775:2: rule__ManufacturingSystem__Group_20__3__Impl rule__ManufacturingSystem__Group_20__4
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_20__4();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_20__3"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__3__Impl"
    // InternalMSDsl.g:1782:1: rule__ManufacturingSystem__Group_20__3__Impl : ( ( rule__ManufacturingSystem__Group_20_3__0 )* ) ;
    public final void rule__ManufacturingSystem__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1786:1: ( ( ( rule__ManufacturingSystem__Group_20_3__0 )* ) )
            // InternalMSDsl.g:1787:1: ( ( rule__ManufacturingSystem__Group_20_3__0 )* )
            {
            // InternalMSDsl.g:1787:1: ( ( rule__ManufacturingSystem__Group_20_3__0 )* )
            // InternalMSDsl.g:1788:2: ( rule__ManufacturingSystem__Group_20_3__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_20_3()); 
            // InternalMSDsl.g:1789:2: ( rule__ManufacturingSystem__Group_20_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSDsl.g:1789:3: rule__ManufacturingSystem__Group_20_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingSystem__Group_20_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_20_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_20__3__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__4"
    // InternalMSDsl.g:1797:1: rule__ManufacturingSystem__Group_20__4 : rule__ManufacturingSystem__Group_20__4__Impl ;
    public final void rule__ManufacturingSystem__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1801:1: ( rule__ManufacturingSystem__Group_20__4__Impl )
            // InternalMSDsl.g:1802:2: rule__ManufacturingSystem__Group_20__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_20__4__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_20__4"


    // $ANTLR start "rule__ManufacturingSystem__Group_20__4__Impl"
    // InternalMSDsl.g:1808:1: rule__ManufacturingSystem__Group_20__4__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystem__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1812:1: ( ( '}' ) )
            // InternalMSDsl.g:1813:1: ( '}' )
            {
            // InternalMSDsl.g:1813:1: ( '}' )
            // InternalMSDsl.g:1814:2: '}'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_20_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_20_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_20__4__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_20_3__0"
    // InternalMSDsl.g:1824:1: rule__ManufacturingSystem__Group_20_3__0 : rule__ManufacturingSystem__Group_20_3__0__Impl rule__ManufacturingSystem__Group_20_3__1 ;
    public final void rule__ManufacturingSystem__Group_20_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1828:1: ( rule__ManufacturingSystem__Group_20_3__0__Impl rule__ManufacturingSystem__Group_20_3__1 )
            // InternalMSDsl.g:1829:2: rule__ManufacturingSystem__Group_20_3__0__Impl rule__ManufacturingSystem__Group_20_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ManufacturingSystem__Group_20_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_20_3__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_20_3__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_20_3__0__Impl"
    // InternalMSDsl.g:1836:1: rule__ManufacturingSystem__Group_20_3__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_20_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1840:1: ( ( ',' ) )
            // InternalMSDsl.g:1841:1: ( ',' )
            {
            // InternalMSDsl.g:1841:1: ( ',' )
            // InternalMSDsl.g:1842:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_20_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_20_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_20_3__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_20_3__1"
    // InternalMSDsl.g:1851:1: rule__ManufacturingSystem__Group_20_3__1 : rule__ManufacturingSystem__Group_20_3__1__Impl ;
    public final void rule__ManufacturingSystem__Group_20_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1855:1: ( rule__ManufacturingSystem__Group_20_3__1__Impl )
            // InternalMSDsl.g:1856:2: rule__ManufacturingSystem__Group_20_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_20_3__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_20_3__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_20_3__1__Impl"
    // InternalMSDsl.g:1862:1: rule__ManufacturingSystem__Group_20_3__1__Impl : ( ( rule__ManufacturingSystem__TransformsAssignment_20_3_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_20_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1866:1: ( ( ( rule__ManufacturingSystem__TransformsAssignment_20_3_1 ) ) )
            // InternalMSDsl.g:1867:1: ( ( rule__ManufacturingSystem__TransformsAssignment_20_3_1 ) )
            {
            // InternalMSDsl.g:1867:1: ( ( rule__ManufacturingSystem__TransformsAssignment_20_3_1 ) )
            // InternalMSDsl.g:1868:2: ( rule__ManufacturingSystem__TransformsAssignment_20_3_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getTransformsAssignment_20_3_1()); 
            // InternalMSDsl.g:1869:2: ( rule__ManufacturingSystem__TransformsAssignment_20_3_1 )
            // InternalMSDsl.g:1869:3: rule__ManufacturingSystem__TransformsAssignment_20_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__TransformsAssignment_20_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getTransformsAssignment_20_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_20_3__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__0"
    // InternalMSDsl.g:1878:1: rule__ManufacturingSystem__Group_21__0 : rule__ManufacturingSystem__Group_21__0__Impl rule__ManufacturingSystem__Group_21__1 ;
    public final void rule__ManufacturingSystem__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1882:1: ( rule__ManufacturingSystem__Group_21__0__Impl rule__ManufacturingSystem__Group_21__1 )
            // InternalMSDsl.g:1883:2: rule__ManufacturingSystem__Group_21__0__Impl rule__ManufacturingSystem__Group_21__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_21__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__0__Impl"
    // InternalMSDsl.g:1890:1: rule__ManufacturingSystem__Group_21__0__Impl : ( 'staff' ) ;
    public final void rule__ManufacturingSystem__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1894:1: ( ( 'staff' ) )
            // InternalMSDsl.g:1895:1: ( 'staff' )
            {
            // InternalMSDsl.g:1895:1: ( 'staff' )
            // InternalMSDsl.g:1896:2: 'staff'
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffKeyword_21_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getStaffKeyword_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__1"
    // InternalMSDsl.g:1905:1: rule__ManufacturingSystem__Group_21__1 : rule__ManufacturingSystem__Group_21__1__Impl rule__ManufacturingSystem__Group_21__2 ;
    public final void rule__ManufacturingSystem__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1909:1: ( rule__ManufacturingSystem__Group_21__1__Impl rule__ManufacturingSystem__Group_21__2 )
            // InternalMSDsl.g:1910:2: rule__ManufacturingSystem__Group_21__1__Impl rule__ManufacturingSystem__Group_21__2
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group_21__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__2();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_21__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__1__Impl"
    // InternalMSDsl.g:1917:1: rule__ManufacturingSystem__Group_21__1__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystem__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1921:1: ( ( '{' ) )
            // InternalMSDsl.g:1922:1: ( '{' )
            {
            // InternalMSDsl.g:1922:1: ( '{' )
            // InternalMSDsl.g:1923:2: '{'
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_21_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__2"
    // InternalMSDsl.g:1932:1: rule__ManufacturingSystem__Group_21__2 : rule__ManufacturingSystem__Group_21__2__Impl rule__ManufacturingSystem__Group_21__3 ;
    public final void rule__ManufacturingSystem__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1936:1: ( rule__ManufacturingSystem__Group_21__2__Impl rule__ManufacturingSystem__Group_21__3 )
            // InternalMSDsl.g:1937:2: rule__ManufacturingSystem__Group_21__2__Impl rule__ManufacturingSystem__Group_21__3
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group_21__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__3();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_21__2"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__2__Impl"
    // InternalMSDsl.g:1944:1: rule__ManufacturingSystem__Group_21__2__Impl : ( ( rule__ManufacturingSystem__StaffAssignment_21_2 ) ) ;
    public final void rule__ManufacturingSystem__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1948:1: ( ( ( rule__ManufacturingSystem__StaffAssignment_21_2 ) ) )
            // InternalMSDsl.g:1949:1: ( ( rule__ManufacturingSystem__StaffAssignment_21_2 ) )
            {
            // InternalMSDsl.g:1949:1: ( ( rule__ManufacturingSystem__StaffAssignment_21_2 ) )
            // InternalMSDsl.g:1950:2: ( rule__ManufacturingSystem__StaffAssignment_21_2 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffAssignment_21_2()); 
            // InternalMSDsl.g:1951:2: ( rule__ManufacturingSystem__StaffAssignment_21_2 )
            // InternalMSDsl.g:1951:3: rule__ManufacturingSystem__StaffAssignment_21_2
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__StaffAssignment_21_2();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getStaffAssignment_21_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__2__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__3"
    // InternalMSDsl.g:1959:1: rule__ManufacturingSystem__Group_21__3 : rule__ManufacturingSystem__Group_21__3__Impl rule__ManufacturingSystem__Group_21__4 ;
    public final void rule__ManufacturingSystem__Group_21__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1963:1: ( rule__ManufacturingSystem__Group_21__3__Impl rule__ManufacturingSystem__Group_21__4 )
            // InternalMSDsl.g:1964:2: rule__ManufacturingSystem__Group_21__3__Impl rule__ManufacturingSystem__Group_21__4
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group_21__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__4();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_21__3"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__3__Impl"
    // InternalMSDsl.g:1971:1: rule__ManufacturingSystem__Group_21__3__Impl : ( ( rule__ManufacturingSystem__Group_21_3__0 )* ) ;
    public final void rule__ManufacturingSystem__Group_21__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1975:1: ( ( ( rule__ManufacturingSystem__Group_21_3__0 )* ) )
            // InternalMSDsl.g:1976:1: ( ( rule__ManufacturingSystem__Group_21_3__0 )* )
            {
            // InternalMSDsl.g:1976:1: ( ( rule__ManufacturingSystem__Group_21_3__0 )* )
            // InternalMSDsl.g:1977:2: ( rule__ManufacturingSystem__Group_21_3__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_21_3()); 
            // InternalMSDsl.g:1978:2: ( rule__ManufacturingSystem__Group_21_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMSDsl.g:1978:3: rule__ManufacturingSystem__Group_21_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingSystem__Group_21_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_21_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__3__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__4"
    // InternalMSDsl.g:1986:1: rule__ManufacturingSystem__Group_21__4 : rule__ManufacturingSystem__Group_21__4__Impl ;
    public final void rule__ManufacturingSystem__Group_21__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:1990:1: ( rule__ManufacturingSystem__Group_21__4__Impl )
            // InternalMSDsl.g:1991:2: rule__ManufacturingSystem__Group_21__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__4__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_21__4"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__4__Impl"
    // InternalMSDsl.g:1997:1: rule__ManufacturingSystem__Group_21__4__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystem__Group_21__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2001:1: ( ( '}' ) )
            // InternalMSDsl.g:2002:1: ( '}' )
            {
            // InternalMSDsl.g:2002:1: ( '}' )
            // InternalMSDsl.g:2003:2: '}'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_21_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_21_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__4__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21_3__0"
    // InternalMSDsl.g:2013:1: rule__ManufacturingSystem__Group_21_3__0 : rule__ManufacturingSystem__Group_21_3__0__Impl rule__ManufacturingSystem__Group_21_3__1 ;
    public final void rule__ManufacturingSystem__Group_21_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2017:1: ( rule__ManufacturingSystem__Group_21_3__0__Impl rule__ManufacturingSystem__Group_21_3__1 )
            // InternalMSDsl.g:2018:2: rule__ManufacturingSystem__Group_21_3__0__Impl rule__ManufacturingSystem__Group_21_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystem__Group_21_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21_3__1();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_21_3__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_21_3__0__Impl"
    // InternalMSDsl.g:2025:1: rule__ManufacturingSystem__Group_21_3__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_21_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2029:1: ( ( ',' ) )
            // InternalMSDsl.g:2030:1: ( ',' )
            {
            // InternalMSDsl.g:2030:1: ( ',' )
            // InternalMSDsl.g:2031:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_21_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_21_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21_3__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21_3__1"
    // InternalMSDsl.g:2040:1: rule__ManufacturingSystem__Group_21_3__1 : rule__ManufacturingSystem__Group_21_3__1__Impl ;
    public final void rule__ManufacturingSystem__Group_21_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2044:1: ( rule__ManufacturingSystem__Group_21_3__1__Impl )
            // InternalMSDsl.g:2045:2: rule__ManufacturingSystem__Group_21_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21_3__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystem__Group_21_3__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_21_3__1__Impl"
    // InternalMSDsl.g:2051:1: rule__ManufacturingSystem__Group_21_3__1__Impl : ( ( rule__ManufacturingSystem__StaffAssignment_21_3_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_21_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2055:1: ( ( ( rule__ManufacturingSystem__StaffAssignment_21_3_1 ) ) )
            // InternalMSDsl.g:2056:1: ( ( rule__ManufacturingSystem__StaffAssignment_21_3_1 ) )
            {
            // InternalMSDsl.g:2056:1: ( ( rule__ManufacturingSystem__StaffAssignment_21_3_1 ) )
            // InternalMSDsl.g:2057:2: ( rule__ManufacturingSystem__StaffAssignment_21_3_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffAssignment_21_3_1()); 
            // InternalMSDsl.g:2058:2: ( rule__ManufacturingSystem__StaffAssignment_21_3_1 )
            // InternalMSDsl.g:2058:3: rule__ManufacturingSystem__StaffAssignment_21_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__StaffAssignment_21_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getStaffAssignment_21_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21_3__1__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__0"
    // InternalMSDsl.g:2067:1: rule__ManufacturingSystemElement_Impl__Group__0 : rule__ManufacturingSystemElement_Impl__Group__0__Impl rule__ManufacturingSystemElement_Impl__Group__1 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2071:1: ( rule__ManufacturingSystemElement_Impl__Group__0__Impl rule__ManufacturingSystemElement_Impl__Group__1 )
            // InternalMSDsl.g:2072:2: rule__ManufacturingSystemElement_Impl__Group__0__Impl rule__ManufacturingSystemElement_Impl__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ManufacturingSystemElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__1();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__0"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__0__Impl"
    // InternalMSDsl.g:2079:1: rule__ManufacturingSystemElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2083:1: ( ( () ) )
            // InternalMSDsl.g:2084:1: ( () )
            {
            // InternalMSDsl.g:2084:1: ( () )
            // InternalMSDsl.g:2085:2: ()
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementAction_0()); 
            // InternalMSDsl.g:2086:2: ()
            // InternalMSDsl.g:2086:3: 
            {
            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__1"
    // InternalMSDsl.g:2094:1: rule__ManufacturingSystemElement_Impl__Group__1 : rule__ManufacturingSystemElement_Impl__Group__1__Impl rule__ManufacturingSystemElement_Impl__Group__2 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2098:1: ( rule__ManufacturingSystemElement_Impl__Group__1__Impl rule__ManufacturingSystemElement_Impl__Group__2 )
            // InternalMSDsl.g:2099:2: rule__ManufacturingSystemElement_Impl__Group__1__Impl rule__ManufacturingSystemElement_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystemElement_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__2();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__1__Impl"
    // InternalMSDsl.g:2106:1: rule__ManufacturingSystemElement_Impl__Group__1__Impl : ( 'ManufacturingSystemElement' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2110:1: ( ( 'ManufacturingSystemElement' ) )
            // InternalMSDsl.g:2111:1: ( 'ManufacturingSystemElement' )
            {
            // InternalMSDsl.g:2111:1: ( 'ManufacturingSystemElement' )
            // InternalMSDsl.g:2112:2: 'ManufacturingSystemElement'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__2"
    // InternalMSDsl.g:2121:1: rule__ManufacturingSystemElement_Impl__Group__2 : rule__ManufacturingSystemElement_Impl__Group__2__Impl rule__ManufacturingSystemElement_Impl__Group__3 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2125:1: ( rule__ManufacturingSystemElement_Impl__Group__2__Impl rule__ManufacturingSystemElement_Impl__Group__3 )
            // InternalMSDsl.g:2126:2: rule__ManufacturingSystemElement_Impl__Group__2__Impl rule__ManufacturingSystemElement_Impl__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystemElement_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__3();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__2"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__2__Impl"
    // InternalMSDsl.g:2133:1: rule__ManufacturingSystemElement_Impl__Group__2__Impl : ( ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2137:1: ( ( ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 ) ) )
            // InternalMSDsl.g:2138:1: ( ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 ) )
            {
            // InternalMSDsl.g:2138:1: ( ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 ) )
            // InternalMSDsl.g:2139:2: ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameAssignment_2()); 
            // InternalMSDsl.g:2140:2: ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 )
            // InternalMSDsl.g:2140:3: rule__ManufacturingSystemElement_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__2__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__3"
    // InternalMSDsl.g:2148:1: rule__ManufacturingSystemElement_Impl__Group__3 : rule__ManufacturingSystemElement_Impl__Group__3__Impl rule__ManufacturingSystemElement_Impl__Group__4 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2152:1: ( rule__ManufacturingSystemElement_Impl__Group__3__Impl rule__ManufacturingSystemElement_Impl__Group__4 )
            // InternalMSDsl.g:2153:2: rule__ManufacturingSystemElement_Impl__Group__3__Impl rule__ManufacturingSystemElement_Impl__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ManufacturingSystemElement_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__4();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__3"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__3__Impl"
    // InternalMSDsl.g:2160:1: rule__ManufacturingSystemElement_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2164:1: ( ( '{' ) )
            // InternalMSDsl.g:2165:1: ( '{' )
            {
            // InternalMSDsl.g:2165:1: ( '{' )
            // InternalMSDsl.g:2166:2: '{'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__3__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__4"
    // InternalMSDsl.g:2175:1: rule__ManufacturingSystemElement_Impl__Group__4 : rule__ManufacturingSystemElement_Impl__Group__4__Impl rule__ManufacturingSystemElement_Impl__Group__5 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2179:1: ( rule__ManufacturingSystemElement_Impl__Group__4__Impl rule__ManufacturingSystemElement_Impl__Group__5 )
            // InternalMSDsl.g:2180:2: rule__ManufacturingSystemElement_Impl__Group__4__Impl rule__ManufacturingSystemElement_Impl__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ManufacturingSystemElement_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__5();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__4"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__4__Impl"
    // InternalMSDsl.g:2187:1: rule__ManufacturingSystemElement_Impl__Group__4__Impl : ( ( rule__ManufacturingSystemElement_Impl__Group_4__0 )? ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2191:1: ( ( ( rule__ManufacturingSystemElement_Impl__Group_4__0 )? ) )
            // InternalMSDsl.g:2192:1: ( ( rule__ManufacturingSystemElement_Impl__Group_4__0 )? )
            {
            // InternalMSDsl.g:2192:1: ( ( rule__ManufacturingSystemElement_Impl__Group_4__0 )? )
            // InternalMSDsl.g:2193:2: ( rule__ManufacturingSystemElement_Impl__Group_4__0 )?
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_4()); 
            // InternalMSDsl.g:2194:2: ( rule__ManufacturingSystemElement_Impl__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMSDsl.g:2194:3: rule__ManufacturingSystemElement_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystemElement_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__4__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__5"
    // InternalMSDsl.g:2202:1: rule__ManufacturingSystemElement_Impl__Group__5 : rule__ManufacturingSystemElement_Impl__Group__5__Impl rule__ManufacturingSystemElement_Impl__Group__6 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2206:1: ( rule__ManufacturingSystemElement_Impl__Group__5__Impl rule__ManufacturingSystemElement_Impl__Group__6 )
            // InternalMSDsl.g:2207:2: rule__ManufacturingSystemElement_Impl__Group__5__Impl rule__ManufacturingSystemElement_Impl__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ManufacturingSystemElement_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__6();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__5"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__5__Impl"
    // InternalMSDsl.g:2214:1: rule__ManufacturingSystemElement_Impl__Group__5__Impl : ( ( rule__ManufacturingSystemElement_Impl__Group_5__0 )? ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2218:1: ( ( ( rule__ManufacturingSystemElement_Impl__Group_5__0 )? ) )
            // InternalMSDsl.g:2219:1: ( ( rule__ManufacturingSystemElement_Impl__Group_5__0 )? )
            {
            // InternalMSDsl.g:2219:1: ( ( rule__ManufacturingSystemElement_Impl__Group_5__0 )? )
            // InternalMSDsl.g:2220:2: ( rule__ManufacturingSystemElement_Impl__Group_5__0 )?
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_5()); 
            // InternalMSDsl.g:2221:2: ( rule__ManufacturingSystemElement_Impl__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMSDsl.g:2221:3: rule__ManufacturingSystemElement_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystemElement_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__5__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__6"
    // InternalMSDsl.g:2229:1: rule__ManufacturingSystemElement_Impl__Group__6 : rule__ManufacturingSystemElement_Impl__Group__6__Impl ;
    public final void rule__ManufacturingSystemElement_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2233:1: ( rule__ManufacturingSystemElement_Impl__Group__6__Impl )
            // InternalMSDsl.g:2234:2: rule__ManufacturingSystemElement_Impl__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__6__Impl();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__6"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__6__Impl"
    // InternalMSDsl.g:2240:1: rule__ManufacturingSystemElement_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2244:1: ( ( '}' ) )
            // InternalMSDsl.g:2245:1: ( '}' )
            {
            // InternalMSDsl.g:2245:1: ( '}' )
            // InternalMSDsl.g:2246:2: '}'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__6__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__0"
    // InternalMSDsl.g:2256:1: rule__ManufacturingSystemElement_Impl__Group_4__0 : rule__ManufacturingSystemElement_Impl__Group_4__0__Impl rule__ManufacturingSystemElement_Impl__Group_4__1 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2260:1: ( rule__ManufacturingSystemElement_Impl__Group_4__0__Impl rule__ManufacturingSystemElement_Impl__Group_4__1 )
            // InternalMSDsl.g:2261:2: rule__ManufacturingSystemElement_Impl__Group_4__0__Impl rule__ManufacturingSystemElement_Impl__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystemElement_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4__1();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__0"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__0__Impl"
    // InternalMSDsl.g:2268:1: rule__ManufacturingSystemElement_Impl__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2272:1: ( ( 'transition' ) )
            // InternalMSDsl.g:2273:1: ( 'transition' )
            {
            // InternalMSDsl.g:2273:1: ( 'transition' )
            // InternalMSDsl.g:2274:2: 'transition'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__1"
    // InternalMSDsl.g:2283:1: rule__ManufacturingSystemElement_Impl__Group_4__1 : rule__ManufacturingSystemElement_Impl__Group_4__1__Impl rule__ManufacturingSystemElement_Impl__Group_4__2 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2287:1: ( rule__ManufacturingSystemElement_Impl__Group_4__1__Impl rule__ManufacturingSystemElement_Impl__Group_4__2 )
            // InternalMSDsl.g:2288:2: rule__ManufacturingSystemElement_Impl__Group_4__1__Impl rule__ManufacturingSystemElement_Impl__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__ManufacturingSystemElement_Impl__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4__2();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__1__Impl"
    // InternalMSDsl.g:2295:1: rule__ManufacturingSystemElement_Impl__Group_4__1__Impl : ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1 ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2299:1: ( ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1 ) ) )
            // InternalMSDsl.g:2300:1: ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1 ) )
            {
            // InternalMSDsl.g:2300:1: ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1 ) )
            // InternalMSDsl.g:2301:2: ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionAssignment_4_1()); 
            // InternalMSDsl.g:2302:2: ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1 )
            // InternalMSDsl.g:2302:3: rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__2"
    // InternalMSDsl.g:2310:1: rule__ManufacturingSystemElement_Impl__Group_4__2 : rule__ManufacturingSystemElement_Impl__Group_4__2__Impl ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2314:1: ( rule__ManufacturingSystemElement_Impl__Group_4__2__Impl )
            // InternalMSDsl.g:2315:2: rule__ManufacturingSystemElement_Impl__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4__2__Impl();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__2"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__2__Impl"
    // InternalMSDsl.g:2321:1: rule__ManufacturingSystemElement_Impl__Group_4__2__Impl : ( ( rule__ManufacturingSystemElement_Impl__Group_4_2__0 )* ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2325:1: ( ( ( rule__ManufacturingSystemElement_Impl__Group_4_2__0 )* ) )
            // InternalMSDsl.g:2326:1: ( ( rule__ManufacturingSystemElement_Impl__Group_4_2__0 )* )
            {
            // InternalMSDsl.g:2326:1: ( ( rule__ManufacturingSystemElement_Impl__Group_4_2__0 )* )
            // InternalMSDsl.g:2327:2: ( rule__ManufacturingSystemElement_Impl__Group_4_2__0 )*
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_4_2()); 
            // InternalMSDsl.g:2328:2: ( rule__ManufacturingSystemElement_Impl__Group_4_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMSDsl.g:2328:3: rule__ManufacturingSystemElement_Impl__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingSystemElement_Impl__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__2__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4_2__0"
    // InternalMSDsl.g:2337:1: rule__ManufacturingSystemElement_Impl__Group_4_2__0 : rule__ManufacturingSystemElement_Impl__Group_4_2__0__Impl rule__ManufacturingSystemElement_Impl__Group_4_2__1 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2341:1: ( rule__ManufacturingSystemElement_Impl__Group_4_2__0__Impl rule__ManufacturingSystemElement_Impl__Group_4_2__1 )
            // InternalMSDsl.g:2342:2: rule__ManufacturingSystemElement_Impl__Group_4_2__0__Impl rule__ManufacturingSystemElement_Impl__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystemElement_Impl__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4_2__1();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4_2__0"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4_2__0__Impl"
    // InternalMSDsl.g:2349:1: rule__ManufacturingSystemElement_Impl__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2353:1: ( ( ',' ) )
            // InternalMSDsl.g:2354:1: ( ',' )
            {
            // InternalMSDsl.g:2354:1: ( ',' )
            // InternalMSDsl.g:2355:2: ','
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4_2__0__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4_2__1"
    // InternalMSDsl.g:2364:1: rule__ManufacturingSystemElement_Impl__Group_4_2__1 : rule__ManufacturingSystemElement_Impl__Group_4_2__1__Impl ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2368:1: ( rule__ManufacturingSystemElement_Impl__Group_4_2__1__Impl )
            // InternalMSDsl.g:2369:2: rule__ManufacturingSystemElement_Impl__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4_2__1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4_2__1__Impl"
    // InternalMSDsl.g:2375:1: rule__ManufacturingSystemElement_Impl__Group_4_2__1__Impl : ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1 ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2379:1: ( ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1 ) ) )
            // InternalMSDsl.g:2380:1: ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1 ) )
            {
            // InternalMSDsl.g:2380:1: ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1 ) )
            // InternalMSDsl.g:2381:2: ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionAssignment_4_2_1()); 
            // InternalMSDsl.g:2382:2: ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1 )
            // InternalMSDsl.g:2382:3: rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4_2__1__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_5__0"
    // InternalMSDsl.g:2391:1: rule__ManufacturingSystemElement_Impl__Group_5__0 : rule__ManufacturingSystemElement_Impl__Group_5__0__Impl rule__ManufacturingSystemElement_Impl__Group_5__1 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2395:1: ( rule__ManufacturingSystemElement_Impl__Group_5__0__Impl rule__ManufacturingSystemElement_Impl__Group_5__1 )
            // InternalMSDsl.g:2396:2: rule__ManufacturingSystemElement_Impl__Group_5__0__Impl rule__ManufacturingSystemElement_Impl__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingSystemElement_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_5__1();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_5__0"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_5__0__Impl"
    // InternalMSDsl.g:2403:1: rule__ManufacturingSystemElement_Impl__Group_5__0__Impl : ( 'responsible' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2407:1: ( ( 'responsible' ) )
            // InternalMSDsl.g:2408:1: ( 'responsible' )
            {
            // InternalMSDsl.g:2408:1: ( 'responsible' )
            // InternalMSDsl.g:2409:2: 'responsible'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_5__1"
    // InternalMSDsl.g:2418:1: rule__ManufacturingSystemElement_Impl__Group_5__1 : rule__ManufacturingSystemElement_Impl__Group_5__1__Impl ;
    public final void rule__ManufacturingSystemElement_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2422:1: ( rule__ManufacturingSystemElement_Impl__Group_5__1__Impl )
            // InternalMSDsl.g:2423:2: rule__ManufacturingSystemElement_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_5__1__Impl();

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
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_5__1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_5__1__Impl"
    // InternalMSDsl.g:2429:1: rule__ManufacturingSystemElement_Impl__Group_5__1__Impl : ( ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1 ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2433:1: ( ( ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1 ) ) )
            // InternalMSDsl.g:2434:1: ( ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1 ) )
            {
            // InternalMSDsl.g:2434:1: ( ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1 ) )
            // InternalMSDsl.g:2435:2: ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleAssignment_5_1()); 
            // InternalMSDsl.g:2436:2: ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1 )
            // InternalMSDsl.g:2436:3: rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group__0"
    // InternalMSDsl.g:2445:1: rule__StoragePoint__Group__0 : rule__StoragePoint__Group__0__Impl rule__StoragePoint__Group__1 ;
    public final void rule__StoragePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2449:1: ( rule__StoragePoint__Group__0__Impl rule__StoragePoint__Group__1 )
            // InternalMSDsl.g:2450:2: rule__StoragePoint__Group__0__Impl rule__StoragePoint__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__StoragePoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__1();

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
    // $ANTLR end "rule__StoragePoint__Group__0"


    // $ANTLR start "rule__StoragePoint__Group__0__Impl"
    // InternalMSDsl.g:2457:1: rule__StoragePoint__Group__0__Impl : ( () ) ;
    public final void rule__StoragePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2461:1: ( ( () ) )
            // InternalMSDsl.g:2462:1: ( () )
            {
            // InternalMSDsl.g:2462:1: ( () )
            // InternalMSDsl.g:2463:2: ()
            {
             before(grammarAccess.getStoragePointAccess().getStoragePointAction_0()); 
            // InternalMSDsl.g:2464:2: ()
            // InternalMSDsl.g:2464:3: 
            {
            }

             after(grammarAccess.getStoragePointAccess().getStoragePointAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group__1"
    // InternalMSDsl.g:2472:1: rule__StoragePoint__Group__1 : rule__StoragePoint__Group__1__Impl rule__StoragePoint__Group__2 ;
    public final void rule__StoragePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2476:1: ( rule__StoragePoint__Group__1__Impl rule__StoragePoint__Group__2 )
            // InternalMSDsl.g:2477:2: rule__StoragePoint__Group__1__Impl rule__StoragePoint__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StoragePoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__2();

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
    // $ANTLR end "rule__StoragePoint__Group__1"


    // $ANTLR start "rule__StoragePoint__Group__1__Impl"
    // InternalMSDsl.g:2484:1: rule__StoragePoint__Group__1__Impl : ( 'StoragePoint' ) ;
    public final void rule__StoragePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2488:1: ( ( 'StoragePoint' ) )
            // InternalMSDsl.g:2489:1: ( 'StoragePoint' )
            {
            // InternalMSDsl.g:2489:1: ( 'StoragePoint' )
            // InternalMSDsl.g:2490:2: 'StoragePoint'
            {
             before(grammarAccess.getStoragePointAccess().getStoragePointKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getStoragePointKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group__2"
    // InternalMSDsl.g:2499:1: rule__StoragePoint__Group__2 : rule__StoragePoint__Group__2__Impl rule__StoragePoint__Group__3 ;
    public final void rule__StoragePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2503:1: ( rule__StoragePoint__Group__2__Impl rule__StoragePoint__Group__3 )
            // InternalMSDsl.g:2504:2: rule__StoragePoint__Group__2__Impl rule__StoragePoint__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__StoragePoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__3();

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
    // $ANTLR end "rule__StoragePoint__Group__2"


    // $ANTLR start "rule__StoragePoint__Group__2__Impl"
    // InternalMSDsl.g:2511:1: rule__StoragePoint__Group__2__Impl : ( ( rule__StoragePoint__NameAssignment_2 ) ) ;
    public final void rule__StoragePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2515:1: ( ( ( rule__StoragePoint__NameAssignment_2 ) ) )
            // InternalMSDsl.g:2516:1: ( ( rule__StoragePoint__NameAssignment_2 ) )
            {
            // InternalMSDsl.g:2516:1: ( ( rule__StoragePoint__NameAssignment_2 ) )
            // InternalMSDsl.g:2517:2: ( rule__StoragePoint__NameAssignment_2 )
            {
             before(grammarAccess.getStoragePointAccess().getNameAssignment_2()); 
            // InternalMSDsl.g:2518:2: ( rule__StoragePoint__NameAssignment_2 )
            // InternalMSDsl.g:2518:3: rule__StoragePoint__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__2__Impl"


    // $ANTLR start "rule__StoragePoint__Group__3"
    // InternalMSDsl.g:2526:1: rule__StoragePoint__Group__3 : rule__StoragePoint__Group__3__Impl rule__StoragePoint__Group__4 ;
    public final void rule__StoragePoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2530:1: ( rule__StoragePoint__Group__3__Impl rule__StoragePoint__Group__4 )
            // InternalMSDsl.g:2531:2: rule__StoragePoint__Group__3__Impl rule__StoragePoint__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__StoragePoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__4();

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
    // $ANTLR end "rule__StoragePoint__Group__3"


    // $ANTLR start "rule__StoragePoint__Group__3__Impl"
    // InternalMSDsl.g:2538:1: rule__StoragePoint__Group__3__Impl : ( '{' ) ;
    public final void rule__StoragePoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2542:1: ( ( '{' ) )
            // InternalMSDsl.g:2543:1: ( '{' )
            {
            // InternalMSDsl.g:2543:1: ( '{' )
            // InternalMSDsl.g:2544:2: '{'
            {
             before(grammarAccess.getStoragePointAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__3__Impl"


    // $ANTLR start "rule__StoragePoint__Group__4"
    // InternalMSDsl.g:2553:1: rule__StoragePoint__Group__4 : rule__StoragePoint__Group__4__Impl rule__StoragePoint__Group__5 ;
    public final void rule__StoragePoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2557:1: ( rule__StoragePoint__Group__4__Impl rule__StoragePoint__Group__5 )
            // InternalMSDsl.g:2558:2: rule__StoragePoint__Group__4__Impl rule__StoragePoint__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__StoragePoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__5();

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
    // $ANTLR end "rule__StoragePoint__Group__4"


    // $ANTLR start "rule__StoragePoint__Group__4__Impl"
    // InternalMSDsl.g:2565:1: rule__StoragePoint__Group__4__Impl : ( ( rule__StoragePoint__Group_4__0 )? ) ;
    public final void rule__StoragePoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2569:1: ( ( ( rule__StoragePoint__Group_4__0 )? ) )
            // InternalMSDsl.g:2570:1: ( ( rule__StoragePoint__Group_4__0 )? )
            {
            // InternalMSDsl.g:2570:1: ( ( rule__StoragePoint__Group_4__0 )? )
            // InternalMSDsl.g:2571:2: ( rule__StoragePoint__Group_4__0 )?
            {
             before(grammarAccess.getStoragePointAccess().getGroup_4()); 
            // InternalMSDsl.g:2572:2: ( rule__StoragePoint__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMSDsl.g:2572:3: rule__StoragePoint__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoragePoint__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoragePointAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__4__Impl"


    // $ANTLR start "rule__StoragePoint__Group__5"
    // InternalMSDsl.g:2580:1: rule__StoragePoint__Group__5 : rule__StoragePoint__Group__5__Impl rule__StoragePoint__Group__6 ;
    public final void rule__StoragePoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2584:1: ( rule__StoragePoint__Group__5__Impl rule__StoragePoint__Group__6 )
            // InternalMSDsl.g:2585:2: rule__StoragePoint__Group__5__Impl rule__StoragePoint__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__StoragePoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__6();

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
    // $ANTLR end "rule__StoragePoint__Group__5"


    // $ANTLR start "rule__StoragePoint__Group__5__Impl"
    // InternalMSDsl.g:2592:1: rule__StoragePoint__Group__5__Impl : ( ( rule__StoragePoint__Group_5__0 )? ) ;
    public final void rule__StoragePoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2596:1: ( ( ( rule__StoragePoint__Group_5__0 )? ) )
            // InternalMSDsl.g:2597:1: ( ( rule__StoragePoint__Group_5__0 )? )
            {
            // InternalMSDsl.g:2597:1: ( ( rule__StoragePoint__Group_5__0 )? )
            // InternalMSDsl.g:2598:2: ( rule__StoragePoint__Group_5__0 )?
            {
             before(grammarAccess.getStoragePointAccess().getGroup_5()); 
            // InternalMSDsl.g:2599:2: ( rule__StoragePoint__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMSDsl.g:2599:3: rule__StoragePoint__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoragePoint__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoragePointAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__5__Impl"


    // $ANTLR start "rule__StoragePoint__Group__6"
    // InternalMSDsl.g:2607:1: rule__StoragePoint__Group__6 : rule__StoragePoint__Group__6__Impl rule__StoragePoint__Group__7 ;
    public final void rule__StoragePoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2611:1: ( rule__StoragePoint__Group__6__Impl rule__StoragePoint__Group__7 )
            // InternalMSDsl.g:2612:2: rule__StoragePoint__Group__6__Impl rule__StoragePoint__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__StoragePoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__7();

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
    // $ANTLR end "rule__StoragePoint__Group__6"


    // $ANTLR start "rule__StoragePoint__Group__6__Impl"
    // InternalMSDsl.g:2619:1: rule__StoragePoint__Group__6__Impl : ( ( rule__StoragePoint__Group_6__0 )? ) ;
    public final void rule__StoragePoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2623:1: ( ( ( rule__StoragePoint__Group_6__0 )? ) )
            // InternalMSDsl.g:2624:1: ( ( rule__StoragePoint__Group_6__0 )? )
            {
            // InternalMSDsl.g:2624:1: ( ( rule__StoragePoint__Group_6__0 )? )
            // InternalMSDsl.g:2625:2: ( rule__StoragePoint__Group_6__0 )?
            {
             before(grammarAccess.getStoragePointAccess().getGroup_6()); 
            // InternalMSDsl.g:2626:2: ( rule__StoragePoint__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMSDsl.g:2626:3: rule__StoragePoint__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoragePoint__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoragePointAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__6__Impl"


    // $ANTLR start "rule__StoragePoint__Group__7"
    // InternalMSDsl.g:2634:1: rule__StoragePoint__Group__7 : rule__StoragePoint__Group__7__Impl ;
    public final void rule__StoragePoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2638:1: ( rule__StoragePoint__Group__7__Impl )
            // InternalMSDsl.g:2639:2: rule__StoragePoint__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__7__Impl();

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
    // $ANTLR end "rule__StoragePoint__Group__7"


    // $ANTLR start "rule__StoragePoint__Group__7__Impl"
    // InternalMSDsl.g:2645:1: rule__StoragePoint__Group__7__Impl : ( '}' ) ;
    public final void rule__StoragePoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2649:1: ( ( '}' ) )
            // InternalMSDsl.g:2650:1: ( '}' )
            {
            // InternalMSDsl.g:2650:1: ( '}' )
            // InternalMSDsl.g:2651:2: '}'
            {
             before(grammarAccess.getStoragePointAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__7__Impl"


    // $ANTLR start "rule__StoragePoint__Group_4__0"
    // InternalMSDsl.g:2661:1: rule__StoragePoint__Group_4__0 : rule__StoragePoint__Group_4__0__Impl rule__StoragePoint__Group_4__1 ;
    public final void rule__StoragePoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2665:1: ( rule__StoragePoint__Group_4__0__Impl rule__StoragePoint__Group_4__1 )
            // InternalMSDsl.g:2666:2: rule__StoragePoint__Group_4__0__Impl rule__StoragePoint__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__StoragePoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_4__1();

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
    // $ANTLR end "rule__StoragePoint__Group_4__0"


    // $ANTLR start "rule__StoragePoint__Group_4__0__Impl"
    // InternalMSDsl.g:2673:1: rule__StoragePoint__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__StoragePoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2677:1: ( ( 'transition' ) )
            // InternalMSDsl.g:2678:1: ( 'transition' )
            {
            // InternalMSDsl.g:2678:1: ( 'transition' )
            // InternalMSDsl.g:2679:2: 'transition'
            {
             before(grammarAccess.getStoragePointAccess().getTransitionKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_4__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_4__1"
    // InternalMSDsl.g:2688:1: rule__StoragePoint__Group_4__1 : rule__StoragePoint__Group_4__1__Impl rule__StoragePoint__Group_4__2 ;
    public final void rule__StoragePoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2692:1: ( rule__StoragePoint__Group_4__1__Impl rule__StoragePoint__Group_4__2 )
            // InternalMSDsl.g:2693:2: rule__StoragePoint__Group_4__1__Impl rule__StoragePoint__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__StoragePoint__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_4__2();

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
    // $ANTLR end "rule__StoragePoint__Group_4__1"


    // $ANTLR start "rule__StoragePoint__Group_4__1__Impl"
    // InternalMSDsl.g:2700:1: rule__StoragePoint__Group_4__1__Impl : ( ( rule__StoragePoint__TransitionAssignment_4_1 ) ) ;
    public final void rule__StoragePoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2704:1: ( ( ( rule__StoragePoint__TransitionAssignment_4_1 ) ) )
            // InternalMSDsl.g:2705:1: ( ( rule__StoragePoint__TransitionAssignment_4_1 ) )
            {
            // InternalMSDsl.g:2705:1: ( ( rule__StoragePoint__TransitionAssignment_4_1 ) )
            // InternalMSDsl.g:2706:2: ( rule__StoragePoint__TransitionAssignment_4_1 )
            {
             before(grammarAccess.getStoragePointAccess().getTransitionAssignment_4_1()); 
            // InternalMSDsl.g:2707:2: ( rule__StoragePoint__TransitionAssignment_4_1 )
            // InternalMSDsl.g:2707:3: rule__StoragePoint__TransitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__TransitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getTransitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_4__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group_4__2"
    // InternalMSDsl.g:2715:1: rule__StoragePoint__Group_4__2 : rule__StoragePoint__Group_4__2__Impl ;
    public final void rule__StoragePoint__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2719:1: ( rule__StoragePoint__Group_4__2__Impl )
            // InternalMSDsl.g:2720:2: rule__StoragePoint__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_4__2__Impl();

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
    // $ANTLR end "rule__StoragePoint__Group_4__2"


    // $ANTLR start "rule__StoragePoint__Group_4__2__Impl"
    // InternalMSDsl.g:2726:1: rule__StoragePoint__Group_4__2__Impl : ( ( rule__StoragePoint__Group_4_2__0 )* ) ;
    public final void rule__StoragePoint__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2730:1: ( ( ( rule__StoragePoint__Group_4_2__0 )* ) )
            // InternalMSDsl.g:2731:1: ( ( rule__StoragePoint__Group_4_2__0 )* )
            {
            // InternalMSDsl.g:2731:1: ( ( rule__StoragePoint__Group_4_2__0 )* )
            // InternalMSDsl.g:2732:2: ( rule__StoragePoint__Group_4_2__0 )*
            {
             before(grammarAccess.getStoragePointAccess().getGroup_4_2()); 
            // InternalMSDsl.g:2733:2: ( rule__StoragePoint__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMSDsl.g:2733:3: rule__StoragePoint__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StoragePoint__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStoragePointAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_4__2__Impl"


    // $ANTLR start "rule__StoragePoint__Group_4_2__0"
    // InternalMSDsl.g:2742:1: rule__StoragePoint__Group_4_2__0 : rule__StoragePoint__Group_4_2__0__Impl rule__StoragePoint__Group_4_2__1 ;
    public final void rule__StoragePoint__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2746:1: ( rule__StoragePoint__Group_4_2__0__Impl rule__StoragePoint__Group_4_2__1 )
            // InternalMSDsl.g:2747:2: rule__StoragePoint__Group_4_2__0__Impl rule__StoragePoint__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__StoragePoint__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_4_2__1();

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
    // $ANTLR end "rule__StoragePoint__Group_4_2__0"


    // $ANTLR start "rule__StoragePoint__Group_4_2__0__Impl"
    // InternalMSDsl.g:2754:1: rule__StoragePoint__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__StoragePoint__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2758:1: ( ( ',' ) )
            // InternalMSDsl.g:2759:1: ( ',' )
            {
            // InternalMSDsl.g:2759:1: ( ',' )
            // InternalMSDsl.g:2760:2: ','
            {
             before(grammarAccess.getStoragePointAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_4_2__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_4_2__1"
    // InternalMSDsl.g:2769:1: rule__StoragePoint__Group_4_2__1 : rule__StoragePoint__Group_4_2__1__Impl ;
    public final void rule__StoragePoint__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2773:1: ( rule__StoragePoint__Group_4_2__1__Impl )
            // InternalMSDsl.g:2774:2: rule__StoragePoint__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__StoragePoint__Group_4_2__1"


    // $ANTLR start "rule__StoragePoint__Group_4_2__1__Impl"
    // InternalMSDsl.g:2780:1: rule__StoragePoint__Group_4_2__1__Impl : ( ( rule__StoragePoint__TransitionAssignment_4_2_1 ) ) ;
    public final void rule__StoragePoint__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2784:1: ( ( ( rule__StoragePoint__TransitionAssignment_4_2_1 ) ) )
            // InternalMSDsl.g:2785:1: ( ( rule__StoragePoint__TransitionAssignment_4_2_1 ) )
            {
            // InternalMSDsl.g:2785:1: ( ( rule__StoragePoint__TransitionAssignment_4_2_1 ) )
            // InternalMSDsl.g:2786:2: ( rule__StoragePoint__TransitionAssignment_4_2_1 )
            {
             before(grammarAccess.getStoragePointAccess().getTransitionAssignment_4_2_1()); 
            // InternalMSDsl.g:2787:2: ( rule__StoragePoint__TransitionAssignment_4_2_1 )
            // InternalMSDsl.g:2787:3: rule__StoragePoint__TransitionAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__TransitionAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getTransitionAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_4_2__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group_5__0"
    // InternalMSDsl.g:2796:1: rule__StoragePoint__Group_5__0 : rule__StoragePoint__Group_5__0__Impl rule__StoragePoint__Group_5__1 ;
    public final void rule__StoragePoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2800:1: ( rule__StoragePoint__Group_5__0__Impl rule__StoragePoint__Group_5__1 )
            // InternalMSDsl.g:2801:2: rule__StoragePoint__Group_5__0__Impl rule__StoragePoint__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__StoragePoint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_5__1();

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
    // $ANTLR end "rule__StoragePoint__Group_5__0"


    // $ANTLR start "rule__StoragePoint__Group_5__0__Impl"
    // InternalMSDsl.g:2808:1: rule__StoragePoint__Group_5__0__Impl : ( 'responsible' ) ;
    public final void rule__StoragePoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2812:1: ( ( 'responsible' ) )
            // InternalMSDsl.g:2813:1: ( 'responsible' )
            {
            // InternalMSDsl.g:2813:1: ( 'responsible' )
            // InternalMSDsl.g:2814:2: 'responsible'
            {
             before(grammarAccess.getStoragePointAccess().getResponsibleKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getResponsibleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_5__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_5__1"
    // InternalMSDsl.g:2823:1: rule__StoragePoint__Group_5__1 : rule__StoragePoint__Group_5__1__Impl ;
    public final void rule__StoragePoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2827:1: ( rule__StoragePoint__Group_5__1__Impl )
            // InternalMSDsl.g:2828:2: rule__StoragePoint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_5__1__Impl();

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
    // $ANTLR end "rule__StoragePoint__Group_5__1"


    // $ANTLR start "rule__StoragePoint__Group_5__1__Impl"
    // InternalMSDsl.g:2834:1: rule__StoragePoint__Group_5__1__Impl : ( ( rule__StoragePoint__ResponsibleAssignment_5_1 ) ) ;
    public final void rule__StoragePoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2838:1: ( ( ( rule__StoragePoint__ResponsibleAssignment_5_1 ) ) )
            // InternalMSDsl.g:2839:1: ( ( rule__StoragePoint__ResponsibleAssignment_5_1 ) )
            {
            // InternalMSDsl.g:2839:1: ( ( rule__StoragePoint__ResponsibleAssignment_5_1 ) )
            // InternalMSDsl.g:2840:2: ( rule__StoragePoint__ResponsibleAssignment_5_1 )
            {
             before(grammarAccess.getStoragePointAccess().getResponsibleAssignment_5_1()); 
            // InternalMSDsl.g:2841:2: ( rule__StoragePoint__ResponsibleAssignment_5_1 )
            // InternalMSDsl.g:2841:3: rule__StoragePoint__ResponsibleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__ResponsibleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getResponsibleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_5__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6__0"
    // InternalMSDsl.g:2850:1: rule__StoragePoint__Group_6__0 : rule__StoragePoint__Group_6__0__Impl rule__StoragePoint__Group_6__1 ;
    public final void rule__StoragePoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2854:1: ( rule__StoragePoint__Group_6__0__Impl rule__StoragePoint__Group_6__1 )
            // InternalMSDsl.g:2855:2: rule__StoragePoint__Group_6__0__Impl rule__StoragePoint__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__StoragePoint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6__1();

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
    // $ANTLR end "rule__StoragePoint__Group_6__0"


    // $ANTLR start "rule__StoragePoint__Group_6__0__Impl"
    // InternalMSDsl.g:2862:1: rule__StoragePoint__Group_6__0__Impl : ( 'stores' ) ;
    public final void rule__StoragePoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2866:1: ( ( 'stores' ) )
            // InternalMSDsl.g:2867:1: ( 'stores' )
            {
            // InternalMSDsl.g:2867:1: ( 'stores' )
            // InternalMSDsl.g:2868:2: 'stores'
            {
             before(grammarAccess.getStoragePointAccess().getStoresKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getStoresKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6__1"
    // InternalMSDsl.g:2877:1: rule__StoragePoint__Group_6__1 : rule__StoragePoint__Group_6__1__Impl rule__StoragePoint__Group_6__2 ;
    public final void rule__StoragePoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2881:1: ( rule__StoragePoint__Group_6__1__Impl rule__StoragePoint__Group_6__2 )
            // InternalMSDsl.g:2882:2: rule__StoragePoint__Group_6__1__Impl rule__StoragePoint__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__StoragePoint__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6__2();

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
    // $ANTLR end "rule__StoragePoint__Group_6__1"


    // $ANTLR start "rule__StoragePoint__Group_6__1__Impl"
    // InternalMSDsl.g:2889:1: rule__StoragePoint__Group_6__1__Impl : ( '(' ) ;
    public final void rule__StoragePoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2893:1: ( ( '(' ) )
            // InternalMSDsl.g:2894:1: ( '(' )
            {
            // InternalMSDsl.g:2894:1: ( '(' )
            // InternalMSDsl.g:2895:2: '('
            {
             before(grammarAccess.getStoragePointAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6__2"
    // InternalMSDsl.g:2904:1: rule__StoragePoint__Group_6__2 : rule__StoragePoint__Group_6__2__Impl rule__StoragePoint__Group_6__3 ;
    public final void rule__StoragePoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2908:1: ( rule__StoragePoint__Group_6__2__Impl rule__StoragePoint__Group_6__3 )
            // InternalMSDsl.g:2909:2: rule__StoragePoint__Group_6__2__Impl rule__StoragePoint__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__StoragePoint__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6__3();

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
    // $ANTLR end "rule__StoragePoint__Group_6__2"


    // $ANTLR start "rule__StoragePoint__Group_6__2__Impl"
    // InternalMSDsl.g:2916:1: rule__StoragePoint__Group_6__2__Impl : ( ( rule__StoragePoint__StoresAssignment_6_2 ) ) ;
    public final void rule__StoragePoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2920:1: ( ( ( rule__StoragePoint__StoresAssignment_6_2 ) ) )
            // InternalMSDsl.g:2921:1: ( ( rule__StoragePoint__StoresAssignment_6_2 ) )
            {
            // InternalMSDsl.g:2921:1: ( ( rule__StoragePoint__StoresAssignment_6_2 ) )
            // InternalMSDsl.g:2922:2: ( rule__StoragePoint__StoresAssignment_6_2 )
            {
             before(grammarAccess.getStoragePointAccess().getStoresAssignment_6_2()); 
            // InternalMSDsl.g:2923:2: ( rule__StoragePoint__StoresAssignment_6_2 )
            // InternalMSDsl.g:2923:3: rule__StoragePoint__StoresAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__StoresAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getStoresAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__2__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6__3"
    // InternalMSDsl.g:2931:1: rule__StoragePoint__Group_6__3 : rule__StoragePoint__Group_6__3__Impl rule__StoragePoint__Group_6__4 ;
    public final void rule__StoragePoint__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2935:1: ( rule__StoragePoint__Group_6__3__Impl rule__StoragePoint__Group_6__4 )
            // InternalMSDsl.g:2936:2: rule__StoragePoint__Group_6__3__Impl rule__StoragePoint__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__StoragePoint__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6__4();

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
    // $ANTLR end "rule__StoragePoint__Group_6__3"


    // $ANTLR start "rule__StoragePoint__Group_6__3__Impl"
    // InternalMSDsl.g:2943:1: rule__StoragePoint__Group_6__3__Impl : ( ( rule__StoragePoint__Group_6_3__0 )* ) ;
    public final void rule__StoragePoint__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2947:1: ( ( ( rule__StoragePoint__Group_6_3__0 )* ) )
            // InternalMSDsl.g:2948:1: ( ( rule__StoragePoint__Group_6_3__0 )* )
            {
            // InternalMSDsl.g:2948:1: ( ( rule__StoragePoint__Group_6_3__0 )* )
            // InternalMSDsl.g:2949:2: ( rule__StoragePoint__Group_6_3__0 )*
            {
             before(grammarAccess.getStoragePointAccess().getGroup_6_3()); 
            // InternalMSDsl.g:2950:2: ( rule__StoragePoint__Group_6_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMSDsl.g:2950:3: rule__StoragePoint__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StoragePoint__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStoragePointAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__3__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6__4"
    // InternalMSDsl.g:2958:1: rule__StoragePoint__Group_6__4 : rule__StoragePoint__Group_6__4__Impl ;
    public final void rule__StoragePoint__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2962:1: ( rule__StoragePoint__Group_6__4__Impl )
            // InternalMSDsl.g:2963:2: rule__StoragePoint__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6__4__Impl();

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
    // $ANTLR end "rule__StoragePoint__Group_6__4"


    // $ANTLR start "rule__StoragePoint__Group_6__4__Impl"
    // InternalMSDsl.g:2969:1: rule__StoragePoint__Group_6__4__Impl : ( ')' ) ;
    public final void rule__StoragePoint__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2973:1: ( ( ')' ) )
            // InternalMSDsl.g:2974:1: ( ')' )
            {
            // InternalMSDsl.g:2974:1: ( ')' )
            // InternalMSDsl.g:2975:2: ')'
            {
             before(grammarAccess.getStoragePointAccess().getRightParenthesisKeyword_6_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__4__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6_3__0"
    // InternalMSDsl.g:2985:1: rule__StoragePoint__Group_6_3__0 : rule__StoragePoint__Group_6_3__0__Impl rule__StoragePoint__Group_6_3__1 ;
    public final void rule__StoragePoint__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:2989:1: ( rule__StoragePoint__Group_6_3__0__Impl rule__StoragePoint__Group_6_3__1 )
            // InternalMSDsl.g:2990:2: rule__StoragePoint__Group_6_3__0__Impl rule__StoragePoint__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
            rule__StoragePoint__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6_3__1();

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
    // $ANTLR end "rule__StoragePoint__Group_6_3__0"


    // $ANTLR start "rule__StoragePoint__Group_6_3__0__Impl"
    // InternalMSDsl.g:2997:1: rule__StoragePoint__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__StoragePoint__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3001:1: ( ( ',' ) )
            // InternalMSDsl.g:3002:1: ( ',' )
            {
            // InternalMSDsl.g:3002:1: ( ',' )
            // InternalMSDsl.g:3003:2: ','
            {
             before(grammarAccess.getStoragePointAccess().getCommaKeyword_6_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6_3__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6_3__1"
    // InternalMSDsl.g:3012:1: rule__StoragePoint__Group_6_3__1 : rule__StoragePoint__Group_6_3__1__Impl ;
    public final void rule__StoragePoint__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3016:1: ( rule__StoragePoint__Group_6_3__1__Impl )
            // InternalMSDsl.g:3017:2: rule__StoragePoint__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__StoragePoint__Group_6_3__1"


    // $ANTLR start "rule__StoragePoint__Group_6_3__1__Impl"
    // InternalMSDsl.g:3023:1: rule__StoragePoint__Group_6_3__1__Impl : ( ( rule__StoragePoint__StoresAssignment_6_3_1 ) ) ;
    public final void rule__StoragePoint__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3027:1: ( ( ( rule__StoragePoint__StoresAssignment_6_3_1 ) ) )
            // InternalMSDsl.g:3028:1: ( ( rule__StoragePoint__StoresAssignment_6_3_1 ) )
            {
            // InternalMSDsl.g:3028:1: ( ( rule__StoragePoint__StoresAssignment_6_3_1 ) )
            // InternalMSDsl.g:3029:2: ( rule__StoragePoint__StoresAssignment_6_3_1 )
            {
             before(grammarAccess.getStoragePointAccess().getStoresAssignment_6_3_1()); 
            // InternalMSDsl.g:3030:2: ( rule__StoragePoint__StoresAssignment_6_3_1 )
            // InternalMSDsl.g:3030:3: rule__StoragePoint__StoresAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__StoresAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getStoresAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6_3__1__Impl"


    // $ANTLR start "rule__WorkPieceType__Group__0"
    // InternalMSDsl.g:3039:1: rule__WorkPieceType__Group__0 : rule__WorkPieceType__Group__0__Impl rule__WorkPieceType__Group__1 ;
    public final void rule__WorkPieceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3043:1: ( rule__WorkPieceType__Group__0__Impl rule__WorkPieceType__Group__1 )
            // InternalMSDsl.g:3044:2: rule__WorkPieceType__Group__0__Impl rule__WorkPieceType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkPieceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceType__Group__1();

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
    // $ANTLR end "rule__WorkPieceType__Group__0"


    // $ANTLR start "rule__WorkPieceType__Group__0__Impl"
    // InternalMSDsl.g:3051:1: rule__WorkPieceType__Group__0__Impl : ( () ) ;
    public final void rule__WorkPieceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3055:1: ( ( () ) )
            // InternalMSDsl.g:3056:1: ( () )
            {
            // InternalMSDsl.g:3056:1: ( () )
            // InternalMSDsl.g:3057:2: ()
            {
             before(grammarAccess.getWorkPieceTypeAccess().getWorkPieceTypeAction_0()); 
            // InternalMSDsl.g:3058:2: ()
            // InternalMSDsl.g:3058:3: 
            {
            }

             after(grammarAccess.getWorkPieceTypeAccess().getWorkPieceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceType__Group__0__Impl"


    // $ANTLR start "rule__WorkPieceType__Group__1"
    // InternalMSDsl.g:3066:1: rule__WorkPieceType__Group__1 : rule__WorkPieceType__Group__1__Impl ;
    public final void rule__WorkPieceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3070:1: ( rule__WorkPieceType__Group__1__Impl )
            // InternalMSDsl.g:3071:2: rule__WorkPieceType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceType__Group__1__Impl();

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
    // $ANTLR end "rule__WorkPieceType__Group__1"


    // $ANTLR start "rule__WorkPieceType__Group__1__Impl"
    // InternalMSDsl.g:3077:1: rule__WorkPieceType__Group__1__Impl : ( ( rule__WorkPieceType__NameAssignment_1 ) ) ;
    public final void rule__WorkPieceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3081:1: ( ( ( rule__WorkPieceType__NameAssignment_1 ) ) )
            // InternalMSDsl.g:3082:1: ( ( rule__WorkPieceType__NameAssignment_1 ) )
            {
            // InternalMSDsl.g:3082:1: ( ( rule__WorkPieceType__NameAssignment_1 ) )
            // InternalMSDsl.g:3083:2: ( rule__WorkPieceType__NameAssignment_1 )
            {
             before(grammarAccess.getWorkPieceTypeAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:3084:2: ( rule__WorkPieceType__NameAssignment_1 )
            // InternalMSDsl.g:3084:3: rule__WorkPieceType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceType__Group__1__Impl"


    // $ANTLR start "rule__WorkPiece__Group__0"
    // InternalMSDsl.g:3093:1: rule__WorkPiece__Group__0 : rule__WorkPiece__Group__0__Impl rule__WorkPiece__Group__1 ;
    public final void rule__WorkPiece__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3097:1: ( rule__WorkPiece__Group__0__Impl rule__WorkPiece__Group__1 )
            // InternalMSDsl.g:3098:2: rule__WorkPiece__Group__0__Impl rule__WorkPiece__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__WorkPiece__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__1();

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
    // $ANTLR end "rule__WorkPiece__Group__0"


    // $ANTLR start "rule__WorkPiece__Group__0__Impl"
    // InternalMSDsl.g:3105:1: rule__WorkPiece__Group__0__Impl : ( 'WorkPiece' ) ;
    public final void rule__WorkPiece__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3109:1: ( ( 'WorkPiece' ) )
            // InternalMSDsl.g:3110:1: ( 'WorkPiece' )
            {
            // InternalMSDsl.g:3110:1: ( 'WorkPiece' )
            // InternalMSDsl.g:3111:2: 'WorkPiece'
            {
             before(grammarAccess.getWorkPieceAccess().getWorkPieceKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWorkPieceAccess().getWorkPieceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__0__Impl"


    // $ANTLR start "rule__WorkPiece__Group__1"
    // InternalMSDsl.g:3120:1: rule__WorkPiece__Group__1 : rule__WorkPiece__Group__1__Impl rule__WorkPiece__Group__2 ;
    public final void rule__WorkPiece__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3124:1: ( rule__WorkPiece__Group__1__Impl rule__WorkPiece__Group__2 )
            // InternalMSDsl.g:3125:2: rule__WorkPiece__Group__1__Impl rule__WorkPiece__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__WorkPiece__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__2();

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
    // $ANTLR end "rule__WorkPiece__Group__1"


    // $ANTLR start "rule__WorkPiece__Group__1__Impl"
    // InternalMSDsl.g:3132:1: rule__WorkPiece__Group__1__Impl : ( 'of' ) ;
    public final void rule__WorkPiece__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3136:1: ( ( 'of' ) )
            // InternalMSDsl.g:3137:1: ( 'of' )
            {
            // InternalMSDsl.g:3137:1: ( 'of' )
            // InternalMSDsl.g:3138:2: 'of'
            {
             before(grammarAccess.getWorkPieceAccess().getOfKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWorkPieceAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__1__Impl"


    // $ANTLR start "rule__WorkPiece__Group__2"
    // InternalMSDsl.g:3147:1: rule__WorkPiece__Group__2 : rule__WorkPiece__Group__2__Impl rule__WorkPiece__Group__3 ;
    public final void rule__WorkPiece__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3151:1: ( rule__WorkPiece__Group__2__Impl rule__WorkPiece__Group__3 )
            // InternalMSDsl.g:3152:2: rule__WorkPiece__Group__2__Impl rule__WorkPiece__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__WorkPiece__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__3();

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
    // $ANTLR end "rule__WorkPiece__Group__2"


    // $ANTLR start "rule__WorkPiece__Group__2__Impl"
    // InternalMSDsl.g:3159:1: rule__WorkPiece__Group__2__Impl : ( 'type' ) ;
    public final void rule__WorkPiece__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3163:1: ( ( 'type' ) )
            // InternalMSDsl.g:3164:1: ( 'type' )
            {
            // InternalMSDsl.g:3164:1: ( 'type' )
            // InternalMSDsl.g:3165:2: 'type'
            {
             before(grammarAccess.getWorkPieceAccess().getTypeKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWorkPieceAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__2__Impl"


    // $ANTLR start "rule__WorkPiece__Group__3"
    // InternalMSDsl.g:3174:1: rule__WorkPiece__Group__3 : rule__WorkPiece__Group__3__Impl ;
    public final void rule__WorkPiece__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3178:1: ( rule__WorkPiece__Group__3__Impl )
            // InternalMSDsl.g:3179:2: rule__WorkPiece__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__3__Impl();

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
    // $ANTLR end "rule__WorkPiece__Group__3"


    // $ANTLR start "rule__WorkPiece__Group__3__Impl"
    // InternalMSDsl.g:3185:1: rule__WorkPiece__Group__3__Impl : ( ( rule__WorkPiece__HasTypeAssignment_3 ) ) ;
    public final void rule__WorkPiece__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3189:1: ( ( ( rule__WorkPiece__HasTypeAssignment_3 ) ) )
            // InternalMSDsl.g:3190:1: ( ( rule__WorkPiece__HasTypeAssignment_3 ) )
            {
            // InternalMSDsl.g:3190:1: ( ( rule__WorkPiece__HasTypeAssignment_3 ) )
            // InternalMSDsl.g:3191:2: ( rule__WorkPiece__HasTypeAssignment_3 )
            {
             before(grammarAccess.getWorkPieceAccess().getHasTypeAssignment_3()); 
            // InternalMSDsl.g:3192:2: ( rule__WorkPiece__HasTypeAssignment_3 )
            // InternalMSDsl.g:3192:3: rule__WorkPiece__HasTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkPiece__HasTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceAccess().getHasTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__3__Impl"


    // $ANTLR start "rule__Responsible__Group__0"
    // InternalMSDsl.g:3201:1: rule__Responsible__Group__0 : rule__Responsible__Group__0__Impl rule__Responsible__Group__1 ;
    public final void rule__Responsible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3205:1: ( rule__Responsible__Group__0__Impl rule__Responsible__Group__1 )
            // InternalMSDsl.g:3206:2: rule__Responsible__Group__0__Impl rule__Responsible__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Responsible__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Responsible__Group__1();

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
    // $ANTLR end "rule__Responsible__Group__0"


    // $ANTLR start "rule__Responsible__Group__0__Impl"
    // InternalMSDsl.g:3213:1: rule__Responsible__Group__0__Impl : ( () ) ;
    public final void rule__Responsible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3217:1: ( ( () ) )
            // InternalMSDsl.g:3218:1: ( () )
            {
            // InternalMSDsl.g:3218:1: ( () )
            // InternalMSDsl.g:3219:2: ()
            {
             before(grammarAccess.getResponsibleAccess().getResponsibleAction_0()); 
            // InternalMSDsl.g:3220:2: ()
            // InternalMSDsl.g:3220:3: 
            {
            }

             after(grammarAccess.getResponsibleAccess().getResponsibleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsible__Group__0__Impl"


    // $ANTLR start "rule__Responsible__Group__1"
    // InternalMSDsl.g:3228:1: rule__Responsible__Group__1 : rule__Responsible__Group__1__Impl ;
    public final void rule__Responsible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3232:1: ( rule__Responsible__Group__1__Impl )
            // InternalMSDsl.g:3233:2: rule__Responsible__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Responsible__Group__1__Impl();

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
    // $ANTLR end "rule__Responsible__Group__1"


    // $ANTLR start "rule__Responsible__Group__1__Impl"
    // InternalMSDsl.g:3239:1: rule__Responsible__Group__1__Impl : ( ( rule__Responsible__NameAssignment_1 ) ) ;
    public final void rule__Responsible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3243:1: ( ( ( rule__Responsible__NameAssignment_1 ) ) )
            // InternalMSDsl.g:3244:1: ( ( rule__Responsible__NameAssignment_1 ) )
            {
            // InternalMSDsl.g:3244:1: ( ( rule__Responsible__NameAssignment_1 ) )
            // InternalMSDsl.g:3245:2: ( rule__Responsible__NameAssignment_1 )
            {
             before(grammarAccess.getResponsibleAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:3246:2: ( rule__Responsible__NameAssignment_1 )
            // InternalMSDsl.g:3246:3: rule__Responsible__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Responsible__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResponsibleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsible__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__0"
    // InternalMSDsl.g:3255:1: rule__ManufacturingStep__Group__0 : rule__ManufacturingStep__Group__0__Impl rule__ManufacturingStep__Group__1 ;
    public final void rule__ManufacturingStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3259:1: ( rule__ManufacturingStep__Group__0__Impl rule__ManufacturingStep__Group__1 )
            // InternalMSDsl.g:3260:2: rule__ManufacturingStep__Group__0__Impl rule__ManufacturingStep__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__1();

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
    // $ANTLR end "rule__ManufacturingStep__Group__0"


    // $ANTLR start "rule__ManufacturingStep__Group__0__Impl"
    // InternalMSDsl.g:3267:1: rule__ManufacturingStep__Group__0__Impl : ( 'ManufacturingStep' ) ;
    public final void rule__ManufacturingStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3271:1: ( ( 'ManufacturingStep' ) )
            // InternalMSDsl.g:3272:1: ( 'ManufacturingStep' )
            {
            // InternalMSDsl.g:3272:1: ( 'ManufacturingStep' )
            // InternalMSDsl.g:3273:2: 'ManufacturingStep'
            {
             before(grammarAccess.getManufacturingStepAccess().getManufacturingStepKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getManufacturingStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__1"
    // InternalMSDsl.g:3282:1: rule__ManufacturingStep__Group__1 : rule__ManufacturingStep__Group__1__Impl rule__ManufacturingStep__Group__2 ;
    public final void rule__ManufacturingStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3286:1: ( rule__ManufacturingStep__Group__1__Impl rule__ManufacturingStep__Group__2 )
            // InternalMSDsl.g:3287:2: rule__ManufacturingStep__Group__1__Impl rule__ManufacturingStep__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__2();

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
    // $ANTLR end "rule__ManufacturingStep__Group__1"


    // $ANTLR start "rule__ManufacturingStep__Group__1__Impl"
    // InternalMSDsl.g:3294:1: rule__ManufacturingStep__Group__1__Impl : ( ( rule__ManufacturingStep__NameAssignment_1 ) ) ;
    public final void rule__ManufacturingStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3298:1: ( ( ( rule__ManufacturingStep__NameAssignment_1 ) ) )
            // InternalMSDsl.g:3299:1: ( ( rule__ManufacturingStep__NameAssignment_1 ) )
            {
            // InternalMSDsl.g:3299:1: ( ( rule__ManufacturingStep__NameAssignment_1 ) )
            // InternalMSDsl.g:3300:2: ( rule__ManufacturingStep__NameAssignment_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:3301:2: ( rule__ManufacturingStep__NameAssignment_1 )
            // InternalMSDsl.g:3301:3: rule__ManufacturingStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__2"
    // InternalMSDsl.g:3309:1: rule__ManufacturingStep__Group__2 : rule__ManufacturingStep__Group__2__Impl rule__ManufacturingStep__Group__3 ;
    public final void rule__ManufacturingStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3313:1: ( rule__ManufacturingStep__Group__2__Impl rule__ManufacturingStep__Group__3 )
            // InternalMSDsl.g:3314:2: rule__ManufacturingStep__Group__2__Impl rule__ManufacturingStep__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ManufacturingStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__3();

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
    // $ANTLR end "rule__ManufacturingStep__Group__2"


    // $ANTLR start "rule__ManufacturingStep__Group__2__Impl"
    // InternalMSDsl.g:3321:1: rule__ManufacturingStep__Group__2__Impl : ( '{' ) ;
    public final void rule__ManufacturingStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3325:1: ( ( '{' ) )
            // InternalMSDsl.g:3326:1: ( '{' )
            {
            // InternalMSDsl.g:3326:1: ( '{' )
            // InternalMSDsl.g:3327:2: '{'
            {
             before(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__2__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__3"
    // InternalMSDsl.g:3336:1: rule__ManufacturingStep__Group__3 : rule__ManufacturingStep__Group__3__Impl rule__ManufacturingStep__Group__4 ;
    public final void rule__ManufacturingStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3340:1: ( rule__ManufacturingStep__Group__3__Impl rule__ManufacturingStep__Group__4 )
            // InternalMSDsl.g:3341:2: rule__ManufacturingStep__Group__3__Impl rule__ManufacturingStep__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ManufacturingStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__4();

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
    // $ANTLR end "rule__ManufacturingStep__Group__3"


    // $ANTLR start "rule__ManufacturingStep__Group__3__Impl"
    // InternalMSDsl.g:3348:1: rule__ManufacturingStep__Group__3__Impl : ( ( rule__ManufacturingStep__Group_3__0 )? ) ;
    public final void rule__ManufacturingStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3352:1: ( ( ( rule__ManufacturingStep__Group_3__0 )? ) )
            // InternalMSDsl.g:3353:1: ( ( rule__ManufacturingStep__Group_3__0 )? )
            {
            // InternalMSDsl.g:3353:1: ( ( rule__ManufacturingStep__Group_3__0 )? )
            // InternalMSDsl.g:3354:2: ( rule__ManufacturingStep__Group_3__0 )?
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_3()); 
            // InternalMSDsl.g:3355:2: ( rule__ManufacturingStep__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMSDsl.g:3355:3: rule__ManufacturingStep__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingStep__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingStepAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__3__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__4"
    // InternalMSDsl.g:3363:1: rule__ManufacturingStep__Group__4 : rule__ManufacturingStep__Group__4__Impl rule__ManufacturingStep__Group__5 ;
    public final void rule__ManufacturingStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3367:1: ( rule__ManufacturingStep__Group__4__Impl rule__ManufacturingStep__Group__5 )
            // InternalMSDsl.g:3368:2: rule__ManufacturingStep__Group__4__Impl rule__ManufacturingStep__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ManufacturingStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__5();

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
    // $ANTLR end "rule__ManufacturingStep__Group__4"


    // $ANTLR start "rule__ManufacturingStep__Group__4__Impl"
    // InternalMSDsl.g:3375:1: rule__ManufacturingStep__Group__4__Impl : ( ( rule__ManufacturingStep__Group_4__0 )? ) ;
    public final void rule__ManufacturingStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3379:1: ( ( ( rule__ManufacturingStep__Group_4__0 )? ) )
            // InternalMSDsl.g:3380:1: ( ( rule__ManufacturingStep__Group_4__0 )? )
            {
            // InternalMSDsl.g:3380:1: ( ( rule__ManufacturingStep__Group_4__0 )? )
            // InternalMSDsl.g:3381:2: ( rule__ManufacturingStep__Group_4__0 )?
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_4()); 
            // InternalMSDsl.g:3382:2: ( rule__ManufacturingStep__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMSDsl.g:3382:3: rule__ManufacturingStep__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingStep__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingStepAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__4__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__5"
    // InternalMSDsl.g:3390:1: rule__ManufacturingStep__Group__5 : rule__ManufacturingStep__Group__5__Impl rule__ManufacturingStep__Group__6 ;
    public final void rule__ManufacturingStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3394:1: ( rule__ManufacturingStep__Group__5__Impl rule__ManufacturingStep__Group__6 )
            // InternalMSDsl.g:3395:2: rule__ManufacturingStep__Group__5__Impl rule__ManufacturingStep__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__ManufacturingStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__6();

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
    // $ANTLR end "rule__ManufacturingStep__Group__5"


    // $ANTLR start "rule__ManufacturingStep__Group__5__Impl"
    // InternalMSDsl.g:3402:1: rule__ManufacturingStep__Group__5__Impl : ( ( rule__ManufacturingStep__Group_5__0 )? ) ;
    public final void rule__ManufacturingStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3406:1: ( ( ( rule__ManufacturingStep__Group_5__0 )? ) )
            // InternalMSDsl.g:3407:1: ( ( rule__ManufacturingStep__Group_5__0 )? )
            {
            // InternalMSDsl.g:3407:1: ( ( rule__ManufacturingStep__Group_5__0 )? )
            // InternalMSDsl.g:3408:2: ( rule__ManufacturingStep__Group_5__0 )?
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_5()); 
            // InternalMSDsl.g:3409:2: ( rule__ManufacturingStep__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMSDsl.g:3409:3: rule__ManufacturingStep__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingStep__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingStepAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__5__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__6"
    // InternalMSDsl.g:3417:1: rule__ManufacturingStep__Group__6 : rule__ManufacturingStep__Group__6__Impl rule__ManufacturingStep__Group__7 ;
    public final void rule__ManufacturingStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3421:1: ( rule__ManufacturingStep__Group__6__Impl rule__ManufacturingStep__Group__7 )
            // InternalMSDsl.g:3422:2: rule__ManufacturingStep__Group__6__Impl rule__ManufacturingStep__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__7();

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
    // $ANTLR end "rule__ManufacturingStep__Group__6"


    // $ANTLR start "rule__ManufacturingStep__Group__6__Impl"
    // InternalMSDsl.g:3429:1: rule__ManufacturingStep__Group__6__Impl : ( 'inputConditions' ) ;
    public final void rule__ManufacturingStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3433:1: ( ( 'inputConditions' ) )
            // InternalMSDsl.g:3434:1: ( 'inputConditions' )
            {
            // InternalMSDsl.g:3434:1: ( 'inputConditions' )
            // InternalMSDsl.g:3435:2: 'inputConditions'
            {
             before(grammarAccess.getManufacturingStepAccess().getInputConditionsKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getInputConditionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__6__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__7"
    // InternalMSDsl.g:3444:1: rule__ManufacturingStep__Group__7 : rule__ManufacturingStep__Group__7__Impl rule__ManufacturingStep__Group__8 ;
    public final void rule__ManufacturingStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3448:1: ( rule__ManufacturingStep__Group__7__Impl rule__ManufacturingStep__Group__8 )
            // InternalMSDsl.g:3449:2: rule__ManufacturingStep__Group__7__Impl rule__ManufacturingStep__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__ManufacturingStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__8();

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
    // $ANTLR end "rule__ManufacturingStep__Group__7"


    // $ANTLR start "rule__ManufacturingStep__Group__7__Impl"
    // InternalMSDsl.g:3456:1: rule__ManufacturingStep__Group__7__Impl : ( '{' ) ;
    public final void rule__ManufacturingStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3460:1: ( ( '{' ) )
            // InternalMSDsl.g:3461:1: ( '{' )
            {
            // InternalMSDsl.g:3461:1: ( '{' )
            // InternalMSDsl.g:3462:2: '{'
            {
             before(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__7__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__8"
    // InternalMSDsl.g:3471:1: rule__ManufacturingStep__Group__8 : rule__ManufacturingStep__Group__8__Impl rule__ManufacturingStep__Group__9 ;
    public final void rule__ManufacturingStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3475:1: ( rule__ManufacturingStep__Group__8__Impl rule__ManufacturingStep__Group__9 )
            // InternalMSDsl.g:3476:2: rule__ManufacturingStep__Group__8__Impl rule__ManufacturingStep__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__9();

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
    // $ANTLR end "rule__ManufacturingStep__Group__8"


    // $ANTLR start "rule__ManufacturingStep__Group__8__Impl"
    // InternalMSDsl.g:3483:1: rule__ManufacturingStep__Group__8__Impl : ( ( rule__ManufacturingStep__InputAssignment_8 ) ) ;
    public final void rule__ManufacturingStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3487:1: ( ( ( rule__ManufacturingStep__InputAssignment_8 ) ) )
            // InternalMSDsl.g:3488:1: ( ( rule__ManufacturingStep__InputAssignment_8 ) )
            {
            // InternalMSDsl.g:3488:1: ( ( rule__ManufacturingStep__InputAssignment_8 ) )
            // InternalMSDsl.g:3489:2: ( rule__ManufacturingStep__InputAssignment_8 )
            {
             before(grammarAccess.getManufacturingStepAccess().getInputAssignment_8()); 
            // InternalMSDsl.g:3490:2: ( rule__ManufacturingStep__InputAssignment_8 )
            // InternalMSDsl.g:3490:3: rule__ManufacturingStep__InputAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__InputAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getInputAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__8__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__9"
    // InternalMSDsl.g:3498:1: rule__ManufacturingStep__Group__9 : rule__ManufacturingStep__Group__9__Impl rule__ManufacturingStep__Group__10 ;
    public final void rule__ManufacturingStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3502:1: ( rule__ManufacturingStep__Group__9__Impl rule__ManufacturingStep__Group__10 )
            // InternalMSDsl.g:3503:2: rule__ManufacturingStep__Group__9__Impl rule__ManufacturingStep__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__10();

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
    // $ANTLR end "rule__ManufacturingStep__Group__9"


    // $ANTLR start "rule__ManufacturingStep__Group__9__Impl"
    // InternalMSDsl.g:3510:1: rule__ManufacturingStep__Group__9__Impl : ( ( rule__ManufacturingStep__Group_9__0 )* ) ;
    public final void rule__ManufacturingStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3514:1: ( ( ( rule__ManufacturingStep__Group_9__0 )* ) )
            // InternalMSDsl.g:3515:1: ( ( rule__ManufacturingStep__Group_9__0 )* )
            {
            // InternalMSDsl.g:3515:1: ( ( rule__ManufacturingStep__Group_9__0 )* )
            // InternalMSDsl.g:3516:2: ( rule__ManufacturingStep__Group_9__0 )*
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_9()); 
            // InternalMSDsl.g:3517:2: ( rule__ManufacturingStep__Group_9__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMSDsl.g:3517:3: rule__ManufacturingStep__Group_9__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingStep__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getManufacturingStepAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__9__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__10"
    // InternalMSDsl.g:3525:1: rule__ManufacturingStep__Group__10 : rule__ManufacturingStep__Group__10__Impl rule__ManufacturingStep__Group__11 ;
    public final void rule__ManufacturingStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3529:1: ( rule__ManufacturingStep__Group__10__Impl rule__ManufacturingStep__Group__11 )
            // InternalMSDsl.g:3530:2: rule__ManufacturingStep__Group__10__Impl rule__ManufacturingStep__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__ManufacturingStep__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__11();

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
    // $ANTLR end "rule__ManufacturingStep__Group__10"


    // $ANTLR start "rule__ManufacturingStep__Group__10__Impl"
    // InternalMSDsl.g:3537:1: rule__ManufacturingStep__Group__10__Impl : ( '}' ) ;
    public final void rule__ManufacturingStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3541:1: ( ( '}' ) )
            // InternalMSDsl.g:3542:1: ( '}' )
            {
            // InternalMSDsl.g:3542:1: ( '}' )
            // InternalMSDsl.g:3543:2: '}'
            {
             before(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__10__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__11"
    // InternalMSDsl.g:3552:1: rule__ManufacturingStep__Group__11 : rule__ManufacturingStep__Group__11__Impl rule__ManufacturingStep__Group__12 ;
    public final void rule__ManufacturingStep__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3556:1: ( rule__ManufacturingStep__Group__11__Impl rule__ManufacturingStep__Group__12 )
            // InternalMSDsl.g:3557:2: rule__ManufacturingStep__Group__11__Impl rule__ManufacturingStep__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingStep__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__12();

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
    // $ANTLR end "rule__ManufacturingStep__Group__11"


    // $ANTLR start "rule__ManufacturingStep__Group__11__Impl"
    // InternalMSDsl.g:3564:1: rule__ManufacturingStep__Group__11__Impl : ( 'transforms' ) ;
    public final void rule__ManufacturingStep__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3568:1: ( ( 'transforms' ) )
            // InternalMSDsl.g:3569:1: ( 'transforms' )
            {
            // InternalMSDsl.g:3569:1: ( 'transforms' )
            // InternalMSDsl.g:3570:2: 'transforms'
            {
             before(grammarAccess.getManufacturingStepAccess().getTransformsKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getTransformsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__11__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__12"
    // InternalMSDsl.g:3579:1: rule__ManufacturingStep__Group__12 : rule__ManufacturingStep__Group__12__Impl rule__ManufacturingStep__Group__13 ;
    public final void rule__ManufacturingStep__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3583:1: ( rule__ManufacturingStep__Group__12__Impl rule__ManufacturingStep__Group__13 )
            // InternalMSDsl.g:3584:2: rule__ManufacturingStep__Group__12__Impl rule__ManufacturingStep__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingStep__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__13();

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
    // $ANTLR end "rule__ManufacturingStep__Group__12"


    // $ANTLR start "rule__ManufacturingStep__Group__12__Impl"
    // InternalMSDsl.g:3591:1: rule__ManufacturingStep__Group__12__Impl : ( '{' ) ;
    public final void rule__ManufacturingStep__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3595:1: ( ( '{' ) )
            // InternalMSDsl.g:3596:1: ( '{' )
            {
            // InternalMSDsl.g:3596:1: ( '{' )
            // InternalMSDsl.g:3597:2: '{'
            {
             before(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__12__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__13"
    // InternalMSDsl.g:3606:1: rule__ManufacturingStep__Group__13 : rule__ManufacturingStep__Group__13__Impl rule__ManufacturingStep__Group__14 ;
    public final void rule__ManufacturingStep__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3610:1: ( rule__ManufacturingStep__Group__13__Impl rule__ManufacturingStep__Group__14 )
            // InternalMSDsl.g:3611:2: rule__ManufacturingStep__Group__13__Impl rule__ManufacturingStep__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__ManufacturingStep__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__14();

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
    // $ANTLR end "rule__ManufacturingStep__Group__13"


    // $ANTLR start "rule__ManufacturingStep__Group__13__Impl"
    // InternalMSDsl.g:3618:1: rule__ManufacturingStep__Group__13__Impl : ( ( rule__ManufacturingStep__OutputAssignment_13 ) ) ;
    public final void rule__ManufacturingStep__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3622:1: ( ( ( rule__ManufacturingStep__OutputAssignment_13 ) ) )
            // InternalMSDsl.g:3623:1: ( ( rule__ManufacturingStep__OutputAssignment_13 ) )
            {
            // InternalMSDsl.g:3623:1: ( ( rule__ManufacturingStep__OutputAssignment_13 ) )
            // InternalMSDsl.g:3624:2: ( rule__ManufacturingStep__OutputAssignment_13 )
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputAssignment_13()); 
            // InternalMSDsl.g:3625:2: ( rule__ManufacturingStep__OutputAssignment_13 )
            // InternalMSDsl.g:3625:3: rule__ManufacturingStep__OutputAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__OutputAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getOutputAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__13__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__14"
    // InternalMSDsl.g:3633:1: rule__ManufacturingStep__Group__14 : rule__ManufacturingStep__Group__14__Impl rule__ManufacturingStep__Group__15 ;
    public final void rule__ManufacturingStep__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3637:1: ( rule__ManufacturingStep__Group__14__Impl rule__ManufacturingStep__Group__15 )
            // InternalMSDsl.g:3638:2: rule__ManufacturingStep__Group__14__Impl rule__ManufacturingStep__Group__15
            {
            pushFollow(FOLLOW_25);
            rule__ManufacturingStep__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__15();

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
    // $ANTLR end "rule__ManufacturingStep__Group__14"


    // $ANTLR start "rule__ManufacturingStep__Group__14__Impl"
    // InternalMSDsl.g:3645:1: rule__ManufacturingStep__Group__14__Impl : ( ( rule__ManufacturingStep__Group_14__0 )* ) ;
    public final void rule__ManufacturingStep__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3649:1: ( ( ( rule__ManufacturingStep__Group_14__0 )* ) )
            // InternalMSDsl.g:3650:1: ( ( rule__ManufacturingStep__Group_14__0 )* )
            {
            // InternalMSDsl.g:3650:1: ( ( rule__ManufacturingStep__Group_14__0 )* )
            // InternalMSDsl.g:3651:2: ( rule__ManufacturingStep__Group_14__0 )*
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_14()); 
            // InternalMSDsl.g:3652:2: ( rule__ManufacturingStep__Group_14__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==12) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMSDsl.g:3652:3: rule__ManufacturingStep__Group_14__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ManufacturingStep__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getManufacturingStepAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__14__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__15"
    // InternalMSDsl.g:3660:1: rule__ManufacturingStep__Group__15 : rule__ManufacturingStep__Group__15__Impl rule__ManufacturingStep__Group__16 ;
    public final void rule__ManufacturingStep__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3664:1: ( rule__ManufacturingStep__Group__15__Impl rule__ManufacturingStep__Group__16 )
            // InternalMSDsl.g:3665:2: rule__ManufacturingStep__Group__15__Impl rule__ManufacturingStep__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__ManufacturingStep__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__16();

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
    // $ANTLR end "rule__ManufacturingStep__Group__15"


    // $ANTLR start "rule__ManufacturingStep__Group__15__Impl"
    // InternalMSDsl.g:3672:1: rule__ManufacturingStep__Group__15__Impl : ( '}' ) ;
    public final void rule__ManufacturingStep__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3676:1: ( ( '}' ) )
            // InternalMSDsl.g:3677:1: ( '}' )
            {
            // InternalMSDsl.g:3677:1: ( '}' )
            // InternalMSDsl.g:3678:2: '}'
            {
             before(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_15()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__15__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__16"
    // InternalMSDsl.g:3687:1: rule__ManufacturingStep__Group__16 : rule__ManufacturingStep__Group__16__Impl ;
    public final void rule__ManufacturingStep__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3691:1: ( rule__ManufacturingStep__Group__16__Impl )
            // InternalMSDsl.g:3692:2: rule__ManufacturingStep__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__16__Impl();

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
    // $ANTLR end "rule__ManufacturingStep__Group__16"


    // $ANTLR start "rule__ManufacturingStep__Group__16__Impl"
    // InternalMSDsl.g:3698:1: rule__ManufacturingStep__Group__16__Impl : ( '}' ) ;
    public final void rule__ManufacturingStep__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3702:1: ( ( '}' ) )
            // InternalMSDsl.g:3703:1: ( '}' )
            {
            // InternalMSDsl.g:3703:1: ( '}' )
            // InternalMSDsl.g:3704:2: '}'
            {
             before(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_16()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__16__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_3__0"
    // InternalMSDsl.g:3714:1: rule__ManufacturingStep__Group_3__0 : rule__ManufacturingStep__Group_3__0__Impl rule__ManufacturingStep__Group_3__1 ;
    public final void rule__ManufacturingStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3718:1: ( rule__ManufacturingStep__Group_3__0__Impl rule__ManufacturingStep__Group_3__1 )
            // InternalMSDsl.g:3719:2: rule__ManufacturingStep__Group_3__0__Impl rule__ManufacturingStep__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__ManufacturingStep__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_3__1();

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
    // $ANTLR end "rule__ManufacturingStep__Group_3__0"


    // $ANTLR start "rule__ManufacturingStep__Group_3__0__Impl"
    // InternalMSDsl.g:3726:1: rule__ManufacturingStep__Group_3__0__Impl : ( 'speed' ) ;
    public final void rule__ManufacturingStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3730:1: ( ( 'speed' ) )
            // InternalMSDsl.g:3731:1: ( 'speed' )
            {
            // InternalMSDsl.g:3731:1: ( 'speed' )
            // InternalMSDsl.g:3732:2: 'speed'
            {
             before(grammarAccess.getManufacturingStepAccess().getSpeedKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getSpeedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_3__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_3__1"
    // InternalMSDsl.g:3741:1: rule__ManufacturingStep__Group_3__1 : rule__ManufacturingStep__Group_3__1__Impl ;
    public final void rule__ManufacturingStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3745:1: ( rule__ManufacturingStep__Group_3__1__Impl )
            // InternalMSDsl.g:3746:2: rule__ManufacturingStep__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_3__1__Impl();

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
    // $ANTLR end "rule__ManufacturingStep__Group_3__1"


    // $ANTLR start "rule__ManufacturingStep__Group_3__1__Impl"
    // InternalMSDsl.g:3752:1: rule__ManufacturingStep__Group_3__1__Impl : ( ( rule__ManufacturingStep__SpeedAssignment_3_1 ) ) ;
    public final void rule__ManufacturingStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3756:1: ( ( ( rule__ManufacturingStep__SpeedAssignment_3_1 ) ) )
            // InternalMSDsl.g:3757:1: ( ( rule__ManufacturingStep__SpeedAssignment_3_1 ) )
            {
            // InternalMSDsl.g:3757:1: ( ( rule__ManufacturingStep__SpeedAssignment_3_1 ) )
            // InternalMSDsl.g:3758:2: ( rule__ManufacturingStep__SpeedAssignment_3_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getSpeedAssignment_3_1()); 
            // InternalMSDsl.g:3759:2: ( rule__ManufacturingStep__SpeedAssignment_3_1 )
            // InternalMSDsl.g:3759:3: rule__ManufacturingStep__SpeedAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__SpeedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getSpeedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_3__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_4__0"
    // InternalMSDsl.g:3768:1: rule__ManufacturingStep__Group_4__0 : rule__ManufacturingStep__Group_4__0__Impl rule__ManufacturingStep__Group_4__1 ;
    public final void rule__ManufacturingStep__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3772:1: ( rule__ManufacturingStep__Group_4__0__Impl rule__ManufacturingStep__Group_4__1 )
            // InternalMSDsl.g:3773:2: rule__ManufacturingStep__Group_4__0__Impl rule__ManufacturingStep__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingStep__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_4__1();

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
    // $ANTLR end "rule__ManufacturingStep__Group_4__0"


    // $ANTLR start "rule__ManufacturingStep__Group_4__0__Impl"
    // InternalMSDsl.g:3780:1: rule__ManufacturingStep__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__ManufacturingStep__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3784:1: ( ( 'transition' ) )
            // InternalMSDsl.g:3785:1: ( 'transition' )
            {
            // InternalMSDsl.g:3785:1: ( 'transition' )
            // InternalMSDsl.g:3786:2: 'transition'
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_4__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_4__1"
    // InternalMSDsl.g:3795:1: rule__ManufacturingStep__Group_4__1 : rule__ManufacturingStep__Group_4__1__Impl rule__ManufacturingStep__Group_4__2 ;
    public final void rule__ManufacturingStep__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3799:1: ( rule__ManufacturingStep__Group_4__1__Impl rule__ManufacturingStep__Group_4__2 )
            // InternalMSDsl.g:3800:2: rule__ManufacturingStep__Group_4__1__Impl rule__ManufacturingStep__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__ManufacturingStep__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_4__2();

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
    // $ANTLR end "rule__ManufacturingStep__Group_4__1"


    // $ANTLR start "rule__ManufacturingStep__Group_4__1__Impl"
    // InternalMSDsl.g:3807:1: rule__ManufacturingStep__Group_4__1__Impl : ( ( rule__ManufacturingStep__TransitionAssignment_4_1 ) ) ;
    public final void rule__ManufacturingStep__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3811:1: ( ( ( rule__ManufacturingStep__TransitionAssignment_4_1 ) ) )
            // InternalMSDsl.g:3812:1: ( ( rule__ManufacturingStep__TransitionAssignment_4_1 ) )
            {
            // InternalMSDsl.g:3812:1: ( ( rule__ManufacturingStep__TransitionAssignment_4_1 ) )
            // InternalMSDsl.g:3813:2: ( rule__ManufacturingStep__TransitionAssignment_4_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionAssignment_4_1()); 
            // InternalMSDsl.g:3814:2: ( rule__ManufacturingStep__TransitionAssignment_4_1 )
            // InternalMSDsl.g:3814:3: rule__ManufacturingStep__TransitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__TransitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getTransitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_4__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_4__2"
    // InternalMSDsl.g:3822:1: rule__ManufacturingStep__Group_4__2 : rule__ManufacturingStep__Group_4__2__Impl ;
    public final void rule__ManufacturingStep__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3826:1: ( rule__ManufacturingStep__Group_4__2__Impl )
            // InternalMSDsl.g:3827:2: rule__ManufacturingStep__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_4__2__Impl();

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
    // $ANTLR end "rule__ManufacturingStep__Group_4__2"


    // $ANTLR start "rule__ManufacturingStep__Group_4__2__Impl"
    // InternalMSDsl.g:3833:1: rule__ManufacturingStep__Group_4__2__Impl : ( ( rule__ManufacturingStep__Group_4_2__0 )* ) ;
    public final void rule__ManufacturingStep__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3837:1: ( ( ( rule__ManufacturingStep__Group_4_2__0 )* ) )
            // InternalMSDsl.g:3838:1: ( ( rule__ManufacturingStep__Group_4_2__0 )* )
            {
            // InternalMSDsl.g:3838:1: ( ( rule__ManufacturingStep__Group_4_2__0 )* )
            // InternalMSDsl.g:3839:2: ( rule__ManufacturingStep__Group_4_2__0 )*
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_4_2()); 
            // InternalMSDsl.g:3840:2: ( rule__ManufacturingStep__Group_4_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMSDsl.g:3840:3: rule__ManufacturingStep__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ManufacturingStep__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getManufacturingStepAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_4__2__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_4_2__0"
    // InternalMSDsl.g:3849:1: rule__ManufacturingStep__Group_4_2__0 : rule__ManufacturingStep__Group_4_2__0__Impl rule__ManufacturingStep__Group_4_2__1 ;
    public final void rule__ManufacturingStep__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3853:1: ( rule__ManufacturingStep__Group_4_2__0__Impl rule__ManufacturingStep__Group_4_2__1 )
            // InternalMSDsl.g:3854:2: rule__ManufacturingStep__Group_4_2__0__Impl rule__ManufacturingStep__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingStep__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_4_2__1();

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
    // $ANTLR end "rule__ManufacturingStep__Group_4_2__0"


    // $ANTLR start "rule__ManufacturingStep__Group_4_2__0__Impl"
    // InternalMSDsl.g:3861:1: rule__ManufacturingStep__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingStep__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3865:1: ( ( ',' ) )
            // InternalMSDsl.g:3866:1: ( ',' )
            {
            // InternalMSDsl.g:3866:1: ( ',' )
            // InternalMSDsl.g:3867:2: ','
            {
             before(grammarAccess.getManufacturingStepAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_4_2__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_4_2__1"
    // InternalMSDsl.g:3876:1: rule__ManufacturingStep__Group_4_2__1 : rule__ManufacturingStep__Group_4_2__1__Impl ;
    public final void rule__ManufacturingStep__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3880:1: ( rule__ManufacturingStep__Group_4_2__1__Impl )
            // InternalMSDsl.g:3881:2: rule__ManufacturingStep__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__ManufacturingStep__Group_4_2__1"


    // $ANTLR start "rule__ManufacturingStep__Group_4_2__1__Impl"
    // InternalMSDsl.g:3887:1: rule__ManufacturingStep__Group_4_2__1__Impl : ( ( rule__ManufacturingStep__TransitionAssignment_4_2_1 ) ) ;
    public final void rule__ManufacturingStep__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3891:1: ( ( ( rule__ManufacturingStep__TransitionAssignment_4_2_1 ) ) )
            // InternalMSDsl.g:3892:1: ( ( rule__ManufacturingStep__TransitionAssignment_4_2_1 ) )
            {
            // InternalMSDsl.g:3892:1: ( ( rule__ManufacturingStep__TransitionAssignment_4_2_1 ) )
            // InternalMSDsl.g:3893:2: ( rule__ManufacturingStep__TransitionAssignment_4_2_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionAssignment_4_2_1()); 
            // InternalMSDsl.g:3894:2: ( rule__ManufacturingStep__TransitionAssignment_4_2_1 )
            // InternalMSDsl.g:3894:3: rule__ManufacturingStep__TransitionAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__TransitionAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getTransitionAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_4_2__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_5__0"
    // InternalMSDsl.g:3903:1: rule__ManufacturingStep__Group_5__0 : rule__ManufacturingStep__Group_5__0__Impl rule__ManufacturingStep__Group_5__1 ;
    public final void rule__ManufacturingStep__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3907:1: ( rule__ManufacturingStep__Group_5__0__Impl rule__ManufacturingStep__Group_5__1 )
            // InternalMSDsl.g:3908:2: rule__ManufacturingStep__Group_5__0__Impl rule__ManufacturingStep__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingStep__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_5__1();

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
    // $ANTLR end "rule__ManufacturingStep__Group_5__0"


    // $ANTLR start "rule__ManufacturingStep__Group_5__0__Impl"
    // InternalMSDsl.g:3915:1: rule__ManufacturingStep__Group_5__0__Impl : ( 'responsible' ) ;
    public final void rule__ManufacturingStep__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3919:1: ( ( 'responsible' ) )
            // InternalMSDsl.g:3920:1: ( 'responsible' )
            {
            // InternalMSDsl.g:3920:1: ( 'responsible' )
            // InternalMSDsl.g:3921:2: 'responsible'
            {
             before(grammarAccess.getManufacturingStepAccess().getResponsibleKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getResponsibleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_5__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_5__1"
    // InternalMSDsl.g:3930:1: rule__ManufacturingStep__Group_5__1 : rule__ManufacturingStep__Group_5__1__Impl ;
    public final void rule__ManufacturingStep__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3934:1: ( rule__ManufacturingStep__Group_5__1__Impl )
            // InternalMSDsl.g:3935:2: rule__ManufacturingStep__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_5__1__Impl();

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
    // $ANTLR end "rule__ManufacturingStep__Group_5__1"


    // $ANTLR start "rule__ManufacturingStep__Group_5__1__Impl"
    // InternalMSDsl.g:3941:1: rule__ManufacturingStep__Group_5__1__Impl : ( ( rule__ManufacturingStep__ResponsibleAssignment_5_1 ) ) ;
    public final void rule__ManufacturingStep__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3945:1: ( ( ( rule__ManufacturingStep__ResponsibleAssignment_5_1 ) ) )
            // InternalMSDsl.g:3946:1: ( ( rule__ManufacturingStep__ResponsibleAssignment_5_1 ) )
            {
            // InternalMSDsl.g:3946:1: ( ( rule__ManufacturingStep__ResponsibleAssignment_5_1 ) )
            // InternalMSDsl.g:3947:2: ( rule__ManufacturingStep__ResponsibleAssignment_5_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getResponsibleAssignment_5_1()); 
            // InternalMSDsl.g:3948:2: ( rule__ManufacturingStep__ResponsibleAssignment_5_1 )
            // InternalMSDsl.g:3948:3: rule__ManufacturingStep__ResponsibleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__ResponsibleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getResponsibleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_5__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_9__0"
    // InternalMSDsl.g:3957:1: rule__ManufacturingStep__Group_9__0 : rule__ManufacturingStep__Group_9__0__Impl rule__ManufacturingStep__Group_9__1 ;
    public final void rule__ManufacturingStep__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3961:1: ( rule__ManufacturingStep__Group_9__0__Impl rule__ManufacturingStep__Group_9__1 )
            // InternalMSDsl.g:3962:2: rule__ManufacturingStep__Group_9__0__Impl rule__ManufacturingStep__Group_9__1
            {
            pushFollow(FOLLOW_23);
            rule__ManufacturingStep__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_9__1();

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
    // $ANTLR end "rule__ManufacturingStep__Group_9__0"


    // $ANTLR start "rule__ManufacturingStep__Group_9__0__Impl"
    // InternalMSDsl.g:3969:1: rule__ManufacturingStep__Group_9__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingStep__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3973:1: ( ( ',' ) )
            // InternalMSDsl.g:3974:1: ( ',' )
            {
            // InternalMSDsl.g:3974:1: ( ',' )
            // InternalMSDsl.g:3975:2: ','
            {
             before(grammarAccess.getManufacturingStepAccess().getCommaKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_9__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_9__1"
    // InternalMSDsl.g:3984:1: rule__ManufacturingStep__Group_9__1 : rule__ManufacturingStep__Group_9__1__Impl ;
    public final void rule__ManufacturingStep__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3988:1: ( rule__ManufacturingStep__Group_9__1__Impl )
            // InternalMSDsl.g:3989:2: rule__ManufacturingStep__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_9__1__Impl();

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
    // $ANTLR end "rule__ManufacturingStep__Group_9__1"


    // $ANTLR start "rule__ManufacturingStep__Group_9__1__Impl"
    // InternalMSDsl.g:3995:1: rule__ManufacturingStep__Group_9__1__Impl : ( ( rule__ManufacturingStep__InputAssignment_9_1 ) ) ;
    public final void rule__ManufacturingStep__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:3999:1: ( ( ( rule__ManufacturingStep__InputAssignment_9_1 ) ) )
            // InternalMSDsl.g:4000:1: ( ( rule__ManufacturingStep__InputAssignment_9_1 ) )
            {
            // InternalMSDsl.g:4000:1: ( ( rule__ManufacturingStep__InputAssignment_9_1 ) )
            // InternalMSDsl.g:4001:2: ( rule__ManufacturingStep__InputAssignment_9_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getInputAssignment_9_1()); 
            // InternalMSDsl.g:4002:2: ( rule__ManufacturingStep__InputAssignment_9_1 )
            // InternalMSDsl.g:4002:3: rule__ManufacturingStep__InputAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__InputAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getInputAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_9__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_14__0"
    // InternalMSDsl.g:4011:1: rule__ManufacturingStep__Group_14__0 : rule__ManufacturingStep__Group_14__0__Impl rule__ManufacturingStep__Group_14__1 ;
    public final void rule__ManufacturingStep__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4015:1: ( rule__ManufacturingStep__Group_14__0__Impl rule__ManufacturingStep__Group_14__1 )
            // InternalMSDsl.g:4016:2: rule__ManufacturingStep__Group_14__0__Impl rule__ManufacturingStep__Group_14__1
            {
            pushFollow(FOLLOW_3);
            rule__ManufacturingStep__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_14__1();

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
    // $ANTLR end "rule__ManufacturingStep__Group_14__0"


    // $ANTLR start "rule__ManufacturingStep__Group_14__0__Impl"
    // InternalMSDsl.g:4023:1: rule__ManufacturingStep__Group_14__0__Impl : ( 'or' ) ;
    public final void rule__ManufacturingStep__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4027:1: ( ( 'or' ) )
            // InternalMSDsl.g:4028:1: ( 'or' )
            {
            // InternalMSDsl.g:4028:1: ( 'or' )
            // InternalMSDsl.g:4029:2: 'or'
            {
             before(grammarAccess.getManufacturingStepAccess().getOrKeyword_14_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getOrKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_14__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_14__1"
    // InternalMSDsl.g:4038:1: rule__ManufacturingStep__Group_14__1 : rule__ManufacturingStep__Group_14__1__Impl ;
    public final void rule__ManufacturingStep__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4042:1: ( rule__ManufacturingStep__Group_14__1__Impl )
            // InternalMSDsl.g:4043:2: rule__ManufacturingStep__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_14__1__Impl();

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
    // $ANTLR end "rule__ManufacturingStep__Group_14__1"


    // $ANTLR start "rule__ManufacturingStep__Group_14__1__Impl"
    // InternalMSDsl.g:4049:1: rule__ManufacturingStep__Group_14__1__Impl : ( ( rule__ManufacturingStep__OutputAssignment_14_1 ) ) ;
    public final void rule__ManufacturingStep__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4053:1: ( ( ( rule__ManufacturingStep__OutputAssignment_14_1 ) ) )
            // InternalMSDsl.g:4054:1: ( ( rule__ManufacturingStep__OutputAssignment_14_1 ) )
            {
            // InternalMSDsl.g:4054:1: ( ( rule__ManufacturingStep__OutputAssignment_14_1 ) )
            // InternalMSDsl.g:4055:2: ( rule__ManufacturingStep__OutputAssignment_14_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputAssignment_14_1()); 
            // InternalMSDsl.g:4056:2: ( rule__ManufacturingStep__OutputAssignment_14_1 )
            // InternalMSDsl.g:4056:3: rule__ManufacturingStep__OutputAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__OutputAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getOutputAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_14__1__Impl"


    // $ANTLR start "rule__TransportStep__Group__0"
    // InternalMSDsl.g:4065:1: rule__TransportStep__Group__0 : rule__TransportStep__Group__0__Impl rule__TransportStep__Group__1 ;
    public final void rule__TransportStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4069:1: ( rule__TransportStep__Group__0__Impl rule__TransportStep__Group__1 )
            // InternalMSDsl.g:4070:2: rule__TransportStep__Group__0__Impl rule__TransportStep__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TransportStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__1();

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
    // $ANTLR end "rule__TransportStep__Group__0"


    // $ANTLR start "rule__TransportStep__Group__0__Impl"
    // InternalMSDsl.g:4077:1: rule__TransportStep__Group__0__Impl : ( 'TransportStep' ) ;
    public final void rule__TransportStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4081:1: ( ( 'TransportStep' ) )
            // InternalMSDsl.g:4082:1: ( 'TransportStep' )
            {
            // InternalMSDsl.g:4082:1: ( 'TransportStep' )
            // InternalMSDsl.g:4083:2: 'TransportStep'
            {
             before(grammarAccess.getTransportStepAccess().getTransportStepKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getTransportStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__0__Impl"


    // $ANTLR start "rule__TransportStep__Group__1"
    // InternalMSDsl.g:4092:1: rule__TransportStep__Group__1 : rule__TransportStep__Group__1__Impl rule__TransportStep__Group__2 ;
    public final void rule__TransportStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4096:1: ( rule__TransportStep__Group__1__Impl rule__TransportStep__Group__2 )
            // InternalMSDsl.g:4097:2: rule__TransportStep__Group__1__Impl rule__TransportStep__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TransportStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__2();

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
    // $ANTLR end "rule__TransportStep__Group__1"


    // $ANTLR start "rule__TransportStep__Group__1__Impl"
    // InternalMSDsl.g:4104:1: rule__TransportStep__Group__1__Impl : ( ( rule__TransportStep__NameAssignment_1 ) ) ;
    public final void rule__TransportStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4108:1: ( ( ( rule__TransportStep__NameAssignment_1 ) ) )
            // InternalMSDsl.g:4109:1: ( ( rule__TransportStep__NameAssignment_1 ) )
            {
            // InternalMSDsl.g:4109:1: ( ( rule__TransportStep__NameAssignment_1 ) )
            // InternalMSDsl.g:4110:2: ( rule__TransportStep__NameAssignment_1 )
            {
             before(grammarAccess.getTransportStepAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:4111:2: ( rule__TransportStep__NameAssignment_1 )
            // InternalMSDsl.g:4111:3: rule__TransportStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__1__Impl"


    // $ANTLR start "rule__TransportStep__Group__2"
    // InternalMSDsl.g:4119:1: rule__TransportStep__Group__2 : rule__TransportStep__Group__2__Impl rule__TransportStep__Group__3 ;
    public final void rule__TransportStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4123:1: ( rule__TransportStep__Group__2__Impl rule__TransportStep__Group__3 )
            // InternalMSDsl.g:4124:2: rule__TransportStep__Group__2__Impl rule__TransportStep__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TransportStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__3();

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
    // $ANTLR end "rule__TransportStep__Group__2"


    // $ANTLR start "rule__TransportStep__Group__2__Impl"
    // InternalMSDsl.g:4131:1: rule__TransportStep__Group__2__Impl : ( '{' ) ;
    public final void rule__TransportStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4135:1: ( ( '{' ) )
            // InternalMSDsl.g:4136:1: ( '{' )
            {
            // InternalMSDsl.g:4136:1: ( '{' )
            // InternalMSDsl.g:4137:2: '{'
            {
             before(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__2__Impl"


    // $ANTLR start "rule__TransportStep__Group__3"
    // InternalMSDsl.g:4146:1: rule__TransportStep__Group__3 : rule__TransportStep__Group__3__Impl rule__TransportStep__Group__4 ;
    public final void rule__TransportStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4150:1: ( rule__TransportStep__Group__3__Impl rule__TransportStep__Group__4 )
            // InternalMSDsl.g:4151:2: rule__TransportStep__Group__3__Impl rule__TransportStep__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__TransportStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__4();

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
    // $ANTLR end "rule__TransportStep__Group__3"


    // $ANTLR start "rule__TransportStep__Group__3__Impl"
    // InternalMSDsl.g:4158:1: rule__TransportStep__Group__3__Impl : ( ( rule__TransportStep__Group_3__0 )? ) ;
    public final void rule__TransportStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4162:1: ( ( ( rule__TransportStep__Group_3__0 )? ) )
            // InternalMSDsl.g:4163:1: ( ( rule__TransportStep__Group_3__0 )? )
            {
            // InternalMSDsl.g:4163:1: ( ( rule__TransportStep__Group_3__0 )? )
            // InternalMSDsl.g:4164:2: ( rule__TransportStep__Group_3__0 )?
            {
             before(grammarAccess.getTransportStepAccess().getGroup_3()); 
            // InternalMSDsl.g:4165:2: ( rule__TransportStep__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMSDsl.g:4165:3: rule__TransportStep__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransportStep__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransportStepAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__3__Impl"


    // $ANTLR start "rule__TransportStep__Group__4"
    // InternalMSDsl.g:4173:1: rule__TransportStep__Group__4 : rule__TransportStep__Group__4__Impl rule__TransportStep__Group__5 ;
    public final void rule__TransportStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4177:1: ( rule__TransportStep__Group__4__Impl rule__TransportStep__Group__5 )
            // InternalMSDsl.g:4178:2: rule__TransportStep__Group__4__Impl rule__TransportStep__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__TransportStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__5();

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
    // $ANTLR end "rule__TransportStep__Group__4"


    // $ANTLR start "rule__TransportStep__Group__4__Impl"
    // InternalMSDsl.g:4185:1: rule__TransportStep__Group__4__Impl : ( ( rule__TransportStep__Group_4__0 )? ) ;
    public final void rule__TransportStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4189:1: ( ( ( rule__TransportStep__Group_4__0 )? ) )
            // InternalMSDsl.g:4190:1: ( ( rule__TransportStep__Group_4__0 )? )
            {
            // InternalMSDsl.g:4190:1: ( ( rule__TransportStep__Group_4__0 )? )
            // InternalMSDsl.g:4191:2: ( rule__TransportStep__Group_4__0 )?
            {
             before(grammarAccess.getTransportStepAccess().getGroup_4()); 
            // InternalMSDsl.g:4192:2: ( rule__TransportStep__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMSDsl.g:4192:3: rule__TransportStep__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransportStep__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransportStepAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__4__Impl"


    // $ANTLR start "rule__TransportStep__Group__5"
    // InternalMSDsl.g:4200:1: rule__TransportStep__Group__5 : rule__TransportStep__Group__5__Impl rule__TransportStep__Group__6 ;
    public final void rule__TransportStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4204:1: ( rule__TransportStep__Group__5__Impl rule__TransportStep__Group__6 )
            // InternalMSDsl.g:4205:2: rule__TransportStep__Group__5__Impl rule__TransportStep__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__TransportStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__6();

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
    // $ANTLR end "rule__TransportStep__Group__5"


    // $ANTLR start "rule__TransportStep__Group__5__Impl"
    // InternalMSDsl.g:4212:1: rule__TransportStep__Group__5__Impl : ( ( rule__TransportStep__Group_5__0 )? ) ;
    public final void rule__TransportStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4216:1: ( ( ( rule__TransportStep__Group_5__0 )? ) )
            // InternalMSDsl.g:4217:1: ( ( rule__TransportStep__Group_5__0 )? )
            {
            // InternalMSDsl.g:4217:1: ( ( rule__TransportStep__Group_5__0 )? )
            // InternalMSDsl.g:4218:2: ( rule__TransportStep__Group_5__0 )?
            {
             before(grammarAccess.getTransportStepAccess().getGroup_5()); 
            // InternalMSDsl.g:4219:2: ( rule__TransportStep__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMSDsl.g:4219:3: rule__TransportStep__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransportStep__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransportStepAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__5__Impl"


    // $ANTLR start "rule__TransportStep__Group__6"
    // InternalMSDsl.g:4227:1: rule__TransportStep__Group__6 : rule__TransportStep__Group__6__Impl rule__TransportStep__Group__7 ;
    public final void rule__TransportStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4231:1: ( rule__TransportStep__Group__6__Impl rule__TransportStep__Group__7 )
            // InternalMSDsl.g:4232:2: rule__TransportStep__Group__6__Impl rule__TransportStep__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__TransportStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__7();

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
    // $ANTLR end "rule__TransportStep__Group__6"


    // $ANTLR start "rule__TransportStep__Group__6__Impl"
    // InternalMSDsl.g:4239:1: rule__TransportStep__Group__6__Impl : ( 'inputConditions' ) ;
    public final void rule__TransportStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4243:1: ( ( 'inputConditions' ) )
            // InternalMSDsl.g:4244:1: ( 'inputConditions' )
            {
            // InternalMSDsl.g:4244:1: ( 'inputConditions' )
            // InternalMSDsl.g:4245:2: 'inputConditions'
            {
             before(grammarAccess.getTransportStepAccess().getInputConditionsKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getInputConditionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__6__Impl"


    // $ANTLR start "rule__TransportStep__Group__7"
    // InternalMSDsl.g:4254:1: rule__TransportStep__Group__7 : rule__TransportStep__Group__7__Impl rule__TransportStep__Group__8 ;
    public final void rule__TransportStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4258:1: ( rule__TransportStep__Group__7__Impl rule__TransportStep__Group__8 )
            // InternalMSDsl.g:4259:2: rule__TransportStep__Group__7__Impl rule__TransportStep__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__TransportStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__8();

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
    // $ANTLR end "rule__TransportStep__Group__7"


    // $ANTLR start "rule__TransportStep__Group__7__Impl"
    // InternalMSDsl.g:4266:1: rule__TransportStep__Group__7__Impl : ( '{' ) ;
    public final void rule__TransportStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4270:1: ( ( '{' ) )
            // InternalMSDsl.g:4271:1: ( '{' )
            {
            // InternalMSDsl.g:4271:1: ( '{' )
            // InternalMSDsl.g:4272:2: '{'
            {
             before(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__7__Impl"


    // $ANTLR start "rule__TransportStep__Group__8"
    // InternalMSDsl.g:4281:1: rule__TransportStep__Group__8 : rule__TransportStep__Group__8__Impl rule__TransportStep__Group__9 ;
    public final void rule__TransportStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4285:1: ( rule__TransportStep__Group__8__Impl rule__TransportStep__Group__9 )
            // InternalMSDsl.g:4286:2: rule__TransportStep__Group__8__Impl rule__TransportStep__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__TransportStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__9();

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
    // $ANTLR end "rule__TransportStep__Group__8"


    // $ANTLR start "rule__TransportStep__Group__8__Impl"
    // InternalMSDsl.g:4293:1: rule__TransportStep__Group__8__Impl : ( ( rule__TransportStep__InputAssignment_8 ) ) ;
    public final void rule__TransportStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4297:1: ( ( ( rule__TransportStep__InputAssignment_8 ) ) )
            // InternalMSDsl.g:4298:1: ( ( rule__TransportStep__InputAssignment_8 ) )
            {
            // InternalMSDsl.g:4298:1: ( ( rule__TransportStep__InputAssignment_8 ) )
            // InternalMSDsl.g:4299:2: ( rule__TransportStep__InputAssignment_8 )
            {
             before(grammarAccess.getTransportStepAccess().getInputAssignment_8()); 
            // InternalMSDsl.g:4300:2: ( rule__TransportStep__InputAssignment_8 )
            // InternalMSDsl.g:4300:3: rule__TransportStep__InputAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__InputAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getInputAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__8__Impl"


    // $ANTLR start "rule__TransportStep__Group__9"
    // InternalMSDsl.g:4308:1: rule__TransportStep__Group__9 : rule__TransportStep__Group__9__Impl rule__TransportStep__Group__10 ;
    public final void rule__TransportStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4312:1: ( rule__TransportStep__Group__9__Impl rule__TransportStep__Group__10 )
            // InternalMSDsl.g:4313:2: rule__TransportStep__Group__9__Impl rule__TransportStep__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__TransportStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__10();

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
    // $ANTLR end "rule__TransportStep__Group__9"


    // $ANTLR start "rule__TransportStep__Group__9__Impl"
    // InternalMSDsl.g:4320:1: rule__TransportStep__Group__9__Impl : ( ( rule__TransportStep__Group_9__0 )* ) ;
    public final void rule__TransportStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4324:1: ( ( ( rule__TransportStep__Group_9__0 )* ) )
            // InternalMSDsl.g:4325:1: ( ( rule__TransportStep__Group_9__0 )* )
            {
            // InternalMSDsl.g:4325:1: ( ( rule__TransportStep__Group_9__0 )* )
            // InternalMSDsl.g:4326:2: ( rule__TransportStep__Group_9__0 )*
            {
             before(grammarAccess.getTransportStepAccess().getGroup_9()); 
            // InternalMSDsl.g:4327:2: ( rule__TransportStep__Group_9__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMSDsl.g:4327:3: rule__TransportStep__Group_9__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TransportStep__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTransportStepAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__9__Impl"


    // $ANTLR start "rule__TransportStep__Group__10"
    // InternalMSDsl.g:4335:1: rule__TransportStep__Group__10 : rule__TransportStep__Group__10__Impl rule__TransportStep__Group__11 ;
    public final void rule__TransportStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4339:1: ( rule__TransportStep__Group__10__Impl rule__TransportStep__Group__11 )
            // InternalMSDsl.g:4340:2: rule__TransportStep__Group__10__Impl rule__TransportStep__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__TransportStep__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__11();

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
    // $ANTLR end "rule__TransportStep__Group__10"


    // $ANTLR start "rule__TransportStep__Group__10__Impl"
    // InternalMSDsl.g:4347:1: rule__TransportStep__Group__10__Impl : ( '}' ) ;
    public final void rule__TransportStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4351:1: ( ( '}' ) )
            // InternalMSDsl.g:4352:1: ( '}' )
            {
            // InternalMSDsl.g:4352:1: ( '}' )
            // InternalMSDsl.g:4353:2: '}'
            {
             before(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__10__Impl"


    // $ANTLR start "rule__TransportStep__Group__11"
    // InternalMSDsl.g:4362:1: rule__TransportStep__Group__11 : rule__TransportStep__Group__11__Impl rule__TransportStep__Group__12 ;
    public final void rule__TransportStep__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4366:1: ( rule__TransportStep__Group__11__Impl rule__TransportStep__Group__12 )
            // InternalMSDsl.g:4367:2: rule__TransportStep__Group__11__Impl rule__TransportStep__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__TransportStep__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__12();

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
    // $ANTLR end "rule__TransportStep__Group__11"


    // $ANTLR start "rule__TransportStep__Group__11__Impl"
    // InternalMSDsl.g:4374:1: rule__TransportStep__Group__11__Impl : ( 'transports' ) ;
    public final void rule__TransportStep__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4378:1: ( ( 'transports' ) )
            // InternalMSDsl.g:4379:1: ( 'transports' )
            {
            // InternalMSDsl.g:4379:1: ( 'transports' )
            // InternalMSDsl.g:4380:2: 'transports'
            {
             before(grammarAccess.getTransportStepAccess().getTransportsKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getTransportsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__11__Impl"


    // $ANTLR start "rule__TransportStep__Group__12"
    // InternalMSDsl.g:4389:1: rule__TransportStep__Group__12 : rule__TransportStep__Group__12__Impl rule__TransportStep__Group__13 ;
    public final void rule__TransportStep__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4393:1: ( rule__TransportStep__Group__12__Impl rule__TransportStep__Group__13 )
            // InternalMSDsl.g:4394:2: rule__TransportStep__Group__12__Impl rule__TransportStep__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__TransportStep__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__13();

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
    // $ANTLR end "rule__TransportStep__Group__12"


    // $ANTLR start "rule__TransportStep__Group__12__Impl"
    // InternalMSDsl.g:4401:1: rule__TransportStep__Group__12__Impl : ( '{' ) ;
    public final void rule__TransportStep__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4405:1: ( ( '{' ) )
            // InternalMSDsl.g:4406:1: ( '{' )
            {
            // InternalMSDsl.g:4406:1: ( '{' )
            // InternalMSDsl.g:4407:2: '{'
            {
             before(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__12__Impl"


    // $ANTLR start "rule__TransportStep__Group__13"
    // InternalMSDsl.g:4416:1: rule__TransportStep__Group__13 : rule__TransportStep__Group__13__Impl rule__TransportStep__Group__14 ;
    public final void rule__TransportStep__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4420:1: ( rule__TransportStep__Group__13__Impl rule__TransportStep__Group__14 )
            // InternalMSDsl.g:4421:2: rule__TransportStep__Group__13__Impl rule__TransportStep__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__TransportStep__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__14();

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
    // $ANTLR end "rule__TransportStep__Group__13"


    // $ANTLR start "rule__TransportStep__Group__13__Impl"
    // InternalMSDsl.g:4428:1: rule__TransportStep__Group__13__Impl : ( ( rule__TransportStep__OutputAssignment_13 ) ) ;
    public final void rule__TransportStep__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4432:1: ( ( ( rule__TransportStep__OutputAssignment_13 ) ) )
            // InternalMSDsl.g:4433:1: ( ( rule__TransportStep__OutputAssignment_13 ) )
            {
            // InternalMSDsl.g:4433:1: ( ( rule__TransportStep__OutputAssignment_13 ) )
            // InternalMSDsl.g:4434:2: ( rule__TransportStep__OutputAssignment_13 )
            {
             before(grammarAccess.getTransportStepAccess().getOutputAssignment_13()); 
            // InternalMSDsl.g:4435:2: ( rule__TransportStep__OutputAssignment_13 )
            // InternalMSDsl.g:4435:3: rule__TransportStep__OutputAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__OutputAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getOutputAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__13__Impl"


    // $ANTLR start "rule__TransportStep__Group__14"
    // InternalMSDsl.g:4443:1: rule__TransportStep__Group__14 : rule__TransportStep__Group__14__Impl rule__TransportStep__Group__15 ;
    public final void rule__TransportStep__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4447:1: ( rule__TransportStep__Group__14__Impl rule__TransportStep__Group__15 )
            // InternalMSDsl.g:4448:2: rule__TransportStep__Group__14__Impl rule__TransportStep__Group__15
            {
            pushFollow(FOLLOW_25);
            rule__TransportStep__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__15();

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
    // $ANTLR end "rule__TransportStep__Group__14"


    // $ANTLR start "rule__TransportStep__Group__14__Impl"
    // InternalMSDsl.g:4455:1: rule__TransportStep__Group__14__Impl : ( ( rule__TransportStep__Group_14__0 )* ) ;
    public final void rule__TransportStep__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4459:1: ( ( ( rule__TransportStep__Group_14__0 )* ) )
            // InternalMSDsl.g:4460:1: ( ( rule__TransportStep__Group_14__0 )* )
            {
            // InternalMSDsl.g:4460:1: ( ( rule__TransportStep__Group_14__0 )* )
            // InternalMSDsl.g:4461:2: ( rule__TransportStep__Group_14__0 )*
            {
             before(grammarAccess.getTransportStepAccess().getGroup_14()); 
            // InternalMSDsl.g:4462:2: ( rule__TransportStep__Group_14__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==12) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMSDsl.g:4462:3: rule__TransportStep__Group_14__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__TransportStep__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTransportStepAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__14__Impl"


    // $ANTLR start "rule__TransportStep__Group__15"
    // InternalMSDsl.g:4470:1: rule__TransportStep__Group__15 : rule__TransportStep__Group__15__Impl rule__TransportStep__Group__16 ;
    public final void rule__TransportStep__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4474:1: ( rule__TransportStep__Group__15__Impl rule__TransportStep__Group__16 )
            // InternalMSDsl.g:4475:2: rule__TransportStep__Group__15__Impl rule__TransportStep__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__TransportStep__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__16();

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
    // $ANTLR end "rule__TransportStep__Group__15"


    // $ANTLR start "rule__TransportStep__Group__15__Impl"
    // InternalMSDsl.g:4482:1: rule__TransportStep__Group__15__Impl : ( '}' ) ;
    public final void rule__TransportStep__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4486:1: ( ( '}' ) )
            // InternalMSDsl.g:4487:1: ( '}' )
            {
            // InternalMSDsl.g:4487:1: ( '}' )
            // InternalMSDsl.g:4488:2: '}'
            {
             before(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_15()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__15__Impl"


    // $ANTLR start "rule__TransportStep__Group__16"
    // InternalMSDsl.g:4497:1: rule__TransportStep__Group__16 : rule__TransportStep__Group__16__Impl ;
    public final void rule__TransportStep__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4501:1: ( rule__TransportStep__Group__16__Impl )
            // InternalMSDsl.g:4502:2: rule__TransportStep__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__16__Impl();

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
    // $ANTLR end "rule__TransportStep__Group__16"


    // $ANTLR start "rule__TransportStep__Group__16__Impl"
    // InternalMSDsl.g:4508:1: rule__TransportStep__Group__16__Impl : ( '}' ) ;
    public final void rule__TransportStep__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4512:1: ( ( '}' ) )
            // InternalMSDsl.g:4513:1: ( '}' )
            {
            // InternalMSDsl.g:4513:1: ( '}' )
            // InternalMSDsl.g:4514:2: '}'
            {
             before(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_16()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__16__Impl"


    // $ANTLR start "rule__TransportStep__Group_3__0"
    // InternalMSDsl.g:4524:1: rule__TransportStep__Group_3__0 : rule__TransportStep__Group_3__0__Impl rule__TransportStep__Group_3__1 ;
    public final void rule__TransportStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4528:1: ( rule__TransportStep__Group_3__0__Impl rule__TransportStep__Group_3__1 )
            // InternalMSDsl.g:4529:2: rule__TransportStep__Group_3__0__Impl rule__TransportStep__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__TransportStep__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_3__1();

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
    // $ANTLR end "rule__TransportStep__Group_3__0"


    // $ANTLR start "rule__TransportStep__Group_3__0__Impl"
    // InternalMSDsl.g:4536:1: rule__TransportStep__Group_3__0__Impl : ( 'speed' ) ;
    public final void rule__TransportStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4540:1: ( ( 'speed' ) )
            // InternalMSDsl.g:4541:1: ( 'speed' )
            {
            // InternalMSDsl.g:4541:1: ( 'speed' )
            // InternalMSDsl.g:4542:2: 'speed'
            {
             before(grammarAccess.getTransportStepAccess().getSpeedKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getSpeedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_3__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_3__1"
    // InternalMSDsl.g:4551:1: rule__TransportStep__Group_3__1 : rule__TransportStep__Group_3__1__Impl ;
    public final void rule__TransportStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4555:1: ( rule__TransportStep__Group_3__1__Impl )
            // InternalMSDsl.g:4556:2: rule__TransportStep__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_3__1__Impl();

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
    // $ANTLR end "rule__TransportStep__Group_3__1"


    // $ANTLR start "rule__TransportStep__Group_3__1__Impl"
    // InternalMSDsl.g:4562:1: rule__TransportStep__Group_3__1__Impl : ( ( rule__TransportStep__SpeedAssignment_3_1 ) ) ;
    public final void rule__TransportStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4566:1: ( ( ( rule__TransportStep__SpeedAssignment_3_1 ) ) )
            // InternalMSDsl.g:4567:1: ( ( rule__TransportStep__SpeedAssignment_3_1 ) )
            {
            // InternalMSDsl.g:4567:1: ( ( rule__TransportStep__SpeedAssignment_3_1 ) )
            // InternalMSDsl.g:4568:2: ( rule__TransportStep__SpeedAssignment_3_1 )
            {
             before(grammarAccess.getTransportStepAccess().getSpeedAssignment_3_1()); 
            // InternalMSDsl.g:4569:2: ( rule__TransportStep__SpeedAssignment_3_1 )
            // InternalMSDsl.g:4569:3: rule__TransportStep__SpeedAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__SpeedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getSpeedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_3__1__Impl"


    // $ANTLR start "rule__TransportStep__Group_4__0"
    // InternalMSDsl.g:4578:1: rule__TransportStep__Group_4__0 : rule__TransportStep__Group_4__0__Impl rule__TransportStep__Group_4__1 ;
    public final void rule__TransportStep__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4582:1: ( rule__TransportStep__Group_4__0__Impl rule__TransportStep__Group_4__1 )
            // InternalMSDsl.g:4583:2: rule__TransportStep__Group_4__0__Impl rule__TransportStep__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__TransportStep__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_4__1();

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
    // $ANTLR end "rule__TransportStep__Group_4__0"


    // $ANTLR start "rule__TransportStep__Group_4__0__Impl"
    // InternalMSDsl.g:4590:1: rule__TransportStep__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__TransportStep__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4594:1: ( ( 'transition' ) )
            // InternalMSDsl.g:4595:1: ( 'transition' )
            {
            // InternalMSDsl.g:4595:1: ( 'transition' )
            // InternalMSDsl.g:4596:2: 'transition'
            {
             before(grammarAccess.getTransportStepAccess().getTransitionKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_4__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_4__1"
    // InternalMSDsl.g:4605:1: rule__TransportStep__Group_4__1 : rule__TransportStep__Group_4__1__Impl rule__TransportStep__Group_4__2 ;
    public final void rule__TransportStep__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4609:1: ( rule__TransportStep__Group_4__1__Impl rule__TransportStep__Group_4__2 )
            // InternalMSDsl.g:4610:2: rule__TransportStep__Group_4__1__Impl rule__TransportStep__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__TransportStep__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_4__2();

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
    // $ANTLR end "rule__TransportStep__Group_4__1"


    // $ANTLR start "rule__TransportStep__Group_4__1__Impl"
    // InternalMSDsl.g:4617:1: rule__TransportStep__Group_4__1__Impl : ( ( rule__TransportStep__TransitionAssignment_4_1 ) ) ;
    public final void rule__TransportStep__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4621:1: ( ( ( rule__TransportStep__TransitionAssignment_4_1 ) ) )
            // InternalMSDsl.g:4622:1: ( ( rule__TransportStep__TransitionAssignment_4_1 ) )
            {
            // InternalMSDsl.g:4622:1: ( ( rule__TransportStep__TransitionAssignment_4_1 ) )
            // InternalMSDsl.g:4623:2: ( rule__TransportStep__TransitionAssignment_4_1 )
            {
             before(grammarAccess.getTransportStepAccess().getTransitionAssignment_4_1()); 
            // InternalMSDsl.g:4624:2: ( rule__TransportStep__TransitionAssignment_4_1 )
            // InternalMSDsl.g:4624:3: rule__TransportStep__TransitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__TransitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getTransitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_4__1__Impl"


    // $ANTLR start "rule__TransportStep__Group_4__2"
    // InternalMSDsl.g:4632:1: rule__TransportStep__Group_4__2 : rule__TransportStep__Group_4__2__Impl ;
    public final void rule__TransportStep__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4636:1: ( rule__TransportStep__Group_4__2__Impl )
            // InternalMSDsl.g:4637:2: rule__TransportStep__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_4__2__Impl();

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
    // $ANTLR end "rule__TransportStep__Group_4__2"


    // $ANTLR start "rule__TransportStep__Group_4__2__Impl"
    // InternalMSDsl.g:4643:1: rule__TransportStep__Group_4__2__Impl : ( ( rule__TransportStep__Group_4_2__0 )* ) ;
    public final void rule__TransportStep__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4647:1: ( ( ( rule__TransportStep__Group_4_2__0 )* ) )
            // InternalMSDsl.g:4648:1: ( ( rule__TransportStep__Group_4_2__0 )* )
            {
            // InternalMSDsl.g:4648:1: ( ( rule__TransportStep__Group_4_2__0 )* )
            // InternalMSDsl.g:4649:2: ( rule__TransportStep__Group_4_2__0 )*
            {
             before(grammarAccess.getTransportStepAccess().getGroup_4_2()); 
            // InternalMSDsl.g:4650:2: ( rule__TransportStep__Group_4_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMSDsl.g:4650:3: rule__TransportStep__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TransportStep__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getTransportStepAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_4__2__Impl"


    // $ANTLR start "rule__TransportStep__Group_4_2__0"
    // InternalMSDsl.g:4659:1: rule__TransportStep__Group_4_2__0 : rule__TransportStep__Group_4_2__0__Impl rule__TransportStep__Group_4_2__1 ;
    public final void rule__TransportStep__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4663:1: ( rule__TransportStep__Group_4_2__0__Impl rule__TransportStep__Group_4_2__1 )
            // InternalMSDsl.g:4664:2: rule__TransportStep__Group_4_2__0__Impl rule__TransportStep__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__TransportStep__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_4_2__1();

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
    // $ANTLR end "rule__TransportStep__Group_4_2__0"


    // $ANTLR start "rule__TransportStep__Group_4_2__0__Impl"
    // InternalMSDsl.g:4671:1: rule__TransportStep__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TransportStep__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4675:1: ( ( ',' ) )
            // InternalMSDsl.g:4676:1: ( ',' )
            {
            // InternalMSDsl.g:4676:1: ( ',' )
            // InternalMSDsl.g:4677:2: ','
            {
             before(grammarAccess.getTransportStepAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_4_2__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_4_2__1"
    // InternalMSDsl.g:4686:1: rule__TransportStep__Group_4_2__1 : rule__TransportStep__Group_4_2__1__Impl ;
    public final void rule__TransportStep__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4690:1: ( rule__TransportStep__Group_4_2__1__Impl )
            // InternalMSDsl.g:4691:2: rule__TransportStep__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__TransportStep__Group_4_2__1"


    // $ANTLR start "rule__TransportStep__Group_4_2__1__Impl"
    // InternalMSDsl.g:4697:1: rule__TransportStep__Group_4_2__1__Impl : ( ( rule__TransportStep__TransitionAssignment_4_2_1 ) ) ;
    public final void rule__TransportStep__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4701:1: ( ( ( rule__TransportStep__TransitionAssignment_4_2_1 ) ) )
            // InternalMSDsl.g:4702:1: ( ( rule__TransportStep__TransitionAssignment_4_2_1 ) )
            {
            // InternalMSDsl.g:4702:1: ( ( rule__TransportStep__TransitionAssignment_4_2_1 ) )
            // InternalMSDsl.g:4703:2: ( rule__TransportStep__TransitionAssignment_4_2_1 )
            {
             before(grammarAccess.getTransportStepAccess().getTransitionAssignment_4_2_1()); 
            // InternalMSDsl.g:4704:2: ( rule__TransportStep__TransitionAssignment_4_2_1 )
            // InternalMSDsl.g:4704:3: rule__TransportStep__TransitionAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__TransitionAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getTransitionAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_4_2__1__Impl"


    // $ANTLR start "rule__TransportStep__Group_5__0"
    // InternalMSDsl.g:4713:1: rule__TransportStep__Group_5__0 : rule__TransportStep__Group_5__0__Impl rule__TransportStep__Group_5__1 ;
    public final void rule__TransportStep__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4717:1: ( rule__TransportStep__Group_5__0__Impl rule__TransportStep__Group_5__1 )
            // InternalMSDsl.g:4718:2: rule__TransportStep__Group_5__0__Impl rule__TransportStep__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__TransportStep__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_5__1();

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
    // $ANTLR end "rule__TransportStep__Group_5__0"


    // $ANTLR start "rule__TransportStep__Group_5__0__Impl"
    // InternalMSDsl.g:4725:1: rule__TransportStep__Group_5__0__Impl : ( 'responsible' ) ;
    public final void rule__TransportStep__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4729:1: ( ( 'responsible' ) )
            // InternalMSDsl.g:4730:1: ( 'responsible' )
            {
            // InternalMSDsl.g:4730:1: ( 'responsible' )
            // InternalMSDsl.g:4731:2: 'responsible'
            {
             before(grammarAccess.getTransportStepAccess().getResponsibleKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getResponsibleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_5__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_5__1"
    // InternalMSDsl.g:4740:1: rule__TransportStep__Group_5__1 : rule__TransportStep__Group_5__1__Impl ;
    public final void rule__TransportStep__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4744:1: ( rule__TransportStep__Group_5__1__Impl )
            // InternalMSDsl.g:4745:2: rule__TransportStep__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_5__1__Impl();

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
    // $ANTLR end "rule__TransportStep__Group_5__1"


    // $ANTLR start "rule__TransportStep__Group_5__1__Impl"
    // InternalMSDsl.g:4751:1: rule__TransportStep__Group_5__1__Impl : ( ( rule__TransportStep__ResponsibleAssignment_5_1 ) ) ;
    public final void rule__TransportStep__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4755:1: ( ( ( rule__TransportStep__ResponsibleAssignment_5_1 ) ) )
            // InternalMSDsl.g:4756:1: ( ( rule__TransportStep__ResponsibleAssignment_5_1 ) )
            {
            // InternalMSDsl.g:4756:1: ( ( rule__TransportStep__ResponsibleAssignment_5_1 ) )
            // InternalMSDsl.g:4757:2: ( rule__TransportStep__ResponsibleAssignment_5_1 )
            {
             before(grammarAccess.getTransportStepAccess().getResponsibleAssignment_5_1()); 
            // InternalMSDsl.g:4758:2: ( rule__TransportStep__ResponsibleAssignment_5_1 )
            // InternalMSDsl.g:4758:3: rule__TransportStep__ResponsibleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__ResponsibleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getResponsibleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_5__1__Impl"


    // $ANTLR start "rule__TransportStep__Group_9__0"
    // InternalMSDsl.g:4767:1: rule__TransportStep__Group_9__0 : rule__TransportStep__Group_9__0__Impl rule__TransportStep__Group_9__1 ;
    public final void rule__TransportStep__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4771:1: ( rule__TransportStep__Group_9__0__Impl rule__TransportStep__Group_9__1 )
            // InternalMSDsl.g:4772:2: rule__TransportStep__Group_9__0__Impl rule__TransportStep__Group_9__1
            {
            pushFollow(FOLLOW_23);
            rule__TransportStep__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_9__1();

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
    // $ANTLR end "rule__TransportStep__Group_9__0"


    // $ANTLR start "rule__TransportStep__Group_9__0__Impl"
    // InternalMSDsl.g:4779:1: rule__TransportStep__Group_9__0__Impl : ( ',' ) ;
    public final void rule__TransportStep__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4783:1: ( ( ',' ) )
            // InternalMSDsl.g:4784:1: ( ',' )
            {
            // InternalMSDsl.g:4784:1: ( ',' )
            // InternalMSDsl.g:4785:2: ','
            {
             before(grammarAccess.getTransportStepAccess().getCommaKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_9__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_9__1"
    // InternalMSDsl.g:4794:1: rule__TransportStep__Group_9__1 : rule__TransportStep__Group_9__1__Impl ;
    public final void rule__TransportStep__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4798:1: ( rule__TransportStep__Group_9__1__Impl )
            // InternalMSDsl.g:4799:2: rule__TransportStep__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_9__1__Impl();

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
    // $ANTLR end "rule__TransportStep__Group_9__1"


    // $ANTLR start "rule__TransportStep__Group_9__1__Impl"
    // InternalMSDsl.g:4805:1: rule__TransportStep__Group_9__1__Impl : ( ( rule__TransportStep__InputAssignment_9_1 ) ) ;
    public final void rule__TransportStep__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4809:1: ( ( ( rule__TransportStep__InputAssignment_9_1 ) ) )
            // InternalMSDsl.g:4810:1: ( ( rule__TransportStep__InputAssignment_9_1 ) )
            {
            // InternalMSDsl.g:4810:1: ( ( rule__TransportStep__InputAssignment_9_1 ) )
            // InternalMSDsl.g:4811:2: ( rule__TransportStep__InputAssignment_9_1 )
            {
             before(grammarAccess.getTransportStepAccess().getInputAssignment_9_1()); 
            // InternalMSDsl.g:4812:2: ( rule__TransportStep__InputAssignment_9_1 )
            // InternalMSDsl.g:4812:3: rule__TransportStep__InputAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__InputAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getInputAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_9__1__Impl"


    // $ANTLR start "rule__TransportStep__Group_14__0"
    // InternalMSDsl.g:4821:1: rule__TransportStep__Group_14__0 : rule__TransportStep__Group_14__0__Impl rule__TransportStep__Group_14__1 ;
    public final void rule__TransportStep__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4825:1: ( rule__TransportStep__Group_14__0__Impl rule__TransportStep__Group_14__1 )
            // InternalMSDsl.g:4826:2: rule__TransportStep__Group_14__0__Impl rule__TransportStep__Group_14__1
            {
            pushFollow(FOLLOW_3);
            rule__TransportStep__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_14__1();

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
    // $ANTLR end "rule__TransportStep__Group_14__0"


    // $ANTLR start "rule__TransportStep__Group_14__0__Impl"
    // InternalMSDsl.g:4833:1: rule__TransportStep__Group_14__0__Impl : ( 'or' ) ;
    public final void rule__TransportStep__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4837:1: ( ( 'or' ) )
            // InternalMSDsl.g:4838:1: ( 'or' )
            {
            // InternalMSDsl.g:4838:1: ( 'or' )
            // InternalMSDsl.g:4839:2: 'or'
            {
             before(grammarAccess.getTransportStepAccess().getOrKeyword_14_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getOrKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_14__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_14__1"
    // InternalMSDsl.g:4848:1: rule__TransportStep__Group_14__1 : rule__TransportStep__Group_14__1__Impl ;
    public final void rule__TransportStep__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4852:1: ( rule__TransportStep__Group_14__1__Impl )
            // InternalMSDsl.g:4853:2: rule__TransportStep__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_14__1__Impl();

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
    // $ANTLR end "rule__TransportStep__Group_14__1"


    // $ANTLR start "rule__TransportStep__Group_14__1__Impl"
    // InternalMSDsl.g:4859:1: rule__TransportStep__Group_14__1__Impl : ( ( rule__TransportStep__OutputAssignment_14_1 ) ) ;
    public final void rule__TransportStep__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4863:1: ( ( ( rule__TransportStep__OutputAssignment_14_1 ) ) )
            // InternalMSDsl.g:4864:1: ( ( rule__TransportStep__OutputAssignment_14_1 ) )
            {
            // InternalMSDsl.g:4864:1: ( ( rule__TransportStep__OutputAssignment_14_1 ) )
            // InternalMSDsl.g:4865:2: ( rule__TransportStep__OutputAssignment_14_1 )
            {
             before(grammarAccess.getTransportStepAccess().getOutputAssignment_14_1()); 
            // InternalMSDsl.g:4866:2: ( rule__TransportStep__OutputAssignment_14_1 )
            // InternalMSDsl.g:4866:3: rule__TransportStep__OutputAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__OutputAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getOutputAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_14__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__0"
    // InternalMSDsl.g:4875:1: rule__QualityAssuranceStep__Group__0 : rule__QualityAssuranceStep__Group__0__Impl rule__QualityAssuranceStep__Group__1 ;
    public final void rule__QualityAssuranceStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4879:1: ( rule__QualityAssuranceStep__Group__0__Impl rule__QualityAssuranceStep__Group__1 )
            // InternalMSDsl.g:4880:2: rule__QualityAssuranceStep__Group__0__Impl rule__QualityAssuranceStep__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QualityAssuranceStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__1();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group__0__Impl"
    // InternalMSDsl.g:4887:1: rule__QualityAssuranceStep__Group__0__Impl : ( 'QualityAssuranceStep' ) ;
    public final void rule__QualityAssuranceStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4891:1: ( ( 'QualityAssuranceStep' ) )
            // InternalMSDsl.g:4892:1: ( 'QualityAssuranceStep' )
            {
            // InternalMSDsl.g:4892:1: ( 'QualityAssuranceStep' )
            // InternalMSDsl.g:4893:2: 'QualityAssuranceStep'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getQualityAssuranceStepKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getQualityAssuranceStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__1"
    // InternalMSDsl.g:4902:1: rule__QualityAssuranceStep__Group__1 : rule__QualityAssuranceStep__Group__1__Impl rule__QualityAssuranceStep__Group__2 ;
    public final void rule__QualityAssuranceStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4906:1: ( rule__QualityAssuranceStep__Group__1__Impl rule__QualityAssuranceStep__Group__2 )
            // InternalMSDsl.g:4907:2: rule__QualityAssuranceStep__Group__1__Impl rule__QualityAssuranceStep__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QualityAssuranceStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__2();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group__1__Impl"
    // InternalMSDsl.g:4914:1: rule__QualityAssuranceStep__Group__1__Impl : ( ( rule__QualityAssuranceStep__NameAssignment_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4918:1: ( ( ( rule__QualityAssuranceStep__NameAssignment_1 ) ) )
            // InternalMSDsl.g:4919:1: ( ( rule__QualityAssuranceStep__NameAssignment_1 ) )
            {
            // InternalMSDsl.g:4919:1: ( ( rule__QualityAssuranceStep__NameAssignment_1 ) )
            // InternalMSDsl.g:4920:2: ( rule__QualityAssuranceStep__NameAssignment_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:4921:2: ( rule__QualityAssuranceStep__NameAssignment_1 )
            // InternalMSDsl.g:4921:3: rule__QualityAssuranceStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__2"
    // InternalMSDsl.g:4929:1: rule__QualityAssuranceStep__Group__2 : rule__QualityAssuranceStep__Group__2__Impl rule__QualityAssuranceStep__Group__3 ;
    public final void rule__QualityAssuranceStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4933:1: ( rule__QualityAssuranceStep__Group__2__Impl rule__QualityAssuranceStep__Group__3 )
            // InternalMSDsl.g:4934:2: rule__QualityAssuranceStep__Group__2__Impl rule__QualityAssuranceStep__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__QualityAssuranceStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__3();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__2"


    // $ANTLR start "rule__QualityAssuranceStep__Group__2__Impl"
    // InternalMSDsl.g:4941:1: rule__QualityAssuranceStep__Group__2__Impl : ( '{' ) ;
    public final void rule__QualityAssuranceStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4945:1: ( ( '{' ) )
            // InternalMSDsl.g:4946:1: ( '{' )
            {
            // InternalMSDsl.g:4946:1: ( '{' )
            // InternalMSDsl.g:4947:2: '{'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__2__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__3"
    // InternalMSDsl.g:4956:1: rule__QualityAssuranceStep__Group__3 : rule__QualityAssuranceStep__Group__3__Impl rule__QualityAssuranceStep__Group__4 ;
    public final void rule__QualityAssuranceStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4960:1: ( rule__QualityAssuranceStep__Group__3__Impl rule__QualityAssuranceStep__Group__4 )
            // InternalMSDsl.g:4961:2: rule__QualityAssuranceStep__Group__3__Impl rule__QualityAssuranceStep__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__QualityAssuranceStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__4();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__3"


    // $ANTLR start "rule__QualityAssuranceStep__Group__3__Impl"
    // InternalMSDsl.g:4968:1: rule__QualityAssuranceStep__Group__3__Impl : ( ( rule__QualityAssuranceStep__Group_3__0 )? ) ;
    public final void rule__QualityAssuranceStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4972:1: ( ( ( rule__QualityAssuranceStep__Group_3__0 )? ) )
            // InternalMSDsl.g:4973:1: ( ( rule__QualityAssuranceStep__Group_3__0 )? )
            {
            // InternalMSDsl.g:4973:1: ( ( rule__QualityAssuranceStep__Group_3__0 )? )
            // InternalMSDsl.g:4974:2: ( rule__QualityAssuranceStep__Group_3__0 )?
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_3()); 
            // InternalMSDsl.g:4975:2: ( rule__QualityAssuranceStep__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMSDsl.g:4975:3: rule__QualityAssuranceStep__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualityAssuranceStep__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__3__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__4"
    // InternalMSDsl.g:4983:1: rule__QualityAssuranceStep__Group__4 : rule__QualityAssuranceStep__Group__4__Impl rule__QualityAssuranceStep__Group__5 ;
    public final void rule__QualityAssuranceStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4987:1: ( rule__QualityAssuranceStep__Group__4__Impl rule__QualityAssuranceStep__Group__5 )
            // InternalMSDsl.g:4988:2: rule__QualityAssuranceStep__Group__4__Impl rule__QualityAssuranceStep__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__QualityAssuranceStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__5();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__4"


    // $ANTLR start "rule__QualityAssuranceStep__Group__4__Impl"
    // InternalMSDsl.g:4995:1: rule__QualityAssuranceStep__Group__4__Impl : ( ( rule__QualityAssuranceStep__Group_4__0 )? ) ;
    public final void rule__QualityAssuranceStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:4999:1: ( ( ( rule__QualityAssuranceStep__Group_4__0 )? ) )
            // InternalMSDsl.g:5000:1: ( ( rule__QualityAssuranceStep__Group_4__0 )? )
            {
            // InternalMSDsl.g:5000:1: ( ( rule__QualityAssuranceStep__Group_4__0 )? )
            // InternalMSDsl.g:5001:2: ( rule__QualityAssuranceStep__Group_4__0 )?
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_4()); 
            // InternalMSDsl.g:5002:2: ( rule__QualityAssuranceStep__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMSDsl.g:5002:3: rule__QualityAssuranceStep__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualityAssuranceStep__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__4__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__5"
    // InternalMSDsl.g:5010:1: rule__QualityAssuranceStep__Group__5 : rule__QualityAssuranceStep__Group__5__Impl rule__QualityAssuranceStep__Group__6 ;
    public final void rule__QualityAssuranceStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5014:1: ( rule__QualityAssuranceStep__Group__5__Impl rule__QualityAssuranceStep__Group__6 )
            // InternalMSDsl.g:5015:2: rule__QualityAssuranceStep__Group__5__Impl rule__QualityAssuranceStep__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__QualityAssuranceStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__6();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__5"


    // $ANTLR start "rule__QualityAssuranceStep__Group__5__Impl"
    // InternalMSDsl.g:5022:1: rule__QualityAssuranceStep__Group__5__Impl : ( ( rule__QualityAssuranceStep__Group_5__0 )? ) ;
    public final void rule__QualityAssuranceStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5026:1: ( ( ( rule__QualityAssuranceStep__Group_5__0 )? ) )
            // InternalMSDsl.g:5027:1: ( ( rule__QualityAssuranceStep__Group_5__0 )? )
            {
            // InternalMSDsl.g:5027:1: ( ( rule__QualityAssuranceStep__Group_5__0 )? )
            // InternalMSDsl.g:5028:2: ( rule__QualityAssuranceStep__Group_5__0 )?
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_5()); 
            // InternalMSDsl.g:5029:2: ( rule__QualityAssuranceStep__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMSDsl.g:5029:3: rule__QualityAssuranceStep__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualityAssuranceStep__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__5__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__6"
    // InternalMSDsl.g:5037:1: rule__QualityAssuranceStep__Group__6 : rule__QualityAssuranceStep__Group__6__Impl rule__QualityAssuranceStep__Group__7 ;
    public final void rule__QualityAssuranceStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5041:1: ( rule__QualityAssuranceStep__Group__6__Impl rule__QualityAssuranceStep__Group__7 )
            // InternalMSDsl.g:5042:2: rule__QualityAssuranceStep__Group__6__Impl rule__QualityAssuranceStep__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__QualityAssuranceStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__7();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__6"


    // $ANTLR start "rule__QualityAssuranceStep__Group__6__Impl"
    // InternalMSDsl.g:5049:1: rule__QualityAssuranceStep__Group__6__Impl : ( 'inputConditions' ) ;
    public final void rule__QualityAssuranceStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5053:1: ( ( 'inputConditions' ) )
            // InternalMSDsl.g:5054:1: ( 'inputConditions' )
            {
            // InternalMSDsl.g:5054:1: ( 'inputConditions' )
            // InternalMSDsl.g:5055:2: 'inputConditions'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputConditionsKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getInputConditionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__6__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__7"
    // InternalMSDsl.g:5064:1: rule__QualityAssuranceStep__Group__7 : rule__QualityAssuranceStep__Group__7__Impl rule__QualityAssuranceStep__Group__8 ;
    public final void rule__QualityAssuranceStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5068:1: ( rule__QualityAssuranceStep__Group__7__Impl rule__QualityAssuranceStep__Group__8 )
            // InternalMSDsl.g:5069:2: rule__QualityAssuranceStep__Group__7__Impl rule__QualityAssuranceStep__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__QualityAssuranceStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__8();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__7"


    // $ANTLR start "rule__QualityAssuranceStep__Group__7__Impl"
    // InternalMSDsl.g:5076:1: rule__QualityAssuranceStep__Group__7__Impl : ( '{' ) ;
    public final void rule__QualityAssuranceStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5080:1: ( ( '{' ) )
            // InternalMSDsl.g:5081:1: ( '{' )
            {
            // InternalMSDsl.g:5081:1: ( '{' )
            // InternalMSDsl.g:5082:2: '{'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__7__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__8"
    // InternalMSDsl.g:5091:1: rule__QualityAssuranceStep__Group__8 : rule__QualityAssuranceStep__Group__8__Impl rule__QualityAssuranceStep__Group__9 ;
    public final void rule__QualityAssuranceStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5095:1: ( rule__QualityAssuranceStep__Group__8__Impl rule__QualityAssuranceStep__Group__9 )
            // InternalMSDsl.g:5096:2: rule__QualityAssuranceStep__Group__8__Impl rule__QualityAssuranceStep__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__QualityAssuranceStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__9();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__8"


    // $ANTLR start "rule__QualityAssuranceStep__Group__8__Impl"
    // InternalMSDsl.g:5103:1: rule__QualityAssuranceStep__Group__8__Impl : ( ( rule__QualityAssuranceStep__InputAssignment_8 ) ) ;
    public final void rule__QualityAssuranceStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5107:1: ( ( ( rule__QualityAssuranceStep__InputAssignment_8 ) ) )
            // InternalMSDsl.g:5108:1: ( ( rule__QualityAssuranceStep__InputAssignment_8 ) )
            {
            // InternalMSDsl.g:5108:1: ( ( rule__QualityAssuranceStep__InputAssignment_8 ) )
            // InternalMSDsl.g:5109:2: ( rule__QualityAssuranceStep__InputAssignment_8 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputAssignment_8()); 
            // InternalMSDsl.g:5110:2: ( rule__QualityAssuranceStep__InputAssignment_8 )
            // InternalMSDsl.g:5110:3: rule__QualityAssuranceStep__InputAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__InputAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getInputAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__8__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__9"
    // InternalMSDsl.g:5118:1: rule__QualityAssuranceStep__Group__9 : rule__QualityAssuranceStep__Group__9__Impl rule__QualityAssuranceStep__Group__10 ;
    public final void rule__QualityAssuranceStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5122:1: ( rule__QualityAssuranceStep__Group__9__Impl rule__QualityAssuranceStep__Group__10 )
            // InternalMSDsl.g:5123:2: rule__QualityAssuranceStep__Group__9__Impl rule__QualityAssuranceStep__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__QualityAssuranceStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__10();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__9"


    // $ANTLR start "rule__QualityAssuranceStep__Group__9__Impl"
    // InternalMSDsl.g:5130:1: rule__QualityAssuranceStep__Group__9__Impl : ( ( rule__QualityAssuranceStep__Group_9__0 )* ) ;
    public final void rule__QualityAssuranceStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5134:1: ( ( ( rule__QualityAssuranceStep__Group_9__0 )* ) )
            // InternalMSDsl.g:5135:1: ( ( rule__QualityAssuranceStep__Group_9__0 )* )
            {
            // InternalMSDsl.g:5135:1: ( ( rule__QualityAssuranceStep__Group_9__0 )* )
            // InternalMSDsl.g:5136:2: ( rule__QualityAssuranceStep__Group_9__0 )*
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_9()); 
            // InternalMSDsl.g:5137:2: ( rule__QualityAssuranceStep__Group_9__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==21) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMSDsl.g:5137:3: rule__QualityAssuranceStep__Group_9__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualityAssuranceStep__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__9__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__10"
    // InternalMSDsl.g:5145:1: rule__QualityAssuranceStep__Group__10 : rule__QualityAssuranceStep__Group__10__Impl rule__QualityAssuranceStep__Group__11 ;
    public final void rule__QualityAssuranceStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5149:1: ( rule__QualityAssuranceStep__Group__10__Impl rule__QualityAssuranceStep__Group__11 )
            // InternalMSDsl.g:5150:2: rule__QualityAssuranceStep__Group__10__Impl rule__QualityAssuranceStep__Group__11
            {
            pushFollow(FOLLOW_30);
            rule__QualityAssuranceStep__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__11();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__10"


    // $ANTLR start "rule__QualityAssuranceStep__Group__10__Impl"
    // InternalMSDsl.g:5157:1: rule__QualityAssuranceStep__Group__10__Impl : ( '}' ) ;
    public final void rule__QualityAssuranceStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5161:1: ( ( '}' ) )
            // InternalMSDsl.g:5162:1: ( '}' )
            {
            // InternalMSDsl.g:5162:1: ( '}' )
            // InternalMSDsl.g:5163:2: '}'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__10__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__11"
    // InternalMSDsl.g:5172:1: rule__QualityAssuranceStep__Group__11 : rule__QualityAssuranceStep__Group__11__Impl rule__QualityAssuranceStep__Group__12 ;
    public final void rule__QualityAssuranceStep__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5176:1: ( rule__QualityAssuranceStep__Group__11__Impl rule__QualityAssuranceStep__Group__12 )
            // InternalMSDsl.g:5177:2: rule__QualityAssuranceStep__Group__11__Impl rule__QualityAssuranceStep__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__QualityAssuranceStep__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__12();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__11"


    // $ANTLR start "rule__QualityAssuranceStep__Group__11__Impl"
    // InternalMSDsl.g:5184:1: rule__QualityAssuranceStep__Group__11__Impl : ( 'verifies' ) ;
    public final void rule__QualityAssuranceStep__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5188:1: ( ( 'verifies' ) )
            // InternalMSDsl.g:5189:1: ( 'verifies' )
            {
            // InternalMSDsl.g:5189:1: ( 'verifies' )
            // InternalMSDsl.g:5190:2: 'verifies'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getVerifiesKeyword_11()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getVerifiesKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__11__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__12"
    // InternalMSDsl.g:5199:1: rule__QualityAssuranceStep__Group__12 : rule__QualityAssuranceStep__Group__12__Impl rule__QualityAssuranceStep__Group__13 ;
    public final void rule__QualityAssuranceStep__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5203:1: ( rule__QualityAssuranceStep__Group__12__Impl rule__QualityAssuranceStep__Group__13 )
            // InternalMSDsl.g:5204:2: rule__QualityAssuranceStep__Group__12__Impl rule__QualityAssuranceStep__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__QualityAssuranceStep__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__13();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__12"


    // $ANTLR start "rule__QualityAssuranceStep__Group__12__Impl"
    // InternalMSDsl.g:5211:1: rule__QualityAssuranceStep__Group__12__Impl : ( '{' ) ;
    public final void rule__QualityAssuranceStep__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5215:1: ( ( '{' ) )
            // InternalMSDsl.g:5216:1: ( '{' )
            {
            // InternalMSDsl.g:5216:1: ( '{' )
            // InternalMSDsl.g:5217:2: '{'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__12__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__13"
    // InternalMSDsl.g:5226:1: rule__QualityAssuranceStep__Group__13 : rule__QualityAssuranceStep__Group__13__Impl rule__QualityAssuranceStep__Group__14 ;
    public final void rule__QualityAssuranceStep__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5230:1: ( rule__QualityAssuranceStep__Group__13__Impl rule__QualityAssuranceStep__Group__14 )
            // InternalMSDsl.g:5231:2: rule__QualityAssuranceStep__Group__13__Impl rule__QualityAssuranceStep__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__QualityAssuranceStep__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__14();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__13"


    // $ANTLR start "rule__QualityAssuranceStep__Group__13__Impl"
    // InternalMSDsl.g:5238:1: rule__QualityAssuranceStep__Group__13__Impl : ( ( rule__QualityAssuranceStep__OutputAssignment_13 ) ) ;
    public final void rule__QualityAssuranceStep__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5242:1: ( ( ( rule__QualityAssuranceStep__OutputAssignment_13 ) ) )
            // InternalMSDsl.g:5243:1: ( ( rule__QualityAssuranceStep__OutputAssignment_13 ) )
            {
            // InternalMSDsl.g:5243:1: ( ( rule__QualityAssuranceStep__OutputAssignment_13 ) )
            // InternalMSDsl.g:5244:2: ( rule__QualityAssuranceStep__OutputAssignment_13 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputAssignment_13()); 
            // InternalMSDsl.g:5245:2: ( rule__QualityAssuranceStep__OutputAssignment_13 )
            // InternalMSDsl.g:5245:3: rule__QualityAssuranceStep__OutputAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__OutputAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getOutputAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__13__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__14"
    // InternalMSDsl.g:5253:1: rule__QualityAssuranceStep__Group__14 : rule__QualityAssuranceStep__Group__14__Impl rule__QualityAssuranceStep__Group__15 ;
    public final void rule__QualityAssuranceStep__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5257:1: ( rule__QualityAssuranceStep__Group__14__Impl rule__QualityAssuranceStep__Group__15 )
            // InternalMSDsl.g:5258:2: rule__QualityAssuranceStep__Group__14__Impl rule__QualityAssuranceStep__Group__15
            {
            pushFollow(FOLLOW_25);
            rule__QualityAssuranceStep__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__15();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__14"


    // $ANTLR start "rule__QualityAssuranceStep__Group__14__Impl"
    // InternalMSDsl.g:5265:1: rule__QualityAssuranceStep__Group__14__Impl : ( ( rule__QualityAssuranceStep__Group_14__0 )* ) ;
    public final void rule__QualityAssuranceStep__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5269:1: ( ( ( rule__QualityAssuranceStep__Group_14__0 )* ) )
            // InternalMSDsl.g:5270:1: ( ( rule__QualityAssuranceStep__Group_14__0 )* )
            {
            // InternalMSDsl.g:5270:1: ( ( rule__QualityAssuranceStep__Group_14__0 )* )
            // InternalMSDsl.g:5271:2: ( rule__QualityAssuranceStep__Group_14__0 )*
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_14()); 
            // InternalMSDsl.g:5272:2: ( rule__QualityAssuranceStep__Group_14__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==12) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMSDsl.g:5272:3: rule__QualityAssuranceStep__Group_14__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__QualityAssuranceStep__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__14__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__15"
    // InternalMSDsl.g:5280:1: rule__QualityAssuranceStep__Group__15 : rule__QualityAssuranceStep__Group__15__Impl rule__QualityAssuranceStep__Group__16 ;
    public final void rule__QualityAssuranceStep__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5284:1: ( rule__QualityAssuranceStep__Group__15__Impl rule__QualityAssuranceStep__Group__16 )
            // InternalMSDsl.g:5285:2: rule__QualityAssuranceStep__Group__15__Impl rule__QualityAssuranceStep__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__QualityAssuranceStep__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__16();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__15"


    // $ANTLR start "rule__QualityAssuranceStep__Group__15__Impl"
    // InternalMSDsl.g:5292:1: rule__QualityAssuranceStep__Group__15__Impl : ( '}' ) ;
    public final void rule__QualityAssuranceStep__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5296:1: ( ( '}' ) )
            // InternalMSDsl.g:5297:1: ( '}' )
            {
            // InternalMSDsl.g:5297:1: ( '}' )
            // InternalMSDsl.g:5298:2: '}'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_15()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__15__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__16"
    // InternalMSDsl.g:5307:1: rule__QualityAssuranceStep__Group__16 : rule__QualityAssuranceStep__Group__16__Impl ;
    public final void rule__QualityAssuranceStep__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5311:1: ( rule__QualityAssuranceStep__Group__16__Impl )
            // InternalMSDsl.g:5312:2: rule__QualityAssuranceStep__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__16__Impl();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group__16"


    // $ANTLR start "rule__QualityAssuranceStep__Group__16__Impl"
    // InternalMSDsl.g:5318:1: rule__QualityAssuranceStep__Group__16__Impl : ( '}' ) ;
    public final void rule__QualityAssuranceStep__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5322:1: ( ( '}' ) )
            // InternalMSDsl.g:5323:1: ( '}' )
            {
            // InternalMSDsl.g:5323:1: ( '}' )
            // InternalMSDsl.g:5324:2: '}'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_16()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__16__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_3__0"
    // InternalMSDsl.g:5334:1: rule__QualityAssuranceStep__Group_3__0 : rule__QualityAssuranceStep__Group_3__0__Impl rule__QualityAssuranceStep__Group_3__1 ;
    public final void rule__QualityAssuranceStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5338:1: ( rule__QualityAssuranceStep__Group_3__0__Impl rule__QualityAssuranceStep__Group_3__1 )
            // InternalMSDsl.g:5339:2: rule__QualityAssuranceStep__Group_3__0__Impl rule__QualityAssuranceStep__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__QualityAssuranceStep__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_3__1();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_3__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_3__0__Impl"
    // InternalMSDsl.g:5346:1: rule__QualityAssuranceStep__Group_3__0__Impl : ( 'speed' ) ;
    public final void rule__QualityAssuranceStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5350:1: ( ( 'speed' ) )
            // InternalMSDsl.g:5351:1: ( 'speed' )
            {
            // InternalMSDsl.g:5351:1: ( 'speed' )
            // InternalMSDsl.g:5352:2: 'speed'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getSpeedKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getSpeedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_3__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_3__1"
    // InternalMSDsl.g:5361:1: rule__QualityAssuranceStep__Group_3__1 : rule__QualityAssuranceStep__Group_3__1__Impl ;
    public final void rule__QualityAssuranceStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5365:1: ( rule__QualityAssuranceStep__Group_3__1__Impl )
            // InternalMSDsl.g:5366:2: rule__QualityAssuranceStep__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_3__1__Impl();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_3__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_3__1__Impl"
    // InternalMSDsl.g:5372:1: rule__QualityAssuranceStep__Group_3__1__Impl : ( ( rule__QualityAssuranceStep__SpeedAssignment_3_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5376:1: ( ( ( rule__QualityAssuranceStep__SpeedAssignment_3_1 ) ) )
            // InternalMSDsl.g:5377:1: ( ( rule__QualityAssuranceStep__SpeedAssignment_3_1 ) )
            {
            // InternalMSDsl.g:5377:1: ( ( rule__QualityAssuranceStep__SpeedAssignment_3_1 ) )
            // InternalMSDsl.g:5378:2: ( rule__QualityAssuranceStep__SpeedAssignment_3_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getSpeedAssignment_3_1()); 
            // InternalMSDsl.g:5379:2: ( rule__QualityAssuranceStep__SpeedAssignment_3_1 )
            // InternalMSDsl.g:5379:3: rule__QualityAssuranceStep__SpeedAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__SpeedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getSpeedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_3__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4__0"
    // InternalMSDsl.g:5388:1: rule__QualityAssuranceStep__Group_4__0 : rule__QualityAssuranceStep__Group_4__0__Impl rule__QualityAssuranceStep__Group_4__1 ;
    public final void rule__QualityAssuranceStep__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5392:1: ( rule__QualityAssuranceStep__Group_4__0__Impl rule__QualityAssuranceStep__Group_4__1 )
            // InternalMSDsl.g:5393:2: rule__QualityAssuranceStep__Group_4__0__Impl rule__QualityAssuranceStep__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__QualityAssuranceStep__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_4__1();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_4__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4__0__Impl"
    // InternalMSDsl.g:5400:1: rule__QualityAssuranceStep__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__QualityAssuranceStep__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5404:1: ( ( 'transition' ) )
            // InternalMSDsl.g:5405:1: ( 'transition' )
            {
            // InternalMSDsl.g:5405:1: ( 'transition' )
            // InternalMSDsl.g:5406:2: 'transition'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_4__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4__1"
    // InternalMSDsl.g:5415:1: rule__QualityAssuranceStep__Group_4__1 : rule__QualityAssuranceStep__Group_4__1__Impl rule__QualityAssuranceStep__Group_4__2 ;
    public final void rule__QualityAssuranceStep__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5419:1: ( rule__QualityAssuranceStep__Group_4__1__Impl rule__QualityAssuranceStep__Group_4__2 )
            // InternalMSDsl.g:5420:2: rule__QualityAssuranceStep__Group_4__1__Impl rule__QualityAssuranceStep__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__QualityAssuranceStep__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_4__2();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_4__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4__1__Impl"
    // InternalMSDsl.g:5427:1: rule__QualityAssuranceStep__Group_4__1__Impl : ( ( rule__QualityAssuranceStep__TransitionAssignment_4_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5431:1: ( ( ( rule__QualityAssuranceStep__TransitionAssignment_4_1 ) ) )
            // InternalMSDsl.g:5432:1: ( ( rule__QualityAssuranceStep__TransitionAssignment_4_1 ) )
            {
            // InternalMSDsl.g:5432:1: ( ( rule__QualityAssuranceStep__TransitionAssignment_4_1 ) )
            // InternalMSDsl.g:5433:2: ( rule__QualityAssuranceStep__TransitionAssignment_4_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionAssignment_4_1()); 
            // InternalMSDsl.g:5434:2: ( rule__QualityAssuranceStep__TransitionAssignment_4_1 )
            // InternalMSDsl.g:5434:3: rule__QualityAssuranceStep__TransitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__TransitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_4__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4__2"
    // InternalMSDsl.g:5442:1: rule__QualityAssuranceStep__Group_4__2 : rule__QualityAssuranceStep__Group_4__2__Impl ;
    public final void rule__QualityAssuranceStep__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5446:1: ( rule__QualityAssuranceStep__Group_4__2__Impl )
            // InternalMSDsl.g:5447:2: rule__QualityAssuranceStep__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_4__2__Impl();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_4__2"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4__2__Impl"
    // InternalMSDsl.g:5453:1: rule__QualityAssuranceStep__Group_4__2__Impl : ( ( rule__QualityAssuranceStep__Group_4_2__0 )* ) ;
    public final void rule__QualityAssuranceStep__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5457:1: ( ( ( rule__QualityAssuranceStep__Group_4_2__0 )* ) )
            // InternalMSDsl.g:5458:1: ( ( rule__QualityAssuranceStep__Group_4_2__0 )* )
            {
            // InternalMSDsl.g:5458:1: ( ( rule__QualityAssuranceStep__Group_4_2__0 )* )
            // InternalMSDsl.g:5459:2: ( rule__QualityAssuranceStep__Group_4_2__0 )*
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_4_2()); 
            // InternalMSDsl.g:5460:2: ( rule__QualityAssuranceStep__Group_4_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==21) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMSDsl.g:5460:3: rule__QualityAssuranceStep__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualityAssuranceStep__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_4__2__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4_2__0"
    // InternalMSDsl.g:5469:1: rule__QualityAssuranceStep__Group_4_2__0 : rule__QualityAssuranceStep__Group_4_2__0__Impl rule__QualityAssuranceStep__Group_4_2__1 ;
    public final void rule__QualityAssuranceStep__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5473:1: ( rule__QualityAssuranceStep__Group_4_2__0__Impl rule__QualityAssuranceStep__Group_4_2__1 )
            // InternalMSDsl.g:5474:2: rule__QualityAssuranceStep__Group_4_2__0__Impl rule__QualityAssuranceStep__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__QualityAssuranceStep__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_4_2__1();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_4_2__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4_2__0__Impl"
    // InternalMSDsl.g:5481:1: rule__QualityAssuranceStep__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__QualityAssuranceStep__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5485:1: ( ( ',' ) )
            // InternalMSDsl.g:5486:1: ( ',' )
            {
            // InternalMSDsl.g:5486:1: ( ',' )
            // InternalMSDsl.g:5487:2: ','
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_4_2__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4_2__1"
    // InternalMSDsl.g:5496:1: rule__QualityAssuranceStep__Group_4_2__1 : rule__QualityAssuranceStep__Group_4_2__1__Impl ;
    public final void rule__QualityAssuranceStep__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5500:1: ( rule__QualityAssuranceStep__Group_4_2__1__Impl )
            // InternalMSDsl.g:5501:2: rule__QualityAssuranceStep__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_4_2__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_4_2__1__Impl"
    // InternalMSDsl.g:5507:1: rule__QualityAssuranceStep__Group_4_2__1__Impl : ( ( rule__QualityAssuranceStep__TransitionAssignment_4_2_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5511:1: ( ( ( rule__QualityAssuranceStep__TransitionAssignment_4_2_1 ) ) )
            // InternalMSDsl.g:5512:1: ( ( rule__QualityAssuranceStep__TransitionAssignment_4_2_1 ) )
            {
            // InternalMSDsl.g:5512:1: ( ( rule__QualityAssuranceStep__TransitionAssignment_4_2_1 ) )
            // InternalMSDsl.g:5513:2: ( rule__QualityAssuranceStep__TransitionAssignment_4_2_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionAssignment_4_2_1()); 
            // InternalMSDsl.g:5514:2: ( rule__QualityAssuranceStep__TransitionAssignment_4_2_1 )
            // InternalMSDsl.g:5514:3: rule__QualityAssuranceStep__TransitionAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__TransitionAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_4_2__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_5__0"
    // InternalMSDsl.g:5523:1: rule__QualityAssuranceStep__Group_5__0 : rule__QualityAssuranceStep__Group_5__0__Impl rule__QualityAssuranceStep__Group_5__1 ;
    public final void rule__QualityAssuranceStep__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5527:1: ( rule__QualityAssuranceStep__Group_5__0__Impl rule__QualityAssuranceStep__Group_5__1 )
            // InternalMSDsl.g:5528:2: rule__QualityAssuranceStep__Group_5__0__Impl rule__QualityAssuranceStep__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__QualityAssuranceStep__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_5__1();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_5__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_5__0__Impl"
    // InternalMSDsl.g:5535:1: rule__QualityAssuranceStep__Group_5__0__Impl : ( 'responsible' ) ;
    public final void rule__QualityAssuranceStep__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5539:1: ( ( 'responsible' ) )
            // InternalMSDsl.g:5540:1: ( 'responsible' )
            {
            // InternalMSDsl.g:5540:1: ( 'responsible' )
            // InternalMSDsl.g:5541:2: 'responsible'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getResponsibleKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getResponsibleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_5__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_5__1"
    // InternalMSDsl.g:5550:1: rule__QualityAssuranceStep__Group_5__1 : rule__QualityAssuranceStep__Group_5__1__Impl ;
    public final void rule__QualityAssuranceStep__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5554:1: ( rule__QualityAssuranceStep__Group_5__1__Impl )
            // InternalMSDsl.g:5555:2: rule__QualityAssuranceStep__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_5__1__Impl();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_5__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_5__1__Impl"
    // InternalMSDsl.g:5561:1: rule__QualityAssuranceStep__Group_5__1__Impl : ( ( rule__QualityAssuranceStep__ResponsibleAssignment_5_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5565:1: ( ( ( rule__QualityAssuranceStep__ResponsibleAssignment_5_1 ) ) )
            // InternalMSDsl.g:5566:1: ( ( rule__QualityAssuranceStep__ResponsibleAssignment_5_1 ) )
            {
            // InternalMSDsl.g:5566:1: ( ( rule__QualityAssuranceStep__ResponsibleAssignment_5_1 ) )
            // InternalMSDsl.g:5567:2: ( rule__QualityAssuranceStep__ResponsibleAssignment_5_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getResponsibleAssignment_5_1()); 
            // InternalMSDsl.g:5568:2: ( rule__QualityAssuranceStep__ResponsibleAssignment_5_1 )
            // InternalMSDsl.g:5568:3: rule__QualityAssuranceStep__ResponsibleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__ResponsibleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getResponsibleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_5__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_9__0"
    // InternalMSDsl.g:5577:1: rule__QualityAssuranceStep__Group_9__0 : rule__QualityAssuranceStep__Group_9__0__Impl rule__QualityAssuranceStep__Group_9__1 ;
    public final void rule__QualityAssuranceStep__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5581:1: ( rule__QualityAssuranceStep__Group_9__0__Impl rule__QualityAssuranceStep__Group_9__1 )
            // InternalMSDsl.g:5582:2: rule__QualityAssuranceStep__Group_9__0__Impl rule__QualityAssuranceStep__Group_9__1
            {
            pushFollow(FOLLOW_23);
            rule__QualityAssuranceStep__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_9__1();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_9__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_9__0__Impl"
    // InternalMSDsl.g:5589:1: rule__QualityAssuranceStep__Group_9__0__Impl : ( ',' ) ;
    public final void rule__QualityAssuranceStep__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5593:1: ( ( ',' ) )
            // InternalMSDsl.g:5594:1: ( ',' )
            {
            // InternalMSDsl.g:5594:1: ( ',' )
            // InternalMSDsl.g:5595:2: ','
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_9__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_9__1"
    // InternalMSDsl.g:5604:1: rule__QualityAssuranceStep__Group_9__1 : rule__QualityAssuranceStep__Group_9__1__Impl ;
    public final void rule__QualityAssuranceStep__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5608:1: ( rule__QualityAssuranceStep__Group_9__1__Impl )
            // InternalMSDsl.g:5609:2: rule__QualityAssuranceStep__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_9__1__Impl();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_9__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_9__1__Impl"
    // InternalMSDsl.g:5615:1: rule__QualityAssuranceStep__Group_9__1__Impl : ( ( rule__QualityAssuranceStep__InputAssignment_9_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5619:1: ( ( ( rule__QualityAssuranceStep__InputAssignment_9_1 ) ) )
            // InternalMSDsl.g:5620:1: ( ( rule__QualityAssuranceStep__InputAssignment_9_1 ) )
            {
            // InternalMSDsl.g:5620:1: ( ( rule__QualityAssuranceStep__InputAssignment_9_1 ) )
            // InternalMSDsl.g:5621:2: ( rule__QualityAssuranceStep__InputAssignment_9_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputAssignment_9_1()); 
            // InternalMSDsl.g:5622:2: ( rule__QualityAssuranceStep__InputAssignment_9_1 )
            // InternalMSDsl.g:5622:3: rule__QualityAssuranceStep__InputAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__InputAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getInputAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_9__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_14__0"
    // InternalMSDsl.g:5631:1: rule__QualityAssuranceStep__Group_14__0 : rule__QualityAssuranceStep__Group_14__0__Impl rule__QualityAssuranceStep__Group_14__1 ;
    public final void rule__QualityAssuranceStep__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5635:1: ( rule__QualityAssuranceStep__Group_14__0__Impl rule__QualityAssuranceStep__Group_14__1 )
            // InternalMSDsl.g:5636:2: rule__QualityAssuranceStep__Group_14__0__Impl rule__QualityAssuranceStep__Group_14__1
            {
            pushFollow(FOLLOW_3);
            rule__QualityAssuranceStep__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_14__1();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_14__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_14__0__Impl"
    // InternalMSDsl.g:5643:1: rule__QualityAssuranceStep__Group_14__0__Impl : ( 'or' ) ;
    public final void rule__QualityAssuranceStep__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5647:1: ( ( 'or' ) )
            // InternalMSDsl.g:5648:1: ( 'or' )
            {
            // InternalMSDsl.g:5648:1: ( 'or' )
            // InternalMSDsl.g:5649:2: 'or'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOrKeyword_14_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getOrKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_14__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_14__1"
    // InternalMSDsl.g:5658:1: rule__QualityAssuranceStep__Group_14__1 : rule__QualityAssuranceStep__Group_14__1__Impl ;
    public final void rule__QualityAssuranceStep__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5662:1: ( rule__QualityAssuranceStep__Group_14__1__Impl )
            // InternalMSDsl.g:5663:2: rule__QualityAssuranceStep__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_14__1__Impl();

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
    // $ANTLR end "rule__QualityAssuranceStep__Group_14__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_14__1__Impl"
    // InternalMSDsl.g:5669:1: rule__QualityAssuranceStep__Group_14__1__Impl : ( ( rule__QualityAssuranceStep__OutputAssignment_14_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5673:1: ( ( ( rule__QualityAssuranceStep__OutputAssignment_14_1 ) ) )
            // InternalMSDsl.g:5674:1: ( ( rule__QualityAssuranceStep__OutputAssignment_14_1 ) )
            {
            // InternalMSDsl.g:5674:1: ( ( rule__QualityAssuranceStep__OutputAssignment_14_1 ) )
            // InternalMSDsl.g:5675:2: ( rule__QualityAssuranceStep__OutputAssignment_14_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputAssignment_14_1()); 
            // InternalMSDsl.g:5676:2: ( rule__QualityAssuranceStep__OutputAssignment_14_1 )
            // InternalMSDsl.g:5676:3: rule__QualityAssuranceStep__OutputAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__OutputAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getOutputAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_14__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__0"
    // InternalMSDsl.g:5685:1: rule__CompositeManufacturingStep__Group__0 : rule__CompositeManufacturingStep__Group__0__Impl rule__CompositeManufacturingStep__Group__1 ;
    public final void rule__CompositeManufacturingStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5689:1: ( rule__CompositeManufacturingStep__Group__0__Impl rule__CompositeManufacturingStep__Group__1 )
            // InternalMSDsl.g:5690:2: rule__CompositeManufacturingStep__Group__0__Impl rule__CompositeManufacturingStep__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeManufacturingStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__1();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__0__Impl"
    // InternalMSDsl.g:5697:1: rule__CompositeManufacturingStep__Group__0__Impl : ( 'CompositeManufacturingStep' ) ;
    public final void rule__CompositeManufacturingStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5701:1: ( ( 'CompositeManufacturingStep' ) )
            // InternalMSDsl.g:5702:1: ( 'CompositeManufacturingStep' )
            {
            // InternalMSDsl.g:5702:1: ( 'CompositeManufacturingStep' )
            // InternalMSDsl.g:5703:2: 'CompositeManufacturingStep'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getCompositeManufacturingStepKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getCompositeManufacturingStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__1"
    // InternalMSDsl.g:5712:1: rule__CompositeManufacturingStep__Group__1 : rule__CompositeManufacturingStep__Group__1__Impl rule__CompositeManufacturingStep__Group__2 ;
    public final void rule__CompositeManufacturingStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5716:1: ( rule__CompositeManufacturingStep__Group__1__Impl rule__CompositeManufacturingStep__Group__2 )
            // InternalMSDsl.g:5717:2: rule__CompositeManufacturingStep__Group__1__Impl rule__CompositeManufacturingStep__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CompositeManufacturingStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__2();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__1__Impl"
    // InternalMSDsl.g:5724:1: rule__CompositeManufacturingStep__Group__1__Impl : ( ( rule__CompositeManufacturingStep__NameAssignment_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5728:1: ( ( ( rule__CompositeManufacturingStep__NameAssignment_1 ) ) )
            // InternalMSDsl.g:5729:1: ( ( rule__CompositeManufacturingStep__NameAssignment_1 ) )
            {
            // InternalMSDsl.g:5729:1: ( ( rule__CompositeManufacturingStep__NameAssignment_1 ) )
            // InternalMSDsl.g:5730:2: ( rule__CompositeManufacturingStep__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:5731:2: ( rule__CompositeManufacturingStep__NameAssignment_1 )
            // InternalMSDsl.g:5731:3: rule__CompositeManufacturingStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__2"
    // InternalMSDsl.g:5739:1: rule__CompositeManufacturingStep__Group__2 : rule__CompositeManufacturingStep__Group__2__Impl rule__CompositeManufacturingStep__Group__3 ;
    public final void rule__CompositeManufacturingStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5743:1: ( rule__CompositeManufacturingStep__Group__2__Impl rule__CompositeManufacturingStep__Group__3 )
            // InternalMSDsl.g:5744:2: rule__CompositeManufacturingStep__Group__2__Impl rule__CompositeManufacturingStep__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__CompositeManufacturingStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__3();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__2"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__2__Impl"
    // InternalMSDsl.g:5751:1: rule__CompositeManufacturingStep__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeManufacturingStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5755:1: ( ( '{' ) )
            // InternalMSDsl.g:5756:1: ( '{' )
            {
            // InternalMSDsl.g:5756:1: ( '{' )
            // InternalMSDsl.g:5757:2: '{'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__2__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__3"
    // InternalMSDsl.g:5766:1: rule__CompositeManufacturingStep__Group__3 : rule__CompositeManufacturingStep__Group__3__Impl rule__CompositeManufacturingStep__Group__4 ;
    public final void rule__CompositeManufacturingStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5770:1: ( rule__CompositeManufacturingStep__Group__3__Impl rule__CompositeManufacturingStep__Group__4 )
            // InternalMSDsl.g:5771:2: rule__CompositeManufacturingStep__Group__3__Impl rule__CompositeManufacturingStep__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__CompositeManufacturingStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__4();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__3"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__3__Impl"
    // InternalMSDsl.g:5778:1: rule__CompositeManufacturingStep__Group__3__Impl : ( ( rule__CompositeManufacturingStep__Group_3__0 )? ) ;
    public final void rule__CompositeManufacturingStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5782:1: ( ( ( rule__CompositeManufacturingStep__Group_3__0 )? ) )
            // InternalMSDsl.g:5783:1: ( ( rule__CompositeManufacturingStep__Group_3__0 )? )
            {
            // InternalMSDsl.g:5783:1: ( ( rule__CompositeManufacturingStep__Group_3__0 )? )
            // InternalMSDsl.g:5784:2: ( rule__CompositeManufacturingStep__Group_3__0 )?
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_3()); 
            // InternalMSDsl.g:5785:2: ( rule__CompositeManufacturingStep__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMSDsl.g:5785:3: rule__CompositeManufacturingStep__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeManufacturingStep__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__3__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__4"
    // InternalMSDsl.g:5793:1: rule__CompositeManufacturingStep__Group__4 : rule__CompositeManufacturingStep__Group__4__Impl rule__CompositeManufacturingStep__Group__5 ;
    public final void rule__CompositeManufacturingStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5797:1: ( rule__CompositeManufacturingStep__Group__4__Impl rule__CompositeManufacturingStep__Group__5 )
            // InternalMSDsl.g:5798:2: rule__CompositeManufacturingStep__Group__4__Impl rule__CompositeManufacturingStep__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__CompositeManufacturingStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__5();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__4"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__4__Impl"
    // InternalMSDsl.g:5805:1: rule__CompositeManufacturingStep__Group__4__Impl : ( ( rule__CompositeManufacturingStep__Group_4__0 )? ) ;
    public final void rule__CompositeManufacturingStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5809:1: ( ( ( rule__CompositeManufacturingStep__Group_4__0 )? ) )
            // InternalMSDsl.g:5810:1: ( ( rule__CompositeManufacturingStep__Group_4__0 )? )
            {
            // InternalMSDsl.g:5810:1: ( ( rule__CompositeManufacturingStep__Group_4__0 )? )
            // InternalMSDsl.g:5811:2: ( rule__CompositeManufacturingStep__Group_4__0 )?
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_4()); 
            // InternalMSDsl.g:5812:2: ( rule__CompositeManufacturingStep__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMSDsl.g:5812:3: rule__CompositeManufacturingStep__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeManufacturingStep__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__4__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__5"
    // InternalMSDsl.g:5820:1: rule__CompositeManufacturingStep__Group__5 : rule__CompositeManufacturingStep__Group__5__Impl rule__CompositeManufacturingStep__Group__6 ;
    public final void rule__CompositeManufacturingStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5824:1: ( rule__CompositeManufacturingStep__Group__5__Impl rule__CompositeManufacturingStep__Group__6 )
            // InternalMSDsl.g:5825:2: rule__CompositeManufacturingStep__Group__5__Impl rule__CompositeManufacturingStep__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__CompositeManufacturingStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__6();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__5"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__5__Impl"
    // InternalMSDsl.g:5832:1: rule__CompositeManufacturingStep__Group__5__Impl : ( ( rule__CompositeManufacturingStep__Group_5__0 )? ) ;
    public final void rule__CompositeManufacturingStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5836:1: ( ( ( rule__CompositeManufacturingStep__Group_5__0 )? ) )
            // InternalMSDsl.g:5837:1: ( ( rule__CompositeManufacturingStep__Group_5__0 )? )
            {
            // InternalMSDsl.g:5837:1: ( ( rule__CompositeManufacturingStep__Group_5__0 )? )
            // InternalMSDsl.g:5838:2: ( rule__CompositeManufacturingStep__Group_5__0 )?
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_5()); 
            // InternalMSDsl.g:5839:2: ( rule__CompositeManufacturingStep__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==22) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMSDsl.g:5839:3: rule__CompositeManufacturingStep__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeManufacturingStep__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__5__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__6"
    // InternalMSDsl.g:5847:1: rule__CompositeManufacturingStep__Group__6 : rule__CompositeManufacturingStep__Group__6__Impl rule__CompositeManufacturingStep__Group__7 ;
    public final void rule__CompositeManufacturingStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5851:1: ( rule__CompositeManufacturingStep__Group__6__Impl rule__CompositeManufacturingStep__Group__7 )
            // InternalMSDsl.g:5852:2: rule__CompositeManufacturingStep__Group__6__Impl rule__CompositeManufacturingStep__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__CompositeManufacturingStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__7();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__6"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__6__Impl"
    // InternalMSDsl.g:5859:1: rule__CompositeManufacturingStep__Group__6__Impl : ( 'inputConditions' ) ;
    public final void rule__CompositeManufacturingStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5863:1: ( ( 'inputConditions' ) )
            // InternalMSDsl.g:5864:1: ( 'inputConditions' )
            {
            // InternalMSDsl.g:5864:1: ( 'inputConditions' )
            // InternalMSDsl.g:5865:2: 'inputConditions'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputConditionsKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getInputConditionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__6__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__7"
    // InternalMSDsl.g:5874:1: rule__CompositeManufacturingStep__Group__7 : rule__CompositeManufacturingStep__Group__7__Impl rule__CompositeManufacturingStep__Group__8 ;
    public final void rule__CompositeManufacturingStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5878:1: ( rule__CompositeManufacturingStep__Group__7__Impl rule__CompositeManufacturingStep__Group__8 )
            // InternalMSDsl.g:5879:2: rule__CompositeManufacturingStep__Group__7__Impl rule__CompositeManufacturingStep__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__CompositeManufacturingStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__8();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__7"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__7__Impl"
    // InternalMSDsl.g:5886:1: rule__CompositeManufacturingStep__Group__7__Impl : ( '{' ) ;
    public final void rule__CompositeManufacturingStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5890:1: ( ( '{' ) )
            // InternalMSDsl.g:5891:1: ( '{' )
            {
            // InternalMSDsl.g:5891:1: ( '{' )
            // InternalMSDsl.g:5892:2: '{'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__7__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__8"
    // InternalMSDsl.g:5901:1: rule__CompositeManufacturingStep__Group__8 : rule__CompositeManufacturingStep__Group__8__Impl rule__CompositeManufacturingStep__Group__9 ;
    public final void rule__CompositeManufacturingStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5905:1: ( rule__CompositeManufacturingStep__Group__8__Impl rule__CompositeManufacturingStep__Group__9 )
            // InternalMSDsl.g:5906:2: rule__CompositeManufacturingStep__Group__8__Impl rule__CompositeManufacturingStep__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__CompositeManufacturingStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__9();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__8"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__8__Impl"
    // InternalMSDsl.g:5913:1: rule__CompositeManufacturingStep__Group__8__Impl : ( ( rule__CompositeManufacturingStep__InputAssignment_8 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5917:1: ( ( ( rule__CompositeManufacturingStep__InputAssignment_8 ) ) )
            // InternalMSDsl.g:5918:1: ( ( rule__CompositeManufacturingStep__InputAssignment_8 ) )
            {
            // InternalMSDsl.g:5918:1: ( ( rule__CompositeManufacturingStep__InputAssignment_8 ) )
            // InternalMSDsl.g:5919:2: ( rule__CompositeManufacturingStep__InputAssignment_8 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputAssignment_8()); 
            // InternalMSDsl.g:5920:2: ( rule__CompositeManufacturingStep__InputAssignment_8 )
            // InternalMSDsl.g:5920:3: rule__CompositeManufacturingStep__InputAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__InputAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getInputAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__8__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__9"
    // InternalMSDsl.g:5928:1: rule__CompositeManufacturingStep__Group__9 : rule__CompositeManufacturingStep__Group__9__Impl rule__CompositeManufacturingStep__Group__10 ;
    public final void rule__CompositeManufacturingStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5932:1: ( rule__CompositeManufacturingStep__Group__9__Impl rule__CompositeManufacturingStep__Group__10 )
            // InternalMSDsl.g:5933:2: rule__CompositeManufacturingStep__Group__9__Impl rule__CompositeManufacturingStep__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__CompositeManufacturingStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__10();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__9"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__9__Impl"
    // InternalMSDsl.g:5940:1: rule__CompositeManufacturingStep__Group__9__Impl : ( ( rule__CompositeManufacturingStep__Group_9__0 )* ) ;
    public final void rule__CompositeManufacturingStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5944:1: ( ( ( rule__CompositeManufacturingStep__Group_9__0 )* ) )
            // InternalMSDsl.g:5945:1: ( ( rule__CompositeManufacturingStep__Group_9__0 )* )
            {
            // InternalMSDsl.g:5945:1: ( ( rule__CompositeManufacturingStep__Group_9__0 )* )
            // InternalMSDsl.g:5946:2: ( rule__CompositeManufacturingStep__Group_9__0 )*
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_9()); 
            // InternalMSDsl.g:5947:2: ( rule__CompositeManufacturingStep__Group_9__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==21) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMSDsl.g:5947:3: rule__CompositeManufacturingStep__Group_9__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeManufacturingStep__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__9__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__10"
    // InternalMSDsl.g:5955:1: rule__CompositeManufacturingStep__Group__10 : rule__CompositeManufacturingStep__Group__10__Impl rule__CompositeManufacturingStep__Group__11 ;
    public final void rule__CompositeManufacturingStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5959:1: ( rule__CompositeManufacturingStep__Group__10__Impl rule__CompositeManufacturingStep__Group__11 )
            // InternalMSDsl.g:5960:2: rule__CompositeManufacturingStep__Group__10__Impl rule__CompositeManufacturingStep__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__CompositeManufacturingStep__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__11();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__10"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__10__Impl"
    // InternalMSDsl.g:5967:1: rule__CompositeManufacturingStep__Group__10__Impl : ( '}' ) ;
    public final void rule__CompositeManufacturingStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5971:1: ( ( '}' ) )
            // InternalMSDsl.g:5972:1: ( '}' )
            {
            // InternalMSDsl.g:5972:1: ( '}' )
            // InternalMSDsl.g:5973:2: '}'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__10__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__11"
    // InternalMSDsl.g:5982:1: rule__CompositeManufacturingStep__Group__11 : rule__CompositeManufacturingStep__Group__11__Impl rule__CompositeManufacturingStep__Group__12 ;
    public final void rule__CompositeManufacturingStep__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5986:1: ( rule__CompositeManufacturingStep__Group__11__Impl rule__CompositeManufacturingStep__Group__12 )
            // InternalMSDsl.g:5987:2: rule__CompositeManufacturingStep__Group__11__Impl rule__CompositeManufacturingStep__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__CompositeManufacturingStep__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__12();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__11"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__11__Impl"
    // InternalMSDsl.g:5994:1: rule__CompositeManufacturingStep__Group__11__Impl : ( 'transforms' ) ;
    public final void rule__CompositeManufacturingStep__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:5998:1: ( ( 'transforms' ) )
            // InternalMSDsl.g:5999:1: ( 'transforms' )
            {
            // InternalMSDsl.g:5999:1: ( 'transforms' )
            // InternalMSDsl.g:6000:2: 'transforms'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransformsKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getTransformsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__11__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__12"
    // InternalMSDsl.g:6009:1: rule__CompositeManufacturingStep__Group__12 : rule__CompositeManufacturingStep__Group__12__Impl rule__CompositeManufacturingStep__Group__13 ;
    public final void rule__CompositeManufacturingStep__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6013:1: ( rule__CompositeManufacturingStep__Group__12__Impl rule__CompositeManufacturingStep__Group__13 )
            // InternalMSDsl.g:6014:2: rule__CompositeManufacturingStep__Group__12__Impl rule__CompositeManufacturingStep__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__CompositeManufacturingStep__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__13();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__12"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__12__Impl"
    // InternalMSDsl.g:6021:1: rule__CompositeManufacturingStep__Group__12__Impl : ( '{' ) ;
    public final void rule__CompositeManufacturingStep__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6025:1: ( ( '{' ) )
            // InternalMSDsl.g:6026:1: ( '{' )
            {
            // InternalMSDsl.g:6026:1: ( '{' )
            // InternalMSDsl.g:6027:2: '{'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__12__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__13"
    // InternalMSDsl.g:6036:1: rule__CompositeManufacturingStep__Group__13 : rule__CompositeManufacturingStep__Group__13__Impl rule__CompositeManufacturingStep__Group__14 ;
    public final void rule__CompositeManufacturingStep__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6040:1: ( rule__CompositeManufacturingStep__Group__13__Impl rule__CompositeManufacturingStep__Group__14 )
            // InternalMSDsl.g:6041:2: rule__CompositeManufacturingStep__Group__13__Impl rule__CompositeManufacturingStep__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__CompositeManufacturingStep__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__14();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__13"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__13__Impl"
    // InternalMSDsl.g:6048:1: rule__CompositeManufacturingStep__Group__13__Impl : ( ( rule__CompositeManufacturingStep__OutputAssignment_13 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6052:1: ( ( ( rule__CompositeManufacturingStep__OutputAssignment_13 ) ) )
            // InternalMSDsl.g:6053:1: ( ( rule__CompositeManufacturingStep__OutputAssignment_13 ) )
            {
            // InternalMSDsl.g:6053:1: ( ( rule__CompositeManufacturingStep__OutputAssignment_13 ) )
            // InternalMSDsl.g:6054:2: ( rule__CompositeManufacturingStep__OutputAssignment_13 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputAssignment_13()); 
            // InternalMSDsl.g:6055:2: ( rule__CompositeManufacturingStep__OutputAssignment_13 )
            // InternalMSDsl.g:6055:3: rule__CompositeManufacturingStep__OutputAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__OutputAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__13__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__14"
    // InternalMSDsl.g:6063:1: rule__CompositeManufacturingStep__Group__14 : rule__CompositeManufacturingStep__Group__14__Impl rule__CompositeManufacturingStep__Group__15 ;
    public final void rule__CompositeManufacturingStep__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6067:1: ( rule__CompositeManufacturingStep__Group__14__Impl rule__CompositeManufacturingStep__Group__15 )
            // InternalMSDsl.g:6068:2: rule__CompositeManufacturingStep__Group__14__Impl rule__CompositeManufacturingStep__Group__15
            {
            pushFollow(FOLLOW_25);
            rule__CompositeManufacturingStep__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__15();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__14"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__14__Impl"
    // InternalMSDsl.g:6075:1: rule__CompositeManufacturingStep__Group__14__Impl : ( ( rule__CompositeManufacturingStep__Group_14__0 )* ) ;
    public final void rule__CompositeManufacturingStep__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6079:1: ( ( ( rule__CompositeManufacturingStep__Group_14__0 )* ) )
            // InternalMSDsl.g:6080:1: ( ( rule__CompositeManufacturingStep__Group_14__0 )* )
            {
            // InternalMSDsl.g:6080:1: ( ( rule__CompositeManufacturingStep__Group_14__0 )* )
            // InternalMSDsl.g:6081:2: ( rule__CompositeManufacturingStep__Group_14__0 )*
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_14()); 
            // InternalMSDsl.g:6082:2: ( rule__CompositeManufacturingStep__Group_14__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==12) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMSDsl.g:6082:3: rule__CompositeManufacturingStep__Group_14__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__CompositeManufacturingStep__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__14__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__15"
    // InternalMSDsl.g:6090:1: rule__CompositeManufacturingStep__Group__15 : rule__CompositeManufacturingStep__Group__15__Impl rule__CompositeManufacturingStep__Group__16 ;
    public final void rule__CompositeManufacturingStep__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6094:1: ( rule__CompositeManufacturingStep__Group__15__Impl rule__CompositeManufacturingStep__Group__16 )
            // InternalMSDsl.g:6095:2: rule__CompositeManufacturingStep__Group__15__Impl rule__CompositeManufacturingStep__Group__16
            {
            pushFollow(FOLLOW_31);
            rule__CompositeManufacturingStep__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__16();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__15"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__15__Impl"
    // InternalMSDsl.g:6102:1: rule__CompositeManufacturingStep__Group__15__Impl : ( '}' ) ;
    public final void rule__CompositeManufacturingStep__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6106:1: ( ( '}' ) )
            // InternalMSDsl.g:6107:1: ( '}' )
            {
            // InternalMSDsl.g:6107:1: ( '}' )
            // InternalMSDsl.g:6108:2: '}'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_15()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__15__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__16"
    // InternalMSDsl.g:6117:1: rule__CompositeManufacturingStep__Group__16 : rule__CompositeManufacturingStep__Group__16__Impl rule__CompositeManufacturingStep__Group__17 ;
    public final void rule__CompositeManufacturingStep__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6121:1: ( rule__CompositeManufacturingStep__Group__16__Impl rule__CompositeManufacturingStep__Group__17 )
            // InternalMSDsl.g:6122:2: rule__CompositeManufacturingStep__Group__16__Impl rule__CompositeManufacturingStep__Group__17
            {
            pushFollow(FOLLOW_32);
            rule__CompositeManufacturingStep__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__17();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__16"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__16__Impl"
    // InternalMSDsl.g:6129:1: rule__CompositeManufacturingStep__Group__16__Impl : ( 'contains' ) ;
    public final void rule__CompositeManufacturingStep__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6133:1: ( ( 'contains' ) )
            // InternalMSDsl.g:6134:1: ( 'contains' )
            {
            // InternalMSDsl.g:6134:1: ( 'contains' )
            // InternalMSDsl.g:6135:2: 'contains'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getContainsKeyword_16()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getContainsKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__16__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__17"
    // InternalMSDsl.g:6144:1: rule__CompositeManufacturingStep__Group__17 : rule__CompositeManufacturingStep__Group__17__Impl rule__CompositeManufacturingStep__Group__18 ;
    public final void rule__CompositeManufacturingStep__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6148:1: ( rule__CompositeManufacturingStep__Group__17__Impl rule__CompositeManufacturingStep__Group__18 )
            // InternalMSDsl.g:6149:2: rule__CompositeManufacturingStep__Group__17__Impl rule__CompositeManufacturingStep__Group__18
            {
            pushFollow(FOLLOW_27);
            rule__CompositeManufacturingStep__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__18();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__17"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__17__Impl"
    // InternalMSDsl.g:6156:1: rule__CompositeManufacturingStep__Group__17__Impl : ( ( rule__CompositeManufacturingStep__ContainsAssignment_17 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6160:1: ( ( ( rule__CompositeManufacturingStep__ContainsAssignment_17 ) ) )
            // InternalMSDsl.g:6161:1: ( ( rule__CompositeManufacturingStep__ContainsAssignment_17 ) )
            {
            // InternalMSDsl.g:6161:1: ( ( rule__CompositeManufacturingStep__ContainsAssignment_17 ) )
            // InternalMSDsl.g:6162:2: ( rule__CompositeManufacturingStep__ContainsAssignment_17 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getContainsAssignment_17()); 
            // InternalMSDsl.g:6163:2: ( rule__CompositeManufacturingStep__ContainsAssignment_17 )
            // InternalMSDsl.g:6163:3: rule__CompositeManufacturingStep__ContainsAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__ContainsAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getContainsAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__17__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__18"
    // InternalMSDsl.g:6171:1: rule__CompositeManufacturingStep__Group__18 : rule__CompositeManufacturingStep__Group__18__Impl ;
    public final void rule__CompositeManufacturingStep__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6175:1: ( rule__CompositeManufacturingStep__Group__18__Impl )
            // InternalMSDsl.g:6176:2: rule__CompositeManufacturingStep__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__18__Impl();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group__18"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__18__Impl"
    // InternalMSDsl.g:6182:1: rule__CompositeManufacturingStep__Group__18__Impl : ( '}' ) ;
    public final void rule__CompositeManufacturingStep__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6186:1: ( ( '}' ) )
            // InternalMSDsl.g:6187:1: ( '}' )
            {
            // InternalMSDsl.g:6187:1: ( '}' )
            // InternalMSDsl.g:6188:2: '}'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_18()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__18__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_3__0"
    // InternalMSDsl.g:6198:1: rule__CompositeManufacturingStep__Group_3__0 : rule__CompositeManufacturingStep__Group_3__0__Impl rule__CompositeManufacturingStep__Group_3__1 ;
    public final void rule__CompositeManufacturingStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6202:1: ( rule__CompositeManufacturingStep__Group_3__0__Impl rule__CompositeManufacturingStep__Group_3__1 )
            // InternalMSDsl.g:6203:2: rule__CompositeManufacturingStep__Group_3__0__Impl rule__CompositeManufacturingStep__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__CompositeManufacturingStep__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_3__1();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_3__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_3__0__Impl"
    // InternalMSDsl.g:6210:1: rule__CompositeManufacturingStep__Group_3__0__Impl : ( 'speed' ) ;
    public final void rule__CompositeManufacturingStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6214:1: ( ( 'speed' ) )
            // InternalMSDsl.g:6215:1: ( 'speed' )
            {
            // InternalMSDsl.g:6215:1: ( 'speed' )
            // InternalMSDsl.g:6216:2: 'speed'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getSpeedKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getSpeedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_3__1"
    // InternalMSDsl.g:6225:1: rule__CompositeManufacturingStep__Group_3__1 : rule__CompositeManufacturingStep__Group_3__1__Impl ;
    public final void rule__CompositeManufacturingStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6229:1: ( rule__CompositeManufacturingStep__Group_3__1__Impl )
            // InternalMSDsl.g:6230:2: rule__CompositeManufacturingStep__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_3__1__Impl();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_3__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_3__1__Impl"
    // InternalMSDsl.g:6236:1: rule__CompositeManufacturingStep__Group_3__1__Impl : ( ( rule__CompositeManufacturingStep__SpeedAssignment_3_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6240:1: ( ( ( rule__CompositeManufacturingStep__SpeedAssignment_3_1 ) ) )
            // InternalMSDsl.g:6241:1: ( ( rule__CompositeManufacturingStep__SpeedAssignment_3_1 ) )
            {
            // InternalMSDsl.g:6241:1: ( ( rule__CompositeManufacturingStep__SpeedAssignment_3_1 ) )
            // InternalMSDsl.g:6242:2: ( rule__CompositeManufacturingStep__SpeedAssignment_3_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getSpeedAssignment_3_1()); 
            // InternalMSDsl.g:6243:2: ( rule__CompositeManufacturingStep__SpeedAssignment_3_1 )
            // InternalMSDsl.g:6243:3: rule__CompositeManufacturingStep__SpeedAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__SpeedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getSpeedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4__0"
    // InternalMSDsl.g:6252:1: rule__CompositeManufacturingStep__Group_4__0 : rule__CompositeManufacturingStep__Group_4__0__Impl rule__CompositeManufacturingStep__Group_4__1 ;
    public final void rule__CompositeManufacturingStep__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6256:1: ( rule__CompositeManufacturingStep__Group_4__0__Impl rule__CompositeManufacturingStep__Group_4__1 )
            // InternalMSDsl.g:6257:2: rule__CompositeManufacturingStep__Group_4__0__Impl rule__CompositeManufacturingStep__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeManufacturingStep__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_4__1();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4__0__Impl"
    // InternalMSDsl.g:6264:1: rule__CompositeManufacturingStep__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__CompositeManufacturingStep__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6268:1: ( ( 'transition' ) )
            // InternalMSDsl.g:6269:1: ( 'transition' )
            {
            // InternalMSDsl.g:6269:1: ( 'transition' )
            // InternalMSDsl.g:6270:2: 'transition'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4__1"
    // InternalMSDsl.g:6279:1: rule__CompositeManufacturingStep__Group_4__1 : rule__CompositeManufacturingStep__Group_4__1__Impl rule__CompositeManufacturingStep__Group_4__2 ;
    public final void rule__CompositeManufacturingStep__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6283:1: ( rule__CompositeManufacturingStep__Group_4__1__Impl rule__CompositeManufacturingStep__Group_4__2 )
            // InternalMSDsl.g:6284:2: rule__CompositeManufacturingStep__Group_4__1__Impl rule__CompositeManufacturingStep__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__CompositeManufacturingStep__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_4__2();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4__1__Impl"
    // InternalMSDsl.g:6291:1: rule__CompositeManufacturingStep__Group_4__1__Impl : ( ( rule__CompositeManufacturingStep__TransitionAssignment_4_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6295:1: ( ( ( rule__CompositeManufacturingStep__TransitionAssignment_4_1 ) ) )
            // InternalMSDsl.g:6296:1: ( ( rule__CompositeManufacturingStep__TransitionAssignment_4_1 ) )
            {
            // InternalMSDsl.g:6296:1: ( ( rule__CompositeManufacturingStep__TransitionAssignment_4_1 ) )
            // InternalMSDsl.g:6297:2: ( rule__CompositeManufacturingStep__TransitionAssignment_4_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionAssignment_4_1()); 
            // InternalMSDsl.g:6298:2: ( rule__CompositeManufacturingStep__TransitionAssignment_4_1 )
            // InternalMSDsl.g:6298:3: rule__CompositeManufacturingStep__TransitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__TransitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4__2"
    // InternalMSDsl.g:6306:1: rule__CompositeManufacturingStep__Group_4__2 : rule__CompositeManufacturingStep__Group_4__2__Impl ;
    public final void rule__CompositeManufacturingStep__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6310:1: ( rule__CompositeManufacturingStep__Group_4__2__Impl )
            // InternalMSDsl.g:6311:2: rule__CompositeManufacturingStep__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_4__2__Impl();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4__2"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4__2__Impl"
    // InternalMSDsl.g:6317:1: rule__CompositeManufacturingStep__Group_4__2__Impl : ( ( rule__CompositeManufacturingStep__Group_4_2__0 )* ) ;
    public final void rule__CompositeManufacturingStep__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6321:1: ( ( ( rule__CompositeManufacturingStep__Group_4_2__0 )* ) )
            // InternalMSDsl.g:6322:1: ( ( rule__CompositeManufacturingStep__Group_4_2__0 )* )
            {
            // InternalMSDsl.g:6322:1: ( ( rule__CompositeManufacturingStep__Group_4_2__0 )* )
            // InternalMSDsl.g:6323:2: ( rule__CompositeManufacturingStep__Group_4_2__0 )*
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_4_2()); 
            // InternalMSDsl.g:6324:2: ( rule__CompositeManufacturingStep__Group_4_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==21) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMSDsl.g:6324:3: rule__CompositeManufacturingStep__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeManufacturingStep__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4__2__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4_2__0"
    // InternalMSDsl.g:6333:1: rule__CompositeManufacturingStep__Group_4_2__0 : rule__CompositeManufacturingStep__Group_4_2__0__Impl rule__CompositeManufacturingStep__Group_4_2__1 ;
    public final void rule__CompositeManufacturingStep__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6337:1: ( rule__CompositeManufacturingStep__Group_4_2__0__Impl rule__CompositeManufacturingStep__Group_4_2__1 )
            // InternalMSDsl.g:6338:2: rule__CompositeManufacturingStep__Group_4_2__0__Impl rule__CompositeManufacturingStep__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeManufacturingStep__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_4_2__1();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4_2__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4_2__0__Impl"
    // InternalMSDsl.g:6345:1: rule__CompositeManufacturingStep__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeManufacturingStep__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6349:1: ( ( ',' ) )
            // InternalMSDsl.g:6350:1: ( ',' )
            {
            // InternalMSDsl.g:6350:1: ( ',' )
            // InternalMSDsl.g:6351:2: ','
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4_2__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4_2__1"
    // InternalMSDsl.g:6360:1: rule__CompositeManufacturingStep__Group_4_2__1 : rule__CompositeManufacturingStep__Group_4_2__1__Impl ;
    public final void rule__CompositeManufacturingStep__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6364:1: ( rule__CompositeManufacturingStep__Group_4_2__1__Impl )
            // InternalMSDsl.g:6365:2: rule__CompositeManufacturingStep__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4_2__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_4_2__1__Impl"
    // InternalMSDsl.g:6371:1: rule__CompositeManufacturingStep__Group_4_2__1__Impl : ( ( rule__CompositeManufacturingStep__TransitionAssignment_4_2_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6375:1: ( ( ( rule__CompositeManufacturingStep__TransitionAssignment_4_2_1 ) ) )
            // InternalMSDsl.g:6376:1: ( ( rule__CompositeManufacturingStep__TransitionAssignment_4_2_1 ) )
            {
            // InternalMSDsl.g:6376:1: ( ( rule__CompositeManufacturingStep__TransitionAssignment_4_2_1 ) )
            // InternalMSDsl.g:6377:2: ( rule__CompositeManufacturingStep__TransitionAssignment_4_2_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionAssignment_4_2_1()); 
            // InternalMSDsl.g:6378:2: ( rule__CompositeManufacturingStep__TransitionAssignment_4_2_1 )
            // InternalMSDsl.g:6378:3: rule__CompositeManufacturingStep__TransitionAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__TransitionAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_4_2__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_5__0"
    // InternalMSDsl.g:6387:1: rule__CompositeManufacturingStep__Group_5__0 : rule__CompositeManufacturingStep__Group_5__0__Impl rule__CompositeManufacturingStep__Group_5__1 ;
    public final void rule__CompositeManufacturingStep__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6391:1: ( rule__CompositeManufacturingStep__Group_5__0__Impl rule__CompositeManufacturingStep__Group_5__1 )
            // InternalMSDsl.g:6392:2: rule__CompositeManufacturingStep__Group_5__0__Impl rule__CompositeManufacturingStep__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeManufacturingStep__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_5__1();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_5__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_5__0__Impl"
    // InternalMSDsl.g:6399:1: rule__CompositeManufacturingStep__Group_5__0__Impl : ( 'responsible' ) ;
    public final void rule__CompositeManufacturingStep__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6403:1: ( ( 'responsible' ) )
            // InternalMSDsl.g:6404:1: ( 'responsible' )
            {
            // InternalMSDsl.g:6404:1: ( 'responsible' )
            // InternalMSDsl.g:6405:2: 'responsible'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_5__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_5__1"
    // InternalMSDsl.g:6414:1: rule__CompositeManufacturingStep__Group_5__1 : rule__CompositeManufacturingStep__Group_5__1__Impl ;
    public final void rule__CompositeManufacturingStep__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6418:1: ( rule__CompositeManufacturingStep__Group_5__1__Impl )
            // InternalMSDsl.g:6419:2: rule__CompositeManufacturingStep__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_5__1__Impl();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_5__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_5__1__Impl"
    // InternalMSDsl.g:6425:1: rule__CompositeManufacturingStep__Group_5__1__Impl : ( ( rule__CompositeManufacturingStep__ResponsibleAssignment_5_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6429:1: ( ( ( rule__CompositeManufacturingStep__ResponsibleAssignment_5_1 ) ) )
            // InternalMSDsl.g:6430:1: ( ( rule__CompositeManufacturingStep__ResponsibleAssignment_5_1 ) )
            {
            // InternalMSDsl.g:6430:1: ( ( rule__CompositeManufacturingStep__ResponsibleAssignment_5_1 ) )
            // InternalMSDsl.g:6431:2: ( rule__CompositeManufacturingStep__ResponsibleAssignment_5_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleAssignment_5_1()); 
            // InternalMSDsl.g:6432:2: ( rule__CompositeManufacturingStep__ResponsibleAssignment_5_1 )
            // InternalMSDsl.g:6432:3: rule__CompositeManufacturingStep__ResponsibleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__ResponsibleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_5__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_9__0"
    // InternalMSDsl.g:6441:1: rule__CompositeManufacturingStep__Group_9__0 : rule__CompositeManufacturingStep__Group_9__0__Impl rule__CompositeManufacturingStep__Group_9__1 ;
    public final void rule__CompositeManufacturingStep__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6445:1: ( rule__CompositeManufacturingStep__Group_9__0__Impl rule__CompositeManufacturingStep__Group_9__1 )
            // InternalMSDsl.g:6446:2: rule__CompositeManufacturingStep__Group_9__0__Impl rule__CompositeManufacturingStep__Group_9__1
            {
            pushFollow(FOLLOW_23);
            rule__CompositeManufacturingStep__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_9__1();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_9__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_9__0__Impl"
    // InternalMSDsl.g:6453:1: rule__CompositeManufacturingStep__Group_9__0__Impl : ( ',' ) ;
    public final void rule__CompositeManufacturingStep__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6457:1: ( ( ',' ) )
            // InternalMSDsl.g:6458:1: ( ',' )
            {
            // InternalMSDsl.g:6458:1: ( ',' )
            // InternalMSDsl.g:6459:2: ','
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_9__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_9__1"
    // InternalMSDsl.g:6468:1: rule__CompositeManufacturingStep__Group_9__1 : rule__CompositeManufacturingStep__Group_9__1__Impl ;
    public final void rule__CompositeManufacturingStep__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6472:1: ( rule__CompositeManufacturingStep__Group_9__1__Impl )
            // InternalMSDsl.g:6473:2: rule__CompositeManufacturingStep__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_9__1__Impl();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_9__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_9__1__Impl"
    // InternalMSDsl.g:6479:1: rule__CompositeManufacturingStep__Group_9__1__Impl : ( ( rule__CompositeManufacturingStep__InputAssignment_9_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6483:1: ( ( ( rule__CompositeManufacturingStep__InputAssignment_9_1 ) ) )
            // InternalMSDsl.g:6484:1: ( ( rule__CompositeManufacturingStep__InputAssignment_9_1 ) )
            {
            // InternalMSDsl.g:6484:1: ( ( rule__CompositeManufacturingStep__InputAssignment_9_1 ) )
            // InternalMSDsl.g:6485:2: ( rule__CompositeManufacturingStep__InputAssignment_9_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputAssignment_9_1()); 
            // InternalMSDsl.g:6486:2: ( rule__CompositeManufacturingStep__InputAssignment_9_1 )
            // InternalMSDsl.g:6486:3: rule__CompositeManufacturingStep__InputAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__InputAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getInputAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_9__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_14__0"
    // InternalMSDsl.g:6495:1: rule__CompositeManufacturingStep__Group_14__0 : rule__CompositeManufacturingStep__Group_14__0__Impl rule__CompositeManufacturingStep__Group_14__1 ;
    public final void rule__CompositeManufacturingStep__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6499:1: ( rule__CompositeManufacturingStep__Group_14__0__Impl rule__CompositeManufacturingStep__Group_14__1 )
            // InternalMSDsl.g:6500:2: rule__CompositeManufacturingStep__Group_14__0__Impl rule__CompositeManufacturingStep__Group_14__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeManufacturingStep__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_14__1();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_14__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_14__0__Impl"
    // InternalMSDsl.g:6507:1: rule__CompositeManufacturingStep__Group_14__0__Impl : ( 'or' ) ;
    public final void rule__CompositeManufacturingStep__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6511:1: ( ( 'or' ) )
            // InternalMSDsl.g:6512:1: ( 'or' )
            {
            // InternalMSDsl.g:6512:1: ( 'or' )
            // InternalMSDsl.g:6513:2: 'or'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOrKeyword_14_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getOrKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_14__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_14__1"
    // InternalMSDsl.g:6522:1: rule__CompositeManufacturingStep__Group_14__1 : rule__CompositeManufacturingStep__Group_14__1__Impl ;
    public final void rule__CompositeManufacturingStep__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6526:1: ( rule__CompositeManufacturingStep__Group_14__1__Impl )
            // InternalMSDsl.g:6527:2: rule__CompositeManufacturingStep__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_14__1__Impl();

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
    // $ANTLR end "rule__CompositeManufacturingStep__Group_14__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_14__1__Impl"
    // InternalMSDsl.g:6533:1: rule__CompositeManufacturingStep__Group_14__1__Impl : ( ( rule__CompositeManufacturingStep__OutputAssignment_14_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6537:1: ( ( ( rule__CompositeManufacturingStep__OutputAssignment_14_1 ) ) )
            // InternalMSDsl.g:6538:1: ( ( rule__CompositeManufacturingStep__OutputAssignment_14_1 ) )
            {
            // InternalMSDsl.g:6538:1: ( ( rule__CompositeManufacturingStep__OutputAssignment_14_1 ) )
            // InternalMSDsl.g:6539:2: ( rule__CompositeManufacturingStep__OutputAssignment_14_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputAssignment_14_1()); 
            // InternalMSDsl.g:6540:2: ( rule__CompositeManufacturingStep__OutputAssignment_14_1 )
            // InternalMSDsl.g:6540:3: rule__CompositeManufacturingStep__OutputAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__OutputAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_14__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMSDsl.g:6549:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6553:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMSDsl.g:6554:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMSDsl.g:6561:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6565:1: ( ( ( '-' )? ) )
            // InternalMSDsl.g:6566:1: ( ( '-' )? )
            {
            // InternalMSDsl.g:6566:1: ( ( '-' )? )
            // InternalMSDsl.g:6567:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMSDsl.g:6568:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==43) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMSDsl.g:6568:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMSDsl.g:6576:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6580:1: ( rule__EInt__Group__1__Impl )
            // InternalMSDsl.g:6581:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMSDsl.g:6587:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6591:1: ( ( RULE_INT ) )
            // InternalMSDsl.g:6592:1: ( RULE_INT )
            {
            // InternalMSDsl.g:6592:1: ( RULE_INT )
            // InternalMSDsl.g:6593:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__InputCondition_Impl__Group__0"
    // InternalMSDsl.g:6603:1: rule__InputCondition_Impl__Group__0 : rule__InputCondition_Impl__Group__0__Impl rule__InputCondition_Impl__Group__1 ;
    public final void rule__InputCondition_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6607:1: ( rule__InputCondition_Impl__Group__0__Impl rule__InputCondition_Impl__Group__1 )
            // InternalMSDsl.g:6608:2: rule__InputCondition_Impl__Group__0__Impl rule__InputCondition_Impl__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__InputCondition_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__Group__1();

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
    // $ANTLR end "rule__InputCondition_Impl__Group__0"


    // $ANTLR start "rule__InputCondition_Impl__Group__0__Impl"
    // InternalMSDsl.g:6615:1: rule__InputCondition_Impl__Group__0__Impl : ( () ) ;
    public final void rule__InputCondition_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6619:1: ( ( () ) )
            // InternalMSDsl.g:6620:1: ( () )
            {
            // InternalMSDsl.g:6620:1: ( () )
            // InternalMSDsl.g:6621:2: ()
            {
             before(grammarAccess.getInputCondition_ImplAccess().getInputConditionAction_0()); 
            // InternalMSDsl.g:6622:2: ()
            // InternalMSDsl.g:6622:3: 
            {
            }

             after(grammarAccess.getInputCondition_ImplAccess().getInputConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__0__Impl"


    // $ANTLR start "rule__InputCondition_Impl__Group__1"
    // InternalMSDsl.g:6630:1: rule__InputCondition_Impl__Group__1 : rule__InputCondition_Impl__Group__1__Impl rule__InputCondition_Impl__Group__2 ;
    public final void rule__InputCondition_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6634:1: ( rule__InputCondition_Impl__Group__1__Impl rule__InputCondition_Impl__Group__2 )
            // InternalMSDsl.g:6635:2: rule__InputCondition_Impl__Group__1__Impl rule__InputCondition_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__InputCondition_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__Group__2();

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
    // $ANTLR end "rule__InputCondition_Impl__Group__1"


    // $ANTLR start "rule__InputCondition_Impl__Group__1__Impl"
    // InternalMSDsl.g:6642:1: rule__InputCondition_Impl__Group__1__Impl : ( 'InputCondition' ) ;
    public final void rule__InputCondition_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6646:1: ( ( 'InputCondition' ) )
            // InternalMSDsl.g:6647:1: ( 'InputCondition' )
            {
            // InternalMSDsl.g:6647:1: ( 'InputCondition' )
            // InternalMSDsl.g:6648:2: 'InputCondition'
            {
             before(grammarAccess.getInputCondition_ImplAccess().getInputConditionKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInputCondition_ImplAccess().getInputConditionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__1__Impl"


    // $ANTLR start "rule__InputCondition_Impl__Group__2"
    // InternalMSDsl.g:6657:1: rule__InputCondition_Impl__Group__2 : rule__InputCondition_Impl__Group__2__Impl ;
    public final void rule__InputCondition_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6661:1: ( rule__InputCondition_Impl__Group__2__Impl )
            // InternalMSDsl.g:6662:2: rule__InputCondition_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__Group__2__Impl();

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
    // $ANTLR end "rule__InputCondition_Impl__Group__2"


    // $ANTLR start "rule__InputCondition_Impl__Group__2__Impl"
    // InternalMSDsl.g:6668:1: rule__InputCondition_Impl__Group__2__Impl : ( ( rule__InputCondition_Impl__NameAssignment_2 ) ) ;
    public final void rule__InputCondition_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6672:1: ( ( ( rule__InputCondition_Impl__NameAssignment_2 ) ) )
            // InternalMSDsl.g:6673:1: ( ( rule__InputCondition_Impl__NameAssignment_2 ) )
            {
            // InternalMSDsl.g:6673:1: ( ( rule__InputCondition_Impl__NameAssignment_2 ) )
            // InternalMSDsl.g:6674:2: ( rule__InputCondition_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getInputCondition_ImplAccess().getNameAssignment_2()); 
            // InternalMSDsl.g:6675:2: ( rule__InputCondition_Impl__NameAssignment_2 )
            // InternalMSDsl.g:6675:3: rule__InputCondition_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputCondition_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__2__Impl"


    // $ANTLR start "rule__OutputDecision__Group__0"
    // InternalMSDsl.g:6684:1: rule__OutputDecision__Group__0 : rule__OutputDecision__Group__0__Impl rule__OutputDecision__Group__1 ;
    public final void rule__OutputDecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6688:1: ( rule__OutputDecision__Group__0__Impl rule__OutputDecision__Group__1 )
            // InternalMSDsl.g:6689:2: rule__OutputDecision__Group__0__Impl rule__OutputDecision__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__OutputDecision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__1();

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
    // $ANTLR end "rule__OutputDecision__Group__0"


    // $ANTLR start "rule__OutputDecision__Group__0__Impl"
    // InternalMSDsl.g:6696:1: rule__OutputDecision__Group__0__Impl : ( ( rule__OutputDecision__InputAssignment_0 ) ) ;
    public final void rule__OutputDecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6700:1: ( ( ( rule__OutputDecision__InputAssignment_0 ) ) )
            // InternalMSDsl.g:6701:1: ( ( rule__OutputDecision__InputAssignment_0 ) )
            {
            // InternalMSDsl.g:6701:1: ( ( rule__OutputDecision__InputAssignment_0 ) )
            // InternalMSDsl.g:6702:2: ( rule__OutputDecision__InputAssignment_0 )
            {
             before(grammarAccess.getOutputDecisionAccess().getInputAssignment_0()); 
            // InternalMSDsl.g:6703:2: ( rule__OutputDecision__InputAssignment_0 )
            // InternalMSDsl.g:6703:3: rule__OutputDecision__InputAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__InputAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputDecisionAccess().getInputAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__0__Impl"


    // $ANTLR start "rule__OutputDecision__Group__1"
    // InternalMSDsl.g:6711:1: rule__OutputDecision__Group__1 : rule__OutputDecision__Group__1__Impl rule__OutputDecision__Group__2 ;
    public final void rule__OutputDecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6715:1: ( rule__OutputDecision__Group__1__Impl rule__OutputDecision__Group__2 )
            // InternalMSDsl.g:6716:2: rule__OutputDecision__Group__1__Impl rule__OutputDecision__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__OutputDecision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__2();

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
    // $ANTLR end "rule__OutputDecision__Group__1"


    // $ANTLR start "rule__OutputDecision__Group__1__Impl"
    // InternalMSDsl.g:6723:1: rule__OutputDecision__Group__1__Impl : ( ( rule__OutputDecision__Group_1__0 )* ) ;
    public final void rule__OutputDecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6727:1: ( ( ( rule__OutputDecision__Group_1__0 )* ) )
            // InternalMSDsl.g:6728:1: ( ( rule__OutputDecision__Group_1__0 )* )
            {
            // InternalMSDsl.g:6728:1: ( ( rule__OutputDecision__Group_1__0 )* )
            // InternalMSDsl.g:6729:2: ( rule__OutputDecision__Group_1__0 )*
            {
             before(grammarAccess.getOutputDecisionAccess().getGroup_1()); 
            // InternalMSDsl.g:6730:2: ( rule__OutputDecision__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==21) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMSDsl.g:6730:3: rule__OutputDecision__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OutputDecision__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getOutputDecisionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__1__Impl"


    // $ANTLR start "rule__OutputDecision__Group__2"
    // InternalMSDsl.g:6738:1: rule__OutputDecision__Group__2 : rule__OutputDecision__Group__2__Impl rule__OutputDecision__Group__3 ;
    public final void rule__OutputDecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6742:1: ( rule__OutputDecision__Group__2__Impl rule__OutputDecision__Group__3 )
            // InternalMSDsl.g:6743:2: rule__OutputDecision__Group__2__Impl rule__OutputDecision__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__OutputDecision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__3();

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
    // $ANTLR end "rule__OutputDecision__Group__2"


    // $ANTLR start "rule__OutputDecision__Group__2__Impl"
    // InternalMSDsl.g:6750:1: rule__OutputDecision__Group__2__Impl : ( 'into' ) ;
    public final void rule__OutputDecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6754:1: ( ( 'into' ) )
            // InternalMSDsl.g:6755:1: ( 'into' )
            {
            // InternalMSDsl.g:6755:1: ( 'into' )
            // InternalMSDsl.g:6756:2: 'into'
            {
             before(grammarAccess.getOutputDecisionAccess().getIntoKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOutputDecisionAccess().getIntoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__2__Impl"


    // $ANTLR start "rule__OutputDecision__Group__3"
    // InternalMSDsl.g:6765:1: rule__OutputDecision__Group__3 : rule__OutputDecision__Group__3__Impl ;
    public final void rule__OutputDecision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6769:1: ( rule__OutputDecision__Group__3__Impl )
            // InternalMSDsl.g:6770:2: rule__OutputDecision__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__3__Impl();

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
    // $ANTLR end "rule__OutputDecision__Group__3"


    // $ANTLR start "rule__OutputDecision__Group__3__Impl"
    // InternalMSDsl.g:6776:1: rule__OutputDecision__Group__3__Impl : ( ( rule__OutputDecision__OutputTypesAssignment_3 )? ) ;
    public final void rule__OutputDecision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6780:1: ( ( ( rule__OutputDecision__OutputTypesAssignment_3 )? ) )
            // InternalMSDsl.g:6781:1: ( ( rule__OutputDecision__OutputTypesAssignment_3 )? )
            {
            // InternalMSDsl.g:6781:1: ( ( rule__OutputDecision__OutputTypesAssignment_3 )? )
            // InternalMSDsl.g:6782:2: ( rule__OutputDecision__OutputTypesAssignment_3 )?
            {
             before(grammarAccess.getOutputDecisionAccess().getOutputTypesAssignment_3()); 
            // InternalMSDsl.g:6783:2: ( rule__OutputDecision__OutputTypesAssignment_3 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMSDsl.g:6783:3: rule__OutputDecision__OutputTypesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputDecision__OutputTypesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputDecisionAccess().getOutputTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__3__Impl"


    // $ANTLR start "rule__OutputDecision__Group_1__0"
    // InternalMSDsl.g:6792:1: rule__OutputDecision__Group_1__0 : rule__OutputDecision__Group_1__0__Impl rule__OutputDecision__Group_1__1 ;
    public final void rule__OutputDecision__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6796:1: ( rule__OutputDecision__Group_1__0__Impl rule__OutputDecision__Group_1__1 )
            // InternalMSDsl.g:6797:2: rule__OutputDecision__Group_1__0__Impl rule__OutputDecision__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__OutputDecision__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group_1__1();

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
    // $ANTLR end "rule__OutputDecision__Group_1__0"


    // $ANTLR start "rule__OutputDecision__Group_1__0__Impl"
    // InternalMSDsl.g:6804:1: rule__OutputDecision__Group_1__0__Impl : ( ',' ) ;
    public final void rule__OutputDecision__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6808:1: ( ( ',' ) )
            // InternalMSDsl.g:6809:1: ( ',' )
            {
            // InternalMSDsl.g:6809:1: ( ',' )
            // InternalMSDsl.g:6810:2: ','
            {
             before(grammarAccess.getOutputDecisionAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOutputDecisionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_1__0__Impl"


    // $ANTLR start "rule__OutputDecision__Group_1__1"
    // InternalMSDsl.g:6819:1: rule__OutputDecision__Group_1__1 : rule__OutputDecision__Group_1__1__Impl ;
    public final void rule__OutputDecision__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6823:1: ( rule__OutputDecision__Group_1__1__Impl )
            // InternalMSDsl.g:6824:2: rule__OutputDecision__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group_1__1__Impl();

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
    // $ANTLR end "rule__OutputDecision__Group_1__1"


    // $ANTLR start "rule__OutputDecision__Group_1__1__Impl"
    // InternalMSDsl.g:6830:1: rule__OutputDecision__Group_1__1__Impl : ( ( rule__OutputDecision__InputAssignment_1_1 ) ) ;
    public final void rule__OutputDecision__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6834:1: ( ( ( rule__OutputDecision__InputAssignment_1_1 ) ) )
            // InternalMSDsl.g:6835:1: ( ( rule__OutputDecision__InputAssignment_1_1 ) )
            {
            // InternalMSDsl.g:6835:1: ( ( rule__OutputDecision__InputAssignment_1_1 ) )
            // InternalMSDsl.g:6836:2: ( rule__OutputDecision__InputAssignment_1_1 )
            {
             before(grammarAccess.getOutputDecisionAccess().getInputAssignment_1_1()); 
            // InternalMSDsl.g:6837:2: ( rule__OutputDecision__InputAssignment_1_1 )
            // InternalMSDsl.g:6837:3: rule__OutputDecision__InputAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__InputAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputDecisionAccess().getInputAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_1__1__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__0"
    // InternalMSDsl.g:6846:1: rule__WorkPieceCondition__Group__0 : rule__WorkPieceCondition__Group__0__Impl rule__WorkPieceCondition__Group__1 ;
    public final void rule__WorkPieceCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6850:1: ( rule__WorkPieceCondition__Group__0__Impl rule__WorkPieceCondition__Group__1 )
            // InternalMSDsl.g:6851:2: rule__WorkPieceCondition__Group__0__Impl rule__WorkPieceCondition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkPieceCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__1();

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
    // $ANTLR end "rule__WorkPieceCondition__Group__0"


    // $ANTLR start "rule__WorkPieceCondition__Group__0__Impl"
    // InternalMSDsl.g:6858:1: rule__WorkPieceCondition__Group__0__Impl : ( 'WorkPieceCondition' ) ;
    public final void rule__WorkPieceCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6862:1: ( ( 'WorkPieceCondition' ) )
            // InternalMSDsl.g:6863:1: ( 'WorkPieceCondition' )
            {
            // InternalMSDsl.g:6863:1: ( 'WorkPieceCondition' )
            // InternalMSDsl.g:6864:2: 'WorkPieceCondition'
            {
             before(grammarAccess.getWorkPieceConditionAccess().getWorkPieceConditionKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getWorkPieceConditionAccess().getWorkPieceConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__0__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__1"
    // InternalMSDsl.g:6873:1: rule__WorkPieceCondition__Group__1 : rule__WorkPieceCondition__Group__1__Impl rule__WorkPieceCondition__Group__2 ;
    public final void rule__WorkPieceCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6877:1: ( rule__WorkPieceCondition__Group__1__Impl rule__WorkPieceCondition__Group__2 )
            // InternalMSDsl.g:6878:2: rule__WorkPieceCondition__Group__1__Impl rule__WorkPieceCondition__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__WorkPieceCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__2();

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
    // $ANTLR end "rule__WorkPieceCondition__Group__1"


    // $ANTLR start "rule__WorkPieceCondition__Group__1__Impl"
    // InternalMSDsl.g:6885:1: rule__WorkPieceCondition__Group__1__Impl : ( ( rule__WorkPieceCondition__NameAssignment_1 ) ) ;
    public final void rule__WorkPieceCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6889:1: ( ( ( rule__WorkPieceCondition__NameAssignment_1 ) ) )
            // InternalMSDsl.g:6890:1: ( ( rule__WorkPieceCondition__NameAssignment_1 ) )
            {
            // InternalMSDsl.g:6890:1: ( ( rule__WorkPieceCondition__NameAssignment_1 ) )
            // InternalMSDsl.g:6891:2: ( rule__WorkPieceCondition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkPieceConditionAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:6892:2: ( rule__WorkPieceCondition__NameAssignment_1 )
            // InternalMSDsl.g:6892:3: rule__WorkPieceCondition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceConditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__1__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__2"
    // InternalMSDsl.g:6900:1: rule__WorkPieceCondition__Group__2 : rule__WorkPieceCondition__Group__2__Impl rule__WorkPieceCondition__Group__3 ;
    public final void rule__WorkPieceCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6904:1: ( rule__WorkPieceCondition__Group__2__Impl rule__WorkPieceCondition__Group__3 )
            // InternalMSDsl.g:6905:2: rule__WorkPieceCondition__Group__2__Impl rule__WorkPieceCondition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__WorkPieceCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__3();

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
    // $ANTLR end "rule__WorkPieceCondition__Group__2"


    // $ANTLR start "rule__WorkPieceCondition__Group__2__Impl"
    // InternalMSDsl.g:6912:1: rule__WorkPieceCondition__Group__2__Impl : ( 'ofType' ) ;
    public final void rule__WorkPieceCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6916:1: ( ( 'ofType' ) )
            // InternalMSDsl.g:6917:1: ( 'ofType' )
            {
            // InternalMSDsl.g:6917:1: ( 'ofType' )
            // InternalMSDsl.g:6918:2: 'ofType'
            {
             before(grammarAccess.getWorkPieceConditionAccess().getOfTypeKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getWorkPieceConditionAccess().getOfTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__2__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__3"
    // InternalMSDsl.g:6927:1: rule__WorkPieceCondition__Group__3 : rule__WorkPieceCondition__Group__3__Impl ;
    public final void rule__WorkPieceCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6931:1: ( rule__WorkPieceCondition__Group__3__Impl )
            // InternalMSDsl.g:6932:2: rule__WorkPieceCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__3__Impl();

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
    // $ANTLR end "rule__WorkPieceCondition__Group__3"


    // $ANTLR start "rule__WorkPieceCondition__Group__3__Impl"
    // InternalMSDsl.g:6938:1: rule__WorkPieceCondition__Group__3__Impl : ( ( rule__WorkPieceCondition__RequiresTypeAssignment_3 ) ) ;
    public final void rule__WorkPieceCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6942:1: ( ( ( rule__WorkPieceCondition__RequiresTypeAssignment_3 ) ) )
            // InternalMSDsl.g:6943:1: ( ( rule__WorkPieceCondition__RequiresTypeAssignment_3 ) )
            {
            // InternalMSDsl.g:6943:1: ( ( rule__WorkPieceCondition__RequiresTypeAssignment_3 ) )
            // InternalMSDsl.g:6944:2: ( rule__WorkPieceCondition__RequiresTypeAssignment_3 )
            {
             before(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeAssignment_3()); 
            // InternalMSDsl.g:6945:2: ( rule__WorkPieceCondition__RequiresTypeAssignment_3 )
            // InternalMSDsl.g:6945:3: rule__WorkPieceCondition__RequiresTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__RequiresTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__3__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__0"
    // InternalMSDsl.g:6954:1: rule__BinaryCondition__Group__0 : rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 ;
    public final void rule__BinaryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6958:1: ( rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 )
            // InternalMSDsl.g:6959:2: rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__BinaryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__1();

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
    // $ANTLR end "rule__BinaryCondition__Group__0"


    // $ANTLR start "rule__BinaryCondition__Group__0__Impl"
    // InternalMSDsl.g:6966:1: rule__BinaryCondition__Group__0__Impl : ( 'BinaryCondition' ) ;
    public final void rule__BinaryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6970:1: ( ( 'BinaryCondition' ) )
            // InternalMSDsl.g:6971:1: ( 'BinaryCondition' )
            {
            // InternalMSDsl.g:6971:1: ( 'BinaryCondition' )
            // InternalMSDsl.g:6972:2: 'BinaryCondition'
            {
             before(grammarAccess.getBinaryConditionAccess().getBinaryConditionKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBinaryConditionAccess().getBinaryConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__0__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__1"
    // InternalMSDsl.g:6981:1: rule__BinaryCondition__Group__1 : rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2 ;
    public final void rule__BinaryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6985:1: ( rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2 )
            // InternalMSDsl.g:6986:2: rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__BinaryCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__2();

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
    // $ANTLR end "rule__BinaryCondition__Group__1"


    // $ANTLR start "rule__BinaryCondition__Group__1__Impl"
    // InternalMSDsl.g:6993:1: rule__BinaryCondition__Group__1__Impl : ( ( rule__BinaryCondition__NameAssignment_1 )? ) ;
    public final void rule__BinaryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:6997:1: ( ( ( rule__BinaryCondition__NameAssignment_1 )? ) )
            // InternalMSDsl.g:6998:1: ( ( rule__BinaryCondition__NameAssignment_1 )? )
            {
            // InternalMSDsl.g:6998:1: ( ( rule__BinaryCondition__NameAssignment_1 )? )
            // InternalMSDsl.g:6999:2: ( rule__BinaryCondition__NameAssignment_1 )?
            {
             before(grammarAccess.getBinaryConditionAccess().getNameAssignment_1()); 
            // InternalMSDsl.g:7000:2: ( rule__BinaryCondition__NameAssignment_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMSDsl.g:7000:3: rule__BinaryCondition__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCondition__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryConditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__1__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__2"
    // InternalMSDsl.g:7008:1: rule__BinaryCondition__Group__2 : rule__BinaryCondition__Group__2__Impl rule__BinaryCondition__Group__3 ;
    public final void rule__BinaryCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7012:1: ( rule__BinaryCondition__Group__2__Impl rule__BinaryCondition__Group__3 )
            // InternalMSDsl.g:7013:2: rule__BinaryCondition__Group__2__Impl rule__BinaryCondition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BinaryCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__3();

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
    // $ANTLR end "rule__BinaryCondition__Group__2"


    // $ANTLR start "rule__BinaryCondition__Group__2__Impl"
    // InternalMSDsl.g:7020:1: rule__BinaryCondition__Group__2__Impl : ( '{' ) ;
    public final void rule__BinaryCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7024:1: ( ( '{' ) )
            // InternalMSDsl.g:7025:1: ( '{' )
            {
            // InternalMSDsl.g:7025:1: ( '{' )
            // InternalMSDsl.g:7026:2: '{'
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBinaryConditionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__2__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__3"
    // InternalMSDsl.g:7035:1: rule__BinaryCondition__Group__3 : rule__BinaryCondition__Group__3__Impl rule__BinaryCondition__Group__4 ;
    public final void rule__BinaryCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7039:1: ( rule__BinaryCondition__Group__3__Impl rule__BinaryCondition__Group__4 )
            // InternalMSDsl.g:7040:2: rule__BinaryCondition__Group__3__Impl rule__BinaryCondition__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__BinaryCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__4();

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
    // $ANTLR end "rule__BinaryCondition__Group__3"


    // $ANTLR start "rule__BinaryCondition__Group__3__Impl"
    // InternalMSDsl.g:7047:1: rule__BinaryCondition__Group__3__Impl : ( ( rule__BinaryCondition__LeftAssignment_3 ) ) ;
    public final void rule__BinaryCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7051:1: ( ( ( rule__BinaryCondition__LeftAssignment_3 ) ) )
            // InternalMSDsl.g:7052:1: ( ( rule__BinaryCondition__LeftAssignment_3 ) )
            {
            // InternalMSDsl.g:7052:1: ( ( rule__BinaryCondition__LeftAssignment_3 ) )
            // InternalMSDsl.g:7053:2: ( rule__BinaryCondition__LeftAssignment_3 )
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftAssignment_3()); 
            // InternalMSDsl.g:7054:2: ( rule__BinaryCondition__LeftAssignment_3 )
            // InternalMSDsl.g:7054:3: rule__BinaryCondition__LeftAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__3__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__4"
    // InternalMSDsl.g:7062:1: rule__BinaryCondition__Group__4 : rule__BinaryCondition__Group__4__Impl rule__BinaryCondition__Group__5 ;
    public final void rule__BinaryCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7066:1: ( rule__BinaryCondition__Group__4__Impl rule__BinaryCondition__Group__5 )
            // InternalMSDsl.g:7067:2: rule__BinaryCondition__Group__4__Impl rule__BinaryCondition__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__BinaryCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__5();

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
    // $ANTLR end "rule__BinaryCondition__Group__4"


    // $ANTLR start "rule__BinaryCondition__Group__4__Impl"
    // InternalMSDsl.g:7074:1: rule__BinaryCondition__Group__4__Impl : ( ( rule__BinaryCondition__TypeAssignment_4 ) ) ;
    public final void rule__BinaryCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7078:1: ( ( ( rule__BinaryCondition__TypeAssignment_4 ) ) )
            // InternalMSDsl.g:7079:1: ( ( rule__BinaryCondition__TypeAssignment_4 ) )
            {
            // InternalMSDsl.g:7079:1: ( ( rule__BinaryCondition__TypeAssignment_4 ) )
            // InternalMSDsl.g:7080:2: ( rule__BinaryCondition__TypeAssignment_4 )
            {
             before(grammarAccess.getBinaryConditionAccess().getTypeAssignment_4()); 
            // InternalMSDsl.g:7081:2: ( rule__BinaryCondition__TypeAssignment_4 )
            // InternalMSDsl.g:7081:3: rule__BinaryCondition__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__4__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__5"
    // InternalMSDsl.g:7089:1: rule__BinaryCondition__Group__5 : rule__BinaryCondition__Group__5__Impl rule__BinaryCondition__Group__6 ;
    public final void rule__BinaryCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7093:1: ( rule__BinaryCondition__Group__5__Impl rule__BinaryCondition__Group__6 )
            // InternalMSDsl.g:7094:2: rule__BinaryCondition__Group__5__Impl rule__BinaryCondition__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__BinaryCondition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__6();

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
    // $ANTLR end "rule__BinaryCondition__Group__5"


    // $ANTLR start "rule__BinaryCondition__Group__5__Impl"
    // InternalMSDsl.g:7101:1: rule__BinaryCondition__Group__5__Impl : ( ( rule__BinaryCondition__RightAssignment_5 ) ) ;
    public final void rule__BinaryCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7105:1: ( ( ( rule__BinaryCondition__RightAssignment_5 ) ) )
            // InternalMSDsl.g:7106:1: ( ( rule__BinaryCondition__RightAssignment_5 ) )
            {
            // InternalMSDsl.g:7106:1: ( ( rule__BinaryCondition__RightAssignment_5 ) )
            // InternalMSDsl.g:7107:2: ( rule__BinaryCondition__RightAssignment_5 )
            {
             before(grammarAccess.getBinaryConditionAccess().getRightAssignment_5()); 
            // InternalMSDsl.g:7108:2: ( rule__BinaryCondition__RightAssignment_5 )
            // InternalMSDsl.g:7108:3: rule__BinaryCondition__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__5__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__6"
    // InternalMSDsl.g:7116:1: rule__BinaryCondition__Group__6 : rule__BinaryCondition__Group__6__Impl ;
    public final void rule__BinaryCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7120:1: ( rule__BinaryCondition__Group__6__Impl )
            // InternalMSDsl.g:7121:2: rule__BinaryCondition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__6__Impl();

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
    // $ANTLR end "rule__BinaryCondition__Group__6"


    // $ANTLR start "rule__BinaryCondition__Group__6__Impl"
    // InternalMSDsl.g:7127:1: rule__BinaryCondition__Group__6__Impl : ( '}' ) ;
    public final void rule__BinaryCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7131:1: ( ( '}' ) )
            // InternalMSDsl.g:7132:1: ( '}' )
            {
            // InternalMSDsl.g:7132:1: ( '}' )
            // InternalMSDsl.g:7133:2: '}'
            {
             before(grammarAccess.getBinaryConditionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBinaryConditionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__6__Impl"


    // $ANTLR start "rule__Negation__Group__0"
    // InternalMSDsl.g:7143:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7147:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // InternalMSDsl.g:7148:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__1();

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
    // $ANTLR end "rule__Negation__Group__0"


    // $ANTLR start "rule__Negation__Group__0__Impl"
    // InternalMSDsl.g:7155:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7159:1: ( ( '!' ) )
            // InternalMSDsl.g:7160:1: ( '!' )
            {
            // InternalMSDsl.g:7160:1: ( '!' )
            // InternalMSDsl.g:7161:2: '!'
            {
             before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0__Impl"


    // $ANTLR start "rule__Negation__Group__1"
    // InternalMSDsl.g:7170:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7174:1: ( rule__Negation__Group__1__Impl )
            // InternalMSDsl.g:7175:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__1__Impl();

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
    // $ANTLR end "rule__Negation__Group__1"


    // $ANTLR start "rule__Negation__Group__1__Impl"
    // InternalMSDsl.g:7181:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__ContainsAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7185:1: ( ( ( rule__Negation__ContainsAssignment_1 ) ) )
            // InternalMSDsl.g:7186:1: ( ( rule__Negation__ContainsAssignment_1 ) )
            {
            // InternalMSDsl.g:7186:1: ( ( rule__Negation__ContainsAssignment_1 ) )
            // InternalMSDsl.g:7187:2: ( rule__Negation__ContainsAssignment_1 )
            {
             before(grammarAccess.getNegationAccess().getContainsAssignment_1()); 
            // InternalMSDsl.g:7188:2: ( rule__Negation__ContainsAssignment_1 )
            // InternalMSDsl.g:7188:3: rule__Negation__ContainsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Negation__ContainsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getContainsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__NameAssignment_1"
    // InternalMSDsl.g:7197:1: rule__ManufacturingSystem__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ManufacturingSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7201:1: ( ( ruleEString ) )
            // InternalMSDsl.g:7202:2: ( ruleEString )
            {
            // InternalMSDsl.g:7202:2: ( ruleEString )
            // InternalMSDsl.g:7203:3: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__NameAssignment_1"


    // $ANTLR start "rule__ManufacturingSystem__StartAssignment_5"
    // InternalMSDsl.g:7212:1: rule__ManufacturingSystem__StartAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7216:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7217:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7217:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7218:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_5_0()); 
            // InternalMSDsl.g:7219:3: ( ruleEString )
            // InternalMSDsl.g:7220:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartStoragePointEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getStartStoragePointEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__StartAssignment_5"


    // $ANTLR start "rule__ManufacturingSystem__StartAssignment_6_1"
    // InternalMSDsl.g:7231:1: rule__ManufacturingSystem__StartAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__StartAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7235:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7236:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7236:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7237:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_6_1_0()); 
            // InternalMSDsl.g:7238:3: ( ruleEString )
            // InternalMSDsl.g:7239:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartStoragePointEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getStartStoragePointEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__StartAssignment_6_1"


    // $ANTLR start "rule__ManufacturingSystem__EndAssignment_10"
    // InternalMSDsl.g:7250:1: rule__ManufacturingSystem__EndAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__EndAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7254:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7255:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7255:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7256:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_10_0()); 
            // InternalMSDsl.g:7257:3: ( ruleEString )
            // InternalMSDsl.g:7258:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndStoragePointEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getEndStoragePointEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__EndAssignment_10"


    // $ANTLR start "rule__ManufacturingSystem__EndAssignment_11_1"
    // InternalMSDsl.g:7269:1: rule__ManufacturingSystem__EndAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__EndAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7273:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7274:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7274:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7275:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_11_1_0()); 
            // InternalMSDsl.g:7276:3: ( ruleEString )
            // InternalMSDsl.g:7277:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndStoragePointEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getEndStoragePointEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__EndAssignment_11_1"


    // $ANTLR start "rule__ManufacturingSystem__ResponsibleAssignment_13_1"
    // InternalMSDsl.g:7288:1: rule__ManufacturingSystem__ResponsibleAssignment_13_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__ResponsibleAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7292:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7293:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7293:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7294:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleCrossReference_13_1_0()); 
            // InternalMSDsl.g:7295:3: ( ruleEString )
            // InternalMSDsl.g:7296:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleEStringParserRuleCall_13_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleEStringParserRuleCall_13_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleCrossReference_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__ResponsibleAssignment_13_1"


    // $ANTLR start "rule__ManufacturingSystem__ConsistsOfAssignment_16"
    // InternalMSDsl.g:7307:1: rule__ManufacturingSystem__ConsistsOfAssignment_16 : ( ruleManufacturingSystemElement ) ;
    public final void rule__ManufacturingSystem__ConsistsOfAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7311:1: ( ( ruleManufacturingSystemElement ) )
            // InternalMSDsl.g:7312:2: ( ruleManufacturingSystemElement )
            {
            // InternalMSDsl.g:7312:2: ( ruleManufacturingSystemElement )
            // InternalMSDsl.g:7313:3: ruleManufacturingSystemElement
            {
             before(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturingSystemElement();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__ConsistsOfAssignment_16"


    // $ANTLR start "rule__ManufacturingSystem__ConsistsOfAssignment_17_1"
    // InternalMSDsl.g:7322:1: rule__ManufacturingSystem__ConsistsOfAssignment_17_1 : ( ruleManufacturingSystemElement ) ;
    public final void rule__ManufacturingSystem__ConsistsOfAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7326:1: ( ( ruleManufacturingSystemElement ) )
            // InternalMSDsl.g:7327:2: ( ruleManufacturingSystemElement )
            {
            // InternalMSDsl.g:7327:2: ( ruleManufacturingSystemElement )
            // InternalMSDsl.g:7328:3: ruleManufacturingSystemElement
            {
             before(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturingSystemElement();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__ConsistsOfAssignment_17_1"


    // $ANTLR start "rule__ManufacturingSystem__UsesAssignment_19_2"
    // InternalMSDsl.g:7337:1: rule__ManufacturingSystem__UsesAssignment_19_2 : ( ruleWorkPieceType ) ;
    public final void rule__ManufacturingSystem__UsesAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7341:1: ( ( ruleWorkPieceType ) )
            // InternalMSDsl.g:7342:2: ( ruleWorkPieceType )
            {
            // InternalMSDsl.g:7342:2: ( ruleWorkPieceType )
            // InternalMSDsl.g:7343:3: ruleWorkPieceType
            {
             before(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_19_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkPieceType();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_19_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__UsesAssignment_19_2"


    // $ANTLR start "rule__ManufacturingSystem__UsesAssignment_19_3_1"
    // InternalMSDsl.g:7352:1: rule__ManufacturingSystem__UsesAssignment_19_3_1 : ( ruleWorkPieceType ) ;
    public final void rule__ManufacturingSystem__UsesAssignment_19_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7356:1: ( ( ruleWorkPieceType ) )
            // InternalMSDsl.g:7357:2: ( ruleWorkPieceType )
            {
            // InternalMSDsl.g:7357:2: ( ruleWorkPieceType )
            // InternalMSDsl.g:7358:3: ruleWorkPieceType
            {
             before(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_19_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkPieceType();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_19_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__UsesAssignment_19_3_1"


    // $ANTLR start "rule__ManufacturingSystem__TransformsAssignment_20_2"
    // InternalMSDsl.g:7367:1: rule__ManufacturingSystem__TransformsAssignment_20_2 : ( ruleWorkPiece ) ;
    public final void rule__ManufacturingSystem__TransformsAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7371:1: ( ( ruleWorkPiece ) )
            // InternalMSDsl.g:7372:2: ( ruleWorkPiece )
            {
            // InternalMSDsl.g:7372:2: ( ruleWorkPiece )
            // InternalMSDsl.g:7373:3: ruleWorkPiece
            {
             before(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkPiece();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_20_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__TransformsAssignment_20_2"


    // $ANTLR start "rule__ManufacturingSystem__TransformsAssignment_20_3_1"
    // InternalMSDsl.g:7382:1: rule__ManufacturingSystem__TransformsAssignment_20_3_1 : ( ruleWorkPiece ) ;
    public final void rule__ManufacturingSystem__TransformsAssignment_20_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7386:1: ( ( ruleWorkPiece ) )
            // InternalMSDsl.g:7387:2: ( ruleWorkPiece )
            {
            // InternalMSDsl.g:7387:2: ( ruleWorkPiece )
            // InternalMSDsl.g:7388:3: ruleWorkPiece
            {
             before(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_20_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkPiece();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_20_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__TransformsAssignment_20_3_1"


    // $ANTLR start "rule__ManufacturingSystem__StaffAssignment_21_2"
    // InternalMSDsl.g:7397:1: rule__ManufacturingSystem__StaffAssignment_21_2 : ( ruleResponsible ) ;
    public final void rule__ManufacturingSystem__StaffAssignment_21_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7401:1: ( ( ruleResponsible ) )
            // InternalMSDsl.g:7402:2: ( ruleResponsible )
            {
            // InternalMSDsl.g:7402:2: ( ruleResponsible )
            // InternalMSDsl.g:7403:3: ruleResponsible
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_21_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResponsible();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_21_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__StaffAssignment_21_2"


    // $ANTLR start "rule__ManufacturingSystem__StaffAssignment_21_3_1"
    // InternalMSDsl.g:7412:1: rule__ManufacturingSystem__StaffAssignment_21_3_1 : ( ruleResponsible ) ;
    public final void rule__ManufacturingSystem__StaffAssignment_21_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7416:1: ( ( ruleResponsible ) )
            // InternalMSDsl.g:7417:2: ( ruleResponsible )
            {
            // InternalMSDsl.g:7417:2: ( ruleResponsible )
            // InternalMSDsl.g:7418:3: ruleResponsible
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_21_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResponsible();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_21_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__StaffAssignment_21_3_1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__NameAssignment_2"
    // InternalMSDsl.g:7427:1: rule__ManufacturingSystemElement_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ManufacturingSystemElement_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7431:1: ( ( ruleEString ) )
            // InternalMSDsl.g:7432:2: ( ruleEString )
            {
            // InternalMSDsl.g:7432:2: ( ruleEString )
            // InternalMSDsl.g:7433:3: ruleEString
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__NameAssignment_2"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1"
    // InternalMSDsl.g:7442:1: rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7446:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7447:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7447:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7448:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 
            // InternalMSDsl.g:7449:3: ( ruleEString )
            // InternalMSDsl.g:7450:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1"
    // InternalMSDsl.g:7461:1: rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7465:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7466:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7466:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7467:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 
            // InternalMSDsl.g:7468:3: ( ruleEString )
            // InternalMSDsl.g:7469:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2_1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1"
    // InternalMSDsl.g:7480:1: rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7484:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7485:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7485:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7486:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleCrossReference_5_1_0()); 
            // InternalMSDsl.g:7487:3: ( ruleEString )
            // InternalMSDsl.g:7488:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_5_1"


    // $ANTLR start "rule__StoragePoint__NameAssignment_2"
    // InternalMSDsl.g:7499:1: rule__StoragePoint__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StoragePoint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7503:1: ( ( ruleEString ) )
            // InternalMSDsl.g:7504:2: ( ruleEString )
            {
            // InternalMSDsl.g:7504:2: ( ruleEString )
            // InternalMSDsl.g:7505:3: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__NameAssignment_2"


    // $ANTLR start "rule__StoragePoint__TransitionAssignment_4_1"
    // InternalMSDsl.g:7514:1: rule__StoragePoint__TransitionAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__TransitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7518:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7519:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7519:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7520:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 
            // InternalMSDsl.g:7521:3: ( ruleEString )
            // InternalMSDsl.g:7522:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__TransitionAssignment_4_1"


    // $ANTLR start "rule__StoragePoint__TransitionAssignment_4_2_1"
    // InternalMSDsl.g:7533:1: rule__StoragePoint__TransitionAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__TransitionAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7537:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7538:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7538:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7539:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 
            // InternalMSDsl.g:7540:3: ( ruleEString )
            // InternalMSDsl.g:7541:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__TransitionAssignment_4_2_1"


    // $ANTLR start "rule__StoragePoint__ResponsibleAssignment_5_1"
    // InternalMSDsl.g:7552:1: rule__StoragePoint__ResponsibleAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__ResponsibleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7556:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7557:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7557:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7558:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getResponsibleResponsibleCrossReference_5_1_0()); 
            // InternalMSDsl.g:7559:3: ( ruleEString )
            // InternalMSDsl.g:7560:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getResponsibleResponsibleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__ResponsibleAssignment_5_1"


    // $ANTLR start "rule__StoragePoint__StoresAssignment_6_2"
    // InternalMSDsl.g:7571:1: rule__StoragePoint__StoresAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__StoresAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7575:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7576:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7576:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7577:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_2_0()); 
            // InternalMSDsl.g:7578:3: ( ruleEString )
            // InternalMSDsl.g:7579:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__StoresAssignment_6_2"


    // $ANTLR start "rule__StoragePoint__StoresAssignment_6_3_1"
    // InternalMSDsl.g:7590:1: rule__StoragePoint__StoresAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__StoresAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7594:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7595:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7595:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7596:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_3_1_0()); 
            // InternalMSDsl.g:7597:3: ( ruleEString )
            // InternalMSDsl.g:7598:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__StoresAssignment_6_3_1"


    // $ANTLR start "rule__WorkPieceType__NameAssignment_1"
    // InternalMSDsl.g:7609:1: rule__WorkPieceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WorkPieceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7613:1: ( ( ruleEString ) )
            // InternalMSDsl.g:7614:2: ( ruleEString )
            {
            // InternalMSDsl.g:7614:2: ( ruleEString )
            // InternalMSDsl.g:7615:3: ruleEString
            {
             before(grammarAccess.getWorkPieceTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkPieceTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceType__NameAssignment_1"


    // $ANTLR start "rule__WorkPiece__HasTypeAssignment_3"
    // InternalMSDsl.g:7624:1: rule__WorkPiece__HasTypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__WorkPiece__HasTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7628:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7629:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7629:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7630:3: ( ruleEString )
            {
             before(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeCrossReference_3_0()); 
            // InternalMSDsl.g:7631:3: ( ruleEString )
            // InternalMSDsl.g:7632:4: ruleEString
            {
             before(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__HasTypeAssignment_3"


    // $ANTLR start "rule__Responsible__NameAssignment_1"
    // InternalMSDsl.g:7643:1: rule__Responsible__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Responsible__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7647:1: ( ( ruleEString ) )
            // InternalMSDsl.g:7648:2: ( ruleEString )
            {
            // InternalMSDsl.g:7648:2: ( ruleEString )
            // InternalMSDsl.g:7649:3: ruleEString
            {
             before(grammarAccess.getResponsibleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResponsibleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsible__NameAssignment_1"


    // $ANTLR start "rule__ManufacturingStep__NameAssignment_1"
    // InternalMSDsl.g:7658:1: rule__ManufacturingStep__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ManufacturingStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7662:1: ( ( ruleEString ) )
            // InternalMSDsl.g:7663:2: ( ruleEString )
            {
            // InternalMSDsl.g:7663:2: ( ruleEString )
            // InternalMSDsl.g:7664:3: ruleEString
            {
             before(grammarAccess.getManufacturingStepAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__NameAssignment_1"


    // $ANTLR start "rule__ManufacturingStep__SpeedAssignment_3_1"
    // InternalMSDsl.g:7673:1: rule__ManufacturingStep__SpeedAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__ManufacturingStep__SpeedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7677:1: ( ( ruleEInt ) )
            // InternalMSDsl.g:7678:2: ( ruleEInt )
            {
            // InternalMSDsl.g:7678:2: ( ruleEInt )
            // InternalMSDsl.g:7679:3: ruleEInt
            {
             before(grammarAccess.getManufacturingStepAccess().getSpeedEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getSpeedEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__SpeedAssignment_3_1"


    // $ANTLR start "rule__ManufacturingStep__TransitionAssignment_4_1"
    // InternalMSDsl.g:7688:1: rule__ManufacturingStep__TransitionAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingStep__TransitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7692:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7693:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7693:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7694:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 
            // InternalMSDsl.g:7695:3: ( ruleEString )
            // InternalMSDsl.g:7696:4: ruleEString
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__TransitionAssignment_4_1"


    // $ANTLR start "rule__ManufacturingStep__TransitionAssignment_4_2_1"
    // InternalMSDsl.g:7707:1: rule__ManufacturingStep__TransitionAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingStep__TransitionAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7711:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7712:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7712:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7713:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 
            // InternalMSDsl.g:7714:3: ( ruleEString )
            // InternalMSDsl.g:7715:4: ruleEString
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__TransitionAssignment_4_2_1"


    // $ANTLR start "rule__ManufacturingStep__ResponsibleAssignment_5_1"
    // InternalMSDsl.g:7726:1: rule__ManufacturingStep__ResponsibleAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingStep__ResponsibleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7730:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7731:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7731:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7732:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleCrossReference_5_1_0()); 
            // InternalMSDsl.g:7733:3: ( ruleEString )
            // InternalMSDsl.g:7734:4: ruleEString
            {
             before(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__ResponsibleAssignment_5_1"


    // $ANTLR start "rule__ManufacturingStep__InputAssignment_8"
    // InternalMSDsl.g:7745:1: rule__ManufacturingStep__InputAssignment_8 : ( ruleInputCondition ) ;
    public final void rule__ManufacturingStep__InputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7749:1: ( ( ruleInputCondition ) )
            // InternalMSDsl.g:7750:2: ( ruleInputCondition )
            {
            // InternalMSDsl.g:7750:2: ( ruleInputCondition )
            // InternalMSDsl.g:7751:3: ruleInputCondition
            {
             before(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__InputAssignment_8"


    // $ANTLR start "rule__ManufacturingStep__InputAssignment_9_1"
    // InternalMSDsl.g:7760:1: rule__ManufacturingStep__InputAssignment_9_1 : ( ruleInputCondition ) ;
    public final void rule__ManufacturingStep__InputAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7764:1: ( ( ruleInputCondition ) )
            // InternalMSDsl.g:7765:2: ( ruleInputCondition )
            {
            // InternalMSDsl.g:7765:2: ( ruleInputCondition )
            // InternalMSDsl.g:7766:3: ruleInputCondition
            {
             before(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__InputAssignment_9_1"


    // $ANTLR start "rule__ManufacturingStep__OutputAssignment_13"
    // InternalMSDsl.g:7775:1: rule__ManufacturingStep__OutputAssignment_13 : ( ruleOutputDecision ) ;
    public final void rule__ManufacturingStep__OutputAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7779:1: ( ( ruleOutputDecision ) )
            // InternalMSDsl.g:7780:2: ( ruleOutputDecision )
            {
            // InternalMSDsl.g:7780:2: ( ruleOutputDecision )
            // InternalMSDsl.g:7781:3: ruleOutputDecision
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__OutputAssignment_13"


    // $ANTLR start "rule__ManufacturingStep__OutputAssignment_14_1"
    // InternalMSDsl.g:7790:1: rule__ManufacturingStep__OutputAssignment_14_1 : ( ruleOutputDecision ) ;
    public final void rule__ManufacturingStep__OutputAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7794:1: ( ( ruleOutputDecision ) )
            // InternalMSDsl.g:7795:2: ( ruleOutputDecision )
            {
            // InternalMSDsl.g:7795:2: ( ruleOutputDecision )
            // InternalMSDsl.g:7796:3: ruleOutputDecision
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__OutputAssignment_14_1"


    // $ANTLR start "rule__TransportStep__NameAssignment_1"
    // InternalMSDsl.g:7805:1: rule__TransportStep__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TransportStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7809:1: ( ( ruleEString ) )
            // InternalMSDsl.g:7810:2: ( ruleEString )
            {
            // InternalMSDsl.g:7810:2: ( ruleEString )
            // InternalMSDsl.g:7811:3: ruleEString
            {
             before(grammarAccess.getTransportStepAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__NameAssignment_1"


    // $ANTLR start "rule__TransportStep__SpeedAssignment_3_1"
    // InternalMSDsl.g:7820:1: rule__TransportStep__SpeedAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TransportStep__SpeedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7824:1: ( ( ruleEInt ) )
            // InternalMSDsl.g:7825:2: ( ruleEInt )
            {
            // InternalMSDsl.g:7825:2: ( ruleEInt )
            // InternalMSDsl.g:7826:3: ruleEInt
            {
             before(grammarAccess.getTransportStepAccess().getSpeedEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getSpeedEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__SpeedAssignment_3_1"


    // $ANTLR start "rule__TransportStep__TransitionAssignment_4_1"
    // InternalMSDsl.g:7835:1: rule__TransportStep__TransitionAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TransportStep__TransitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7839:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7840:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7840:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7841:3: ( ruleEString )
            {
             before(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 
            // InternalMSDsl.g:7842:3: ( ruleEString )
            // InternalMSDsl.g:7843:4: ruleEString
            {
             before(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__TransitionAssignment_4_1"


    // $ANTLR start "rule__TransportStep__TransitionAssignment_4_2_1"
    // InternalMSDsl.g:7854:1: rule__TransportStep__TransitionAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__TransportStep__TransitionAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7858:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7859:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7859:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7860:3: ( ruleEString )
            {
             before(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 
            // InternalMSDsl.g:7861:3: ( ruleEString )
            // InternalMSDsl.g:7862:4: ruleEString
            {
             before(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__TransitionAssignment_4_2_1"


    // $ANTLR start "rule__TransportStep__ResponsibleAssignment_5_1"
    // InternalMSDsl.g:7873:1: rule__TransportStep__ResponsibleAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__TransportStep__ResponsibleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7877:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7878:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7878:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7879:3: ( ruleEString )
            {
             before(grammarAccess.getTransportStepAccess().getResponsibleResponsibleCrossReference_5_1_0()); 
            // InternalMSDsl.g:7880:3: ( ruleEString )
            // InternalMSDsl.g:7881:4: ruleEString
            {
             before(grammarAccess.getTransportStepAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTransportStepAccess().getResponsibleResponsibleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__ResponsibleAssignment_5_1"


    // $ANTLR start "rule__TransportStep__InputAssignment_8"
    // InternalMSDsl.g:7892:1: rule__TransportStep__InputAssignment_8 : ( ruleInputCondition ) ;
    public final void rule__TransportStep__InputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7896:1: ( ( ruleInputCondition ) )
            // InternalMSDsl.g:7897:2: ( ruleInputCondition )
            {
            // InternalMSDsl.g:7897:2: ( ruleInputCondition )
            // InternalMSDsl.g:7898:3: ruleInputCondition
            {
             before(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__InputAssignment_8"


    // $ANTLR start "rule__TransportStep__InputAssignment_9_1"
    // InternalMSDsl.g:7907:1: rule__TransportStep__InputAssignment_9_1 : ( ruleInputCondition ) ;
    public final void rule__TransportStep__InputAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7911:1: ( ( ruleInputCondition ) )
            // InternalMSDsl.g:7912:2: ( ruleInputCondition )
            {
            // InternalMSDsl.g:7912:2: ( ruleInputCondition )
            // InternalMSDsl.g:7913:3: ruleInputCondition
            {
             before(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__InputAssignment_9_1"


    // $ANTLR start "rule__TransportStep__OutputAssignment_13"
    // InternalMSDsl.g:7922:1: rule__TransportStep__OutputAssignment_13 : ( ruleOutputDecision ) ;
    public final void rule__TransportStep__OutputAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7926:1: ( ( ruleOutputDecision ) )
            // InternalMSDsl.g:7927:2: ( ruleOutputDecision )
            {
            // InternalMSDsl.g:7927:2: ( ruleOutputDecision )
            // InternalMSDsl.g:7928:3: ruleOutputDecision
            {
             before(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__OutputAssignment_13"


    // $ANTLR start "rule__TransportStep__OutputAssignment_14_1"
    // InternalMSDsl.g:7937:1: rule__TransportStep__OutputAssignment_14_1 : ( ruleOutputDecision ) ;
    public final void rule__TransportStep__OutputAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7941:1: ( ( ruleOutputDecision ) )
            // InternalMSDsl.g:7942:2: ( ruleOutputDecision )
            {
            // InternalMSDsl.g:7942:2: ( ruleOutputDecision )
            // InternalMSDsl.g:7943:3: ruleOutputDecision
            {
             before(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__OutputAssignment_14_1"


    // $ANTLR start "rule__QualityAssuranceStep__NameAssignment_1"
    // InternalMSDsl.g:7952:1: rule__QualityAssuranceStep__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__QualityAssuranceStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7956:1: ( ( ruleEString ) )
            // InternalMSDsl.g:7957:2: ( ruleEString )
            {
            // InternalMSDsl.g:7957:2: ( ruleEString )
            // InternalMSDsl.g:7958:3: ruleEString
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__NameAssignment_1"


    // $ANTLR start "rule__QualityAssuranceStep__SpeedAssignment_3_1"
    // InternalMSDsl.g:7967:1: rule__QualityAssuranceStep__SpeedAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__QualityAssuranceStep__SpeedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7971:1: ( ( ruleEInt ) )
            // InternalMSDsl.g:7972:2: ( ruleEInt )
            {
            // InternalMSDsl.g:7972:2: ( ruleEInt )
            // InternalMSDsl.g:7973:3: ruleEInt
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getSpeedEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getSpeedEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__SpeedAssignment_3_1"


    // $ANTLR start "rule__QualityAssuranceStep__TransitionAssignment_4_1"
    // InternalMSDsl.g:7982:1: rule__QualityAssuranceStep__TransitionAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__QualityAssuranceStep__TransitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:7986:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:7987:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:7987:2: ( ( ruleEString ) )
            // InternalMSDsl.g:7988:3: ( ruleEString )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 
            // InternalMSDsl.g:7989:3: ( ruleEString )
            // InternalMSDsl.g:7990:4: ruleEString
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__TransitionAssignment_4_1"


    // $ANTLR start "rule__QualityAssuranceStep__TransitionAssignment_4_2_1"
    // InternalMSDsl.g:8001:1: rule__QualityAssuranceStep__TransitionAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QualityAssuranceStep__TransitionAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8005:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8006:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8006:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8007:3: ( ruleEString )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 
            // InternalMSDsl.g:8008:3: ( ruleEString )
            // InternalMSDsl.g:8009:4: ruleEString
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__TransitionAssignment_4_2_1"


    // $ANTLR start "rule__QualityAssuranceStep__ResponsibleAssignment_5_1"
    // InternalMSDsl.g:8020:1: rule__QualityAssuranceStep__ResponsibleAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__QualityAssuranceStep__ResponsibleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8024:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8025:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8025:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8026:3: ( ruleEString )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleCrossReference_5_1_0()); 
            // InternalMSDsl.g:8027:3: ( ruleEString )
            // InternalMSDsl.g:8028:4: ruleEString
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__ResponsibleAssignment_5_1"


    // $ANTLR start "rule__QualityAssuranceStep__InputAssignment_8"
    // InternalMSDsl.g:8039:1: rule__QualityAssuranceStep__InputAssignment_8 : ( ruleInputCondition ) ;
    public final void rule__QualityAssuranceStep__InputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8043:1: ( ( ruleInputCondition ) )
            // InternalMSDsl.g:8044:2: ( ruleInputCondition )
            {
            // InternalMSDsl.g:8044:2: ( ruleInputCondition )
            // InternalMSDsl.g:8045:3: ruleInputCondition
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__InputAssignment_8"


    // $ANTLR start "rule__QualityAssuranceStep__InputAssignment_9_1"
    // InternalMSDsl.g:8054:1: rule__QualityAssuranceStep__InputAssignment_9_1 : ( ruleInputCondition ) ;
    public final void rule__QualityAssuranceStep__InputAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8058:1: ( ( ruleInputCondition ) )
            // InternalMSDsl.g:8059:2: ( ruleInputCondition )
            {
            // InternalMSDsl.g:8059:2: ( ruleInputCondition )
            // InternalMSDsl.g:8060:3: ruleInputCondition
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__InputAssignment_9_1"


    // $ANTLR start "rule__QualityAssuranceStep__OutputAssignment_13"
    // InternalMSDsl.g:8069:1: rule__QualityAssuranceStep__OutputAssignment_13 : ( ruleOutputDecision ) ;
    public final void rule__QualityAssuranceStep__OutputAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8073:1: ( ( ruleOutputDecision ) )
            // InternalMSDsl.g:8074:2: ( ruleOutputDecision )
            {
            // InternalMSDsl.g:8074:2: ( ruleOutputDecision )
            // InternalMSDsl.g:8075:3: ruleOutputDecision
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__OutputAssignment_13"


    // $ANTLR start "rule__QualityAssuranceStep__OutputAssignment_14_1"
    // InternalMSDsl.g:8084:1: rule__QualityAssuranceStep__OutputAssignment_14_1 : ( ruleOutputDecision ) ;
    public final void rule__QualityAssuranceStep__OutputAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8088:1: ( ( ruleOutputDecision ) )
            // InternalMSDsl.g:8089:2: ( ruleOutputDecision )
            {
            // InternalMSDsl.g:8089:2: ( ruleOutputDecision )
            // InternalMSDsl.g:8090:3: ruleOutputDecision
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__OutputAssignment_14_1"


    // $ANTLR start "rule__CompositeManufacturingStep__NameAssignment_1"
    // InternalMSDsl.g:8099:1: rule__CompositeManufacturingStep__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeManufacturingStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8103:1: ( ( ruleEString ) )
            // InternalMSDsl.g:8104:2: ( ruleEString )
            {
            // InternalMSDsl.g:8104:2: ( ruleEString )
            // InternalMSDsl.g:8105:3: ruleEString
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__NameAssignment_1"


    // $ANTLR start "rule__CompositeManufacturingStep__SpeedAssignment_3_1"
    // InternalMSDsl.g:8114:1: rule__CompositeManufacturingStep__SpeedAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__CompositeManufacturingStep__SpeedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8118:1: ( ( ruleEInt ) )
            // InternalMSDsl.g:8119:2: ( ruleEInt )
            {
            // InternalMSDsl.g:8119:2: ( ruleEInt )
            // InternalMSDsl.g:8120:3: ruleEInt
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getSpeedEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getSpeedEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__SpeedAssignment_3_1"


    // $ANTLR start "rule__CompositeManufacturingStep__TransitionAssignment_4_1"
    // InternalMSDsl.g:8129:1: rule__CompositeManufacturingStep__TransitionAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeManufacturingStep__TransitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8133:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8134:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8134:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8135:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 
            // InternalMSDsl.g:8136:3: ( ruleEString )
            // InternalMSDsl.g:8137:4: ruleEString
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__TransitionAssignment_4_1"


    // $ANTLR start "rule__CompositeManufacturingStep__TransitionAssignment_4_2_1"
    // InternalMSDsl.g:8148:1: rule__CompositeManufacturingStep__TransitionAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeManufacturingStep__TransitionAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8152:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8153:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8153:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8154:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 
            // InternalMSDsl.g:8155:3: ( ruleEString )
            // InternalMSDsl.g:8156:4: ruleEString
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__TransitionAssignment_4_2_1"


    // $ANTLR start "rule__CompositeManufacturingStep__ResponsibleAssignment_5_1"
    // InternalMSDsl.g:8167:1: rule__CompositeManufacturingStep__ResponsibleAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeManufacturingStep__ResponsibleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8171:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8172:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8172:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8173:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleCrossReference_5_1_0()); 
            // InternalMSDsl.g:8174:3: ( ruleEString )
            // InternalMSDsl.g:8175:4: ruleEString
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__ResponsibleAssignment_5_1"


    // $ANTLR start "rule__CompositeManufacturingStep__InputAssignment_8"
    // InternalMSDsl.g:8186:1: rule__CompositeManufacturingStep__InputAssignment_8 : ( ruleInputCondition ) ;
    public final void rule__CompositeManufacturingStep__InputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8190:1: ( ( ruleInputCondition ) )
            // InternalMSDsl.g:8191:2: ( ruleInputCondition )
            {
            // InternalMSDsl.g:8191:2: ( ruleInputCondition )
            // InternalMSDsl.g:8192:3: ruleInputCondition
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__InputAssignment_8"


    // $ANTLR start "rule__CompositeManufacturingStep__InputAssignment_9_1"
    // InternalMSDsl.g:8201:1: rule__CompositeManufacturingStep__InputAssignment_9_1 : ( ruleInputCondition ) ;
    public final void rule__CompositeManufacturingStep__InputAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8205:1: ( ( ruleInputCondition ) )
            // InternalMSDsl.g:8206:2: ( ruleInputCondition )
            {
            // InternalMSDsl.g:8206:2: ( ruleInputCondition )
            // InternalMSDsl.g:8207:3: ruleInputCondition
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__InputAssignment_9_1"


    // $ANTLR start "rule__CompositeManufacturingStep__OutputAssignment_13"
    // InternalMSDsl.g:8216:1: rule__CompositeManufacturingStep__OutputAssignment_13 : ( ruleOutputDecision ) ;
    public final void rule__CompositeManufacturingStep__OutputAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8220:1: ( ( ruleOutputDecision ) )
            // InternalMSDsl.g:8221:2: ( ruleOutputDecision )
            {
            // InternalMSDsl.g:8221:2: ( ruleOutputDecision )
            // InternalMSDsl.g:8222:3: ruleOutputDecision
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__OutputAssignment_13"


    // $ANTLR start "rule__CompositeManufacturingStep__OutputAssignment_14_1"
    // InternalMSDsl.g:8231:1: rule__CompositeManufacturingStep__OutputAssignment_14_1 : ( ruleOutputDecision ) ;
    public final void rule__CompositeManufacturingStep__OutputAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8235:1: ( ( ruleOutputDecision ) )
            // InternalMSDsl.g:8236:2: ( ruleOutputDecision )
            {
            // InternalMSDsl.g:8236:2: ( ruleOutputDecision )
            // InternalMSDsl.g:8237:3: ruleOutputDecision
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__OutputAssignment_14_1"


    // $ANTLR start "rule__CompositeManufacturingStep__ContainsAssignment_17"
    // InternalMSDsl.g:8246:1: rule__CompositeManufacturingStep__ContainsAssignment_17 : ( ruleManufacturingSystem ) ;
    public final void rule__CompositeManufacturingStep__ContainsAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8250:1: ( ( ruleManufacturingSystem ) )
            // InternalMSDsl.g:8251:2: ( ruleManufacturingSystem )
            {
            // InternalMSDsl.g:8251:2: ( ruleManufacturingSystem )
            // InternalMSDsl.g:8252:3: ruleManufacturingSystem
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getContainsManufacturingSystemParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturingSystem();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getContainsManufacturingSystemParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__ContainsAssignment_17"


    // $ANTLR start "rule__InputCondition_Impl__NameAssignment_2"
    // InternalMSDsl.g:8261:1: rule__InputCondition_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputCondition_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8265:1: ( ( ruleEString ) )
            // InternalMSDsl.g:8266:2: ( ruleEString )
            {
            // InternalMSDsl.g:8266:2: ( ruleEString )
            // InternalMSDsl.g:8267:3: ruleEString
            {
             before(grammarAccess.getInputCondition_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCondition_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__NameAssignment_2"


    // $ANTLR start "rule__OutputDecision__InputAssignment_0"
    // InternalMSDsl.g:8276:1: rule__OutputDecision__InputAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__OutputDecision__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8280:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8281:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8281:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8282:3: ( ruleEString )
            {
             before(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_0_0()); 
            // InternalMSDsl.g:8283:3: ( ruleEString )
            // InternalMSDsl.g:8284:4: ruleEString
            {
             before(grammarAccess.getOutputDecisionAccess().getInputInputConditionEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputDecisionAccess().getInputInputConditionEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__InputAssignment_0"


    // $ANTLR start "rule__OutputDecision__InputAssignment_1_1"
    // InternalMSDsl.g:8295:1: rule__OutputDecision__InputAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__OutputDecision__InputAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8299:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8300:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8300:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8301:3: ( ruleEString )
            {
             before(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_1_1_0()); 
            // InternalMSDsl.g:8302:3: ( ruleEString )
            // InternalMSDsl.g:8303:4: ruleEString
            {
             before(grammarAccess.getOutputDecisionAccess().getInputInputConditionEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputDecisionAccess().getInputInputConditionEStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__InputAssignment_1_1"


    // $ANTLR start "rule__OutputDecision__OutputTypesAssignment_3"
    // InternalMSDsl.g:8314:1: rule__OutputDecision__OutputTypesAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__OutputDecision__OutputTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8318:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8319:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8319:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8320:3: ( ruleEString )
            {
             before(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeCrossReference_3_0()); 
            // InternalMSDsl.g:8321:3: ( ruleEString )
            // InternalMSDsl.g:8322:4: ruleEString
            {
             before(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__OutputTypesAssignment_3"


    // $ANTLR start "rule__WorkPieceCondition__NameAssignment_1"
    // InternalMSDsl.g:8333:1: rule__WorkPieceCondition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WorkPieceCondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8337:1: ( ( ruleEString ) )
            // InternalMSDsl.g:8338:2: ( ruleEString )
            {
            // InternalMSDsl.g:8338:2: ( ruleEString )
            // InternalMSDsl.g:8339:3: ruleEString
            {
             before(grammarAccess.getWorkPieceConditionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkPieceConditionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__NameAssignment_1"


    // $ANTLR start "rule__WorkPieceCondition__RequiresTypeAssignment_3"
    // InternalMSDsl.g:8348:1: rule__WorkPieceCondition__RequiresTypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__WorkPieceCondition__RequiresTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8352:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8353:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8353:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8354:3: ( ruleEString )
            {
             before(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeCrossReference_3_0()); 
            // InternalMSDsl.g:8355:3: ( ruleEString )
            // InternalMSDsl.g:8356:4: ruleEString
            {
             before(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__RequiresTypeAssignment_3"


    // $ANTLR start "rule__BinaryCondition__NameAssignment_1"
    // InternalMSDsl.g:8367:1: rule__BinaryCondition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BinaryCondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8371:1: ( ( ruleEString ) )
            // InternalMSDsl.g:8372:2: ( ruleEString )
            {
            // InternalMSDsl.g:8372:2: ( ruleEString )
            // InternalMSDsl.g:8373:3: ruleEString
            {
             before(grammarAccess.getBinaryConditionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__NameAssignment_1"


    // $ANTLR start "rule__BinaryCondition__LeftAssignment_3"
    // InternalMSDsl.g:8382:1: rule__BinaryCondition__LeftAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__BinaryCondition__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8386:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8387:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8387:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8388:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftInputConditionCrossReference_3_0()); 
            // InternalMSDsl.g:8389:3: ( ruleEString )
            // InternalMSDsl.g:8390:4: ruleEString
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftInputConditionEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getLeftInputConditionEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBinaryConditionAccess().getLeftInputConditionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__LeftAssignment_3"


    // $ANTLR start "rule__BinaryCondition__TypeAssignment_4"
    // InternalMSDsl.g:8401:1: rule__BinaryCondition__TypeAssignment_4 : ( ruleBinaryType ) ;
    public final void rule__BinaryCondition__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8405:1: ( ( ruleBinaryType ) )
            // InternalMSDsl.g:8406:2: ( ruleBinaryType )
            {
            // InternalMSDsl.g:8406:2: ( ruleBinaryType )
            // InternalMSDsl.g:8407:3: ruleBinaryType
            {
             before(grammarAccess.getBinaryConditionAccess().getTypeBinaryTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryType();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getTypeBinaryTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__TypeAssignment_4"


    // $ANTLR start "rule__BinaryCondition__RightAssignment_5"
    // InternalMSDsl.g:8416:1: rule__BinaryCondition__RightAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__BinaryCondition__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8420:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8421:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8421:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8422:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryConditionAccess().getRightInputConditionCrossReference_5_0()); 
            // InternalMSDsl.g:8423:3: ( ruleEString )
            // InternalMSDsl.g:8424:4: ruleEString
            {
             before(grammarAccess.getBinaryConditionAccess().getRightInputConditionEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getRightInputConditionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBinaryConditionAccess().getRightInputConditionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__RightAssignment_5"


    // $ANTLR start "rule__Negation__ContainsAssignment_1"
    // InternalMSDsl.g:8435:1: rule__Negation__ContainsAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Negation__ContainsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSDsl.g:8439:1: ( ( ( ruleEString ) ) )
            // InternalMSDsl.g:8440:2: ( ( ruleEString ) )
            {
            // InternalMSDsl.g:8440:2: ( ( ruleEString ) )
            // InternalMSDsl.g:8441:3: ( ruleEString )
            {
             before(grammarAccess.getNegationAccess().getContainsInputConditionCrossReference_1_0()); 
            // InternalMSDsl.g:8442:3: ( ruleEString )
            // InternalMSDsl.g:8443:4: ruleEString
            {
             before(grammarAccess.getNegationAccess().getContainsInputConditionEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getContainsInputConditionEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNegationAccess().getContainsInputConditionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__ContainsAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000002A214000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003900000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008500000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000028500000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001408400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0003500000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000001800L});

}