package padroesdeprojeto.state;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author a12027227
 */
public class PersonagemTest extends TestCase {
    
    private Personagem personagem;
    private String moveDevagar = "anda devagar",
                   moveNormal = "anda normal",
                   atiro = "atira normal",
                   naoAtiro = "nao consegue tirar";
    
    public PersonagemTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        personagem = new Personagem();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testPressionouBotaoDireitoQuandoEstadoForNaAguaDeveRetornaStringMoverDevagar() {
        
        personagem.setEstadoPersonagem(new Agua());
        String retorno = personagem.pressionouSetaDireita();
        assertEquals(moveDevagar, retorno);
    }
    
    public void testPressionouR1QuandoEstadoForNaAguaDeveRetornaStringNaoAtiro() {
        
        personagem.setEstadoPersonagem(new Agua());
        String retorno = personagem.pressionarR1();
        assertEquals(naoAtiro, retorno);
    }
    
    public void testPressionouR1QuandoEstadoForNaLamaDeveRetornaStringAtiro() {
        
        personagem.setEstadoPersonagem(new Lama());
        String retorno = personagem.pressionarR1();
        assertEquals(atiro, retorno);
    }
    
    public void testPressionouBotaoDireitoQuandoEstadoForNaLamaDeveRetornaStringMoverDevagar() {
        
        personagem.setEstadoPersonagem(new Lama());
        String retorno = personagem.pressionouSetaDireita();
        assertEquals(moveDevagar, retorno);
    }
     public void testPressionouR1QuandoEstadoForNaTerraDeveRetornaStringAtiro() {
        
        String retorno = personagem.pressionarR1();
        assertEquals(atiro, retorno);
    }
    
    
    public void testPressionouBotaoDireitoQuandoEstadoForNaTerraDeveRetornaStringMoverNormal() {
        
        String retorno = personagem.pressionouSetaDireita();
        assertEquals(moveNormal, retorno);
    }
}
