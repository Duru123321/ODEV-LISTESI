import java.util.Arrays;
import java.util.Random;

public class Odevbes {
    public static void main(String[] args) {

        int[] n = new int[50];
        Random r = new Random();

        for (int i = 0; i < 50; i++) n[i] = r.nextInt(101);

        for (int i = 0; i < 49; i++)
            for (int j = 0; j < 49 - i; j++)
                if (n[j] > n[j + 1]) {
                    int t = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = t;
                }

        for (int x : n) System.out.print(x + " ");
    }

}
