package Week8.ListAndSetAssertion;

import Week5.Task2.NotEqualException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ListAndSetAssertion {


    public static boolean assertCollection(Collection<?> collection, int size){
        if(collection.size()==size){
            return true;
        }
        throw new SizeNotMatchException(String.format("The size of the " +
                "collection is - %d which is not equal to" +
                " the given size - %d", collection.size(), size));
    }

    public static void main(String[] args) {
        List<String > list=new ArrayList<>();
        list.add("s");
        list.add("sd");
        System.out.println(assertCollection(list, 2));

    }
}
