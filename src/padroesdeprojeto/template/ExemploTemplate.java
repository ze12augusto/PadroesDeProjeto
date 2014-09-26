package padroesdeprojeto.template;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploTemplate implements ExemplosPadroes{

    @Override
    public void execute() {
        System.out.println("Template");
        Relatorio relatorio = new RelatorioPDF();
        System.out.println( relatorio.gerarRelatorio() );
        
        relatorio = new RelatorioCSV();
        System.out.println( relatorio.gerarRelatorio() );
        
        System.out.println("----------------------------------\n\n\n");
    }
    
}
