package padroesdeprojeto.factory;

/**
 *
 * @author ze12augusto
 */
public class TradutorIngles implements Tradutor{

    @Override
    public String traduzir(String texto) throws TradutoInvalidoException{
        
        return "Traduzindo " + texto + " do ingles";
    }
    
}
