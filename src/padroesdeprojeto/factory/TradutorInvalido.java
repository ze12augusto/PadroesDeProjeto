package padroesdeprojeto.factory;

/**
 *
 * @author ze12augusto
 */
class TradutorInvalido implements Tradutor {

    public TradutorInvalido() {
    }

    @Override
    public String traduzir(String texto) throws TradutoInvalidoException{
        throw new TradutoInvalidoException("Tradutor invalido");
    }
    
}
