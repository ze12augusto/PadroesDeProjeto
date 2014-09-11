package padroesdeprojeto.factory;

/**
 *
 * @author ze12augusto
 */
public class TradutorJapones implements Tradutor{

    @Override
    public String traduzir(String texto) throws TradutoInvalidoException {
        
        return "Traduzindo " + texto + " do japones";
    }
    
}
