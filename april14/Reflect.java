package april14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by root on 14.04.17.
 */
public class Reflect {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<String> stringClass = String.class;
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method m:declaredMethods) {
            System.out.println(m.getName());
        }

        Constructor<MyThread> constructor = MyThread.class.getConstructor(Main.class);
        MyThread myThread = constructor.newInstance(new Main());
        constructor.setAccessible(true);

//        invoke для методов
    }

}
