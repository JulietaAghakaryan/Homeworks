package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex12 {


    public static List<Number> makeAList(int number, Number type){
        List<Number> list=new ArrayList<>();
        if(type instanceof Integer || type instanceof Long  || type instanceof Short){
            for (int i = 0; i < number; i++) {
                list.add(i*2);
            }
        }
        else if(type instanceof Double || type instanceof Float){
            for (double i = 0; i < number; i++) {
                list.add(i*2);
            }
        }
        else if(type instanceof Byte){
            if(number>-128 && number<=127){
                for (int i = 0; i < number; i++) {
                    list.add(i*2);
                }
            }
        }
        return list;

    }

    public static List<Double> randomDouble(int number, Number type){
        Random r= new Random();
        List<Double> list=new ArrayList<>();
        if(type instanceof Double) {

            for (int i = 0; i < number; i++) {
                list.add(r.nextDouble()*2);
            }
        }
        return list;
    }
}
