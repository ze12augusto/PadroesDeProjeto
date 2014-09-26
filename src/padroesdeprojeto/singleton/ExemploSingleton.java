package padroesdeprojeto.singleton;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploSingleton implements ExemplosPadroes{

    @Override
    public void execute() {
        System.out.println("SingleTow");
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("Date:"+singleTon.getData());
        SingleTon singleTonSecondTime = SingleTon.getInstance();
        System.out.println("Date:"+singleTonSecondTime.getData());
        System.out.println("----------------------------------\n\n\n");
    }
    
}
