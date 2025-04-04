package singleton;

public class InitOnDemandSingleton {

    //Initialization on Demand
    //lazy initialization

    private static class InstanceHolder {
        private static final InitOnDemandSingleton INSTANCE = new InitOnDemandSingleton();
    }

    public static InitOnDemandSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private InitOnDemandSingleton(){}

}
