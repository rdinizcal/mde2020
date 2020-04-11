package org.xtext.assignment3.msdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.assignment3.msdsl.services.MSDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ManufacturingSystem'", "'{'", "'start'", "'('", "','", "')'", "'end'", "'responsible'", "'consistsOf'", "'}'", "'workPieceTypes'", "'initialWorkPieces'", "'staff'", "'ManufacturingSystemElement'", "'transition'", "'StoragePoint'", "'stores'", "'WorkPiece'", "'of'", "'type'", "'ManufacturingStep'", "'speed'", "'inputConditions'", "'transforms'", "'or'", "'TransportStep'", "'transports'", "'QualityAssuranceStep'", "'verifies'", "'CompositeManufacturingStep'", "'contains'", "'-'", "'InputCondition'", "'into'", "'WorkPieceCondition'", "'ofType'", "'BinaryCondition'", "'!'", "'and'"
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

        public InternalMSDslParser(TokenStream input, MSDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ManufacturingSystem";
       	}

       	@Override
       	protected MSDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleManufacturingSystem"
    // InternalMSDsl.g:65:1: entryRuleManufacturingSystem returns [EObject current=null] : iv_ruleManufacturingSystem= ruleManufacturingSystem EOF ;
    public final EObject entryRuleManufacturingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManufacturingSystem = null;


        try {
            // InternalMSDsl.g:65:60: (iv_ruleManufacturingSystem= ruleManufacturingSystem EOF )
            // InternalMSDsl.g:66:2: iv_ruleManufacturingSystem= ruleManufacturingSystem EOF
            {
             newCompositeNode(grammarAccess.getManufacturingSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManufacturingSystem=ruleManufacturingSystem();

            state._fsp--;

             current =iv_ruleManufacturingSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManufacturingSystem"


    // $ANTLR start "ruleManufacturingSystem"
    // InternalMSDsl.g:72:1: ruleManufacturingSystem returns [EObject current=null] : (otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'start' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'end' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'responsible' ( ( ruleEString ) ) )? otherlv_17= 'consistsOf' otherlv_18= '{' ( (lv_consistsOf_19_0= ruleManufacturingSystemElement ) ) (otherlv_20= ',' ( (lv_consistsOf_21_0= ruleManufacturingSystemElement ) ) )* otherlv_22= '}' (otherlv_23= 'workPieceTypes' otherlv_24= '{' ( (lv_uses_25_0= ruleWorkPieceType ) ) (otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) ) )* otherlv_28= '}' )? (otherlv_29= 'initialWorkPieces' otherlv_30= '{' ( (lv_transforms_31_0= ruleWorkPiece ) ) (otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) ) )* otherlv_34= '}' )? (otherlv_35= 'staff' otherlv_36= '{' ( (lv_staff_37_0= ruleResponsible ) ) (otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) ) )* otherlv_40= '}' )? otherlv_41= '}' ) ;
    public final EObject ruleManufacturingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_consistsOf_19_0 = null;

        EObject lv_consistsOf_21_0 = null;

        EObject lv_uses_25_0 = null;

        EObject lv_uses_27_0 = null;

        EObject lv_transforms_31_0 = null;

        EObject lv_transforms_33_0 = null;

        EObject lv_staff_37_0 = null;

        EObject lv_staff_39_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:78:2: ( (otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'start' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'end' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'responsible' ( ( ruleEString ) ) )? otherlv_17= 'consistsOf' otherlv_18= '{' ( (lv_consistsOf_19_0= ruleManufacturingSystemElement ) ) (otherlv_20= ',' ( (lv_consistsOf_21_0= ruleManufacturingSystemElement ) ) )* otherlv_22= '}' (otherlv_23= 'workPieceTypes' otherlv_24= '{' ( (lv_uses_25_0= ruleWorkPieceType ) ) (otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) ) )* otherlv_28= '}' )? (otherlv_29= 'initialWorkPieces' otherlv_30= '{' ( (lv_transforms_31_0= ruleWorkPiece ) ) (otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) ) )* otherlv_34= '}' )? (otherlv_35= 'staff' otherlv_36= '{' ( (lv_staff_37_0= ruleResponsible ) ) (otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) ) )* otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalMSDsl.g:79:2: (otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'start' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'end' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'responsible' ( ( ruleEString ) ) )? otherlv_17= 'consistsOf' otherlv_18= '{' ( (lv_consistsOf_19_0= ruleManufacturingSystemElement ) ) (otherlv_20= ',' ( (lv_consistsOf_21_0= ruleManufacturingSystemElement ) ) )* otherlv_22= '}' (otherlv_23= 'workPieceTypes' otherlv_24= '{' ( (lv_uses_25_0= ruleWorkPieceType ) ) (otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) ) )* otherlv_28= '}' )? (otherlv_29= 'initialWorkPieces' otherlv_30= '{' ( (lv_transforms_31_0= ruleWorkPiece ) ) (otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) ) )* otherlv_34= '}' )? (otherlv_35= 'staff' otherlv_36= '{' ( (lv_staff_37_0= ruleResponsible ) ) (otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) ) )* otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalMSDsl.g:79:2: (otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'start' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'end' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'responsible' ( ( ruleEString ) ) )? otherlv_17= 'consistsOf' otherlv_18= '{' ( (lv_consistsOf_19_0= ruleManufacturingSystemElement ) ) (otherlv_20= ',' ( (lv_consistsOf_21_0= ruleManufacturingSystemElement ) ) )* otherlv_22= '}' (otherlv_23= 'workPieceTypes' otherlv_24= '{' ( (lv_uses_25_0= ruleWorkPieceType ) ) (otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) ) )* otherlv_28= '}' )? (otherlv_29= 'initialWorkPieces' otherlv_30= '{' ( (lv_transforms_31_0= ruleWorkPiece ) ) (otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) ) )* otherlv_34= '}' )? (otherlv_35= 'staff' otherlv_36= '{' ( (lv_staff_37_0= ruleResponsible ) ) (otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) ) )* otherlv_40= '}' )? otherlv_41= '}' )
            // InternalMSDsl.g:80:3: otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'start' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'end' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'responsible' ( ( ruleEString ) ) )? otherlv_17= 'consistsOf' otherlv_18= '{' ( (lv_consistsOf_19_0= ruleManufacturingSystemElement ) ) (otherlv_20= ',' ( (lv_consistsOf_21_0= ruleManufacturingSystemElement ) ) )* otherlv_22= '}' (otherlv_23= 'workPieceTypes' otherlv_24= '{' ( (lv_uses_25_0= ruleWorkPieceType ) ) (otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) ) )* otherlv_28= '}' )? (otherlv_29= 'initialWorkPieces' otherlv_30= '{' ( (lv_transforms_31_0= ruleWorkPiece ) ) (otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) ) )* otherlv_34= '}' )? (otherlv_35= 'staff' otherlv_36= '{' ( (lv_staff_37_0= ruleResponsible ) ) (otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) ) )* otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getManufacturingSystemAccess().getManufacturingSystemKeyword_0());
            		
            // InternalMSDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMSDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMSDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMSDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getManufacturingSystemAccess().getStartKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getManufacturingSystemAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMSDsl.g:115:3: ( ( ruleEString ) )
            // InternalMSDsl.g:116:4: ( ruleEString )
            {
            // InternalMSDsl.g:116:4: ( ruleEString )
            // InternalMSDsl.g:117:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManufacturingSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:131:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSDsl.g:132:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMSDsl.g:136:4: ( ( ruleEString ) )
            	    // InternalMSDsl.g:137:5: ( ruleEString )
            	    {
            	    // InternalMSDsl.g:137:5: ( ruleEString )
            	    // InternalMSDsl.g:138:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getManufacturingSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getManufacturingSystemAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getManufacturingSystemAccess().getEndKeyword_8());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getManufacturingSystemAccess().getLeftParenthesisKeyword_9());
            		
            // InternalMSDsl.g:165:3: ( ( ruleEString ) )
            // InternalMSDsl.g:166:4: ( ruleEString )
            {
            // InternalMSDsl.g:166:4: ( ruleEString )
            // InternalMSDsl.g:167:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManufacturingSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_10_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:181:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMSDsl.g:182:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_12, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMSDsl.g:186:4: ( ( ruleEString ) )
            	    // InternalMSDsl.g:187:5: ( ruleEString )
            	    {
            	    // InternalMSDsl.g:187:5: ( ruleEString )
            	    // InternalMSDsl.g:188:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getManufacturingSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_14, grammarAccess.getManufacturingSystemAccess().getRightParenthesisKeyword_12());
            		
            // InternalMSDsl.g:207:3: (otherlv_15= 'responsible' ( ( ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSDsl.g:208:4: otherlv_15= 'responsible' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_13_0());
                    			
                    // InternalMSDsl.g:212:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:213:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:213:5: ( ruleEString )
                    // InternalMSDsl.g:214:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManufacturingSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleCrossReference_13_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getManufacturingSystemAccess().getConsistsOfKeyword_14());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalMSDsl.g:237:3: ( (lv_consistsOf_19_0= ruleManufacturingSystemElement ) )
            // InternalMSDsl.g:238:4: (lv_consistsOf_19_0= ruleManufacturingSystemElement )
            {
            // InternalMSDsl.g:238:4: (lv_consistsOf_19_0= ruleManufacturingSystemElement )
            // InternalMSDsl.g:239:5: lv_consistsOf_19_0= ruleManufacturingSystemElement
            {

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_12);
            lv_consistsOf_19_0=ruleManufacturingSystemElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
            					}
            					add(
            						current,
            						"consistsOf",
            						lv_consistsOf_19_0,
            						"org.xtext.assignment3.msdsl.MSDsl.ManufacturingSystemElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:256:3: (otherlv_20= ',' ( (lv_consistsOf_21_0= ruleManufacturingSystemElement ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMSDsl.g:257:4: otherlv_20= ',' ( (lv_consistsOf_21_0= ruleManufacturingSystemElement ) )
            	    {
            	    otherlv_20=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_20, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalMSDsl.g:261:4: ( (lv_consistsOf_21_0= ruleManufacturingSystemElement ) )
            	    // InternalMSDsl.g:262:5: (lv_consistsOf_21_0= ruleManufacturingSystemElement )
            	    {
            	    // InternalMSDsl.g:262:5: (lv_consistsOf_21_0= ruleManufacturingSystemElement )
            	    // InternalMSDsl.g:263:6: lv_consistsOf_21_0= ruleManufacturingSystemElement
            	    {

            	    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_consistsOf_21_0=ruleManufacturingSystemElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"consistsOf",
            	    							lv_consistsOf_21_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.ManufacturingSystemElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_22, grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_18());
            		
            // InternalMSDsl.g:285:3: (otherlv_23= 'workPieceTypes' otherlv_24= '{' ( (lv_uses_25_0= ruleWorkPieceType ) ) (otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) ) )* otherlv_28= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMSDsl.g:286:4: otherlv_23= 'workPieceTypes' otherlv_24= '{' ( (lv_uses_25_0= ruleWorkPieceType ) ) (otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getManufacturingSystemAccess().getWorkPieceTypesKeyword_19_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalMSDsl.g:294:4: ( (lv_uses_25_0= ruleWorkPieceType ) )
                    // InternalMSDsl.g:295:5: (lv_uses_25_0= ruleWorkPieceType )
                    {
                    // InternalMSDsl.g:295:5: (lv_uses_25_0= ruleWorkPieceType )
                    // InternalMSDsl.g:296:6: lv_uses_25_0= ruleWorkPieceType
                    {

                    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_uses_25_0=ruleWorkPieceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    						}
                    						add(
                    							current,
                    							"uses",
                    							lv_uses_25_0,
                    							"org.xtext.assignment3.msdsl.MSDsl.WorkPieceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:313:4: (otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMSDsl.g:314:5: otherlv_26= ',' ( (lv_uses_27_0= ruleWorkPieceType ) )
                    	    {
                    	    otherlv_26=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalMSDsl.g:318:5: ( (lv_uses_27_0= ruleWorkPieceType ) )
                    	    // InternalMSDsl.g:319:6: (lv_uses_27_0= ruleWorkPieceType )
                    	    {
                    	    // InternalMSDsl.g:319:6: (lv_uses_27_0= ruleWorkPieceType )
                    	    // InternalMSDsl.g:320:7: lv_uses_27_0= ruleWorkPieceType
                    	    {

                    	    							newCompositeNode(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_19_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_uses_27_0=ruleWorkPieceType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"uses",
                    	    								lv_uses_27_0,
                    	    								"org.xtext.assignment3.msdsl.MSDsl.WorkPieceType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_28, grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalMSDsl.g:343:3: (otherlv_29= 'initialWorkPieces' otherlv_30= '{' ( (lv_transforms_31_0= ruleWorkPiece ) ) (otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) ) )* otherlv_34= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSDsl.g:344:4: otherlv_29= 'initialWorkPieces' otherlv_30= '{' ( (lv_transforms_31_0= ruleWorkPiece ) ) (otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_29, grammarAccess.getManufacturingSystemAccess().getInitialWorkPiecesKeyword_20_0());
                    			
                    otherlv_30=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_30, grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_20_1());
                    			
                    // InternalMSDsl.g:352:4: ( (lv_transforms_31_0= ruleWorkPiece ) )
                    // InternalMSDsl.g:353:5: (lv_transforms_31_0= ruleWorkPiece )
                    {
                    // InternalMSDsl.g:353:5: (lv_transforms_31_0= ruleWorkPiece )
                    // InternalMSDsl.g:354:6: lv_transforms_31_0= ruleWorkPiece
                    {

                    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_transforms_31_0=ruleWorkPiece();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    						}
                    						add(
                    							current,
                    							"transforms",
                    							lv_transforms_31_0,
                    							"org.xtext.assignment3.msdsl.MSDsl.WorkPiece");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:371:4: (otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMSDsl.g:372:5: otherlv_32= ',' ( (lv_transforms_33_0= ruleWorkPiece ) )
                    	    {
                    	    otherlv_32=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_20_3_0());
                    	    				
                    	    // InternalMSDsl.g:376:5: ( (lv_transforms_33_0= ruleWorkPiece ) )
                    	    // InternalMSDsl.g:377:6: (lv_transforms_33_0= ruleWorkPiece )
                    	    {
                    	    // InternalMSDsl.g:377:6: (lv_transforms_33_0= ruleWorkPiece )
                    	    // InternalMSDsl.g:378:7: lv_transforms_33_0= ruleWorkPiece
                    	    {

                    	    							newCompositeNode(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_20_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_transforms_33_0=ruleWorkPiece();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transforms",
                    	    								lv_transforms_33_0,
                    	    								"org.xtext.assignment3.msdsl.MSDsl.WorkPiece");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_34, grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_20_4());
                    			

                    }
                    break;

            }

            // InternalMSDsl.g:401:3: (otherlv_35= 'staff' otherlv_36= '{' ( (lv_staff_37_0= ruleResponsible ) ) (otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) ) )* otherlv_40= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSDsl.g:402:4: otherlv_35= 'staff' otherlv_36= '{' ( (lv_staff_37_0= ruleResponsible ) ) (otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) ) )* otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_35, grammarAccess.getManufacturingSystemAccess().getStaffKeyword_21_0());
                    			
                    otherlv_36=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_21_1());
                    			
                    // InternalMSDsl.g:410:4: ( (lv_staff_37_0= ruleResponsible ) )
                    // InternalMSDsl.g:411:5: (lv_staff_37_0= ruleResponsible )
                    {
                    // InternalMSDsl.g:411:5: (lv_staff_37_0= ruleResponsible )
                    // InternalMSDsl.g:412:6: lv_staff_37_0= ruleResponsible
                    {

                    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_staff_37_0=ruleResponsible();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    						}
                    						add(
                    							current,
                    							"staff",
                    							lv_staff_37_0,
                    							"org.xtext.assignment3.msdsl.MSDsl.Responsible");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:429:4: (otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMSDsl.g:430:5: otherlv_38= ',' ( (lv_staff_39_0= ruleResponsible ) )
                    	    {
                    	    otherlv_38=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_21_3_0());
                    	    				
                    	    // InternalMSDsl.g:434:5: ( (lv_staff_39_0= ruleResponsible ) )
                    	    // InternalMSDsl.g:435:6: (lv_staff_39_0= ruleResponsible )
                    	    {
                    	    // InternalMSDsl.g:435:6: (lv_staff_39_0= ruleResponsible )
                    	    // InternalMSDsl.g:436:7: lv_staff_39_0= ruleResponsible
                    	    {

                    	    							newCompositeNode(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_21_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_staff_39_0=ruleResponsible();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"staff",
                    	    								lv_staff_39_0,
                    	    								"org.xtext.assignment3.msdsl.MSDsl.Responsible");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_40, grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_21_4());
                    			

                    }
                    break;

            }

            otherlv_41=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManufacturingSystem"


    // $ANTLR start "entryRuleManufacturingSystemElement"
    // InternalMSDsl.g:467:1: entryRuleManufacturingSystemElement returns [EObject current=null] : iv_ruleManufacturingSystemElement= ruleManufacturingSystemElement EOF ;
    public final EObject entryRuleManufacturingSystemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManufacturingSystemElement = null;


        try {
            // InternalMSDsl.g:467:67: (iv_ruleManufacturingSystemElement= ruleManufacturingSystemElement EOF )
            // InternalMSDsl.g:468:2: iv_ruleManufacturingSystemElement= ruleManufacturingSystemElement EOF
            {
             newCompositeNode(grammarAccess.getManufacturingSystemElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManufacturingSystemElement=ruleManufacturingSystemElement();

            state._fsp--;

             current =iv_ruleManufacturingSystemElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManufacturingSystemElement"


    // $ANTLR start "ruleManufacturingSystemElement"
    // InternalMSDsl.g:474:1: ruleManufacturingSystemElement returns [EObject current=null] : (this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl | this_ManufacturingStep_1= ruleManufacturingStep | this_TransportStep_2= ruleTransportStep | this_QualityAssuranceStep_3= ruleQualityAssuranceStep | this_StoragePoint_4= ruleStoragePoint | this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep ) ;
    public final EObject ruleManufacturingSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_ManufacturingSystemElement_Impl_0 = null;

        EObject this_ManufacturingStep_1 = null;

        EObject this_TransportStep_2 = null;

        EObject this_QualityAssuranceStep_3 = null;

        EObject this_StoragePoint_4 = null;

        EObject this_CompositeManufacturingStep_5 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:480:2: ( (this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl | this_ManufacturingStep_1= ruleManufacturingStep | this_TransportStep_2= ruleTransportStep | this_QualityAssuranceStep_3= ruleQualityAssuranceStep | this_StoragePoint_4= ruleStoragePoint | this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep ) )
            // InternalMSDsl.g:481:2: (this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl | this_ManufacturingStep_1= ruleManufacturingStep | this_TransportStep_2= ruleTransportStep | this_QualityAssuranceStep_3= ruleQualityAssuranceStep | this_StoragePoint_4= ruleStoragePoint | this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep )
            {
            // InternalMSDsl.g:481:2: (this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl | this_ManufacturingStep_1= ruleManufacturingStep | this_TransportStep_2= ruleTransportStep | this_QualityAssuranceStep_3= ruleQualityAssuranceStep | this_StoragePoint_4= ruleStoragePoint | this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            case 38:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            case 40:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMSDsl.g:482:3: this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getManufacturingSystemElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManufacturingSystemElement_Impl_0=ruleManufacturingSystemElement_Impl();

                    state._fsp--;


                    			current = this_ManufacturingSystemElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSDsl.g:491:3: this_ManufacturingStep_1= ruleManufacturingStep
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getManufacturingStepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManufacturingStep_1=ruleManufacturingStep();

                    state._fsp--;


                    			current = this_ManufacturingStep_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMSDsl.g:500:3: this_TransportStep_2= ruleTransportStep
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getTransportStepParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransportStep_2=ruleTransportStep();

                    state._fsp--;


                    			current = this_TransportStep_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMSDsl.g:509:3: this_QualityAssuranceStep_3= ruleQualityAssuranceStep
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getQualityAssuranceStepParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualityAssuranceStep_3=ruleQualityAssuranceStep();

                    state._fsp--;


                    			current = this_QualityAssuranceStep_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMSDsl.g:518:3: this_StoragePoint_4= ruleStoragePoint
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getStoragePointParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoragePoint_4=ruleStoragePoint();

                    state._fsp--;


                    			current = this_StoragePoint_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMSDsl.g:527:3: this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getCompositeManufacturingStepParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeManufacturingStep_5=ruleCompositeManufacturingStep();

                    state._fsp--;


                    			current = this_CompositeManufacturingStep_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManufacturingSystemElement"


    // $ANTLR start "entryRuleInputCondition"
    // InternalMSDsl.g:539:1: entryRuleInputCondition returns [EObject current=null] : iv_ruleInputCondition= ruleInputCondition EOF ;
    public final EObject entryRuleInputCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCondition = null;


        try {
            // InternalMSDsl.g:539:55: (iv_ruleInputCondition= ruleInputCondition EOF )
            // InternalMSDsl.g:540:2: iv_ruleInputCondition= ruleInputCondition EOF
            {
             newCompositeNode(grammarAccess.getInputConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputCondition=ruleInputCondition();

            state._fsp--;

             current =iv_ruleInputCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputCondition"


    // $ANTLR start "ruleInputCondition"
    // InternalMSDsl.g:546:1: ruleInputCondition returns [EObject current=null] : (this_InputCondition_Impl_0= ruleInputCondition_Impl | this_WorkPieceCondition_1= ruleWorkPieceCondition | this_BinaryCondition_2= ruleBinaryCondition | this_Negation_3= ruleNegation ) ;
    public final EObject ruleInputCondition() throws RecognitionException {
        EObject current = null;

        EObject this_InputCondition_Impl_0 = null;

        EObject this_WorkPieceCondition_1 = null;

        EObject this_BinaryCondition_2 = null;

        EObject this_Negation_3 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:552:2: ( (this_InputCondition_Impl_0= ruleInputCondition_Impl | this_WorkPieceCondition_1= ruleWorkPieceCondition | this_BinaryCondition_2= ruleBinaryCondition | this_Negation_3= ruleNegation ) )
            // InternalMSDsl.g:553:2: (this_InputCondition_Impl_0= ruleInputCondition_Impl | this_WorkPieceCondition_1= ruleWorkPieceCondition | this_BinaryCondition_2= ruleBinaryCondition | this_Negation_3= ruleNegation )
            {
            // InternalMSDsl.g:553:2: (this_InputCondition_Impl_0= ruleInputCondition_Impl | this_WorkPieceCondition_1= ruleWorkPieceCondition | this_BinaryCondition_2= ruleBinaryCondition | this_Negation_3= ruleNegation )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt12=1;
                }
                break;
            case 45:
                {
                alt12=2;
                }
                break;
            case 47:
                {
                alt12=3;
                }
                break;
            case 48:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMSDsl.g:554:3: this_InputCondition_Impl_0= ruleInputCondition_Impl
                    {

                    			newCompositeNode(grammarAccess.getInputConditionAccess().getInputCondition_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputCondition_Impl_0=ruleInputCondition_Impl();

                    state._fsp--;


                    			current = this_InputCondition_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSDsl.g:563:3: this_WorkPieceCondition_1= ruleWorkPieceCondition
                    {

                    			newCompositeNode(grammarAccess.getInputConditionAccess().getWorkPieceConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkPieceCondition_1=ruleWorkPieceCondition();

                    state._fsp--;


                    			current = this_WorkPieceCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMSDsl.g:572:3: this_BinaryCondition_2= ruleBinaryCondition
                    {

                    			newCompositeNode(grammarAccess.getInputConditionAccess().getBinaryConditionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryCondition_2=ruleBinaryCondition();

                    state._fsp--;


                    			current = this_BinaryCondition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMSDsl.g:581:3: this_Negation_3= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getInputConditionAccess().getNegationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_3=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputCondition"


    // $ANTLR start "entryRuleManufacturingSystemElement_Impl"
    // InternalMSDsl.g:593:1: entryRuleManufacturingSystemElement_Impl returns [EObject current=null] : iv_ruleManufacturingSystemElement_Impl= ruleManufacturingSystemElement_Impl EOF ;
    public final EObject entryRuleManufacturingSystemElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManufacturingSystemElement_Impl = null;


        try {
            // InternalMSDsl.g:593:72: (iv_ruleManufacturingSystemElement_Impl= ruleManufacturingSystemElement_Impl EOF )
            // InternalMSDsl.g:594:2: iv_ruleManufacturingSystemElement_Impl= ruleManufacturingSystemElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManufacturingSystemElement_Impl=ruleManufacturingSystemElement_Impl();

            state._fsp--;

             current =iv_ruleManufacturingSystemElement_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManufacturingSystemElement_Impl"


    // $ANTLR start "ruleManufacturingSystemElement_Impl"
    // InternalMSDsl.g:600:1: ruleManufacturingSystemElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleManufacturingSystemElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:606:2: ( ( () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalMSDsl.g:607:2: ( () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalMSDsl.g:607:2: ( () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalMSDsl.g:608:3: () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalMSDsl.g:608:3: ()
            // InternalMSDsl.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementKeyword_1());
            		
            // InternalMSDsl.g:619:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMSDsl.g:620:4: (lv_name_2_0= ruleEString )
            {
            // InternalMSDsl.g:620:4: (lv_name_2_0= ruleEString )
            // InternalMSDsl.g:621:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingSystemElement_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMSDsl.g:642:3: (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMSDsl.g:643:4: otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionKeyword_4_0());
                    			
                    // InternalMSDsl.g:647:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:648:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:648:5: ( ruleEString )
                    // InternalMSDsl.g:649:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManufacturingSystemElement_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:663:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMSDsl.g:664:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getManufacturingSystemElement_ImplAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSDsl.g:668:5: ( ( ruleEString ) )
                    	    // InternalMSDsl.g:669:6: ( ruleEString )
                    	    {
                    	    // InternalMSDsl.g:669:6: ( ruleEString )
                    	    // InternalMSDsl.g:670:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManufacturingSystemElement_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMSDsl.g:686:3: (otherlv_8= 'responsible' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMSDsl.g:687:4: otherlv_8= 'responsible' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleKeyword_5_0());
                    			
                    // InternalMSDsl.g:691:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:692:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:692:5: ( ruleEString )
                    // InternalMSDsl.g:693:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManufacturingSystemElement_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getManufacturingSystemElement_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManufacturingSystemElement_Impl"


    // $ANTLR start "entryRuleStoragePoint"
    // InternalMSDsl.g:716:1: entryRuleStoragePoint returns [EObject current=null] : iv_ruleStoragePoint= ruleStoragePoint EOF ;
    public final EObject entryRuleStoragePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoragePoint = null;


        try {
            // InternalMSDsl.g:716:53: (iv_ruleStoragePoint= ruleStoragePoint EOF )
            // InternalMSDsl.g:717:2: iv_ruleStoragePoint= ruleStoragePoint EOF
            {
             newCompositeNode(grammarAccess.getStoragePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoragePoint=ruleStoragePoint();

            state._fsp--;

             current =iv_ruleStoragePoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStoragePoint"


    // $ANTLR start "ruleStoragePoint"
    // InternalMSDsl.g:723:1: ruleStoragePoint returns [EObject current=null] : ( () otherlv_1= 'StoragePoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? (otherlv_10= 'stores' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleStoragePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:729:2: ( ( () otherlv_1= 'StoragePoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? (otherlv_10= 'stores' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalMSDsl.g:730:2: ( () otherlv_1= 'StoragePoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? (otherlv_10= 'stores' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalMSDsl.g:730:2: ( () otherlv_1= 'StoragePoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? (otherlv_10= 'stores' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalMSDsl.g:731:3: () otherlv_1= 'StoragePoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'responsible' ( ( ruleEString ) ) )? (otherlv_10= 'stores' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalMSDsl.g:731:3: ()
            // InternalMSDsl.g:732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStoragePointAccess().getStoragePointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStoragePointAccess().getStoragePointKeyword_1());
            		
            // InternalMSDsl.g:742:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMSDsl.g:743:4: (lv_name_2_0= ruleEString )
            {
            // InternalMSDsl.g:743:4: (lv_name_2_0= ruleEString )
            // InternalMSDsl.g:744:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStoragePointAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoragePointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getStoragePointAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMSDsl.g:765:3: (otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMSDsl.g:766:4: otherlv_4= 'transition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStoragePointAccess().getTransitionKeyword_4_0());
                    			
                    // InternalMSDsl.g:770:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:771:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:771:5: ( ruleEString )
                    // InternalMSDsl.g:772:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoragePointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:786:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMSDsl.g:787:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getStoragePointAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSDsl.g:791:5: ( ( ruleEString ) )
                    	    // InternalMSDsl.g:792:6: ( ruleEString )
                    	    {
                    	    // InternalMSDsl.g:792:6: ( ruleEString )
                    	    // InternalMSDsl.g:793:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStoragePointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMSDsl.g:809:3: (otherlv_8= 'responsible' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMSDsl.g:810:4: otherlv_8= 'responsible' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getStoragePointAccess().getResponsibleKeyword_5_0());
                    			
                    // InternalMSDsl.g:814:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:815:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:815:5: ( ruleEString )
                    // InternalMSDsl.g:816:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoragePointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStoragePointAccess().getResponsibleResponsibleCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMSDsl.g:831:3: (otherlv_10= 'stores' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMSDsl.g:832:4: otherlv_10= 'stores' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getStoragePointAccess().getStoresKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getStoragePointAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMSDsl.g:840:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:841:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:841:5: ( ruleEString )
                    // InternalMSDsl.g:842:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoragePointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:856:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMSDsl.g:857:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStoragePointAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMSDsl.g:861:5: ( ( ruleEString ) )
                    	    // InternalMSDsl.g:862:6: ( ruleEString )
                    	    {
                    	    // InternalMSDsl.g:862:6: ( ruleEString )
                    	    // InternalMSDsl.g:863:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStoragePointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_15, grammarAccess.getStoragePointAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getStoragePointAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoragePoint"


    // $ANTLR start "entryRuleWorkPieceType"
    // InternalMSDsl.g:891:1: entryRuleWorkPieceType returns [EObject current=null] : iv_ruleWorkPieceType= ruleWorkPieceType EOF ;
    public final EObject entryRuleWorkPieceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkPieceType = null;


        try {
            // InternalMSDsl.g:891:54: (iv_ruleWorkPieceType= ruleWorkPieceType EOF )
            // InternalMSDsl.g:892:2: iv_ruleWorkPieceType= ruleWorkPieceType EOF
            {
             newCompositeNode(grammarAccess.getWorkPieceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkPieceType=ruleWorkPieceType();

            state._fsp--;

             current =iv_ruleWorkPieceType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkPieceType"


    // $ANTLR start "ruleWorkPieceType"
    // InternalMSDsl.g:898:1: ruleWorkPieceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleWorkPieceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:904:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMSDsl.g:905:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMSDsl.g:905:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMSDsl.g:906:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMSDsl.g:906:3: ()
            // InternalMSDsl.g:907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkPieceTypeAccess().getWorkPieceTypeAction_0(),
            					current);
            			

            }

            // InternalMSDsl.g:913:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMSDsl.g:914:4: (lv_name_1_0= ruleEString )
            {
            // InternalMSDsl.g:914:4: (lv_name_1_0= ruleEString )
            // InternalMSDsl.g:915:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkPieceTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkPieceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkPieceType"


    // $ANTLR start "entryRuleWorkPiece"
    // InternalMSDsl.g:936:1: entryRuleWorkPiece returns [EObject current=null] : iv_ruleWorkPiece= ruleWorkPiece EOF ;
    public final EObject entryRuleWorkPiece() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkPiece = null;


        try {
            // InternalMSDsl.g:936:50: (iv_ruleWorkPiece= ruleWorkPiece EOF )
            // InternalMSDsl.g:937:2: iv_ruleWorkPiece= ruleWorkPiece EOF
            {
             newCompositeNode(grammarAccess.getWorkPieceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkPiece=ruleWorkPiece();

            state._fsp--;

             current =iv_ruleWorkPiece; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkPiece"


    // $ANTLR start "ruleWorkPiece"
    // InternalMSDsl.g:943:1: ruleWorkPiece returns [EObject current=null] : (otherlv_0= 'WorkPiece' otherlv_1= 'of' otherlv_2= 'type' ( ( ruleEString ) ) ) ;
    public final EObject ruleWorkPiece() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMSDsl.g:949:2: ( (otherlv_0= 'WorkPiece' otherlv_1= 'of' otherlv_2= 'type' ( ( ruleEString ) ) ) )
            // InternalMSDsl.g:950:2: (otherlv_0= 'WorkPiece' otherlv_1= 'of' otherlv_2= 'type' ( ( ruleEString ) ) )
            {
            // InternalMSDsl.g:950:2: (otherlv_0= 'WorkPiece' otherlv_1= 'of' otherlv_2= 'type' ( ( ruleEString ) ) )
            // InternalMSDsl.g:951:3: otherlv_0= 'WorkPiece' otherlv_1= 'of' otherlv_2= 'type' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkPieceAccess().getWorkPieceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkPieceAccess().getOfKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkPieceAccess().getTypeKeyword_2());
            		
            // InternalMSDsl.g:963:3: ( ( ruleEString ) )
            // InternalMSDsl.g:964:4: ( ruleEString )
            {
            // InternalMSDsl.g:964:4: ( ruleEString )
            // InternalMSDsl.g:965:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkPieceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkPiece"


    // $ANTLR start "entryRuleEString"
    // InternalMSDsl.g:983:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMSDsl.g:983:47: (iv_ruleEString= ruleEString EOF )
            // InternalMSDsl.g:984:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMSDsl.g:990:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMSDsl.g:996:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMSDsl.g:997:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMSDsl.g:997:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMSDsl.g:998:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMSDsl.g:1006:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleResponsible"
    // InternalMSDsl.g:1017:1: entryRuleResponsible returns [EObject current=null] : iv_ruleResponsible= ruleResponsible EOF ;
    public final EObject entryRuleResponsible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponsible = null;


        try {
            // InternalMSDsl.g:1017:52: (iv_ruleResponsible= ruleResponsible EOF )
            // InternalMSDsl.g:1018:2: iv_ruleResponsible= ruleResponsible EOF
            {
             newCompositeNode(grammarAccess.getResponsibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponsible=ruleResponsible();

            state._fsp--;

             current =iv_ruleResponsible; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResponsible"


    // $ANTLR start "ruleResponsible"
    // InternalMSDsl.g:1024:1: ruleResponsible returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResponsible() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:1030:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMSDsl.g:1031:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMSDsl.g:1031:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMSDsl.g:1032:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMSDsl.g:1032:3: ()
            // InternalMSDsl.g:1033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResponsibleAccess().getResponsibleAction_0(),
            					current);
            			

            }

            // InternalMSDsl.g:1039:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMSDsl.g:1040:4: (lv_name_1_0= ruleEString )
            {
            // InternalMSDsl.g:1040:4: (lv_name_1_0= ruleEString )
            // InternalMSDsl.g:1041:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResponsibleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponsibleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponsible"


    // $ANTLR start "entryRuleManufacturingStep"
    // InternalMSDsl.g:1062:1: entryRuleManufacturingStep returns [EObject current=null] : iv_ruleManufacturingStep= ruleManufacturingStep EOF ;
    public final EObject entryRuleManufacturingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManufacturingStep = null;


        try {
            // InternalMSDsl.g:1062:58: (iv_ruleManufacturingStep= ruleManufacturingStep EOF )
            // InternalMSDsl.g:1063:2: iv_ruleManufacturingStep= ruleManufacturingStep EOF
            {
             newCompositeNode(grammarAccess.getManufacturingStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManufacturingStep=ruleManufacturingStep();

            state._fsp--;

             current =iv_ruleManufacturingStep; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManufacturingStep"


    // $ANTLR start "ruleManufacturingStep"
    // InternalMSDsl.g:1069:1: ruleManufacturingStep returns [EObject current=null] : (otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' ) ;
    public final EObject ruleManufacturingStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_4_0 = null;

        EObject lv_input_13_0 = null;

        EObject lv_input_15_0 = null;

        EObject lv_output_19_0 = null;

        EObject lv_output_21_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:1075:2: ( (otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' ) )
            // InternalMSDsl.g:1076:2: (otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalMSDsl.g:1076:2: (otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' )
            // InternalMSDsl.g:1077:3: otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getManufacturingStepAccess().getManufacturingStepKeyword_0());
            		
            // InternalMSDsl.g:1081:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMSDsl.g:1082:4: (lv_name_1_0= ruleEString )
            {
            // InternalMSDsl.g:1082:4: (lv_name_1_0= ruleEString )
            // InternalMSDsl.g:1083:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManufacturingStepAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSDsl.g:1104:3: (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMSDsl.g:1105:4: otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getManufacturingStepAccess().getSpeedKeyword_3_0());
                    			
                    // InternalMSDsl.g:1109:4: ( (lv_speed_4_0= ruleEInt ) )
                    // InternalMSDsl.g:1110:5: (lv_speed_4_0= ruleEInt )
                    {
                    // InternalMSDsl.g:1110:5: (lv_speed_4_0= ruleEInt )
                    // InternalMSDsl.g:1111:6: lv_speed_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getManufacturingStepAccess().getSpeedEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_speed_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
                    						}
                    						set(
                    							current,
                    							"speed",
                    							lv_speed_4_0,
                    							"org.xtext.assignment3.msdsl.MSDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMSDsl.g:1129:3: (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMSDsl.g:1130:4: otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getManufacturingStepAccess().getTransitionKeyword_4_0());
                    			
                    // InternalMSDsl.g:1134:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:1135:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:1135:5: ( ruleEString )
                    // InternalMSDsl.g:1136:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManufacturingStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:1150:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMSDsl.g:1151:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getManufacturingStepAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSDsl.g:1155:5: ( ( ruleEString ) )
                    	    // InternalMSDsl.g:1156:6: ( ruleEString )
                    	    {
                    	    // InternalMSDsl.g:1156:6: ( ruleEString )
                    	    // InternalMSDsl.g:1157:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManufacturingStepRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMSDsl.g:1173:3: (otherlv_9= 'responsible' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMSDsl.g:1174:4: otherlv_9= 'responsible' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getManufacturingStepAccess().getResponsibleKeyword_5_0());
                    			
                    // InternalMSDsl.g:1178:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:1179:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:1179:5: ( ruleEString )
                    // InternalMSDsl.g:1180:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManufacturingStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getManufacturingStepAccess().getInputConditionsKeyword_6());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_12, grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMSDsl.g:1203:3: ( (lv_input_13_0= ruleInputCondition ) )
            // InternalMSDsl.g:1204:4: (lv_input_13_0= ruleInputCondition )
            {
            // InternalMSDsl.g:1204:4: (lv_input_13_0= ruleInputCondition )
            // InternalMSDsl.g:1205:5: lv_input_13_0= ruleInputCondition
            {

            					newCompositeNode(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_input_13_0=ruleInputCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_13_0,
            						"org.xtext.assignment3.msdsl.MSDsl.InputCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:1222:3: (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMSDsl.g:1223:4: otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_30); 

            	    				newLeafNode(otherlv_14, grammarAccess.getManufacturingStepAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMSDsl.g:1227:4: ( (lv_input_15_0= ruleInputCondition ) )
            	    // InternalMSDsl.g:1228:5: (lv_input_15_0= ruleInputCondition )
            	    {
            	    // InternalMSDsl.g:1228:5: (lv_input_15_0= ruleInputCondition )
            	    // InternalMSDsl.g:1229:6: lv_input_15_0= ruleInputCondition
            	    {

            	    						newCompositeNode(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_input_15_0=ruleInputCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_15_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.InputCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_16=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_16, grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_17=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getManufacturingStepAccess().getTransformsKeyword_11());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalMSDsl.g:1259:3: ( (lv_output_19_0= ruleOutputDecision ) )
            // InternalMSDsl.g:1260:4: (lv_output_19_0= ruleOutputDecision )
            {
            // InternalMSDsl.g:1260:4: (lv_output_19_0= ruleOutputDecision )
            // InternalMSDsl.g:1261:5: lv_output_19_0= ruleOutputDecision
            {

            					newCompositeNode(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_32);
            lv_output_19_0=ruleOutputDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            					}
            					add(
            						current,
            						"output",
            						lv_output_19_0,
            						"org.xtext.assignment3.msdsl.MSDsl.OutputDecision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:1278:3: (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMSDsl.g:1279:4: otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) )
            	    {
            	    otherlv_20=(Token)match(input,35,FOLLOW_3); 

            	    				newLeafNode(otherlv_20, grammarAccess.getManufacturingStepAccess().getOrKeyword_14_0());
            	    			
            	    // InternalMSDsl.g:1283:4: ( (lv_output_21_0= ruleOutputDecision ) )
            	    // InternalMSDsl.g:1284:5: (lv_output_21_0= ruleOutputDecision )
            	    {
            	    // InternalMSDsl.g:1284:5: (lv_output_21_0= ruleOutputDecision )
            	    // InternalMSDsl.g:1285:6: lv_output_21_0= ruleOutputDecision
            	    {

            	    						newCompositeNode(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_output_21_0=ruleOutputDecision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_21_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.OutputDecision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_22, grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_23=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManufacturingStep"


    // $ANTLR start "entryRuleTransportStep"
    // InternalMSDsl.g:1315:1: entryRuleTransportStep returns [EObject current=null] : iv_ruleTransportStep= ruleTransportStep EOF ;
    public final EObject entryRuleTransportStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransportStep = null;


        try {
            // InternalMSDsl.g:1315:54: (iv_ruleTransportStep= ruleTransportStep EOF )
            // InternalMSDsl.g:1316:2: iv_ruleTransportStep= ruleTransportStep EOF
            {
             newCompositeNode(grammarAccess.getTransportStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransportStep=ruleTransportStep();

            state._fsp--;

             current =iv_ruleTransportStep; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransportStep"


    // $ANTLR start "ruleTransportStep"
    // InternalMSDsl.g:1322:1: ruleTransportStep returns [EObject current=null] : (otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transports' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' ) ;
    public final EObject ruleTransportStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_4_0 = null;

        EObject lv_input_13_0 = null;

        EObject lv_input_15_0 = null;

        EObject lv_output_19_0 = null;

        EObject lv_output_21_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:1328:2: ( (otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transports' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' ) )
            // InternalMSDsl.g:1329:2: (otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transports' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalMSDsl.g:1329:2: (otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transports' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' )
            // InternalMSDsl.g:1330:3: otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transports' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransportStepAccess().getTransportStepKeyword_0());
            		
            // InternalMSDsl.g:1334:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMSDsl.g:1335:4: (lv_name_1_0= ruleEString )
            {
            // InternalMSDsl.g:1335:4: (lv_name_1_0= ruleEString )
            // InternalMSDsl.g:1336:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransportStepAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSDsl.g:1357:3: (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMSDsl.g:1358:4: otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransportStepAccess().getSpeedKeyword_3_0());
                    			
                    // InternalMSDsl.g:1362:4: ( (lv_speed_4_0= ruleEInt ) )
                    // InternalMSDsl.g:1363:5: (lv_speed_4_0= ruleEInt )
                    {
                    // InternalMSDsl.g:1363:5: (lv_speed_4_0= ruleEInt )
                    // InternalMSDsl.g:1364:6: lv_speed_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTransportStepAccess().getSpeedEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_speed_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransportStepRule());
                    						}
                    						set(
                    							current,
                    							"speed",
                    							lv_speed_4_0,
                    							"org.xtext.assignment3.msdsl.MSDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMSDsl.g:1382:3: (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMSDsl.g:1383:4: otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransportStepAccess().getTransitionKeyword_4_0());
                    			
                    // InternalMSDsl.g:1387:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:1388:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:1388:5: ( ruleEString )
                    // InternalMSDsl.g:1389:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransportStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:1403:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMSDsl.g:1404:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTransportStepAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSDsl.g:1408:5: ( ( ruleEString ) )
                    	    // InternalMSDsl.g:1409:6: ( ruleEString )
                    	    {
                    	    // InternalMSDsl.g:1409:6: ( ruleEString )
                    	    // InternalMSDsl.g:1410:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransportStepRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMSDsl.g:1426:3: (otherlv_9= 'responsible' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMSDsl.g:1427:4: otherlv_9= 'responsible' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransportStepAccess().getResponsibleKeyword_5_0());
                    			
                    // InternalMSDsl.g:1431:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:1432:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:1432:5: ( ruleEString )
                    // InternalMSDsl.g:1433:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransportStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransportStepAccess().getResponsibleResponsibleCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getTransportStepAccess().getInputConditionsKeyword_6());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_12, grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMSDsl.g:1456:3: ( (lv_input_13_0= ruleInputCondition ) )
            // InternalMSDsl.g:1457:4: (lv_input_13_0= ruleInputCondition )
            {
            // InternalMSDsl.g:1457:4: (lv_input_13_0= ruleInputCondition )
            // InternalMSDsl.g:1458:5: lv_input_13_0= ruleInputCondition
            {

            					newCompositeNode(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_input_13_0=ruleInputCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportStepRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_13_0,
            						"org.xtext.assignment3.msdsl.MSDsl.InputCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:1475:3: (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMSDsl.g:1476:4: otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_30); 

            	    				newLeafNode(otherlv_14, grammarAccess.getTransportStepAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMSDsl.g:1480:4: ( (lv_input_15_0= ruleInputCondition ) )
            	    // InternalMSDsl.g:1481:5: (lv_input_15_0= ruleInputCondition )
            	    {
            	    // InternalMSDsl.g:1481:5: (lv_input_15_0= ruleInputCondition )
            	    // InternalMSDsl.g:1482:6: lv_input_15_0= ruleInputCondition
            	    {

            	    						newCompositeNode(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_input_15_0=ruleInputCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransportStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_15_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.InputCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_16=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_16, grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_17=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getTransportStepAccess().getTransportsKeyword_11());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalMSDsl.g:1512:3: ( (lv_output_19_0= ruleOutputDecision ) )
            // InternalMSDsl.g:1513:4: (lv_output_19_0= ruleOutputDecision )
            {
            // InternalMSDsl.g:1513:4: (lv_output_19_0= ruleOutputDecision )
            // InternalMSDsl.g:1514:5: lv_output_19_0= ruleOutputDecision
            {

            					newCompositeNode(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_32);
            lv_output_19_0=ruleOutputDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportStepRule());
            					}
            					add(
            						current,
            						"output",
            						lv_output_19_0,
            						"org.xtext.assignment3.msdsl.MSDsl.OutputDecision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:1531:3: (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==35) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMSDsl.g:1532:4: otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) )
            	    {
            	    otherlv_20=(Token)match(input,35,FOLLOW_3); 

            	    				newLeafNode(otherlv_20, grammarAccess.getTransportStepAccess().getOrKeyword_14_0());
            	    			
            	    // InternalMSDsl.g:1536:4: ( (lv_output_21_0= ruleOutputDecision ) )
            	    // InternalMSDsl.g:1537:5: (lv_output_21_0= ruleOutputDecision )
            	    {
            	    // InternalMSDsl.g:1537:5: (lv_output_21_0= ruleOutputDecision )
            	    // InternalMSDsl.g:1538:6: lv_output_21_0= ruleOutputDecision
            	    {

            	    						newCompositeNode(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_output_21_0=ruleOutputDecision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransportStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_21_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.OutputDecision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_22, grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_23=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransportStep"


    // $ANTLR start "entryRuleQualityAssuranceStep"
    // InternalMSDsl.g:1568:1: entryRuleQualityAssuranceStep returns [EObject current=null] : iv_ruleQualityAssuranceStep= ruleQualityAssuranceStep EOF ;
    public final EObject entryRuleQualityAssuranceStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityAssuranceStep = null;


        try {
            // InternalMSDsl.g:1568:61: (iv_ruleQualityAssuranceStep= ruleQualityAssuranceStep EOF )
            // InternalMSDsl.g:1569:2: iv_ruleQualityAssuranceStep= ruleQualityAssuranceStep EOF
            {
             newCompositeNode(grammarAccess.getQualityAssuranceStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityAssuranceStep=ruleQualityAssuranceStep();

            state._fsp--;

             current =iv_ruleQualityAssuranceStep; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualityAssuranceStep"


    // $ANTLR start "ruleQualityAssuranceStep"
    // InternalMSDsl.g:1575:1: ruleQualityAssuranceStep returns [EObject current=null] : (otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'verifies' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' ) ;
    public final EObject ruleQualityAssuranceStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_4_0 = null;

        EObject lv_input_13_0 = null;

        EObject lv_input_15_0 = null;

        EObject lv_output_19_0 = null;

        EObject lv_output_21_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:1581:2: ( (otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'verifies' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' ) )
            // InternalMSDsl.g:1582:2: (otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'verifies' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalMSDsl.g:1582:2: (otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'verifies' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}' )
            // InternalMSDsl.g:1583:3: otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'verifies' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQualityAssuranceStepAccess().getQualityAssuranceStepKeyword_0());
            		
            // InternalMSDsl.g:1587:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMSDsl.g:1588:4: (lv_name_1_0= ruleEString )
            {
            // InternalMSDsl.g:1588:4: (lv_name_1_0= ruleEString )
            // InternalMSDsl.g:1589:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSDsl.g:1610:3: (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMSDsl.g:1611:4: otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getQualityAssuranceStepAccess().getSpeedKeyword_3_0());
                    			
                    // InternalMSDsl.g:1615:4: ( (lv_speed_4_0= ruleEInt ) )
                    // InternalMSDsl.g:1616:5: (lv_speed_4_0= ruleEInt )
                    {
                    // InternalMSDsl.g:1616:5: (lv_speed_4_0= ruleEInt )
                    // InternalMSDsl.g:1617:6: lv_speed_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getSpeedEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_speed_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
                    						}
                    						set(
                    							current,
                    							"speed",
                    							lv_speed_4_0,
                    							"org.xtext.assignment3.msdsl.MSDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMSDsl.g:1635:3: (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMSDsl.g:1636:4: otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getQualityAssuranceStepAccess().getTransitionKeyword_4_0());
                    			
                    // InternalMSDsl.g:1640:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:1641:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:1641:5: ( ruleEString )
                    // InternalMSDsl.g:1642:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQualityAssuranceStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:1656:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==15) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMSDsl.g:1657:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSDsl.g:1661:5: ( ( ruleEString ) )
                    	    // InternalMSDsl.g:1662:6: ( ruleEString )
                    	    {
                    	    // InternalMSDsl.g:1662:6: ( ruleEString )
                    	    // InternalMSDsl.g:1663:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getQualityAssuranceStepRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMSDsl.g:1679:3: (otherlv_9= 'responsible' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMSDsl.g:1680:4: otherlv_9= 'responsible' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getQualityAssuranceStepAccess().getResponsibleKeyword_5_0());
                    			
                    // InternalMSDsl.g:1684:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:1685:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:1685:5: ( ruleEString )
                    // InternalMSDsl.g:1686:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQualityAssuranceStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getQualityAssuranceStepAccess().getInputConditionsKeyword_6());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_12, grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMSDsl.g:1709:3: ( (lv_input_13_0= ruleInputCondition ) )
            // InternalMSDsl.g:1710:4: (lv_input_13_0= ruleInputCondition )
            {
            // InternalMSDsl.g:1710:4: (lv_input_13_0= ruleInputCondition )
            // InternalMSDsl.g:1711:5: lv_input_13_0= ruleInputCondition
            {

            					newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_input_13_0=ruleInputCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_13_0,
            						"org.xtext.assignment3.msdsl.MSDsl.InputCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:1728:3: (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==15) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMSDsl.g:1729:4: otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_30); 

            	    				newLeafNode(otherlv_14, grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMSDsl.g:1733:4: ( (lv_input_15_0= ruleInputCondition ) )
            	    // InternalMSDsl.g:1734:5: (lv_input_15_0= ruleInputCondition )
            	    {
            	    // InternalMSDsl.g:1734:5: (lv_input_15_0= ruleInputCondition )
            	    // InternalMSDsl.g:1735:6: lv_input_15_0= ruleInputCondition
            	    {

            	    						newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_input_15_0=ruleInputCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_15_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.InputCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_16=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_16, grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_17=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getQualityAssuranceStepAccess().getVerifiesKeyword_11());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalMSDsl.g:1765:3: ( (lv_output_19_0= ruleOutputDecision ) )
            // InternalMSDsl.g:1766:4: (lv_output_19_0= ruleOutputDecision )
            {
            // InternalMSDsl.g:1766:4: (lv_output_19_0= ruleOutputDecision )
            // InternalMSDsl.g:1767:5: lv_output_19_0= ruleOutputDecision
            {

            					newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_32);
            lv_output_19_0=ruleOutputDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            					}
            					add(
            						current,
            						"output",
            						lv_output_19_0,
            						"org.xtext.assignment3.msdsl.MSDsl.OutputDecision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:1784:3: (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMSDsl.g:1785:4: otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) )
            	    {
            	    otherlv_20=(Token)match(input,35,FOLLOW_3); 

            	    				newLeafNode(otherlv_20, grammarAccess.getQualityAssuranceStepAccess().getOrKeyword_14_0());
            	    			
            	    // InternalMSDsl.g:1789:4: ( (lv_output_21_0= ruleOutputDecision ) )
            	    // InternalMSDsl.g:1790:5: (lv_output_21_0= ruleOutputDecision )
            	    {
            	    // InternalMSDsl.g:1790:5: (lv_output_21_0= ruleOutputDecision )
            	    // InternalMSDsl.g:1791:6: lv_output_21_0= ruleOutputDecision
            	    {

            	    						newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_output_21_0=ruleOutputDecision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_21_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.OutputDecision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_22, grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_23=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityAssuranceStep"


    // $ANTLR start "entryRuleCompositeManufacturingStep"
    // InternalMSDsl.g:1821:1: entryRuleCompositeManufacturingStep returns [EObject current=null] : iv_ruleCompositeManufacturingStep= ruleCompositeManufacturingStep EOF ;
    public final EObject entryRuleCompositeManufacturingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeManufacturingStep = null;


        try {
            // InternalMSDsl.g:1821:67: (iv_ruleCompositeManufacturingStep= ruleCompositeManufacturingStep EOF )
            // InternalMSDsl.g:1822:2: iv_ruleCompositeManufacturingStep= ruleCompositeManufacturingStep EOF
            {
             newCompositeNode(grammarAccess.getCompositeManufacturingStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeManufacturingStep=ruleCompositeManufacturingStep();

            state._fsp--;

             current =iv_ruleCompositeManufacturingStep; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeManufacturingStep"


    // $ANTLR start "ruleCompositeManufacturingStep"
    // InternalMSDsl.g:1828:1: ruleCompositeManufacturingStep returns [EObject current=null] : (otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= 'contains' ( (lv_contains_24_0= ruleManufacturingSystem ) ) otherlv_25= '}' ) ;
    public final EObject ruleCompositeManufacturingStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_4_0 = null;

        EObject lv_input_13_0 = null;

        EObject lv_input_15_0 = null;

        EObject lv_output_19_0 = null;

        EObject lv_output_21_0 = null;

        EObject lv_contains_24_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:1834:2: ( (otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= 'contains' ( (lv_contains_24_0= ruleManufacturingSystem ) ) otherlv_25= '}' ) )
            // InternalMSDsl.g:1835:2: (otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= 'contains' ( (lv_contains_24_0= ruleManufacturingSystem ) ) otherlv_25= '}' )
            {
            // InternalMSDsl.g:1835:2: (otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= 'contains' ( (lv_contains_24_0= ruleManufacturingSystem ) ) otherlv_25= '}' )
            // InternalMSDsl.g:1836:3: otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )? (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'responsible' ( ( ruleEString ) ) )? otherlv_11= 'inputConditions' otherlv_12= '{' ( (lv_input_13_0= ruleInputCondition ) ) (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )* otherlv_16= '}' otherlv_17= 'transforms' otherlv_18= '{' ( (lv_output_19_0= ruleOutputDecision ) ) (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )* otherlv_22= '}' otherlv_23= 'contains' ( (lv_contains_24_0= ruleManufacturingSystem ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeManufacturingStepAccess().getCompositeManufacturingStepKeyword_0());
            		
            // InternalMSDsl.g:1840:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMSDsl.g:1841:4: (lv_name_1_0= ruleEString )
            {
            // InternalMSDsl.g:1841:4: (lv_name_1_0= ruleEString )
            // InternalMSDsl.g:1842:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSDsl.g:1863:3: (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==32) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMSDsl.g:1864:4: otherlv_3= 'speed' ( (lv_speed_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeManufacturingStepAccess().getSpeedKeyword_3_0());
                    			
                    // InternalMSDsl.g:1868:4: ( (lv_speed_4_0= ruleEInt ) )
                    // InternalMSDsl.g:1869:5: (lv_speed_4_0= ruleEInt )
                    {
                    // InternalMSDsl.g:1869:5: (lv_speed_4_0= ruleEInt )
                    // InternalMSDsl.g:1870:6: lv_speed_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getSpeedEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_speed_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
                    						}
                    						set(
                    							current,
                    							"speed",
                    							lv_speed_4_0,
                    							"org.xtext.assignment3.msdsl.MSDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMSDsl.g:1888:3: (otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMSDsl.g:1889:4: otherlv_5= 'transition' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompositeManufacturingStepAccess().getTransitionKeyword_4_0());
                    			
                    // InternalMSDsl.g:1893:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:1894:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:1894:5: ( ruleEString )
                    // InternalMSDsl.g:1895:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeManufacturingStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMSDsl.g:1909:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMSDsl.g:1910:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMSDsl.g:1914:5: ( ( ruleEString ) )
                    	    // InternalMSDsl.g:1915:6: ( ruleEString )
                    	    {
                    	    // InternalMSDsl.g:1915:6: ( ruleEString )
                    	    // InternalMSDsl.g:1916:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeManufacturingStepRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMSDsl.g:1932:3: (otherlv_9= 'responsible' ( ( ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==18) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMSDsl.g:1933:4: otherlv_9= 'responsible' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositeManufacturingStepAccess().getResponsibleKeyword_5_0());
                    			
                    // InternalMSDsl.g:1937:4: ( ( ruleEString ) )
                    // InternalMSDsl.g:1938:5: ( ruleEString )
                    {
                    // InternalMSDsl.g:1938:5: ( ruleEString )
                    // InternalMSDsl.g:1939:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeManufacturingStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositeManufacturingStepAccess().getInputConditionsKeyword_6());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_12, grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMSDsl.g:1962:3: ( (lv_input_13_0= ruleInputCondition ) )
            // InternalMSDsl.g:1963:4: (lv_input_13_0= ruleInputCondition )
            {
            // InternalMSDsl.g:1963:4: (lv_input_13_0= ruleInputCondition )
            // InternalMSDsl.g:1964:5: lv_input_13_0= ruleInputCondition
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_input_13_0=ruleInputCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_13_0,
            						"org.xtext.assignment3.msdsl.MSDsl.InputCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:1981:3: (otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==15) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMSDsl.g:1982:4: otherlv_14= ',' ( (lv_input_15_0= ruleInputCondition ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_30); 

            	    				newLeafNode(otherlv_14, grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMSDsl.g:1986:4: ( (lv_input_15_0= ruleInputCondition ) )
            	    // InternalMSDsl.g:1987:5: (lv_input_15_0= ruleInputCondition )
            	    {
            	    // InternalMSDsl.g:1987:5: (lv_input_15_0= ruleInputCondition )
            	    // InternalMSDsl.g:1988:6: lv_input_15_0= ruleInputCondition
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_input_15_0=ruleInputCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_15_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.InputCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_16=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_16, grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_17=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getCompositeManufacturingStepAccess().getTransformsKeyword_11());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalMSDsl.g:2018:3: ( (lv_output_19_0= ruleOutputDecision ) )
            // InternalMSDsl.g:2019:4: (lv_output_19_0= ruleOutputDecision )
            {
            // InternalMSDsl.g:2019:4: (lv_output_19_0= ruleOutputDecision )
            // InternalMSDsl.g:2020:5: lv_output_19_0= ruleOutputDecision
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_32);
            lv_output_19_0=ruleOutputDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					add(
            						current,
            						"output",
            						lv_output_19_0,
            						"org.xtext.assignment3.msdsl.MSDsl.OutputDecision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:2037:3: (otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==35) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMSDsl.g:2038:4: otherlv_20= 'or' ( (lv_output_21_0= ruleOutputDecision ) )
            	    {
            	    otherlv_20=(Token)match(input,35,FOLLOW_3); 

            	    				newLeafNode(otherlv_20, grammarAccess.getCompositeManufacturingStepAccess().getOrKeyword_14_0());
            	    			
            	    // InternalMSDsl.g:2042:4: ( (lv_output_21_0= ruleOutputDecision ) )
            	    // InternalMSDsl.g:2043:5: (lv_output_21_0= ruleOutputDecision )
            	    {
            	    // InternalMSDsl.g:2043:5: (lv_output_21_0= ruleOutputDecision )
            	    // InternalMSDsl.g:2044:6: lv_output_21_0= ruleOutputDecision
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_output_21_0=ruleOutputDecision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_21_0,
            	    							"org.xtext.assignment3.msdsl.MSDsl.OutputDecision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_22, grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_23=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_23, grammarAccess.getCompositeManufacturingStepAccess().getContainsKeyword_16());
            		
            // InternalMSDsl.g:2070:3: ( (lv_contains_24_0= ruleManufacturingSystem ) )
            // InternalMSDsl.g:2071:4: (lv_contains_24_0= ruleManufacturingSystem )
            {
            // InternalMSDsl.g:2071:4: (lv_contains_24_0= ruleManufacturingSystem )
            // InternalMSDsl.g:2072:5: lv_contains_24_0= ruleManufacturingSystem
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getContainsManufacturingSystemParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_17);
            lv_contains_24_0=ruleManufacturingSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					set(
            						current,
            						"contains",
            						lv_contains_24_0,
            						"org.xtext.assignment3.msdsl.MSDsl.ManufacturingSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeManufacturingStep"


    // $ANTLR start "entryRuleEInt"
    // InternalMSDsl.g:2097:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMSDsl.g:2097:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMSDsl.g:2098:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMSDsl.g:2104:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMSDsl.g:2110:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMSDsl.g:2111:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMSDsl.g:2111:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMSDsl.g:2112:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMSDsl.g:2112:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMSDsl.g:2113:4: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInputCondition_Impl"
    // InternalMSDsl.g:2130:1: entryRuleInputCondition_Impl returns [EObject current=null] : iv_ruleInputCondition_Impl= ruleInputCondition_Impl EOF ;
    public final EObject entryRuleInputCondition_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCondition_Impl = null;


        try {
            // InternalMSDsl.g:2130:60: (iv_ruleInputCondition_Impl= ruleInputCondition_Impl EOF )
            // InternalMSDsl.g:2131:2: iv_ruleInputCondition_Impl= ruleInputCondition_Impl EOF
            {
             newCompositeNode(grammarAccess.getInputCondition_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputCondition_Impl=ruleInputCondition_Impl();

            state._fsp--;

             current =iv_ruleInputCondition_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputCondition_Impl"


    // $ANTLR start "ruleInputCondition_Impl"
    // InternalMSDsl.g:2137:1: ruleInputCondition_Impl returns [EObject current=null] : ( () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInputCondition_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:2143:2: ( ( () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMSDsl.g:2144:2: ( () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMSDsl.g:2144:2: ( () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMSDsl.g:2145:3: () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMSDsl.g:2145:3: ()
            // InternalMSDsl.g:2146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputCondition_ImplAccess().getInputConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputCondition_ImplAccess().getInputConditionKeyword_1());
            		
            // InternalMSDsl.g:2156:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMSDsl.g:2157:4: (lv_name_2_0= ruleEString )
            {
            // InternalMSDsl.g:2157:4: (lv_name_2_0= ruleEString )
            // InternalMSDsl.g:2158:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputCondition_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputCondition_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputCondition_Impl"


    // $ANTLR start "entryRuleOutputDecision"
    // InternalMSDsl.g:2179:1: entryRuleOutputDecision returns [EObject current=null] : iv_ruleOutputDecision= ruleOutputDecision EOF ;
    public final EObject entryRuleOutputDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDecision = null;


        try {
            // InternalMSDsl.g:2179:55: (iv_ruleOutputDecision= ruleOutputDecision EOF )
            // InternalMSDsl.g:2180:2: iv_ruleOutputDecision= ruleOutputDecision EOF
            {
             newCompositeNode(grammarAccess.getOutputDecisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputDecision=ruleOutputDecision();

            state._fsp--;

             current =iv_ruleOutputDecision; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutputDecision"


    // $ANTLR start "ruleOutputDecision"
    // InternalMSDsl.g:2186:1: ruleOutputDecision returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= ',' ( ( ruleEString ) ) )* otherlv_3= 'into' ( ( ruleEString ) )? ) ;
    public final EObject ruleOutputDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMSDsl.g:2192:2: ( ( ( ( ruleEString ) ) (otherlv_1= ',' ( ( ruleEString ) ) )* otherlv_3= 'into' ( ( ruleEString ) )? ) )
            // InternalMSDsl.g:2193:2: ( ( ( ruleEString ) ) (otherlv_1= ',' ( ( ruleEString ) ) )* otherlv_3= 'into' ( ( ruleEString ) )? )
            {
            // InternalMSDsl.g:2193:2: ( ( ( ruleEString ) ) (otherlv_1= ',' ( ( ruleEString ) ) )* otherlv_3= 'into' ( ( ruleEString ) )? )
            // InternalMSDsl.g:2194:3: ( ( ruleEString ) ) (otherlv_1= ',' ( ( ruleEString ) ) )* otherlv_3= 'into' ( ( ruleEString ) )?
            {
            // InternalMSDsl.g:2194:3: ( ( ruleEString ) )
            // InternalMSDsl.g:2195:4: ( ruleEString )
            {
            // InternalMSDsl.g:2195:4: ( ruleEString )
            // InternalMSDsl.g:2196:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputDecisionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_0_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:2210:3: (otherlv_1= ',' ( ( ruleEString ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==15) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMSDsl.g:2211:4: otherlv_1= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutputDecisionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMSDsl.g:2215:4: ( ( ruleEString ) )
            	    // InternalMSDsl.g:2216:5: ( ruleEString )
            	    {
            	    // InternalMSDsl.g:2216:5: ( ruleEString )
            	    // InternalMSDsl.g:2217:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputDecisionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_3=(Token)match(input,44,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputDecisionAccess().getIntoKeyword_2());
            		
            // InternalMSDsl.g:2236:3: ( ( ruleEString ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMSDsl.g:2237:4: ( ruleEString )
                    {
                    // InternalMSDsl.g:2237:4: ( ruleEString )
                    // InternalMSDsl.g:2238:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputDecisionRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputDecision"


    // $ANTLR start "entryRuleWorkPieceCondition"
    // InternalMSDsl.g:2256:1: entryRuleWorkPieceCondition returns [EObject current=null] : iv_ruleWorkPieceCondition= ruleWorkPieceCondition EOF ;
    public final EObject entryRuleWorkPieceCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkPieceCondition = null;


        try {
            // InternalMSDsl.g:2256:59: (iv_ruleWorkPieceCondition= ruleWorkPieceCondition EOF )
            // InternalMSDsl.g:2257:2: iv_ruleWorkPieceCondition= ruleWorkPieceCondition EOF
            {
             newCompositeNode(grammarAccess.getWorkPieceConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkPieceCondition=ruleWorkPieceCondition();

            state._fsp--;

             current =iv_ruleWorkPieceCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkPieceCondition"


    // $ANTLR start "ruleWorkPieceCondition"
    // InternalMSDsl.g:2263:1: ruleWorkPieceCondition returns [EObject current=null] : (otherlv_0= 'WorkPieceCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ofType' ( ( ruleEString ) ) ) ;
    public final EObject ruleWorkPieceCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:2269:2: ( (otherlv_0= 'WorkPieceCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ofType' ( ( ruleEString ) ) ) )
            // InternalMSDsl.g:2270:2: (otherlv_0= 'WorkPieceCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ofType' ( ( ruleEString ) ) )
            {
            // InternalMSDsl.g:2270:2: (otherlv_0= 'WorkPieceCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ofType' ( ( ruleEString ) ) )
            // InternalMSDsl.g:2271:3: otherlv_0= 'WorkPieceCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ofType' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkPieceConditionAccess().getWorkPieceConditionKeyword_0());
            		
            // InternalMSDsl.g:2275:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMSDsl.g:2276:4: (lv_name_1_0= ruleEString )
            {
            // InternalMSDsl.g:2276:4: (lv_name_1_0= ruleEString )
            // InternalMSDsl.g:2277:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkPieceConditionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkPieceConditionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.assignment3.msdsl.MSDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkPieceConditionAccess().getOfTypeKeyword_2());
            		
            // InternalMSDsl.g:2298:3: ( ( ruleEString ) )
            // InternalMSDsl.g:2299:4: ( ruleEString )
            {
            // InternalMSDsl.g:2299:4: ( ruleEString )
            // InternalMSDsl.g:2300:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkPieceConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkPieceCondition"


    // $ANTLR start "entryRuleBinaryCondition"
    // InternalMSDsl.g:2318:1: entryRuleBinaryCondition returns [EObject current=null] : iv_ruleBinaryCondition= ruleBinaryCondition EOF ;
    public final EObject entryRuleBinaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryCondition = null;


        try {
            // InternalMSDsl.g:2318:56: (iv_ruleBinaryCondition= ruleBinaryCondition EOF )
            // InternalMSDsl.g:2319:2: iv_ruleBinaryCondition= ruleBinaryCondition EOF
            {
             newCompositeNode(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryCondition=ruleBinaryCondition();

            state._fsp--;

             current =iv_ruleBinaryCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // InternalMSDsl.g:2325:1: ruleBinaryCondition returns [EObject current=null] : (otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( ( ruleEString ) ) ( (lv_type_4_0= ruleBinaryType ) ) ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleBinaryCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMSDsl.g:2331:2: ( (otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( ( ruleEString ) ) ( (lv_type_4_0= ruleBinaryType ) ) ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMSDsl.g:2332:2: (otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( ( ruleEString ) ) ( (lv_type_4_0= ruleBinaryType ) ) ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMSDsl.g:2332:2: (otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( ( ruleEString ) ) ( (lv_type_4_0= ruleBinaryType ) ) ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMSDsl.g:2333:3: otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( ( ruleEString ) ) ( (lv_type_4_0= ruleBinaryType ) ) ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryConditionAccess().getBinaryConditionKeyword_0());
            		
            // InternalMSDsl.g:2337:3: ( (lv_name_1_0= ruleEString ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMSDsl.g:2338:4: (lv_name_1_0= ruleEString )
                    {
                    // InternalMSDsl.g:2338:4: (lv_name_1_0= ruleEString )
                    // InternalMSDsl.g:2339:5: lv_name_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getBinaryConditionAccess().getNameEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBinaryConditionRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.xtext.assignment3.msdsl.MSDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBinaryConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSDsl.g:2360:3: ( ( ruleEString ) )
            // InternalMSDsl.g:2361:4: ( ruleEString )
            {
            // InternalMSDsl.g:2361:4: ( ruleEString )
            // InternalMSDsl.g:2362:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryConditionAccess().getLeftInputConditionCrossReference_3_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:2376:3: ( (lv_type_4_0= ruleBinaryType ) )
            // InternalMSDsl.g:2377:4: (lv_type_4_0= ruleBinaryType )
            {
            // InternalMSDsl.g:2377:4: (lv_type_4_0= ruleBinaryType )
            // InternalMSDsl.g:2378:5: lv_type_4_0= ruleBinaryType
            {

            					newCompositeNode(grammarAccess.getBinaryConditionAccess().getTypeBinaryTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_4_0=ruleBinaryType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryConditionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.assignment3.msdsl.MSDsl.BinaryType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSDsl.g:2395:3: ( ( ruleEString ) )
            // InternalMSDsl.g:2396:4: ( ruleEString )
            {
            // InternalMSDsl.g:2396:4: ( ruleEString )
            // InternalMSDsl.g:2397:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryConditionAccess().getRightInputConditionCrossReference_5_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBinaryConditionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "entryRuleNegation"
    // InternalMSDsl.g:2419:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalMSDsl.g:2419:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalMSDsl.g:2420:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMSDsl.g:2426:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' ( ( ruleEString ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSDsl.g:2432:2: ( (otherlv_0= '!' ( ( ruleEString ) ) ) )
            // InternalMSDsl.g:2433:2: (otherlv_0= '!' ( ( ruleEString ) ) )
            {
            // InternalMSDsl.g:2433:2: (otherlv_0= '!' ( ( ruleEString ) ) )
            // InternalMSDsl.g:2434:3: otherlv_0= '!' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
            		
            // InternalMSDsl.g:2438:3: ( ( ruleEString ) )
            // InternalMSDsl.g:2439:4: ( ruleEString )
            {
            // InternalMSDsl.g:2439:4: ( ruleEString )
            // InternalMSDsl.g:2440:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNegationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNegationAccess().getContainsInputConditionCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "ruleBinaryType"
    // InternalMSDsl.g:2458:1: ruleBinaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBinaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMSDsl.g:2464:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalMSDsl.g:2465:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalMSDsl.g:2465:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==49) ) {
                alt50=1;
            }
            else if ( (LA50_0==35) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMSDsl.g:2466:3: (enumLiteral_0= 'and' )
                    {
                    // InternalMSDsl.g:2466:3: (enumLiteral_0= 'and' )
                    // InternalMSDsl.g:2467:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getBinaryTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryTypeAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSDsl.g:2474:3: (enumLiteral_1= 'or' )
                    {
                    // InternalMSDsl.g:2474:3: (enumLiteral_1= 'or' )
                    // InternalMSDsl.g:2475:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBinaryTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryTypeAccess().getOrEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000015085000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002140000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000148000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000A140000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008148000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000302040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000202040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200048000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001A80000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000800000000L});

}