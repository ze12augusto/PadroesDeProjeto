package padroesdeprojeto.bridge;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploBridge extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        
        GerarRelatorio relatorio = new RelatorioDOC();
        System.out.println( relatorio.gerarRelatorio() );
        relatorio.setProcessador("criptografado");
        System.out.println( relatorio.gerarRelatorio() );
        relatorio = new RelatorioXML();
        System.out.println( relatorio.gerarRelatorio() );
        relatorio.setProcessador("criptografado");
        System.out.println( relatorio.gerarRelatorio() );
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("Bridge");
    }
    
}
