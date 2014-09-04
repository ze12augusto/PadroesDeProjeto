package padroesdeprojeto.factory;

import junit.framework.TestCase;

/**
 *
 * @author ze12augusto
 */
public class TradutorInglesTest extends TestCase {
    
    private String traduzindoTexto = "Traduzindo teste do ingles";
    
    public TradutorInglesTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testTraduzirDeveriaRetornaStringTraduzindoTexto() throws TradutoInvalidoException {
        
        TradutorIngles tradutorIngles = new TradutorIngles();
        String retorno = tradutorIngles.traduzir("teste");
        
        assertEquals(traduzindoTexto, retorno);
    }
}
