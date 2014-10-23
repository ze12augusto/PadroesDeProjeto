package padroesdeprojeto.composite;

/**
 *
 * @author a12027227
 */
public class Venda {
    
    private Produto produto;

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Double getPreco(){
        return produto.getPreco();
    }
    
}
