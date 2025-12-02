import java.util.Scanner;

public class Odevbir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("İki sayı giriniz (aralarında boşluk): ");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("Toplam: " + (a + b));
        System.out.println("Fark: " + (a - b));
        System.out.println("Çarpım: " + (a * b));
        System.out.println("Bölüm: " + (a / b));
    }
}