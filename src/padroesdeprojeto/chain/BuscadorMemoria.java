package padroesdeprojeto.chain;

/**
 *
 * @author a12027227
 */
public class BuscadorMemoria extends BuscadorDados{

    public BuscadorMemoria(BuscadorDados chainProximo) {
        super(chainProximo);
    }
    
    @Override
    public String buscar() {
        
        return getDados();
    }

}
