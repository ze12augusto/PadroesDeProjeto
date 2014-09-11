package padroesdeprojeto.factory;

/**
 *
 * @author ze12augusto
 */
public interface Tradutor {
    
    public String traduzir( String texto ) throws TradutoInvalidoException ;
}
