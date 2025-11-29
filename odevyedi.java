package odevyedi;

import java.util.Arrays;
import java.util.Random;

public class odevyedi {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[50];

        for (int i = 0; i < 50; i++) {
            int n;
            do n = rand.nextInt(100);
            while (contains(array, i, n));
            array[i] = n;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min]) min = j;
            int t = array[i];
            array[i] = array[min];
            array[min] = t;
        }

        System.out.println(Arrays.toString(array));
    }

    static boolean contains(int[] a, int end, int n) {
        for (int i = 0; i < end; i++)
            if (a[i] == n) return true;
        return false;
    }
}