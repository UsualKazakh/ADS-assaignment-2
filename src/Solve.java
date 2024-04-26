import java.util.*;

public class Solve {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("string1");
        list.add("string2");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(0);
        System.out.println(list.get(0));

        list.add(0, "string1");
        System.out.println(list.get(0));

        list.
    }
}