
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
        SingleTow singleTow = SingleTow.getInstance();
        System.out.println("Date:"+singleTow.getData());
        SingleTow singleTowSecondTime = SingleTow.getInstance();
        System.out.println("Date:"+singleTowSecondTime.getData());
        System.out.println("----------------------------------\n\n\n");
    }
}
