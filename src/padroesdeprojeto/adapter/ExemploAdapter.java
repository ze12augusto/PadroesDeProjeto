package padroesdeprojeto.adapter;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author ze12augusto
 */
public class ExemploAdapter extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        Antiga antiga = new Adapter();
        System.out.println(antiga.enviar("123", "teste"));
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("Adapter");
    }
    
}
