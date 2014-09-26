package padroesdeprojeto.bridge;

/**
 *
 * @author a12027227
 */
public class ProcessadorCriptografado implements Processador{

    @Override
    public String processarDados(String dados) {
        return "processando com criptografia dados:" + dados;
        
    }
    
}
