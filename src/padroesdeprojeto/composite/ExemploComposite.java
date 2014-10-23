package padroesdeprojeto.composite;

import java.util.ArrayList;
import java.util.List;
import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploComposite extends ExemplosPadroes{

    private Venda venda = new Venda();
    private List<Produto> produtos = new ArrayList<>();
    private ProdutoUnico massaTomate, bataFrita;
    
    @Override
    public void executeExemplo() {
        
        massaTomate = new ProdutoUnico(5);
        bataFrita = new ProdutoUnico(6);
        venda.setProduto(massaTomate);
        System.out.println("precoUnico:" + venda.getPreco());
        produtos.add(massaTomate);
        produtos.add(bataFrita);
        ProdutoComposto produtoComposto = new ProdutoComposto(produtos);
        venda.setProduto(produtoComposto);
        System.out.println("precoComposto:" + venda.getPreco());
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("Composite");
    }
    
}
