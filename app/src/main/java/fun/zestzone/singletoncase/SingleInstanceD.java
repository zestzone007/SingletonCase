package fun.zestzone.singletoncase;

public class SingleInstanceD {
    private SingleInstanceD() {
    }

    private volatile static SingleInstanceD instanceD;

    //双重校验式
    public static SingleInstanceD getInstance() {
        if (instanceD == null) {
            synchronized (SingleInstanceD.class) {
                if (instanceD == null) {
                    instanceD = new SingleInstanceD();
                }
            }
        }
        return instanceD;
    }
}
