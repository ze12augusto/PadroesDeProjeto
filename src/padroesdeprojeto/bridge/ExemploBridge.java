package padroesdeprojeto.bridge;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploBridge implements ExemplosPadroes{

    @Override
    public void execute() {
        System.out.println("Bridge");
        GerarRelatorio relatorio = new RelatorioDOC();
        System.out.println( relatorio.gerarRelatorio() );
        relatorio.setProcessador("criptografado");
        System.out.println( relatorio.gerarRelatorio() );
        relatorio = new RelatorioXML();
        System.out.println( relatorio.gerarRelatorio() );
        relatorio.setProcessador("criptografado");
        System.out.println( relatorio.gerarRelatorio() );
        
        System.out.println("----------------------------------\n\n\n");
    }
    
}
