package padroesdeprojeto.singleton;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploSingleton extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("Date:"+singleTon.getData());
        SingleTon singleTonSecondTime = SingleTon.getInstance();
        System.out.println("Date:"+singleTonSecondTime.getData());
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("SingleTow");
    }
    
}
