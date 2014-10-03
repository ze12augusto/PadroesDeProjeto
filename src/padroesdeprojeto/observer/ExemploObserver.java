package padroesdeprojeto.observer;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploObserver extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        
        Termometro termometro = new Termometro();
        TermometroAnalogico termometroAnalogico = new TermometroAnalogico();
        Observable observable = new Observable();
        observable.addObserver(termometro);
        observable.addObserver(termometroAnalogico);
        observable.setTemperatura(0);
        observable.setTemperatura(1);
        observable.setTemperatura(2);
    }

    @Override
    public void executeSoutComNomeExemplo() {
         System.out.println("Observer");
    }
    
}
