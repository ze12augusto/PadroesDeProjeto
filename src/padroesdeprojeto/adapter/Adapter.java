package padroesdeprojeto.adapter;

/**
 *
 * @author ze12augusto
 */
public class Adapter implements Antiga{
    
    Nova nova = new Nova();
    
    @Override
    public String enviar(String numero, String texto) {
        return nova.enviarComObjeto(new Sms(numero, texto));
    }
}
