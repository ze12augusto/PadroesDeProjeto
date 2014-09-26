package padroesdeprojeto.observer;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploObserver implements ExemplosPadroes{

    @Override
    public void execute() {
        System.out.println("Observer");
       
        Termometro termometro = new Termometro();
        TermometroAnalogico termometroAnalogico = new TermometroAnalogico();
        Observable observable = new Observable();
        observable.addObserver(termometro);
        observable.addObserver(termometroAnalogico);
        observable.setTemperatura(0);
        observable.setTemperatura(1);
        observable.setTemperatura(2);
        
        System.out.println("----------------------------------\n\n\n");
    }
    
}
