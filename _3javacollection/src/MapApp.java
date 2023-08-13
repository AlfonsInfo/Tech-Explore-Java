import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MapApp {

    public static void main(String[] args) {

        //HASH MAP
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "alfons");
        map.put("name.middle", "setiawan");
        map.put("name.last", "jacub");
        map.put("username", "alfonsus.j");
        map.put("umur", "18");

        System.out.println(map);

        //WEAK HASH MAP Bandingkan Dengan HashMap
        Map<Integer, Integer> weakHashMap = new WeakHashMap<>();
        for(int i = 0  ; i< 1000000; i++)
        {
            weakHashMap.put(i,i);
        }
        System.gc();

        System.out.println(weakHashMap.size());
    }

    //Identity Hash Map
}
