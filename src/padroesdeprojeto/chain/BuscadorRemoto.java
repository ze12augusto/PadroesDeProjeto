package padroesdeprojeto.chain;

/**
 *
 * @author a12027227
 */
public class BuscadorRemoto extends BuscadorDados{

    public BuscadorRemoto(BuscadorDados chainProximo) {
        super(chainProximo);
        setDados("Dado Remoto");
    }
    
    @Override
    public String buscar() {
        return getDados();
    }
}
