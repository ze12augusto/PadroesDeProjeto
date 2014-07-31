package padroesdeprojeto;

import junit.framework.TestCase;

/**
 *
 * @author a12027227
 */
public class SingleTowTest extends TestCase {
    
    private SingleTow instance, instanceSecondTime;
    
    public SingleTowTest(String testName) {
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
        
        instance = SingleTow.getInstance();
        instanceSecondTime = SingleTow.getInstance();
        
        assertEquals(instance, instanceSecondTime);
    }
    
    public void testGetDataDeveDevolverMesmaDataQuandoChamarMetodoGetInstanceSegundaVez(){
        
        instance = SingleTow.getInstance();
        Long date = instance.getData();
        instanceSecondTime = SingleTow.getInstance();
        Long dateSecondTime = instanceSecondTime.getData();
        
        assertEquals(date, dateSecondTime);
    }
}
