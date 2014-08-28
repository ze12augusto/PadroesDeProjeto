package padroesdeprojeto.template;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author ze12augusto
 */
public class RelatorioTest extends TestCase {
    
    private String exportadoPDF = "Exportei PDF";
    private String exportadoCSV = "Exportei CSV";
    private Relatorio relatorio;
    
    public RelatorioTest(String testName) {
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

    public void testGerarRelatorioPDF() {
        
        relatorio = new RelatorioPDF();
        
        assertEquals(exportadoPDF, relatorio.gerarRelatorio());
    }
    
    public void testGerarRelatorioCVS() {
        
        relatorio = new RelatorioCSV();
        
        assertEquals(exportadoCSV, relatorio.gerarRelatorio());
    }
}
