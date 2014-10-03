package padroesdeprojeto.strategy;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploStrategy extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        
        Human brazilian = new Human(new ForkAndKnifeeStrategy());
        System.out.println( brazilian.eat() );
        Human japanese = new Human(new HashiStrategy());
        System.out.println( japanese.eat() );
        brazilian.setStrategy(new HashiStrategy());
        System.out.println( brazilian.eat() );
        japanese.setStrategy(new ForkAndKnifeeStrategy());
        System.out.println( japanese.eat() );
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("Strategy");
    }
    
}
