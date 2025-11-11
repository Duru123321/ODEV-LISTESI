import java.util.Arrays;
import java.util.Random;

public class Odevbes {
    static void main(String[] args) {
        int[] sayilar=new int[50];
        Random r= new Random();
        for (int i= 0; i<50;i++)
sayilar[i]= r.nextInt(1000)+1;
        Arrays.sort(sayilar);
        for(int s:sayilar)
System.out.println(s+"");
    }
}
