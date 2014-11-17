package padroesdeprojeto.builder;

import padroesdeprojeto.ExemplosPadroes;

/**
 *
 * @author ze12augusto
 */
public class ExemploBuilder extends ExemplosPadroes{

    @Override
    public void executeExemplo() {
        Pessoa pessoa = Pessoa.criaPessoa()
                .usandoCamisaBranca()
                .pesando60Kilos();
        
        System.out.println("peso:" + pessoa.getPeso());
        System.out.println("cor camisa:" + pessoa.getCorCamisa());
    }

    @Override
    public void executeSoutComNomeExemplo() {
        System.out.println("Builder");
    }
    
}
