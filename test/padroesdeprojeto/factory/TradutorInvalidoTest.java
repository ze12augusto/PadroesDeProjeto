package padroesdeprojeto.factory;

import junit.framework.TestCase;

/**
 *
 * @author ze12augusto
 */
public class TradutorInvalidoTest extends TestCase {
    
    public TradutorInvalidoTest(String testName) {
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
    
    public void testTraduzirDeveriaLancaTradutorInvalidoException() {
        
        boolean lancoException = false;
        TradutorInvalido tradutorInvalido = new TradutorInvalido();
        try {
            tradutorInvalido.traduzir("Teste");
        } catch (TradutoInvalidoException ex) {
            lancoException = true;
        }
        
        assertTrue(lancoException);
    }
}
