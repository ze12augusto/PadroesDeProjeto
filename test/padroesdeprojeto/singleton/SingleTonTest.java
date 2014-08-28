package padroesdeprojeto.singleton;

import junit.framework.TestCase;

/**
 *
 * @author ze12augusto
 */
public class SingleTonTest extends TestCase {
    
    private SingleTon instance, instanceSecondTime;
    
    public SingleTonTest(String testName) {
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

    public void testGetInstance() {
        
        instance = SingleTon.getInstance();
        instanceSecondTime = SingleTon.getInstance();
        
        assertEquals(instance, instanceSecondTime);
    }
    
    public void testGetDataDeveDevolverMesmaDataQuandoChamarMetodoGetInstanceSegundaVez(){
        
        instance = SingleTon.getInstance();
        Long date = instance.getData();
        instanceSecondTime = SingleTon.getInstance();
        Long dateSecondTime = instanceSecondTime.getData();
        
        assertEquals(date, dateSecondTime);
    }
}
