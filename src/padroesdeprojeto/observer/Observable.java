package padroesdeprojeto.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a12027227
 */
public class Observable {

    private List<Observer> listaDeObserver = new ArrayList<>();
    private int temperatura;

    public void addObserver(Observer observer) {
        listaDeObserver.add(observer);
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        
        if( temperatura > 1 ){
            notificarTodos();
        }
    }

    private void notificarTodos() {

        for (Observer observer : listaDeObserver) {
            observer.receberNotificao( temperatura );
        }
    }
}
