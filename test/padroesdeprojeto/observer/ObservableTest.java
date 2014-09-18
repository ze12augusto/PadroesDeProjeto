package padroesdeprojeto.observer;

import junit.framework.TestCase;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author a12027227
 */
public class ObservableTest extends TestCase {
    
    private Observable observable;
    
    @Mock
    private Observer observerTermometro,
                     observerTermometroAnalogico;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        observable = new Observable();
        MockitoAnnotations.initMocks(this);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testQuandoTemperaturaSetadaForMaiorQue1DeveExecutarMetodoReceberNotificaoDoObserverAdicionadoQueEObserverTermometro() {
         
        observable.addObserver(observerTermometro);
        observable.setTemperatura(2);
        verify(observerTermometro, atLeastOnce()).receberNotificao(anyInt());
    }
    
    public void testQuandoTemperaturaSetadaMenorOuIgual1QueNaoDeveExecutarMetodoReceberNotificaoDoObserverAdicionadoQueEObserverTermometro() {
         
        observable.addObserver(observerTermometro);
        observable.setTemperatura(1);
        verify(observerTermometro, never()).receberNotificao(anyInt());
    }
    
    public void testQuandoTemperaturaSetadaForMenorOuIgual1Que1DeveExecutarMetodoReceberNotificaoDoObserverAdicionadoQueEObserverTermometroAnalogico() {
         
        observable.addObserver(observerTermometroAnalogico);
        observable.setTemperatura(1);
        verify(observerTermometroAnalogico, never()).receberNotificao(anyInt());
    }
    
    public void testQuandoTemperaturaSetadaForMaiorQue1DeveExecutarMetodoReceberNotificaoDoObserverAdicionadoQueEObserverTermometroAnalogico() {
         
        observable.addObserver(observerTermometroAnalogico);
        observable.setTemperatura(2);
        verify(observerTermometroAnalogico, atLeastOnce()).receberNotificao(anyInt());
    }
    
    
    public void testQuandoTemperaturaSetadaForMaiorQue1DeveExecutarMetodoReceberNotificaoDeTodosOsObserversAdicionados() {
         
        observable.addObserver(observerTermometroAnalogico);
        observable.addObserver(observerTermometro);
        observable.setTemperatura(2);
        verify(observerTermometroAnalogico, atLeastOnce()).receberNotificao(anyInt());
        verify(observerTermometro, atLeastOnce()).receberNotificao(anyInt());
    }
}
