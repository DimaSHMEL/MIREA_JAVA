package ex_5_12____;

import java.util.Scanner;

public class ex12 {
    private Scanner scan = new Scanner(System.in);
    public void not_even_rec()
    {
        int val;
        if (scan.hasNext())
            val = scan.nextInt();
        else
            return;
        if(val == 0)
            return;
        if( val % 2 == 1)
            System.out.println(val + " ");
        not_even_rec();
    }
}
