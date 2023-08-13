import lambda.SimpleAction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        /** Menggunakan Anony Class*/
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Ini Menggunakan Anonymous Class";
            }
        };

        SimpleAction simpleAction1 = (String name) -> "Ini menggunakan Lambda";
        SimpleAction simpleAction2 = (a) -> a; // tanpa block artinya langsung return

        System.out.println(simpleAction.action("Alfons"));
        System.out.println(simpleAction1.action("Alfons"));
        System.out.println(simpleAction2.action("Alfons"));


        //Lambda Menggunakan Consumer ( Return void)
        Consumer<String> consumer = value -> System.out.println("Value : " + value);
        Consumer<String> consumer2 = value -> System.out.println(value);

        consumer.accept("Alfons");
        consumer2.accept("consumer 2");


        //Lambda Menggunakan Predicate (Return boolean-
        Predicate<String> predicate = value -> value.isBlank();
        boolean b =  predicate.test("Alfons");

        System.out.println(b);

        //Supplier supply value without params
        Supplier<Integer> integerSupplier = () -> {
            return 2*3*4;
        };

        Integer hasil = integerSupplier.get();

        System.out.println(hasil);

        //Parameter References
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("Alfons"));

    }

    public void run()
    {

        //Anonymous Method
//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return Main.this.isLowerCase(s);
//            }
//        };
        //Lambda
//        Predicate<String> predicate = value -> Main.this.isLowerCase(value);
        //Method Reference
//        Predicate<String> predicate = Main.this::isLowerCase;
        //Misalnya objeknya di tempat lain
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicate = app::isLowerCase;


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

//DIRAPIKAN NANTI