import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Odevalti {
    public static void main(String[] args) {
        Integer[] firstprices = {100,90,120};
        Integer[] beforelastprices = {20,30,10};
        Integer[] lastprices = {80,63,108};

        Map<String, Integer[]> arrays = new HashMap<>();
        arrays.put("Başlangıç Fiyatları", firstprices);
        arrays.put("İndirim Yüzdeleri", beforelastprices);
        arrays.put("Son Fiyatlar", lastprices);

        System.out.println("fiyatlandırma aşamaları");
        for (Map.Entry<String, Integer[]> entry : arrays.entrySet()) {
            System.out.println(entry.getKey() + ": " + Arrays.toString(entry.getValue()));
        }

    }


}
