
package lab_1_4;


import java.util.Arrays;
import java.util.Scanner;

public class func_mass {
    public static int[] createmass(int size)
    {
         int[] mas;
         mas = new int[size];
                for(int i = 0; i < size; i++)
                {
                    mas[i] = (int) (Math.random()*(100));
                }
                return mas;
    }
    public static  void printmas(int [] mas)
    {
        for(int i = 0; i < mas.length; i++)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = createmass(sc.nextInt());
        printmas(mas);
        Arrays.sort(mas);
        printmas(mas);


    }
}
