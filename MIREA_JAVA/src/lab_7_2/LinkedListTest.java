package lab_7_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {
    private LinkedList<Integer> content = new LinkedList();
    Scanner scanner = new Scanner(System.in);
    public LinkedListTest()
    {
        content.addFirst(1); content.addFirst(2);
        System.out.println(content);
        content.addLast(3); content.addLast(4);
        System.out.println(content);
        content.removeFirst();
        System.out.println(content);
        content.removeLast();
        System.out.println(content);
        System.out.println(content.getFirst());
        System.out.println(content.getLast());
        content.clear();
        System.out.println(content);
        System.out.println(content.isEmpty());
        ArrayList<Integer> in = new ArrayList<>();
        in.add(1); in.add(2); in.add(3); in.add(4);
        content = new LinkedList<>(in);
        System.out.println(content);
        System.out.println(content.subList(1,4));
        System.out.println(content.contains(3));
        System.out.println(content.containsAll(in));
        System.out.println(content.size());
        content.remove(3);
        System.out.println(content);
        content.set(0,5);
        System.out.println(content);
        System.out.println(content.indexOf(5));
    }
}
