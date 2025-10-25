import java.util.Scanner;

public class Oodevdorduncu {
    static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("1. not (%60)=");
    double not1=input.nextDouble();
    System.out.print("2.not (%40)=");
    double not2=input.nextDouble();
    double ort=not1*0.6+not2*0.4;
    if(ort>75)
        System.out.println("Geçtiniz");
    else if(ort== 75)
        System.out.println("Sınırdasınız ucu ucuna geçtiniz");
    else
        System.out.println("kaldınız");
    }
}
