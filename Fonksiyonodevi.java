import java.util.Scanner;

public class Fonksiyonodevi {
    public static void dortIslem(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        dortIslem(x, y);
    }
}