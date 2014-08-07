package padroesdeprojeto.strategy;

/**
 *
 * @author ze12augusto
 */
public class Human {

    private EatStrategy eatStrategy;

    public Human(EatStrategy eatStrategy) {
        this.eatStrategy = eatStrategy;
    }

    public String eat() {
        return this.eatStrategy.eat();
    }

    public EatStrategy getStrategy() {
        return this.eatStrategy;
    }

    public void setStrategy(EatStrategy eatStrategy1) {
        this.eatStrategy = eatStrategy1;
    }
}
