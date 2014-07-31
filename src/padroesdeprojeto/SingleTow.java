package padroesdeprojeto;

import javax.swing.JOptionPane;

/**
 *
 * @author a12027227
 */
public class SingleTow {

    private static SingleTow instance;
    private Long date;

    public static SingleTow getInstance() {

        if (instance == null)
            instance = new SingleTow();

        return instance;
    }

    private SingleTow() {
        date = System.currentTimeMillis();
        
    }
    
    public Long getData(){
        
        return date;
    }
}
