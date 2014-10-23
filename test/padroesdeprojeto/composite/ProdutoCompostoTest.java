package padroesdeprojeto.composite;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author a12027227
 */
public class ProdutoCompostoTest extends TestCase {
    
    private ProdutoComposto compraSegunda, compraTerca;
    private List<Produto> produtos, compraSemana;
    private ProdutoUnico massaTomate, batataFrita;
    
    public ProdutoCompostoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        produtos = new ArrayList<>();
        compraSemana = new ArrayList<>();
        massaTomate = new ProdutoUnico(5);
        batataFrita = new ProdutoUnico(6);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testGetPrecoDeveriaRetornarPrecoComoSomaDaMassaDeTomateComBatataFrita(){
        
        produtos.add(massaTomate);
        produtos.add(batataFrita);
        compraSegunda = new ProdutoComposto(produtos);
        assertEquals(massaTomate.getPreco() + batataFrita.getPreco(), compraSegunda.getPreco());
    }
    
//    public void testGetPrecoDeveriaRetornarPrecoComoSomaCompraSegundaComCompraTerca(){
//        
//        produtos.add(massaTomate);
//        produtos.add(batataFrita);
//        compraSegunda = new ProdutoComposto(produtos);
//        
//        compraSemana.add(compraSegunda);
//        compraSemana.add(batataFrita);
//        compraTerca = new ProdutoComposto(compraSemana);
//        Double precoEsperado = batataFrita.getPreco() +  compraSegunda.getPreco();
//        assertEquals(precoEsperado,compraTerca.getPreco());
//    }
}
