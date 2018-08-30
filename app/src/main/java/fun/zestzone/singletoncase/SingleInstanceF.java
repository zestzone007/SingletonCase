package fun.zestzone.singletoncase;

public class SingleInstanceF {
    private SingleInstanceF() {
    }

    private static SingleInstanceF instanceF;

    public static synchronized SingleInstanceF getInstance() {
        if (instanceF == null) {
            instanceF = new SingleInstanceF();
        }
        return instanceF;
    }
}
