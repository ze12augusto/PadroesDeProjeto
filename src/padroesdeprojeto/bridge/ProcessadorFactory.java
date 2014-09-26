package padroesdeprojeto.bridge;

/**
 *
 * @author a12027227
 */
public class ProcessadorFactory {
    
    public Processador getProcessador( String tipoProcessador ){
        
        if( tipoProcessador.contains("criptografado") ){
            return new ProcessadorCriptografado();
        }
        return new ProcessadorNormal();
    }
}
