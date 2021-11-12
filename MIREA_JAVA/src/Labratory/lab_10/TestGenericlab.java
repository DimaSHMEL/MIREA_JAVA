package Labratory.lab_10;

import java.util.ArrayList;

public class TestGenericlab
{
    public static void main(String[] args) {
        //задание 1
        genriclab GENRICS = new genriclab();
        ArrayList<Integer> Arr_1 = GENRICS.ArrayToArrayList( new Integer[] { 1 , 2, 2, 3} );
        System.out.println(Arr_1);
        //задание 2
        try {
                genericarr Arr_2 = new genericarr();
                Arr_2.add(1);
                Arr_2.add(10);
                Arr_2.add("Aha");
                Arr_2.add("122");
                System.out.println(Arr_2);
            }
            catch (Exception e)
            {
                System.out.println("Err");
            }
        //Задание 3
        try {
            System.out.println(GENRICS.getElemetn(3, new Integer[] { 1 , 2, 5, 20} ));
            System.out.println(GENRICS.getElemetn(3, new String[] { "A", "AB", "ABC", "ABCD", "ABCDE"} ));
        }
        catch (Exception e)
        {
            System.out.println("Err");
        }
        //Задание 4
        Dirinputer<String> dir = new Dirinputer<>();
    }
}
