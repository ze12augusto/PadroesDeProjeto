
package padroesdeprojeto;

import padroesdeprojeto.singleton.SingleTon;
import padroesdeprojeto.strategy.Human;
import padroesdeprojeto.strategy.ForkAndKnifeeStrategy;
import padroesdeprojeto.strategy.HashiStrategy;

/**
 *
 * @author a12027227
 */
public class PadroesDeProjeto {
    
    public static void main(String[] args) {
        
        singletow();
        strategy();
    }
    
    private static void singletow(){
        
        System.out.println("SingleTow");
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("Date:"+singleTon.getData());
        SingleTon singleTonSecondTime = SingleTon.getInstance();
        System.out.println("Date:"+singleTonSecondTime.getData());
        System.out.println("----------------------------------\n\n\n");
    }
    private static void strategy(){
        
        System.out.println("Strategy");
        Human brazilian = new Human(new ForkAndKnifeeStrategy());
        brazilian.eat();
        Human japanese = new Human(new HashiStrategy());
        japanese.eat();
        brazilian.setStrategy(new HashiStrategy());
        brazilian.eat();
        japanese.setStrategy(new ForkAndKnifeeStrategy());
        japanese.eat();
    }
    
}
