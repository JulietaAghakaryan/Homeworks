package Week4.AutoboxingUnboxing;

import java.util.ArrayList;
import java.util.List;

public class DoubleAutoboxing {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Double pi = 3.14;
        list.add(pi);
        double d = list.get(0);
        System.out.println(d);


    }

}
