package padroesdeprojeto;

/**
 *
 * @author a12027227
 */
public abstract class ExemplosPadroes {
    
    public void execute(){
        
        executeSoutComNomeExemplo();
        executeExemplo();
        System.out.println("----------------------------------\n\n\n");
    }

    public abstract void executeExemplo();
    
    public abstract void executeSoutComNomeExemplo();

}
