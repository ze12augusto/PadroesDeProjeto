package padroesdeprojeto.factory;

import junit.framework.TestCase;

/**
 *
 * @author a12027227
 */
public class TradutorJaponesTest extends TestCase {
    
    private String traduzindoTexto = "Traduzindo teste do japones";
    
    public TradutorJaponesTest(String testName) {
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
        
        TradutorJapones tradutorJapones = new TradutorJapones();
        String retorno = tradutorJapones.traduzir("teste");
        assertEquals(traduzindoTexto, retorno);
    }
}
