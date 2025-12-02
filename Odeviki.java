import java.util.Scanner;

public class Odeviki {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz: ");
        double a = s.nextDouble();
        System.out.print("İkinci kenarı giriniz: ");
        double b = s.nextDouble();
        System.out.print("Üçüncü kenarı giriniz: ");
        double c = s.nextDouble();

        double cevre = a + b + c;
        double alan = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)) / 4;

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }
}
