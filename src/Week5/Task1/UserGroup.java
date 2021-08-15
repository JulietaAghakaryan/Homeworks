package Week5.Task1;

import java.util.Arrays;

public class UserGroup implements Cloneable {

    private final User[] array;
    private int index = 0;


    private static final int ARRAY_SIZE = 10;


    public UserGroup() {
        this.array = new User[ARRAY_SIZE];
    }


    public void addUser(User user) {
        if (index > ARRAY_SIZE) {
            throw new OversizedArrayException("Cannot have array with more than 10 elements");
        }
        this.array[index] = new User(user.copy());
        index++;
    }


    @Override
    public String toString() {
        return "UserGroup{" +
                "array=" + Arrays.toString(array) +
                ", index=" + index +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        User user = new User("sead", "sdcs", "dscs", "acd");
        User user1 = new User("sead", "sdcs", "dscs", "acd");
        User user2 = new User("sead", "sdcs", "dscs", "acd");
        User user3 = new User("sead", "sdcs", "dscs", "acd");
        User user4 = new User("sead", "sdcs", "dscs", "acd");
        User user5 = new User("sead", "sdcs", "dscs", "acd");
        User user6 = new User("sead", "sdcs", "dscs", "acd");
        User user7 = new User("sead", "sdcs", "dscs", "acd");
        User user8 = new User("sead", "sdcs", "dscs", "acd");
        User user9 = new User("sead", "sdcs", "dscs", "acd");
        User user10 = new User("sead", "sdcs", "dscs", "acd");

        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user);
        userGroup.addUser(user1);
        userGroup.addUser(user2);
        userGroup.addUser(user3);
        userGroup.addUser(user4);
        userGroup.addUser(user5);
        userGroup.addUser(user6);
        userGroup.addUser(user7);
        userGroup.addUser(user8);
        userGroup.addUser(user9);

        System.out.println(userGroup);
    }
}
