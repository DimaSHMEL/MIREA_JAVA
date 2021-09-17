package lab_1_4;

import java.util.Scanner;

public class TestFunc_mas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mas mas = new Mas(sc.nextInt());
        System.out.println(mas);
        mas.sorting();
        System.out.println(mas);
    }
}
