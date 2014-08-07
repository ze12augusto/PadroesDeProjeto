package padroesdeprojeto.strategy;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author ze12augusto
 */
public class HumanTest extends TestCase {
    
    private String forkAndKnife = "Eat with fork and knife",
                    hashi = "Eat with hashi";
    private Human human;
    
    public HumanTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
    public void testMetodoEatQuandoStrategyForForkAndKnifeStrategy() {
        
        human = new Human(new ForkAndKnifeeStrategy());
        String eat = human.eat();
        
        assertEquals(forkAndKnife, eat);
    }

    public void testMetodoEatQuandoStrategyForHashiStrategy() {
        
        human = new Human(new HashiStrategy());
        String eat = human.eat();
        
        assertEquals(hashi, eat);
    }
}
