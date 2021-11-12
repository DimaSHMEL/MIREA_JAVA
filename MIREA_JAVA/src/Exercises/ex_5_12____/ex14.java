package Exercises.ex_5_12____;

import java.util.Scanner;

public class ex14 {
    private Scanner scan = new Scanner(System.in);
    public void answ(int val)
    {
        if(val == 0)
            System.out.print(val);
        else
            all_numbers(val);
    }
    public void all_numbers(int val) {
        if(val / 10 == 0 && val == 0)
            return;
        all_numbers(val / 10);
        System.out.print(val % 10 + " ");

    }
}
