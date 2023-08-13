import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        //Eager
//        testScore(60,getName());
        testScore(60,()->getName());
    }

    public static void testScore(int score, String name)
    {
        if(score > 80)
        {
            System.out.println("Selamat " + name + " , Anda lulus");
        }else{
            System.out.println("Coba lagi Tahun Depan");
        }
    }
    public static String getName()
    {
        System.out.println("Get Name dipanggil");
        return "Alfons";
    }

    //Lazy / Non Eager

    public static void testScore(int score, Supplier<String> name)
    {
        if(score > 80)
        {
            System.out.println("Selamat " + name.get() + " , Anda lulus");
        }else{
            System.out.println("Coba lagi tahun depan");
        }
    }
}
