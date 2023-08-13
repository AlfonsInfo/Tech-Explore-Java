import java.util.ArrayList;
import java.util.List;

public class RemoveIfApp {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Alfons","Mantap","Banget","w","cdd"));
        //Menggunakan Lambda , tidak bisa menggunakan method references karena tidak
        //hanya memanggil method tetapi juga melakukan perbandingan
        names.removeIf(s -> s.length()>3);


    }
}
