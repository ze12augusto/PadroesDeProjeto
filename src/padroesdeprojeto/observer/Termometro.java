package padroesdeprojeto.observer;

/**
 *
 * @author a12027227
 */
public class Termometro implements Observer {

    @Override
    public void receberNotificao(int temperatura) {
        System.out.println("Temperatura do termometro alterada para : " + temperatura);
    }
}
