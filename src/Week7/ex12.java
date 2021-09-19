package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex12 {

    public static void main(String[] args) {
        System.out.println(makeAList(5, "double"));
        System.out.println(randomDouble(1, "double"));
    }

    public static List<Number> makeAList(int number, String type){
        List<Number> list=new ArrayList<>();
        if("int".equals(type) || "long".equals(type) || "short".equals(type)){
            for (int i = 0; i < number; i++) {
                list.add(i*2);
            }
        }
        else if("double".equals(type) || "float".equals(type)){
            for (double i = 0; i < number; i++) {
                list.add(i*2);
            }
        }
        else if("byte".equals(type)){
            if(number>-128 && number<=127){
                for (int i = 0; i < number; i++) {
                    list.add(i*2);
                }
            }
        }
        else{
            throw new IllegalArgumentException();
        }
        return list;

    }

    public static List<Double> randomDouble(int number, String  type){
        Random r= new Random();
        List<Double> list=new ArrayList<>();
        if("double".equals(type)) {

            for (int i = 0; i < number; i++) {
                list.add(r.nextDouble()*2);
            }
        }
        else{
            throw new IllegalArgumentException("Type is not double");
        }
        return list;
    }
}
