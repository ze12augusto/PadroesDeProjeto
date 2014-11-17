package padroesdeprojeto.adapter;

/**
 *
 * @author ze12augusto
 */
public class Sms {

    private String numero;
    private String texto;

    public Sms(String numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
