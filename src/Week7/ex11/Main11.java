package Week7.ex11;

import Week5.Task2.NotEqualException;

import java.util.*;

public class Main11 {

    public static void main(String[] args) {

        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(2, "user2");
        User user5 = new User(2, "user2");

        List<User> arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        arrayList.add(user5);
        List<User> linkedList = new LinkedList<>();
        linkedList.add(user1);
        linkedList.add(user2);
        linkedList.add(user3);
        linkedList.add(user4);
        linkedList.add(user5);
        Set<User> hashSet = new HashSet<>();
        hashSet.add(user1);
        hashSet.add(user2);
        hashSet.add(user3);
        hashSet.add(user4);
        hashSet.add(user5);
        Set<User> treeSet = new TreeSet<>();
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        treeSet.add(user4);
        treeSet.add(user5);

        assertCollection(linkedList);
    }
    public static String assertCollection(Collection<User> collection){
        if(collection instanceof List<?> || collection instanceof Set<?>){
            if(collection.size()!=5){
                throw new NotEqualException("The size of the collection is not 5");
            }
        }
        else {
            throw new IllegalArgumentException("Your collection is of wrong type");
        }
        return String.format("the size of %d is 5", collection);
    }
}
