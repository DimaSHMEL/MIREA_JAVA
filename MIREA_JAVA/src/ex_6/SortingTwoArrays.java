package ex_6;

import java.util.Arrays;
import java.util.Scanner;

public class SortingTwoArrays {
    class Pair
    {
        //создание класса с именем студента и его оценокой для сортировки
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
    private  Pair[] array_A, array_B, array_C;
    private int size_A,size_B, capacity_A, capacity_B, capacity_C;
    private Scanner scan = new Scanner(System.in);
    public SortingTwoArrays()
    {
        int i = 0;
        size_A = size_B = 10;
        array_A = new Pair[size_A];
        System.out.println("Input first mas");
        int key = scan.nextInt();
        while(key != -1) {
            String name = scan.nextLine();
            name = name.strip();
            Pair temp = new Pair(name, key);
            array_A[i] = temp;
            i+=1;
            key  = scan.nextInt();
        }
        capacity_A = i - 1;
        array_B = new Pair[size_B];
        i = 0;
        System.out.println("Input second mas");
        key = scan.nextInt();
        while(key != -1) {
            String name = scan.nextLine();
            name = name.strip();
            Pair temp = new Pair(name, key);
            array_B[i] = temp;
            i+=1;
            key = scan.nextInt();
        }
        capacity_B = i - 1;
        array_C = mergeArray(sortArray(Arrays.copyOf(array_A, capacity_A + 1)),
                             sortArray(Arrays.copyOf(array_B, capacity_B + 1)));
    }
    public Pair [] sortArray(Pair[] arrayA){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        Pair [] arrayB = new Pair[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        Pair [] arrayC = new Pair[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);

        return mergeArray(arrayB, arrayC);
    }
    public Pair[] mergeArray(Pair[] arrayA, Pair[] arrayB) {
        Pair[] arrayC = new Pair[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
            else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            }
            else if (arrayA[positionA].getValue() < arrayB[positionB].getValue()) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            }
            else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }
    public String toString() {
        String line = "";
        for(int i = 0; i < array_C.length; i++)
        {
            line+=array_C[i].toString();
        }
        return line;
    }
}
