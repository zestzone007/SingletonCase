package fun.zestzone.singletoncase;

public class SingleInstanceB {

    private SingleInstanceB() {

    }

    private final static SingleInstanceB instanceB = new SingleInstanceB();
    //饿汉式
    public static SingleInstanceB getInstance() {
        return instanceB;
    }

}
