package Exercises.ex_5_12____;

import java.util.Scanner;

public class ex16 {
    private Scanner scan = new Scanner(System.in);
    public String max_quan(int max, int quan) {
        int val = scan.nextInt();
        if(val == 0)
            return "Max val is " + max + " and it is in line times " + quan;
        else
        {
            if(val > max)
                return max_quan(val,1);
            else if( val == max)
                return  max_quan(max, quan + 1);
            else
                return max_quan(max, val);
        }

    }
}