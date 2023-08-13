import java.util.List;
import java.util.function.Consumer;
//PENERAPAN LAMBDA PADA FOREACH
public class ForEachApp {
    public static void main(String[] args) {
        List<String> listNama =List.of("Alfons", "Joko", "Bambang", "Tono");

        for(var value : listNama)
        {
            System.out.println(value);
        }

        //Biasanya lambdanya langsung di definisikan dalam params
        Consumer<String> lambda = (value) -> System.out.println(value);
        listNama.forEach(lambda);

        listNama.forEach(System.out::println);
    }
}
