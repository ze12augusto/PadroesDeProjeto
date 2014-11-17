
package padroesdeprojeto;

import padroesdeprojeto.adapter.ExemploAdapter;
import padroesdeprojeto.bridge.ExemploBridge;
import padroesdeprojeto.builder.ExemploBuilder;
import padroesdeprojeto.chain.ExemploChain;
import padroesdeprojeto.composite.ExemploComposite;
import padroesdeprojeto.facade.ExemploFacade;
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
        
        exemplosPadroes = new ExemploFacade();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploComposite();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploChain();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploAdapter();
        exemplosPadroes.execute();
        
        exemplosPadroes = new ExemploBuilder();
        exemplosPadroes.execute();
    }
}
