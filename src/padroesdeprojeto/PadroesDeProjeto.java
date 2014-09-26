
package padroesdeprojeto;

import padroesdeprojeto.bridge.ExemploBridge;
import padroesdeprojeto.factory.ExemploFactory;
import padroesdeprojeto.observer.ExemploObserver;
import padroesdeprojeto.singleton.ExemploSingleton;
import padroesdeprojeto.state.ExemploState;
import padroesdeprojeto.strategy.ExemploStrategy;
import padroesdeprojeto.template.ExemploTemplate;

/**
 *
 * @author ze12augusto
 */
public class PadroesDeProjeto {
    
    private static ExemplosPadroes exemplosPadroes;
    
    public static void main(String[] args) {
        
        exemplosPadroes = new ExemploSingleton();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploStrategy();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploTemplate();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploFactory();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploState();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploObserver();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploBridge();
        exemplosPadroes.execute();
    }
}
