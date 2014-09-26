package padroesdeprojeto.bridge;

/**
 *
 * @author a12027227
 */
public abstract class GerarRelatorio {

    private Processador processador = new ProcessadorNormal();
    private ProcessadorFactory processadorFactory = new ProcessadorFactory();

    public String gerarRelatorio() {

        buscarDados();
        calcular();
        return processador.processarDados( exportar() );
    }

    private void buscarDados() {
        System.out.println("Buscando Dados");
    }

    private void calcular() {

        System.out.println("Calculando");
    }

    public abstract String exportar();

    public void setProcessador(String  tipoProcessador) {
        
        this.processador = processadorFactory.getProcessador(tipoProcessador);
    }
}
