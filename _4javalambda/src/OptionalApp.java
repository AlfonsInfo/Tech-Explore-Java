import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("alfons ganteng");
        //Penanganan errornya
        sayHello(null);
    }

    public static void sayHello(String name)
    {
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());

        //Mengambil value dari optional
        //String upperName = Optional.ofNullable(name).map(s -> s.toUpperCase()).orElseGet(() -> "");
        //        String stringName = optionalNameUpper.orElseGet("");
        //        System.out.println(optionalNameUpper.toString());
        optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));
    }
}
