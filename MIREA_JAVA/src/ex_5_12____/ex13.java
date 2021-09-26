package ex_5_12____;

import java.util.Scanner;

public class ex13 {
    private Scanner scan = new Scanner(System.in);
    public void not_even_pos_rec()
    {
        int val;
        if (scan.hasNext())
            val = scan.nextInt();
        else
            return;
        if(val == 0)
            return;
        System.out.println(val + " ");
        even_pos_rec();
    }
    public void even_pos_rec()
    {
        {
            int val;
            if (scan.hasNext())
                val = scan.nextInt();
            else
                return;
            if(val == 0)
                return;
            not_even_pos_rec();
        }
    }
}
