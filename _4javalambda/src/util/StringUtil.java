package util;

public class StringUtil {

    public static boolean isLowerCase(String value)
    {
        for(char c : value.toCharArray()){
            if(!Character.isLowerCase(c))
            {
                return false;
            }
        }
        return true;
    }

    //Tidak bisa implement lebih dar 1 params

    public static <T> boolean checkMultiple(T value1,T value2,T value3){
        return true;
    }
}
