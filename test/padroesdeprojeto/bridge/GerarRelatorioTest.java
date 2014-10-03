package padroesdeprojeto.bridge;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author a12027227
 */
public class GerarRelatorioTest extends TestCase {
    
    private GerarRelatorio gerarRelatorio;
    private String relatorioXML = "Exportei XML",
                   relatorioDOC = "Exportei DOC",
                   processadorNormal = "processando normalmente dados:",
                   processadorCriptografado = "processando com criptografia dados:";
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testExecutarRelatorioXmlDefault(){
        
        gerarRelatorio = new RelatorioXML();
        String relatorio = gerarRelatorio.gerarRelatorio();
        assertEquals( processadorNormal + relatorioXML, relatorio);
    }
    
    public void testExecutarRelatorioXmlCriptografado(){
        
        gerarRelatorio = new RelatorioXML();
        gerarRelatorio.setProcessador("criptografado");
        String relatorio = gerarRelatorio.gerarRelatorio();
        assertEquals( processadorCriptografado + relatorioXML, relatorio);
    }
    
    public void testExecutarRelatorioDOCDefault(){
        
        gerarRelatorio = new RelatorioDOC();
        String relatorio = gerarRelatorio.gerarRelatorio();
        assertEquals( processadorNormal + relatorioDOC, relatorio);
    }
    
    public void testExecutarRelatorioDOCCriptografado(){
        
        gerarRelatorio = new RelatorioDOC();
        gerarRelatorio.setProcessador("criptografado");
        String relatorio = gerarRelatorio.gerarRelatorio();
        assertEquals( processadorCriptografado + relatorioDOC, relatorio);
    }
}
