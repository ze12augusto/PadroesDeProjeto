package padroesdeprojeto.template;

/**
 *
 * @author ze12augusto
 */
public abstract class Relatorio {

    public String gerarRelatorio() {

        buscarDados();
        calcular();
        return exportar();
    }

    private void buscarDados() {
        System.out.println("Buscando Dados");
    }

    private void calcular() {

        System.out.println("Calculando");
    }

    public abstract String exportar();
}
