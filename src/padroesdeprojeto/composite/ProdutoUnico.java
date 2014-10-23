package padroesdeprojeto.composite;

/**
 *
 * @author a12027227
 */
public class ProdutoUnico implements Produto{

    private Double preco;

    public ProdutoUnico(double preco) {
        this.preco = preco;
    }
    
    @Override
    public Double getPreco() {
        return this.preco;
    }
    
}
