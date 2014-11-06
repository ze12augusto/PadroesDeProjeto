package padroesdeprojeto.chain;

import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            System.out.println("Dados:" + memoria.localizarDados());
            db.setDados("Dado DB");
            
            memoria = new BuscadorMemoria(db);
            System.out.println("Dados:" + memoria.localizarDados());
            
            remoto.setDados(null);
            db = new BuscadorDadosDB(remoto);
            db.setDados(null);
            memoria = new BuscadorMemoria(db);
            System.out.println("Dados:" + memoria.localizarDados());
            
        } catch (DadoNaoEncontradoException ex) {
            System.out.println("DadoNaoEncontradoException: " + ex.getMessage());
        }
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("Chain");
    }
    
}
