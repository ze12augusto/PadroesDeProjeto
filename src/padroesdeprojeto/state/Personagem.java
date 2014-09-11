package padroesdeprojeto.state;

/**
 *
 * @author a12027227
 */
public class Personagem {
    
    private EstadoPersonagem estadoPersonagem;

    public EstadoPersonagem getEstadoPersonagem() {
        return estadoPersonagem;
    }

    public void setEstadoPersonagem(EstadoPersonagem estadoPersonagem) {
        this.estadoPersonagem = estadoPersonagem;
    }
    
    public String pressionouSetaDireita(){
        return estadoPersonagem.mover();
    }
    
    public String pressionarR1(){
        return estadoPersonagem.atirar();
    }
}
