package april07;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by root on 07.04.17.
 */
public class Test {
    public static void main(String[] args) {

        Set<User> users = new TreeSet<>();
        users.add(new User(5, "Vasya"));
        users.add(new User(-9, "Grisha"));
        users.add(new User(7, "Ignat"));
        users.add(new User(15, "Oleg"));
        users.add(new User(9, "Olga"));


        System.out.println(users);
//        for (User u : users) {
//            System.out.println(u);
//        }
    }
}
