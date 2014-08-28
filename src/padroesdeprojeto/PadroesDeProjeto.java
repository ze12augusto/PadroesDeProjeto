
package padroesdeprojeto;

import padroesdeprojeto.singleton.SingleTon;
import padroesdeprojeto.strategy.Human;
import padroesdeprojeto.strategy.ForkAndKnifeeStrategy;
import padroesdeprojeto.strategy.HashiStrategy;
import padroesdeprojeto.template.RelatorioPDF;
import padroesdeprojeto.template.Relatorio;
import padroesdeprojeto.template.RelatorioCSV;

/**
 *
 * @author a12027227
 */
public class PadroesDeProjeto {
    
    public static void main(String[] args) {
        
        singletow();
        strategy();
        template();
    }
    
    private static void singletow(){
        
        System.out.println("SingleTow");
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("Date:"+singleTon.getData());
        SingleTon singleTonSecondTime = SingleTon.getInstance();
        System.out.println("Date:"+singleTonSecondTime.getData());
        System.out.println("----------------------------------\n\n\n");
    }
    private static void strategy(){
        
        System.out.println("Strategy");
        Human brazilian = new Human(new ForkAndKnifeeStrategy());
        System.out.println( brazilian.eat() );
        Human japanese = new Human(new HashiStrategy());
        System.out.println( japanese.eat() );
        brazilian.setStrategy(new HashiStrategy());
        System.out.println( brazilian.eat() );
        japanese.setStrategy(new ForkAndKnifeeStrategy());
        System.out.println( japanese.eat() );
        System.out.println("----------------------------------\n\n\n");
    }
    
    private static void template(){
        
        System.out.println("Template");
        Relatorio relatorio = new RelatorioPDF();
        System.out.println( relatorio.gerarRelatorio() );
        
        relatorio = new RelatorioCSV();
        System.out.println( relatorio.gerarRelatorio() );
        
        System.out.println("----------------------------------\n\n\n");
    }
    
}
