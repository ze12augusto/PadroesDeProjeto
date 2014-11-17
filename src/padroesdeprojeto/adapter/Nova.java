package padroesdeprojeto.adapter;

/**
 *
 * @author ze12augusto
 */
public class Nova{
    
    public String enviarComObjeto(Sms sms){
        return "enviando sms para : " + sms.getNumero();
    }
    
}
