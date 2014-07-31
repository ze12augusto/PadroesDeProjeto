
package padroesdeprojeto;

/**
 *
 * @author a12027227
 */
public class PadroesDeProjeto {
    
    public static void main(String[] args) {
        
        singletow();
    }
    
    private static void singletow(){
        
        System.out.println("SingleTow");
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("Date:"+singleTon.getData());
        SingleTon singleTonSecondTime = SingleTon.getInstance();
        System.out.println("Date:"+singleTonSecondTime.getData());
        System.out.println("----------------------------------\n\n\n");
    }
}
