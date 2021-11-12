package Labratory.lab_1_4;

import java.util.Arrays;
public class Mas {
    private int [] mas;
    public Mas(int size)
    {
        int[] mas;
        mas = new int[size];
        for(int i = 0; i < size; i++)
        {
            mas[i] = (int) (Math.random()*(100));
        }
        this.mas = mas;
    }
    public void sorting(){
        Arrays.sort(this.mas);
    }
    public String toString() {
        return "Mas{" + Arrays.toString(mas) +
                '}';
    }
}
