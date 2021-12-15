package Exercises.ex_8;

import java.util.ArrayList;

public class TestWaitList {
    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<Integer>();
        in.add(1); in.add(2); in.add(3); in.add(4);
        ArrayList<Integer> check = new ArrayList<Integer>();
        check.add(3); check.add(4);
        WaitList<Integer> one = new WaitList<Integer>(in);
        one.add(5);
        System.out.println(one);
        System.out.println(one.remove());
        System.out.println(one);
        System.out.println(one.contains(5));
        System.out.println(one.containsAll(check));
        System.out.println(one.isEmpty());
        BoundedWaitList<Integer> two = new BoundedWaitList<Integer>(4);
        two.add(1); two.add(2); two.add(3); two.add(4); two.add(5);
        System.out.println(two);
        System.out.println(two.getCapacity());
        UnfairWaitList<Integer> three = new UnfairWaitList<Integer>();
        three.add(1); three.add(2); three.add(3); three.add(4);
        System.out.println(three);
        three.remove(2);
        System.out.println(three);
        three.moveToBack();
        System.out.println(three);
    }
}
