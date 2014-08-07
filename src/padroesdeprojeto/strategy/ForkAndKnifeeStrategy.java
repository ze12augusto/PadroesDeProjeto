package padroesdeprojeto.strategy;

/**
 *
 * @author ze12augusto
 */
public class ForkAndKnifeeStrategy implements EatStrategy{

    @Override
    public String eat() {
        return "Eat with fork and knife";
    }
    
}
