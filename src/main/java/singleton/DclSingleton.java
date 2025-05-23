package singleton;

public class DclSingleton {
// double-checked locking design pattern

    private static volatile DclSingleton instance;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null)
                    instance = new DclSingleton();
            }
        }
        return instance;
    }

}
