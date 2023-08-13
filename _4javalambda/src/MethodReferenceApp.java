import util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        //Anonymous Class
        Predicate<String> value0 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return StringUtil.isLowerCase(s);
            }
        };

        //Lambda
        Predicate<String> value1 = s -> StringUtil.isLowerCase(s);
        Predicate<String> value2 = StringUtil::isLowerCase; // mendefinisikan bahwa predicate<String> value2 akan menggunakan method islower case

        System.out.println(value0.test("Menggunakan Anonymous Class"));
        System.out.println(value1.test("Menggunakan Lambda"));
        System.out.println(value2.test("Menggunakan Method Reference")); // disini passing paramsnya

        //Maka perlu buat Functional itnerface manual
        //TriFunction<String, String, String, Boolean> checkMultipleFunction = StringUtil::checkMultiple;
        //Predicate<String> value3 = StringUtil::checkMultiple;


        //Method Reference Non Static
    }

    public  boolean isLowerCase(String value)
    {
        for(char c : value.toCharArray()){
            if(!Character.isLowerCase(c))
            {
                return false;
            }
        }
        return true;
    }

}
