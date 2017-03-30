package march30.example;

import march27.initorder.*;

public class Test {

    public static void main(String[] args) {

        Child child = new Child();
        Child.Inner inner = child.new Inner();
        inner.inner();

    }

}
