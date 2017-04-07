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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
