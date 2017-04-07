package april06;

/**
 * Created by root on 06.04.17.
 */
public class Singleton {

private static Singleton singleton;

    private Singleton(){
    }
    static Singleton init (){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
