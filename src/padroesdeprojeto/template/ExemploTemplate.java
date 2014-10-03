package padroesdeprojeto.template;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploTemplate extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        
        Relatorio relatorio = new RelatorioPDF();
        System.out.println( relatorio.gerarRelatorio() );
        
        relatorio = new RelatorioCSV();
        System.out.println( relatorio.gerarRelatorio() );
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("Template");
    }
    
}
