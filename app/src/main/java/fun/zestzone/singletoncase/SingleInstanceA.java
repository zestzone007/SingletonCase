package fun.zestzone.singletoncase;

import android.util.Log;

public class SingleInstanceA {
    private SingleInstanceA() {
        Log.i("test", "SingleInstanceA: instanced" );
    }

    private static SingleInstanceA instanceA;

    //懒汉式 非线程安全
    public static SingleInstanceA getInstance() {
        if (instanceA == null) {
            instanceA = new SingleInstanceA();
        }
        return instanceA;
    }
}
