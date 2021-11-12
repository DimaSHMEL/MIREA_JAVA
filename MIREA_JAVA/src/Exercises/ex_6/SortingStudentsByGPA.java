package Exercises.ex_6;


import java.util.Scanner;

public class SortingStudentsByGPA implements  Comparator{
    class Pair
    {
        private String key;
        private int value;
        public Pair(String key, int value)
        {
            this.key = key;
            this.value = value;
        }
        public int getValue() {
            return value;
        }

        public String getKey() {
            return key;
        }
        public String toString() {
            return "Student = " + key +
                    " Marks = " + value +'\n';
        }
    }

    private  Pair[] array;
    private int size, capacity;
    private Scanner scan = new Scanner(System.in);
    public SortingStudentsByGPA()
    {
        int i = 0;
        size = 10;
        array = new Pair[size];
        while(scan.hasNextInt()) {
            int key = scan.nextInt();
            String name = scan.nextLine();
            name = name.strip();
            Pair temp = new Pair(name, key);
            array[i] = temp;
            i+=1;
        }
        capacity = i - 1;
        quickSort(0, i - 1);
    }
    public void quickSort(int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int stand = array[middle].getValue();

        int i = low, j = high;
        while (i <= j) {
            while (array[i].getValue() > stand) {
                i++;
            }

            while (array[j].getValue() < stand) {
                j--;
            }

            if (i <= j) {//меняем местами
                Pair temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(low, j);

        if (high > i)
            quickSort(i, high);

    }

    public String toString() {
        String line = "";
        for(int i = 0; i < capacity + 1; i++)
        {
            line+=array[i].toString();
        }
        return line;
    }
}