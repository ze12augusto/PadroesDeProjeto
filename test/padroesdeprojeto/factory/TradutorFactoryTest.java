package padroesdeprojeto.factory;

import junit.framework.TestCase;

/**
 *
 * @author ze12augusto
 */
public class TradutorFactoryTest extends TestCase {
    
    private TradutorFactory tradutorFactory;
    private Tradutor tradutor;
    private String idiomaIngles = "en-eg",
                   idiomaJapones = "jp-jp",
                   idiomaInvalido = "pt-br";
    
    public TradutorFactoryTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        tradutorFactory = new TradutorFactory();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    
    public void testGetTradutorDeveriaRetornarTradutorInglesQuandoIdiomaPassadoForIdiomaIngles() {
        
        tradutor = tradutorFactory.getTradutor(idiomaIngles);
        
        assertTrue( tradutor instanceof TradutorIngles );
    }
    
    public void testGetTradutorDeveriaRetornarTradutorJaponesQuandoIdiomaPassadoForIdiomaJapones() {
        
        tradutor = tradutorFactory.getTradutor(idiomaJapones);
        
        assertTrue( tradutor instanceof TradutorJapones );
    }
    
    public void testGetTradutorDeveriaRetornarTradutorInvalidoQuandoIdiomaPassadoForIdiomaInvalido() {
        
        tradutor = tradutorFactory.getTradutor(idiomaInvalido);
        
        assertTrue( tradutor instanceof TradutorInvalido );
    }
}
