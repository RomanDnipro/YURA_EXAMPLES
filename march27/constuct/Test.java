package march27.constuct;

public class Test {

    public static void main(String[] args) {

        A a = new B();
        A a2 = new A(5);
        A a3 = new A();

        new Car();
        new Car();
        new Car("Mazda");
        new Car("Opel");
        new Car();

//        System.out.println(Car.counter);
        System.out.println(Car.getCounter());
//        System.out.println(Car.name);

    }

}
