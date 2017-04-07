package april06;

/**
 * Created by root on 06.04.17.
 */
public class Test {

    public static void main(String[] args) {
//        new Singleton();
//        new Singleton();
        Singleton singleton = Singleton.init();
        Singleton singleton2 = Singleton.init();
        System.out.println(singleton);
        System.out.println(singleton2);


    }

}
