package padroesdeprojeto.state;

/**
 *
 * @author a12027227
 */
public class Agua implements EstadoPersonagem{

    @Override
    public String mover() {
        return "anda devagar";
    }

    @Override
    public String atirar() {
        return "nao consegue tirar";
    }
    
}
