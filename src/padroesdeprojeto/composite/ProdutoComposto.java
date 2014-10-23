package padroesdeprojeto.composite;

import java.util.List;

/**
 *
 * @author a12027227
 */
public class ProdutoComposto implements Produto{

    private List<Produto> produtos;
    private Double preco = 0D;
    
    public ProdutoComposto(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public Double getPreco() {
        
        for( Produto produto : produtos ){
            
            preco += produto.getPreco();
        }
        
        return preco;
    }
    
}
