package fun.zestzone.singletoncase;

public class SingleInstanceC {
    private SingleInstanceC() {
    }

    private static class InstanceHolder {
        private static final SingleInstanceC instanceC = new SingleInstanceC();
    }

    //静态内部类式 或者叫登记式
    public static SingleInstanceC getInstance() {
        return InstanceHolder.instanceC;
    }
}
