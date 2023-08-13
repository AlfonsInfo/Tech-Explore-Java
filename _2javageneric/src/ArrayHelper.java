//Contoh Generic Method 1
public class ArrayHelper {

    public static <T> int count(T[] array)
    {
        return array.length;
    }
}
