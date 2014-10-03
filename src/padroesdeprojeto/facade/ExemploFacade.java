package padroesdeprojeto.facade;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploFacade extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        
        AssistirFilme assistirFilme = new AssistirFilme();
        assistirFilme.baixarFilme("Hobbit");
        assistirFilme.trocarCabos();
        assistirFilme.apertarPlay();
        
        AssistirFilmeFacade assistirFilmeFacade = new AssistirFilmeFacade();
        assistirFilmeFacade.assistirFilme("Hobbit");
    }

    @Override
    public void executeSoutComNomeExemplo() {
         System.out.println("Facade");
    }
    
}
