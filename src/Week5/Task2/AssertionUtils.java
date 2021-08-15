package Week5.Task2;
public class AssertionUtils {

    public static void assertEquals(int val1, int val2){
        if(val1!=val2){
            throw new RuntimeException("These numbers are not equal");
        }
    }
    public static void assertEquals(double val1, double val2){
        if(val1!=val2){
            throw new RuntimeException("These numbers are not equal");
        }
    }
    public static void assertEquals(String val1, String val2){
        if(val1.equals(val2)){
            throw new RuntimeException("These strings are not the same");
        }
    }
    public static void assertEquals(boolean val1, boolean val2){
        if(val1!=val2){
            throw new RuntimeException("These booleans are not equal");
        }
    }
    public static void assertEquals(Object obj){
        if(obj==null){
            throw new RuntimeException("The given object is null");
        }
    }
}
