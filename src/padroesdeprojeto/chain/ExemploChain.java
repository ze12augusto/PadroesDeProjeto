package padroesdeprojeto.chain;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploChain extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        
        BuscadorDados remoto = new BuscadorRemoto(null);
        BuscadorDados db = new BuscadorDadosDB(remoto);
        BuscadorDados memoria = new BuscadorMemoria(db);
        
        System.out.println("Dados:" + memoria.localizarDados());
        
        db.setDados("Dado DB");
        memoria = new BuscadorMemoria(db);
        System.out.println("Dados:" + memoria.localizarDados());
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("Chain");
    }
    
}
