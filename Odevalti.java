import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Odevalti {
    public static void main(String[] args) {
        Integer[] studentScores = {100,90,120};
        Integer[] productPrices = {20,30,10};
        Integer[] temperatures = {80,63,108};

        Map<String, Integer[]> arrays = new HashMap<>();
        arrays.put("Başlangıç Fiyatları", studentScores);
        arrays.put("İndirim Yüzdeleri", productPrices);
        arrays.put("Son Fiyatlar", temperatures);

        System.out.println("fiyatlandırma aşamaları");
        for (Map.Entry<String, Integer[]> entry : arrays.entrySet()) {
            System.out.println(entry.getKey() + ": " + Arrays.toString(entry.getValue()));
        }

    }


}
