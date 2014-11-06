package padroesdeprojeto.chain;

/**
 *
 * @author a12027227
 */
public class BuscadorDadosDB extends BuscadorDados{

    public BuscadorDadosDB(BuscadorDados chainProximo) {
        super(chainProximo);
    }
    
    @Override
    public String buscar() {
        return getDados();
    }
}
