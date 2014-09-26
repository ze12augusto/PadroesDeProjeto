package padroesdeprojeto.strategy;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author a12027227
 */
public class ExemploStrategy implements ExemplosPadroes{

    @Override
    public void execute() {
        System.out.println("Strategy");
        Human brazilian = new Human(new ForkAndKnifeeStrategy());
        System.out.println( brazilian.eat() );
        Human japanese = new Human(new HashiStrategy());
        System.out.println( japanese.eat() );
        brazilian.setStrategy(new HashiStrategy());
        System.out.println( brazilian.eat() );
        japanese.setStrategy(new ForkAndKnifeeStrategy());
        System.out.println( japanese.eat() );
        System.out.println("----------------------------------\n\n\n");
    }
    
}
