package br.compiladores.jhonatan.jlanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.compiladores.jhonatan.jlanguage.services.JlanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJlanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'DECLARACOES'", "'ALGORITMO'", "'('", "')'", "'['", "']'", "'ATRIBUIR'", "'A'", "'LER'", "'IMPRIMIR'", "'SE'", "'ENTAO'", "'SENAO'", "'ENQUANTO'", "'INICIO'", "'FIM'", "'INTEIRO'", "'REAL'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'='", "'E'", "'OU'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJlanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJlanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJlanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJlanguage.g"; }



     	private JlanguageGrammarAccess grammarAccess;

        public InternalJlanguageParser(TokenStream input, JlanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programa";
       	}

       	@Override
       	protected JlanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrograma"
    // InternalJlanguage.g:64:1: entryRulePrograma returns [EObject current=null] : iv_rulePrograma= rulePrograma EOF ;
    public final EObject entryRulePrograma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrograma = null;


        try {
            // InternalJlanguage.g:64:49: (iv_rulePrograma= rulePrograma EOF )
            // InternalJlanguage.g:65:2: iv_rulePrograma= rulePrograma EOF
            {
             newCompositeNode(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrograma=rulePrograma();

            state._fsp--;

             current =iv_rulePrograma; 
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
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // InternalJlanguage.g:71:1: rulePrograma returns [EObject current=null] : (otherlv_0= ':' otherlv_1= 'DECLARACOES' ( (lv_declaracoes_2_0= ruleDeclaracao ) )+ otherlv_3= ':' otherlv_4= 'ALGORITMO' ( (lv_comandos_5_0= ruleComando ) )+ ) ;
    public final EObject rulePrograma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_declaracoes_2_0 = null;

        EObject lv_comandos_5_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:77:2: ( (otherlv_0= ':' otherlv_1= 'DECLARACOES' ( (lv_declaracoes_2_0= ruleDeclaracao ) )+ otherlv_3= ':' otherlv_4= 'ALGORITMO' ( (lv_comandos_5_0= ruleComando ) )+ ) )
            // InternalJlanguage.g:78:2: (otherlv_0= ':' otherlv_1= 'DECLARACOES' ( (lv_declaracoes_2_0= ruleDeclaracao ) )+ otherlv_3= ':' otherlv_4= 'ALGORITMO' ( (lv_comandos_5_0= ruleComando ) )+ )
            {
            // InternalJlanguage.g:78:2: (otherlv_0= ':' otherlv_1= 'DECLARACOES' ( (lv_declaracoes_2_0= ruleDeclaracao ) )+ otherlv_3= ':' otherlv_4= 'ALGORITMO' ( (lv_comandos_5_0= ruleComando ) )+ )
            // InternalJlanguage.g:79:3: otherlv_0= ':' otherlv_1= 'DECLARACOES' ( (lv_declaracoes_2_0= ruleDeclaracao ) )+ otherlv_3= ':' otherlv_4= 'ALGORITMO' ( (lv_comandos_5_0= ruleComando ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramaAccess().getColonKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramaAccess().getDECLARACOESKeyword_1());
            		
            // InternalJlanguage.g:87:3: ( (lv_declaracoes_2_0= ruleDeclaracao ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJlanguage.g:88:4: (lv_declaracoes_2_0= ruleDeclaracao )
            	    {
            	    // InternalJlanguage.g:88:4: (lv_declaracoes_2_0= ruleDeclaracao )
            	    // InternalJlanguage.g:89:5: lv_declaracoes_2_0= ruleDeclaracao
            	    {

            	    					newCompositeNode(grammarAccess.getProgramaAccess().getDeclaracoesDeclaracaoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_declaracoes_2_0=ruleDeclaracao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declaracoes",
            	    						lv_declaracoes_2_0,
            	    						"br.compiladores.jhonatan.jlanguage.Jlanguage.Declaracao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramaAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramaAccess().getALGORITMOKeyword_4());
            		
            // InternalJlanguage.g:114:3: ( (lv_comandos_5_0= ruleComando ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||(LA2_0>=20 && LA2_0<=22)||(LA2_0>=25 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJlanguage.g:115:4: (lv_comandos_5_0= ruleComando )
            	    {
            	    // InternalJlanguage.g:115:4: (lv_comandos_5_0= ruleComando )
            	    // InternalJlanguage.g:116:5: lv_comandos_5_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getProgramaAccess().getComandosComandoParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_comandos_5_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_5_0,
            	    						"br.compiladores.jhonatan.jlanguage.Jlanguage.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleDeclaracao"
    // InternalJlanguage.g:137:1: entryRuleDeclaracao returns [EObject current=null] : iv_ruleDeclaracao= ruleDeclaracao EOF ;
    public final EObject entryRuleDeclaracao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracao = null;


        try {
            // InternalJlanguage.g:137:51: (iv_ruleDeclaracao= ruleDeclaracao EOF )
            // InternalJlanguage.g:138:2: iv_ruleDeclaracao= ruleDeclaracao EOF
            {
             newCompositeNode(grammarAccess.getDeclaracaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaracao=ruleDeclaracao();

            state._fsp--;

             current =iv_ruleDeclaracao; 
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
    // $ANTLR end "entryRuleDeclaracao"


    // $ANTLR start "ruleDeclaracao"
    // InternalJlanguage.g:144:1: ruleDeclaracao returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipo_2_0= ruleTipoVar ) ) ) ;
    public final EObject ruleDeclaracao() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_tipo_2_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:150:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipo_2_0= ruleTipoVar ) ) ) )
            // InternalJlanguage.g:151:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipo_2_0= ruleTipoVar ) ) )
            {
            // InternalJlanguage.g:151:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipo_2_0= ruleTipoVar ) ) )
            // InternalJlanguage.g:152:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipo_2_0= ruleTipoVar ) )
            {
            // InternalJlanguage.g:152:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJlanguage.g:153:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJlanguage.g:153:4: (lv_name_0_0= RULE_ID )
            // InternalJlanguage.g:154:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeclaracaoAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaracaoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaracaoAccess().getColonKeyword_1());
            		
            // InternalJlanguage.g:174:3: ( (lv_tipo_2_0= ruleTipoVar ) )
            // InternalJlanguage.g:175:4: (lv_tipo_2_0= ruleTipoVar )
            {
            // InternalJlanguage.g:175:4: (lv_tipo_2_0= ruleTipoVar )
            // InternalJlanguage.g:176:5: lv_tipo_2_0= ruleTipoVar
            {

            					newCompositeNode(grammarAccess.getDeclaracaoAccess().getTipoTipoVarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_tipo_2_0=ruleTipoVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclaracaoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_2_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.TipoVar");
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
    // $ANTLR end "ruleDeclaracao"


    // $ANTLR start "entryRuleExpressaoAritmetica"
    // InternalJlanguage.g:197:1: entryRuleExpressaoAritmetica returns [EObject current=null] : iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF ;
    public final EObject entryRuleExpressaoAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressaoAritmetica = null;


        try {
            // InternalJlanguage.g:197:60: (iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF )
            // InternalJlanguage.g:198:2: iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpressaoAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressaoAritmetica=ruleExpressaoAritmetica();

            state._fsp--;

             current =iv_ruleExpressaoAritmetica; 
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
    // $ANTLR end "entryRuleExpressaoAritmetica"


    // $ANTLR start "ruleExpressaoAritmetica"
    // InternalJlanguage.g:204:1: ruleExpressaoAritmetica returns [EObject current=null] : ( ( (lv_termo1_0_0= ruleTermoAritmetico ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoAritmetico ) )* ) ;
    public final EObject ruleExpressaoAritmetica() throws RecognitionException {
        EObject current = null;

        EObject lv_termo1_0_0 = null;

        EObject lv_outrosTermos_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:210:2: ( ( ( (lv_termo1_0_0= ruleTermoAritmetico ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoAritmetico ) )* ) )
            // InternalJlanguage.g:211:2: ( ( (lv_termo1_0_0= ruleTermoAritmetico ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoAritmetico ) )* )
            {
            // InternalJlanguage.g:211:2: ( ( (lv_termo1_0_0= ruleTermoAritmetico ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoAritmetico ) )* )
            // InternalJlanguage.g:212:3: ( (lv_termo1_0_0= ruleTermoAritmetico ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoAritmetico ) )*
            {
            // InternalJlanguage.g:212:3: ( (lv_termo1_0_0= ruleTermoAritmetico ) )
            // InternalJlanguage.g:213:4: (lv_termo1_0_0= ruleTermoAritmetico )
            {
            // InternalJlanguage.g:213:4: (lv_termo1_0_0= ruleTermoAritmetico )
            // InternalJlanguage.g:214:5: lv_termo1_0_0= ruleTermoAritmetico
            {

            					newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getTermo1TermoAritmeticoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_termo1_0_0=ruleTermoAritmetico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
            					}
            					set(
            						current,
            						"termo1",
            						lv_termo1_0_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.TermoAritmetico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:231:3: ( (lv_outrosTermos_1_0= ruleOutroTermoAritmetico ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=30 && LA3_0<=31)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJlanguage.g:232:4: (lv_outrosTermos_1_0= ruleOutroTermoAritmetico )
            	    {
            	    // InternalJlanguage.g:232:4: (lv_outrosTermos_1_0= ruleOutroTermoAritmetico )
            	    // InternalJlanguage.g:233:5: lv_outrosTermos_1_0= ruleOutroTermoAritmetico
            	    {

            	    					newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getOutrosTermosOutroTermoAritmeticoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_outrosTermos_1_0=ruleOutroTermoAritmetico();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outrosTermos",
            	    						lv_outrosTermos_1_0,
            	    						"br.compiladores.jhonatan.jlanguage.Jlanguage.OutroTermoAritmetico");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressaoAritmetica"


    // $ANTLR start "entryRuleOutroTermoAritmetico"
    // InternalJlanguage.g:254:1: entryRuleOutroTermoAritmetico returns [EObject current=null] : iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF ;
    public final EObject entryRuleOutroTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutroTermoAritmetico = null;


        try {
            // InternalJlanguage.g:254:61: (iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF )
            // InternalJlanguage.g:255:2: iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF
            {
             newCompositeNode(grammarAccess.getOutroTermoAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutroTermoAritmetico=ruleOutroTermoAritmetico();

            state._fsp--;

             current =iv_ruleOutroTermoAritmetico; 
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
    // $ANTLR end "entryRuleOutroTermoAritmetico"


    // $ANTLR start "ruleOutroTermoAritmetico"
    // InternalJlanguage.g:261:1: ruleOutroTermoAritmetico returns [EObject current=null] : ( ( (lv_operador_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) ) ;
    public final EObject ruleOutroTermoAritmetico() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operador_0_0 = null;

        EObject lv_termo_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:267:2: ( ( ( (lv_operador_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) ) )
            // InternalJlanguage.g:268:2: ( ( (lv_operador_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) )
            {
            // InternalJlanguage.g:268:2: ( ( (lv_operador_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) )
            // InternalJlanguage.g:269:3: ( (lv_operador_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) )
            {
            // InternalJlanguage.g:269:3: ( (lv_operador_0_0= ruleOpArit1 ) )
            // InternalJlanguage.g:270:4: (lv_operador_0_0= ruleOpArit1 )
            {
            // InternalJlanguage.g:270:4: (lv_operador_0_0= ruleOpArit1 )
            // InternalJlanguage.g:271:5: lv_operador_0_0= ruleOpArit1
            {

            					newCompositeNode(grammarAccess.getOutroTermoAritmeticoAccess().getOperadorOpArit1ParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_operador_0_0=ruleOpArit1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroTermoAritmeticoRule());
            					}
            					set(
            						current,
            						"operador",
            						lv_operador_0_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.OpArit1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:288:3: ( (lv_termo_1_0= ruleTermoAritmetico ) )
            // InternalJlanguage.g:289:4: (lv_termo_1_0= ruleTermoAritmetico )
            {
            // InternalJlanguage.g:289:4: (lv_termo_1_0= ruleTermoAritmetico )
            // InternalJlanguage.g:290:5: lv_termo_1_0= ruleTermoAritmetico
            {

            					newCompositeNode(grammarAccess.getOutroTermoAritmeticoAccess().getTermoTermoAritmeticoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_termo_1_0=ruleTermoAritmetico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroTermoAritmeticoRule());
            					}
            					set(
            						current,
            						"termo",
            						lv_termo_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.TermoAritmetico");
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
    // $ANTLR end "ruleOutroTermoAritmetico"


    // $ANTLR start "entryRuleTermoAritmetico"
    // InternalJlanguage.g:311:1: entryRuleTermoAritmetico returns [EObject current=null] : iv_ruleTermoAritmetico= ruleTermoAritmetico EOF ;
    public final EObject entryRuleTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoAritmetico = null;


        try {
            // InternalJlanguage.g:311:56: (iv_ruleTermoAritmetico= ruleTermoAritmetico EOF )
            // InternalJlanguage.g:312:2: iv_ruleTermoAritmetico= ruleTermoAritmetico EOF
            {
             newCompositeNode(grammarAccess.getTermoAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermoAritmetico=ruleTermoAritmetico();

            state._fsp--;

             current =iv_ruleTermoAritmetico; 
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
    // $ANTLR end "entryRuleTermoAritmetico"


    // $ANTLR start "ruleTermoAritmetico"
    // InternalJlanguage.g:318:1: ruleTermoAritmetico returns [EObject current=null] : ( ( (lv_fator1_0_0= ruleFatorAritmetico ) ) ( (lv_outrosFatores_1_0= ruleOutroFatorAritmetico ) )* ) ;
    public final EObject ruleTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject lv_fator1_0_0 = null;

        EObject lv_outrosFatores_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:324:2: ( ( ( (lv_fator1_0_0= ruleFatorAritmetico ) ) ( (lv_outrosFatores_1_0= ruleOutroFatorAritmetico ) )* ) )
            // InternalJlanguage.g:325:2: ( ( (lv_fator1_0_0= ruleFatorAritmetico ) ) ( (lv_outrosFatores_1_0= ruleOutroFatorAritmetico ) )* )
            {
            // InternalJlanguage.g:325:2: ( ( (lv_fator1_0_0= ruleFatorAritmetico ) ) ( (lv_outrosFatores_1_0= ruleOutroFatorAritmetico ) )* )
            // InternalJlanguage.g:326:3: ( (lv_fator1_0_0= ruleFatorAritmetico ) ) ( (lv_outrosFatores_1_0= ruleOutroFatorAritmetico ) )*
            {
            // InternalJlanguage.g:326:3: ( (lv_fator1_0_0= ruleFatorAritmetico ) )
            // InternalJlanguage.g:327:4: (lv_fator1_0_0= ruleFatorAritmetico )
            {
            // InternalJlanguage.g:327:4: (lv_fator1_0_0= ruleFatorAritmetico )
            // InternalJlanguage.g:328:5: lv_fator1_0_0= ruleFatorAritmetico
            {

            					newCompositeNode(grammarAccess.getTermoAritmeticoAccess().getFator1FatorAritmeticoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_fator1_0_0=ruleFatorAritmetico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoAritmeticoRule());
            					}
            					set(
            						current,
            						"fator1",
            						lv_fator1_0_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.FatorAritmetico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:345:3: ( (lv_outrosFatores_1_0= ruleOutroFatorAritmetico ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=32 && LA4_0<=33)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJlanguage.g:346:4: (lv_outrosFatores_1_0= ruleOutroFatorAritmetico )
            	    {
            	    // InternalJlanguage.g:346:4: (lv_outrosFatores_1_0= ruleOutroFatorAritmetico )
            	    // InternalJlanguage.g:347:5: lv_outrosFatores_1_0= ruleOutroFatorAritmetico
            	    {

            	    					newCompositeNode(grammarAccess.getTermoAritmeticoAccess().getOutrosFatoresOutroFatorAritmeticoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_outrosFatores_1_0=ruleOutroFatorAritmetico();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTermoAritmeticoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outrosFatores",
            	    						lv_outrosFatores_1_0,
            	    						"br.compiladores.jhonatan.jlanguage.Jlanguage.OutroFatorAritmetico");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleTermoAritmetico"


    // $ANTLR start "entryRuleOutroFatorAritmetico"
    // InternalJlanguage.g:368:1: entryRuleOutroFatorAritmetico returns [EObject current=null] : iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF ;
    public final EObject entryRuleOutroFatorAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutroFatorAritmetico = null;


        try {
            // InternalJlanguage.g:368:61: (iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF )
            // InternalJlanguage.g:369:2: iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF
            {
             newCompositeNode(grammarAccess.getOutroFatorAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutroFatorAritmetico=ruleOutroFatorAritmetico();

            state._fsp--;

             current =iv_ruleOutroFatorAritmetico; 
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
    // $ANTLR end "entryRuleOutroFatorAritmetico"


    // $ANTLR start "ruleOutroFatorAritmetico"
    // InternalJlanguage.g:375:1: ruleOutroFatorAritmetico returns [EObject current=null] : ( ( (lv_operador_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) ) ;
    public final EObject ruleOutroFatorAritmetico() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operador_0_0 = null;

        EObject lv_fator_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:381:2: ( ( ( (lv_operador_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) ) )
            // InternalJlanguage.g:382:2: ( ( (lv_operador_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) )
            {
            // InternalJlanguage.g:382:2: ( ( (lv_operador_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) )
            // InternalJlanguage.g:383:3: ( (lv_operador_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) )
            {
            // InternalJlanguage.g:383:3: ( (lv_operador_0_0= ruleOpArit2 ) )
            // InternalJlanguage.g:384:4: (lv_operador_0_0= ruleOpArit2 )
            {
            // InternalJlanguage.g:384:4: (lv_operador_0_0= ruleOpArit2 )
            // InternalJlanguage.g:385:5: lv_operador_0_0= ruleOpArit2
            {

            					newCompositeNode(grammarAccess.getOutroFatorAritmeticoAccess().getOperadorOpArit2ParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_operador_0_0=ruleOpArit2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroFatorAritmeticoRule());
            					}
            					set(
            						current,
            						"operador",
            						lv_operador_0_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.OpArit2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:402:3: ( (lv_fator_1_0= ruleFatorAritmetico ) )
            // InternalJlanguage.g:403:4: (lv_fator_1_0= ruleFatorAritmetico )
            {
            // InternalJlanguage.g:403:4: (lv_fator_1_0= ruleFatorAritmetico )
            // InternalJlanguage.g:404:5: lv_fator_1_0= ruleFatorAritmetico
            {

            					newCompositeNode(grammarAccess.getOutroFatorAritmeticoAccess().getFatorFatorAritmeticoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_fator_1_0=ruleFatorAritmetico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroFatorAritmeticoRule());
            					}
            					set(
            						current,
            						"fator",
            						lv_fator_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.FatorAritmetico");
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
    // $ANTLR end "ruleOutroFatorAritmetico"


    // $ANTLR start "entryRuleFatorAritmetico"
    // InternalJlanguage.g:425:1: entryRuleFatorAritmetico returns [EObject current=null] : iv_ruleFatorAritmetico= ruleFatorAritmetico EOF ;
    public final EObject entryRuleFatorAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFatorAritmetico = null;


        try {
            // InternalJlanguage.g:425:56: (iv_ruleFatorAritmetico= ruleFatorAritmetico EOF )
            // InternalJlanguage.g:426:2: iv_ruleFatorAritmetico= ruleFatorAritmetico EOF
            {
             newCompositeNode(grammarAccess.getFatorAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFatorAritmetico=ruleFatorAritmetico();

            state._fsp--;

             current =iv_ruleFatorAritmetico; 
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
    // $ANTLR end "entryRuleFatorAritmetico"


    // $ANTLR start "ruleFatorAritmetico"
    // InternalJlanguage.g:432:1: ruleFatorAritmetico returns [EObject current=null] : (this_FatorNumero_0= ruleFatorNumero | this_FatorVariavel_1= ruleFatorVariavel | this_FatorSubExpressao_2= ruleFatorSubExpressao ) ;
    public final EObject ruleFatorAritmetico() throws RecognitionException {
        EObject current = null;

        EObject this_FatorNumero_0 = null;

        EObject this_FatorVariavel_1 = null;

        EObject this_FatorSubExpressao_2 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:438:2: ( (this_FatorNumero_0= ruleFatorNumero | this_FatorVariavel_1= ruleFatorVariavel | this_FatorSubExpressao_2= ruleFatorSubExpressao ) )
            // InternalJlanguage.g:439:2: (this_FatorNumero_0= ruleFatorNumero | this_FatorVariavel_1= ruleFatorVariavel | this_FatorSubExpressao_2= ruleFatorSubExpressao )
            {
            // InternalJlanguage.g:439:2: (this_FatorNumero_0= ruleFatorNumero | this_FatorVariavel_1= ruleFatorVariavel | this_FatorSubExpressao_2= ruleFatorSubExpressao )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJlanguage.g:440:3: this_FatorNumero_0= ruleFatorNumero
                    {

                    			newCompositeNode(grammarAccess.getFatorAritmeticoAccess().getFatorNumeroParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FatorNumero_0=ruleFatorNumero();

                    state._fsp--;


                    			current = this_FatorNumero_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:449:3: this_FatorVariavel_1= ruleFatorVariavel
                    {

                    			newCompositeNode(grammarAccess.getFatorAritmeticoAccess().getFatorVariavelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FatorVariavel_1=ruleFatorVariavel();

                    state._fsp--;


                    			current = this_FatorVariavel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJlanguage.g:458:3: this_FatorSubExpressao_2= ruleFatorSubExpressao
                    {

                    			newCompositeNode(grammarAccess.getFatorAritmeticoAccess().getFatorSubExpressaoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FatorSubExpressao_2=ruleFatorSubExpressao();

                    state._fsp--;


                    			current = this_FatorSubExpressao_2;
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
    // $ANTLR end "ruleFatorAritmetico"


    // $ANTLR start "entryRuleFatorNumero"
    // InternalJlanguage.g:470:1: entryRuleFatorNumero returns [EObject current=null] : iv_ruleFatorNumero= ruleFatorNumero EOF ;
    public final EObject entryRuleFatorNumero() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFatorNumero = null;


        try {
            // InternalJlanguage.g:470:52: (iv_ruleFatorNumero= ruleFatorNumero EOF )
            // InternalJlanguage.g:471:2: iv_ruleFatorNumero= ruleFatorNumero EOF
            {
             newCompositeNode(grammarAccess.getFatorNumeroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFatorNumero=ruleFatorNumero();

            state._fsp--;

             current =iv_ruleFatorNumero; 
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
    // $ANTLR end "entryRuleFatorNumero"


    // $ANTLR start "ruleFatorNumero"
    // InternalJlanguage.g:477:1: ruleFatorNumero returns [EObject current=null] : ( (lv_numero_0_0= RULE_INT ) ) ;
    public final EObject ruleFatorNumero() throws RecognitionException {
        EObject current = null;

        Token lv_numero_0_0=null;


        	enterRule();

        try {
            // InternalJlanguage.g:483:2: ( ( (lv_numero_0_0= RULE_INT ) ) )
            // InternalJlanguage.g:484:2: ( (lv_numero_0_0= RULE_INT ) )
            {
            // InternalJlanguage.g:484:2: ( (lv_numero_0_0= RULE_INT ) )
            // InternalJlanguage.g:485:3: (lv_numero_0_0= RULE_INT )
            {
            // InternalJlanguage.g:485:3: (lv_numero_0_0= RULE_INT )
            // InternalJlanguage.g:486:4: lv_numero_0_0= RULE_INT
            {
            lv_numero_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_numero_0_0, grammarAccess.getFatorNumeroAccess().getNumeroINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFatorNumeroRule());
            				}
            				setWithLastConsumed(
            					current,
            					"numero",
            					lv_numero_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleFatorNumero"


    // $ANTLR start "entryRuleFatorVariavel"
    // InternalJlanguage.g:505:1: entryRuleFatorVariavel returns [EObject current=null] : iv_ruleFatorVariavel= ruleFatorVariavel EOF ;
    public final EObject entryRuleFatorVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFatorVariavel = null;


        try {
            // InternalJlanguage.g:505:54: (iv_ruleFatorVariavel= ruleFatorVariavel EOF )
            // InternalJlanguage.g:506:2: iv_ruleFatorVariavel= ruleFatorVariavel EOF
            {
             newCompositeNode(grammarAccess.getFatorVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFatorVariavel=ruleFatorVariavel();

            state._fsp--;

             current =iv_ruleFatorVariavel; 
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
    // $ANTLR end "entryRuleFatorVariavel"


    // $ANTLR start "ruleFatorVariavel"
    // InternalJlanguage.g:512:1: ruleFatorVariavel returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFatorVariavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalJlanguage.g:518:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalJlanguage.g:519:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalJlanguage.g:519:2: ( (otherlv_0= RULE_ID ) )
            // InternalJlanguage.g:520:3: (otherlv_0= RULE_ID )
            {
            // InternalJlanguage.g:520:3: (otherlv_0= RULE_ID )
            // InternalJlanguage.g:521:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFatorVariavelRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getFatorVariavelAccess().getVariavelDeclaracaoCrossReference_0());
            			

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
    // $ANTLR end "ruleFatorVariavel"


    // $ANTLR start "entryRuleFatorSubExpressao"
    // InternalJlanguage.g:535:1: entryRuleFatorSubExpressao returns [EObject current=null] : iv_ruleFatorSubExpressao= ruleFatorSubExpressao EOF ;
    public final EObject entryRuleFatorSubExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFatorSubExpressao = null;


        try {
            // InternalJlanguage.g:535:58: (iv_ruleFatorSubExpressao= ruleFatorSubExpressao EOF )
            // InternalJlanguage.g:536:2: iv_ruleFatorSubExpressao= ruleFatorSubExpressao EOF
            {
             newCompositeNode(grammarAccess.getFatorSubExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFatorSubExpressao=ruleFatorSubExpressao();

            state._fsp--;

             current =iv_ruleFatorSubExpressao; 
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
    // $ANTLR end "entryRuleFatorSubExpressao"


    // $ANTLR start "ruleFatorSubExpressao"
    // InternalJlanguage.g:542:1: ruleFatorSubExpressao returns [EObject current=null] : (otherlv_0= '(' ( (lv_expressao_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ')' ) ;
    public final EObject ruleFatorSubExpressao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressao_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:548:2: ( (otherlv_0= '(' ( (lv_expressao_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ')' ) )
            // InternalJlanguage.g:549:2: (otherlv_0= '(' ( (lv_expressao_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ')' )
            {
            // InternalJlanguage.g:549:2: (otherlv_0= '(' ( (lv_expressao_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ')' )
            // InternalJlanguage.g:550:3: otherlv_0= '(' ( (lv_expressao_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFatorSubExpressaoAccess().getLeftParenthesisKeyword_0());
            		
            // InternalJlanguage.g:554:3: ( (lv_expressao_1_0= ruleExpressaoAritmetica ) )
            // InternalJlanguage.g:555:4: (lv_expressao_1_0= ruleExpressaoAritmetica )
            {
            // InternalJlanguage.g:555:4: (lv_expressao_1_0= ruleExpressaoAritmetica )
            // InternalJlanguage.g:556:5: lv_expressao_1_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getFatorSubExpressaoAccess().getExpressaoExpressaoAritmeticaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_expressao_1_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFatorSubExpressaoRule());
            					}
            					set(
            						current,
            						"expressao",
            						lv_expressao_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFatorSubExpressaoAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleFatorSubExpressao"


    // $ANTLR start "entryRuleExpressaoRelacional"
    // InternalJlanguage.g:581:1: entryRuleExpressaoRelacional returns [EObject current=null] : iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF ;
    public final EObject entryRuleExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressaoRelacional = null;


        try {
            // InternalJlanguage.g:581:60: (iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF )
            // InternalJlanguage.g:582:2: iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressaoRelacional=ruleExpressaoRelacional();

            state._fsp--;

             current =iv_ruleExpressaoRelacional; 
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
    // $ANTLR end "entryRuleExpressaoRelacional"


    // $ANTLR start "ruleExpressaoRelacional"
    // InternalJlanguage.g:588:1: ruleExpressaoRelacional returns [EObject current=null] : ( ( (lv_termo1_0_0= ruleTermoRelacional ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoRelacional ) )* ) ;
    public final EObject ruleExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject lv_termo1_0_0 = null;

        EObject lv_outrosTermos_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:594:2: ( ( ( (lv_termo1_0_0= ruleTermoRelacional ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoRelacional ) )* ) )
            // InternalJlanguage.g:595:2: ( ( (lv_termo1_0_0= ruleTermoRelacional ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoRelacional ) )* )
            {
            // InternalJlanguage.g:595:2: ( ( (lv_termo1_0_0= ruleTermoRelacional ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoRelacional ) )* )
            // InternalJlanguage.g:596:3: ( (lv_termo1_0_0= ruleTermoRelacional ) ) ( (lv_outrosTermos_1_0= ruleOutroTermoRelacional ) )*
            {
            // InternalJlanguage.g:596:3: ( (lv_termo1_0_0= ruleTermoRelacional ) )
            // InternalJlanguage.g:597:4: (lv_termo1_0_0= ruleTermoRelacional )
            {
            // InternalJlanguage.g:597:4: (lv_termo1_0_0= ruleTermoRelacional )
            // InternalJlanguage.g:598:5: lv_termo1_0_0= ruleTermoRelacional
            {

            					newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getTermo1TermoRelacionalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_termo1_0_0=ruleTermoRelacional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
            					}
            					set(
            						current,
            						"termo1",
            						lv_termo1_0_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.TermoRelacional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:615:3: ( (lv_outrosTermos_1_0= ruleOutroTermoRelacional ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=40 && LA6_0<=41)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJlanguage.g:616:4: (lv_outrosTermos_1_0= ruleOutroTermoRelacional )
            	    {
            	    // InternalJlanguage.g:616:4: (lv_outrosTermos_1_0= ruleOutroTermoRelacional )
            	    // InternalJlanguage.g:617:5: lv_outrosTermos_1_0= ruleOutroTermoRelacional
            	    {

            	    					newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getOutrosTermosOutroTermoRelacionalParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_outrosTermos_1_0=ruleOutroTermoRelacional();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outrosTermos",
            	    						lv_outrosTermos_1_0,
            	    						"br.compiladores.jhonatan.jlanguage.Jlanguage.OutroTermoRelacional");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressaoRelacional"


    // $ANTLR start "entryRuleOutroTermoRelacional"
    // InternalJlanguage.g:638:1: entryRuleOutroTermoRelacional returns [EObject current=null] : iv_ruleOutroTermoRelacional= ruleOutroTermoRelacional EOF ;
    public final EObject entryRuleOutroTermoRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutroTermoRelacional = null;


        try {
            // InternalJlanguage.g:638:61: (iv_ruleOutroTermoRelacional= ruleOutroTermoRelacional EOF )
            // InternalJlanguage.g:639:2: iv_ruleOutroTermoRelacional= ruleOutroTermoRelacional EOF
            {
             newCompositeNode(grammarAccess.getOutroTermoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutroTermoRelacional=ruleOutroTermoRelacional();

            state._fsp--;

             current =iv_ruleOutroTermoRelacional; 
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
    // $ANTLR end "entryRuleOutroTermoRelacional"


    // $ANTLR start "ruleOutroTermoRelacional"
    // InternalJlanguage.g:645:1: ruleOutroTermoRelacional returns [EObject current=null] : ( ( (lv_operador_0_0= ruleOpBool ) ) ( (lv_termo_1_0= ruleTermoRelacional ) ) ) ;
    public final EObject ruleOutroTermoRelacional() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operador_0_0 = null;

        EObject lv_termo_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:651:2: ( ( ( (lv_operador_0_0= ruleOpBool ) ) ( (lv_termo_1_0= ruleTermoRelacional ) ) ) )
            // InternalJlanguage.g:652:2: ( ( (lv_operador_0_0= ruleOpBool ) ) ( (lv_termo_1_0= ruleTermoRelacional ) ) )
            {
            // InternalJlanguage.g:652:2: ( ( (lv_operador_0_0= ruleOpBool ) ) ( (lv_termo_1_0= ruleTermoRelacional ) ) )
            // InternalJlanguage.g:653:3: ( (lv_operador_0_0= ruleOpBool ) ) ( (lv_termo_1_0= ruleTermoRelacional ) )
            {
            // InternalJlanguage.g:653:3: ( (lv_operador_0_0= ruleOpBool ) )
            // InternalJlanguage.g:654:4: (lv_operador_0_0= ruleOpBool )
            {
            // InternalJlanguage.g:654:4: (lv_operador_0_0= ruleOpBool )
            // InternalJlanguage.g:655:5: lv_operador_0_0= ruleOpBool
            {

            					newCompositeNode(grammarAccess.getOutroTermoRelacionalAccess().getOperadorOpBoolParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_operador_0_0=ruleOpBool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroTermoRelacionalRule());
            					}
            					set(
            						current,
            						"operador",
            						lv_operador_0_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.OpBool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:672:3: ( (lv_termo_1_0= ruleTermoRelacional ) )
            // InternalJlanguage.g:673:4: (lv_termo_1_0= ruleTermoRelacional )
            {
            // InternalJlanguage.g:673:4: (lv_termo_1_0= ruleTermoRelacional )
            // InternalJlanguage.g:674:5: lv_termo_1_0= ruleTermoRelacional
            {

            					newCompositeNode(grammarAccess.getOutroTermoRelacionalAccess().getTermoTermoRelacionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_termo_1_0=ruleTermoRelacional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroTermoRelacionalRule());
            					}
            					set(
            						current,
            						"termo",
            						lv_termo_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.TermoRelacional");
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
    // $ANTLR end "ruleOutroTermoRelacional"


    // $ANTLR start "entryRuleTermoRelacional"
    // InternalJlanguage.g:695:1: entryRuleTermoRelacional returns [EObject current=null] : iv_ruleTermoRelacional= ruleTermoRelacional EOF ;
    public final EObject entryRuleTermoRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoRelacional = null;


        try {
            // InternalJlanguage.g:695:56: (iv_ruleTermoRelacional= ruleTermoRelacional EOF )
            // InternalJlanguage.g:696:2: iv_ruleTermoRelacional= ruleTermoRelacional EOF
            {
             newCompositeNode(grammarAccess.getTermoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermoRelacional=ruleTermoRelacional();

            state._fsp--;

             current =iv_ruleTermoRelacional; 
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
    // $ANTLR end "entryRuleTermoRelacional"


    // $ANTLR start "ruleTermoRelacional"
    // InternalJlanguage.g:702:1: ruleTermoRelacional returns [EObject current=null] : (this_TermoComparacaoRelacional_0= ruleTermoComparacaoRelacional | this_TermoSubExpressaoRelacional_1= ruleTermoSubExpressaoRelacional ) ;
    public final EObject ruleTermoRelacional() throws RecognitionException {
        EObject current = null;

        EObject this_TermoComparacaoRelacional_0 = null;

        EObject this_TermoSubExpressaoRelacional_1 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:708:2: ( (this_TermoComparacaoRelacional_0= ruleTermoComparacaoRelacional | this_TermoSubExpressaoRelacional_1= ruleTermoSubExpressaoRelacional ) )
            // InternalJlanguage.g:709:2: (this_TermoComparacaoRelacional_0= ruleTermoComparacaoRelacional | this_TermoSubExpressaoRelacional_1= ruleTermoSubExpressaoRelacional )
            {
            // InternalJlanguage.g:709:2: (this_TermoComparacaoRelacional_0= ruleTermoComparacaoRelacional | this_TermoSubExpressaoRelacional_1= ruleTermoSubExpressaoRelacional )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJlanguage.g:710:3: this_TermoComparacaoRelacional_0= ruleTermoComparacaoRelacional
                    {

                    			newCompositeNode(grammarAccess.getTermoRelacionalAccess().getTermoComparacaoRelacionalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TermoComparacaoRelacional_0=ruleTermoComparacaoRelacional();

                    state._fsp--;


                    			current = this_TermoComparacaoRelacional_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:719:3: this_TermoSubExpressaoRelacional_1= ruleTermoSubExpressaoRelacional
                    {

                    			newCompositeNode(grammarAccess.getTermoRelacionalAccess().getTermoSubExpressaoRelacionalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TermoSubExpressaoRelacional_1=ruleTermoSubExpressaoRelacional();

                    state._fsp--;


                    			current = this_TermoSubExpressaoRelacional_1;
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
    // $ANTLR end "ruleTermoRelacional"


    // $ANTLR start "entryRuleTermoComparacaoRelacional"
    // InternalJlanguage.g:731:1: entryRuleTermoComparacaoRelacional returns [EObject current=null] : iv_ruleTermoComparacaoRelacional= ruleTermoComparacaoRelacional EOF ;
    public final EObject entryRuleTermoComparacaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoComparacaoRelacional = null;


        try {
            // InternalJlanguage.g:731:66: (iv_ruleTermoComparacaoRelacional= ruleTermoComparacaoRelacional EOF )
            // InternalJlanguage.g:732:2: iv_ruleTermoComparacaoRelacional= ruleTermoComparacaoRelacional EOF
            {
             newCompositeNode(grammarAccess.getTermoComparacaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermoComparacaoRelacional=ruleTermoComparacaoRelacional();

            state._fsp--;

             current =iv_ruleTermoComparacaoRelacional; 
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
    // $ANTLR end "entryRuleTermoComparacaoRelacional"


    // $ANTLR start "ruleTermoComparacaoRelacional"
    // InternalJlanguage.g:738:1: ruleTermoComparacaoRelacional returns [EObject current=null] : ( ( (lv_expr1_0_0= ruleExpressaoAritmetica ) ) ( (lv_opRel_1_0= ruleOpRel ) ) ( (lv_expr2_2_0= ruleExpressaoAritmetica ) ) ) ;
    public final EObject ruleTermoComparacaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject lv_expr1_0_0 = null;

        AntlrDatatypeRuleToken lv_opRel_1_0 = null;

        EObject lv_expr2_2_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:744:2: ( ( ( (lv_expr1_0_0= ruleExpressaoAritmetica ) ) ( (lv_opRel_1_0= ruleOpRel ) ) ( (lv_expr2_2_0= ruleExpressaoAritmetica ) ) ) )
            // InternalJlanguage.g:745:2: ( ( (lv_expr1_0_0= ruleExpressaoAritmetica ) ) ( (lv_opRel_1_0= ruleOpRel ) ) ( (lv_expr2_2_0= ruleExpressaoAritmetica ) ) )
            {
            // InternalJlanguage.g:745:2: ( ( (lv_expr1_0_0= ruleExpressaoAritmetica ) ) ( (lv_opRel_1_0= ruleOpRel ) ) ( (lv_expr2_2_0= ruleExpressaoAritmetica ) ) )
            // InternalJlanguage.g:746:3: ( (lv_expr1_0_0= ruleExpressaoAritmetica ) ) ( (lv_opRel_1_0= ruleOpRel ) ) ( (lv_expr2_2_0= ruleExpressaoAritmetica ) )
            {
            // InternalJlanguage.g:746:3: ( (lv_expr1_0_0= ruleExpressaoAritmetica ) )
            // InternalJlanguage.g:747:4: (lv_expr1_0_0= ruleExpressaoAritmetica )
            {
            // InternalJlanguage.g:747:4: (lv_expr1_0_0= ruleExpressaoAritmetica )
            // InternalJlanguage.g:748:5: lv_expr1_0_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr1ExpressaoAritmeticaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_expr1_0_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoComparacaoRelacionalRule());
            					}
            					set(
            						current,
            						"expr1",
            						lv_expr1_0_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:765:3: ( (lv_opRel_1_0= ruleOpRel ) )
            // InternalJlanguage.g:766:4: (lv_opRel_1_0= ruleOpRel )
            {
            // InternalJlanguage.g:766:4: (lv_opRel_1_0= ruleOpRel )
            // InternalJlanguage.g:767:5: lv_opRel_1_0= ruleOpRel
            {

            					newCompositeNode(grammarAccess.getTermoComparacaoRelacionalAccess().getOpRelOpRelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_opRel_1_0=ruleOpRel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoComparacaoRelacionalRule());
            					}
            					set(
            						current,
            						"opRel",
            						lv_opRel_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.OpRel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:784:3: ( (lv_expr2_2_0= ruleExpressaoAritmetica ) )
            // InternalJlanguage.g:785:4: (lv_expr2_2_0= ruleExpressaoAritmetica )
            {
            // InternalJlanguage.g:785:4: (lv_expr2_2_0= ruleExpressaoAritmetica )
            // InternalJlanguage.g:786:5: lv_expr2_2_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr2ExpressaoAritmeticaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr2_2_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoComparacaoRelacionalRule());
            					}
            					set(
            						current,
            						"expr2",
            						lv_expr2_2_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.ExpressaoAritmetica");
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
    // $ANTLR end "ruleTermoComparacaoRelacional"


    // $ANTLR start "entryRuleTermoSubExpressaoRelacional"
    // InternalJlanguage.g:807:1: entryRuleTermoSubExpressaoRelacional returns [EObject current=null] : iv_ruleTermoSubExpressaoRelacional= ruleTermoSubExpressaoRelacional EOF ;
    public final EObject entryRuleTermoSubExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoSubExpressaoRelacional = null;


        try {
            // InternalJlanguage.g:807:68: (iv_ruleTermoSubExpressaoRelacional= ruleTermoSubExpressaoRelacional EOF )
            // InternalJlanguage.g:808:2: iv_ruleTermoSubExpressaoRelacional= ruleTermoSubExpressaoRelacional EOF
            {
             newCompositeNode(grammarAccess.getTermoSubExpressaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermoSubExpressaoRelacional=ruleTermoSubExpressaoRelacional();

            state._fsp--;

             current =iv_ruleTermoSubExpressaoRelacional; 
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
    // $ANTLR end "entryRuleTermoSubExpressaoRelacional"


    // $ANTLR start "ruleTermoSubExpressaoRelacional"
    // InternalJlanguage.g:814:1: ruleTermoSubExpressaoRelacional returns [EObject current=null] : (otherlv_0= '[' ( (lv_expRel_1_0= ruleExpressaoRelacional ) ) otherlv_2= ']' ) ;
    public final EObject ruleTermoSubExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expRel_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:820:2: ( (otherlv_0= '[' ( (lv_expRel_1_0= ruleExpressaoRelacional ) ) otherlv_2= ']' ) )
            // InternalJlanguage.g:821:2: (otherlv_0= '[' ( (lv_expRel_1_0= ruleExpressaoRelacional ) ) otherlv_2= ']' )
            {
            // InternalJlanguage.g:821:2: (otherlv_0= '[' ( (lv_expRel_1_0= ruleExpressaoRelacional ) ) otherlv_2= ']' )
            // InternalJlanguage.g:822:3: otherlv_0= '[' ( (lv_expRel_1_0= ruleExpressaoRelacional ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTermoSubExpressaoRelacionalAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJlanguage.g:826:3: ( (lv_expRel_1_0= ruleExpressaoRelacional ) )
            // InternalJlanguage.g:827:4: (lv_expRel_1_0= ruleExpressaoRelacional )
            {
            // InternalJlanguage.g:827:4: (lv_expRel_1_0= ruleExpressaoRelacional )
            // InternalJlanguage.g:828:5: lv_expRel_1_0= ruleExpressaoRelacional
            {

            					newCompositeNode(grammarAccess.getTermoSubExpressaoRelacionalAccess().getExpRelExpressaoRelacionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_expRel_1_0=ruleExpressaoRelacional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoSubExpressaoRelacionalRule());
            					}
            					set(
            						current,
            						"expRel",
            						lv_expRel_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.ExpressaoRelacional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTermoSubExpressaoRelacionalAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleTermoSubExpressaoRelacional"


    // $ANTLR start "entryRuleComando"
    // InternalJlanguage.g:853:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalJlanguage.g:853:48: (iv_ruleComando= ruleComando EOF )
            // InternalJlanguage.g:854:2: iv_ruleComando= ruleComando EOF
            {
             newCompositeNode(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComando=ruleComando();

            state._fsp--;

             current =iv_ruleComando; 
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
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalJlanguage.g:860:1: ruleComando returns [EObject current=null] : (this_ComandoAtibuicao_0= ruleComandoAtibuicao | this_ComandoEntrada_1= ruleComandoEntrada | this_ComandoSaida_2= ruleComandoSaida | this_ComandoCondicao_3= ruleComandoCondicao | this_ComandoRepeticao_4= ruleComandoRepeticao | this_ComandoSubAlgoritmo_5= ruleComandoSubAlgoritmo ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject this_ComandoAtibuicao_0 = null;

        EObject this_ComandoEntrada_1 = null;

        EObject this_ComandoSaida_2 = null;

        EObject this_ComandoCondicao_3 = null;

        EObject this_ComandoRepeticao_4 = null;

        EObject this_ComandoSubAlgoritmo_5 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:866:2: ( (this_ComandoAtibuicao_0= ruleComandoAtibuicao | this_ComandoEntrada_1= ruleComandoEntrada | this_ComandoSaida_2= ruleComandoSaida | this_ComandoCondicao_3= ruleComandoCondicao | this_ComandoRepeticao_4= ruleComandoRepeticao | this_ComandoSubAlgoritmo_5= ruleComandoSubAlgoritmo ) )
            // InternalJlanguage.g:867:2: (this_ComandoAtibuicao_0= ruleComandoAtibuicao | this_ComandoEntrada_1= ruleComandoEntrada | this_ComandoSaida_2= ruleComandoSaida | this_ComandoCondicao_3= ruleComandoCondicao | this_ComandoRepeticao_4= ruleComandoRepeticao | this_ComandoSubAlgoritmo_5= ruleComandoSubAlgoritmo )
            {
            // InternalJlanguage.g:867:2: (this_ComandoAtibuicao_0= ruleComandoAtibuicao | this_ComandoEntrada_1= ruleComandoEntrada | this_ComandoSaida_2= ruleComandoSaida | this_ComandoCondicao_3= ruleComandoCondicao | this_ComandoRepeticao_4= ruleComandoRepeticao | this_ComandoSubAlgoritmo_5= ruleComandoSubAlgoritmo )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJlanguage.g:868:3: this_ComandoAtibuicao_0= ruleComandoAtibuicao
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoAtibuicaoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoAtibuicao_0=ruleComandoAtibuicao();

                    state._fsp--;


                    			current = this_ComandoAtibuicao_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:877:3: this_ComandoEntrada_1= ruleComandoEntrada
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoEntradaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoEntrada_1=ruleComandoEntrada();

                    state._fsp--;


                    			current = this_ComandoEntrada_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJlanguage.g:886:3: this_ComandoSaida_2= ruleComandoSaida
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoSaidaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoSaida_2=ruleComandoSaida();

                    state._fsp--;


                    			current = this_ComandoSaida_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJlanguage.g:895:3: this_ComandoCondicao_3= ruleComandoCondicao
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoCondicaoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoCondicao_3=ruleComandoCondicao();

                    state._fsp--;


                    			current = this_ComandoCondicao_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJlanguage.g:904:3: this_ComandoRepeticao_4= ruleComandoRepeticao
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoRepeticaoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoRepeticao_4=ruleComandoRepeticao();

                    state._fsp--;


                    			current = this_ComandoRepeticao_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJlanguage.g:913:3: this_ComandoSubAlgoritmo_5= ruleComandoSubAlgoritmo
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoSubAlgoritmoParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoSubAlgoritmo_5=ruleComandoSubAlgoritmo();

                    state._fsp--;


                    			current = this_ComandoSubAlgoritmo_5;
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
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleComandoAtibuicao"
    // InternalJlanguage.g:925:1: entryRuleComandoAtibuicao returns [EObject current=null] : iv_ruleComandoAtibuicao= ruleComandoAtibuicao EOF ;
    public final EObject entryRuleComandoAtibuicao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoAtibuicao = null;


        try {
            // InternalJlanguage.g:925:57: (iv_ruleComandoAtibuicao= ruleComandoAtibuicao EOF )
            // InternalJlanguage.g:926:2: iv_ruleComandoAtibuicao= ruleComandoAtibuicao EOF
            {
             newCompositeNode(grammarAccess.getComandoAtibuicaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoAtibuicao=ruleComandoAtibuicao();

            state._fsp--;

             current =iv_ruleComandoAtibuicao; 
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
    // $ANTLR end "entryRuleComandoAtibuicao"


    // $ANTLR start "ruleComandoAtibuicao"
    // InternalJlanguage.g:932:1: ruleComandoAtibuicao returns [EObject current=null] : (otherlv_0= 'ATRIBUIR' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'A' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleComandoAtibuicao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:938:2: ( (otherlv_0= 'ATRIBUIR' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'A' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalJlanguage.g:939:2: (otherlv_0= 'ATRIBUIR' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'A' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalJlanguage.g:939:2: (otherlv_0= 'ATRIBUIR' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'A' ( (otherlv_3= RULE_ID ) ) )
            // InternalJlanguage.g:940:3: otherlv_0= 'ATRIBUIR' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'A' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoAtibuicaoAccess().getATRIBUIRKeyword_0());
            		
            // InternalJlanguage.g:944:3: ( (lv_exp_1_0= ruleExpressaoAritmetica ) )
            // InternalJlanguage.g:945:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            {
            // InternalJlanguage.g:945:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            // InternalJlanguage.g:946:5: lv_exp_1_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getComandoAtibuicaoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_exp_1_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoAtibuicaoRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoAtibuicaoAccess().getAKeyword_2());
            		
            // InternalJlanguage.g:967:3: ( (otherlv_3= RULE_ID ) )
            // InternalJlanguage.g:968:4: (otherlv_3= RULE_ID )
            {
            // InternalJlanguage.g:968:4: (otherlv_3= RULE_ID )
            // InternalJlanguage.g:969:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoAtibuicaoRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getComandoAtibuicaoAccess().getVariavelDeclaracaoCrossReference_3_0());
            				

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
    // $ANTLR end "ruleComandoAtibuicao"


    // $ANTLR start "entryRuleComandoEntrada"
    // InternalJlanguage.g:984:1: entryRuleComandoEntrada returns [EObject current=null] : iv_ruleComandoEntrada= ruleComandoEntrada EOF ;
    public final EObject entryRuleComandoEntrada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoEntrada = null;


        try {
            // InternalJlanguage.g:984:55: (iv_ruleComandoEntrada= ruleComandoEntrada EOF )
            // InternalJlanguage.g:985:2: iv_ruleComandoEntrada= ruleComandoEntrada EOF
            {
             newCompositeNode(grammarAccess.getComandoEntradaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoEntrada=ruleComandoEntrada();

            state._fsp--;

             current =iv_ruleComandoEntrada; 
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
    // $ANTLR end "entryRuleComandoEntrada"


    // $ANTLR start "ruleComandoEntrada"
    // InternalJlanguage.g:991:1: ruleComandoEntrada returns [EObject current=null] : (otherlv_0= 'LER' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleComandoEntrada() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJlanguage.g:997:2: ( (otherlv_0= 'LER' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalJlanguage.g:998:2: (otherlv_0= 'LER' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalJlanguage.g:998:2: (otherlv_0= 'LER' ( (otherlv_1= RULE_ID ) ) )
            // InternalJlanguage.g:999:3: otherlv_0= 'LER' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoEntradaAccess().getLERKeyword_0());
            		
            // InternalJlanguage.g:1003:3: ( (otherlv_1= RULE_ID ) )
            // InternalJlanguage.g:1004:4: (otherlv_1= RULE_ID )
            {
            // InternalJlanguage.g:1004:4: (otherlv_1= RULE_ID )
            // InternalJlanguage.g:1005:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoEntradaRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getComandoEntradaAccess().getVariavelDeclaracaoCrossReference_1_0());
            				

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
    // $ANTLR end "ruleComandoEntrada"


    // $ANTLR start "entryRuleComandoSaida"
    // InternalJlanguage.g:1020:1: entryRuleComandoSaida returns [EObject current=null] : iv_ruleComandoSaida= ruleComandoSaida EOF ;
    public final EObject entryRuleComandoSaida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoSaida = null;


        try {
            // InternalJlanguage.g:1020:53: (iv_ruleComandoSaida= ruleComandoSaida EOF )
            // InternalJlanguage.g:1021:2: iv_ruleComandoSaida= ruleComandoSaida EOF
            {
             newCompositeNode(grammarAccess.getComandoSaidaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoSaida=ruleComandoSaida();

            state._fsp--;

             current =iv_ruleComandoSaida; 
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
    // $ANTLR end "entryRuleComandoSaida"


    // $ANTLR start "ruleComandoSaida"
    // InternalJlanguage.g:1027:1: ruleComandoSaida returns [EObject current=null] : (otherlv_0= 'IMPRIMIR' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleComandoSaida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJlanguage.g:1033:2: ( (otherlv_0= 'IMPRIMIR' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalJlanguage.g:1034:2: (otherlv_0= 'IMPRIMIR' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalJlanguage.g:1034:2: (otherlv_0= 'IMPRIMIR' ( (otherlv_1= RULE_ID ) ) )
            // InternalJlanguage.g:1035:3: otherlv_0= 'IMPRIMIR' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoSaidaAccess().getIMPRIMIRKeyword_0());
            		
            // InternalJlanguage.g:1039:3: ( (otherlv_1= RULE_ID ) )
            // InternalJlanguage.g:1040:4: (otherlv_1= RULE_ID )
            {
            // InternalJlanguage.g:1040:4: (otherlv_1= RULE_ID )
            // InternalJlanguage.g:1041:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoSaidaRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getComandoSaidaAccess().getVariavelDeclaracaoCrossReference_1_0());
            				

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
    // $ANTLR end "ruleComandoSaida"


    // $ANTLR start "entryRuleComandoCondicao"
    // InternalJlanguage.g:1056:1: entryRuleComandoCondicao returns [EObject current=null] : iv_ruleComandoCondicao= ruleComandoCondicao EOF ;
    public final EObject entryRuleComandoCondicao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoCondicao = null;


        try {
            // InternalJlanguage.g:1056:56: (iv_ruleComandoCondicao= ruleComandoCondicao EOF )
            // InternalJlanguage.g:1057:2: iv_ruleComandoCondicao= ruleComandoCondicao EOF
            {
             newCompositeNode(grammarAccess.getComandoCondicaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoCondicao=ruleComandoCondicao();

            state._fsp--;

             current =iv_ruleComandoCondicao; 
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
    // $ANTLR end "entryRuleComandoCondicao"


    // $ANTLR start "ruleComandoCondicao"
    // InternalJlanguage.g:1063:1: ruleComandoCondicao returns [EObject current=null] : (otherlv_0= 'SE' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) otherlv_2= 'ENTAO' ( (lv_cmd1_3_0= ruleComando ) ) (otherlv_4= 'SENAO' ( (lv_cmd2_5_0= ruleComando ) ) )? ) ;
    public final EObject ruleComandoCondicao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exp_1_0 = null;

        EObject lv_cmd1_3_0 = null;

        EObject lv_cmd2_5_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:1069:2: ( (otherlv_0= 'SE' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) otherlv_2= 'ENTAO' ( (lv_cmd1_3_0= ruleComando ) ) (otherlv_4= 'SENAO' ( (lv_cmd2_5_0= ruleComando ) ) )? ) )
            // InternalJlanguage.g:1070:2: (otherlv_0= 'SE' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) otherlv_2= 'ENTAO' ( (lv_cmd1_3_0= ruleComando ) ) (otherlv_4= 'SENAO' ( (lv_cmd2_5_0= ruleComando ) ) )? )
            {
            // InternalJlanguage.g:1070:2: (otherlv_0= 'SE' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) otherlv_2= 'ENTAO' ( (lv_cmd1_3_0= ruleComando ) ) (otherlv_4= 'SENAO' ( (lv_cmd2_5_0= ruleComando ) ) )? )
            // InternalJlanguage.g:1071:3: otherlv_0= 'SE' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) otherlv_2= 'ENTAO' ( (lv_cmd1_3_0= ruleComando ) ) (otherlv_4= 'SENAO' ( (lv_cmd2_5_0= ruleComando ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoCondicaoAccess().getSEKeyword_0());
            		
            // InternalJlanguage.g:1075:3: ( (lv_exp_1_0= ruleExpressaoRelacional ) )
            // InternalJlanguage.g:1076:4: (lv_exp_1_0= ruleExpressaoRelacional )
            {
            // InternalJlanguage.g:1076:4: (lv_exp_1_0= ruleExpressaoRelacional )
            // InternalJlanguage.g:1077:5: lv_exp_1_0= ruleExpressaoRelacional
            {

            					newCompositeNode(grammarAccess.getComandoCondicaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_exp_1_0=ruleExpressaoRelacional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoCondicaoRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.ExpressaoRelacional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoCondicaoAccess().getENTAOKeyword_2());
            		
            // InternalJlanguage.g:1098:3: ( (lv_cmd1_3_0= ruleComando ) )
            // InternalJlanguage.g:1099:4: (lv_cmd1_3_0= ruleComando )
            {
            // InternalJlanguage.g:1099:4: (lv_cmd1_3_0= ruleComando )
            // InternalJlanguage.g:1100:5: lv_cmd1_3_0= ruleComando
            {

            					newCompositeNode(grammarAccess.getComandoCondicaoAccess().getCmd1ComandoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_cmd1_3_0=ruleComando();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoCondicaoRule());
            					}
            					set(
            						current,
            						"cmd1",
            						lv_cmd1_3_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.Comando");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:1117:3: (otherlv_4= 'SENAO' ( (lv_cmd2_5_0= ruleComando ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJlanguage.g:1118:4: otherlv_4= 'SENAO' ( (lv_cmd2_5_0= ruleComando ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getComandoCondicaoAccess().getSENAOKeyword_4_0());
                    			
                    // InternalJlanguage.g:1122:4: ( (lv_cmd2_5_0= ruleComando ) )
                    // InternalJlanguage.g:1123:5: (lv_cmd2_5_0= ruleComando )
                    {
                    // InternalJlanguage.g:1123:5: (lv_cmd2_5_0= ruleComando )
                    // InternalJlanguage.g:1124:6: lv_cmd2_5_0= ruleComando
                    {

                    						newCompositeNode(grammarAccess.getComandoCondicaoAccess().getCmd2ComandoParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_cmd2_5_0=ruleComando();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComandoCondicaoRule());
                    						}
                    						set(
                    							current,
                    							"cmd2",
                    							lv_cmd2_5_0,
                    							"br.compiladores.jhonatan.jlanguage.Jlanguage.Comando");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleComandoCondicao"


    // $ANTLR start "entryRuleComandoRepeticao"
    // InternalJlanguage.g:1146:1: entryRuleComandoRepeticao returns [EObject current=null] : iv_ruleComandoRepeticao= ruleComandoRepeticao EOF ;
    public final EObject entryRuleComandoRepeticao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoRepeticao = null;


        try {
            // InternalJlanguage.g:1146:57: (iv_ruleComandoRepeticao= ruleComandoRepeticao EOF )
            // InternalJlanguage.g:1147:2: iv_ruleComandoRepeticao= ruleComandoRepeticao EOF
            {
             newCompositeNode(grammarAccess.getComandoRepeticaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoRepeticao=ruleComandoRepeticao();

            state._fsp--;

             current =iv_ruleComandoRepeticao; 
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
    // $ANTLR end "entryRuleComandoRepeticao"


    // $ANTLR start "ruleComandoRepeticao"
    // InternalJlanguage.g:1153:1: ruleComandoRepeticao returns [EObject current=null] : (otherlv_0= 'ENQUANTO' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) ( (lv_cmd_2_0= ruleComando ) ) ) ;
    public final EObject ruleComandoRepeticao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;

        EObject lv_cmd_2_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:1159:2: ( (otherlv_0= 'ENQUANTO' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) ( (lv_cmd_2_0= ruleComando ) ) ) )
            // InternalJlanguage.g:1160:2: (otherlv_0= 'ENQUANTO' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) ( (lv_cmd_2_0= ruleComando ) ) )
            {
            // InternalJlanguage.g:1160:2: (otherlv_0= 'ENQUANTO' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) ( (lv_cmd_2_0= ruleComando ) ) )
            // InternalJlanguage.g:1161:3: otherlv_0= 'ENQUANTO' ( (lv_exp_1_0= ruleExpressaoRelacional ) ) ( (lv_cmd_2_0= ruleComando ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoRepeticaoAccess().getENQUANTOKeyword_0());
            		
            // InternalJlanguage.g:1165:3: ( (lv_exp_1_0= ruleExpressaoRelacional ) )
            // InternalJlanguage.g:1166:4: (lv_exp_1_0= ruleExpressaoRelacional )
            {
            // InternalJlanguage.g:1166:4: (lv_exp_1_0= ruleExpressaoRelacional )
            // InternalJlanguage.g:1167:5: lv_exp_1_0= ruleExpressaoRelacional
            {

            					newCompositeNode(grammarAccess.getComandoRepeticaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_exp_1_0=ruleExpressaoRelacional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoRepeticaoRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.ExpressaoRelacional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJlanguage.g:1184:3: ( (lv_cmd_2_0= ruleComando ) )
            // InternalJlanguage.g:1185:4: (lv_cmd_2_0= ruleComando )
            {
            // InternalJlanguage.g:1185:4: (lv_cmd_2_0= ruleComando )
            // InternalJlanguage.g:1186:5: lv_cmd_2_0= ruleComando
            {

            					newCompositeNode(grammarAccess.getComandoRepeticaoAccess().getCmdComandoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_cmd_2_0=ruleComando();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoRepeticaoRule());
            					}
            					set(
            						current,
            						"cmd",
            						lv_cmd_2_0,
            						"br.compiladores.jhonatan.jlanguage.Jlanguage.Comando");
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
    // $ANTLR end "ruleComandoRepeticao"


    // $ANTLR start "entryRuleComandoSubAlgoritmo"
    // InternalJlanguage.g:1207:1: entryRuleComandoSubAlgoritmo returns [EObject current=null] : iv_ruleComandoSubAlgoritmo= ruleComandoSubAlgoritmo EOF ;
    public final EObject entryRuleComandoSubAlgoritmo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoSubAlgoritmo = null;


        try {
            // InternalJlanguage.g:1207:60: (iv_ruleComandoSubAlgoritmo= ruleComandoSubAlgoritmo EOF )
            // InternalJlanguage.g:1208:2: iv_ruleComandoSubAlgoritmo= ruleComandoSubAlgoritmo EOF
            {
             newCompositeNode(grammarAccess.getComandoSubAlgoritmoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoSubAlgoritmo=ruleComandoSubAlgoritmo();

            state._fsp--;

             current =iv_ruleComandoSubAlgoritmo; 
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
    // $ANTLR end "entryRuleComandoSubAlgoritmo"


    // $ANTLR start "ruleComandoSubAlgoritmo"
    // InternalJlanguage.g:1214:1: ruleComandoSubAlgoritmo returns [EObject current=null] : (otherlv_0= 'INICIO' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= 'FIM' ) ;
    public final EObject ruleComandoSubAlgoritmo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_comandos_1_0 = null;



        	enterRule();

        try {
            // InternalJlanguage.g:1220:2: ( (otherlv_0= 'INICIO' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= 'FIM' ) )
            // InternalJlanguage.g:1221:2: (otherlv_0= 'INICIO' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= 'FIM' )
            {
            // InternalJlanguage.g:1221:2: (otherlv_0= 'INICIO' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= 'FIM' )
            // InternalJlanguage.g:1222:3: otherlv_0= 'INICIO' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= 'FIM'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoSubAlgoritmoAccess().getINICIOKeyword_0());
            		
            // InternalJlanguage.g:1226:3: ( (lv_comandos_1_0= ruleComando ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18||(LA10_0>=20 && LA10_0<=22)||(LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJlanguage.g:1227:4: (lv_comandos_1_0= ruleComando )
            	    {
            	    // InternalJlanguage.g:1227:4: (lv_comandos_1_0= ruleComando )
            	    // InternalJlanguage.g:1228:5: lv_comandos_1_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getComandoSubAlgoritmoAccess().getComandosComandoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_comandos_1_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComandoSubAlgoritmoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_1_0,
            	    						"br.compiladores.jhonatan.jlanguage.Jlanguage.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoSubAlgoritmoAccess().getFIMKeyword_2());
            		

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
    // $ANTLR end "ruleComandoSubAlgoritmo"


    // $ANTLR start "entryRuleTipoVar"
    // InternalJlanguage.g:1253:1: entryRuleTipoVar returns [String current=null] : iv_ruleTipoVar= ruleTipoVar EOF ;
    public final String entryRuleTipoVar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVar = null;


        try {
            // InternalJlanguage.g:1253:47: (iv_ruleTipoVar= ruleTipoVar EOF )
            // InternalJlanguage.g:1254:2: iv_ruleTipoVar= ruleTipoVar EOF
            {
             newCompositeNode(grammarAccess.getTipoVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoVar=ruleTipoVar();

            state._fsp--;

             current =iv_ruleTipoVar.getText(); 
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
    // $ANTLR end "entryRuleTipoVar"


    // $ANTLR start "ruleTipoVar"
    // InternalJlanguage.g:1260:1: ruleTipoVar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'INTEIRO' | kw= 'REAL' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJlanguage.g:1266:2: ( (kw= 'INTEIRO' | kw= 'REAL' ) )
            // InternalJlanguage.g:1267:2: (kw= 'INTEIRO' | kw= 'REAL' )
            {
            // InternalJlanguage.g:1267:2: (kw= 'INTEIRO' | kw= 'REAL' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalJlanguage.g:1268:3: kw= 'INTEIRO'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVarAccess().getINTEIROKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:1274:3: kw= 'REAL'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVarAccess().getREALKeyword_1());
                    		

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
    // $ANTLR end "ruleTipoVar"


    // $ANTLR start "entryRuleOpArit1"
    // InternalJlanguage.g:1283:1: entryRuleOpArit1 returns [String current=null] : iv_ruleOpArit1= ruleOpArit1 EOF ;
    public final String entryRuleOpArit1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpArit1 = null;


        try {
            // InternalJlanguage.g:1283:47: (iv_ruleOpArit1= ruleOpArit1 EOF )
            // InternalJlanguage.g:1284:2: iv_ruleOpArit1= ruleOpArit1 EOF
            {
             newCompositeNode(grammarAccess.getOpArit1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpArit1=ruleOpArit1();

            state._fsp--;

             current =iv_ruleOpArit1.getText(); 
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
    // $ANTLR end "entryRuleOpArit1"


    // $ANTLR start "ruleOpArit1"
    // InternalJlanguage.g:1290:1: ruleOpArit1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpArit1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJlanguage.g:1296:2: ( (kw= '+' | kw= '-' ) )
            // InternalJlanguage.g:1297:2: (kw= '+' | kw= '-' )
            {
            // InternalJlanguage.g:1297:2: (kw= '+' | kw= '-' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalJlanguage.g:1298:3: kw= '+'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:1304:3: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit1Access().getHyphenMinusKeyword_1());
                    		

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
    // $ANTLR end "ruleOpArit1"


    // $ANTLR start "entryRuleOpArit2"
    // InternalJlanguage.g:1313:1: entryRuleOpArit2 returns [String current=null] : iv_ruleOpArit2= ruleOpArit2 EOF ;
    public final String entryRuleOpArit2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpArit2 = null;


        try {
            // InternalJlanguage.g:1313:47: (iv_ruleOpArit2= ruleOpArit2 EOF )
            // InternalJlanguage.g:1314:2: iv_ruleOpArit2= ruleOpArit2 EOF
            {
             newCompositeNode(grammarAccess.getOpArit2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpArit2=ruleOpArit2();

            state._fsp--;

             current =iv_ruleOpArit2.getText(); 
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
    // $ANTLR end "entryRuleOpArit2"


    // $ANTLR start "ruleOpArit2"
    // InternalJlanguage.g:1320:1: ruleOpArit2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOpArit2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJlanguage.g:1326:2: ( (kw= '*' | kw= '/' ) )
            // InternalJlanguage.g:1327:2: (kw= '*' | kw= '/' )
            {
            // InternalJlanguage.g:1327:2: (kw= '*' | kw= '/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJlanguage.g:1328:3: kw= '*'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:1334:3: kw= '/'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit2Access().getSolidusKeyword_1());
                    		

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
    // $ANTLR end "ruleOpArit2"


    // $ANTLR start "entryRuleOpRel"
    // InternalJlanguage.g:1343:1: entryRuleOpRel returns [String current=null] : iv_ruleOpRel= ruleOpRel EOF ;
    public final String entryRuleOpRel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpRel = null;


        try {
            // InternalJlanguage.g:1343:45: (iv_ruleOpRel= ruleOpRel EOF )
            // InternalJlanguage.g:1344:2: iv_ruleOpRel= ruleOpRel EOF
            {
             newCompositeNode(grammarAccess.getOpRelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpRel=ruleOpRel();

            state._fsp--;

             current =iv_ruleOpRel.getText(); 
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
    // $ANTLR end "entryRuleOpRel"


    // $ANTLR start "ruleOpRel"
    // InternalJlanguage.g:1350:1: ruleOpRel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleOpRel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJlanguage.g:1356:2: ( (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' ) )
            // InternalJlanguage.g:1357:2: (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' )
            {
            // InternalJlanguage.g:1357:2: (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt14=1;
                }
                break;
            case 35:
                {
                alt14=2;
                }
                break;
            case 36:
                {
                alt14=3;
                }
                break;
            case 37:
                {
                alt14=4;
                }
                break;
            case 38:
                {
                alt14=5;
                }
                break;
            case 39:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalJlanguage.g:1358:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:1364:3: kw= '>='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalJlanguage.g:1370:3: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalJlanguage.g:1376:3: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalJlanguage.g:1382:3: kw= '<>'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalJlanguage.g:1388:3: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getEqualsSignKeyword_5());
                    		

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
    // $ANTLR end "ruleOpRel"


    // $ANTLR start "entryRuleOpBool"
    // InternalJlanguage.g:1397:1: entryRuleOpBool returns [String current=null] : iv_ruleOpBool= ruleOpBool EOF ;
    public final String entryRuleOpBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpBool = null;


        try {
            // InternalJlanguage.g:1397:46: (iv_ruleOpBool= ruleOpBool EOF )
            // InternalJlanguage.g:1398:2: iv_ruleOpBool= ruleOpBool EOF
            {
             newCompositeNode(grammarAccess.getOpBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpBool=ruleOpBool();

            state._fsp--;

             current =iv_ruleOpBool.getText(); 
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
    // $ANTLR end "entryRuleOpBool"


    // $ANTLR start "ruleOpBool"
    // InternalJlanguage.g:1404:1: ruleOpBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'OU' ) ;
    public final AntlrDatatypeRuleToken ruleOpBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJlanguage.g:1410:2: ( (kw= 'E' | kw= 'OU' ) )
            // InternalJlanguage.g:1411:2: (kw= 'E' | kw= 'OU' )
            {
            // InternalJlanguage.g:1411:2: (kw= 'E' | kw= 'OU' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            else if ( (LA15_0==41) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalJlanguage.g:1412:3: kw= 'E'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpBoolAccess().getEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:1418:3: kw= 'OU'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpBoolAccess().getOUKeyword_1());
                    		

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
    // $ANTLR end "ruleOpBool"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000006740000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000006740002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E740000L});

}