package Day07;

import java.util.LinkedList;

public class main {

    public static void main(String[] args) {

        linkedList();
    }

    public static void linkedList() {

        LinkedList<String> names = new LinkedList<>();   // code to the interface
        names.offer("Kavindu");
        names.offer("ranil");
        names.offer("amal");

        names.add("aruna");

        System.out.println(names);
        System.out.println(names.get(1));
    }
}
