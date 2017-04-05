package march31;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Holder<Integer, String, Float> holder = new Holder<>();
        holder.setC(5);

        Holder<String, String, Integer> holder2 = new Holder<>();
        holder2.setC("");

        String a = holder2.getA();

        Number number = new Integer(1);

        Holder<? super Integer, String, Integer> holder3 = new Holder<>();
        //holder3.setA();

        List<? extends Number> list = new ArrayList<Integer>();

    }

}
