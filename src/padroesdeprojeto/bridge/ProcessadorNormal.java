package padroesdeprojeto.bridge;

/**
 *
 * @author a12027227
 */
public class ProcessadorNormal implements Processador{

    @Override
    public String processarDados(String dados) {
        return "processando normalmente dados:" + dados;       
    }
    
}
