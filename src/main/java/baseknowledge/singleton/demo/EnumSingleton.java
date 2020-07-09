package baseknowledge.singleton.demo;

/**
 * @author didi
 */

public enum  EnumSingleton {
    INSTANCE;
    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
