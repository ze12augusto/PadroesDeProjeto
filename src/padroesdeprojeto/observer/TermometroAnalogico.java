package padroesdeprojeto.observer;

/**
 *
 * @author a12027227
 */
public class TermometroAnalogico implements Observer {

    @Override
    public void receberNotificao(int temperatura) {
        System.out.println("Temperatura do termometro analógico alterada para : " + temperatura);
    }
}
