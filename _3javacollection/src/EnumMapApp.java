import java.util.EnumMap;

public class EnumMapApp {
    public static enum Level{
        STANDARD,
        PREMIUM,
        VIP
    }

    public static void main(String[] args) {
        EnumMap<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.STANDARD, "Gratis Boy");
        map.put(Level.PREMIUM, "Langganan 200 K Perbulan");
        map.put(Level.VIP, "Langganan 500 K Perbulan");

        //only key
        for(var key : map.keySet())
        {
            System.out.println(key);
        }
        //key=value
        for(var key : map.entrySet())
        {
            System.out.println(key);
        }


    }
}
