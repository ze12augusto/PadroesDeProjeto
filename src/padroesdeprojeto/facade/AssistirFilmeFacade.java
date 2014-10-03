package padroesdeprojeto.facade;

/**
 *
 * @author a12027227
 */
public class AssistirFilmeFacade {
    
    public void assistirFilme(String filme){
        
        AssistirFilme assistirFilme = new AssistirFilme();
        assistirFilme.baixarFilme(filme);
        assistirFilme.trocarCabos();
        assistirFilme.apertarPlay();
    }
    
}
