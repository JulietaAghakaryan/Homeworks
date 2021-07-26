package Week4.AutoboxingUnboxing;

import java.util.Random;
import java.util.Scanner;

public class NegativeNumber {

    public static void main(String[] args) {
        Random random = new Random();
        Integer negativeNumber = random.nextInt(10) * (-100);
        System.out.println(negativeNumber);
        System.out.println(integerToInt(negativeNumber));

    }

    public static int integerToInt(Integer integer) {
        int intInteger = Math.abs(integer);
        return intInteger;
    }


}
