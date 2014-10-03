package padroesdeprojeto.state;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploState extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        
        Personagem personagem = new Personagem();
        System.out.println( "Estado terra:" + personagem.pressionouSetaDireita());
        System.out.println( "Estado terra:" + personagem.pressionarR1());
        
        personagem.setEstadoPersonagem(new Agua());
        System.out.println( "Estado agua:" + personagem.pressionouSetaDireita());
        System.out.println( "Estado agua:" + personagem.pressionarR1());
        
        personagem.setEstadoPersonagem(new Lama());
        System.out.println( "Estado lama:" + personagem.pressionouSetaDireita());
        System.out.println( "Estado lama:" + personagem.pressionarR1());
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("State");
    }
    
    
}
