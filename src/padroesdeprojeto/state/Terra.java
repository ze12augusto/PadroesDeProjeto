package padroesdeprojeto.state;

/**
 *
 * @author a12027227
 */
public class Terra implements EstadoPersonagem{

    @Override
    public String mover() {
        return "anda normal";
    }

    @Override
    public String atirar() {
        return "atira normal";
    }
    
}
