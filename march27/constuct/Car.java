package march27.constuct;

public class Car {

    String name;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    static void printName() {
        System.out.println(new Car().name);
//        System.out.println(name);
//        нестатические поля не видны их статического контекста
    }

    public Car(String name) {
        this.name = name;
        counter++;
    }

    public Car() {
        this("Car default");
    }

}
