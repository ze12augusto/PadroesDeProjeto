package padroesdeprojeto.factory;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploFactory implements ExemplosPadroes{

    @Override
    public void execute() {
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
    
}
