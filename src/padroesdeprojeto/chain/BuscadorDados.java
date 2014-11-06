package padroesdeprojeto.chain;

/**
 *
 * @author a12027227
 */
public abstract class BuscadorDados {

    private String dados;
    private BuscadorDados chainProximo;

    public BuscadorDados(BuscadorDados chainProximo) {
        this.chainProximo = chainProximo;
    }

    public String localizarDados() throws DadoNaoEncontradoException {

        dados = buscar();
        if (dados == null) {
            if (chainProximo == null) {
                throw new DadoNaoEncontradoException("Dado nao encontrado");
            }
            dados = chainProximo.localizarDados();
        }
        return dados;
    }

    public abstract String buscar();

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
