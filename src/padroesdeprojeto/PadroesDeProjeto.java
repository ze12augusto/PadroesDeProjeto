
package padroesdeprojeto;

import padroesdeprojeto.factory.TradutoInvalidoException;
import padroesdeprojeto.factory.Tradutor;
import padroesdeprojeto.factory.TradutorFactory;
import padroesdeprojeto.singleton.SingleTon;
import padroesdeprojeto.state.Agua;
import padroesdeprojeto.state.Lama;
import padroesdeprojeto.state.Personagem;
import padroesdeprojeto.strategy.ForkAndKnifeeStrategy;
import padroesdeprojeto.strategy.HashiStrategy;
import padroesdeprojeto.strategy.Human;
import padroesdeprojeto.template.Relatorio;
import padroesdeprojeto.template.RelatorioCSV;
import padroesdeprojeto.template.RelatorioPDF;

/**
 *
 * @author ze12augusto
 */
public class PadroesDeProjeto {
    
    public static void main(String[] args) {
        
        singletow();
        strategy();
        template();
        factory();
        state();
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
    
    private static void factory(){
        
        System.out.println("Factory");
        Tradutor tradutor = null;
        String textoTraduzido = "";
        TradutorFactory tradutorFactory = new TradutorFactory();
        
        try {
            tradutor = tradutorFactory.getTradutor("en-eg");
            textoTraduzido =  tradutor.traduzir("teste");
            System.out.println(textoTraduzido);
            tradutor = tradutorFactory.getTradutor("jp-jp");
            textoTraduzido =tradutor.traduzir("teste");
            System.out.println(textoTraduzido);
            tradutor = tradutorFactory.getTradutor("pt-br");
            textoTraduzido =tradutor.traduzir("teste");
            System.out.println(textoTraduzido);
            
        } catch (TradutoInvalidoException ex) {
            System.out.println("Erro ao traduzir texto: " + ex.getMessage());
        }
        System.out.println("----------------------------------\n\n\n");
    }
    
    private static void state(){
        
        System.out.println("State");
       
        Personagem personagem = new Personagem();
        System.out.println( "Estado terra:" + personagem.pressionouSetaDireita());
        System.out.println( "Estado terra:" + personagem.pressionarR1());
        
        personagem.setEstadoPersonagem(new Agua());
        System.out.println( "Estado agua:" + personagem.pressionouSetaDireita());
        System.out.println( "Estado agua:" + personagem.pressionarR1());
        
        personagem.setEstadoPersonagem(new Lama());
        System.out.println( "Estado lama:" + personagem.pressionouSetaDireita());
        System.out.println( "Estado lama:" + personagem.pressionarR1());
        
        System.out.println("----------------------------------\n\n\n");
    }
}
