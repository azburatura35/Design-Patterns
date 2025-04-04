package singleton;

public class EarlyInitSingleton {

    //Early Initialization

    private static final EarlyInitSingleton INSTANCE = new EarlyInitSingleton();

    public static EarlyInitSingleton getInstance() {
        return INSTANCE;
    }

    private EarlyInitSingleton(){

    }

}
