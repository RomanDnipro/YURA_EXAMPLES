package april07;

/**
 * Created by root on 07.04.17.
 */
public class User implements Comparable<User> {

    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User user) {

        return this.age - user.getAge();
//        if (this.age > user.getAge()){
//            return 1;
//        } else if(this.age < user.getAge()){
//            return -1;
//        } return 0;
    }
}
