package padroesdeprojeto.singleton;

/**
 *
 * @author a12027227
 */
public class SingleTon {

    private static SingleTon instance;
    private Long date;

    public static SingleTon getInstance() {

        if (instance == null) {
            instance = new SingleTon();
        }

        return instance;
    }

    private SingleTon() {
        date = System.currentTimeMillis();

    }

    public Long getData() {

        return date;
    }
}
