import java.util.HashMap;
import java.util.Map;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Alfons");
        map.put("2", "Setiawan");
        map.put("3", "Jacub");

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
